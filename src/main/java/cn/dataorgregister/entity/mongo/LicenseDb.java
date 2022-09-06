package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/8 10:17
 */
@Document(collection = "licensedb")
@Data
public class LicenseDb {

    //数据库-数据库许可证书
    @Id
    private String id;

    private String typeId;
    private String type;
}
