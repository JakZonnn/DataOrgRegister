package cn.dataorgregister.entity.mongo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.soap.SAAJResult;
import java.util.Date;
import java.util.List;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 14:27
 */
@Document(collection = "database")
@Data
public class DataBase extends Base {
    //基本信息
    @Id
    private String id;
    private String dataBaseNameEN; //数据集中文名称
    private String dataBaseNameCN; //数据集英文名称
    private String uniIdentifier; //数据库唯一标识符
    private String abbEN; //英文名称缩写
    private String introductionEN;
    private String introductionCN;
    private Subject subject; //学科分类
    private List<String> dataType; //数据类型
    private Long size; //数据库数据量
    private String urlDb; //数据库主页url
    private Long count; //数据集条数
    private String logo; //logo
    private String serviceType; //服务类型
    private List<String> license; //数据许可证
    private List<String> certification; //认证与收录
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date joinDate; //加入日期
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date updateDate; //更新日期
    //数据库组织机构信息
    private OrgInfoDb orgInfoDb;
    //数据库数据条款注册
    private DataClauseDb dataClauseDb;
    //数据库标准注册
    private StandardDb standardDb;







}
