
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="matchedResults" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="transactionList" type="{http://ws.gdsp.vodafone.com/}tTransactionItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionResponse", propOrder = {
    "returnCode",
    "matchedResults",
    "transactionList"
})
public class TransactionResponse {

    protected ReturnCode returnCode;
    protected long matchedResults;
    protected TTransactionItem transactionList;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCode }
     *     
     */
    public ReturnCode getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCode }
     *     
     */
    public void setReturnCode(ReturnCode value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the matchedResults property.
     * 
     */
    public long getMatchedResults() {
        return matchedResults;
    }

    /**
     * Sets the value of the matchedResults property.
     * 
     */
    public void setMatchedResults(long value) {
        this.matchedResults = value;
    }

    /**
     * Gets the value of the transactionList property.
     * 
     * @return
     *     possible object is
     *     {@link TTransactionItem }
     *     
     */
    public TTransactionItem getTransactionList() {
        return transactionList;
    }

    /**
     * Sets the value of the transactionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTransactionItem }
     *     
     */
    public void setTransactionList(TTransactionItem value) {
        this.transactionList = value;
    }

}
