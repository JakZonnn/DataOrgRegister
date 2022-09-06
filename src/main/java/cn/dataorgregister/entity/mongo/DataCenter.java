package cn.dataorgregister.entity.mongo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiOperation;
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
public class DataCenter extends Base{
    @Id
    private String id;

    private String dataCenterNameEN; //数据中心英文名称
    private String dataCenterNameCN; //数据中心中文名称
    private String uniIdentifierDc; //数据中心唯一标识符
    private String abbEN; //英文名称缩写
    private Location location; //所在地
    private String introductionEN;
    private String introductionCN;
    private String urlDc; //数据中心主页url
    private String logo; //logo
    private String submitPlatform; //汇交平台url
    private String dcType; //数据中心类型
    private List<String> certification; //认证与收录
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date joinDate; //加入日期
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date updateDate; //更新日期
    //数据中心组织机构信息
    private OrgInfoDc orgInfoDc;
    //数据中心数据资源情况
    private DataSourceDc dataSourceDc;
    //数据中心人员信息
    private PersonInfoDc personInfoDc;

}
