package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.DataCenterType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataCenterTypeRepository extends MongoRepository<DataCenterType,String> {
}
