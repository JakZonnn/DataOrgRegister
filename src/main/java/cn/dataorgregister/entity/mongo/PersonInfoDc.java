package cn.dataorgregister.entity.mongo;

import lombok.Data;

/**
 * @author ZJ
 * @version 1.0
 * Create by 2022/9/1 16:07
 */
@Data
public class PersonInfoDc {
    //主任/副主任
    private String typeDean;
    private String nameDean; //姓名
    private String uniIdentifierDean; //唯一标识符
    private String workPlaceDean; //工作单位
    private String positionDean; //职务
    private String titleDean; //职称
    private String phoneDean; //电话
    private String emailDean; //邮箱
    private String introductionDean; //介绍


//    //副主任
//    private String nameViceDean; //副主任姓名
//    private String uniIdentifierViceDean; //副主任唯一标识符
//    private String workPlaceViceDean; //副主任工作地点
//    private String positionViceDean; //副主任职务
//    private String titleViceDean; //副主任职称
//    private String phoneViceDean; //副主任电话
//    private String emailViceDean; //副主任邮箱
//    private String introductionViceDean; //副主任介绍

    //联系人
    private String nameContact; //联系人姓名
    private String uniIdentifierContact; //联系人唯一标识符
    private String phoneContact; //联系人电话
    private String emailContact; //联系人邮箱

    //汇交咨询专员
    private String typeWork; //人员类型
    private String nameWork; //汇交专员姓名
    private String uniIdentifierWork; //汇交专员唯一标识符
    private String phoneWork; //汇交专员电话
    private String emailWork; //汇交专员邮箱
    private String rangeWork; //汇交专员业务范围

//    //汇交审核专员
//    private String nameSubmitCheck; //汇交审核专员姓名
//    private String uniIdentifierSubmitCheck;  //汇交审核专员唯一标识符
//    private String phoneSubmitCheck;  //汇交审核专员电话
//    private String emailSubmitCheck;  //汇交审核专员邮箱
//    private String rangeSubmitCheck;  //汇交审核专员业务范围
//
//    //运维专员
//    private String nameOm; //运维专员姓名
//    private String uniIdentifierOm; //运维专员唯一标识符
//    private String phoneOm; //运维专员电话
//    private String emailOm; //运维专员邮箱
//    private String rangeOm; //运维专员业务范围

}
