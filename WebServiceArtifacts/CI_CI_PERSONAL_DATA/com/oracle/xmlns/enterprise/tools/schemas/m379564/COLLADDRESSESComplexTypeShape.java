
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_ADDRESSESComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_ADDRESSESComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_ADDRESS_TYPE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_ADDRESS_TYPETypeShape"/>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_EFF_STATUS" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_EFF_STATUSTypeShape"/>
 *         &lt;element name="PROP_COUNTRY" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_COUNTRYTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_ADDRESS1" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ADDRESS1TypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_ADDRESS2" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ADDRESS2TypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_ADDRESS3" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ADDRESS3TypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_ADDRESS4" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ADDRESS4TypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_CITY" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_CITYTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NUM1" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NUM1TypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NUM2" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NUM2TypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_HOUSE_TYPE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_HOUSE_TYPETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_ADDR_FIELD1" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ADDR_FIELD1TypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_ADDR_FIELD2" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ADDR_FIELD2TypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_ADDR_FIELD3" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ADDR_FIELD3TypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_COUNTY" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_COUNTYTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_STATE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_STATETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_POSTAL" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_POSTALTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_GEO_CODE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_GEO_CODETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_IN_CITY_LIMIT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_IN_CITY_LIMITTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_ADDRESS1_AC" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ADDRESS1_ACTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_ADDRESS2_AC" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ADDRESS2_ACTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_ADDRESS3_AC" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ADDRESS3_ACTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_CITY_AC" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_CITY_ACTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_REG_REGION" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_REG_REGIONTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_ADDRESSESComplexTypeShape", propOrder = {
    "keypropaddresstype",
    "keypropeffdt",
    "propeffstatus",
    "propcountry",
    "propaddress1",
    "propaddress2",
    "propaddress3",
    "propaddress4",
    "propcity",
    "propnum1",
    "propnum2",
    "prophousetype",
    "propaddrfield1",
    "propaddrfield2",
    "propaddrfield3",
    "propcounty",
    "propstate",
    "proppostal",
    "propgeocode",
    "propincitylimit",
    "propaddress1AC",
    "propaddress2AC",
    "propaddress3AC",
    "propcityac",
    "propregregion"
})
public class COLLADDRESSESComplexTypeShape {

    @XmlElement(name = "KEYPROP_ADDRESS_TYPE", required = true)
    protected KEYPROPADDRESSTYPETypeShape keypropaddresstype;
    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_EFF_STATUS", required = true)
    protected PROPEFFSTATUSTypeShape propeffstatus;
    @XmlElement(name = "PROP_COUNTRY")
    protected PROPCOUNTRYTypeShape propcountry;
    @XmlElement(name = "PROP_ADDRESS1")
    protected PROPADDRESS1TypeShape propaddress1;
    @XmlElement(name = "PROP_ADDRESS2")
    protected PROPADDRESS2TypeShape propaddress2;
    @XmlElement(name = "PROP_ADDRESS3")
    protected PROPADDRESS3TypeShape propaddress3;
    @XmlElement(name = "PROP_ADDRESS4")
    protected PROPADDRESS4TypeShape propaddress4;
    @XmlElement(name = "PROP_CITY")
    protected PROPCITYTypeShape propcity;
    @XmlElement(name = "PROP_NUM1")
    protected PROPNUM1TypeShape propnum1;
    @XmlElement(name = "PROP_NUM2")
    protected PROPNUM2TypeShape propnum2;
    @XmlElement(name = "PROP_HOUSE_TYPE")
    protected PROPHOUSETYPETypeShape prophousetype;
    @XmlElement(name = "PROP_ADDR_FIELD1")
    protected PROPADDRFIELD1TypeShape propaddrfield1;
    @XmlElement(name = "PROP_ADDR_FIELD2")
    protected PROPADDRFIELD2TypeShape propaddrfield2;
    @XmlElement(name = "PROP_ADDR_FIELD3")
    protected PROPADDRFIELD3TypeShape propaddrfield3;
    @XmlElement(name = "PROP_COUNTY")
    protected PROPCOUNTYTypeShape propcounty;
    @XmlElement(name = "PROP_STATE")
    protected PROPSTATETypeShape propstate;
    @XmlElement(name = "PROP_POSTAL")
    protected PROPPOSTALTypeShape proppostal;
    @XmlElement(name = "PROP_GEO_CODE")
    protected PROPGEOCODETypeShape propgeocode;
    @XmlElement(name = "PROP_IN_CITY_LIMIT")
    protected PROPINCITYLIMITTypeShape propincitylimit;
    @XmlElement(name = "PROP_ADDRESS1_AC")
    protected PROPADDRESS1ACTypeShape propaddress1AC;
    @XmlElement(name = "PROP_ADDRESS2_AC")
    protected PROPADDRESS2ACTypeShape propaddress2AC;
    @XmlElement(name = "PROP_ADDRESS3_AC")
    protected PROPADDRESS3ACTypeShape propaddress3AC;
    @XmlElement(name = "PROP_CITY_AC")
    protected PROPCITYACTypeShape propcityac;
    @XmlElement(name = "PROP_REG_REGION")
    protected PROPREGREGIONTypeShape propregregion;

