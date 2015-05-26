
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
 *         &lt;element name="GetHistoricalRatesRangeResult" type="{http://www.xignite.com/services/}ArrayOfHistoricalRate" minOccurs="0"/>
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
    "getHistoricalRatesRangeResult"
})
@XmlRootElement(name = "GetHistoricalRatesRangeResponse")
public class GetHistoricalRatesRangeResponse {

    @XmlElement(name = "GetHistoricalRatesRangeResult")
    protected ArrayOfHistoricalRate getHistoricalRatesRangeResult;

    /**
     * Gets the value of the getHistoricalRatesRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricalRate }
     *     
     */
    public ArrayOfHistoricalRate getGetHistoricalRatesRangeResult() {
        return getHistoricalRatesRangeResult;
    }

    /**
     * Sets the value of the getHistoricalRatesRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricalRate }
     *     
     */
    public void setGetHistoricalRatesRangeResult(ArrayOfHistoricalRate value) {
        this.getHistoricalRatesRangeResult = value;
    }

}
