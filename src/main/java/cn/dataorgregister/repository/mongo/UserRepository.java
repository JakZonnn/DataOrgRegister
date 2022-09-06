package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.Result;
import cn.dataorgregister.entity.mongo.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    Result findByEmail(String email);
}
