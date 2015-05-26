
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
 *         &lt;element name="GetHistoricalEnergyFutureRangeResult" type="{http://www.xignite.com/services/}FutureQuotes" minOccurs="0"/>
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
    "getHistoricalEnergyFutureRangeResult"
})
@XmlRootElement(name = "GetHistoricalEnergyFutureRangeResponse")
public class GetHistoricalEnergyFutureRangeResponse {

    @XmlElement(name = "GetHistoricalEnergyFutureRangeResult")
    protected FutureQuotes getHistoricalEnergyFutureRangeResult;

    /**
     * Gets the value of the getHistoricalEnergyFutureRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link FutureQuotes }
     *     
     */
    public FutureQuotes getGetHistoricalEnergyFutureRangeResult() {
        return getHistoricalEnergyFutureRangeResult;
    }

    /**
     * Sets the value of the getHistoricalEnergyFutureRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureQuotes }
     *     
     */
    public void setGetHistoricalEnergyFutureRangeResult(FutureQuotes value) {
        this.getHistoricalEnergyFutureRangeResult = value;
    }

}
