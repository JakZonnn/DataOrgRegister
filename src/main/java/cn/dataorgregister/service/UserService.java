package cn.dataorgregister.service;


import cn.dataorgregister.entity.mongo.DataBase;

public interface UserService {
    void writeData(DataBase registerDb);

}
