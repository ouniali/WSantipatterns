
package com.oracle.xmlns.enterprise.tools.schemas.m558296;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageParametersComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageParametersComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyinformation" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M558296.V1}keyinformationComplexTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageParametersComplexTypeShape", propOrder = {
    "keyinformation"
})
public class MessageParametersComplexTypeShape {

    protected KeyinformationComplexTypeShape keyinformation;

    /**
     * Gets the value of the keyinformation property.
     * 
     * @return
     *     possible object is
     *     {@link KeyinformationComplexTypeShape }
     *     
     */
    public KeyinformationComplexTypeShape getKeyinformation() {
        return keyinformation;
    }

    /**
     * Sets the value of the keyinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyinformationComplexTypeShape }
     *     
     */
    public void setKeyinformation(KeyinformationComplexTypeShape value) {
        this.keyinformation = value;
    }

}