    /**
     * Gets the value of the keypropaddresstype property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPADDRESSTYPETypeShape }
     *     
     */
    public KEYPROPADDRESSTYPETypeShape getKEYPROPADDRESSTYPE() {
        return keypropaddresstype;
    }

    /**
     * Sets the value of the keypropaddresstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPADDRESSTYPETypeShape }
     *     
     */
    public void setKEYPROPADDRESSTYPE(KEYPROPADDRESSTYPETypeShape value) {
        this.keypropaddresstype = value;
    }

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
     * Gets the value of the propeffstatus property.
     * 
     * @return
     *     possible object is
     *     {@link PROPEFFSTATUSTypeShape }
     *     
     */
    public PROPEFFSTATUSTypeShape getPROPEFFSTATUS() {
        return propeffstatus;
    }

    /**
     * Sets the value of the propeffstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPEFFSTATUSTypeShape }
     *     
     */
    public void setPROPEFFSTATUS(PROPEFFSTATUSTypeShape value) {
        this.propeffstatus = value;
    }

    /**
     * Gets the value of the propcountry property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCOUNTRYTypeShape }
     *     
     */
    public PROPCOUNTRYTypeShape getPROPCOUNTRY() {
        return propcountry;
    }

    /**
     * Sets the value of the propcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCOUNTRYTypeShape }
     *     
     */
    public void setPROPCOUNTRY(PROPCOUNTRYTypeShape value) {
        this.propcountry = value;
    }

    /**
     * Gets the value of the propaddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link PROPADDRESS1TypeShape }
     *     
     */
    public PROPADDRESS1TypeShape getPROPADDRESS1() {
        return propaddress1;
    }

    /**
     * Sets the value of the propaddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPADDRESS1TypeShape }
     *     
     */
    public void setPROPADDRESS1(PROPADDRESS1TypeShape value) {
        this.propaddress1 = value;
    }

    /**
     * Gets the value of the propaddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link PROPADDRESS2TypeShape }
     *     
     */
    public PROPADDRESS2TypeShape getPROPADDRESS2() {
        return propaddress2;
    }

    /**
     * Sets the value of the propaddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPADDRESS2TypeShape }
     *     
     */
    public void setPROPADDRESS2(PROPADDRESS2TypeShape value) {
        this.propaddress2 = value;
    }

    /**
     * Gets the value of the propaddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link PROPADDRESS3TypeShape }
     *     
     */
    public PROPADDRESS3TypeShape getPROPADDRESS3() {
        return propaddress3;
    }

    /**
     * Sets the value of the propaddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPADDRESS3TypeShape }
     *     
     */
    public void setPROPADDRESS3(PROPADDRESS3TypeShape value) {
        this.propaddress3 = value;
    }

    /**
     * Gets the value of the propaddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link PROPADDRESS4TypeShape }
     *     
     */
    public PROPADDRESS4TypeShape getPROPADDRESS4() {
        return propaddress4;
    }

