
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
 *         &lt;element name="replyMsg" type="{http://soapam.nuwave-tech.com/services/bankdemo}ipm_debit_account_reply"/>
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
    "replyMsg"
})
@XmlRootElement(name = "debitAccountResponse")
public class DebitAccountResponse {

    @XmlElement(required = true, nillable = true)
    protected IpmDebitAccountReply replyMsg;

    /**
     * Gets the value of the replyMsg property.
     * 
     * @return
     *     possible object is
     *     {@link IpmDebitAccountReply }
     *     
     */
    public IpmDebitAccountReply getReplyMsg() {
        return replyMsg;
    }

    /**
     * Sets the value of the replyMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpmDebitAccountReply }
     *     
     */
    public void setReplyMsg(IpmDebitAccountReply value) {
        this.replyMsg = value;
    }

}
