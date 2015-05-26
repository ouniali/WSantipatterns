
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Updatedata__CompIntfc__CI_PERSONAL_DATATypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Updatedata__CompIntfc__CI_PERSONAL_DATATypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EMPLID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_EMPLIDTypeShape"/>
 *         &lt;element name="PROP_BIRTHDATE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_BIRTHDATETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_BIRTHPLACE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_BIRTHPLACETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_BIRTHCOUNTRY" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_BIRTHCOUNTRYTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_BIRTHSTATE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_BIRTHSTATETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_DT_OF_DEATH" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_DT_OF_DEATHTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_DERIVED_EMP" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_DERIVED_EMPTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_DERIVED_CWR" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_DERIVED_CWRTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_DERIVED_POI" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_DERIVED_POITypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_POI_TYPE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_POI_TYPETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_WAIVE_DATA_PROTECT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_WAIVE_DATA_PROTECTTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_CAN_ABORIGINAL" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_CAN_ABORIGINALTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_CAN_VISBL_MINORITY" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_CAN_VISBL_MINORITYTypeShape"/>
 *         &lt;element name="PROP_ETHNIC_GRP_CD_UK" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ETHNIC_GRP_CD_UKTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NI_COMMUNITY_BG" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NI_COMMUNITY_BGTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NI_CB_DET_METHOD" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NI_CB_DET_METHODTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NI_CB_DET_DATE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NI_CB_DET_DATETypeShape" minOccurs="0"/>
 *         &lt;element name="EXP_RETIRE_DT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}EXP_RETIRE_DTTypeShape" minOccurs="0"/>
 *         &lt;element name="COLL_NAME_TYPE_VW" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_NAME_TYPE_VWComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_DATA_EFFDTComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_NID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_NIDComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_ADDRESS_TYPE_VW" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_ADDRESS_TYPE_VWComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERSONAL_PHONE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERSONAL_PHONEComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_EMAIL_ADDRESSES" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_EMAIL_ADDRESSESComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERSON_IMCHAT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERSON_IMCHATComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_DIVERS_ETHNIC" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_DIVERS_ETHNICComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_DIVERS_RELIGION" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_DIVERS_RELIGIONComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERSON_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERSON_BRAComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_DATA_BRAComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_CAN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_DATA_CANComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_SMOKER" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_SMOKERComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_CHE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_DATA_CHEComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PLACE_ORIG_CHE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PLACE_ORIG_CHEComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_HUKOU_CHN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_HUKOU_CHNComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_WRKLIF_CHN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_WRKLIF_CHNComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_WRKLV_CHN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_WRKLV_CHNComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_POLITY_CHN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_POLITY_CHNComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_NATIVE_CHN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_NATIVE_CHNComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_DEU" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_DATA_DEUComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_NATIONALITY_GER" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_NATIONALITY_GERComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_ESP" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_DATA_ESPComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERSON_FRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERSON_FRAComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_FRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_DATA_FRAComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_IND" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_DATA_INDComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_ITA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_DATA_ITAComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_JPN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_DATA_JPNComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_MEX" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_DATA_MEXComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_USA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}COLL_PERS_DATA_USAComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Updatedata__CompIntfc__CI_PERSONAL_DATATypeShape", propOrder = {
    "keypropemplid",
    "propbirthdate",
    "propbirthplace",
    "propbirthcountry",
    "propbirthstate",
    "propdtofdeath",
    "propderivedemp",
    "propderivedcwr",
    "propderivedpoi",
    "proppoitype",
    "propwaivedataprotect",
    "propcanaboriginal",
    "propcanvisblminority",
    "propethnicgrpcduk",
    "propnicommunitybg",
    "propnicbdetmethod",
    "propnicbdetdate",
    "expretiredt",
    "collnametypevw",
    "collpersdataeffdt",
    "collpersnid",
    "colladdresstypevw",
    "collpersonalphone",
    "collemailaddresses",
    "collpersonimchat",
    "colldiversethnic",
    "colldiversreligion",
    "collpersonbra",
    "collpersdatabra",
    "collpersdatacan",
    "collperssmoker",
    "collpersdatache",
    "collplaceorigche",
    "collpershukouchn",
    "collperswrklifchn",
    "collperswrklvchn",
    "collperspolitychn",
    "collpersnativechn",
    "collpersdatadeu",
    "collnationalityger",
    "collpersdataesp",
    "collpersonfra",
    "collpersdatafra",
    "collpersdataind",
    "collpersdataita",
    "collpersdatajpn",
    "collpersdatamex",
    "collpersdatausa"
})
public class UpdatedataCompIntfcCIPERSONALDATATypeShape {