    /**
     * Sets the value of the propaddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPADDRESS4TypeShape }
     *     
     */
    public void setPROPADDRESS4(PROPADDRESS4TypeShape value) {
        this.propaddress4 = value;
    }

    /**
     * Gets the value of the propcity property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCITYTypeShape }
     *     
     */
    public PROPCITYTypeShape getPROPCITY() {
        return propcity;
    }

    /**
     * Sets the value of the propcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCITYTypeShape }
     *     
     */
    public void setPROPCITY(PROPCITYTypeShape value) {
        this.propcity = value;
    }

    /**
     * Gets the value of the propnum1 property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNUM1TypeShape }
     *     
     */
    public PROPNUM1TypeShape getPROPNUM1() {
        return propnum1;
    }

    /**
     * Sets the value of the propnum1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNUM1TypeShape }
     *     
     */
    public void setPROPNUM1(PROPNUM1TypeShape value) {
        this.propnum1 = value;
    }

    /**
     * Gets the value of the propnum2 property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNUM2TypeShape }
     *     
     */
    public PROPNUM2TypeShape getPROPNUM2() {
        return propnum2;
    }

    /**
     * Sets the value of the propnum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNUM2TypeShape }
     *     
     */
    public void setPROPNUM2(PROPNUM2TypeShape value) {
        this.propnum2 = value;
    }

    /**
     * Gets the value of the prophousetype property.
     * 
     * @return
     *     possible object is
     *     {@link PROPHOUSETYPETypeShape }
     *     
     */
    public PROPHOUSETYPETypeShape getPROPHOUSETYPE() {
        return prophousetype;
    }

    /**
     * Sets the value of the prophousetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPHOUSETYPETypeShape }
     *     
     */
    public void setPROPHOUSETYPE(PROPHOUSETYPETypeShape value) {
        this.prophousetype = value;
    }

    /**
     * Gets the value of the propaddrfield1 property.
     * 
     * @return
     *     possible object is
     *     {@link PROPADDRFIELD1TypeShape }
     *     
     */
    public PROPADDRFIELD1TypeShape getPROPADDRFIELD1() {
        return propaddrfield1;
    }

    /**
     * Sets the value of the propaddrfield1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPADDRFIELD1TypeShape }
     *     
     */
    public void setPROPADDRFIELD1(PROPADDRFIELD1TypeShape value) {
        this.propaddrfield1 = value;
    }

    /**
     * Gets the value of the propaddrfield2 property.
     * 
     * @return
     *     possible object is
     *     {@link PROPADDRFIELD2TypeShape }
     *     
     */
    public PROPADDRFIELD2TypeShape getPROPADDRFIELD2() {
        return propaddrfield2;
    }

    /**
     * Sets the value of the propaddrfield2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPADDRFIELD2TypeShape }
     *     
     */
    public void setPROPADDRFIELD2(PROPADDRFIELD2TypeShape value) {
        this.propaddrfield2 = value;
    }

    /**
     * Gets the value of the propaddrfield3 property.
     * 
     * @return
     *     possible object is
     *     {@link PROPADDRFIELD3TypeShape }
     *     
     */
    public PROPADDRFIELD3TypeShape getPROPADDRFIELD3() {
        return propaddrfield3;
    }

    /**
     * Sets the value of the propaddrfield3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPADDRFIELD3TypeShape }
     *     
     */
    public void setPROPADDRFIELD3(PROPADDRFIELD3TypeShape value) {
        this.propaddrfield3 = value;
    }

    /**
     * Gets the value of the propcounty property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCOUNTYTypeShape }
     *     
     */
    public PROPCOUNTYTypeShape getPROPCOUNTY() {
        return propcounty;
    }

    /**
     * Sets the value of the propcounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCOUNTYTypeShape }
     *     
     */
    public void setPROPCOUNTY(PROPCOUNTYTypeShape value) {
        this.propcounty = value;
    }

    /**
     * Gets the value of the propstate property.
     * 
     * @return
     *     possible object is
     *     {@link PROPSTATETypeShape }
     *     
     */
    public PROPSTATETypeShape getPROPSTATE() {
        return propstate;
    }

