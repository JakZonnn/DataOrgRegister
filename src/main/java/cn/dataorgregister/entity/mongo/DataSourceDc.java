package cn.dataorgregister.entity.mongo;

import lombok.Data;

import java.util.List;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 15:57
 */
@Data
public class DataSourceDc {
    private Subject subject; //学科分类
    private List<String> dataType; //数据资源类型
    private Long size; //数据量
    private String dataSourceOverview; //主要资源情况
    private String serviceObject; //主要服务对象
    private List<String> metaStandardName; //元数据标准名称
    private List<String> uniIdentifier; //唯一标识
    private boolean qualityControl; //质量控制
    private boolean versionControl; //版本控制

}