    @XmlElement(name = "KEYPROP_EMPLID", required = true)
    protected KEYPROPEMPLIDTypeShape keypropemplid;
    @XmlElement(name = "PROP_BIRTHDATE")
    protected PROPBIRTHDATETypeShape propbirthdate;
    @XmlElement(name = "PROP_BIRTHPLACE")
    protected PROPBIRTHPLACETypeShape propbirthplace;
    @XmlElement(name = "PROP_BIRTHCOUNTRY")
    protected PROPBIRTHCOUNTRYTypeShape propbirthcountry;
    @XmlElement(name = "PROP_BIRTHSTATE")
    protected PROPBIRTHSTATETypeShape propbirthstate;
    @XmlElement(name = "PROP_DT_OF_DEATH")
    protected PROPDTOFDEATHTypeShape propdtofdeath;
    @XmlElement(name = "PROP_DERIVED_EMP")
    protected PROPDERIVEDEMPTypeShape propderivedemp;
    @XmlElement(name = "PROP_DERIVED_CWR")
    protected PROPDERIVEDCWRTypeShape propderivedcwr;
    @XmlElement(name = "PROP_DERIVED_POI")
    protected PROPDERIVEDPOITypeShape propderivedpoi;
    @XmlElement(name = "PROP_POI_TYPE")
    protected PROPPOITYPETypeShape proppoitype;
    @XmlElement(name = "PROP_WAIVE_DATA_PROTECT")
    protected PROPWAIVEDATAPROTECTTypeShape propwaivedataprotect;
    @XmlElement(name = "PROP_CAN_ABORIGINAL")
    protected PROPCANABORIGINALTypeShape propcanaboriginal;
    @XmlElement(name = "PROP_CAN_VISBL_MINORITY", required = true)
    protected PROPCANVISBLMINORITYTypeShape propcanvisblminority;
    @XmlElement(name = "PROP_ETHNIC_GRP_CD_UK")
    protected PROPETHNICGRPCDUKTypeShape propethnicgrpcduk;
    @XmlElement(name = "PROP_NI_COMMUNITY_BG")
    protected PROPNICOMMUNITYBGTypeShape propnicommunitybg;
    @XmlElement(name = "PROP_NI_CB_DET_METHOD")
    protected PROPNICBDETMETHODTypeShape propnicbdetmethod;
    @XmlElement(name = "PROP_NI_CB_DET_DATE")
    protected PROPNICBDETDATETypeShape propnicbdetdate;
    @XmlElement(name = "EXP_RETIRE_DT")
    protected EXPRETIREDTTypeShape expretiredt;
    @XmlElement(name = "COLL_NAME_TYPE_VW")
    protected List<COLLNAMETYPEVWComplexTypeShape> collnametypevw;
    @XmlElement(name = "COLL_PERS_DATA_EFFDT")
    protected List<COLLPERSDATAEFFDTComplexTypeShape> collpersdataeffdt;
    @XmlElement(name = "COLL_PERS_NID")
    protected List<COLLPERSNIDComplexTypeShape> collpersnid;
    @XmlElement(name = "COLL_ADDRESS_TYPE_VW")
    protected List<COLLADDRESSTYPEVWComplexTypeShape> colladdresstypevw;
    @XmlElement(name = "COLL_PERSONAL_PHONE")
    protected List<COLLPERSONALPHONEComplexTypeShape> collpersonalphone;
    @XmlElement(name = "COLL_EMAIL_ADDRESSES")
    protected List<COLLEMAILADDRESSESComplexTypeShape> collemailaddresses;
    @XmlElement(name = "COLL_PERSON_IMCHAT")
    protected List<COLLPERSONIMCHATComplexTypeShape> collpersonimchat;
    @XmlElement(name = "COLL_DIVERS_ETHNIC")
    protected List<COLLDIVERSETHNICComplexTypeShape> colldiversethnic;
    @XmlElement(name = "COLL_DIVERS_RELIGION")
    protected List<COLLDIVERSRELIGIONComplexTypeShape> colldiversreligion;
    @XmlElement(name = "COLL_PERSON_BRA")
    protected List<COLLPERSONBRAComplexTypeShape> collpersonbra;
    @XmlElement(name = "COLL_PERS_DATA_BRA")
    protected List<COLLPERSDATABRAComplexTypeShape> collpersdatabra;
    @XmlElement(name = "COLL_PERS_DATA_CAN")
    protected List<COLLPERSDATACANComplexTypeShape> collpersdatacan;
    @XmlElement(name = "COLL_PERS_SMOKER")
    protected List<COLLPERSSMOKERComplexTypeShape> collperssmoker;
    @XmlElement(name = "COLL_PERS_DATA_CHE")
    protected List<COLLPERSDATACHEComplexTypeShape> collpersdatache;
    @XmlElement(name = "COLL_PLACE_ORIG_CHE")
    protected List<COLLPLACEORIGCHEComplexTypeShape> collplaceorigche;
    @XmlElement(name = "COLL_PERS_HUKOU_CHN")
    protected List<COLLPERSHUKOUCHNComplexTypeShape> collpershukouchn;
    @XmlElement(name = "COLL_PERS_WRKLIF_CHN")
    protected List<COLLPERSWRKLIFCHNComplexTypeShape> collperswrklifchn;
    @XmlElement(name = "COLL_PERS_WRKLV_CHN")
    protected List<COLLPERSWRKLVCHNComplexTypeShape> collperswrklvchn;
    @XmlElement(name = "COLL_PERS_POLITY_CHN")
    protected List<COLLPERSPOLITYCHNComplexTypeShape> collperspolitychn;
    @XmlElement(name = "COLL_PERS_NATIVE_CHN")
    protected List<COLLPERSNATIVECHNComplexTypeShape> collpersnativechn;
    @XmlElement(name = "COLL_PERS_DATA_DEU")
    protected List<COLLPERSDATADEUComplexTypeShape> collpersdatadeu;
    @XmlElement(name = "COLL_NATIONALITY_GER")
    protected List<COLLNATIONALITYGERComplexTypeShape> collnationalityger;
    @XmlElement(name = "COLL_PERS_DATA_ESP")
    protected List<COLLPERSDATAESPComplexTypeShape> collpersdataesp;
    @XmlElement(name = "COLL_PERSON_FRA")
    protected List<COLLPERSONFRAComplexTypeShape> collpersonfra;
    @XmlElement(name = "COLL_PERS_DATA_FRA")
    protected List<COLLPERSDATAFRAComplexTypeShape> collpersdatafra;
    @XmlElement(name = "COLL_PERS_DATA_IND")
    protected List<COLLPERSDATAINDComplexTypeShape> collpersdataind;
    @XmlElement(name = "COLL_PERS_DATA_ITA")
    protected List<COLLPERSDATAITAComplexTypeShape> collpersdataita;
    @XmlElement(name = "COLL_PERS_DATA_JPN")
    protected List<COLLPERSDATAJPNComplexTypeShape> collpersdatajpn;
    @XmlElement(name = "COLL_PERS_DATA_MEX")
    protected List<COLLPERSDATAMEXComplexTypeShape> collpersdatamex;
    @XmlElement(name = "COLL_PERS_DATA_USA")
    protected List<COLLPERSDATAUSAComplexTypeShape> collpersdatausa;

