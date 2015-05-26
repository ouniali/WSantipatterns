
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerSimOrderListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerSimOrderListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="matchedResults" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="customerSimOrderList" type="{http://ws.gdsp.vodafone.com/}customerSimOrderListItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerSimOrderListResponse", propOrder = {
    "returnCode",
    "matchedResults",
    "customerSimOrderList"
})
public class CustomerSimOrderListResponse {

    protected ReturnCode returnCode;
    protected Long matchedResults;
    protected CustomerSimOrderListItem customerSimOrderList;

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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMatchedResults() {
        return matchedResults;
    }

    /**
     * Sets the value of the matchedResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMatchedResults(Long value) {
        this.matchedResults = value;
    }

    /**
     * Gets the value of the customerSimOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSimOrderListItem }
     *     
     */
    public CustomerSimOrderListItem getCustomerSimOrderList() {
        return customerSimOrderList;
    }

    /**
     * Sets the value of the customerSimOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSimOrderListItem }
     *     
     */
    public void setCustomerSimOrderList(CustomerSimOrderListItem value) {
        this.customerSimOrderList = value;
    }

}
