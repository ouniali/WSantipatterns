
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
 *         &lt;element name="TaxSummaryFetchResult" type="{http://avatax.avalara.com/services}TaxSummaryFetchResult" minOccurs="0"/>
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
    "taxSummaryFetchResult"
})
@XmlRootElement(name = "TaxSummaryFetchResponse")
public class TaxSummaryFetchResponse {

    @XmlElement(name = "TaxSummaryFetchResult")
    protected TaxSummaryFetchResult taxSummaryFetchResult;

    /**
     * Gets the value of the taxSummaryFetchResult property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummaryFetchResult }
     *     
     */
    public TaxSummaryFetchResult getTaxSummaryFetchResult() {
        return taxSummaryFetchResult;
    }

    /**
     * Sets the value of the taxSummaryFetchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryFetchResult }
     *     
     */
    public void setTaxSummaryFetchResult(TaxSummaryFetchResult value) {
        this.taxSummaryFetchResult = value;
    }

}
