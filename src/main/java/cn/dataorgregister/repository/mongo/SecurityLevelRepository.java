package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.SecurityLevel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityLevelRepository extends MongoRepository<SecurityLevel,String> {
}
