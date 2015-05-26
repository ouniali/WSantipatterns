
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
 *         &lt;element name="GetLondonHistoricalRatesRangeResult" type="{http://www.xignite.com/services/}ArrayOfHistoricalRate" minOccurs="0"/>
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
    "getLondonHistoricalRatesRangeResult"
})
@XmlRootElement(name = "GetLondonHistoricalRatesRangeResponse")
public class GetLondonHistoricalRatesRangeResponse {

    @XmlElement(name = "GetLondonHistoricalRatesRangeResult")
    protected ArrayOfHistoricalRate getLondonHistoricalRatesRangeResult;

    /**
     * Gets the value of the getLondonHistoricalRatesRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricalRate }
     *     
     */
    public ArrayOfHistoricalRate getGetLondonHistoricalRatesRangeResult() {
        return getLondonHistoricalRatesRangeResult;
    }

    /**
     * Sets the value of the getLondonHistoricalRatesRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricalRate }
     *     
     */
    public void setGetLondonHistoricalRatesRangeResult(ArrayOfHistoricalRate value) {
        this.getLondonHistoricalRatesRangeResult = value;
    }

}
