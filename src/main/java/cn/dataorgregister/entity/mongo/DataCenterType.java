package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/8 9:58
 */
@Document(collection = "datacentertype")
@Data
public class DataCenterType {
    //数据中心类型
    @Id
    private String id;

    private String typeId;
    private String type;
}
