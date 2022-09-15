package cn.dataorgregister.entity.mongo.orgregister;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
    @NotBlank(message = "承建单位不能为空")
    private String undertakeOrg; //承建单位

    @ApiModelProperty(value = "部门")
    private String department; //部门

    @ApiModelProperty(value = "参建单位名称")
    private List<String> buildOrgName; //参建单位名称

    @ApiModelProperty(value = "技术支持机构名称")
    private String supOrgName; //技术支持机构名称

    @ApiModelProperty(value = "存储能力",required = true)
    @NotNull(message = "存储能力不能为空")
    private Long storageCap; //存储能力

    @ApiModelProperty(value = "团队规模",required = true)
    @NotNull(message = "团队规模不能为空")
    private Integer teamSize; //团队规模

    @ApiModelProperty(value = "办公面积",required = true)
    @NotNull(message = "办公面积不能为空")
    private Double officeSpace; //办公面积

    @ApiModelProperty(value = "机房面积",required = true)
    @NotNull(message = "机房面积不能为空")
    private Double computerRoomSpace; //机房面积

    @ApiModelProperty(value = "网络安全等保级别",required = true)
    @NotEmpty(message = "网络安全等保级别不能为空")
    private List<String> securityLevel; //网络安全等保级别

    @ApiModelProperty(value = "专家指导与反馈")
    private boolean feedback; //专家指导与反馈

}
