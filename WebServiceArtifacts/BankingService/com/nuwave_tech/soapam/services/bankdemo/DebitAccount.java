
package com.nuwave_tech.soapam.services.bankdemo;

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
 *         &lt;element name="requestMsg" type="{http://soapam.nuwave-tech.com/services/bankdemo}ipm_debit_account_request"/>
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
    "requestMsg"
})
@XmlRootElement(name = "debitAccount")
public class DebitAccount {

    @XmlElement(required = true)
    protected IpmDebitAccountRequest requestMsg;

    /**
     * Gets the value of the requestMsg property.
     * 
     * @return
     *     possible object is
     *     {@link IpmDebitAccountRequest }
     *     
     */
    public IpmDebitAccountRequest getRequestMsg() {
        return requestMsg;
    }

    /**
     * Sets the value of the requestMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpmDebitAccountRequest }
     *     
     */
    public void setRequestMsg(IpmDebitAccountRequest value) {
        this.requestMsg = value;
    }

}
