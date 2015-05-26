
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_WRKLIF_CHNComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_WRKLIF_CHNComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROP_START_DT_CHN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_START_DT_CHNTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_WRKLIF_CHNComplexTypeShape", propOrder = {
    "propstartdtchn"
})
public class COLLPERSWRKLIFCHNComplexTypeShape {

    @XmlElement(name = "PROP_START_DT_CHN")
    protected PROPSTARTDTCHNTypeShape propstartdtchn;

    /**
     * Gets the value of the propstartdtchn property.
     * 
     * @return
     *     possible object is
     *     {@link PROPSTARTDTCHNTypeShape }
     *     
     */
    public PROPSTARTDTCHNTypeShape getPROPSTARTDTCHN() {
        return propstartdtchn;
    }

    /**
     * Sets the value of the propstartdtchn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPSTARTDTCHNTypeShape }
     *     
     */
    public void setPROPSTARTDTCHN(PROPSTARTDTCHNTypeShape value) {
        this.propstartdtchn = value;
    }

}
