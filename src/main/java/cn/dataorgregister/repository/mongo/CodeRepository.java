package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.user.Code;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeRepository extends MongoRepository<Code,String> {
    Boolean existsByEmail(String email);
    Code findByEmail(String email);

}
