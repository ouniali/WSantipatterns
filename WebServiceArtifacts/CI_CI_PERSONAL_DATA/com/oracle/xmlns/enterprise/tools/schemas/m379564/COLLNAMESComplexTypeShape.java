
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_NAMESComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_NAMESComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_NAME_TYPE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_NAME_TYPETypeShape"/>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_COUNTRY_NM_FORMAT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_COUNTRY_NM_FORMATTypeShape"/>
 *         &lt;element name="PROP_NAME_INITIALS" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NAME_INITIALSTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NAME_PREFIX" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NAME_PREFIXTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NAME_SUFFIX" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NAME_SUFFIXTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NAME_ROYAL_PREFIX" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NAME_ROYAL_PREFIXTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NAME_ROYAL_SUFFIX" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NAME_ROYAL_SUFFIXTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NAME_TITLE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NAME_TITLETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_LAST_NAME" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_LAST_NAMETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_FIRST_NAME" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_FIRST_NAMETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MIDDLE_NAME" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_MIDDLE_NAMETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_SECOND_LAST_NAME" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_SECOND_LAST_NAMETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NAME_AC" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NAME_ACTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_PREF_FIRST_NAME" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_PREF_FIRST_NAMETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_PARTNER_LAST_NAME" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_PARTNER_LAST_NAMETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_PARTNER_ROY_PREFIX" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_PARTNER_ROY_PREFIXTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_LAST_NAME_PREF_NLD" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_LAST_NAME_PREF_NLDTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_NAMESComplexTypeShape", propOrder = {
    "keypropnametype",
    "keypropeffdt",
    "propcountrynmformat",
    "propnameinitials",
    "propnameprefix",
    "propnamesuffix",
    "propnameroyalprefix",
    "propnameroyalsuffix",
    "propnametitle",
    "proplastname",
    "propfirstname",
    "propmiddlename",
    "propsecondlastname",
    "propnameac",
    "proppreffirstname",
    "proppartnerlastname",
    "proppartnerroyprefix",
    "proplastnameprefnld"
})
public class COLLNAMESComplexTypeShape {

    @XmlElement(name = "KEYPROP_NAME_TYPE", required = true)
    protected KEYPROPNAMETYPETypeShape keypropnametype;
    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_COUNTRY_NM_FORMAT", required = true)
    protected PROPCOUNTRYNMFORMATTypeShape propcountrynmformat;
    @XmlElement(name = "PROP_NAME_INITIALS")
    protected PROPNAMEINITIALSTypeShape propnameinitials;
    @XmlElement(name = "PROP_NAME_PREFIX")
    protected PROPNAMEPREFIXTypeShape propnameprefix;
    @XmlElement(name = "PROP_NAME_SUFFIX")
    protected PROPNAMESUFFIXTypeShape propnamesuffix;
    @XmlElement(name = "PROP_NAME_ROYAL_PREFIX")
    protected PROPNAMEROYALPREFIXTypeShape propnameroyalprefix;
    @XmlElement(name = "PROP_NAME_ROYAL_SUFFIX")
    protected PROPNAMEROYALSUFFIXTypeShape propnameroyalsuffix;
    @XmlElement(name = "PROP_NAME_TITLE")
    protected PROPNAMETITLETypeShape propnametitle;
    @XmlElement(name = "PROP_LAST_NAME")
    protected PROPLASTNAMETypeShape proplastname;
    @XmlElement(name = "PROP_FIRST_NAME")
    protected PROPFIRSTNAMETypeShape propfirstname;
    @XmlElement(name = "PROP_MIDDLE_NAME")
    protected PROPMIDDLENAMETypeShape propmiddlename;
    @XmlElement(name = "PROP_SECOND_LAST_NAME")
    protected PROPSECONDLASTNAMETypeShape propsecondlastname;
    @XmlElement(name = "PROP_NAME_AC")
    protected PROPNAMEACTypeShape propnameac;
    @XmlElement(name = "PROP_PREF_FIRST_NAME")
    protected PROPPREFFIRSTNAMETypeShape proppreffirstname;
    @XmlElement(name = "PROP_PARTNER_LAST_NAME")
    protected PROPPARTNERLASTNAMETypeShape proppartnerlastname;
    @XmlElement(name = "PROP_PARTNER_ROY_PREFIX")
    protected PROPPARTNERROYPREFIXTypeShape proppartnerroyprefix;
    @XmlElement(name = "PROP_LAST_NAME_PREF_NLD")
    protected PROPLASTNAMEPREFNLDTypeShape proplastnameprefnld;

