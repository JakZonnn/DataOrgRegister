package cn.dataorgregister.entity.mongo.orgregister;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 16:07
 */
@Data
public class PersonInfoDean implements Serializable {

    //主任/副主任
    @ApiModelProperty(value = "主任类型",required = true)
    private String type;

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

    @ApiModelProperty(value = "电话")
    private String phone; //电话

    @ApiModelProperty(value = "邮箱")
    private String email; //邮箱

    @ApiModelProperty(value = "介绍")
    private String introduction; //介绍





}
