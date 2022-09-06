package cn.dataorgregister.service;


import cn.dataorgregister.entity.Result;
import cn.dataorgregister.entity.mongo.DataBase;
import cn.dataorgregister.entity.mongo.DataCenter;

import javax.servlet.http.HttpServletRequest;

public interface UserService extends CommonService{
//    void writeData(DataBase registerDb);
    Result registerDb(DataBase dataBase);
    Result registerDc(DataCenter dataCenter);

//    Result login();
//    Result login(DataCenter dataCenter);

}
