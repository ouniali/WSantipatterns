
package com.serviceobjects;

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
 *         &lt;element name="GetExchangeRateResult" type="{http://www.serviceobjects.com/}ExchangeRateResponse" minOccurs="0"/>
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
    "getExchangeRateResult"
})
@XmlRootElement(name = "GetExchangeRateResponse")
public class GetExchangeRateResponse {

    @XmlElement(name = "GetExchangeRateResult")
    protected ExchangeRateResponse getExchangeRateResult;

    /**
     * Gets the value of the getExchangeRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateResponse }
     *     
     */
    public ExchangeRateResponse getGetExchangeRateResult() {
        return getExchangeRateResult;
    }

    /**
     * Sets the value of the getExchangeRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateResponse }
     *     
     */
    public void setGetExchangeRateResult(ExchangeRateResponse value) {
        this.getExchangeRateResult = value;
    }

}
