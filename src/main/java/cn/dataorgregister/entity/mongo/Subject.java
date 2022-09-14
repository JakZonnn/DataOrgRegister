package cn.dataorgregister.entity.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "subject")
public class Subject {
  @Id
  private String id;

  private String one_rank_no;
  private String one_rank_name;

  private String two_rank_no;
  private String two_rank_name;

  private String three_rank_no;
  private String three_rank_name;


//  public String getId() {
//    return id;
//  }
//
//  public void setId(String id) {
//    this.id = id;
//  }
//
//
//  public String getOneRankId() {
//    return oneRankId;
//  }
//
//  public void setOneRankId(String oneRankId) {
//    this.oneRankId = oneRankId;
//  }
//
//
//  public String getThreeRankId() {
//    return threeRankId;
//  }
//
//  public void setThreeRankId(String threeRankId) {
//    this.threeRankId = threeRankId;
//  }
//
//
//  public String getTwoRankId() {
//    return twoRankId;
//  }
//
//  public void setTwoRankId(String twoRankId) {
//    this.twoRankId = twoRankId;
//  }
//
//
//  public String getOneRankName() {
//    return oneRankName;
//  }
//
//  public void setOneRankName(String oneRankName) {
//    this.oneRankName = oneRankName;
//  }
//
//
//  public String getThreeRankName() {
//    return threeRankName;
//  }
//
//  public void setThreeRankName(String threeRankName) {
//    this.threeRankName = threeRankName;
//  }
//
//
//  public String getTwoRankName() {
//    return twoRankName;
//  }
//
//  public void setTwoRankName(String twoRankName) {
//    this.twoRankName = twoRankName;
//  }
//
//
//  public String getOneRankNo() {
//    return oneRankNo;
//  }
//
//  public void setOneRankNo(String oneRankNo) {
//    this.oneRankNo = oneRankNo;
//  }
//
//
//  public String getThreeRankNo() {
//    return threeRankNo;
//  }
//
//  public void setThreeRankNo(String threeRankNo) {
//    this.threeRankNo = threeRankNo;
//  }
//
//
//  public String getTwoRankNo() {
//    return twoRankNo;
//  }
//
//  public void setTwoRankNo(String twoRankNo) {
//    this.twoRankNo = twoRankNo;
//  }

}
