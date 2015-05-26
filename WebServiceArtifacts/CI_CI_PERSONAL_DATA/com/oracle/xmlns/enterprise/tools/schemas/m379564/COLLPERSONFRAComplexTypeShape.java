
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERSON_FRAComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERSON_FRAComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROP_WRK_EXP_FRA_CD" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_WRK_EXP_FRA_CDTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERSON_FRAComplexTypeShape", propOrder = {
    "propwrkexpfracd"
})
public class COLLPERSONFRAComplexTypeShape {

    @XmlElement(name = "PROP_WRK_EXP_FRA_CD")
    protected PROPWRKEXPFRACDTypeShape propwrkexpfracd;

    /**
     * Gets the value of the propwrkexpfracd property.
     * 
     * @return
     *     possible object is
     *     {@link PROPWRKEXPFRACDTypeShape }
     *     
     */
    public PROPWRKEXPFRACDTypeShape getPROPWRKEXPFRACD() {
        return propwrkexpfracd;
    }

    /**
     * Sets the value of the propwrkexpfracd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPWRKEXPFRACDTypeShape }
     *     
     */
    public void setPROPWRKEXPFRACD(PROPWRKEXPFRACDTypeShape value) {
        this.propwrkexpfracd = value;
    }

}
