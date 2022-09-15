package cn.dataorgregister.entity.mongo.orgregister;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 15:31
 */
@Document(collection = "datacenter")
@Data
public class DataCenter extends Base implements Serializable {
    @Id
    private String id;

    @ApiModelProperty(value = "数据中心英文名称",required = true)
    @NotBlank(message = "数据中心英文名称不能为空")
    private String dataCenterNameEN; //数据中心英文名称

    @ApiModelProperty(value = "数据中心中文名称",required = true)
    @NotBlank(message = "数据中心中文名称不能为空")
    private String dataCenterNameCN; //数据中心中文名称

    @ApiModelProperty(value = "数据中心唯一标识符")
    private String uniIdentifierDc; //数据中心唯一标识符

    @ApiModelProperty(value = "英文名称缩写")
    private String abbEN; //英文名称缩写

    @ApiModelProperty(value = "所在地",required = true)
    @NotNull(message = "所在地不能为空")
    private Locations locations; //所在地

    @ApiModelProperty(value = "数据中心英文介绍",required = true)
    @NotBlank(message = "数据中心英文介绍不能为空")
    private String introductionEN;

    @ApiModelProperty(value = "数据中心中文介绍",required = true)
    @NotBlank(message = "数据中心中文介绍不能为空")
    private String introductionCN;

    @ApiModelProperty(value = "数据中心主页url",required = true)
    @NotBlank(message = "数据中心url不能为空")
    private String urlDc; //数据中心主页url

    @ApiModelProperty(value = "logo",required = true)
    private String logoPath; //logo，存一个路径，路径下放logo图片

    @ApiModelProperty(value = "数据中心唯一标识符",required = true)
    @NotBlank(message = "汇交平台url不能为空")
    private String submitPlatform; //汇交平台url

    @ApiModelProperty(value = "数据中心类型",required = true)
    @NotBlank(message = "汇交平台url不能为空")
    private String dcType; //数据中心类型

    @ApiModelProperty(value = "认证与收录")
    private List<CertificationAndInclusion> certification; //认证与收录

    //数据中心组织机构信息
    private OrgInfoDc orgInfoDc;
    //数据中心数据资源情况
    private DataSourceDc dataSourceDc;

//    //数据中心主任人员信息
//    private List<PersonInfoDean> personInfoDean;
    //数据中心人员信息
    private List<Person> person;

}
