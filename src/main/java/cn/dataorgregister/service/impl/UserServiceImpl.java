package cn.dataorgregister.service.impl;

import cn.dataorgregister.entity.mongo.DataClauseDb;
import cn.dataorgregister.entity.mongo.OrgInfoDb;
import cn.dataorgregister.entity.mongo.DataBase;
import cn.dataorgregister.entity.mongo.StandardDb;
import cn.dataorgregister.repository.RegisterDbRepository;
import cn.dataorgregister.service.UserService;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TestGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import cn.dataorgregister.entity.mongo.EnumerationIdentify;

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
    private RegisterDbRepository registerDbRepository;

    @Override
    public void writeData(DataBase registerDb) {
        registerDb.setDataBaseNameCN("基础");
        registerDb.setAbbEN("bd");
        registerDb.setCount(Long.valueOf("98789323767578487"));


        Date utilDate = new Date();
        Date sqlDate = new Date(utilDate.getTime());
        registerDb.setJoinDate(sqlDate);

        registerDb.setIntroductionEN("i am basic");
        List<String> lic = new ArrayList<>();
        lic.add("dewd");
        lic.add("dede");
        lic.add("vtr");
        registerDb.setLicense(lic);
//        registerDb.setCertification("783eh2o3i");
        registerDb.setServiceType("alltypeser");
        registerDb.setSize(382820932032L);
        registerDb.setUrlDb("www.cooc.com");

        OrgInfoDb orgInfoDb = new OrgInfoDb();
//        orgInfoDb.setBuildOrgName("china");
        orgInfoDb.setEmail("123@cnic.cn");
        orgInfoDb.setOrgName("CAS");
        orgInfoDb.setLocation("beijing");
        orgInfoDb.setPhone("89898989");
        orgInfoDb.setSupOrgName("CAS");
        orgInfoDb.setContactName("GAO");
        registerDb.setOrgInfoDb(orgInfoDb);

        DataClauseDb dataClauseDb = new DataClauseDb();
//        dataClauseDb.setDataPolicy("do not know");
//        dataClauseDb.setAuthority("everyone");
//        dataClauseDb.setLicenseDb("dbdb");
//        dataClauseDb.setLimitType("alltype");
        registerDb.setDataClauseDb(dataClauseDb);

        StandardDb standardDb = new StandardDb();
//        standardDb.setMetaStandardName("meta");
        standardDb.setMetaStandardSchema("toall");
//        standardDb.setApisType("jiji");
        standardDb.setApisUrl("www.wowo.com");
//        standardDb.setUniIdentifierSystem("unnifo");
        standardDb.setQualityControl(true);
        standardDb.setVersionControl(true);
        registerDb.setStandardDb(standardDb);

        registerDb.setCreateTime(sqlDate);
        registerDb.setUpdateTime(sqlDate);

        List<String> dataType = new ArrayList<>();
        dataType.add(EnumerationIdentify.DATATYPE_DATASET.msg());
        dataType.add(EnumerationIdentify.DATATYPE_JOURNALPAPER.msg());
        dataType.add(EnumerationIdentify.DATATPYE_BOOK.msg());
        registerDb.setDataType(dataType);




        registerDbRepository.save(registerDb);
    }

    //    @Override
//    public void dbReister() {


}