    /**
     * Gets the value of the keypropemplid property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPEMPLIDTypeShape }
     *     
     */
    public KEYPROPEMPLIDTypeShape getKEYPROPEMPLID() {
        return keypropemplid;
    }

    /**
     * Sets the value of the keypropemplid property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPEMPLIDTypeShape }
     *     
     */
    public void setKEYPROPEMPLID(KEYPROPEMPLIDTypeShape value) {
        this.keypropemplid = value;
    }

    /**
     * Gets the value of the propbirthdate property.
     * 
     * @return
     *     possible object is
     *     {@link PROPBIRTHDATETypeShape }
     *     
     */
    public PROPBIRTHDATETypeShape getPROPBIRTHDATE() {
        return propbirthdate;
    }

    /**
     * Sets the value of the propbirthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPBIRTHDATETypeShape }
     *     
     */
    public void setPROPBIRTHDATE(PROPBIRTHDATETypeShape value) {
        this.propbirthdate = value;
    }

    /**
     * Gets the value of the propbirthplace property.
     * 
     * @return
     *     possible object is
     *     {@link PROPBIRTHPLACETypeShape }
     *     
     */
    public PROPBIRTHPLACETypeShape getPROPBIRTHPLACE() {
        return propbirthplace;
    }

    /**
     * Sets the value of the propbirthplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPBIRTHPLACETypeShape }
     *     
     */
    public void setPROPBIRTHPLACE(PROPBIRTHPLACETypeShape value) {
        this.propbirthplace = value;
    }

