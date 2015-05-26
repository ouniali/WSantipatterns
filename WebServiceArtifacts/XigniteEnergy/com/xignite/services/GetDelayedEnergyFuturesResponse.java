
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
 *         &lt;element name="GetDelayedEnergyFuturesResult" type="{http://www.xignite.com/services/}ArrayOfFutureQuote" minOccurs="0"/>
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
    "getDelayedEnergyFuturesResult"
})
@XmlRootElement(name = "GetDelayedEnergyFuturesResponse")
public class GetDelayedEnergyFuturesResponse {

    @XmlElement(name = "GetDelayedEnergyFuturesResult")
    protected ArrayOfFutureQuote getDelayedEnergyFuturesResult;

    /**
     * Gets the value of the getDelayedEnergyFuturesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFutureQuote }
     *     
     */
    public ArrayOfFutureQuote getGetDelayedEnergyFuturesResult() {
        return getDelayedEnergyFuturesResult;
    }

    /**
     * Sets the value of the getDelayedEnergyFuturesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFutureQuote }
     *     
     */
    public void setGetDelayedEnergyFuturesResult(ArrayOfFutureQuote value) {
        this.getDelayedEnergyFuturesResult = value;
    }

}
