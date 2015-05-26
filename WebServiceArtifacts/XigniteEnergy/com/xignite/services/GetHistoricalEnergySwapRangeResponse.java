
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
 *         &lt;element name="GetHistoricalEnergySwapRangeResult" type="{http://www.xignite.com/services/}FutureQuotes" minOccurs="0"/>
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
    "getHistoricalEnergySwapRangeResult"
})
@XmlRootElement(name = "GetHistoricalEnergySwapRangeResponse")
public class GetHistoricalEnergySwapRangeResponse {

    @XmlElement(name = "GetHistoricalEnergySwapRangeResult")
    protected FutureQuotes getHistoricalEnergySwapRangeResult;

    /**
     * Gets the value of the getHistoricalEnergySwapRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link FutureQuotes }
     *     
     */
    public FutureQuotes getGetHistoricalEnergySwapRangeResult() {
        return getHistoricalEnergySwapRangeResult;
    }

    /**
     * Sets the value of the getHistoricalEnergySwapRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureQuotes }
     *     
     */
    public void setGetHistoricalEnergySwapRangeResult(FutureQuotes value) {
        this.getHistoricalEnergySwapRangeResult = value;
    }

}