    /**
     * Gets the value of the keypropnametype property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPNAMETYPETypeShape }
     *     
     */
    public KEYPROPNAMETYPETypeShape getKEYPROPNAMETYPE() {
        return keypropnametype;
    }

    /**
     * Sets the value of the keypropnametype property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPNAMETYPETypeShape }
     *     
     */
    public void setKEYPROPNAMETYPE(KEYPROPNAMETYPETypeShape value) {
        this.keypropnametype = value;
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
     * Gets the value of the propcountrynmformat property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCOUNTRYNMFORMATTypeShape }
     *     
     */
    public PROPCOUNTRYNMFORMATTypeShape getPROPCOUNTRYNMFORMAT() {
        return propcountrynmformat;
    }

    /**
     * Sets the value of the propcountrynmformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCOUNTRYNMFORMATTypeShape }
     *     
     */
    public void setPROPCOUNTRYNMFORMAT(PROPCOUNTRYNMFORMATTypeShape value) {
        this.propcountrynmformat = value;
    }

    /**
     * Gets the value of the propnameinitials property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNAMEINITIALSTypeShape }
     *     
     */
    public PROPNAMEINITIALSTypeShape getPROPNAMEINITIALS() {
        return propnameinitials;
    }

    /**
     * Sets the value of the propnameinitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNAMEINITIALSTypeShape }
     *     
     */
    public void setPROPNAMEINITIALS(PROPNAMEINITIALSTypeShape value) {
        this.propnameinitials = value;
    }

    /**
     * Gets the value of the propnameprefix property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNAMEPREFIXTypeShape }
     *     
     */
    public PROPNAMEPREFIXTypeShape getPROPNAMEPREFIX() {
        return propnameprefix;
    }

    /**
     * Sets the value of the propnameprefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNAMEPREFIXTypeShape }
     *     
     */
    public void setPROPNAMEPREFIX(PROPNAMEPREFIXTypeShape value) {
        this.propnameprefix = value;
    }

    /**
     * Gets the value of the propnamesuffix property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNAMESUFFIXTypeShape }
     *     
     */
    public PROPNAMESUFFIXTypeShape getPROPNAMESUFFIX() {
        return propnamesuffix;
    }

    /**
     * Sets the value of the propnamesuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNAMESUFFIXTypeShape }
     *     
     */
    public void setPROPNAMESUFFIX(PROPNAMESUFFIXTypeShape value) {
        this.propnamesuffix = value;
    }

    /**
     * Gets the value of the propnameroyalprefix property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNAMEROYALPREFIXTypeShape }
     *     
     */
    public PROPNAMEROYALPREFIXTypeShape getPROPNAMEROYALPREFIX() {
        return propnameroyalprefix;
    }

    /**
     * Sets the value of the propnameroyalprefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNAMEROYALPREFIXTypeShape }
     *     
     */
    public void setPROPNAMEROYALPREFIX(PROPNAMEROYALPREFIXTypeShape value) {
        this.propnameroyalprefix = value;
    }

    /**
     * Gets the value of the propnameroyalsuffix property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNAMEROYALSUFFIXTypeShape }
     *     
     */
    public PROPNAMEROYALSUFFIXTypeShape getPROPNAMEROYALSUFFIX() {
        return propnameroyalsuffix;
    }

    /**
     * Sets the value of the propnameroyalsuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNAMEROYALSUFFIXTypeShape }
     *     
     */
    public void setPROPNAMEROYALSUFFIX(PROPNAMEROYALSUFFIXTypeShape value) {
        this.propnameroyalsuffix = value;
    }

    /**
     * Gets the value of the propnametitle property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNAMETITLETypeShape }
     *     
     */
    public PROPNAMETITLETypeShape getPROPNAMETITLE() {
        return propnametitle;
    }

    /**
     * Sets the value of the propnametitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNAMETITLETypeShape }
     *     
     */
    public void setPROPNAMETITLE(PROPNAMETITLETypeShape value) {
        this.propnametitle = value;
    }

    /**
     * Gets the value of the proplastname property.
     * 
     * @return
     *     possible object is
     *     {@link PROPLASTNAMETypeShape }
     *     
     */
    public PROPLASTNAMETypeShape getPROPLASTNAME() {
        return proplastname;
    }

