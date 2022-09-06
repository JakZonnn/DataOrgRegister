package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.orgregister.DataCenter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataCenterRepository extends MongoRepository<DataCenter,String> {

}
