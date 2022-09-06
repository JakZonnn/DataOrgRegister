package cn.dataorgregister.service.impl;

import cn.dataorgregister.entity.Result;
import cn.dataorgregister.entity.mongo.*;
import cn.dataorgregister.repository.mongo.DataBaseRepository;
import cn.dataorgregister.repository.mongo.DataCenterRespository;
import cn.dataorgregister.service.UserService;
import cn.dataorgregister.utils.GetDataFromRequest;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

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
    private DataCenterRespository dataCenterRespository;

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
    public Result registerDb(DataBase dataBase) {
        DataBase save = dataBaseRepository.save(dataBase);
        return success();
    }

    @Override
    public Result registerDc(DataCenter dataCenter) {
        DataCenter save = dataCenterRespository.save(dataCenter);
        return success();
    }

//    @Override
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

}
