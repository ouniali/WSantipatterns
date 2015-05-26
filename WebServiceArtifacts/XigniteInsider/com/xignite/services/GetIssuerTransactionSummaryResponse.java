
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
 *         &lt;element name="GetIssuerTransactionSummaryResult" type="{http://www.xignite.com/services/}IssuerTransactionSummary" minOccurs="0"/>
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
    "getIssuerTransactionSummaryResult"
})
@XmlRootElement(name = "GetIssuerTransactionSummaryResponse")
public class GetIssuerTransactionSummaryResponse {

    @XmlElement(name = "GetIssuerTransactionSummaryResult")
    protected IssuerTransactionSummary getIssuerTransactionSummaryResult;

    /**
     * Gets the value of the getIssuerTransactionSummaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerTransactionSummary }
     *     
     */
    public IssuerTransactionSummary getGetIssuerTransactionSummaryResult() {
        return getIssuerTransactionSummaryResult;
    }

    /**
     * Sets the value of the getIssuerTransactionSummaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerTransactionSummary }
     *     
     */
    public void setGetIssuerTransactionSummaryResult(IssuerTransactionSummary value) {
        this.getIssuerTransactionSummaryResult = value;
    }

}
