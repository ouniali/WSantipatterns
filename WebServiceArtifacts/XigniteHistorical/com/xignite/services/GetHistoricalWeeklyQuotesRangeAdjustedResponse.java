
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
 *         &lt;element name="GetHistoricalWeeklyQuotesRangeAdjustedResult" type="{http://www.xignite.com/services/}HistoricalQuotes" minOccurs="0"/>
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
    "getHistoricalWeeklyQuotesRangeAdjustedResult"
})
@XmlRootElement(name = "GetHistoricalWeeklyQuotesRangeAdjustedResponse")
public class GetHistoricalWeeklyQuotesRangeAdjustedResponse {

    @XmlElement(name = "GetHistoricalWeeklyQuotesRangeAdjustedResult")
    protected HistoricalQuotes getHistoricalWeeklyQuotesRangeAdjustedResult;

    /**
     * Gets the value of the getHistoricalWeeklyQuotesRangeAdjustedResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalQuotes }
     *     
     */
    public HistoricalQuotes getGetHistoricalWeeklyQuotesRangeAdjustedResult() {
        return getHistoricalWeeklyQuotesRangeAdjustedResult;
    }

    /**
     * Sets the value of the getHistoricalWeeklyQuotesRangeAdjustedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalQuotes }
     *     
     */
    public void setGetHistoricalWeeklyQuotesRangeAdjustedResult(HistoricalQuotes value) {
        this.getHistoricalWeeklyQuotesRangeAdjustedResult = value;
    }

}
