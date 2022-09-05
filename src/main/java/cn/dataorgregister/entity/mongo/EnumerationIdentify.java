package cn.dataorgregister.entity.mongo;

public enum EnumerationIdentify {
    //数据库and数据中心-数据类型
    DATATYPE_DATASET(1,"数据集"),
    DATATYPE_JOURNALPAPER(2,"期刊论文"),
    DATATPYE_DATAPAPER(3,"数据论文"),
    DATATPYE_REPORT(4,"报告"),
    DATATPYE_BOOK(5,"书籍"),
    DATATPYE_PRESENTATION(6,"会议演示"),
    DATATPYE_STANDARD(7,"标准"),
    DATATPYE_WBSITE(8,"网站"),
    DATATPYE_PATENT(9,"专利"),
    DATATPYE_SOFTWARECOPYRIGHTS(10,"软件著作权"),
    DATATPYE_SOFTWARE(11,"软件"),
    DATATPYE_WORKFLOW(12,"工作流"),
    DATATPYE_MODEL(13,"模型"),
    DATATPYE_SERVICE(14,"服务"),
    DATATPYE_OTHERS(15,"其他"),


    //数据库-数据许可证
    DATALICENSE_APACHELICENSE(1,"apache license 2.0"),
    DATALICENSE_BSD(2,"BSD"),
    DATALICENSE_CREATIVECOMMONS(3,"creative commons (CC-BY,CC-SA,CC-NC,etc)"),
    DATALICENSE_PUBLICDOMAINDEDICATION(4,"Public Domain Dedication(CC Zero)"),
    DATALICENSE_COPYRIGHTS(5,"copyrights"),
    DATALICENSE_OPENDATACOMMONS(6,"open data commons"),
    DATALICENSE_OPENGOVERNMENTLICENCECANADA(7,"open government licence-canada"),
    DATALICENSE_PUBLICDOMAIN(8,"public domain"),
    DATALICENSE_MICROSOFTRECIPROCALLICENSE(9,"microsoft reciprocal license"),
    DATALICENSE_OTHERS(10,"其他请列示"),
    DATALICENSE_NULL(11,"无"),

    //数据库and数据中心-认证与收录
    CERTIFICATION_CLARINCERTIFICATEB(1,"Clarin certificate B"),
    CERTIFICATION_CORETRUSTSEAL(2,"CoreTrustSeal"),
    CERTIFICATION_DIN31644(3,"DIN 31644"),
    CERTIFICATION_DRAMBORA(4,"DRAMBORA"),
    CERTIFICATION_DSA(5,"DSA"),
    CERTIFICATION_ISO16363(6,"ISO 16363"),
    CERTIFICATION_ISO16919(7,"ISO 16919"),
    CERTIFICATION_RATSWD(8,"RatSWD"),
    CERTIFICATION_TRAC(9,"TRAC"),
    CERTIFICATION_TRUSTEDDIGITALREPOSITORY(10,"Trusted Digital Repository"),
    CERTIFICATION_WDS(11,"WDS"),
    CERTIFICATION_RE3DATA(12,"re3data收录"),
    CERTIFICATION_LOCALSUPPORTDATASET(13,"国内项目支持的数据库，列示项目名称"), //仅数据库注册使用
    CERTIFICATION_OTHERS(14,"其他，请列示"),

    //数据库-数据库访问权限
    AUTHORIT_FULLDISCLOSURE(1,"完全公开"),
    AUTHORIT_PROTECTIONPERIOD(2,"保护期"),
    AUTHORIT_CONDITIONALDISCLOSURE(3,"有条件公开"),
    AUTHORIT_NONDISCLOSURE(4,"不公开"),

    //数据库-访问限制类型
    LIMITTYPE_FEE(1,"收费"),
    LIMITTYPE_REGISTRATION(2,"注册"),
    LIMITTYPE_OTHER(3,"其他"),

    //数据库-数据库许可证书
    LICENSEDB_APACHELICENSE(1,"apache license 2.0"),
    LICENSEDB_BSD(2,"BSD"),
    LICENSEDB_CREATIVECOMMONS(3,"creative commons (CC-BY,CC-SA,CC-NC,etc)"),
    LICENSEDB_CC0(4,"CC 0"),
    LICENSEDB_COPYRIGHTS(5,"copyrights"),
    LICENSEDB_PUBLICDOMAIN(6,"public domain"),
    LICENSEDB_OTHER(7,"其他"),

