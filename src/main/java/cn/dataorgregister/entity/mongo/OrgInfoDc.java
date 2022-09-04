package cn.dataorgregister.entity.mongo;

import lombok.Data;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 15:48
 */
@Data
public class OrgInfoDc {
    private String undertakeOrg; //承建单位
    private String department; //部门
    private String buildOrgName; //参建单位名称
    private String supOrgName; //技术支持机构名称
    private String storageCap; //存储能力
    private Integer teamSize; //团队规模
    private Double officeSpace; //办公面积
    private Double computerRoomSpace; //机房面积
    private String securityLevel; //网络安全等保级别
    private boolean feedback; //专家指导与反馈

}
