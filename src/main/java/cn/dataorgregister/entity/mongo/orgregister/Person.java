package cn.dataorgregister.entity.mongo.orgregister;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/8 13:01
 */
@Data
public class Person implements Serializable {

    @ApiModelProperty(value = "工作人员类型",required = true)
    @NotBlank(message = "人员类型不能为空")
    private String type; //人员类型

    @ApiModelProperty(value = "姓名")
    private String name; //姓名

    @ApiModelProperty(value = "唯一标识符")
    private String uniIdentifier; //唯一标识符

    @ApiModelProperty(value = "工作单位")
    private String workPlace; //工作单位

    @ApiModelProperty(value = "职务")
    private String position; //职务

    @ApiModelProperty(value = "职称")
    private String title; //职称

    @ApiModelProperty(value = "个人介绍")
    private String introduction; //个人介绍

    @ApiModelProperty(value = "电话")
    private String phone; //电话

    @ApiModelProperty(value = "邮箱")
    private String email; //邮箱

    @ApiModelProperty(value = "业务范围")
    private String range; //业务范围


}