    //数据库-支持的唯一标识符系统
    UNIIDENTIFIERSYSTEM_CSTR(1,"cstr"),
    UNIIDENTIFIERSYSTEM_ARK(2,"ark"),
    UNIIDENTIFIERSYSTEM_DOI(3,"DOI"),
    UNIIDENTIFIERSYSTEM_HANDLE(4,"Handle"),
    UNIIDENTIFIERSYSTEM_PURL(5,"PURL"),
    UNIIDENTIFIERSYSTEM_URN(6,"URN"),
    UNIIDENTIFIERSYSTEM_OTHER(7,"其他请列示"),

    //数据库and数据中心-元数据标准名称
    METASTANDARDNAME_METADATA_SPECIFICATION(1,"中科院科学数据中心体系元数据规范"),   //仅数据库注册使用
    METASTANDARDNAME_ABCDACCESSTOBIOLOGICALCOLLECTIONDATA(2,"ABCD-Access to Biological Collection Data"),
    METASTANDARDNAME_AGMESAGRICULTURALMETADATAELEMENTSET(3,"AgMES-Agricultural Metadata Element Set"),
    METASTANDARDNAME_AVMASTRONOMYVISUALIZATIONMETADATA(4,"AVM-Astronomy Visualization Metadata"),
    METASTANDARDNAME_CFMETADATACONVENTIONS(5,"CF（Climate and Forecast）Metadata Conventions"),
    METASTANDARDNAME_CIFCRYSTALLOGRAPHICINFORMATIONFRAMEWORK(6,"CIF-Crystallographic Information Framework"),
    METASTANDARDNAME_CIMCOMMONINFORMATIONMODEL(7,"CIM-Common Information Model"),
    METASTANDARDNAME_CSMDCCLRCCORESCIENTIFICMETADATAMODEL(8,"CSMD-CCLRC Core Scientific Metadata Model"),
    METASTANDARDNAME_DARWINCORE(9,"Darwin Core"),
    METASTANDARDNAME_DATACITEMETADATASCHEMA(10,"Datacite Metadata Schema"),
    METASTANDARDNAME_DCATDATACATALOGVOCABULARY(11,"DCAT-Data Catalog Vocabulary"),
    METASTANDARDNAME_DDIDATADOCUMENTATIONINITIATIVE(12,"DDI-Data Documentation Initiative"),
    METASTANDARDNAME_DIFDIRECTORYINTERCHANGEFORMAT(13,"DIF-Directory Interchange Format"),
    METASTANDARDNAME_DUBLINCORE(14,"Dublin Core"),
    METASTANDARDNAME_EMLECOLOGICALMETADATALANGUAGE(15,"EML-Ecological Metadata Language"),
    METASTANDARDNAME_FGDCCSDGMFEDERALGEOGRAPHICDATACOMMITTEECONTENTSTANDARDFORDIGITAL(16,"FGDC/CSDGM-Federal Geographic Data Committee Content Standard for Digital"),
    METASTANDARDNAME_GEOSPATIALMETADATA(17,"Geospatial Metadata"),
    METASTANDARDNAME_FITSFLEXIBLEIMAGETRANSPORTSYSTEM(18,"FITS-Flexible Image Transport System"),
    METASTANDARDNAME_GENOMEMETADATA(19,"Genome Metadata"),
    METASTANDARDNAME_INTERNATIONALVIRTUALOBSERVATORYALLIANCETECHNICALSPECIFICATIONS(20,"International Virtual Observatory Alliance Technical Specifications"),
    METASTANDARDNAME_ISATAB(21,"ISA-Tab"),
    METASTANDARDNAME_ISO19115(22,"ISO 19115"),
    METASTANDARDNAME_MIBBIMINIMUMINFORMATIONFORBIOLOGICALANDBIOMEDICALINVESTIGATIONS(23,"MIBBI-Minimum Information for Biological and Biomedical Investigations"),
    METASTANDARDNAME_MIDASHERITAGE(24,"MIDAS-Heritage"),
    METASTANDARDNAME_OAIOREOPENARCHIVESINITIATIVEOBJECTREUSEANDEXCHANGE(25,"OAI-ORE-Open Archives Initiative Object Reuse and Exchange"),
    METASTANDARDNAME_OBERVOM(26,"oberv-OM"),
    METASTANDARDNAME_OBSERVATIONSANDMEASUREMENTS(27,"Observations and Measurements"),
    METASTANDARDNAME_OMEXMLOPENMICROSCOPYENVIRONMENTXML(28,"OME-XML-Open Microscopy Environment XML"),
    METASTANDARDNAME_PROTOCALDATAELEMENTDEFINITONS(29,"Protocal Data Element Definitons"),
    METASTANDARDNAME_PROV(30,"PROV"),
    METASTANDARDNAME_QUDEXQUALITATIVEDATAEXCHANGEFORMAT(31,"QuDEx-Qualitative Data Exchange Format"),
    METASTANDARDNAME_RDFDATACUBEVOCABULARY(32,"RDF Data Cube Vocabulary"),
    METASTANDARDNAME_REPOSITORYDEVELOPEDMETADATASCHEMAS(33,"Repository-Developed Metadata Schemas"),
    METASTANDARDNAME_SDMXSTATISTICALDATAANDMETADATAEXCHANGE(34,"SDMX-Statistical Data and Metadata Exchange"),
    METASTANDARDNAME_SPASEDATAMODEL(35,"SPASE Data Model"),
    METASTANDARDNAME_OTHER(36,"other"),

