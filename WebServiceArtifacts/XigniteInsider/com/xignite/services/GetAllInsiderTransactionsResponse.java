
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
 *         &lt;element name="GetAllInsiderTransactionsResult" type="{http://www.xignite.com/services/}InsiderTransactions" minOccurs="0"/>
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
    "getAllInsiderTransactionsResult"
})
@XmlRootElement(name = "GetAllInsiderTransactionsResponse")
public class GetAllInsiderTransactionsResponse {

    @XmlElement(name = "GetAllInsiderTransactionsResult")
    protected InsiderTransactions getAllInsiderTransactionsResult;

    /**
     * Gets the value of the getAllInsiderTransactionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsiderTransactions }
     *     
     */
    public InsiderTransactions getGetAllInsiderTransactionsResult() {
        return getAllInsiderTransactionsResult;
    }

    /**
     * Sets the value of the getAllInsiderTransactionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsiderTransactions }
     *     
     */
    public void setGetAllInsiderTransactionsResult(InsiderTransactions value) {
        this.getAllInsiderTransactionsResult = value;
    }

}
