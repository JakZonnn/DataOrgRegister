package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/8 10:08
 */

@Document(collection = "datalicense")
@Data
public class DataLicense {
    //数据库-数据许可证
    @Id
    private String id;

    private String typeId;
    private String type;
}