    /**
     * Gets the value of the propbirthcountry property.
     * 
     * @return
     *     possible object is
     *     {@link PROPBIRTHCOUNTRYTypeShape }
     *     
     */
    public PROPBIRTHCOUNTRYTypeShape getPROPBIRTHCOUNTRY() {
        return propbirthcountry;
    }

    /**
     * Sets the value of the propbirthcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPBIRTHCOUNTRYTypeShape }
     *     
     */
    public void setPROPBIRTHCOUNTRY(PROPBIRTHCOUNTRYTypeShape value) {
        this.propbirthcountry = value;
    }

    /**
     * Gets the value of the propbirthstate property.
     * 
     * @return
     *     possible object is
     *     {@link PROPBIRTHSTATETypeShape }
     *     
     */
    public PROPBIRTHSTATETypeShape getPROPBIRTHSTATE() {
        return propbirthstate;
    }

    /**
     * Sets the value of the propbirthstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPBIRTHSTATETypeShape }
     *     
     */
    public void setPROPBIRTHSTATE(PROPBIRTHSTATETypeShape value) {
        this.propbirthstate = value;
    }

    /**
     * Gets the value of the propdtofdeath property.
     * 
     * @return
     *     possible object is
     *     {@link PROPDTOFDEATHTypeShape }
     *     
     */
    public PROPDTOFDEATHTypeShape getPROPDTOFDEATH() {
        return propdtofdeath;
    }

    /**
     * Sets the value of the propdtofdeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPDTOFDEATHTypeShape }
     *     
     */
    public void setPROPDTOFDEATH(PROPDTOFDEATHTypeShape value) {
        this.propdtofdeath = value;
    }

    /**
     * Gets the value of the propderivedemp property.
     * 
     * @return
     *     possible object is
     *     {@link PROPDERIVEDEMPTypeShape }
     *     
     */
    public PROPDERIVEDEMPTypeShape getPROPDERIVEDEMP() {
        return propderivedemp;
    }

    /**
     * Sets the value of the propderivedemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPDERIVEDEMPTypeShape }
     *     
     */
    public void setPROPDERIVEDEMP(PROPDERIVEDEMPTypeShape value) {
        this.propderivedemp = value;
    }

    /**
     * Gets the value of the propderivedcwr property.
     * 
     * @return
     *     possible object is
     *     {@link PROPDERIVEDCWRTypeShape }
     *     
     */
    public PROPDERIVEDCWRTypeShape getPROPDERIVEDCWR() {
        return propderivedcwr;
    }

    /**
     * Sets the value of the propderivedcwr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPDERIVEDCWRTypeShape }
     *     
     */
    public void setPROPDERIVEDCWR(PROPDERIVEDCWRTypeShape value) {
        this.propderivedcwr = value;
    }

    /**
     * Gets the value of the propderivedpoi property.
     * 
     * @return
     *     possible object is
     *     {@link PROPDERIVEDPOITypeShape }
     *     
     */
    public PROPDERIVEDPOITypeShape getPROPDERIVEDPOI() {
        return propderivedpoi;
    }

