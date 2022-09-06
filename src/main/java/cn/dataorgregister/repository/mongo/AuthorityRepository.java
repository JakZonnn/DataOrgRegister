package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends MongoRepository<Authority,String> {
}
