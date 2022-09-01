package cn.dataorgregister.entity.mongo;

import lombok.Data;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 14:51
 */
@Data
public class OrgInfoDb {
    private String orgName; //依托单位名称
    private String location; //所在地
    private String buildOrgName; //参建单位名称
    private String supOrgName; //技术支持机构名称
    private String contactName; //联系人姓名
    private String email; //联系人邮箱
    private String phone; //联系人电话
}
