
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
 *         &lt;element name="GetDelayedEnergyFuturesBySessionResult" type="{http://www.xignite.com/services/}ArrayOfFutureQuote" minOccurs="0"/>
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
    "getDelayedEnergyFuturesBySessionResult"
})
@XmlRootElement(name = "GetDelayedEnergyFuturesBySessionResponse")
public class GetDelayedEnergyFuturesBySessionResponse {

    @XmlElement(name = "GetDelayedEnergyFuturesBySessionResult")
    protected ArrayOfFutureQuote getDelayedEnergyFuturesBySessionResult;

    /**
     * Gets the value of the getDelayedEnergyFuturesBySessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFutureQuote }
     *     
     */
    public ArrayOfFutureQuote getGetDelayedEnergyFuturesBySessionResult() {
        return getDelayedEnergyFuturesBySessionResult;
    }

    /**
     * Sets the value of the getDelayedEnergyFuturesBySessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFutureQuote }
     *     
     */
    public void setGetDelayedEnergyFuturesBySessionResult(ArrayOfFutureQuote value) {
        this.getDelayedEnergyFuturesBySessionResult = value;
    }

}
