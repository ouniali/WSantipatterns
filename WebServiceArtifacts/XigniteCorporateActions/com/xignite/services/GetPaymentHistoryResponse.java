
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
 *         &lt;element name="GetPaymentHistoryResult" type="{http://www.xignite.com/services/}ArrayOfPaymentHistory" minOccurs="0"/>
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
    "getPaymentHistoryResult"
})
@XmlRootElement(name = "GetPaymentHistoryResponse")
public class GetPaymentHistoryResponse {

    @XmlElement(name = "GetPaymentHistoryResult")
    protected ArrayOfPaymentHistory getPaymentHistoryResult;

    /**
     * Gets the value of the getPaymentHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentHistory }
     *     
     */
    public ArrayOfPaymentHistory getGetPaymentHistoryResult() {
        return getPaymentHistoryResult;
    }

    /**
     * Sets the value of the getPaymentHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentHistory }
     *     
     */
    public void setGetPaymentHistoryResult(ArrayOfPaymentHistory value) {
        this.getPaymentHistoryResult = value;
    }

}
