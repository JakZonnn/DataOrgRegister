package cn.dataorgregister.entity.mongo.orgregister;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
    @NotEmpty(message = "学科分类不能为空")
    private List<String> subjects; //学科分类

    @ApiModelProperty(value = "数据资源类型",required = true)
    @NotEmpty(message = "数据资源类型不能为空")
    private List<String> dataType; //数据资源类型

    @ApiModelProperty(value = "数据量",required = true)
    @NotNull(message = "数据量不能为空")
    private Amount amount; //数据量

    @ApiModelProperty(value = "主要资源情况",required = true)
    @NotBlank(message = "主要资源情况不能为空")
    @Length(min = 2,max = 100,message = "资源情况概述不能超过300字")
    private String dataSourceOverview; //主要资源情况

    @ApiModelProperty(value = "主要服务对象",required = true)
    @NotBlank(message = "主要服务对象不能为空")
    @Length(min = 2,max = 100,message = "主要服务对象概述不能超过300字")
    private String serviceObject; //主要服务对象

    @ApiModelProperty(value = "元数据标准名称",required = true)
    @NotEmpty(message = "元数据标准名称不能为空")
    private List<String> metaStandardName; //元数据标准名称

    @ApiModelProperty(value = "唯一标识",required = true)
    @NotEmpty(message = "唯一标识不能为空")
    private List<String> uniIdentifier; //唯一标识

    @ApiModelProperty(value = "质量控制",required = true)
    @NotEmpty(message = "质量控制不能为空")
    private boolean qualityControl; //质量控制

    @ApiModelProperty(value = "版本控制",required = true)
    @NotEmpty(message = "版本控制不能为空")
    private boolean versionControl; //版本控制

}
