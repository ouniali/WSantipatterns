
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
 *         &lt;element name="GetTaxResult" type="{http://avatax.avalara.com/services}GetTaxResult" minOccurs="0"/>
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
    "getTaxResult"
})
@XmlRootElement(name = "GetTaxResponse")
public class GetTaxResponse {

    @XmlElement(name = "GetTaxResult")
    protected GetTaxResult getTaxResult;

    /**
     * Gets the value of the getTaxResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetTaxResult }
     *     
     */
    public GetTaxResult getGetTaxResult() {
        return getTaxResult;
    }

    /**
     * Sets the value of the getTaxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTaxResult }
     *     
     */
    public void setGetTaxResult(GetTaxResult value) {
        this.getTaxResult = value;
    }

}
