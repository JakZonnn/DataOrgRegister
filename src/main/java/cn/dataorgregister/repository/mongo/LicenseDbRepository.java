package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.LicenseDb;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseDbRepository extends MongoRepository<LicenseDb,String> {
}
