
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
 *         &lt;element name="GetHistoricalCrossRateTablesBidAskResult" type="{http://www.xignite.com/services/}ArrayOfCrossRateTableWithBidAsk" minOccurs="0"/>
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
    "getHistoricalCrossRateTablesBidAskResult"
})
@XmlRootElement(name = "GetHistoricalCrossRateTablesBidAskResponse")
public class GetHistoricalCrossRateTablesBidAskResponse {

    @XmlElement(name = "GetHistoricalCrossRateTablesBidAskResult")
    protected ArrayOfCrossRateTableWithBidAsk getHistoricalCrossRateTablesBidAskResult;

    /**
     * Gets the value of the getHistoricalCrossRateTablesBidAskResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrossRateTableWithBidAsk }
     *     
     */
    public ArrayOfCrossRateTableWithBidAsk getGetHistoricalCrossRateTablesBidAskResult() {
        return getHistoricalCrossRateTablesBidAskResult;
    }

    /**
     * Sets the value of the getHistoricalCrossRateTablesBidAskResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrossRateTableWithBidAsk }
     *     
     */
    public void setGetHistoricalCrossRateTablesBidAskResult(ArrayOfCrossRateTableWithBidAsk value) {
        this.getHistoricalCrossRateTablesBidAskResult = value;
    }

}
