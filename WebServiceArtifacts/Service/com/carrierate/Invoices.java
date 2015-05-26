
package com.carrierate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Invoices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BOLNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRONumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PONumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BOLDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PayAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ProNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoices", propOrder = {
    "bolNumber",
    "proNumber",
    "poNumber",
    "bolDate",
    "dueDate",
    "invoiceDate",
    "originalAmount",
    "payAmount",
    "balance",
    "proNo"
})
public class Invoices {

    @XmlElement(name = "BOLNumber")
    protected String bolNumber;
    @XmlElement(name = "PRONumber")
    protected String proNumber;
    @XmlElement(name = "PONumber")
    protected String poNumber;
    @XmlElement(name = "BOLDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bolDate;
    @XmlElement(name = "DueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "InvoiceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(name = "OriginalAmount")
    protected double originalAmount;
    @XmlElement(name = "PayAmount")
    protected double payAmount;
    @XmlElement(name = "Balance")
    protected double balance;
    @XmlElement(name = "ProNo")
    protected String proNo;

    /**
     * Gets the value of the bolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOLNumber() {
        return bolNumber;
    }

    /**
     * Sets the value of the bolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOLNumber(String value) {
        this.bolNumber = value;
    }

    /**
     * Gets the value of the proNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRONumber() {
        return proNumber;
    }

    /**
     * Sets the value of the proNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRONumber(String value) {
        this.proNumber = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPONumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the bolDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBOLDate() {
        return bolDate;
    }

    /**
     * Sets the value of the bolDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBOLDate(XMLGregorianCalendar value) {
        this.bolDate = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the originalAmount property.
     * 
     */
    public double getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Sets the value of the originalAmount property.
     * 
     */
    public void setOriginalAmount(double value) {
        this.originalAmount = value;
    }

    /**
     * Gets the value of the payAmount property.
     * 
     */
    public double getPayAmount() {
        return payAmount;
    }

    /**
     * Sets the value of the payAmount property.
     * 
     */
    public void setPayAmount(double value) {
        this.payAmount = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     */
    public void setBalance(double value) {
        this.balance = value;
    }

    /**
     * Gets the value of the proNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProNo() {
        return proNo;
    }

    /**
     * Sets the value of the proNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProNo(String value) {
        this.proNo = value;
    }

}
