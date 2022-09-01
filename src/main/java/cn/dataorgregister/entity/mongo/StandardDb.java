package cn.dataorgregister.entity.mongo;

import lombok.Data;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 15:23
 */
@Data
public class StandardDb {
    private String UniIdentifierSystem; //支持的唯一标识符系统
    private boolean versionControl; //版本控制
    private boolean qualityControl; //质量控制
    private String metaStandardName; //元数据标准名称
    private String metaStandardSchema; //元数据标准方案
    private String apisUrl; //APIs url
    private String apisType; //APIs类型

}
