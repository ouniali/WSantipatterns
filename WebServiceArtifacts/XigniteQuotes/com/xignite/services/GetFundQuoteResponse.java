
package com.xignite.services;

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
 *         &lt;element name="GetFundQuoteResult" type="{http://www.xignite.com/services/}ExtendedFundQuote" minOccurs="0"/>
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
    "getFundQuoteResult"
})
@XmlRootElement(name = "GetFundQuoteResponse")
public class GetFundQuoteResponse {

    @XmlElement(name = "GetFundQuoteResult")
    protected ExtendedFundQuote getFundQuoteResult;

    /**
     * Gets the value of the getFundQuoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedFundQuote }
     *     
     */
    public ExtendedFundQuote getGetFundQuoteResult() {
        return getFundQuoteResult;
    }

    /**
     * Sets the value of the getFundQuoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedFundQuote }
     *     
     */
    public void setGetFundQuoteResult(ExtendedFundQuote value) {
        this.getFundQuoteResult = value;
    }

}
