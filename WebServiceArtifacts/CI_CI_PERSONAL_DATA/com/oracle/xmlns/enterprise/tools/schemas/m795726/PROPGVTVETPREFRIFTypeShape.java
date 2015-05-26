
package com.oracle.xmlns.enterprise.tools.schemas.m795726;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PROP_GVT_VET_PREF_RIFTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROP_GVT_VET_PREF_RIFTypeShape">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1>PROP_GVT_VET_PREF_RIFTypeDef">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROP_GVT_VET_PREF_RIFTypeShape", propOrder = {
    "value"
})
public class PROPGVTVETPREFRIFTypeShape {

    @XmlValue
    protected String value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
