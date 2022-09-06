//package cn.dataorgregister.entity.dictionary;
//
//public enum MetaStandardNameEnum {
//
//    //数据库and数据中心-元数据标准名称
//    METASTANDARDNAME_METADATA_CAS(1,"中科院科学数据中心体系元数据规范"),   //仅数据库注册使用
//    METASTANDARDNAME_ABCDACCESSTOBIOLOGICALCOLLECTIONDATA(2,"ABCD-Access to Biological Collection Data"),
//    METASTANDARDNAME_AGMESAGRICULTURALMETADATAELEMENTSET(3,"AgMES-Agricultural Metadata Element Set"),
//    METASTANDARDNAME_AVMASTRONOMYVISUALIZATIONMETADATA(4,"AVM-Astronomy Visualization Metadata"),
//    METASTANDARDNAME_CFMETADATACONVENTIONS(5,"CF（Climate and Forecast）Metadata Conventions"),
//    METASTANDARDNAME_CIFCRYSTALLOGRAPHICINFORMATIONFRAMEWORK(6,"CIF-Crystallographic Information Framework"),
//    METASTANDARDNAME_CIMCOMMONINFORMATIONMODEL(7,"CIM-Common Information Model"),
//    METASTANDARDNAME_CSMDCCLRCCORESCIENTIFICMETADATAMODEL(8,"CSMD-CCLRC Core Scientific Metadata Model"),
//    METASTANDARDNAME_DARWINCORE(9,"Darwin Core"),
//    METASTANDARDNAME_DATACITEMETADATASCHEMA(10,"Datacite Metadata Schema"),
//    METASTANDARDNAME_DCATDATACATALOGVOCABULARY(11,"DCAT-Data Catalog Vocabulary"),
//    METASTANDARDNAME_DDIDATADOCUMENTATIONINITIATIVE(12,"DDI-Data Documentation Initiative"),
//    METASTANDARDNAME_DIFDIRECTORYINTERCHANGEFORMAT(13,"DIF-Directory Interchange Format"),
//    METASTANDARDNAME_DUBLINCORE(14,"Dublin Core"),
//    METASTANDARDNAME_EMLECOLOGICALMETADATALANGUAGE(15,"EML-Ecological Metadata Language"),
//    METASTANDARDNAME_FGDCCSDGMFEDERALGEOGRAPHICDATACOMMITTEECONTENTSTANDARDFORDIGITAL(16,"FGDC/CSDGM-Federal Geographic Data Committee Content Standard for Digital"),
//    METASTANDARDNAME_GEOSPATIALMETADATA(17,"Geospatial Metadata"),
//    METASTANDARDNAME_FITSFLEXIBLEIMAGETRANSPORTSYSTEM(18,"FITS-Flexible Image Transport System"),
//    METASTANDARDNAME_GENOMEMETADATA(19,"Genome Metadata"),
//    METASTANDARDNAME_INTERNATIONALVIRTUALOBSERVATORYALLIANCETECHNICALSPECIFICATIONS(20,"International Virtual Observatory Alliance Technical Specifications"),
//    METASTANDARDNAME_ISATAB(21,"ISA-Tab"),
//    METASTANDARDNAME_ISO19115(22,"ISO 19115"),
//    METASTANDARDNAME_MIBBIMINIMUMINFORMATIONFORBIOLOGICALANDBIOMEDICALINVESTIGATIONS(23,"MIBBI-Minimum Information for Biological and Biomedical Investigations"),
//    METASTANDARDNAME_MIDASHERITAGE(24,"MIDAS-Heritage"),
//    METASTANDARDNAME_OAIOREOPENARCHIVESINITIATIVEOBJECTREUSEANDEXCHANGE(25,"OAI-ORE-Open Archives Initiative Object Reuse and Exchange"),
//    METASTANDARDNAME_OBERVOM(26,"oberv-OM"),
//    METASTANDARDNAME_OBSERVATIONSANDMEASUREMENTS(27,"Observations and Measurements"),
//    METASTANDARDNAME_OMEXMLOPENMICROSCOPYENVIRONMENTXML(28,"OME-XML-Open Microscopy Environment XML"),
//    METASTANDARDNAME_PROTOCALDATAELEMENTDEFINITONS(29,"Protocal Data Element Definitons"),
//    METASTANDARDNAME_PROV(30,"PROV"),
//    METASTANDARDNAME_QUDEXQUALITATIVEDATAEXCHANGEFORMAT(31,"QuDEx-Qualitative Data Exchange Format"),
//    METASTANDARDNAME_RDFDATACUBEVOCABULARY(32,"RDF Data Cube Vocabulary"),
//    METASTANDARDNAME_REPOSITORYDEVELOPEDMETADATASCHEMAS(33,"Repository-Developed Metadata Schemas"),
//    METASTANDARDNAME_SDMXSTATISTICALDATAANDMETADATAEXCHANGE(34,"SDMX-Statistical Data and Metadata Exchange"),
//    METASTANDARDNAME_SPASEDATAMODEL(35,"SPASE Data Model"),
//    METASTANDARDNAME_OTHER(36,"other"),
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
//    MetaStandardNameEnum(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    /**
//     * Gets enum.
//     * @param code the code
//     * @return the enum
//     */
//    public static MetaStandardNameEnum getEnum(Integer code) {
//        for (MetaStandardNameEnum ele : MetaStandardNameEnum.values()) {
//            if (ele.code() == code) {
//                return ele;
//            }
//        }
//        return null;
//    }
//}
