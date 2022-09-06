package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.ServiceType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceTypeRepository extends MongoRepository<ServiceType,String> {

}
