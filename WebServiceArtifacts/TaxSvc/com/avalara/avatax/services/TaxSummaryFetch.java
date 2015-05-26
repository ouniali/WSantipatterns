
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
 *         &lt;element name="TaxSummaryFetchRequest" type="{http://avatax.avalara.com/services}TaxSummaryFetchRequest" minOccurs="0"/>
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
    "taxSummaryFetchRequest"
})
@XmlRootElement(name = "TaxSummaryFetch")
public class TaxSummaryFetch {

    @XmlElement(name = "TaxSummaryFetchRequest")
    protected TaxSummaryFetchRequest taxSummaryFetchRequest;

    /**
     * Gets the value of the taxSummaryFetchRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummaryFetchRequest }
     *     
     */
    public TaxSummaryFetchRequest getTaxSummaryFetchRequest() {
        return taxSummaryFetchRequest;
    }

    /**
     * Sets the value of the taxSummaryFetchRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryFetchRequest }
     *     
     */
    public void setTaxSummaryFetchRequest(TaxSummaryFetchRequest value) {
        this.taxSummaryFetchRequest = value;
    }

}
