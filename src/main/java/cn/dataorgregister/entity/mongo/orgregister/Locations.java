package cn.dataorgregister.entity.mongo.orgregister;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ZJ
 * @description 存放国家、省、城市的
 * @Create by 2022/9/15 15:22
 */
@Data
public class Locations  implements Serializable {

    private String country;
    private String province;
    private String city;
}
