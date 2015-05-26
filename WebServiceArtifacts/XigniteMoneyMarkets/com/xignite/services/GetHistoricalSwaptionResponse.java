
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
 *         &lt;element name="GetHistoricalSwaptionResult" type="{http://www.xignite.com/services/}Swaption" minOccurs="0"/>
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
    "getHistoricalSwaptionResult"
})
@XmlRootElement(name = "GetHistoricalSwaptionResponse")
public class GetHistoricalSwaptionResponse {

    @XmlElement(name = "GetHistoricalSwaptionResult")
    protected Swaption getHistoricalSwaptionResult;

    /**
     * Gets the value of the getHistoricalSwaptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Swaption }
     *     
     */
    public Swaption getGetHistoricalSwaptionResult() {
        return getHistoricalSwaptionResult;
    }

    /**
     * Sets the value of the getHistoricalSwaptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Swaption }
     *     
     */
    public void setGetHistoricalSwaptionResult(Swaption value) {
        this.getHistoricalSwaptionResult = value;
    }

}
