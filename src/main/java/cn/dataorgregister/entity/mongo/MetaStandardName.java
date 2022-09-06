package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/8 10:29
 */

@Document(collection = "metastandardname")
@Data
public class MetaStandardName {
    //数据库and数据中心-元数据标准名称
    @Id
    private String id;

    private String typeId;
    private String type;
}
