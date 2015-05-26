
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
 *         &lt;element name="GetInsiderTransactionSummaryResult" type="{http://www.xignite.com/services/}InsiderTransactionSummary" minOccurs="0"/>
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
    "getInsiderTransactionSummaryResult"
})
@XmlRootElement(name = "GetInsiderTransactionSummaryResponse")
public class GetInsiderTransactionSummaryResponse {

    @XmlElement(name = "GetInsiderTransactionSummaryResult")
    protected InsiderTransactionSummary getInsiderTransactionSummaryResult;

    /**
     * Gets the value of the getInsiderTransactionSummaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsiderTransactionSummary }
     *     
     */
    public InsiderTransactionSummary getGetInsiderTransactionSummaryResult() {
        return getInsiderTransactionSummaryResult;
    }

    /**
     * Sets the value of the getInsiderTransactionSummaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsiderTransactionSummary }
     *     
     */
    public void setGetInsiderTransactionSummaryResult(InsiderTransactionSummary value) {
        this.getInsiderTransactionSummaryResult = value;
    }

}
