
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
 *         &lt;element name="GetSwapRateResult" type="{http://www.xignite.com/services/}SwapRate" minOccurs="0"/>
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
    "getSwapRateResult"
})
@XmlRootElement(name = "GetSwapRateResponse")
public class GetSwapRateResponse {

    @XmlElement(name = "GetSwapRateResult")
    protected SwapRate getSwapRateResult;

    /**
     * Gets the value of the getSwapRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwapRate }
     *     
     */
    public SwapRate getGetSwapRateResult() {
        return getSwapRateResult;
    }

    /**
     * Sets the value of the getSwapRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwapRate }
     *     
     */
    public void setGetSwapRateResult(SwapRate value) {
        this.getSwapRateResult = value;
    }

}
