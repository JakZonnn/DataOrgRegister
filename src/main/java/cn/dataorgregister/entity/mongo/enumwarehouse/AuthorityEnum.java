//package cn.dataorgregister.entity.dictionary;
//
//public enum AuthorityEnum {
//
//    //数据库-数据库访问权限
//    AUTHORIT_FULLDISCLOSURE(1,"完全公开"),
//    AUTHORIT_PROTECTIONPERIOD(2,"保护期"),
//    AUTHORIT_CONDITIONALDISCLOSURE(3,"有条件公开"),
//    AUTHORIT_NONDISCLOSURE(4,"不公开"),
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
//    AuthorityEnum(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    /**
//     * Gets enum.
//     * @param code the code
//     * @return the enum
//     */
//    public static AuthorityEnum getEnum(Integer code) {
//        for (AuthorityEnum ele : AuthorityEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//}
