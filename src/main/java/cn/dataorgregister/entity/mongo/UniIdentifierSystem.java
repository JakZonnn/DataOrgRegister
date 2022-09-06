package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/8 11:06
 */
@Document(collection = "uniidentifiersystem")
@Data
public class UniIdentifierSystem {

    //数据库-支持的唯一标识符系统
    @Id
    private String id;

    private String typeId;
    private String type;
}
