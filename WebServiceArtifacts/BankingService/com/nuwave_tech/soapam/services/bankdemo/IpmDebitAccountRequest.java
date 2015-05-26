
package com.nuwave_tech.soapam.services.bankdemo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ipm_debit_account_request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ipm_debit_account_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request_code" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="account_number" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ipm_debit_account_request", propOrder = {
    "requestCode",
    "accountNumber",
    "amount"
})
public class IpmDebitAccountRequest {

    @XmlElement(name = "request_code")
    protected short requestCode;
    @XmlElement(name = "account_number", required = true)
    protected BigDecimal accountNumber;
    @XmlElement(required = true)
    protected BigDecimal amount;

    /**
     * Gets the value of the requestCode property.
     * 
     */
    public short getRequestCode() {
        return requestCode;
    }

    /**
     * Sets the value of the requestCode property.
     * 
     */
    public void setRequestCode(short value) {
        this.requestCode = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountNumber(BigDecimal value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
