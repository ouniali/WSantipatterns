
package com.oracle.xmlns.enterprise.tools.schemas.m1080144;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PROP_NI_CB_DET_METHODTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROP_NI_CB_DET_METHODTypeShape">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1>PROP_NI_CB_DET_METHODTypeDef">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROP_NI_CB_DET_METHODTypeShape", propOrder = {
    "value"
})
public class PROPNICBDETMETHODTypeShape {

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
