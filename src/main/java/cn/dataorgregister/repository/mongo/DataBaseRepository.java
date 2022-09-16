package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.orgregister.DataBase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataBaseRepository extends MongoRepository<DataBase, String> {
    DataBase findByDataBaseNameCN(String databaseNameCn);
    DataBase findByDataBaseNameEN(String databaseNameEn);


}
