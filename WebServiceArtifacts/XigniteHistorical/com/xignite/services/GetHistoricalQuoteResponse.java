
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
 *         &lt;element name="GetHistoricalQuoteResult" type="{http://www.xignite.com/services/}HistoricalQuote" minOccurs="0"/>
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
    "getHistoricalQuoteResult"
})
@XmlRootElement(name = "GetHistoricalQuoteResponse")
public class GetHistoricalQuoteResponse {

    @XmlElement(name = "GetHistoricalQuoteResult")
    protected HistoricalQuote getHistoricalQuoteResult;

    /**
     * Gets the value of the getHistoricalQuoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalQuote }
     *     
     */
    public HistoricalQuote getGetHistoricalQuoteResult() {
        return getHistoricalQuoteResult;
    }

    /**
     * Sets the value of the getHistoricalQuoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalQuote }
     *     
     */
    public void setGetHistoricalQuoteResult(HistoricalQuote value) {
        this.getHistoricalQuoteResult = value;
    }

}
