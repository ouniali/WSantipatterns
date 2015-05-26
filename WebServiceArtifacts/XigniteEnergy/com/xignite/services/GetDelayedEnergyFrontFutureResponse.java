
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
 *         &lt;element name="GetDelayedEnergyFrontFutureResult" type="{http://www.xignite.com/services/}FutureQuote" minOccurs="0"/>
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
    "getDelayedEnergyFrontFutureResult"
})
@XmlRootElement(name = "GetDelayedEnergyFrontFutureResponse")
public class GetDelayedEnergyFrontFutureResponse {

    @XmlElement(name = "GetDelayedEnergyFrontFutureResult")
    protected FutureQuote getDelayedEnergyFrontFutureResult;

    /**
     * Gets the value of the getDelayedEnergyFrontFutureResult property.
     * 
     * @return
     *     possible object is
     *     {@link FutureQuote }
     *     
     */
    public FutureQuote getGetDelayedEnergyFrontFutureResult() {
        return getDelayedEnergyFrontFutureResult;
    }

    /**
     * Sets the value of the getDelayedEnergyFrontFutureResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureQuote }
     *     
     */
    public void setGetDelayedEnergyFrontFutureResult(FutureQuote value) {
        this.getDelayedEnergyFrontFutureResult = value;
    }

}
