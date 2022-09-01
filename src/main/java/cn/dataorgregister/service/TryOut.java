package cn.dataorgregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 16:41
 */
@Repository

public class TryOut {
    @Autowired
    private MongoTemplate mongoTemplate;
    

}
