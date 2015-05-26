
package com.carrierate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="quoteInfo" type="{http://carrierate.com/}QuoteInfo" minOccurs="0"/>
 *         &lt;element name="quoteItems" type="{http://carrierate.com/}ArrayOfQuoteItemsInfo" minOccurs="0"/>
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
    "quoteInfo",
    "quoteItems"
})
@XmlRootElement(name = "RateMyShipmentWithCarrierLiability")
public class RateMyShipmentWithCarrierLiability {

    protected QuoteInfo quoteInfo;
    protected ArrayOfQuoteItemsInfo quoteItems;

    /**
     * Gets the value of the quoteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteInfo }
     *     
     */
    public QuoteInfo getQuoteInfo() {
        return quoteInfo;
    }

    /**
     * Sets the value of the quoteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteInfo }
     *     
     */
    public void setQuoteInfo(QuoteInfo value) {
        this.quoteInfo = value;
    }

    /**
     * Gets the value of the quoteItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuoteItemsInfo }
     *     
     */
    public ArrayOfQuoteItemsInfo getQuoteItems() {
        return quoteItems;
    }

    /**
     * Sets the value of the quoteItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuoteItemsInfo }
     *     
     */
    public void setQuoteItems(ArrayOfQuoteItemsInfo value) {
        this.quoteItems = value;
    }

}
