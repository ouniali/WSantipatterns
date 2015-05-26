
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
 *         &lt;element name="GetMutipleHistoricalCrossRatesResult" type="{http://www.xignite.com/services/}MultipleHistoricalCrossRates" minOccurs="0"/>
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
    "getMutipleHistoricalCrossRatesResult"
})
@XmlRootElement(name = "GetMutipleHistoricalCrossRatesResponse")
public class GetMutipleHistoricalCrossRatesResponse {

    @XmlElement(name = "GetMutipleHistoricalCrossRatesResult")
    protected MultipleHistoricalCrossRates getMutipleHistoricalCrossRatesResult;

    /**
     * Gets the value of the getMutipleHistoricalCrossRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleHistoricalCrossRates }
     *     
     */
    public MultipleHistoricalCrossRates getGetMutipleHistoricalCrossRatesResult() {
        return getMutipleHistoricalCrossRatesResult;
    }

    /**
     * Sets the value of the getMutipleHistoricalCrossRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleHistoricalCrossRates }
     *     
     */
    public void setGetMutipleHistoricalCrossRatesResult(MultipleHistoricalCrossRates value) {
        this.getMutipleHistoricalCrossRatesResult = value;
    }

}
