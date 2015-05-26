
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
 *         &lt;element name="GetPaymentHistoriesByExchangeResult" type="{http://www.xignite.com/services/}ArrayOfPaymentHistory" minOccurs="0"/>
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
    "getPaymentHistoriesByExchangeResult"
})
@XmlRootElement(name = "GetPaymentHistoriesByExchangeResponse")
public class GetPaymentHistoriesByExchangeResponse {

    @XmlElement(name = "GetPaymentHistoriesByExchangeResult")
    protected ArrayOfPaymentHistory getPaymentHistoriesByExchangeResult;

    /**
     * Gets the value of the getPaymentHistoriesByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentHistory }
     *     
     */
    public ArrayOfPaymentHistory getGetPaymentHistoriesByExchangeResult() {
        return getPaymentHistoriesByExchangeResult;
    }

    /**
     * Sets the value of the getPaymentHistoriesByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentHistory }
     *     
     */
    public void setGetPaymentHistoriesByExchangeResult(ArrayOfPaymentHistory value) {
        this.getPaymentHistoriesByExchangeResult = value;
    }

}
