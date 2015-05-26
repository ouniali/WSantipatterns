
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
 *         &lt;element name="GetInsiderTransactionsResult" type="{http://www.xignite.com/services/}InsiderTransactions" minOccurs="0"/>
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
    "getInsiderTransactionsResult"
})
@XmlRootElement(name = "GetInsiderTransactionsResponse")
public class GetInsiderTransactionsResponse {

    @XmlElement(name = "GetInsiderTransactionsResult")
    protected InsiderTransactions getInsiderTransactionsResult;

    /**
     * Gets the value of the getInsiderTransactionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsiderTransactions }
     *     
     */
    public InsiderTransactions getGetInsiderTransactionsResult() {
        return getInsiderTransactionsResult;
    }

    /**
     * Sets the value of the getInsiderTransactionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsiderTransactions }
     *     
     */
    public void setGetInsiderTransactionsResult(InsiderTransactions value) {
        this.getInsiderTransactionsResult = value;
    }

}
