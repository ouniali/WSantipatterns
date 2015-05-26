
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
 *         &lt;element name="GetLastSaleByIdentifierResult" type="{http://www.xignite.com/services/}LastSaleQuote" minOccurs="0"/>
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
    "getLastSaleByIdentifierResult"
})
@XmlRootElement(name = "GetLastSaleByIdentifierResponse")
public class GetLastSaleByIdentifierResponse {

    @XmlElement(name = "GetLastSaleByIdentifierResult")
    protected LastSaleQuote getLastSaleByIdentifierResult;

    /**
     * Gets the value of the getLastSaleByIdentifierResult property.
     * 
     * @return
     *     possible object is
     *     {@link LastSaleQuote }
     *     
     */
    public LastSaleQuote getGetLastSaleByIdentifierResult() {
        return getLastSaleByIdentifierResult;
    }

    /**
     * Sets the value of the getLastSaleByIdentifierResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastSaleQuote }
     *     
     */
    public void setGetLastSaleByIdentifierResult(LastSaleQuote value) {
        this.getLastSaleByIdentifierResult = value;
    }

}
