
package com.nuwave_tech.soapam.services.bankdemo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ipm_credit_account_reply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ipm_credit_account_reply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reply_code" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ipm_credit_account_reply", propOrder = {
    "replyCode",
    "balance"
})
public class IpmCreditAccountReply {

    @XmlElement(name = "reply_code")
    protected short replyCode;
    @XmlElement(required = true)
    protected BigDecimal balance;

    /**
     * Gets the value of the replyCode property.
     * 
     */
    public short getReplyCode() {
        return replyCode;
    }

    /**
     * Sets the value of the replyCode property.
     * 
     */
    public void setReplyCode(short value) {
        this.replyCode = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

}
