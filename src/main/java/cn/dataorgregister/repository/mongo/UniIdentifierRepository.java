package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.UniIdentifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniIdentifierRepository extends MongoRepository<UniIdentifier,String> {
}
