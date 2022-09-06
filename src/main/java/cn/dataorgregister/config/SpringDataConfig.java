package cn.dataorgregister.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Spring Data 多模块配置
 * 
 */
@Configuration
@EnableMongoRepositories(basePackages = "cn.dataorgregister.repository.mongo")
public class SpringDataConfig {

}
