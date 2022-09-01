package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 15:31
 */
@Document(collection = "register_dc")
@Data
public class RegisterDc {
    private String id;
    private String dataCenterNameEN; //数据集英文名称
    private String dataCenterNameCN; //数据集中文名称
    private String uniIdentifierDc; //数据中心唯一标识符
    private String abbEN; //英文名称缩写
    private String location; //所在地
    private String introductionEN;
    private String introductionCN;
    private String urlDc; //数据中心主页url
    private String logo; //logo
    private String submitPlatform; //汇交平台url
    private String dcType; //数据中心类型
    private String certification; //认证与收录
    private Date joinDate; //加入日期
    private Date updateDate; //更新日期
    //数据中心组织机构信息
    private OrgInfoDc orgInfoDc;
    //数据中心数据资源情况
    private DataSourceDc dataSourceDc;
    //数据中心人员信息
    private PersonInfoDc personInfoDc;

}
