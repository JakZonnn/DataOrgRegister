//package cn.dataorgregister.entity.dictionary;
//
//public enum LimitTypeEnum {
//
//    //数据库-访问限制类型
//    LIMITTYPE_FEE(1,"收费"),
//    LIMITTYPE_REGISTRATION(2,"注册"),
//    LIMITTYPE_OTHER(3,"其他"),
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
//    LimitTypeEnum(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    /**
//     * Gets enum.
//     * @param code the code
//     * @return the enum
//     */
//    public static LimitTypeEnum getEnum(Integer code) {
//        for (LimitTypeEnum ele : LimitTypeEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//}
