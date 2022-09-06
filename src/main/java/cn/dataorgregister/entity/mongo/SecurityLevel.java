package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/8 10:42
 */
@Document(collection = "securitylevel")
@Data
public class SecurityLevel {
    //数据中心-网络安全等保级别
    @Id
    private String id;

    private String typeId;
    private String type;
}
