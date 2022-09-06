//package cn.dataorgregister.entity.dictionary;
//
//public enum LicenseDbEnum {
//
//    //数据库-数据库许可证书
//    LICENSEDB_APACHELICENSE(1,"apache license 2.0"),
//    LICENSEDB_BSD(2,"BSD"),
//    LICENSEDB_CREATIVECOMMONS(3,"creative commons (CC-BY,CC-SA,CC-NC,etc)"),
//    LICENSEDB_CC0(4,"CC 0"),
//    LICENSEDB_COPYRIGHTS(5,"copyrights"),
//    LICENSEDB_PUBLICDOMAIN(6,"public domain"),
//    LICENSEDB_OTHER(7,"其他"),
//    ;
//
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
//    LicenseDbEnum(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    /**
//     * Gets enum.
//     * @param code the code
//     * @return the enum
//     */
//    public static LicenseDbEnum getEnum(Integer code) {
//        for (LicenseDbEnum ele : LicenseDbEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//}
