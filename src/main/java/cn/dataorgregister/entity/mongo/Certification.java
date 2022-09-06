package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/8 9:41
 */
@Document(collection = "certification")
@Data
public class Certification {
    //数据库and数据中心-认证与收录
    @Id
    private String id;

    private String typeId;
    private String type;
}