    //数据库-APIS类型
    APISTYPE_FTP(1,"ftp"),
    APISTYPE_NETCDF(2,"NetCDF"),
    APISTYPE_OAIPMH(3,"OAI-PMH"),
    APISTYPE_OPENDAP(4,"OpenDAP"),
    APISTYPE_REST(5,"REST"),
    APISTYPE_SOAP(6,"SOAP"),
    APISTYPE_SPARQL(7,"SPARQL"),
    APISTYPE_SWORD(8,"SWORD"),
    APISTYPE_OTHER(9,"其他请列示"),

    //数据中心类型
    DATACENTERTYPE_SUBJECT(1,"学科中心"),
    DATACENTERTYPE_INSTITUTE(2,"所级中心"),

    //数据安全-网络安全等保级别
    securityLevel_one(1,"等保一级"),
    securityLevel_two(2,"等保二级"),
    securityLevel_three(3,"等保三级"),
    securityLevel_null(4,"无"),

    //数据中心-唯一标识
    uniIdentifier_cstr(1,"cstr"),
    uniIdentifier_ark(2,"ark"),
    uniIdentifier_arxiv(3,"arxiv"),
    uniIdentifier_bibcode(4,"bibcode"),
    uniIdentifier_DOI(5,"DOI"),
    uniIdentifier_EAN13(6,"EAN13"),
    uniIdentifier_EISSN(7,"EISSN"),
    uniIdentifier_Handle(8,"Handle"),
    uniIdentifier_IGSN(9,"IGSN"),
    uniIdentifier_ISBN(10,"ISBN"),
    uniIdentifier_ISSN(11,"ISSN"),
    uniIdentifier_ISTC(12,"ISTC"),
    uniIdentifier_LISSN(13,"LISSN"),
    uniIdentifier_LSID(14,"LSID"),
    uniIdentifier_PMID(15,"PMID"),
    uniIdentifier_PURL(16,"PURL"),
    uniIdentifier_UPC(17,"UPC"),
    uniIdentifier_URI(18,"URI"),
    ;


    private Integer code;
    private String msg;

    /**
     * Msg string.
     * @return the string
     */
    public String msg() {
        return msg;
    }

    /**
     * Code Integer.
     * @return the Integer
     */
    public Integer code() {
        return code;
    }

    EnumerationIdentify(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * Gets enum.
     * @param code the code
     * @return the enum
     */
    public static EnumerationIdentify getEnum(Integer code) {
        for (EnumerationIdentify ele : EnumerationIdentify.values()) {
            if (ele.code() == code) {
                return ele;
            }
        }
        return null;
    }


}
