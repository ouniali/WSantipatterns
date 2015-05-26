
package com.carrierate;

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
 *         &lt;element name="RateMyShipmentResult" type="{http://carrierate.com/}ArrayOfQuoteRates" minOccurs="0"/>
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
    "rateMyShipmentResult"
})
@XmlRootElement(name = "RateMyShipmentResponse")
public class RateMyShipmentResponse {

    @XmlElement(name = "RateMyShipmentResult")
    protected ArrayOfQuoteRates rateMyShipmentResult;

    /**
     * Gets the value of the rateMyShipmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuoteRates }
     *     
     */
    public ArrayOfQuoteRates getRateMyShipmentResult() {
        return rateMyShipmentResult;
    }

    /**
     * Sets the value of the rateMyShipmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuoteRates }
     *     
     */
    public void setRateMyShipmentResult(ArrayOfQuoteRates value) {
        this.rateMyShipmentResult = value;
    }

}
