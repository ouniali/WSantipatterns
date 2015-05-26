
package com.oracle.xmlns.enterprise.tools.schemas.m795726;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_NIDComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_NIDComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_COUNTRY" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}KEYPROP_COUNTRYTypeShape"/>
 *         &lt;element name="KEYPROP_NATIONAL_ID_TYPE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}KEYPROP_NATIONAL_ID_TYPETypeShape"/>
 *         &lt;element name="PROP_SSN_KEY_FRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_SSN_KEY_FRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_PRIMARY_NID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_PRIMARY_NIDTypeShape"/>
 *         &lt;element name="PROP_TAX_REF_ID_SGP" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_TAX_REF_ID_SGPTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NATIONAL_ID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_NATIONAL_IDTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_EXPIRY_DATE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_EXPIRY_DATETypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_NIDComplexTypeShape", propOrder = {
    "keypropcountry",
    "keypropnationalidtype",
    "propssnkeyfra",
    "propprimarynid",
    "proptaxrefidsgp",
    "propnationalid",
    "propexpirydate"
})
public class COLLPERSNIDComplexTypeShape {

    @XmlElement(name = "KEYPROP_COUNTRY", required = true)
    protected KEYPROPCOUNTRYTypeShape keypropcountry;
    @XmlElement(name = "KEYPROP_NATIONAL_ID_TYPE", required = true)
    protected KEYPROPNATIONALIDTYPETypeShape keypropnationalidtype;
    @XmlElement(name = "PROP_SSN_KEY_FRA")
    protected PROPSSNKEYFRATypeShape propssnkeyfra;
    @XmlElement(name = "PROP_PRIMARY_NID", required = true)
    protected PROPPRIMARYNIDTypeShape propprimarynid;
    @XmlElement(name = "PROP_TAX_REF_ID_SGP")
    protected PROPTAXREFIDSGPTypeShape proptaxrefidsgp;
    @XmlElement(name = "PROP_NATIONAL_ID")
    protected PROPNATIONALIDTypeShape propnationalid;
    @XmlElement(name = "PROP_EXPIRY_DATE")
    protected PROPEXPIRYDATETypeShape propexpirydate;

    /**
     * Gets the value of the keypropcountry property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPCOUNTRYTypeShape }
     *     
     */
    public KEYPROPCOUNTRYTypeShape getKEYPROPCOUNTRY() {
        return keypropcountry;
    }

    /**
     * Sets the value of the keypropcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPCOUNTRYTypeShape }
     *     
     */
    public void setKEYPROPCOUNTRY(KEYPROPCOUNTRYTypeShape value) {
        this.keypropcountry = value;
    }

    /**
     * Gets the value of the keypropnationalidtype property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPNATIONALIDTYPETypeShape }
     *     
     */
    public KEYPROPNATIONALIDTYPETypeShape getKEYPROPNATIONALIDTYPE() {
        return keypropnationalidtype;
    }

    /**
     * Sets the value of the keypropnationalidtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPNATIONALIDTYPETypeShape }
     *     
     */
    public void setKEYPROPNATIONALIDTYPE(KEYPROPNATIONALIDTYPETypeShape value) {
        this.keypropnationalidtype = value;
    }

    /**
     * Gets the value of the propssnkeyfra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPSSNKEYFRATypeShape }
     *     
     */
    public PROPSSNKEYFRATypeShape getPROPSSNKEYFRA() {
        return propssnkeyfra;
    }

    /**
     * Sets the value of the propssnkeyfra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPSSNKEYFRATypeShape }
     *     
     */
    public void setPROPSSNKEYFRA(PROPSSNKEYFRATypeShape value) {
        this.propssnkeyfra = value;
    }

    /**
     * Gets the value of the propprimarynid property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPRIMARYNIDTypeShape }
     *     
     */
    public PROPPRIMARYNIDTypeShape getPROPPRIMARYNID() {
        return propprimarynid;
    }

    /**
     * Sets the value of the propprimarynid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPRIMARYNIDTypeShape }
     *     
     */
    public void setPROPPRIMARYNID(PROPPRIMARYNIDTypeShape value) {
        this.propprimarynid = value;
    }

    /**
     * Gets the value of the proptaxrefidsgp property.
     * 
     * @return
     *     possible object is
     *     {@link PROPTAXREFIDSGPTypeShape }
     *     
     */
    public PROPTAXREFIDSGPTypeShape getPROPTAXREFIDSGP() {
        return proptaxrefidsgp;
    }

    /**
     * Sets the value of the proptaxrefidsgp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPTAXREFIDSGPTypeShape }
     *     
     */
    public void setPROPTAXREFIDSGP(PROPTAXREFIDSGPTypeShape value) {
        this.proptaxrefidsgp = value;
    }

    /**
     * Gets the value of the propnationalid property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNATIONALIDTypeShape }
     *     
     */
    public PROPNATIONALIDTypeShape getPROPNATIONALID() {
        return propnationalid;
    }

    /**
     * Sets the value of the propnationalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNATIONALIDTypeShape }
     *     
     */
    public void setPROPNATIONALID(PROPNATIONALIDTypeShape value) {
        this.propnationalid = value;
    }

    /**
     * Gets the value of the propexpirydate property.
     * 
     * @return
     *     possible object is
     *     {@link PROPEXPIRYDATETypeShape }
     *     
     */
    public PROPEXPIRYDATETypeShape getPROPEXPIRYDATE() {
        return propexpirydate;
    }

    /**
     * Sets the value of the propexpirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPEXPIRYDATETypeShape }
     *     
     */
    public void setPROPEXPIRYDATE(PROPEXPIRYDATETypeShape value) {
        this.propexpirydate = value;
    }

}
