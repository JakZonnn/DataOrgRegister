package cn.dataorgregister.entity.mongo.orgregister;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 14:27
 */
@Document(collection = "database")
@Data
public class DataBase extends Base implements Serializable {
    //基本信息
    @Id
//    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty(value = "数据库中文名称",required = true)
    @NotBlank(message = "数据库英文名称不能为空")
    private String dataBaseNameEN; //数据库英文名称

    @ApiModelProperty(value = "数据库英文名称",required = true)
    @NotBlank(message = "数据库中文名称不能为空")
    private String dataBaseNameCN; //数据库中文名称

    @ApiModelProperty("数据库唯一标识符")
    private String uniIdentifier; //数据库唯一标识符

    @ApiModelProperty("英文名称缩写")
    private String abbEN; //英文名称缩写

    @ApiModelProperty(value = "数据库介绍英文",required = true)
    @NotBlank(message = "数据库英文介绍不能为空")
    @Length(min = 2,max = 100,message = "介绍不能超过100字")
    private String introductionEN;

    @ApiModelProperty(value = "数据库介绍中文",required = true)
    @NotBlank(message = "数据库中文介绍不能为空")
    @Length(min = 2,max = 300,message = "介绍不能超过300字")
    private String introductionCN;

    @ApiModelProperty(value = "学科分类",required = true)
    @NotEmpty(message = "学科分类不能为空")
    private List<String> subjects; //学科分类

    @ApiModelProperty(value = "数据类型",required = true)
    @NotEmpty(message = "数据类型不能为空")
    private List<String> dataType; //数据类型

    @ApiModelProperty(value = "数据库数据量",required = true)
    @NotNull(message = "数据量不能为空")
    private Amount amount; //数据库数据量

    @ApiModelProperty(value = "数据库主页url",required = true)
    @NotBlank(message = "数据库主页url不能为空")
    private String urlDb; //数据库主页url

    @ApiModelProperty(value = "数据集条数",required = true)
    @NotNull(message = "数据集条数不能为空")
    private Long count; //数据集条数

    @ApiModelProperty("logo")
    private String logoPath; //logo，存一个路径，路径下放logo图片

    @ApiModelProperty("服务类型")
    private List<String> serviceType; //服务类型

    @ApiModelProperty("数据许可证")
    private List<String> license; //数据许可证

    @ApiModelProperty("认证与收录")
    private List<CertificationAndInclusion> certification; //认证与收录


    //数据库组织机构信息
    private OrgInfoDb orgInfoDb;
    //数据库数据条款注册
    private DataClauseDb dataClauseDb;
    //数据库标准注册
    private StandardDb standardDb;


}
