
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
 *         &lt;element name="GetHistoricalQuotesResult" type="{http://www.xignite.com/services/}ArrayOfHistoricalQuote" minOccurs="0"/>
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
    "getHistoricalQuotesResult"
})
@XmlRootElement(name = "GetHistoricalQuotesResponse")
public class GetHistoricalQuotesResponse {

    @XmlElement(name = "GetHistoricalQuotesResult")
    protected ArrayOfHistoricalQuote getHistoricalQuotesResult;

    /**
     * Gets the value of the getHistoricalQuotesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricalQuote }
     *     
     */
    public ArrayOfHistoricalQuote getGetHistoricalQuotesResult() {
        return getHistoricalQuotesResult;
    }

    /**
     * Sets the value of the getHistoricalQuotesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricalQuote }
     *     
     */
    public void setGetHistoricalQuotesResult(ArrayOfHistoricalQuote value) {
        this.getHistoricalQuotesResult = value;
    }

}
