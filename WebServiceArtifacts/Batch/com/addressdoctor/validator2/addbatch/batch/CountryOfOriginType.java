
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryOfOriginType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryOfOriginType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COO_ALWAYS_USE_DESTINATION_COUNTRY"/>
 *     &lt;enumeration value="COO_NEVER_USE_DESTINATION_COUNTRY"/>
 *     &lt;enumeration value="COO_ABW"/>
 *     &lt;enumeration value="COO_AFG"/>
 *     &lt;enumeration value="COO_AGO"/>
 *     &lt;enumeration value="COO_AIA"/>
 *     &lt;enumeration value="COO_ALB"/>
 *     &lt;enumeration value="COO_AND"/>
 *     &lt;enumeration value="COO_ANT"/>
 *     &lt;enumeration value="COO_ARE"/>
 *     &lt;enumeration value="COO_ARG"/>
 *     &lt;enumeration value="COO_ARM"/>
 *     &lt;enumeration value="COO_ASM"/>
 *     &lt;enumeration value="COO_ATA"/>
 *     &lt;enumeration value="COO_ATF"/>
 *     &lt;enumeration value="COO_ATG"/>
 *     &lt;enumeration value="COO_AUS"/>
 *     &lt;enumeration value="COO_AUT"/>
 *     &lt;enumeration value="COO_AZE"/>
 *     &lt;enumeration value="COO_BDI"/>
 *     &lt;enumeration value="COO_BEL"/>
 *     &lt;enumeration value="COO_BEN"/>
 *     &lt;enumeration value="COO_BFA"/>
 *     &lt;enumeration value="COO_BGD"/>
 *     &lt;enumeration value="COO_BGR"/>
 *     &lt;enumeration value="COO_BHR"/>
 *     &lt;enumeration value="COO_BHS"/>
 *     &lt;enumeration value="COO_BIH"/>
 *     &lt;enumeration value="COO_BLR"/>
 *     &lt;enumeration value="COO_BLZ"/>
 *     &lt;enumeration value="COO_BMU"/>
 *     &lt;enumeration value="COO_BOL"/>
 *     &lt;enumeration value="COO_BRA"/>
 *     &lt;enumeration value="COO_BRB"/>
 *     &lt;enumeration value="COO_BRN"/>
 *     &lt;enumeration value="COO_BTN"/>
 *     &lt;enumeration value="COO_BVT"/>
 *     &lt;enumeration value="COO_BWA"/>
 *     &lt;enumeration value="COO_CAF"/>
 *     &lt;enumeration value="COO_CAN"/>
 *     &lt;enumeration value="COO_CCK"/>
 *     &lt;enumeration value="COO_CHE"/>
 *     &lt;enumeration value="COO_CHL"/>
 *     &lt;enumeration value="COO_CHN"/>
 *     &lt;enumeration value="COO_CIV"/>
 *     &lt;enumeration value="COO_CMR"/>
 *     &lt;enumeration value="COO_COD"/>
 *     &lt;enumeration value="COO_COG"/>
 *     &lt;enumeration value="COO_COK"/>
 *     &lt;enumeration value="COO_COL"/>
 *     &lt;enumeration value="COO_COM"/>
 *     &lt;enumeration value="COO_CPV"/>
 *     &lt;enumeration value="COO_CRI"/>
 *     &lt;enumeration value="COO_CUB"/>
 *     &lt;enumeration value="COO_CXR"/>
 *     &lt;enumeration value="COO_CYM"/>
 *     &lt;enumeration value="COO_CYP"/>
 *     &lt;enumeration value="COO_CZE"/>
 *     &lt;enumeration value="COO_DEU"/>
 *     &lt;enumeration value="COO_DJI"/>
 *     &lt;enumeration value="COO_DMA"/>
 *     &lt;enumeration value="COO_DNK"/>
 *     &lt;enumeration value="COO_DOM"/>
 *     &lt;enumeration value="COO_DZA"/>
 *     &lt;enumeration value="COO_ECU"/>
 *     &lt;enumeration value="COO_EGY"/>
 *     &lt;enumeration value="COO_ERI"/>
 *     &lt;enumeration value="COO_ESH"/>
 *     &lt;enumeration value="COO_ESP"/>
 *     &lt;enumeration value="COO_EST"/>
 *     &lt;enumeration value="COO_ETH"/>
 *     &lt;enumeration value="COO_FIN"/>
 *     &lt;enumeration value="COO_FJI"/>
 *     &lt;enumeration value="COO_FLK"/>
 *     &lt;enumeration value="COO_FRA"/>
 *     &lt;enumeration value="COO_FRO"/>
 *     &lt;enumeration value="COO_FSM"/>
 *     &lt;enumeration value="COO_GAB"/>
 *     &lt;enumeration value="COO_GBR"/>
 *     &lt;enumeration value="COO_GEO"/>
 *     &lt;enumeration value="COO_GHA"/>
 *     &lt;enumeration value="COO_GIB"/>
 *     &lt;enumeration value="COO_GIN"/>
 *     &lt;enumeration value="COO_GLP"/>
 *     &lt;enumeration value="COO_GMB"/>
 *     &lt;enumeration value="COO_GNB"/>
 *     &lt;enumeration value="COO_GNQ"/>
 *     &lt;enumeration value="COO_GRC"/>
 *     &lt;enumeration value="COO_GRD"/>
 *     &lt;enumeration value="COO_GRL"/>
 *     &lt;enumeration value="COO_GTM"/>
 *     &lt;enumeration value="COO_GUF"/>
 *     &lt;enumeration value="COO_GUM"/>
 *     &lt;enumeration value="COO_GUY"/>
 *     &lt;enumeration value="COO_HKG"/>
 *     &lt;enumeration value="COO_HMD"/>
 *     &lt;enumeration value="COO_HND"/>
 *     &lt;enumeration value="COO_HRV"/>
 *     &lt;enumeration value="COO_HTI"/>
 *     &lt;enumeration value="COO_HUN"/>
 *     &lt;enumeration value="COO_IDN"/>
 *     &lt;enumeration value="COO_IND"/>
 *     &lt;enumeration value="COO_IOT"/>
 *     &lt;enumeration value="COO_IRL"/>
 *     &lt;enumeration value="COO_IRN"/>
 *     &lt;enumeration value="COO_IRQ"/>
 *     &lt;enumeration value="COO_ISL"/>
 *     &lt;enumeration value="COO_ISR"/>
 *     &lt;enumeration value="COO_ITA"/>
 *     &lt;enumeration value="COO_JAM"/>
 *     &lt;enumeration value="COO_JOR"/>
 *     &lt;enumeration value="COO_JPN"/>
 *     &lt;enumeration value="COO_KAZ"/>
 *     &lt;enumeration value="COO_KEN"/>
 *     &lt;enumeration value="COO_KGZ"/>
 *     &lt;enumeration value="COO_KHM"/>
 *     &lt;enumeration value="COO_KIR"/>
 *     &lt;enumeration value="COO_KNA"/>
 *     &lt;enumeration value="COO_KOR"/>
 *     &lt;enumeration value="COO_KWT"/>
 *     &lt;enumeration value="COO_LAO"/>
 *     &lt;enumeration value="COO_LBN"/>
 *     &lt;enumeration value="COO_LBR"/>
 *     &lt;enumeration value="COO_LBY"/>
 *     &lt;enumeration value="COO_LCA"/>
 *     &lt;enumeration value="COO_LIE"/>
 *     &lt;enumeration value="COO_LKA"/>
 *     &lt;enumeration value="COO_LSO"/>
 *     &lt;enumeration value="COO_LTU"/>
 *     &lt;enumeration value="COO_LUX"/>
 *     &lt;enumeration value="COO_LVA"/>
 *     &lt;enumeration value="COO_MAC"/>
 *     &lt;enumeration value="COO_MAR"/>
 *     &lt;enumeration value="COO_MCO"/>
 *     &lt;enumeration value="COO_MDA"/>
 *     &lt;enumeration value="COO_MDG"/>
 *     &lt;enumeration value="COO_MDV"/>
 *     &lt;enumeration value="COO_MEX"/>
 *     &lt;enumeration value="COO_MHL"/>
 *     &lt;enumeration value="COO_MKD"/>
 *     &lt;enumeration value="COO_MLI"/>
 *     &lt;enumeration value="COO_MLT"/>
 *     &lt;enumeration value="COO_MMR"/>
 *     &lt;enumeration value="COO_MNG"/>
 *     &lt;enumeration value="COO_MNP"/>
 *     &lt;enumeration value="COO_MOZ"/>
 *     &lt;enumeration value="COO_MRT"/>
 *     &lt;enumeration value="COO_MSR"/>
 *     &lt;enumeration value="COO_MTQ"/>
 *     &lt;enumeration value="COO_MUS"/>
 *     &lt;enumeration value="COO_MWI"/>
 *     &lt;enumeration value="COO_MYS"/>
 *     &lt;enumeration value="COO_MYT"/>
 *     &lt;enumeration value="COO_NAM"/>
 *     &lt;enumeration value="COO_NCL"/>
 *     &lt;enumeration value="COO_NER"/>
 *     &lt;enumeration value="COO_NFK"/>
 *     &lt;enumeration value="COO_NGA"/>
 *     &lt;enumeration value="COO_NIC"/>
 *     &lt;enumeration value="COO_NIU"/>
 *     &lt;enumeration value="COO_NLD"/>
 *     &lt;enumeration value="COO_NOR"/>
 *     &lt;enumeration value="COO_NPL"/>
 *     &lt;enumeration value="COO_NRU"/>
 *     &lt;enumeration value="COO_NZL"/>
 *     &lt;enumeration value="COO_OMN"/>
 *     &lt;enumeration value="COO_PAK"/>
 *     &lt;enumeration value="COO_PAN"/>
 *     &lt;enumeration value="COO_PCN"/>
 *     &lt;enumeration value="COO_PER"/>
 *     &lt;enumeration value="COO_PHL"/>
 *     &lt;enumeration value="COO_PLW"/>
 *     &lt;enumeration value="COO_PNG"/>
 *     &lt;enumeration value="COO_POL"/>
 *     &lt;enumeration value="COO_PRI"/>
 *     &lt;enumeration value="COO_PRK"/>
 *     &lt;enumeration value="COO_PRT"/>
 *     &lt;enumeration value="COO_PRY"/>
 *     &lt;enumeration value="COO_PSE"/>
 *     &lt;enumeration value="COO_PYF"/>
 *     &lt;enumeration value="COO_QAT"/>
 *     &lt;enumeration value="COO_REU"/>
 *     &lt;enumeration value="COO_ROU"/>
 *     &lt;enumeration value="COO_RUS"/>
 *     &lt;enumeration value="COO_RWA"/>
 *     &lt;enumeration value="COO_SAU"/>
 *     &lt;enumeration value="COO_SDN"/>
 *     &lt;enumeration value="COO_SEN"/>
 *     &lt;enumeration value="COO_SGP"/>
 *     &lt;enumeration value="COO_SGS"/>
 *     &lt;enumeration value="COO_SHN"/>
 *     &lt;enumeration value="COO_SJM"/>
 *     &lt;enumeration value="COO_SLB"/>
 *     &lt;enumeration value="COO_SLE"/>
 *     &lt;enumeration value="COO_SLV"/>
 *     &lt;enumeration value="COO_SMR"/>
 *     &lt;enumeration value="COO_SOM"/>
 *     &lt;enumeration value="COO_SPM"/>
 *     &lt;enumeration value="COO_STP"/>
 *     &lt;enumeration value="COO_SUR"/>
 *     &lt;enumeration value="COO_SVK"/>
 *     &lt;enumeration value="COO_SVN"/>
 *     &lt;enumeration value="COO_SWE"/>
 *     &lt;enumeration value="COO_SWZ"/>
 *     &lt;enumeration value="COO_SYC"/>
 *     &lt;enumeration value="COO_SYR"/>
 *     &lt;enumeration value="COO_TCA"/>
 *     &lt;enumeration value="COO_TCD"/>
 *     &lt;enumeration value="COO_TGO"/>
 *     &lt;enumeration value="COO_THA"/>
 *     &lt;enumeration value="COO_TJK"/>
 *     &lt;enumeration value="COO_TKL"/>
 *     &lt;enumeration value="COO_TKM"/>
 *     &lt;enumeration value="COO_TLS"/>
 *     &lt;enumeration value="COO_TON"/>
 *     &lt;enumeration value="COO_TTO"/>
 *     &lt;enumeration value="COO_TUN"/>
 *     &lt;enumeration value="COO_TUR"/>
 *     &lt;enumeration value="COO_TUV"/>
 *     &lt;enumeration value="COO_TWN"/>
 *     &lt;enumeration value="COO_TZA"/>
 *     &lt;enumeration value="COO_UGA"/>
 *     &lt;enumeration value="COO_UKR"/>
 *     &lt;enumeration value="COO_UMI"/>
 *     &lt;enumeration value="COO_URY"/>
 *     &lt;enumeration value="COO_USA"/>
 *     &lt;enumeration value="COO_UZB"/>
 *     &lt;enumeration value="COO_VAT"/>
 *     &lt;enumeration value="COO_VCT"/>
 *     &lt;enumeration value="COO_VEN"/>
 *     &lt;enumeration value="COO_VGB"/>
 *     &lt;enumeration value="COO_VIR"/>
 *     &lt;enumeration value="COO_VNM"/>
 *     &lt;enumeration value="COO_VUT"/>
 *     &lt;enumeration value="COO_WLF"/>
 *     &lt;enumeration value="COO_WSM"/>
 *     &lt;enumeration value="COO_YEM"/>
 *     &lt;enumeration value="COO_SCG"/>
 *     &lt;enumeration value="COO_ZAF"/>
 *     &lt;enumeration value="COO_ZMB"/>
 *     &lt;enumeration value="COO_ZWE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryOfOriginType")
