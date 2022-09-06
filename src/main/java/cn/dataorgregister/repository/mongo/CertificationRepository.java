package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.Certification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationRepository extends MongoRepository<Certification,String> {
}
