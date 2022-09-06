package cn.dataorgregister.entity.mongo.orgregister;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 15:31
 */
@Document(collection = "datacenter")
@Data
public class DataCenter extends Base {
    @Id
    private String id;

    @ApiModelProperty(value = "数据中心英文名称",required = true)
    private String dataCenterNameEN; //数据中心英文名称

    @ApiModelProperty(value = "数据中心中文名称",required = true)
    private String dataCenterNameCN; //数据中心中文名称

    @ApiModelProperty(value = "数据中心唯一标识符")
    private String uniIdentifierDc; //数据中心唯一标识符

    @ApiModelProperty(value = "英文名称缩写")
    private String abbEN; //英文名称缩写

    @ApiModelProperty(value = "所在地")
    private String locationId; //所在地id

    @ApiModelProperty(value = "数据中心英文介绍")
    private String introductionEN;

    @ApiModelProperty(value = "数据中心中文介绍")
    private String introductionCN;

    @ApiModelProperty(value = "数据中心主页url")
    private String urlDc; //数据中心主页url

    @ApiModelProperty(value = "logo",required = true)
    private String logoPath; //logo，存一个路径，路径下放logo图片

    @ApiModelProperty(value = "数据中心唯一标识符")
    private String submitPlatform; //汇交平台url

    @ApiModelProperty(value = "数据中心类型")
    private String dcType; //数据中心类型

    @ApiModelProperty(value = "认证与收录")
    private List<String> certification; //认证与收录

    @ApiModelProperty(value = "加入日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date joinDate; //加入日期

    @ApiModelProperty(value = "更新日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date updateDate; //更新日期


    //数据中心组织机构信息
    private OrgInfoDc orgInfoDc;
    //数据中心数据资源情况
    private DataSourceDc dataSourceDc;



    //数据中心主任人员信息
    private List<PersonInfoDean> personInfoDean;
    //数据中心工作人员信息
    private List<PersonInfoWork> personInfoWork;

}
