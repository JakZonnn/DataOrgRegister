package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.soap.SAAJResult;
import java.util.Date;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 14:27
 */
@Document(collection = "register_db")
@Data
public class RegisterDb  {
    //基本信息
    @Id
    private String id;
    private String dataBaseNameEN; //数据集中文名称
    private String dataBaseNameCN; //数据集英文名称
    private String uniIdentifier; //数据库唯一标识符
    private String abbEN; //英文名称缩写
    private String introductionEN;
    private String introductionCN;
    private String subject; //学科分类
    private String size; //数据库数据量
    private String urlDb; //数据库主页url
    private Integer count; //数据集条数
    private String logo; //logo
    private String serviceType; //服务类型
    private String license; //数据许可证
    private String certification; //认证与收录
    private Date joinDate; //加入日期
    private Date updateDate; //更新日期
    //数据库组织机构信息
    private OrgInfoDb orgInfoDb;
    //数据库数据条款注册
    private DataClauseDb dataClauseDb;
    //数据库标准注册
    private StandardDb standardDb;

}