    /**
     * Sets the value of the propderivedpoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPDERIVEDPOITypeShape }
     *     
     */
    public void setPROPDERIVEDPOI(PROPDERIVEDPOITypeShape value) {
        this.propderivedpoi = value;
    }

    /**
     * Gets the value of the proppoitype property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPOITYPETypeShape }
     *     
     */
    public PROPPOITYPETypeShape getPROPPOITYPE() {
        return proppoitype;
    }

    /**
     * Sets the value of the proppoitype property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPOITYPETypeShape }
     *     
     */
    public void setPROPPOITYPE(PROPPOITYPETypeShape value) {
        this.proppoitype = value;
    }

    /**
     * Gets the value of the propwaivedataprotect property.
     * 
     * @return
     *     possible object is
     *     {@link PROPWAIVEDATAPROTECTTypeShape }
     *     
     */
    public PROPWAIVEDATAPROTECTTypeShape getPROPWAIVEDATAPROTECT() {
        return propwaivedataprotect;
    }

    /**
     * Sets the value of the propwaivedataprotect property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPWAIVEDATAPROTECTTypeShape }
     *     
     */
    public void setPROPWAIVEDATAPROTECT(PROPWAIVEDATAPROTECTTypeShape value) {
        this.propwaivedataprotect = value;
    }

    /**
     * Gets the value of the propcanaboriginal property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCANABORIGINALTypeShape }
     *     
     */
    public PROPCANABORIGINALTypeShape getPROPCANABORIGINAL() {
        return propcanaboriginal;
    }

    /**
     * Sets the value of the propcanaboriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCANABORIGINALTypeShape }
     *     
     */
    public void setPROPCANABORIGINAL(PROPCANABORIGINALTypeShape value) {
        this.propcanaboriginal = value;
    }

    /**
     * Gets the value of the propcanvisblminority property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCANVISBLMINORITYTypeShape }
     *     
     */
    public PROPCANVISBLMINORITYTypeShape getPROPCANVISBLMINORITY() {
        return propcanvisblminority;
    }

    /**
     * Sets the value of the propcanvisblminority property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCANVISBLMINORITYTypeShape }
     *     
     */
    public void setPROPCANVISBLMINORITY(PROPCANVISBLMINORITYTypeShape value) {
        this.propcanvisblminority = value;
    }

    /**
     * Gets the value of the propethnicgrpcduk property.
     * 
     * @return
     *     possible object is
     *     {@link PROPETHNICGRPCDUKTypeShape }
     *     
     */
    public PROPETHNICGRPCDUKTypeShape getPROPETHNICGRPCDUK() {
        return propethnicgrpcduk;
    }

    /**
     * Sets the value of the propethnicgrpcduk property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPETHNICGRPCDUKTypeShape }
     *     
     */
    public void setPROPETHNICGRPCDUK(PROPETHNICGRPCDUKTypeShape value) {
        this.propethnicgrpcduk = value;
    }

    /**
     * Gets the value of the propnicommunitybg property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNICOMMUNITYBGTypeShape }
     *     
     */
    public PROPNICOMMUNITYBGTypeShape getPROPNICOMMUNITYBG() {
        return propnicommunitybg;
    }

    /**
     * Sets the value of the propnicommunitybg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNICOMMUNITYBGTypeShape }
     *     
     */
    public void setPROPNICOMMUNITYBG(PROPNICOMMUNITYBGTypeShape value) {
        this.propnicommunitybg = value;
    }

    /**
     * Gets the value of the propnicbdetmethod property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNICBDETMETHODTypeShape }
     *     
     */
    public PROPNICBDETMETHODTypeShape getPROPNICBDETMETHOD() {
        return propnicbdetmethod;
    }

    /**
     * Sets the value of the propnicbdetmethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNICBDETMETHODTypeShape }
     *     
     */
    public void setPROPNICBDETMETHOD(PROPNICBDETMETHODTypeShape value) {
        this.propnicbdetmethod = value;
    }

    /**
     * Gets the value of the propnicbdetdate property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNICBDETDATETypeShape }
     *     
     */
    public PROPNICBDETDATETypeShape getPROPNICBDETDATE() {
        return propnicbdetdate;
    }

