//package cn.dataorgregister.entity.dictionary;
//
//public enum ApisTypeEnum {
//
//    //数据库-APIS类型
//    APISTYPE_FTP(1,"ftp"),
//    APISTYPE_NETCDF(2,"NetCDF"),
//    APISTYPE_OAIPMH(3,"OAI-PMH"),
//    APISTYPE_OPENDAP(4,"OpenDAP"),
//    APISTYPE_REST(5,"REST"),
//    APISTYPE_SOAP(6,"SOAP"),
//    APISTYPE_SPARQL(7,"SPARQL"),
//    APISTYPE_SWORD(8,"SWORD"),
//    APISTYPE_OTHER(9,"其他请列示"),
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
//    ApisTypeEnum(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    /**
//     * Gets enum.
//     * @param code the code
//     * @return the enum
//     */
//    public static ApisTypeEnum getEnum(Integer code) {
//        for (ApisTypeEnum ele : ApisTypeEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//}
