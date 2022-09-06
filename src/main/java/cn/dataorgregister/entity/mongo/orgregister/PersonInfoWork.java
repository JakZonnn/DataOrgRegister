package cn.dataorgregister.entity.mongo.orgregister;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/8 13:01
 */
@Data
public class PersonInfoWork implements Serializable {

    @ApiModelProperty(value = "工作人员类型",required = true)
    private String type; //人员类型

    @ApiModelProperty(value = "姓名")
    private String name; //姓名

    @ApiModelProperty(value = "唯一标识符")
    private String uniIdentifier; //唯一标识符

    @ApiModelProperty(value = "电话")
    private String phone; //电话

    @ApiModelProperty(value = "邮箱")
    private String email; //邮箱

    @ApiModelProperty(value = "业务范围")
    private String range; //业务范围
}
