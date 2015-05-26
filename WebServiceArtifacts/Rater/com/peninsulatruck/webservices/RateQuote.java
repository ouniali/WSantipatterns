
package com.peninsulatruck.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateQuote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quote" type="{http://peninsulatruck.com/WebServices/}quoteDetail" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://peninsulatruck.com/WebServices/}quoteError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateQuote", propOrder = {
    "quote",
    "errors"
})
public class RateQuote {

    protected QuoteDetail quote;
    protected QuoteError errors;

    /**
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteDetail }
     *     
     */
    public QuoteDetail getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteDetail }
     *     
     */
    public void setQuote(QuoteDetail value) {
        this.quote = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteError }
     *     
     */
    public QuoteError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteError }
     *     
     */
    public void setErrors(QuoteError value) {
        this.errors = value;
    }

}
