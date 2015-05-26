
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
 *         &lt;element name="GetDelayedEnergySpotResult" type="{http://www.xignite.com/services/}FutureQuote" minOccurs="0"/>
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
    "getDelayedEnergySpotResult"
})
@XmlRootElement(name = "GetDelayedEnergySpotResponse")
public class GetDelayedEnergySpotResponse {

    @XmlElement(name = "GetDelayedEnergySpotResult")
    protected FutureQuote getDelayedEnergySpotResult;

    /**
     * Gets the value of the getDelayedEnergySpotResult property.
     * 
     * @return
     *     possible object is
     *     {@link FutureQuote }
     *     
     */
    public FutureQuote getGetDelayedEnergySpotResult() {
        return getDelayedEnergySpotResult;
    }

    /**
     * Sets the value of the getDelayedEnergySpotResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureQuote }
     *     
     */
    public void setGetDelayedEnergySpotResult(FutureQuote value) {
        this.getDelayedEnergySpotResult = value;
    }

}
