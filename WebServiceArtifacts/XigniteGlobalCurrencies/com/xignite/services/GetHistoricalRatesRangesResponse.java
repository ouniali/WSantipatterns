
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
 *         &lt;element name="GetHistoricalRatesRangesResult" type="{http://www.xignite.com/services/}ArrayOfHistoricalRate" minOccurs="0"/>
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
    "getHistoricalRatesRangesResult"
})
@XmlRootElement(name = "GetHistoricalRatesRangesResponse")
public class GetHistoricalRatesRangesResponse {

    @XmlElement(name = "GetHistoricalRatesRangesResult")
    protected ArrayOfHistoricalRate getHistoricalRatesRangesResult;

    /**
     * Gets the value of the getHistoricalRatesRangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricalRate }
     *     
     */
    public ArrayOfHistoricalRate getGetHistoricalRatesRangesResult() {
        return getHistoricalRatesRangesResult;
    }

    /**
     * Sets the value of the getHistoricalRatesRangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricalRate }
     *     
     */
    public void setGetHistoricalRatesRangesResult(ArrayOfHistoricalRate value) {
        this.getHistoricalRatesRangesResult = value;
    }

}
