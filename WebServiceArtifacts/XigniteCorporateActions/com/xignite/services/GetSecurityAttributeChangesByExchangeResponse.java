
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
 *         &lt;element name="GetSecurityAttributeChangesByExchangeResult" type="{http://www.xignite.com/services/}ArrayOfSecurityAttributeChange" minOccurs="0"/>
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
    "getSecurityAttributeChangesByExchangeResult"
})
@XmlRootElement(name = "GetSecurityAttributeChangesByExchangeResponse")
public class GetSecurityAttributeChangesByExchangeResponse {

    @XmlElement(name = "GetSecurityAttributeChangesByExchangeResult")
    protected ArrayOfSecurityAttributeChange getSecurityAttributeChangesByExchangeResult;

    /**
     * Gets the value of the getSecurityAttributeChangesByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecurityAttributeChange }
     *     
     */
    public ArrayOfSecurityAttributeChange getGetSecurityAttributeChangesByExchangeResult() {
        return getSecurityAttributeChangesByExchangeResult;
    }

    /**
     * Sets the value of the getSecurityAttributeChangesByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecurityAttributeChange }
     *     
     */
    public void setGetSecurityAttributeChangesByExchangeResult(ArrayOfSecurityAttributeChange value) {
        this.getSecurityAttributeChangesByExchangeResult = value;
    }

}
