package cn.dataorgregister.entity.mongo.orgregister;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/5 15:58
 */
@Data
public class Base implements Serializable {
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date updateTableTime;
}
