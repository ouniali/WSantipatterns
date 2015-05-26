
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
 *         &lt;element name="GetSingleInvoiceResult" type="{http://carrierate.com/}Invoices" minOccurs="0"/>
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
    "getSingleInvoiceResult"
})
@XmlRootElement(name = "GetSingleInvoiceResponse")
public class GetSingleInvoiceResponse {

    @XmlElement(name = "GetSingleInvoiceResult")
    protected Invoices getSingleInvoiceResult;

    /**
     * Gets the value of the getSingleInvoiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link Invoices }
     *     
     */
    public Invoices getGetSingleInvoiceResult() {
        return getSingleInvoiceResult;
    }

    /**
     * Sets the value of the getSingleInvoiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoices }
     *     
     */
    public void setGetSingleInvoiceResult(Invoices value) {
        this.getSingleInvoiceResult = value;
    }

}
