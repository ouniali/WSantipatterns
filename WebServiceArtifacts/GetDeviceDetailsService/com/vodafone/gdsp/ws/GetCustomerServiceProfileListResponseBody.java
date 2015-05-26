
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerServiceProfileListResponseBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerServiceProfileListResponseBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="customerServiceProfileList" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerServiceProfileListResponseBody", propOrder = {
    "returnCode",
    "customerServiceProfileList"
})
public class GetCustomerServiceProfileListResponseBody {

    protected ReturnCode returnCode;
    protected TCustomerServiceProfileItem customerServiceProfileList;

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
     * Gets the value of the customerServiceProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomerServiceProfileItem }
     *     
     */
    public TCustomerServiceProfileItem getCustomerServiceProfileList() {
        return customerServiceProfileList;
    }

    /**
     * Sets the value of the customerServiceProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerServiceProfileItem }
     *     
     */
    public void setCustomerServiceProfileList(TCustomerServiceProfileItem value) {
        this.customerServiceProfileList = value;
    }

}
