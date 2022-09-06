package cn.dataorgregister.service.impl;

import cn.dataorgregister.entity.Result;
import cn.dataorgregister.entity.mongo.*;
import cn.dataorgregister.entity.mongo.orgregister.DataBase;
import cn.dataorgregister.entity.mongo.orgregister.DataCenter;
import cn.dataorgregister.entity.mongo.user.User;
import cn.dataorgregister.repository.mongo.*;
import cn.dataorgregister.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 16:41
 */
@Service

public class UserServiceImpl implements UserService {
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
    private UserRepository userRepository;


//    @Override
//    public void writeData(DataBase registerDb) {
//        registerDb.setDataBaseNameCN("基础");
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
            return fail("参数不可为空");
        }
        Result byEmail = userRepository.findByEmail(user.getEmail());


    }

    @Override
    public Result registerDb(DataBase dataBase, MultipartFile file) {
        if(!Objects.nonNull(dataBase)){
            return fail("注册内容不可为空");
        }
        DataBase save = dataBaseRepository.save(dataBase);
        if(save != null){
            return success();
        }
        return fail();

    }

    @Override
    public Result registerDc(DataCenter dataCenter, MultipartFile file) {
        if (!Objects.nonNull(dataCenter)){
            return fail("注册内容不可为空");
        }
//        String iconPath = uploadIcon(file, "c://asasas//asas");
//        dataCenter.setLogoPath(iconPath);
        DataCenter save = dataCenterRepository.save(dataCenter);
        if(save != null){
            return success();
        }
        return fail();
    }


    /**
    上传图片方法
     */
    public String uploadIcon(MultipartFile file,@NotNull String path){
        if(file )

        return null;
    }


    @Override
    public Result getSubject() {

    }

    @Override
    public Result getlocation() {

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
//        if (Objects.nonNull(requestJsonObject.get("flag")) && "数据库".equals(requestJsonObject.get("flag"))) {
//
//        }else if (Objects.nonNull(requestJsonObject.get("flag")) && "数据中心".equals(requestJsonObject.get("flag"))) {
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
