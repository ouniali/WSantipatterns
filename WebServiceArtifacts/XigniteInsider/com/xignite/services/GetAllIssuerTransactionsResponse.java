
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
 *         &lt;element name="GetAllIssuerTransactionsResult" type="{http://www.xignite.com/services/}IssuerTransactions" minOccurs="0"/>
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
    "getAllIssuerTransactionsResult"
})
@XmlRootElement(name = "GetAllIssuerTransactionsResponse")
public class GetAllIssuerTransactionsResponse {

    @XmlElement(name = "GetAllIssuerTransactionsResult")
    protected IssuerTransactions getAllIssuerTransactionsResult;

    /**
     * Gets the value of the getAllIssuerTransactionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerTransactions }
     *     
     */
    public IssuerTransactions getGetAllIssuerTransactionsResult() {
        return getAllIssuerTransactionsResult;
    }

    /**
     * Sets the value of the getAllIssuerTransactionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerTransactions }
     *     
     */
    public void setGetAllIssuerTransactionsResult(IssuerTransactions value) {
        this.getAllIssuerTransactionsResult = value;
    }

}
