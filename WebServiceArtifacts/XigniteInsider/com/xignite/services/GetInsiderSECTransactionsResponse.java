
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
 *         &lt;element name="GetInsiderSECTransactionsResult" type="{http://www.xignite.com/services/}InsiderSECTransactions" minOccurs="0"/>
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
    "getInsiderSECTransactionsResult"
})
@XmlRootElement(name = "GetInsiderSECTransactionsResponse")
public class GetInsiderSECTransactionsResponse {

    @XmlElement(name = "GetInsiderSECTransactionsResult")
    protected InsiderSECTransactions getInsiderSECTransactionsResult;

    /**
     * Gets the value of the getInsiderSECTransactionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsiderSECTransactions }
     *     
     */
    public InsiderSECTransactions getGetInsiderSECTransactionsResult() {
        return getInsiderSECTransactionsResult;
    }

    /**
     * Sets the value of the getInsiderSECTransactionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsiderSECTransactions }
     *     
     */
    public void setGetInsiderSECTransactionsResult(InsiderSECTransactions value) {
        this.getInsiderSECTransactionsResult = value;
    }

}
