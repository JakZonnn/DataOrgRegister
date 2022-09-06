package cn.dataorgregister.entity.mongo.orgregister;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 15:57
 */
@Data
public class DataSourceDc implements Serializable {

    @ApiModelProperty(value = "学科分类",required = true)
    private List<String> subjectsId; //学科分类id

    @ApiModelProperty(value = "数据资源类型",required = true)
    private List<String> dataType; //数据资源类型

    @ApiModelProperty(value = "数据量",required = true)
    private Long size; //数据量

    @ApiModelProperty(value = "主要资源情况",required = true)
    private String dataSourceOverview; //主要资源情况

    @ApiModelProperty(value = "主要服务对象",required = true)
    private String serviceObject; //主要服务对象

    @ApiModelProperty(value = "元数据标准名称",required = true)
    private List<String> metaStandardName; //元数据标准名称

    @ApiModelProperty(value = "唯一标识",required = true)
    private List<String> uniIdentifier; //唯一标识

    @ApiModelProperty(value = "质量控制",required = true)
    private boolean qualityControl; //质量控制

    @ApiModelProperty(value = "版本控制",required = true)
    private boolean versionControl; //版本控制

}
