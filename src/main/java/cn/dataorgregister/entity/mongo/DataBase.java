package cn.dataorgregister.entity.mongo;

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
public class DataBase {
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
    private Long size; //数据库数据量
    private String urlDb; //数据库主页url
    private Long count; //数据集条数
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

    private DataTypeEnum sad;

    private List<AVB> sae;

//以下是不同字段的枚举，多选用list存list<枚举名字>，如private List<AVB> sae，单选直接写枚举名字，如private DataTypeEnum sad；
// 枚举可以写成内部类，也可以单独写一个类，单独写就需要写出接受code和msd的两个变量，
    @Getter
    public enum DataTypeEnum{
        DATASET,
        LW,
        REPORT
    }

    @Getter
    public enum AVB{
        dfihow,
        lw,
        REPORT
    }



}
