package cn.dataorgregister.repository.mongo;

import cn.dataorgregister.entity.mongo.user.UserLogin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepository extends MongoRepository<UserLogin,String> {
}
