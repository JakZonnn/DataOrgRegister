package cn.dataorgregister.repository;

import cn.dataorgregister.entity.mongo.DataBase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterDbRepository extends MongoRepository<DataBase, String> {

}
