
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
 *         &lt;element name="RateMyShipmentWithCarrierLiabilityResult" type="{http://carrierate.com/}ArrayOfQuoteRatesWithCarrierLiability" minOccurs="0"/>
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
    "rateMyShipmentWithCarrierLiabilityResult"
})
@XmlRootElement(name = "RateMyShipmentWithCarrierLiabilityResponse")
public class RateMyShipmentWithCarrierLiabilityResponse {

    @XmlElement(name = "RateMyShipmentWithCarrierLiabilityResult")
    protected ArrayOfQuoteRatesWithCarrierLiability rateMyShipmentWithCarrierLiabilityResult;

    /**
     * Gets the value of the rateMyShipmentWithCarrierLiabilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuoteRatesWithCarrierLiability }
     *     
     */
    public ArrayOfQuoteRatesWithCarrierLiability getRateMyShipmentWithCarrierLiabilityResult() {
        return rateMyShipmentWithCarrierLiabilityResult;
    }

    /**
     * Sets the value of the rateMyShipmentWithCarrierLiabilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuoteRatesWithCarrierLiability }
     *     
     */
    public void setRateMyShipmentWithCarrierLiabilityResult(ArrayOfQuoteRatesWithCarrierLiability value) {
        this.rateMyShipmentWithCarrierLiabilityResult = value;
    }

}
