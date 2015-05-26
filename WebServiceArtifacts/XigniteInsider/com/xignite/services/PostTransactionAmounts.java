
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postTransactionAmounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postTransactionAmounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sharesOwnedFollowingTransaction" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postTransactionAmounts", propOrder = {
    "sharesOwnedFollowingTransaction"
})
public class PostTransactionAmounts {

    protected Value sharesOwnedFollowingTransaction;

    /**
     * Gets the value of the sharesOwnedFollowingTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getSharesOwnedFollowingTransaction() {
        return sharesOwnedFollowingTransaction;
    }

    /**
     * Sets the value of the sharesOwnedFollowingTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setSharesOwnedFollowingTransaction(Value value) {
        this.sharesOwnedFollowingTransaction = value;
    }

}
