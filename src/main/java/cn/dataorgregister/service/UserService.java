package cn.dataorgregister.service;


import cn.dataorgregister.entity.Result;
import cn.dataorgregister.entity.mongo.orgregister.DataBase;
import cn.dataorgregister.entity.mongo.orgregister.DataCenter;
import cn.dataorgregister.entity.mongo.user.User;
import org.springframework.web.multipart.MultipartFile;

public interface UserService extends CommonService{
//    void writeData(DataBase registerDb);

    Result register(User user);
    Result registerDb(DataBase dataBase, MultipartFile file);
    Result registerDc(DataCenter dataCenter, MultipartFile file);



    /**
     * 将数据表中的选项给前端
     * @return
     */
    Result getSubject();

    Result getApisType();

    Result getAuthority();

    Result getCertification();

    Result getDatacenterType();

    Result getDataLicense();

    Result getDataTypes();

    Result getLicenseDb();

    Result getLimitType();

    Result getMetaStandardName();

    Result getSecurityLevel();

    Result getServiceType();

    Result getUniIdentifier();

    Result getUniIdentifierSystem();

    Result getlocation();


//    void writeDataType(UniIdentifierSystem uniIdentifierSystem);
//    Result login();
//    Result login(DataCenter dataCenter);

}
