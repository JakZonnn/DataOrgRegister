package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.LimitType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LimitTypeRepository extends MongoRepository<LimitType, String> {
}
