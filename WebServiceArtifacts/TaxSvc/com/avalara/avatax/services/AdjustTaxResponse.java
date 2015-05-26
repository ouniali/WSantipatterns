
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
 *         &lt;element name="AdjustTaxResult" type="{http://avatax.avalara.com/services}AdjustTaxResult" minOccurs="0"/>
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
    "adjustTaxResult"
})
@XmlRootElement(name = "AdjustTaxResponse")
public class AdjustTaxResponse {

    @XmlElement(name = "AdjustTaxResult")
    protected AdjustTaxResult adjustTaxResult;

    /**
     * Gets the value of the adjustTaxResult property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustTaxResult }
     *     
     */
    public AdjustTaxResult getAdjustTaxResult() {
        return adjustTaxResult;
    }

    /**
     * Sets the value of the adjustTaxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustTaxResult }
     *     
     */
    public void setAdjustTaxResult(AdjustTaxResult value) {
        this.adjustTaxResult = value;
    }

}
