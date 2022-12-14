package cn.dataorgregister.service.impl;

import cn.dataorgregister.common.Enums;
import cn.dataorgregister.entity.Result;
import cn.dataorgregister.entity.mongo.*;
import cn.dataorgregister.entity.mongo.orgregister.DataBase;
import cn.dataorgregister.entity.mongo.orgregister.DataCenter;
import cn.dataorgregister.entity.mongo.user.Code;
import cn.dataorgregister.entity.mongo.user.User;
import cn.dataorgregister.entity.mongo.user.UserLogin;
import cn.dataorgregister.repository.mongo.*;
import cn.dataorgregister.service.UserService;
import cn.dataorgregister.utils.CaffeineUtil;
import cn.dataorgregister.utils.RSAUtils;
import cn.dataorgregister.utils.UploadFileUtils;
import cn.dataorgregister.utils.VerifyCode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import com.github.benmanes.caffeine.cache.Cache;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;
import java.awt.dnd.DropTarget;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 16:41
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final JavaMailSender javaMailSender;

    private final Cache<String, String> publicModel = CaffeineUtil.getPublicModel();

    @Value("${spring.mail.username}")
    private String sendEmail;

    @Value("${privateKey}")
    private String privateKey;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private DataBaseRepository dataBaseRepository;
    @Autowired
    private DataCenterRepository dataCenterRepository;

    @Autowired
    private ApisTypeRepository apisTypeRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    @Autowired
    private CertificationRepository certificationRepository;

    @Autowired
    private DataCenterTypeRepository dataCenterTypeRepository ;

    @Autowired
    private DataLicenseRepository dataLicenseRepository;

    @Autowired
    private LicenseDbRepository licenseDbRepository;

    @Autowired
    private LimitTypeRepository limitTypeRepository;

    @Autowired
    private MetaStandardNameRepository metaStandardNameRepository;

    @Autowired
    private SecurityLevelRepository securityLevelRepository;

    @Autowired
    private ServiceTypeRepository serviceTypeRepository;

    @Autowired
    private UniIdentifierRepository uniIdentifierRepository;

    @Autowired
    private UniIdentifierSystemRepository uniIdentifierSystemRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private DataTypesRepository dataTypesRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CodeRepository codeRepository;

    @Autowired
    private UserLoginRepository userLoginRepository;


