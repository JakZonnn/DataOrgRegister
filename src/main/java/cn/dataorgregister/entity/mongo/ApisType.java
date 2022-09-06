package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/7 19:25
 */
@Data
@Document(collection = "apistype")
public class ApisType {
    //数据库-APIS类型
    @Id
    private String id;

    private String typeId;
    private String type;
}
