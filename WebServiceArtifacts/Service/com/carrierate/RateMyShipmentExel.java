
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
 *         &lt;element name="quoteInfo" type="{http://carrierate.com/}QuoteInfo" minOccurs="0"/>
 *         &lt;element name="exelKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfirmQuoteRequestExel" type="{http://carrierate.com/}ConfirmQuoteRequestExel"/>
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
    "exelKey",
    "confirmQuoteRequestExel"
})
@XmlRootElement(name = "RateMyShipmentExel")
public class RateMyShipmentExel {

    protected QuoteInfo quoteInfo;
    protected String exelKey;
    @XmlElement(name = "ConfirmQuoteRequestExel", required = true, nillable = true)
    protected ConfirmQuoteRequestExel confirmQuoteRequestExel;

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
     * Gets the value of the exelKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExelKey() {
        return exelKey;
    }

    /**
     * Sets the value of the exelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExelKey(String value) {
        this.exelKey = value;
    }

    /**
     * Gets the value of the confirmQuoteRequestExel property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmQuoteRequestExel }
     *     
     */
    public ConfirmQuoteRequestExel getConfirmQuoteRequestExel() {
        return confirmQuoteRequestExel;
    }

    /**
     * Sets the value of the confirmQuoteRequestExel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmQuoteRequestExel }
     *     
     */
    public void setConfirmQuoteRequestExel(ConfirmQuoteRequestExel value) {
        this.confirmQuoteRequestExel = value;
    }

}
