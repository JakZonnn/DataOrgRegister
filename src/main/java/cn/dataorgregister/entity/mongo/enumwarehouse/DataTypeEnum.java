//package cn.dataorgregister.entity.dictionary;
//
//public enum DataTypeEnum {
//    //数据库and数据中心-数据类型
//    DATATYPE_DATASET(1,"数据集"),
//    DATATYPE_JOURNALPAPER(2,"期刊论文"),
//    DATATPYE_DATAPAPER(3,"数据论文"),
//    DATATPYE_REPORT(4,"报告"),
//    DATATPYE_BOOK(5,"书籍"),
//    DATATPYE_PRESENTATION(6,"会议演示"),
//    DATATPYE_STANDARD(7,"标准"),
//    DATATPYE_WBSITE(8,"网站"),
//    DATATPYE_PATENT(9,"专利"),
//    DATATPYE_SOFTWARECOPYRIGHTS(10,"软件著作权"),
//    DATATPYE_SOFTWARE(11,"软件"),
//    DATATPYE_WORKFLOW(12,"工作流"),
//    DATATPYE_MODEL(13,"模型"),
//    DATATPYE_SERVICE(14,"服务"),
//    DATATPYE_OTHERS(15,"其他"),
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
//    DataTypeEnum(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    /**
//     * Gets enum.
//     * @param code the code
//     * @return the enum
//     */
//    public static DataTypeEnum getEnum(Integer code) {
//        for (DataTypeEnum ele : DataTypeEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//}
