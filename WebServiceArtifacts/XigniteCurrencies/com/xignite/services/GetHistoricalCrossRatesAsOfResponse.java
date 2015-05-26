
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
 *         &lt;element name="GetHistoricalCrossRatesAsOfResult" type="{http://www.xignite.com/services/}HistoricalCrossRates" minOccurs="0"/>
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
    "getHistoricalCrossRatesAsOfResult"
})
@XmlRootElement(name = "GetHistoricalCrossRatesAsOfResponse")
public class GetHistoricalCrossRatesAsOfResponse {

    @XmlElement(name = "GetHistoricalCrossRatesAsOfResult")
    protected HistoricalCrossRates getHistoricalCrossRatesAsOfResult;

    /**
     * Gets the value of the getHistoricalCrossRatesAsOfResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalCrossRates }
     *     
     */
    public HistoricalCrossRates getGetHistoricalCrossRatesAsOfResult() {
        return getHistoricalCrossRatesAsOfResult;
    }

    /**
     * Sets the value of the getHistoricalCrossRatesAsOfResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalCrossRates }
     *     
     */
    public void setGetHistoricalCrossRatesAsOfResult(HistoricalCrossRates value) {
        this.getHistoricalCrossRatesAsOfResult = value;
    }

}