    /**
     * Sets the value of the propnicbdetdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNICBDETDATETypeShape }
     *     
     */
    public void setPROPNICBDETDATE(PROPNICBDETDATETypeShape value) {
        this.propnicbdetdate = value;
    }

    /**
     * Gets the value of the expretiredt property.
     * 
     * @return
     *     possible object is
     *     {@link EXPRETIREDTTypeShape }
     *     
     */
    public EXPRETIREDTTypeShape getEXPRETIREDT() {
        return expretiredt;
    }

    /**
     * Sets the value of the expretiredt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPRETIREDTTypeShape }
     *     
     */
    public void setEXPRETIREDT(EXPRETIREDTTypeShape value) {
        this.expretiredt = value;
    }

    /**
     * Gets the value of the collnametypevw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collnametypevw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLNAMETYPEVW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLNAMETYPEVWComplexTypeShape }
     * 
     * 
     */
    public List<COLLNAMETYPEVWComplexTypeShape> getCOLLNAMETYPEVW() {
        if (collnametypevw == null) {
            collnametypevw = new ArrayList<COLLNAMETYPEVWComplexTypeShape>();
        }
        return this.collnametypevw;
    }

    /**
     * Gets the value of the collpersdataeffdt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdataeffdt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATAEFFDT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATAEFFDTComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATAEFFDTComplexTypeShape> getCOLLPERSDATAEFFDT() {
        if (collpersdataeffdt == null) {
            collpersdataeffdt = new ArrayList<COLLPERSDATAEFFDTComplexTypeShape>();
        }
        return this.collpersdataeffdt;
    }

    /**
     * Gets the value of the collpersnid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersnid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSNID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSNIDComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSNIDComplexTypeShape> getCOLLPERSNID() {
        if (collpersnid == null) {
            collpersnid = new ArrayList<COLLPERSNIDComplexTypeShape>();
        }
        return this.collpersnid;
    }

    /**
     * Gets the value of the colladdresstypevw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colladdresstypevw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLADDRESSTYPEVW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLADDRESSTYPEVWComplexTypeShape }
     * 
     * 
     */
    public List<COLLADDRESSTYPEVWComplexTypeShape> getCOLLADDRESSTYPEVW() {
        if (colladdresstypevw == null) {
            colladdresstypevw = new ArrayList<COLLADDRESSTYPEVWComplexTypeShape>();
        }
        return this.colladdresstypevw;
    }

    /**
     * Gets the value of the collpersonalphone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersonalphone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSONALPHONE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSONALPHONEComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSONALPHONEComplexTypeShape> getCOLLPERSONALPHONE() {
        if (collpersonalphone == null) {
            collpersonalphone = new ArrayList<COLLPERSONALPHONEComplexTypeShape>();
        }
        return this.collpersonalphone;
    }

    /**
     * Gets the value of the collemailaddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collemailaddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLEMAILADDRESSES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLEMAILADDRESSESComplexTypeShape }
     * 
     * 
     */
    public List<COLLEMAILADDRESSESComplexTypeShape> getCOLLEMAILADDRESSES() {
        if (collemailaddresses == null) {
            collemailaddresses = new ArrayList<COLLEMAILADDRESSESComplexTypeShape>();
        }
        return this.collemailaddresses;
    }

    /**
     * Gets the value of the collpersonimchat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersonimchat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSONIMCHAT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSONIMCHATComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSONIMCHATComplexTypeShape> getCOLLPERSONIMCHAT() {
        if (collpersonimchat == null) {
            collpersonimchat = new ArrayList<COLLPERSONIMCHATComplexTypeShape>();
        }
        return this.collpersonimchat;
    }

    /**
     * Gets the value of the colldiversethnic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colldiversethnic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLDIVERSETHNIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLDIVERSETHNICComplexTypeShape }
     * 
     * 
     */
    public List<COLLDIVERSETHNICComplexTypeShape> getCOLLDIVERSETHNIC() {
        if (colldiversethnic == null) {
            colldiversethnic = new ArrayList<COLLDIVERSETHNICComplexTypeShape>();
        }
        return this.colldiversethnic;
    }

