package cn.dataorgregister.entity.mongo.orgregister;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 15:23
 */
@Data
public class StandardDb implements Serializable {

    @ApiModelProperty("支持的唯一标识符系统")
    private List<String> UniIdentifierSystem; //支持的唯一标识符系统

    @ApiModelProperty("版本控制")
    private boolean versionControl; //版本控制

    @ApiModelProperty("质量控制")
    private boolean qualityControl; //质量控制

    @ApiModelProperty("元数据标准名称")
    private List<String> metaStandardName; //元数据标准名称

    @ApiModelProperty("元数据标准方案")
    private String metaStandardSchema; //元数据标准方案

    @ApiModelProperty("APIs url")
    private String apisUrl; //APIs url

    @ApiModelProperty("APIs类型")
    private List<String> apisType; //APIs类型

}
