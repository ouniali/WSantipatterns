
package com.oracle.xmlns.enterprise.tools.schemas.m1080144;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_NATIVE_CHNComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_NATIVE_CHNComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROP_NATIVE_PLACE_CHN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_NATIVE_PLACE_CHNTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_NATIVE_CHNComplexTypeShape", propOrder = {
    "propnativeplacechn"
})
public class COLLPERSNATIVECHNComplexTypeShape {

    @XmlElement(name = "PROP_NATIVE_PLACE_CHN")
    protected PROPNATIVEPLACECHNTypeShape propnativeplacechn;

    /**
     * Gets the value of the propnativeplacechn property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNATIVEPLACECHNTypeShape }
     *     
     */
    public PROPNATIVEPLACECHNTypeShape getPROPNATIVEPLACECHN() {
        return propnativeplacechn;
    }

    /**
     * Sets the value of the propnativeplacechn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNATIVEPLACECHNTypeShape }
     *     
     */
    public void setPROPNATIVEPLACECHN(PROPNATIVEPLACECHNTypeShape value) {
        this.propnativeplacechn = value;
    }

}