    /**
     * Gets the value of the colldiversreligion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colldiversreligion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLDIVERSRELIGION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLDIVERSRELIGIONComplexTypeShape }
     * 
     * 
     */
    public List<COLLDIVERSRELIGIONComplexTypeShape> getCOLLDIVERSRELIGION() {
        if (colldiversreligion == null) {
            colldiversreligion = new ArrayList<COLLDIVERSRELIGIONComplexTypeShape>();
        }
        return this.colldiversreligion;
    }

    /**
     * Gets the value of the collpersonbra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersonbra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSONBRA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSONBRAComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSONBRAComplexTypeShape> getCOLLPERSONBRA() {
        if (collpersonbra == null) {
            collpersonbra = new ArrayList<COLLPERSONBRAComplexTypeShape>();
        }
        return this.collpersonbra;
    }

    /**
     * Gets the value of the collpersdatabra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdatabra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATABRA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATABRAComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATABRAComplexTypeShape> getCOLLPERSDATABRA() {
        if (collpersdatabra == null) {
            collpersdatabra = new ArrayList<COLLPERSDATABRAComplexTypeShape>();
        }
        return this.collpersdatabra;
    }

    /**
     * Gets the value of the collpersdatacan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdatacan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATACAN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATACANComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATACANComplexTypeShape> getCOLLPERSDATACAN() {
        if (collpersdatacan == null) {
            collpersdatacan = new ArrayList<COLLPERSDATACANComplexTypeShape>();
        }
        return this.collpersdatacan;
    }

    /**
     * Gets the value of the collperssmoker property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collperssmoker property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSSMOKER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSSMOKERComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSSMOKERComplexTypeShape> getCOLLPERSSMOKER() {
        if (collperssmoker == null) {
            collperssmoker = new ArrayList<COLLPERSSMOKERComplexTypeShape>();
        }
        return this.collperssmoker;
    }

    /**
     * Gets the value of the collpersdatache property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdatache property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATACHE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATACHEComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATACHEComplexTypeShape> getCOLLPERSDATACHE() {
        if (collpersdatache == null) {
            collpersdatache = new ArrayList<COLLPERSDATACHEComplexTypeShape>();
        }
        return this.collpersdatache;
    }

    /**
     * Gets the value of the collplaceorigche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collplaceorigche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPLACEORIGCHE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPLACEORIGCHEComplexTypeShape }
     * 
     * 
     */
    public List<COLLPLACEORIGCHEComplexTypeShape> getCOLLPLACEORIGCHE() {
        if (collplaceorigche == null) {
            collplaceorigche = new ArrayList<COLLPLACEORIGCHEComplexTypeShape>();
        }
        return this.collplaceorigche;
    }

    /**
     * Gets the value of the collpershukouchn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpershukouchn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSHUKOUCHN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSHUKOUCHNComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSHUKOUCHNComplexTypeShape> getCOLLPERSHUKOUCHN() {
        if (collpershukouchn == null) {
            collpershukouchn = new ArrayList<COLLPERSHUKOUCHNComplexTypeShape>();
        }
        return this.collpershukouchn;
    }

    /**
     * Gets the value of the collperswrklifchn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collperswrklifchn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSWRKLIFCHN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSWRKLIFCHNComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSWRKLIFCHNComplexTypeShape> getCOLLPERSWRKLIFCHN() {
        if (collperswrklifchn == null) {
            collperswrklifchn = new ArrayList<COLLPERSWRKLIFCHNComplexTypeShape>();
        }
        return this.collperswrklifchn;
    }

    /**
     * Gets the value of the collperswrklvchn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collperswrklvchn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSWRKLVCHN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSWRKLVCHNComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSWRKLVCHNComplexTypeShape> getCOLLPERSWRKLVCHN() {
        if (collperswrklvchn == null) {
            collperswrklvchn = new ArrayList<COLLPERSWRKLVCHNComplexTypeShape>();
        }
        return this.collperswrklvchn;
    }

    /**
     * Gets the value of the collperspolitychn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collperspolitychn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSPOLITYCHN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSPOLITYCHNComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSPOLITYCHNComplexTypeShape> getCOLLPERSPOLITYCHN() {
        if (collperspolitychn == null) {
            collperspolitychn = new ArrayList<COLLPERSPOLITYCHNComplexTypeShape>();
        }
        return this.collperspolitychn;
    }

    /**
     * Gets the value of the collpersnativechn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersnativechn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSNATIVECHN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSNATIVECHNComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSNATIVECHNComplexTypeShape> getCOLLPERSNATIVECHN() {
        if (collpersnativechn == null) {
            collpersnativechn = new ArrayList<COLLPERSNATIVECHNComplexTypeShape>();
        }
        return this.collpersnativechn;
    }

    /**
     * Gets the value of the collpersdatadeu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdatadeu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATADEU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATADEUComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATADEUComplexTypeShape> getCOLLPERSDATADEU() {
        if (collpersdatadeu == null) {
            collpersdatadeu = new ArrayList<COLLPERSDATADEUComplexTypeShape>();
        }
        return this.collpersdatadeu;
    }

    /**
     * Gets the value of the collnationalityger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collnationalityger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLNATIONALITYGER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLNATIONALITYGERComplexTypeShape }
     * 
     * 
     */
    public List<COLLNATIONALITYGERComplexTypeShape> getCOLLNATIONALITYGER() {
        if (collnationalityger == null) {
            collnationalityger = new ArrayList<COLLNATIONALITYGERComplexTypeShape>();
        }
        return this.collnationalityger;
    }