@XmlEnum
public enum CountryOfOriginType {

    COO_ALWAYS_USE_DESTINATION_COUNTRY,
    COO_NEVER_USE_DESTINATION_COUNTRY,
    COO_ABW,
    COO_AFG,
    COO_AGO,
    COO_AIA,
    COO_ALB,
    COO_AND,
    COO_ANT,
    COO_ARE,
    COO_ARG,
    COO_ARM,
    COO_ASM,
    COO_ATA,
    COO_ATF,
    COO_ATG,
    COO_AUS,
    COO_AUT,
    COO_AZE,
    COO_BDI,
    COO_BEL,
    COO_BEN,
    COO_BFA,
    COO_BGD,
    COO_BGR,
    COO_BHR,
    COO_BHS,
    COO_BIH,
    COO_BLR,
    COO_BLZ,
    COO_BMU,
    COO_BOL,
    COO_BRA,
    COO_BRB,
    COO_BRN,
    COO_BTN,
    COO_BVT,
    COO_BWA,
    COO_CAF,
    COO_CAN,
    COO_CCK,
    COO_CHE,
    COO_CHL,
    COO_CHN,
    COO_CIV,
    COO_CMR,
    COO_COD,
    COO_COG,
    COO_COK,
    COO_COL,
    COO_COM,
    COO_CPV,
    COO_CRI,
    COO_CUB,
    COO_CXR,
    COO_CYM,
    COO_CYP,
    COO_CZE,
    COO_DEU,
    COO_DJI,
    COO_DMA,
    COO_DNK,
    COO_DOM,
    COO_DZA,
    COO_ECU,
    COO_EGY,
    COO_ERI,
    COO_ESH,
    COO_ESP,
    COO_EST,
    COO_ETH,
    COO_FIN,
    COO_FJI,
    COO_FLK,
    COO_FRA,
    COO_FRO,
    COO_FSM,
    COO_GAB,
    COO_GBR,
    COO_GEO,
    COO_GHA,
    COO_GIB,
    COO_GIN,
    COO_GLP,
    COO_GMB,
    COO_GNB,
    COO_GNQ,
    COO_GRC,
    COO_GRD,
    COO_GRL,
    COO_GTM,
    COO_GUF,
    COO_GUM,
    COO_GUY,
    COO_HKG,
    COO_HMD,
    COO_HND,
    COO_HRV,
    COO_HTI,
    COO_HUN,
    COO_IDN,
    COO_IND,
    COO_IOT,
    COO_IRL,
    COO_IRN,
    COO_IRQ,
    COO_ISL,
    COO_ISR,
    COO_ITA,
    COO_JAM,
    COO_JOR,
    COO_JPN,
    COO_KAZ,
    COO_KEN,
    COO_KGZ,
    COO_KHM,
    COO_KIR,
    COO_KNA,
    COO_KOR,
    COO_KWT,
    COO_LAO,
    COO_LBN,
    COO_LBR,
    COO_LBY,
    COO_LCA,
    COO_LIE,
    COO_LKA,
    COO_LSO,
    COO_LTU,
    COO_LUX,
    COO_LVA,
    COO_MAC,
    COO_MAR,
    COO_MCO,
    COO_MDA,
    COO_MDG,
    COO_MDV,
    COO_MEX,
    COO_MHL,
    COO_MKD,
    COO_MLI,
    COO_MLT,
    COO_MMR,
    COO_MNG,
    COO_MNP,
    COO_MOZ,
    COO_MRT,
    COO_MSR,
    COO_MTQ,
    COO_MUS,
    COO_MWI,
    COO_MYS,
    COO_MYT,
    COO_NAM,
    COO_NCL,
    COO_NER,
    COO_NFK,
    COO_NGA,
    COO_NIC,
    COO_NIU,
    COO_NLD,
    COO_NOR,
    COO_NPL,
    COO_NRU,
    COO_NZL,
    COO_OMN,
    COO_PAK,
    COO_PAN,
    COO_PCN,
    COO_PER,
    COO_PHL,
    COO_PLW,
    COO_PNG,
    COO_POL,
    COO_PRI,
    COO_PRK,
    COO_PRT,
    COO_PRY,
    COO_PSE,
    COO_PYF,
    COO_QAT,
    COO_REU,
    COO_ROU,
    COO_RUS,
    COO_RWA,
    COO_SAU,
    COO_SDN,
    COO_SEN,
    COO_SGP,
    COO_SGS,
    COO_SHN,
    COO_SJM,
    COO_SLB,
    COO_SLE,
    COO_SLV,
    COO_SMR,
    COO_SOM,
    COO_SPM,
    COO_STP,
    COO_SUR,
    COO_SVK,
    COO_SVN,
    COO_SWE,
    COO_SWZ,
    COO_SYC,
    COO_SYR,
    COO_TCA,
    COO_TCD,
    COO_TGO,
    COO_THA,
    COO_TJK,
    COO_TKL,
    COO_TKM,
    COO_TLS,
    COO_TON,
    COO_TTO,
    COO_TUN,
    COO_TUR,
    COO_TUV,
    COO_TWN,
    COO_TZA,
    COO_UGA,
    COO_UKR,
    COO_UMI,
    COO_URY,
    COO_USA,
    COO_UZB,
    COO_VAT,
    COO_VCT,
    COO_VEN,
    COO_VGB,
    COO_VIR,
    COO_VNM,
    COO_VUT,
    COO_WLF,
    COO_WSM,
    COO_YEM,
    COO_SCG,
    COO_ZAF,
    COO_ZMB,
    COO_ZWE;

    public String value() {
        return name();
    }

    public static CountryOfOriginType fromValue(String v) {
        return valueOf(v);
    }

}
