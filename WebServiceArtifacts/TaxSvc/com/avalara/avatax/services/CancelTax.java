
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
 *         &lt;element name="CancelTaxRequest" type="{http://avatax.avalara.com/services}CancelTaxRequest" minOccurs="0"/>
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
    "cancelTaxRequest"
})
@XmlRootElement(name = "CancelTax")
public class CancelTax {

    @XmlElement(name = "CancelTaxRequest")
    protected CancelTaxRequest cancelTaxRequest;

    /**
     * Gets the value of the cancelTaxRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CancelTaxRequest }
     *     
     */
    public CancelTaxRequest getCancelTaxRequest() {
        return cancelTaxRequest;
    }

    /**
     * Sets the value of the cancelTaxRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelTaxRequest }
     *     
     */
    public void setCancelTaxRequest(CancelTaxRequest value) {
        this.cancelTaxRequest = value;
    }

}
