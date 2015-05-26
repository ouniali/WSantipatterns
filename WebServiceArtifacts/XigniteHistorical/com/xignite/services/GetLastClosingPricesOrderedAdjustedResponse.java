
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
 *         &lt;element name="GetLastClosingPricesOrderedAdjustedResult" type="{http://www.xignite.com/services/}ArrayOfHistoricalQuote" minOccurs="0"/>
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
    "getLastClosingPricesOrderedAdjustedResult"
})
@XmlRootElement(name = "GetLastClosingPricesOrderedAdjustedResponse")
public class GetLastClosingPricesOrderedAdjustedResponse {

    @XmlElement(name = "GetLastClosingPricesOrderedAdjustedResult")
    protected ArrayOfHistoricalQuote getLastClosingPricesOrderedAdjustedResult;

    /**
     * Gets the value of the getLastClosingPricesOrderedAdjustedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricalQuote }
     *     
     */
    public ArrayOfHistoricalQuote getGetLastClosingPricesOrderedAdjustedResult() {
        return getLastClosingPricesOrderedAdjustedResult;
    }

    /**
     * Sets the value of the getLastClosingPricesOrderedAdjustedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricalQuote }
     *     
     */
    public void setGetLastClosingPricesOrderedAdjustedResult(ArrayOfHistoricalQuote value) {
        this.getLastClosingPricesOrderedAdjustedResult = value;
    }

}
