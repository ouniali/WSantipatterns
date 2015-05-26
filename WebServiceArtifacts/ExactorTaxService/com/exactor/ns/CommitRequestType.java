
package com.exactor.ns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CommitRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InvoiceRequest" type="{http://www.exactor.com/ns}InvoiceRequestType" minOccurs="0"/>
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
@XmlType(name = "CommitRequestType", propOrder = {
    "commitDate",
    "invoiceNumber",
    "invoiceRequest",
    "priorTransactionId"
})
public class CommitRequestType {

    @XmlElement(name = "CommitDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commitDate;
    @XmlElement(name = "InvoiceNumber", required = true)
    protected String invoiceNumber;
    @XmlElement(name = "InvoiceRequest")
    protected InvoiceRequestType invoiceRequest;
    @XmlElement(name = "PriorTransactionId")
    protected String priorTransactionId;

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
     * Gets the value of the invoiceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceRequestType }
     *     
     */
    public InvoiceRequestType getInvoiceRequest() {
        return invoiceRequest;
    }

    /**
     * Sets the value of the invoiceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceRequestType }
     *     
     */
    public void setInvoiceRequest(InvoiceRequestType value) {
        this.invoiceRequest = value;
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
