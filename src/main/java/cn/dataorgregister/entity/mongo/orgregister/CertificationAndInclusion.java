package cn.dataorgregister.entity.mongo.orgregister;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/13 16:03
 */
@Data
public class CertificationAndInclusion implements Serializable {


    private String certificationValue; // 认证与收录()

    private Date joinDate; //加入日期

    private Date updateDate; //更新日期
}
