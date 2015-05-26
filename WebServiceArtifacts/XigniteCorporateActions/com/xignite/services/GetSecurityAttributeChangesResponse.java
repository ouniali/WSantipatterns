
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetSecurityAttributeChangesResult" type="{http://www.xignite.com/services/}ArrayOfSecurityAttributeChange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSecurityAttributeChangesResult"
})
@XmlRootElement(name = "GetSecurityAttributeChangesResponse")
public class GetSecurityAttributeChangesResponse {

    @XmlElement(name = "GetSecurityAttributeChangesResult")
    protected ArrayOfSecurityAttributeChange getSecurityAttributeChangesResult;

    /**
     * Gets the value of the getSecurityAttributeChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecurityAttributeChange }
     *     
     */
    public ArrayOfSecurityAttributeChange getGetSecurityAttributeChangesResult() {
        return getSecurityAttributeChangesResult;
    }

    /**
     * Sets the value of the getSecurityAttributeChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecurityAttributeChange }
     *     
     */
    public void setGetSecurityAttributeChangesResult(ArrayOfSecurityAttributeChange value) {
        this.getSecurityAttributeChangesResult = value;
    }

}
