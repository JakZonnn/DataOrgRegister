package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.DataCenter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataCenterRespository extends MongoRepository<DataCenter,String> {

}
