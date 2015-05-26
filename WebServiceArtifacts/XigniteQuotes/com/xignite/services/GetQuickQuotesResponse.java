
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
 *         &lt;element name="GetQuickQuotesResult" type="{http://www.xignite.com/services/}ArrayOfQuickQuote" minOccurs="0"/>
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
    "getQuickQuotesResult"
})
@XmlRootElement(name = "GetQuickQuotesResponse")
public class GetQuickQuotesResponse {

    @XmlElement(name = "GetQuickQuotesResult")
    protected ArrayOfQuickQuote getQuickQuotesResult;

    /**
     * Gets the value of the getQuickQuotesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuickQuote }
     *     
     */
    public ArrayOfQuickQuote getGetQuickQuotesResult() {
        return getQuickQuotesResult;
    }

    /**
     * Sets the value of the getQuickQuotesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuickQuote }
     *     
     */
    public void setGetQuickQuotesResult(ArrayOfQuickQuote value) {
        this.getQuickQuotesResult = value;
    }

}
