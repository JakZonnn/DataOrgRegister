package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/8 9:34
 */
@Data
@Document(collection = "authority")
public class Authority {
    //数据库-数据库访问权限
    @Id
    private String id;
    private String typeId;
    private String type;
}
