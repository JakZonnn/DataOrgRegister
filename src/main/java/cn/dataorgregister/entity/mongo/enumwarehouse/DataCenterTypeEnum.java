//package cn.dataorgregister.entity.dictionary;
//
//public enum DataCenterTypeEnum {
//
//    //数据中心类型
//    DATACENTERTYPE_SUBJECT(1,"学科中心"),
//    DATACENTERTYPE_INSTITUTE(2,"所级中心"),
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
//    DataCenterTypeEnum(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    /**
//     * Gets enum.
//     * @param code the code
//     * @return the enum
//     */
//    public static DataCenterTypeEnum getEnum(Integer code) {
//        for (DataCenterTypeEnum ele : DataCenterTypeEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//}
