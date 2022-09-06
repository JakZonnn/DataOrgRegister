package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.ApisType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApisTypeRepository extends MongoRepository<ApisType,String> {

}
