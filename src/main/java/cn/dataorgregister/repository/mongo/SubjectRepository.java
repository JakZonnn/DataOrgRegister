package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<Subject,String> {
}
