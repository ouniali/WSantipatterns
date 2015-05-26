
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
 *         &lt;element name="GetIssuerAttributeChangesByExchangeResult" type="{http://www.xignite.com/services/}ArrayOfIssuerAttributeChange" minOccurs="0"/>
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
    "getIssuerAttributeChangesByExchangeResult"
})
@XmlRootElement(name = "GetIssuerAttributeChangesByExchangeResponse")
public class GetIssuerAttributeChangesByExchangeResponse {

    @XmlElement(name = "GetIssuerAttributeChangesByExchangeResult")
    protected ArrayOfIssuerAttributeChange getIssuerAttributeChangesByExchangeResult;

    /**
     * Gets the value of the getIssuerAttributeChangesByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIssuerAttributeChange }
     *     
     */
    public ArrayOfIssuerAttributeChange getGetIssuerAttributeChangesByExchangeResult() {
        return getIssuerAttributeChangesByExchangeResult;
    }

    /**
     * Sets the value of the getIssuerAttributeChangesByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIssuerAttributeChange }
     *     
     */
    public void setGetIssuerAttributeChangesByExchangeResult(ArrayOfIssuerAttributeChange value) {
        this.getIssuerAttributeChangesByExchangeResult = value;
    }

}
