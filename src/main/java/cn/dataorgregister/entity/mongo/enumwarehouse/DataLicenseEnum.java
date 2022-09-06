//package cn.dataorgregister.entity.dictionary;
//
//public enum DataLicenseEnum {
//    //数据库-数据许可证
//    DATALICENSE_APACHELICENSE(1,"apache license 2.0"),
//    DATALICENSE_BSD(2,"BSD"),
//    DATALICENSE_CREATIVECOMMONS(3,"creative commons (CC-BY,CC-SA,CC-NC,etc)"),
//    DATALICENSE_PUBLICDOMAINDEDICATION(4,"Public Domain Dedication(CC Zero)"),
//    DATALICENSE_COPYRIGHTS(5,"copyrights"),
//    DATALICENSE_OPENDATACOMMONS(6,"open data commons"),
//    DATALICENSE_OPENGOVERNMENTLICENCECANADA(7,"open government licence-canada"),
//    DATALICENSE_PUBLICDOMAIN(8,"public domain"),
//    DATALICENSE_MICROSOFTRECIPROCALLICENSE(9,"microsoft reciprocal license"),
//    DATALICENSE_OTHERS(10,"其他请列示"),
//    DATALICENSE_NULL(11,"无"),
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
//    DataLicenseEnum(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    /**
//     * Gets enum.
//     * @param code the code
//     * @return the enum
//     */
//    public static DataLicenseEnum getEnum(Integer code) {
//        for (DataLicenseEnum ele : DataLicenseEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//}
