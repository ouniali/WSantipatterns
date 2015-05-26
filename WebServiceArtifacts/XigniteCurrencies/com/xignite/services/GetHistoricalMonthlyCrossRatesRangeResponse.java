
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
 *         &lt;element name="GetHistoricalMonthlyCrossRatesRangeResult" type="{http://www.xignite.com/services/}FullHistoricalCrossRates" minOccurs="0"/>
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
    "getHistoricalMonthlyCrossRatesRangeResult"
})
@XmlRootElement(name = "GetHistoricalMonthlyCrossRatesRangeResponse")
public class GetHistoricalMonthlyCrossRatesRangeResponse {

    @XmlElement(name = "GetHistoricalMonthlyCrossRatesRangeResult")
    protected FullHistoricalCrossRates getHistoricalMonthlyCrossRatesRangeResult;

    /**
     * Gets the value of the getHistoricalMonthlyCrossRatesRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link FullHistoricalCrossRates }
     *     
     */
    public FullHistoricalCrossRates getGetHistoricalMonthlyCrossRatesRangeResult() {
        return getHistoricalMonthlyCrossRatesRangeResult;
    }

    /**
     * Sets the value of the getHistoricalMonthlyCrossRatesRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullHistoricalCrossRates }
     *     
     */
    public void setGetHistoricalMonthlyCrossRatesRangeResult(FullHistoricalCrossRates value) {
        this.getHistoricalMonthlyCrossRatesRangeResult = value;
    }

}
