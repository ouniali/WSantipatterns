
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
 *         &lt;element name="GetDelayedEnergyFutureResult" type="{http://www.xignite.com/services/}FutureQuote" minOccurs="0"/>
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
    "getDelayedEnergyFutureResult"
})
@XmlRootElement(name = "GetDelayedEnergyFutureResponse")
public class GetDelayedEnergyFutureResponse {

    @XmlElement(name = "GetDelayedEnergyFutureResult")
    protected FutureQuote getDelayedEnergyFutureResult;

    /**
     * Gets the value of the getDelayedEnergyFutureResult property.
     * 
     * @return
     *     possible object is
     *     {@link FutureQuote }
     *     
     */
    public FutureQuote getGetDelayedEnergyFutureResult() {
        return getDelayedEnergyFutureResult;
    }

    /**
     * Sets the value of the getDelayedEnergyFutureResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureQuote }
     *     
     */
    public void setGetDelayedEnergyFutureResult(FutureQuote value) {
        this.getDelayedEnergyFutureResult = value;
    }

}
