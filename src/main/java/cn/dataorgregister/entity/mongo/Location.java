package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/6 9:29
 */
@Data
@Document(collection = "location")
public class Location {
    @Id
    private String id;
    private String country;
    private String countryCode;
    private String city;
    private String cityCode;
    private String area;
    private String areaCode;
    private List<Map<String,Object>> Cchilds;

}
