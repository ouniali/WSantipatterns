
package com.oracle.xmlns.enterprise.tools.schemas.m795726;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_USFComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_USFComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_GVT_CRED_MIL_SVCE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_CRED_MIL_SVCETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_MILITARY_COMP" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_MILITARY_COMPTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_MIL_GRADE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_MIL_GRADETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_MIL_RESRVE_CAT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_MIL_RESRVE_CATTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_MIL_SEP_RET" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_MIL_SEP_RETTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_MIL_SVCE_END" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_MIL_SVCE_ENDTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_MIL_SVCE_START" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_MIL_SVCE_STARTTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_MIL_VERIFY" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_MIL_VERIFYTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_PAR_NBR_LAST" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_PAR_NBR_LASTTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_UNIF_SVC_CTR" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_UNIF_SVC_CTRTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_VET_PREF_APPT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_VET_PREF_APPTTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_VET_PREF_RIF" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_VET_PREF_RIFTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_CHANGE_FLAG" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_CHANGE_FLAGTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_DRAFT_STATUS" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_DRAFT_STATUSTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_YR_ATTAINED" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_YR_ATTAINEDTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_DISABLED_VET" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_DISABLED_VETTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_DISABLED" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_DISABLEDTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_DISABILITY_CD" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_DISABILITY_CDTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GRADE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GRADETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_SAL_ADMIN_PLAN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_SAL_ADMIN_PLANTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_CURR_AGCY_EMPL" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_CURR_AGCY_EMPLTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_CURR_FED_EMPL" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_CURR_FED_EMPLTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_HIGH_PAY_PLAN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_HIGH_PAY_PLANTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_HIGH_GRADE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_HIGH_GRADETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_PREV_AGCY_EMPL" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_PREV_AGCY_EMPLTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_PREV_FED_EMPL" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_PREV_FED_EMPLTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_SEP_INCENTIVE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_SEP_INCENTIVETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_SEP_INCENT_DT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_SEP_INCENT_DTTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_TENURE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_TENURETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GVT_PAY_PLAN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_GVT_PAY_PLANTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_BARG_UNIT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_BARG_UNITTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_USFComplexTypeShape", propOrder = {
    "keypropeffdt",
    "propgvtcredmilsvce",
    "propgvtmilitarycomp",
    "propgvtmilgrade",
    "propgvtmilresrvecat",
    "propgvtmilsepret",
    "propgvtmilsvceend",
    "propgvtmilsvcestart",
    "propgvtmilverify",
    "propgvtparnbrlast",
    "propgvtunifsvcctr",
    "propgvtvetprefappt",
    "propgvtvetprefrif",
    "propgvtchangeflag",
    "propgvtdraftstatus",
    "propgvtyrattained",
    "propdisabledvet",
    "propdisabled",
    "propgvtdisabilitycd",
    "propgrade",
    "propsaladminplan",
    "propgvtcurragcyempl",
    "propgvtcurrfedempl",
    "propgvthighpayplan",
    "propgvthighgrade",
    "propgvtprevagcyempl",
    "propgvtprevfedempl",
    "propgvtsepincentive",
    "propgvtsepincentdt",
    "propgvttenure",
    "propgvtpayplan",
    "propbargunit"
})
public class COLLPERSDATAUSFComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_GVT_CRED_MIL_SVCE")
    protected PROPGVTCREDMILSVCETypeShape propgvtcredmilsvce;
    @XmlElement(name = "PROP_GVT_MILITARY_COMP")
    protected PROPGVTMILITARYCOMPTypeShape propgvtmilitarycomp;
    @XmlElement(name = "PROP_GVT_MIL_GRADE")
    protected PROPGVTMILGRADETypeShape propgvtmilgrade;
    @XmlElement(name = "PROP_GVT_MIL_RESRVE_CAT")
    protected PROPGVTMILRESRVECATTypeShape propgvtmilresrvecat;
    @XmlElement(name = "PROP_GVT_MIL_SEP_RET")
    protected PROPGVTMILSEPRETTypeShape propgvtmilsepret;
    @XmlElement(name = "PROP_GVT_MIL_SVCE_END")
    protected PROPGVTMILSVCEENDTypeShape propgvtmilsvceend;
    @XmlElement(name = "PROP_GVT_MIL_SVCE_START")
    protected PROPGVTMILSVCESTARTTypeShape propgvtmilsvcestart;
    @XmlElement(name = "PROP_GVT_MIL_VERIFY")
    protected PROPGVTMILVERIFYTypeShape propgvtmilverify;
    @XmlElement(name = "PROP_GVT_PAR_NBR_LAST")
    protected PROPGVTPARNBRLASTTypeShape propgvtparnbrlast;
    @XmlElement(name = "PROP_GVT_UNIF_SVC_CTR")
    protected PROPGVTUNIFSVCCTRTypeShape propgvtunifsvcctr;
    @XmlElement(name = "PROP_GVT_VET_PREF_APPT")
    protected PROPGVTVETPREFAPPTTypeShape propgvtvetprefappt;
    @XmlElement(name = "PROP_GVT_VET_PREF_RIF")
    protected PROPGVTVETPREFRIFTypeShape propgvtvetprefrif;
    @XmlElement(name = "PROP_GVT_CHANGE_FLAG")
    protected PROPGVTCHANGEFLAGTypeShape propgvtchangeflag;
    @XmlElement(name = "PROP_GVT_DRAFT_STATUS")
    protected PROPGVTDRAFTSTATUSTypeShape propgvtdraftstatus;
    @XmlElement(name = "PROP_GVT_YR_ATTAINED")
    protected PROPGVTYRATTAINEDTypeShape propgvtyrattained;
    @XmlElement(name = "PROP_DISABLED_VET")
    protected PROPDISABLEDVETTypeShape propdisabledvet;
    @XmlElement(name = "PROP_DISABLED")
    protected PROPDISABLEDTypeShape propdisabled;
    @XmlElement(name = "PROP_GVT_DISABILITY_CD")
    protected PROPGVTDISABILITYCDTypeShape propgvtdisabilitycd;
    @XmlElement(name = "PROP_GRADE")
    protected PROPGRADETypeShape propgrade;
    @XmlElement(name = "PROP_SAL_ADMIN_PLAN")
    protected PROPSALADMINPLANTypeShape propsaladminplan;
    @XmlElement(name = "PROP_GVT_CURR_AGCY_EMPL")
    protected PROPGVTCURRAGCYEMPLTypeShape propgvtcurragcyempl;
    @XmlElement(name = "PROP_GVT_CURR_FED_EMPL")
    protected PROPGVTCURRFEDEMPLTypeShape propgvtcurrfedempl;
    @XmlElement(name = "PROP_GVT_HIGH_PAY_PLAN")
    protected PROPGVTHIGHPAYPLANTypeShape propgvthighpayplan;
    @XmlElement(name = "PROP_GVT_HIGH_GRADE")
    protected PROPGVTHIGHGRADETypeShape propgvthighgrade;
    @XmlElement(name = "PROP_GVT_PREV_AGCY_EMPL")
    protected PROPGVTPREVAGCYEMPLTypeShape propgvtprevagcyempl;
    @XmlElement(name = "PROP_GVT_PREV_FED_EMPL")
    protected PROPGVTPREVFEDEMPLTypeShape propgvtprevfedempl;
    @XmlElement(name = "PROP_GVT_SEP_INCENTIVE")
    protected PROPGVTSEPINCENTIVETypeShape propgvtsepincentive;
    @XmlElement(name = "PROP_GVT_SEP_INCENT_DT")
    protected PROPGVTSEPINCENTDTTypeShape propgvtsepincentdt;
    @XmlElement(name = "PROP_GVT_TENURE")
    protected PROPGVTTENURETypeShape propgvttenure;
    @XmlElement(name = "PROP_GVT_PAY_PLAN")
    protected PROPGVTPAYPLANTypeShape propgvtpayplan;
    @XmlElement(name = "PROP_BARG_UNIT")
    protected PROPBARGUNITTypeShape propbargunit;

    /**
     * Gets the value of the keypropeffdt property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPEFFDTTypeShape }
     *     
     */
    public KEYPROPEFFDTTypeShape getKEYPROPEFFDT() {
        return keypropeffdt;
    }

    /**
     * Sets the value of the keypropeffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPEFFDTTypeShape }
     *     
     */
    public void setKEYPROPEFFDT(KEYPROPEFFDTTypeShape value) {
        this.keypropeffdt = value;
    }

    /**
     * Gets the value of the propgvtcredmilsvce property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTCREDMILSVCETypeShape }
     *     
     */
    public PROPGVTCREDMILSVCETypeShape getPROPGVTCREDMILSVCE() {
        return propgvtcredmilsvce;
    }

    /**
     * Sets the value of the propgvtcredmilsvce property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTCREDMILSVCETypeShape }
     *     
     */
    public void setPROPGVTCREDMILSVCE(PROPGVTCREDMILSVCETypeShape value) {
        this.propgvtcredmilsvce = value;
    }

    /**
     * Gets the value of the propgvtmilitarycomp property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTMILITARYCOMPTypeShape }
     *     
     */
    public PROPGVTMILITARYCOMPTypeShape getPROPGVTMILITARYCOMP() {
        return propgvtmilitarycomp;
    }

    /**
     * Sets the value of the propgvtmilitarycomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTMILITARYCOMPTypeShape }
     *     
     */
    public void setPROPGVTMILITARYCOMP(PROPGVTMILITARYCOMPTypeShape value) {
        this.propgvtmilitarycomp = value;
    }

    /**
     * Gets the value of the propgvtmilgrade property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTMILGRADETypeShape }
     *     
     */
    public PROPGVTMILGRADETypeShape getPROPGVTMILGRADE() {
        return propgvtmilgrade;
    }

    /**
     * Sets the value of the propgvtmilgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTMILGRADETypeShape }
     *     
     */
    public void setPROPGVTMILGRADE(PROPGVTMILGRADETypeShape value) {
        this.propgvtmilgrade = value;
    }

    /**
     * Gets the value of the propgvtmilresrvecat property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTMILRESRVECATTypeShape }
     *     
     */
    public PROPGVTMILRESRVECATTypeShape getPROPGVTMILRESRVECAT() {
        return propgvtmilresrvecat;
    }

    /**
     * Sets the value of the propgvtmilresrvecat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTMILRESRVECATTypeShape }
     *     
     */
    public void setPROPGVTMILRESRVECAT(PROPGVTMILRESRVECATTypeShape value) {
        this.propgvtmilresrvecat = value;
    }

    /**
     * Gets the value of the propgvtmilsepret property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTMILSEPRETTypeShape }
     *     
     */
    public PROPGVTMILSEPRETTypeShape getPROPGVTMILSEPRET() {
        return propgvtmilsepret;
    }

    /**
     * Sets the value of the propgvtmilsepret property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTMILSEPRETTypeShape }
     *     
     */
    public void setPROPGVTMILSEPRET(PROPGVTMILSEPRETTypeShape value) {
        this.propgvtmilsepret = value;
    }

    /**
     * Gets the value of the propgvtmilsvceend property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTMILSVCEENDTypeShape }
     *     
     */
    public PROPGVTMILSVCEENDTypeShape getPROPGVTMILSVCEEND() {
        return propgvtmilsvceend;
    }

    /**
     * Sets the value of the propgvtmilsvceend property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTMILSVCEENDTypeShape }
     *     
     */
    public void setPROPGVTMILSVCEEND(PROPGVTMILSVCEENDTypeShape value) {
        this.propgvtmilsvceend = value;
    }

    /**
     * Gets the value of the propgvtmilsvcestart property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTMILSVCESTARTTypeShape }
     *     
     */
    public PROPGVTMILSVCESTARTTypeShape getPROPGVTMILSVCESTART() {
        return propgvtmilsvcestart;
    }

    /**
     * Sets the value of the propgvtmilsvcestart property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTMILSVCESTARTTypeShape }
     *     
     */
    public void setPROPGVTMILSVCESTART(PROPGVTMILSVCESTARTTypeShape value) {
        this.propgvtmilsvcestart = value;
    }

    /**
     * Gets the value of the propgvtmilverify property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTMILVERIFYTypeShape }
     *     
     */
    public PROPGVTMILVERIFYTypeShape getPROPGVTMILVERIFY() {
        return propgvtmilverify;
    }

    /**
     * Sets the value of the propgvtmilverify property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTMILVERIFYTypeShape }
     *     
     */
    public void setPROPGVTMILVERIFY(PROPGVTMILVERIFYTypeShape value) {
        this.propgvtmilverify = value;
    }

    /**
     * Gets the value of the propgvtparnbrlast property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTPARNBRLASTTypeShape }
     *     
     */
    public PROPGVTPARNBRLASTTypeShape getPROPGVTPARNBRLAST() {
        return propgvtparnbrlast;
    }

    /**
     * Sets the value of the propgvtparnbrlast property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTPARNBRLASTTypeShape }
     *     
     */
    public void setPROPGVTPARNBRLAST(PROPGVTPARNBRLASTTypeShape value) {
        this.propgvtparnbrlast = value;
    }

    /**
     * Gets the value of the propgvtunifsvcctr property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTUNIFSVCCTRTypeShape }
     *     
     */
    public PROPGVTUNIFSVCCTRTypeShape getPROPGVTUNIFSVCCTR() {
        return propgvtunifsvcctr;
    }

    /**
     * Sets the value of the propgvtunifsvcctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTUNIFSVCCTRTypeShape }
     *     
     */
    public void setPROPGVTUNIFSVCCTR(PROPGVTUNIFSVCCTRTypeShape value) {
        this.propgvtunifsvcctr = value;
    }

    /**
     * Gets the value of the propgvtvetprefappt property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTVETPREFAPPTTypeShape }
     *     
     */
    public PROPGVTVETPREFAPPTTypeShape getPROPGVTVETPREFAPPT() {
        return propgvtvetprefappt;
    }

    /**
     * Sets the value of the propgvtvetprefappt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTVETPREFAPPTTypeShape }
     *     
     */
    public void setPROPGVTVETPREFAPPT(PROPGVTVETPREFAPPTTypeShape value) {
        this.propgvtvetprefappt = value;
    }

    /**
     * Gets the value of the propgvtvetprefrif property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTVETPREFRIFTypeShape }
     *     
     */
    public PROPGVTVETPREFRIFTypeShape getPROPGVTVETPREFRIF() {
        return propgvtvetprefrif;
    }

    /**
     * Sets the value of the propgvtvetprefrif property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTVETPREFRIFTypeShape }
     *     
     */
    public void setPROPGVTVETPREFRIF(PROPGVTVETPREFRIFTypeShape value) {
        this.propgvtvetprefrif = value;
    }

    /**
     * Gets the value of the propgvtchangeflag property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTCHANGEFLAGTypeShape }
     *     
     */
    public PROPGVTCHANGEFLAGTypeShape getPROPGVTCHANGEFLAG() {
        return propgvtchangeflag;
    }

    /**
     * Sets the value of the propgvtchangeflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTCHANGEFLAGTypeShape }
     *     
     */
    public void setPROPGVTCHANGEFLAG(PROPGVTCHANGEFLAGTypeShape value) {
        this.propgvtchangeflag = value;
    }

    /**
     * Gets the value of the propgvtdraftstatus property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTDRAFTSTATUSTypeShape }
     *     
     */
    public PROPGVTDRAFTSTATUSTypeShape getPROPGVTDRAFTSTATUS() {
        return propgvtdraftstatus;
    }

    /**
     * Sets the value of the propgvtdraftstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTDRAFTSTATUSTypeShape }
     *     
     */
    public void setPROPGVTDRAFTSTATUS(PROPGVTDRAFTSTATUSTypeShape value) {
        this.propgvtdraftstatus = value;
    }

    /**
     * Gets the value of the propgvtyrattained property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTYRATTAINEDTypeShape }
     *     
     */
    public PROPGVTYRATTAINEDTypeShape getPROPGVTYRATTAINED() {
        return propgvtyrattained;
    }

    /**
     * Sets the value of the propgvtyrattained property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTYRATTAINEDTypeShape }
     *     
     */
    public void setPROPGVTYRATTAINED(PROPGVTYRATTAINEDTypeShape value) {
        this.propgvtyrattained = value;
    }

    /**
     * Gets the value of the propdisabledvet property.
     * 
     * @return
     *     possible object is
     *     {@link PROPDISABLEDVETTypeShape }
     *     
     */
    public PROPDISABLEDVETTypeShape getPROPDISABLEDVET() {
        return propdisabledvet;
    }

    /**
     * Sets the value of the propdisabledvet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPDISABLEDVETTypeShape }
     *     
     */
    public void setPROPDISABLEDVET(PROPDISABLEDVETTypeShape value) {
        this.propdisabledvet = value;
    }

    /**
     * Gets the value of the propdisabled property.
     * 
     * @return
     *     possible object is
     *     {@link PROPDISABLEDTypeShape }
     *     
     */
    public PROPDISABLEDTypeShape getPROPDISABLED() {
        return propdisabled;
    }

    /**
     * Sets the value of the propdisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPDISABLEDTypeShape }
     *     
     */
    public void setPROPDISABLED(PROPDISABLEDTypeShape value) {
        this.propdisabled = value;
    }

    /**
     * Gets the value of the propgvtdisabilitycd property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTDISABILITYCDTypeShape }
     *     
     */
    public PROPGVTDISABILITYCDTypeShape getPROPGVTDISABILITYCD() {
        return propgvtdisabilitycd;
    }

    /**
     * Sets the value of the propgvtdisabilitycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTDISABILITYCDTypeShape }
     *     
     */
    public void setPROPGVTDISABILITYCD(PROPGVTDISABILITYCDTypeShape value) {
        this.propgvtdisabilitycd = value;
    }

    /**
     * Gets the value of the propgrade property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGRADETypeShape }
     *     
     */
    public PROPGRADETypeShape getPROPGRADE() {
        return propgrade;
    }

    /**
     * Sets the value of the propgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGRADETypeShape }
     *     
     */
    public void setPROPGRADE(PROPGRADETypeShape value) {
        this.propgrade = value;
    }

    /**
     * Gets the value of the propsaladminplan property.
     * 
     * @return
     *     possible object is
     *     {@link PROPSALADMINPLANTypeShape }
     *     
     */
    public PROPSALADMINPLANTypeShape getPROPSALADMINPLAN() {
        return propsaladminplan;
    }

    /**
     * Sets the value of the propsaladminplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPSALADMINPLANTypeShape }
     *     
     */
    public void setPROPSALADMINPLAN(PROPSALADMINPLANTypeShape value) {
        this.propsaladminplan = value;
    }

    /**
     * Gets the value of the propgvtcurragcyempl property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTCURRAGCYEMPLTypeShape }
     *     
     */
    public PROPGVTCURRAGCYEMPLTypeShape getPROPGVTCURRAGCYEMPL() {
        return propgvtcurragcyempl;
    }

    /**
     * Sets the value of the propgvtcurragcyempl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTCURRAGCYEMPLTypeShape }
     *     
     */
    public void setPROPGVTCURRAGCYEMPL(PROPGVTCURRAGCYEMPLTypeShape value) {
        this.propgvtcurragcyempl = value;
    }

    /**
     * Gets the value of the propgvtcurrfedempl property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTCURRFEDEMPLTypeShape }
     *     
     */
    public PROPGVTCURRFEDEMPLTypeShape getPROPGVTCURRFEDEMPL() {
        return propgvtcurrfedempl;
    }

    /**
     * Sets the value of the propgvtcurrfedempl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTCURRFEDEMPLTypeShape }
     *     
     */
    public void setPROPGVTCURRFEDEMPL(PROPGVTCURRFEDEMPLTypeShape value) {
        this.propgvtcurrfedempl = value;
    }

    /**
     * Gets the value of the propgvthighpayplan property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTHIGHPAYPLANTypeShape }
     *     
     */
    public PROPGVTHIGHPAYPLANTypeShape getPROPGVTHIGHPAYPLAN() {
        return propgvthighpayplan;
    }

    /**
     * Sets the value of the propgvthighpayplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTHIGHPAYPLANTypeShape }
     *     
     */
    public void setPROPGVTHIGHPAYPLAN(PROPGVTHIGHPAYPLANTypeShape value) {
        this.propgvthighpayplan = value;
    }

    /**
     * Gets the value of the propgvthighgrade property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTHIGHGRADETypeShape }
     *     
     */
    public PROPGVTHIGHGRADETypeShape getPROPGVTHIGHGRADE() {
        return propgvthighgrade;
    }

    /**
     * Sets the value of the propgvthighgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTHIGHGRADETypeShape }
     *     
     */
    public void setPROPGVTHIGHGRADE(PROPGVTHIGHGRADETypeShape value) {
        this.propgvthighgrade = value;
    }

    /**
     * Gets the value of the propgvtprevagcyempl property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTPREVAGCYEMPLTypeShape }
     *     
     */
    public PROPGVTPREVAGCYEMPLTypeShape getPROPGVTPREVAGCYEMPL() {
        return propgvtprevagcyempl;
    }

    /**
     * Sets the value of the propgvtprevagcyempl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTPREVAGCYEMPLTypeShape }
     *     
     */
    public void setPROPGVTPREVAGCYEMPL(PROPGVTPREVAGCYEMPLTypeShape value) {
        this.propgvtprevagcyempl = value;
    }

    /**
     * Gets the value of the propgvtprevfedempl property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTPREVFEDEMPLTypeShape }
     *     
     */
    public PROPGVTPREVFEDEMPLTypeShape getPROPGVTPREVFEDEMPL() {
        return propgvtprevfedempl;
    }

    /**
     * Sets the value of the propgvtprevfedempl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTPREVFEDEMPLTypeShape }
     *     
     */
    public void setPROPGVTPREVFEDEMPL(PROPGVTPREVFEDEMPLTypeShape value) {
        this.propgvtprevfedempl = value;
    }

    /**
     * Gets the value of the propgvtsepincentive property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTSEPINCENTIVETypeShape }
     *     
     */
    public PROPGVTSEPINCENTIVETypeShape getPROPGVTSEPINCENTIVE() {
        return propgvtsepincentive;
    }

    /**
     * Sets the value of the propgvtsepincentive property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTSEPINCENTIVETypeShape }
     *     
     */
    public void setPROPGVTSEPINCENTIVE(PROPGVTSEPINCENTIVETypeShape value) {
        this.propgvtsepincentive = value;
    }

    /**
     * Gets the value of the propgvtsepincentdt property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTSEPINCENTDTTypeShape }
     *     
     */
    public PROPGVTSEPINCENTDTTypeShape getPROPGVTSEPINCENTDT() {
        return propgvtsepincentdt;
    }

    /**
     * Sets the value of the propgvtsepincentdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTSEPINCENTDTTypeShape }
     *     
     */
    public void setPROPGVTSEPINCENTDT(PROPGVTSEPINCENTDTTypeShape value) {
        this.propgvtsepincentdt = value;
    }

    /**
     * Gets the value of the propgvttenure property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTTENURETypeShape }
     *     
     */
    public PROPGVTTENURETypeShape getPROPGVTTENURE() {
        return propgvttenure;
    }

    /**
     * Sets the value of the propgvttenure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTTENURETypeShape }
     *     
     */
    public void setPROPGVTTENURE(PROPGVTTENURETypeShape value) {
        this.propgvttenure = value;
    }

    /**
     * Gets the value of the propgvtpayplan property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGVTPAYPLANTypeShape }
     *     
     */
    public PROPGVTPAYPLANTypeShape getPROPGVTPAYPLAN() {
        return propgvtpayplan;
    }

    /**
     * Sets the value of the propgvtpayplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGVTPAYPLANTypeShape }
     *     
     */
    public void setPROPGVTPAYPLAN(PROPGVTPAYPLANTypeShape value) {
        this.propgvtpayplan = value;
    }

    /**
     * Gets the value of the propbargunit property.
     * 
     * @return
     *     possible object is
     *     {@link PROPBARGUNITTypeShape }
     *     
     */
    public PROPBARGUNITTypeShape getPROPBARGUNIT() {
        return propbargunit;
    }

    /**
     * Sets the value of the propbargunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPBARGUNITTypeShape }
     *     
     */
    public void setPROPBARGUNIT(PROPBARGUNITTypeShape value) {
        this.propbargunit = value;
    }

}
