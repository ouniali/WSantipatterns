
package com.peninsulatruck.webservices;

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
 *         &lt;element name="CreateQuoteResult" type="{http://peninsulatruck.com/WebServices/}rateQuote" minOccurs="0"/>
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
    "createQuoteResult"
})
@XmlRootElement(name = "CreateQuoteResponse")
public class CreateQuoteResponse {

    @XmlElement(name = "CreateQuoteResult")
    protected RateQuote createQuoteResult;

    /**
     * Gets the value of the createQuoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link RateQuote }
     *     
     */
    public RateQuote getCreateQuoteResult() {
        return createQuoteResult;
    }

    /**
     * Sets the value of the createQuoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateQuote }
     *     
     */
    public void setCreateQuoteResult(RateQuote value) {
        this.createQuoteResult = value;
    }

}
