package cn.dataorgregister.service;


import cn.dataorgregister.entity.Result;
import cn.dataorgregister.entity.mongo.orgregister.DataBase;
import cn.dataorgregister.entity.mongo.orgregister.DataCenter;
import cn.dataorgregister.entity.mongo.user.User;
import cn.dataorgregister.entity.mongo.user.UserLogin;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface UserService extends CommonService{
//    void writeData(DataBase registerDb);

    Result register(User user);
    Result registerDb(DataBase dataBase, MultipartFile file);
    Result registerDc(DataCenter dataCenter, MultipartFile file);
    Result sendCode(String email);



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

    Result login(UserLogin userLogin, HttpServletResponse response);


//    void writeDataType(UniIdentifierSystem uniIdentifierSystem);
//    Result login();
//    Result login(DataCenter dataCenter);

}
