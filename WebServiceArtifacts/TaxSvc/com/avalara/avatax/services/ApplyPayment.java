
package com.avalara.avatax.services;

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
 *         &lt;element name="ApplyPaymentRequest" type="{http://avatax.avalara.com/services}ApplyPaymentRequest" minOccurs="0"/>
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
    "applyPaymentRequest"
})
@XmlRootElement(name = "ApplyPayment")
public class ApplyPayment {

    @XmlElement(name = "ApplyPaymentRequest")
    protected ApplyPaymentRequest applyPaymentRequest;

    /**
     * Gets the value of the applyPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ApplyPaymentRequest }
     *     
     */
    public ApplyPaymentRequest getApplyPaymentRequest() {
        return applyPaymentRequest;
    }

    /**
     * Sets the value of the applyPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplyPaymentRequest }
     *     
     */
    public void setApplyPaymentRequest(ApplyPaymentRequest value) {
        this.applyPaymentRequest = value;
    }

}
