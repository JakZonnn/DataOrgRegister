package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/7 17:49
 */
@Document(collection = "datatypes")
@Data
public class DataTypes {
    //数据库and数据中心-数据类型
    @Id
    private String id;

    private String typeId;
    private String type;
}
