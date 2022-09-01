package cn.dataorgregister.entity.mongo;

import lombok.Data;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 15:17
 */
@Data
//数据条款注册
public class DataClauseDb {
    private String dataPolicy; //数据政策注册上传
    private String authority; //数据库访问权限
    private String limitType; //访问限制类型
    private String licenseDb; //数据库许可证书

}