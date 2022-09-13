package cn.dataorgregister.entity.mongo.orgregister;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/13 16:28
 */
@Data
public class Amount implements Serializable {

    private Long size; //存在数据表里，单位统一为字节

    private String unit; //用户提交的单位
}
