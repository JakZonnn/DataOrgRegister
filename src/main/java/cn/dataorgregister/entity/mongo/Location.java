package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "location")
public class Location {

  @Id
  private String id;
  private String areaCode;
  private String zipCode;
  private String prefectural;
  private String cityEnName;
  private String province;
  private double cityLat;
  private double cityLong;
  private String cityZhName;
  private String country;
//  @Field("id")
//  private long field;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public String getPrefectural() {
    return prefectural;
  }

  public void setPrefectural(String prefectural) {
    this.prefectural = prefectural;
  }


  public String getCityEnName() {
    return cityEnName;
  }

  public void setCityEnName(String cityEnName) {
    this.cityEnName = cityEnName;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  public double getCityLat() {
    return cityLat;
  }

  public void setCityLat(double cityLat) {
    this.cityLat = cityLat;
  }


  public double getCityLong() {
    return cityLong;
  }

  public void setCityLong(double cityLong) {
    this.cityLong = cityLong;
  }


  public String getCityZhName() {
    return cityZhName;
  }

  public void setCityZhName(String cityZhName) {
    this.cityZhName = cityZhName;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


//  public long getField() {
//    return field;
//  }
//
//  public void setField(long field) {
//    this.field = field;
//  }
}
