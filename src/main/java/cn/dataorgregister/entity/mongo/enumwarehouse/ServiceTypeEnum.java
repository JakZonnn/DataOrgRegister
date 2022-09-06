//package cn.dataorgregister.entity.dictionary;
//
//public enum ServiceTypeEnum {
//    SERVICETYPE_DATA(1,"数据提供"),
//    SERVICETYPE_SERVICE(2,"服务提供"),
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
//    ServiceTypeEnum(int code, String msg){
//        this.code = code;
//        this.msg = msg;
//    }
//
//    public static ServiceTypeEnum getEnum(Integer code) {
//        for (ServiceTypeEnum ele : ServiceTypeEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//
//}
