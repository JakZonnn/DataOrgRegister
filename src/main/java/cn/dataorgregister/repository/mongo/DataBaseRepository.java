package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.DataBase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataBaseRepository extends MongoRepository<DataBase, String> {

}