//    @Override
//    public void writeData(DataBase registerDb) {
//        registerDb.setDataBaseNameCN("??????");
//        registerDb.setAbbEN("bd");
//        registerDb.setCount(Long.valueOf("98789323767578487"));
//
//
//        Date utilDate = new Date();
//        Date sqlDate = new Date(utilDate.getTime());
//        registerDb.setJoinDate(sqlDate);
//
//        registerDb.setIntroductionEN("i am basic");
//        List<String> lic = new ArrayList<>();
//        lic.add("dewd");
//        lic.add("dede");
//        lic.add("vtr");
//        registerDb.setLicense(lic);
////        registerDb.setCertification("783eh2o3i");
//        registerDb.setServiceType("alltypeser");
//        registerDb.setSize(382820932032L);
//        registerDb.setUrlDb("www.cooc.com");
//
//        OrgInfoDb orgInfoDb = new OrgInfoDb();
////        orgInfoDb.setBuildOrgName("china");
//        orgInfoDb.setEmail("123@cnic.cn");
//        orgInfoDb.setOrgName("CAS");
////        orgInfoDb.setLocation("beijing");
//        orgInfoDb.setPhone("89898989");
//        orgInfoDb.setSupOrgName("CAS");
//        orgInfoDb.setContactName("GAO");
//        registerDb.setOrgInfoDb(orgInfoDb);
//
//        DataClauseDb dataClauseDb = new DataClauseDb();
////        dataClauseDb.setDataPolicy("do not know");
////        dataClauseDb.setAuthority("everyone");
////        dataClauseDb.setLicenseDb("dbdb");
////        dataClauseDb.setLimitType("alltype");
//        registerDb.setDataClauseDb(dataClauseDb);
//
//        StandardDb standardDb = new StandardDb();
////        standardDb.setMetaStandardName("meta");
//        standardDb.setMetaStandardSchema("toall");
////        standardDb.setApisType("jiji");
//        standardDb.setApisUrl("www.wowo.com");
////        standardDb.setUniIdentifierSystem("unnifo");
//        standardDb.setQualityControl(true);
//        standardDb.setVersionControl(true);
//        registerDb.setStandardDb(standardDb);
//
//        registerDb.setCreateTime(sqlDate);
//        registerDb.setUpdateTime(sqlDate);
//
//        List<String> dataType = new ArrayList<>();
//        dataType.add(EnumerationIdentify.DATATYPE_DATASET.msg());
//        dataType.add(EnumerationIdentify.DATATYPE_JOURNALPAPER.msg());
//        dataType.add(EnumerationIdentify.DATATPYE_BOOK.msg());
//        registerDb.setDataType(dataType);
//
//
//        dataBaseRepository.save(registerDb);
//    }

    @Override
    public Result register(User user) {
        if (user == null){
            return fail("??????????????????");
        }
        String email = user.getEmail();
        User emailOfUser = userRepository.findByEmail(email);
        if (Objects.isNull(emailOfUser)){
            Code emailOfCode = codeRepository.findByEmail(email);
            if (Objects.isNull(emailOfCode)){
                return new Result(HttpStatus.UNAUTHORIZED.value(), "???????????????????????????",null);
            }
            String emailCode = emailOfCode.getEmailCode();
            Date createTime = emailOfCode.getCreateTime();
            if (user.getEmailCode().equals(emailCode)){
                int day = VerifyCode.differentDaysByMillisecond(createTime, new Date());
                if (day>1){
                    return fail(HttpStatus.UNAUTHORIZED.value(),"??????????????????",null);
                }
                String depassword = RSAUtils.decode(user.getPassword(), this.privateKey);
                String depasswordre = RSAUtils.decode(user.getRepeatPassword(), this.privateKey);
                if (depasswordre.equals(depasswordre)){
                    String userId = DigestUtils.md5DigestAsHex(user.getEmail().getBytes()); //???email????????????userid
                    String md5HashPass = DigestUtils.md5DigestAsHex(depassword.getBytes());
                    user.setUserId(userId);
                    user.setPassword(md5HashPass);
                    user.setCreateTime(new Date());
                    User save = userRepository.save(user);
                    return success(HttpStatus.OK.value(),"??????????????????",save);
                }
                return fail(HttpStatus.UNAUTHORIZED.value(),"???????????????????????????",null);
            }
            return fail(HttpStatus.UNAUTHORIZED.value(),"??????????????????",null);
        }
        return fail(HttpStatus.UNAUTHORIZED.value(),"???????????????",null);
    }

    @Override
    public Result sendCode(String email) {
        //??????user????????????????????????
        User byEmail = userRepository.findByEmail(email);
        if (Objects.isNull(byEmail)){
            String code = VerifyCode.sendCode(6);
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(sendEmail);
            mailMessage.setTo(email);
            mailMessage.setSubject("????????????????????????????????????");
            mailMessage.setText("???????????????,??????:\n???????????????????????????" + code);
            javaMailSender.send(mailMessage);

            //??????????????????mogodb???Code???
            Code code1 = new Code();
            code1.setEmail(email);
            code1.setCreateTime(new Date());
            code1.setEmailCode(code);
            //??????Code????????????????????????
            Boolean ifExist = codeRepository.existsByEmail(email);
            //??????????????????????????????????????????
            if (!ifExist){
                codeRepository.save(code1);
                return success(HttpStatus.OK.value(),"?????????????????????",null);
            }
            else {
//                Date date = new Date();
//                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//                String dateFormat = simpleDateFormat.format(date);
                //??????email??????Code?????????emailcode???????????????
                Query query = new Query(Criteria.where("email").is(email));
                Update update = new Update();
                update.set("emailCode",code);
                update.set("createTime",new Date());
                Code updateResult= mongoTemplate.findAndModify(query, update, Code.class);
//                Update updateCode = new Update().set(code,code1.getEmailCode());
//                Update updateCreateTime = new Update().set(dateFormat,code1.getCreateTime());
//                UpdateResult updateCode1 = mongoTemplate.updateFirst(queryCode, updateCode, Code.class);
//                UpdateResult updateTime = mongoTemplate.updateFirst(queryCode, updateCreateTime, Code.class);
//                List<Object> updateResult = new ArrayList<>();
//                updateResult.add(updateCode1);
//                updateResult.add(updateTime);
                return success(HttpStatus.OK.value(),"?????????????????????",updateResult);
            }
        }
        return fail(HttpStatus.UNAUTHORIZED.value(),"?????????????????????",null);
    }

    @Override
    public Result login(UserLogin userLogin, HttpServletResponse response) {
        if (userLogin == null){
            return fail(HttpStatus.INTERNAL_SERVER_ERROR.value(),"??????????????????",null);
        }
        User byEmail = userRepository.findByEmail(userLogin.getEmail());
        if (Objects.isNull(byEmail) || !byEmail.getEmail().equals(userLogin.getEmail())){
            return fail(Enums.USER401001.code(),Enums.USER401001.msg(),null);
        }
        //???????????????????????????
        String decodePw = RSAUtils.decode(userLogin.getPassword(), this.privateKey);
        //???md5?????????????????????User????????????????????????
        String md5Pw = DigestUtils.md5DigestAsHex(decodePw.getBytes());
        if (!(md5Pw == byEmail.getPassword())){
            return fail(Enums.PARAM_EXCEP.code(),Enums.PARAM_EXCEP.msg(),null);
        }
        //?????????????????????UserLogin??????
        userLoginRepository.save(userLogin);
        //??????cookie
        Cookie cookie = new Cookie("userEmail",userLogin.getEmail());
        cookie.setMaxAge(7*24*60*30);
        cookie.setVersion(1);
        cookie.setPath("/");
        response.addCookie(cookie);
        return success(HttpStatus.OK.value(),"????????????",null);
    }

    @Override
    public Result registerDb(DataBase dataBase, MultipartFile file) {
        if(!Objects.nonNull(dataBase)){
            return fail("????????????????????????");
        }
        //?????????????????????????????????????????????????????????
        DataBase byDataBaseNameCN = dataBaseRepository.findByDataBaseNameCN(dataBase.getDataBaseNameCN());
        DataBase byDataBaseNameEN = dataBaseRepository.findByDataBaseNameEN(dataBase.getDataBaseNameEN());
        if (Objects.nonNull(byDataBaseNameCN) || Objects.nonNull(byDataBaseNameEN)){
            fail(HttpStatus.UNAUTHORIZED.value(),"?????????????????????",null);
        }
        //?????????????????????????????????????????????
        String dataFilePath = "/data" + File.separator + "testPackage" + File.separator + "database" + File.separator + dataBase.getDataBaseNameCN();
        //??????????????????
        String ImagePath = dataFilePath + File.separator + "Image";
        Map map = UploadFileUtils.uploadImage(file, dataBase.getDataBaseNameCN(), ImagePath);
        if(Objects.isNull(map) || !"200".equals(map.get("code"))){
            return fail((String) map.get("msg"));
        }else {
            dataBase.setLogoPath((String) map.get("path"));
        };


        //??????????????????????????????
        String DocuPath = dataFilePath + File.separator + "Document";




        return null;
    }

    @Override
    public Result registerDc(DataCenter dataCenter, MultipartFile file) {
        if (!Objects.nonNull(dataCenter)){
            return fail("????????????????????????");
        }
//        String iconPath = uploadIcon(file, "c://asasas//asas");
//        dataCenter.setLogoPath(iconPath);
        DataCenter save = dataCenterRepository.save(dataCenter);
        if(save != null){
            return success();
        }
        return fail();
    }



    @Override
    public Result getSubject() {
        String subjectList = publicModel.getIfPresent("subject");
        if (StringUtils.isEmpty(subjectList)) {

            Map<String, Object> map = new HashMap<>();
            Map<String, Object> oneSubjectMap = new HashMap<>();
            List<Subject> all = mongoTemplate.findAll(Subject.class);
            all.stream().forEachOrdered(subject -> {
                String oneName = subject.getOne_rank_name();
                if (map.containsKey(oneName)) {
                    Map twoMap = (Map<String, Object>) map.get(oneName);
                    String two_rank_name = subject.getTwo_rank_name();
                    if (twoMap.containsKey(two_rank_name)) {
                        ((List) twoMap.get(two_rank_name)).add(subject.getThree_rank_name());
                    } else {
                        twoMap.put(two_rank_name, new ArrayList<String>() {{
                            add(subject.getThree_rank_name());
                        }});
                    }
                } else {
                    Map<String, List<String>> twoMap = new HashMap<>();
                    twoMap.put(subject.getTwo_rank_name(), new ArrayList<String>() {{
                        add(subject.getThree_rank_name());
                    }});
                    map.put(oneName, twoMap);
                    Map<String, String> subMap = new HashMap<>();
                    subMap.put("code", subject.getOne_rank_no());
                    subMap.put("enName", "");
                    oneSubjectMap.put(oneName, subMap);
                }
            });
            List<Map<String, Object>> resultList = new LinkedList<>();
            map.entrySet().stream().forEachOrdered(sub -> {
                String key = sub.getKey();
                List<Map<String, Object>> twoList = new LinkedList<>();
                Map<String, Object> twoMap = (Map<String, Object>) sub.getValue();
                twoMap.entrySet().stream().forEachOrdered(subTwo -> {
                    String key1 = subTwo.getKey();
                    Map<String, Object> threeMap = new HashMap<>();
                    threeMap.put("value", key1);
                    threeMap.put("label", key1);
                    List<String> list = (List<String>) subTwo.getValue();
                    List<Map<String, Object>> threeList = new LinkedList<>();
                    Iterator<String> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        String next = iterator.next();
                        Map<String, Object> mm = new HashMap<>();
                        mm.put("value", next);
                        mm.put("label", next);
                        threeList.add(mm);
                    }
                    threeMap.put("children", threeList);
                    twoList.add(threeMap);
                });
                Map<String, Object> oneMap = new HashMap<>();
                oneMap.put("label", key);
                oneMap.put("value", key);
                oneMap.put("children", twoList);
                resultList.add(oneMap);
            });

            String s = JSON.toJSONString(resultList);
            publicModel.put("subject", s);
            publicModel.put("querySubject", JSON.toJSONString(oneSubjectMap));
            return success(resultList);
        }
        List list = JSONObject.parseObject(subjectList, List.class);
        return success(list);
    }

    @Override
    public Result getlocation() {
        List<Location> all = locationRepository.findAll();
        return success(all);
    }

    @Override
    public Result getApisType() {
        List<ApisType> all = apisTypeRepository.findAll();
        return success(all);
    }

    @Override
    public Result getAuthority() {
        List<Authority> all = authorityRepository.findAll();
        return success(all);
    }

    @Override
    public Result getCertification() {
        List<Certification> all = certificationRepository.findAll();
        return success(all);
    }

    @Override
    public Result getDatacenterType() {
        List<DataCenterType> all = dataCenterTypeRepository.findAll();
        return success(all);
    }

    @Override
    public Result getDataLicense() {
        List<DataLicense> all = dataLicenseRepository.findAll();
        return success(all);
    }

    @Override
    public Result getDataTypes() {
        List<DataTypes> all = dataTypesRepository.findAll();
        return success(all);
    }

    @Override
    public Result getLicenseDb() {
        List<LicenseDb> all = licenseDbRepository.findAll();
        return success(all);
    }

    @Override
    public Result getLimitType() {
        List<LimitType> all = limitTypeRepository.findAll();
        return success(all);
    }

    @Override
    public Result getMetaStandardName() {
        List<MetaStandardName> all = metaStandardNameRepository.findAll();
        return success(all);
    }

    @Override
    public Result getSecurityLevel() {
        List<SecurityLevel> all = securityLevelRepository.findAll();
        return success(all);
    }

    @Override
    public Result getServiceType() {
        List<ServiceType> all = serviceTypeRepository.findAll();
        return success(all);
    }

    @Override
    public Result getUniIdentifier() {
        List<UniIdentifier> all = uniIdentifierRepository.findAll();
        return success(all);
    }

    @Override
    public Result getUniIdentifierSystem() {
        List<UniIdentifierSystem> all = uniIdentifierSystemRepository.findAll();
        return success(all);
    }

    //    @Override   the current station  the next station
//    public Result login(HttpServletRequest request, DataBase dataBase, DataCenter dataCenter) {
//        JSONObject requestJsonObject = null;
//        try {
//            requestJsonObject = GetDataFromRequest.getRequestJsonObject(request);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        if (Objects.nonNull(requestJsonObject.get("flag")) && "?????????".equals(requestJsonObject.get("flag"))) {
//
//        }else if (Objects.nonNull(requestJsonObject.get("flag")) && "????????????".equals(requestJsonObject.get("flag"))) {
//
//        }
//        return null;
//    }

//    @Override
//    public void writeDataType(UniIdentifierSystem uniIdentifierSystem) {
//        uniIdentifierSystem.setTypeId("1");
//        uniIdentifierSystem.setType("cstr");
//        uniIdentifierSystemRepository.save(uniIdentifierSystem);
//    }

}
