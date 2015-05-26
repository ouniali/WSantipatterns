
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
 *         &lt;element name="GetHistoricalCrossRateResult" type="{http://www.xignite.com/services/}HistoricalCrossRate" minOccurs="0"/>
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
    "getHistoricalCrossRateResult"
})
@XmlRootElement(name = "GetHistoricalCrossRateResponse")
public class GetHistoricalCrossRateResponse {

    @XmlElement(name = "GetHistoricalCrossRateResult")
    protected HistoricalCrossRate getHistoricalCrossRateResult;

    /**
     * Gets the value of the getHistoricalCrossRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalCrossRate }
     *     
     */
    public HistoricalCrossRate getGetHistoricalCrossRateResult() {
        return getHistoricalCrossRateResult;
    }

    /**
     * Sets the value of the getHistoricalCrossRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalCrossRate }
     *     
     */
    public void setGetHistoricalCrossRateResult(HistoricalCrossRate value) {
        this.getHistoricalCrossRateResult = value;
    }

}
