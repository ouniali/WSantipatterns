
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
 *         &lt;element name="GetAllDelayedEnergyFuturesBySessionResult" type="{http://www.xignite.com/services/}ArrayOfFutureQuote" minOccurs="0"/>
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
    "getAllDelayedEnergyFuturesBySessionResult"
})
@XmlRootElement(name = "GetAllDelayedEnergyFuturesBySessionResponse")
public class GetAllDelayedEnergyFuturesBySessionResponse {

    @XmlElement(name = "GetAllDelayedEnergyFuturesBySessionResult")
    protected ArrayOfFutureQuote getAllDelayedEnergyFuturesBySessionResult;

    /**
     * Gets the value of the getAllDelayedEnergyFuturesBySessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFutureQuote }
     *     
     */
    public ArrayOfFutureQuote getGetAllDelayedEnergyFuturesBySessionResult() {
        return getAllDelayedEnergyFuturesBySessionResult;
    }

    /**
     * Sets the value of the getAllDelayedEnergyFuturesBySessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFutureQuote }
     *     
     */
    public void setGetAllDelayedEnergyFuturesBySessionResult(ArrayOfFutureQuote value) {
        this.getAllDelayedEnergyFuturesBySessionResult = value;
    }

}
