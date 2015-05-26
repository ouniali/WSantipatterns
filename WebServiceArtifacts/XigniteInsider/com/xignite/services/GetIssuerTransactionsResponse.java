
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
 *         &lt;element name="GetIssuerTransactionsResult" type="{http://www.xignite.com/services/}IssuerTransactions" minOccurs="0"/>
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
    "getIssuerTransactionsResult"
})
@XmlRootElement(name = "GetIssuerTransactionsResponse")
public class GetIssuerTransactionsResponse {

    @XmlElement(name = "GetIssuerTransactionsResult")
    protected IssuerTransactions getIssuerTransactionsResult;

    /**
     * Gets the value of the getIssuerTransactionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerTransactions }
     *     
     */
    public IssuerTransactions getGetIssuerTransactionsResult() {
        return getIssuerTransactionsResult;
    }

    /**
     * Sets the value of the getIssuerTransactionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerTransactions }
     *     
     */
    public void setGetIssuerTransactionsResult(IssuerTransactions value) {
        this.getIssuerTransactionsResult = value;
    }

}
