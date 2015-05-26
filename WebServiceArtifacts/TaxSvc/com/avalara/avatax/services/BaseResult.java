
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultCode" type="{http://avatax.avalara.com/services}SeverityLevel"/>
 *         &lt;element name="Messages" type="{http://avatax.avalara.com/services}ArrayOfMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResult", propOrder = {
    "transactionId",
    "resultCode",
    "messages"
})
@XmlSeeAlso({
    ApplyPaymentResult.class,
    GetTaxHistoryResult.class,
    CommitTaxResult.class,
    PingResult.class,
    TaxSummaryFetchResult.class,
    GetTaxResult.class,
    PostTaxResult.class,
    IsAuthorizedResult.class,
    CancelTaxResult.class,
    SearchTaxHistoryResult.class
})
public class BaseResult {

    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "ResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected SeverityLevel resultCode;
    @XmlElement(name = "Messages")
    protected ArrayOfMessage messages;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityLevel }
     *     
     */
    public SeverityLevel getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityLevel }
     *     
     */
    public void setResultCode(SeverityLevel value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessage }
     *     
     */
    public ArrayOfMessage getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessage }
     *     
     */
    public void setMessages(ArrayOfMessage value) {
        this.messages = value;
    }

}
