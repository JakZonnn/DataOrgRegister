package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/8 10:59
 */

@Document(collection = "uniidentifier")
@Data
public class UniIdentifier {
    //数据中心-唯一标识
    @Id
    private String id;

    private String typeId;
    private String type;
}
