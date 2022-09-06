//package cn.dataorgregister.entity.dictionary;
//
//public enum UniIdentifierSystemEnum {
//
//    //数据库-支持的唯一标识符系统
//    UNIIDENTIFIERSYSTEM_CSTR(1,"cstr"),
//    UNIIDENTIFIERSYSTEM_ARK(2,"ark"),
//    UNIIDENTIFIERSYSTEM_DOI(3,"DOI"),
//    UNIIDENTIFIERSYSTEM_HANDLE(4,"Handle"),
//    UNIIDENTIFIERSYSTEM_PURL(5,"PURL"),
//    UNIIDENTIFIERSYSTEM_URN(6,"URN"),
//    UNIIDENTIFIERSYSTEM_OTHER(7,"其他请列示"),
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
//    UniIdentifierSystemEnum(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    /**
//     * Gets enum.
//     * @param code the code
//     * @return the enum
//     */
//    public static UniIdentifierSystemEnum getEnum(Integer code) {
//        for (UniIdentifierSystemEnum ele : UniIdentifierSystemEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//}
