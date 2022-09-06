package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.Location;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends MongoRepository<Location,String> {

}
