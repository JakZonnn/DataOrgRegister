//package cn.dataorgregister.entity.dictionary;
//
//public enum SecurityLevelEnum {
//
//    //数据安全-网络安全等保级别
//    SECURITYLEVEL_ONE(1,"等保一级"),
//    SECURITYLEVEL_TWO(2,"等保二级"),
//    SECURITYLEVEL_THREE(3,"等保三级"),
//    SECURITYLEVEL_NULL(4,"无"),
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
//    SecurityLevelEnum(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    /**
//     * Gets enum.
//     * @param code the code
//     * @return the enum
//     */
//    public static SecurityLevelEnum getEnum(Integer code) {
//        for (SecurityLevelEnum ele : SecurityLevelEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//}
