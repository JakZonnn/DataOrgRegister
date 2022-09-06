//package cn.dataorgregister.entity.dictionary;
//
//
//public enum UniIdentifierEnum {
//    //数据中心-唯一标识
//    uniIdentifier_cstr(1,"cstr"),
//    uniIdentifier_ark(2,"ark"),
//    uniIdentifier_arxiv(3,"arxiv"),
//    uniIdentifier_bibcode(4,"bibcode"),
//    uniIdentifier_DOI(5,"DOI"),
//    uniIdentifier_EAN13(6,"EAN13"),
//    uniIdentifier_EISSN(7,"EISSN"),
//    uniIdentifier_Handle(8,"Handle"),
//    uniIdentifier_IGSN(9,"IGSN"),
//    uniIdentifier_ISBN(10,"ISBN"),
//    uniIdentifier_ISSN(11,"ISSN"),
//    uniIdentifier_ISTC(12,"ISTC"),
//    uniIdentifier_LISSN(13,"LISSN"),
//    uniIdentifier_LSID(14,"LSID"),
//    uniIdentifier_PMID(15,"PMID"),
//    uniIdentifier_PURL(16,"PURL"),
//    uniIdentifier_UPC(17,"UPC"),
//    uniIdentifier_URI(18,"URI"),
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
//    UniIdentifierEnum(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    /**
//     * Gets enum.
//     * @param code the code
//     * @return the enum
//     */
//    public static UniIdentifierEnum getEnum(Integer code) {
//        for (UniIdentifierEnum ele : UniIdentifierEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//
//}
