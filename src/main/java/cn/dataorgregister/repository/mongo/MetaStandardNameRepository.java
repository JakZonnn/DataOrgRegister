package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.MetaStandardName;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaStandardNameRepository extends MongoRepository<MetaStandardName,String> {
}
