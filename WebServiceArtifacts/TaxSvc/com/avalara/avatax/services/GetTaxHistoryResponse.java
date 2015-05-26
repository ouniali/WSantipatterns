
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
 *         &lt;element name="GetTaxHistoryResult" type="{http://avatax.avalara.com/services}GetTaxHistoryResult" minOccurs="0"/>
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
    "getTaxHistoryResult"
})
@XmlRootElement(name = "GetTaxHistoryResponse")
public class GetTaxHistoryResponse {

    @XmlElement(name = "GetTaxHistoryResult")
    protected GetTaxHistoryResult getTaxHistoryResult;

    /**
     * Gets the value of the getTaxHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetTaxHistoryResult }
     *     
     */
    public GetTaxHistoryResult getGetTaxHistoryResult() {
        return getTaxHistoryResult;
    }

    /**
     * Sets the value of the getTaxHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTaxHistoryResult }
     *     
     */
    public void setGetTaxHistoryResult(GetTaxHistoryResult value) {
        this.getTaxHistoryResult = value;
    }

}
