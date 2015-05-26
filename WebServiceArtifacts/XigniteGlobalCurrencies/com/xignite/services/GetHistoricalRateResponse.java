
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
 *         &lt;element name="GetHistoricalRateResult" type="{http://www.xignite.com/services/}HistoricalRate" minOccurs="0"/>
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
    "getHistoricalRateResult"
})
@XmlRootElement(name = "GetHistoricalRateResponse")
public class GetHistoricalRateResponse {

    @XmlElement(name = "GetHistoricalRateResult")
    protected HistoricalRate getHistoricalRateResult;

    /**
     * Gets the value of the getHistoricalRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalRate }
     *     
     */
    public HistoricalRate getGetHistoricalRateResult() {
        return getHistoricalRateResult;
    }

    /**
     * Sets the value of the getHistoricalRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalRate }
     *     
     */
    public void setGetHistoricalRateResult(HistoricalRate value) {
        this.getHistoricalRateResult = value;
    }

}
