
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
 *         &lt;element name="GetSwaptionResult" type="{http://www.xignite.com/services/}Swaption" minOccurs="0"/>
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
    "getSwaptionResult"
})
@XmlRootElement(name = "GetSwaptionResponse")
public class GetSwaptionResponse {

    @XmlElement(name = "GetSwaptionResult")
    protected Swaption getSwaptionResult;

    /**
     * Gets the value of the getSwaptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Swaption }
     *     
     */
    public Swaption getGetSwaptionResult() {
        return getSwaptionResult;
    }

    /**
     * Sets the value of the getSwaptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Swaption }
     *     
     */
    public void setGetSwaptionResult(Swaption value) {
        this.getSwaptionResult = value;
    }

}
