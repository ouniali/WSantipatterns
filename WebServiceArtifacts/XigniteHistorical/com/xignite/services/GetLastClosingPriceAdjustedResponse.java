
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
 *         &lt;element name="GetLastClosingPriceAdjustedResult" type="{http://www.xignite.com/services/}HistoricalQuote" minOccurs="0"/>
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
    "getLastClosingPriceAdjustedResult"
})
@XmlRootElement(name = "GetLastClosingPriceAdjustedResponse")
public class GetLastClosingPriceAdjustedResponse {

    @XmlElement(name = "GetLastClosingPriceAdjustedResult")
    protected HistoricalQuote getLastClosingPriceAdjustedResult;

    /**
     * Gets the value of the getLastClosingPriceAdjustedResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalQuote }
     *     
     */
    public HistoricalQuote getGetLastClosingPriceAdjustedResult() {
        return getLastClosingPriceAdjustedResult;
    }

    /**
     * Sets the value of the getLastClosingPriceAdjustedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalQuote }
     *     
     */
    public void setGetLastClosingPriceAdjustedResult(HistoricalQuote value) {
        this.getLastClosingPriceAdjustedResult = value;
    }

}