    /**
     * Gets the value of the collpersdataesp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdataesp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATAESP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATAESPComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATAESPComplexTypeShape> getCOLLPERSDATAESP() {
        if (collpersdataesp == null) {
            collpersdataesp = new ArrayList<COLLPERSDATAESPComplexTypeShape>();
        }
        return this.collpersdataesp;
    }

    /**
     * Gets the value of the collpersonfra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersonfra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSONFRA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSONFRAComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSONFRAComplexTypeShape> getCOLLPERSONFRA() {
        if (collpersonfra == null) {
            collpersonfra = new ArrayList<COLLPERSONFRAComplexTypeShape>();
        }
        return this.collpersonfra;
    }

    /**
     * Gets the value of the collpersdatafra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdatafra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATAFRA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATAFRAComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATAFRAComplexTypeShape> getCOLLPERSDATAFRA() {
        if (collpersdatafra == null) {
            collpersdatafra = new ArrayList<COLLPERSDATAFRAComplexTypeShape>();
        }
        return this.collpersdatafra;
    }

    /**
     * Gets the value of the collpersdataind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdataind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATAIND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATAINDComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATAINDComplexTypeShape> getCOLLPERSDATAIND() {
        if (collpersdataind == null) {
            collpersdataind = new ArrayList<COLLPERSDATAINDComplexTypeShape>();
        }
        return this.collpersdataind;
    }

    /**
     * Gets the value of the collpersdataita property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdataita property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATAITA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATAITAComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATAITAComplexTypeShape> getCOLLPERSDATAITA() {
        if (collpersdataita == null) {
            collpersdataita = new ArrayList<COLLPERSDATAITAComplexTypeShape>();
        }
        return this.collpersdataita;
    }

    /**
     * Gets the value of the collpersdatajpn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdatajpn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATAJPN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATAJPNComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATAJPNComplexTypeShape> getCOLLPERSDATAJPN() {
        if (collpersdatajpn == null) {
            collpersdatajpn = new ArrayList<COLLPERSDATAJPNComplexTypeShape>();
        }
        return this.collpersdatajpn;
    }

    /**
     * Gets the value of the collpersdatamex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdatamex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATAMEX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATAMEXComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATAMEXComplexTypeShape> getCOLLPERSDATAMEX() {
        if (collpersdatamex == null) {
            collpersdatamex = new ArrayList<COLLPERSDATAMEXComplexTypeShape>();
        }
        return this.collpersdatamex;
    }

    /**
     * Gets the value of the collpersdatausa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdatausa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATAUSA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATAUSAComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATAUSAComplexTypeShape> getCOLLPERSDATAUSA() {
        if (collpersdatausa == null) {
            collpersdatausa = new ArrayList<COLLPERSDATAUSAComplexTypeShape>();
        }
        return this.collpersdatausa;
    }

}
