package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.UniIdentifierSystem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniIdentifierSystemRepository extends MongoRepository<UniIdentifierSystem,String> {
}
