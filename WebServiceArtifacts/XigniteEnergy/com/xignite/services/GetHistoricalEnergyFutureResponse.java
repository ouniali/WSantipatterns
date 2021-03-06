
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
 *         &lt;element name="GetHistoricalEnergyFutureResult" type="{http://www.xignite.com/services/}FutureQuote" minOccurs="0"/>
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
    "getHistoricalEnergyFutureResult"
})
@XmlRootElement(name = "GetHistoricalEnergyFutureResponse")
public class GetHistoricalEnergyFutureResponse {

    @XmlElement(name = "GetHistoricalEnergyFutureResult")
    protected FutureQuote getHistoricalEnergyFutureResult;

    /**
     * Gets the value of the getHistoricalEnergyFutureResult property.
     * 
     * @return
     *     possible object is
     *     {@link FutureQuote }
     *     
     */
    public FutureQuote getGetHistoricalEnergyFutureResult() {
        return getHistoricalEnergyFutureResult;
    }

    /**
     * Sets the value of the getHistoricalEnergyFutureResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureQuote }
     *     
     */
    public void setGetHistoricalEnergyFutureResult(FutureQuote value) {
        this.getHistoricalEnergyFutureResult = value;
    }

}
