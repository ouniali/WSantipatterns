
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
 *         &lt;element name="GetSecurityAttributeChangesAllResult" type="{http://www.xignite.com/services/}ArrayOfSecurityAttributeChange" minOccurs="0"/>
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
    "getSecurityAttributeChangesAllResult"
})
@XmlRootElement(name = "GetSecurityAttributeChangesAllResponse")
public class GetSecurityAttributeChangesAllResponse {

    @XmlElement(name = "GetSecurityAttributeChangesAllResult")
    protected ArrayOfSecurityAttributeChange getSecurityAttributeChangesAllResult;

    /**
     * Gets the value of the getSecurityAttributeChangesAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecurityAttributeChange }
     *     
     */
    public ArrayOfSecurityAttributeChange getGetSecurityAttributeChangesAllResult() {
        return getSecurityAttributeChangesAllResult;
    }

    /**
     * Sets the value of the getSecurityAttributeChangesAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecurityAttributeChange }
     *     
     */
    public void setGetSecurityAttributeChangesAllResult(ArrayOfSecurityAttributeChange value) {
        this.getSecurityAttributeChangesAllResult = value;
    }

}
