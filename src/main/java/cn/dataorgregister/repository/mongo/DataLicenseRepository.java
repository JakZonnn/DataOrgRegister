package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.DataLicense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataLicenseRepository extends MongoRepository<DataLicense,String> {
}
