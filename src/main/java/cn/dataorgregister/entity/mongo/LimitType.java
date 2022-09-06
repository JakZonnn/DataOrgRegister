package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/8 10:23
 */

@Document(collection = "limitype")
@Data
public class LimitType {
    //数据库-访问限制类型
    @Id
    private String id;

    private String typeId;
    private String type;
}