    /**
     * Sets the value of the propstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPSTATETypeShape }
     *     
     */
    public void setPROPSTATE(PROPSTATETypeShape value) {
        this.propstate = value;
    }

    /**
     * Gets the value of the proppostal property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPOSTALTypeShape }
     *     
     */
    public PROPPOSTALTypeShape getPROPPOSTAL() {
        return proppostal;
    }

    /**
     * Sets the value of the proppostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPOSTALTypeShape }
     *     
     */
    public void setPROPPOSTAL(PROPPOSTALTypeShape value) {
        this.proppostal = value;
    }

    /**
     * Gets the value of the propgeocode property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGEOCODETypeShape }
     *     
     */
    public PROPGEOCODETypeShape getPROPGEOCODE() {
        return propgeocode;
    }

    /**
     * Sets the value of the propgeocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGEOCODETypeShape }
     *     
     */
    public void setPROPGEOCODE(PROPGEOCODETypeShape value) {
        this.propgeocode = value;
    }

    /**
     * Gets the value of the propincitylimit property.
     * 
     * @return
     *     possible object is
     *     {@link PROPINCITYLIMITTypeShape }
     *     
     */
    public PROPINCITYLIMITTypeShape getPROPINCITYLIMIT() {
        return propincitylimit;
    }

    /**
     * Sets the value of the propincitylimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPINCITYLIMITTypeShape }
     *     
     */
    public void setPROPINCITYLIMIT(PROPINCITYLIMITTypeShape value) {
        this.propincitylimit = value;
    }

    /**
     * Gets the value of the propaddress1AC property.
     * 
     * @return
     *     possible object is
     *     {@link PROPADDRESS1ACTypeShape }
     *     
     */
    public PROPADDRESS1ACTypeShape getPROPADDRESS1AC() {
        return propaddress1AC;
    }

    /**
     * Sets the value of the propaddress1AC property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPADDRESS1ACTypeShape }
     *     
     */
    public void setPROPADDRESS1AC(PROPADDRESS1ACTypeShape value) {
        this.propaddress1AC = value;
    }

    /**
     * Gets the value of the propaddress2AC property.
     * 
     * @return
     *     possible object is
     *     {@link PROPADDRESS2ACTypeShape }
     *     
     */
    public PROPADDRESS2ACTypeShape getPROPADDRESS2AC() {
        return propaddress2AC;
    }

    /**
     * Sets the value of the propaddress2AC property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPADDRESS2ACTypeShape }
     *     
     */
    public void setPROPADDRESS2AC(PROPADDRESS2ACTypeShape value) {
        this.propaddress2AC = value;
    }

    /**
     * Gets the value of the propaddress3AC property.
     * 
     * @return
     *     possible object is
     *     {@link PROPADDRESS3ACTypeShape }
     *     
     */
    public PROPADDRESS3ACTypeShape getPROPADDRESS3AC() {
        return propaddress3AC;
    }

    /**
     * Sets the value of the propaddress3AC property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPADDRESS3ACTypeShape }
     *     
     */
    public void setPROPADDRESS3AC(PROPADDRESS3ACTypeShape value) {
        this.propaddress3AC = value;
    }

    /**
     * Gets the value of the propcityac property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCITYACTypeShape }
     *     
     */
    public PROPCITYACTypeShape getPROPCITYAC() {
        return propcityac;
    }

    /**
     * Sets the value of the propcityac property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCITYACTypeShape }
     *     
     */
    public void setPROPCITYAC(PROPCITYACTypeShape value) {
        this.propcityac = value;
    }

    /**
     * Gets the value of the propregregion property.
     * 
     * @return
     *     possible object is
     *     {@link PROPREGREGIONTypeShape }
     *     
     */
    public PROPREGREGIONTypeShape getPROPREGREGION() {
        return propregregion;
    }

    /**
     * Sets the value of the propregregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPREGREGIONTypeShape }
     *     
     */
    public void setPROPREGREGION(PROPREGREGIONTypeShape value) {
        this.propregregion = value;
    }

}
