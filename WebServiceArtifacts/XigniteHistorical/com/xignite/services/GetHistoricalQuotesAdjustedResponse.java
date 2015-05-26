
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
 *         &lt;element name="GetHistoricalQuotesAdjustedResult" type="{http://www.xignite.com/services/}ArrayOfHistoricalQuote" minOccurs="0"/>
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
    "getHistoricalQuotesAdjustedResult"
})
@XmlRootElement(name = "GetHistoricalQuotesAdjustedResponse")
public class GetHistoricalQuotesAdjustedResponse {

    @XmlElement(name = "GetHistoricalQuotesAdjustedResult")
    protected ArrayOfHistoricalQuote getHistoricalQuotesAdjustedResult;

    /**
     * Gets the value of the getHistoricalQuotesAdjustedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricalQuote }
     *     
     */
    public ArrayOfHistoricalQuote getGetHistoricalQuotesAdjustedResult() {
        return getHistoricalQuotesAdjustedResult;
    }

    /**
     * Sets the value of the getHistoricalQuotesAdjustedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricalQuote }
     *     
     */
    public void setGetHistoricalQuotesAdjustedResult(ArrayOfHistoricalQuote value) {
        this.getHistoricalQuotesAdjustedResult = value;
    }

}
