package cn.dataorgregister.entity.mongo.orgregister;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 15:48
 */
@Data
public class OrgInfoDc implements Serializable {
    @ApiModelProperty(value = "承建单位",required = true)
    private String undertakeOrg; //承建单位

    @ApiModelProperty(value = "部门")
    private String department; //部门

    @ApiModelProperty(value = "参建单位名称")
    private List<String> buildOrgName; //参建单位名称

    @ApiModelProperty(value = "技术支持机构名称")
    private String supOrgName; //技术支持机构名称

    @ApiModelProperty(value = "存储能力",required = true)
    private Long storageCap; //存储能力

    @ApiModelProperty(value = "团队规模",required = true)
    private Integer teamSize; //团队规模

    @ApiModelProperty(value = "办公面积",required = true)
    private Double officeSpace; //办公面积

    @ApiModelProperty(value = "机房面积",required = true)
    private Double computerRoomSpace; //机房面积

    @ApiModelProperty(value = "网络安全等保级别",required = true)
    private List<String> securityLevel; //网络安全等保级别

    @ApiModelProperty(value = "专家指导与反馈")
    private boolean feedback; //专家指导与反馈

}
