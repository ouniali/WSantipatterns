
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERSONAL_PHONEComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERSONAL_PHONEComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_PHONE_TYPE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_PHONE_TYPETypeShape"/>
 *         &lt;element name="PROP_COUNTRY_CODE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_COUNTRY_CODETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_PHONE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_PHONETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_EXTENSION" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_EXTENSIONTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_PREF_PHONE_FLAG" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_PREF_PHONE_FLAGTypeShape"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERSONAL_PHONEComplexTypeShape", propOrder = {
    "keypropphonetype",
    "propcountrycode",
    "propphone",
    "propextension",
    "propprefphoneflag"
})
public class COLLPERSONALPHONEComplexTypeShape {

    @XmlElement(name = "KEYPROP_PHONE_TYPE", required = true)
    protected KEYPROPPHONETYPETypeShape keypropphonetype;
    @XmlElement(name = "PROP_COUNTRY_CODE")
    protected PROPCOUNTRYCODETypeShape propcountrycode;
    @XmlElement(name = "PROP_PHONE")
    protected PROPPHONETypeShape propphone;
    @XmlElement(name = "PROP_EXTENSION")
    protected PROPEXTENSIONTypeShape propextension;
    @XmlElement(name = "PROP_PREF_PHONE_FLAG", required = true)
    protected PROPPREFPHONEFLAGTypeShape propprefphoneflag;

    /**
     * Gets the value of the keypropphonetype property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPPHONETYPETypeShape }
     *     
     */
    public KEYPROPPHONETYPETypeShape getKEYPROPPHONETYPE() {
        return keypropphonetype;
    }

    /**
     * Sets the value of the keypropphonetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPPHONETYPETypeShape }
     *     
     */
    public void setKEYPROPPHONETYPE(KEYPROPPHONETYPETypeShape value) {
        this.keypropphonetype = value;
    }

    /**
     * Gets the value of the propcountrycode property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCOUNTRYCODETypeShape }
     *     
     */
    public PROPCOUNTRYCODETypeShape getPROPCOUNTRYCODE() {
        return propcountrycode;
    }

    /**
     * Sets the value of the propcountrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCOUNTRYCODETypeShape }
     *     
     */
    public void setPROPCOUNTRYCODE(PROPCOUNTRYCODETypeShape value) {
        this.propcountrycode = value;
    }

    /**
     * Gets the value of the propphone property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPHONETypeShape }
     *     
     */
    public PROPPHONETypeShape getPROPPHONE() {
        return propphone;
    }

    /**
     * Sets the value of the propphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPHONETypeShape }
     *     
     */
    public void setPROPPHONE(PROPPHONETypeShape value) {
        this.propphone = value;
    }

    /**
     * Gets the value of the propextension property.
     * 
     * @return
     *     possible object is
     *     {@link PROPEXTENSIONTypeShape }
     *     
     */
    public PROPEXTENSIONTypeShape getPROPEXTENSION() {
        return propextension;
    }

    /**
     * Sets the value of the propextension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPEXTENSIONTypeShape }
     *     
     */
    public void setPROPEXTENSION(PROPEXTENSIONTypeShape value) {
        this.propextension = value;
    }

    /**
     * Gets the value of the propprefphoneflag property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPREFPHONEFLAGTypeShape }
     *     
     */
    public PROPPREFPHONEFLAGTypeShape getPROPPREFPHONEFLAG() {
        return propprefphoneflag;
    }

    /**
     * Sets the value of the propprefphoneflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPREFPHONEFLAGTypeShape }
     *     
     */
    public void setPROPPREFPHONEFLAG(PROPPREFPHONEFLAGTypeShape value) {
        this.propprefphoneflag = value;
    }

}
