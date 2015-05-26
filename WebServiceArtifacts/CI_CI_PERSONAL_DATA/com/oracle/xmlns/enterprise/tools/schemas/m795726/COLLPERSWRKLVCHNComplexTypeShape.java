
package com.oracle.xmlns.enterprise.tools.schemas.m795726;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_WRKLV_CHNComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_WRKLV_CHNComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_WRKLV_STATUS_CHN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_WRKLV_STATUS_CHNTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_DT_ISSUED" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_DT_ISSUEDTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_WRKLV_RENEW_DT_CHN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_WRKLV_RENEW_DT_CHNTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_EXPIRATN_DT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_EXPIRATN_DTTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_WRKLV_CHNComplexTypeShape", propOrder = {
    "keypropeffdt",
    "propwrklvstatuschn",
    "propdtissued",
    "propwrklvrenewdtchn",
    "propexpiratndt"
})
public class COLLPERSWRKLVCHNComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_WRKLV_STATUS_CHN")
    protected PROPWRKLVSTATUSCHNTypeShape propwrklvstatuschn;
    @XmlElement(name = "PROP_DT_ISSUED")
    protected PROPDTISSUEDTypeShape propdtissued;
    @XmlElement(name = "PROP_WRKLV_RENEW_DT_CHN")
    protected PROPWRKLVRENEWDTCHNTypeShape propwrklvrenewdtchn;
    @XmlElement(name = "PROP_EXPIRATN_DT")
    protected PROPEXPIRATNDTTypeShape propexpiratndt;

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
     * Gets the value of the propwrklvstatuschn property.
     * 
     * @return
     *     possible object is
     *     {@link PROPWRKLVSTATUSCHNTypeShape }
     *     
     */
    public PROPWRKLVSTATUSCHNTypeShape getPROPWRKLVSTATUSCHN() {
        return propwrklvstatuschn;
    }

    /**
     * Sets the value of the propwrklvstatuschn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPWRKLVSTATUSCHNTypeShape }
     *     
     */
    public void setPROPWRKLVSTATUSCHN(PROPWRKLVSTATUSCHNTypeShape value) {
        this.propwrklvstatuschn = value;
    }

    /**
     * Gets the value of the propdtissued property.
     * 
     * @return
     *     possible object is
     *     {@link PROPDTISSUEDTypeShape }
     *     
     */
    public PROPDTISSUEDTypeShape getPROPDTISSUED() {
        return propdtissued;
    }

    /**
     * Sets the value of the propdtissued property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPDTISSUEDTypeShape }
     *     
     */
    public void setPROPDTISSUED(PROPDTISSUEDTypeShape value) {
        this.propdtissued = value;
    }

    /**
     * Gets the value of the propwrklvrenewdtchn property.
     * 
     * @return
     *     possible object is
     *     {@link PROPWRKLVRENEWDTCHNTypeShape }
     *     
     */
    public PROPWRKLVRENEWDTCHNTypeShape getPROPWRKLVRENEWDTCHN() {
        return propwrklvrenewdtchn;
    }

    /**
     * Sets the value of the propwrklvrenewdtchn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPWRKLVRENEWDTCHNTypeShape }
     *     
     */
    public void setPROPWRKLVRENEWDTCHN(PROPWRKLVRENEWDTCHNTypeShape value) {
        this.propwrklvrenewdtchn = value;
    }

    /**
     * Gets the value of the propexpiratndt property.
     * 
     * @return
     *     possible object is
     *     {@link PROPEXPIRATNDTTypeShape }
     *     
     */
    public PROPEXPIRATNDTTypeShape getPROPEXPIRATNDT() {
        return propexpiratndt;
    }

    /**
     * Sets the value of the propexpiratndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPEXPIRATNDTTypeShape }
     *     
     */
    public void setPROPEXPIRATNDT(PROPEXPIRATNDTTypeShape value) {
        this.propexpiratndt = value;
    }

}
