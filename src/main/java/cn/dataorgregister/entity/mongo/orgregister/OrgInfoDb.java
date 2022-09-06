package cn.dataorgregister.entity.mongo.orgregister;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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
    private String orgName; //依托单位名称

    @ApiModelProperty(value = "所在地",required = true)
    private String locationId; //所在地id

    @ApiModelProperty(value = "参建单位名称")
    private List<String> buildOrgName; //参建单位名称

    @ApiModelProperty(value = "技术支持机构名称")
    private String supOrgName; //技术支持机构名称

    @ApiModelProperty(value = "联系人姓名",required = true)
    private String contactName; //联系人姓名

    @ApiModelProperty(value = "联系人邮箱",required = true)
    private String email; //联系人邮箱

    @ApiModelProperty(value = "联系人电话",required = true)
    private String phone; //联系人电话
}
