package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@Document(collection = "location")
public class Location implements Serializable {

  @Id
  private String id;

  @Field("area_code")
  private String areaCode;
  @Field("zip_code")
  private String zipCode;
  private String prefectural;
  @Field("city_en_name")
  private String cityEnName;
  private String province;
  @Field("city_lat")
  private double cityLat;
  @Field("city_long")
  private double cityLong;
  @Field("city_zh_name")
  private String cityZhName;
  private String country;
//  @Field("id")
//  private long field;

}
