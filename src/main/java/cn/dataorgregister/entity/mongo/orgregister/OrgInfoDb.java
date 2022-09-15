package cn.dataorgregister.entity.mongo.orgregister;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 14:51
 */
@Data
public class OrgInfoDb implements Serializable {

    @ApiModelProperty(value = "依托单位名称",required = true)
    @NotBlank(message = "依托单位名称不能为空")
    private String orgName; //依托单位名称

    @ApiModelProperty(value = "所在地",required = true)
    @NotNull(message = "所在地不能为空")
    private Locations locations; //所在地

    @ApiModelProperty(value = "参建单位名称")
    private List<String> buildOrgName; //参建单位名称

    @ApiModelProperty(value = "技术支持机构名称")
    private String supOrgName; //技术支持机构名称

    @ApiModelProperty(value = "联系人姓名",required = true)
    @NotBlank(message = "联系人姓名不能为空")
    private String contactName; //联系人姓名

    @ApiModelProperty(value = "联系人邮箱",required = true)
    @NotBlank(message = "联系人邮箱不能为空")
    private String email; //联系人邮箱

    @ApiModelProperty(value = "联系人电话",required = true)
    @NotBlank(message = "联系人电话不能为空")
    private String phone; //联系人电话
}
