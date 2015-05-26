
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
 *         &lt;element name="AdjustTaxRequest" type="{http://avatax.avalara.com/services}AdjustTaxRequest" minOccurs="0"/>
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
    "adjustTaxRequest"
})
@XmlRootElement(name = "AdjustTax")
public class AdjustTax {

    @XmlElement(name = "AdjustTaxRequest")
    protected AdjustTaxRequest adjustTaxRequest;

    /**
     * Gets the value of the adjustTaxRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustTaxRequest }
     *     
     */
    public AdjustTaxRequest getAdjustTaxRequest() {
        return adjustTaxRequest;
    }

    /**
     * Sets the value of the adjustTaxRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustTaxRequest }
     *     
     */
    public void setAdjustTaxRequest(AdjustTaxRequest value) {
        this.adjustTaxRequest = value;
    }

}
