//package cn.dataorgregister.entity.dictionary;
//
//public enum CertificationEnum {
//
//    //数据库and数据中心-认证与收录
//    CERTIFICATION_CLARINCERTIFICATEB(1,"Clarin certificate B"),
//    CERTIFICATION_CORETRUSTSEAL(2,"CoreTrustSeal"),
//    CERTIFICATION_DIN31644(3,"DIN 31644"),
//    CERTIFICATION_DRAMBORA(4,"DRAMBORA"),
//    CERTIFICATION_DSA(5,"DSA"),
//    CERTIFICATION_ISO16363(6,"ISO 16363"),
//    CERTIFICATION_ISO16919(7,"ISO 16919"),
//    CERTIFICATION_RATSWD(8,"RatSWD"),
//    CERTIFICATION_TRAC(9,"TRAC"),
//    CERTIFICATION_TRUSTEDDIGITALREPOSITORY(10,"Trusted Digital Repository"),
//    CERTIFICATION_WDS(11,"WDS"),
//    CERTIFICATION_RE3DATA(12,"re3data收录"),
//    CERTIFICATION_LOCALSUPPORTDATASET(13,"国内项目支持的数据库，列示项目名称"), //仅数据库注册使用
//    CERTIFICATION_OTHERS(14,"其他，请列示"),
//    ;
//
//    private Integer code;
//    private String msg;
//
//    /**
//     * Msg string.
//     * @return the string
//     */
//    public String msg() {
//        return msg;
//    }
//
//    /**
//     * Code Integer.
//     * @return the Integer
//     */
//    public Integer code() {
//        return code;
//    }
//
//    CertificationEnum(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    /**
//     * Gets enum.
//     * @param code the code
//     * @return the enum
//     */
//    public static CertificationEnum getEnum(Integer code) {
//        for (CertificationEnum ele : CertificationEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//
//
//}