    /**
     * Sets the value of the proplastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPLASTNAMETypeShape }
     *     
     */
    public void setPROPLASTNAME(PROPLASTNAMETypeShape value) {
        this.proplastname = value;
    }

    /**
     * Gets the value of the propfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link PROPFIRSTNAMETypeShape }
     *     
     */
    public PROPFIRSTNAMETypeShape getPROPFIRSTNAME() {
        return propfirstname;
    }

    /**
     * Sets the value of the propfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPFIRSTNAMETypeShape }
     *     
     */
    public void setPROPFIRSTNAME(PROPFIRSTNAMETypeShape value) {
        this.propfirstname = value;
    }

    /**
     * Gets the value of the propmiddlename property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMIDDLENAMETypeShape }
     *     
     */
    public PROPMIDDLENAMETypeShape getPROPMIDDLENAME() {
        return propmiddlename;
    }

    /**
     * Sets the value of the propmiddlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMIDDLENAMETypeShape }
     *     
     */
    public void setPROPMIDDLENAME(PROPMIDDLENAMETypeShape value) {
        this.propmiddlename = value;
    }

    /**
     * Gets the value of the propsecondlastname property.
     * 
     * @return
     *     possible object is
     *     {@link PROPSECONDLASTNAMETypeShape }
     *     
     */
    public PROPSECONDLASTNAMETypeShape getPROPSECONDLASTNAME() {
        return propsecondlastname;
    }

    /**
     * Sets the value of the propsecondlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPSECONDLASTNAMETypeShape }
     *     
     */
    public void setPROPSECONDLASTNAME(PROPSECONDLASTNAMETypeShape value) {
        this.propsecondlastname = value;
    }

    /**
     * Gets the value of the propnameac property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNAMEACTypeShape }
     *     
     */
    public PROPNAMEACTypeShape getPROPNAMEAC() {
        return propnameac;
    }

    /**
     * Sets the value of the propnameac property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNAMEACTypeShape }
     *     
     */
    public void setPROPNAMEAC(PROPNAMEACTypeShape value) {
        this.propnameac = value;
    }

    /**
     * Gets the value of the proppreffirstname property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPREFFIRSTNAMETypeShape }
     *     
     */
    public PROPPREFFIRSTNAMETypeShape getPROPPREFFIRSTNAME() {
        return proppreffirstname;
    }

    /**
     * Sets the value of the proppreffirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPREFFIRSTNAMETypeShape }
     *     
     */
    public void setPROPPREFFIRSTNAME(PROPPREFFIRSTNAMETypeShape value) {
        this.proppreffirstname = value;
    }

    /**
     * Gets the value of the proppartnerlastname property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPARTNERLASTNAMETypeShape }
     *     
     */
    public PROPPARTNERLASTNAMETypeShape getPROPPARTNERLASTNAME() {
        return proppartnerlastname;
    }

    /**
     * Sets the value of the proppartnerlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPARTNERLASTNAMETypeShape }
     *     
     */
    public void setPROPPARTNERLASTNAME(PROPPARTNERLASTNAMETypeShape value) {
        this.proppartnerlastname = value;
    }

    /**
     * Gets the value of the proppartnerroyprefix property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPARTNERROYPREFIXTypeShape }
     *     
     */
    public PROPPARTNERROYPREFIXTypeShape getPROPPARTNERROYPREFIX() {
        return proppartnerroyprefix;
    }

    /**
     * Sets the value of the proppartnerroyprefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPARTNERROYPREFIXTypeShape }
     *     
     */
    public void setPROPPARTNERROYPREFIX(PROPPARTNERROYPREFIXTypeShape value) {
        this.proppartnerroyprefix = value;
    }

    /**
     * Gets the value of the proplastnameprefnld property.
     * 
     * @return
     *     possible object is
     *     {@link PROPLASTNAMEPREFNLDTypeShape }
     *     
     */
    public PROPLASTNAMEPREFNLDTypeShape getPROPLASTNAMEPREFNLD() {
        return proplastnameprefnld;
    }

    /**
     * Sets the value of the proplastnameprefnld property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPLASTNAMEPREFNLDTypeShape }
     *     
     */
    public void setPROPLASTNAMEPREFNLD(PROPLASTNAMEPREFNLDTypeShape value) {
        this.proplastnameprefnld = value;
    }

}
