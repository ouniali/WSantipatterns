
package com.exactor.ns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CommitResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CommitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InvoiceResponse" type="{http://www.exactor.com/ns}InvoiceResponseType" minOccurs="0"/>
 *         &lt;element name="PriorTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitResponseType", propOrder = {
    "transactionId",
    "transactionDate",
    "commitDate",
    "invoiceNumber",
    "invoiceResponse",
    "priorTransactionId"
})
public class CommitResponseType {

    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "TransactionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "CommitDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commitDate;
    @XmlElement(name = "InvoiceNumber", required = true)
    protected String invoiceNumber;
    @XmlElement(name = "InvoiceResponse")
    protected InvoiceResponseType invoiceResponse;
    @XmlElement(name = "PriorTransactionId")
    protected String priorTransactionId;

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
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the commitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitDate() {
        return commitDate;
    }

    /**
     * Sets the value of the commitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitDate(XMLGregorianCalendar value) {
        this.commitDate = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the invoiceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceResponseType }
     *     
     */
    public InvoiceResponseType getInvoiceResponse() {
        return invoiceResponse;
    }

    /**
     * Sets the value of the invoiceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceResponseType }
     *     
     */
    public void setInvoiceResponse(InvoiceResponseType value) {
        this.invoiceResponse = value;
    }

    /**
     * Gets the value of the priorTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorTransactionId() {
        return priorTransactionId;
    }

    /**
     * Sets the value of the priorTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorTransactionId(String value) {
        this.priorTransactionId = value;
    }

}
