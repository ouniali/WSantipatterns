
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
 *         &lt;element name="CancelTaxResult" type="{http://avatax.avalara.com/services}CancelTaxResult" minOccurs="0"/>
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
    "cancelTaxResult"
})
@XmlRootElement(name = "CancelTaxResponse")
public class CancelTaxResponse {

    @XmlElement(name = "CancelTaxResult")
    protected CancelTaxResult cancelTaxResult;

    /**
     * Gets the value of the cancelTaxResult property.
     * 
     * @return
     *     possible object is
     *     {@link CancelTaxResult }
     *     
     */
    public CancelTaxResult getCancelTaxResult() {
        return cancelTaxResult;
    }

    /**
     * Sets the value of the cancelTaxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelTaxResult }
     *     
     */
    public void setCancelTaxResult(CancelTaxResult value) {
        this.cancelTaxResult = value;
    }

}
