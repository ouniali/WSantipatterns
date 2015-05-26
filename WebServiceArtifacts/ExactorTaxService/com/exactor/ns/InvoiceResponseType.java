
package com.exactor.ns;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InvoiceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SaleDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.exactor.com/ns}CurrencyCodeType"/>
 *         &lt;element name="TaxClass" type="{http://www.exactor.com/ns}TaxClassType"/>
 *         &lt;element name="TaxDirection" type="{http://www.exactor.com/ns}TaxDirectionType"/>
 *         &lt;element name="ExemptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TaxObligation" type="{http://www.exactor.com/ns}TaxObligationType"/>
 *         &lt;element name="LineItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GrossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="TaxDirection" type="{http://www.exactor.com/ns}TaxDirectionType"/>
 *                   &lt;element name="TotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="TaxInfo" type="{http://www.exactor.com/ns}TaxInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceResponseType", propOrder = {
    "transactionId",
    "transactionDate",
    "saleDate",
    "purchaseOrderNumber",
    "currencyCode",
    "taxClass",
    "taxDirection",
    "exemptionId",
    "grossAmount",
    "totalTaxAmount",
    "taxObligation",
    "lineItem"
})
public class InvoiceResponseType {

    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "TransactionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "SaleDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleDate;
    @XmlElement(name = "PurchaseOrderNumber")
    protected String purchaseOrderNumber;
    @XmlElement(name = "CurrencyCode", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "TaxClass", required = true)
    @XmlSchemaType(name = "string")
    protected TaxClassType taxClass;
    @XmlElement(name = "TaxDirection", required = true)
    @XmlSchemaType(name = "string")
    protected TaxDirectionType taxDirection;
    @XmlElement(name = "ExemptionId")
    protected String exemptionId;
    @XmlElement(name = "GrossAmount", required = true)
    protected BigDecimal grossAmount;
    @XmlElement(name = "TotalTaxAmount", required = true)
    protected BigDecimal totalTaxAmount;
    @XmlElement(name = "TaxObligation", required = true)
    @XmlSchemaType(name = "string")
    protected TaxObligationType taxObligation;
    @XmlElement(name = "LineItem", required = true)
    protected List<InvoiceResponseType.LineItem> lineItem;

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
     * Gets the value of the saleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDate() {
        return saleDate;
    }

    /**
     * Sets the value of the saleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDate(XMLGregorianCalendar value) {
        this.saleDate = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNumber(String value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the taxClass property.
     * 
     * @return
     *     possible object is
     *     {@link TaxClassType }
     *     
     */
    public TaxClassType getTaxClass() {
        return taxClass;
    }

    /**
     * Sets the value of the taxClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxClassType }
     *     
     */
    public void setTaxClass(TaxClassType value) {
        this.taxClass = value;
    }

    /**
     * Gets the value of the taxDirection property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDirectionType }
     *     
     */
    public TaxDirectionType getTaxDirection() {
        return taxDirection;
    }

    /**
     * Sets the value of the taxDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDirectionType }
     *     
     */
    public void setTaxDirection(TaxDirectionType value) {
        this.taxDirection = value;
    }

    /**
     * Gets the value of the exemptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionId() {
        return exemptionId;
    }

    /**
     * Sets the value of the exemptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionId(String value) {
        this.exemptionId = value;
    }

    /**
     * Gets the value of the grossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    /**
     * Sets the value of the grossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossAmount(BigDecimal value) {
        this.grossAmount = value;
    }

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxAmount(BigDecimal value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the taxObligation property.
     * 
     * @return
     *     possible object is
     *     {@link TaxObligationType }
     *     
     */
    public TaxObligationType getTaxObligation() {
        return taxObligation;
    }

    /**
     * Sets the value of the taxObligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxObligationType }
     *     
     */
    public void setTaxObligation(TaxObligationType value) {
        this.taxObligation = value;
    }

    /**
     * Gets the value of the lineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceResponseType.LineItem }
     * 
     * 
     */
    public List<InvoiceResponseType.LineItem> getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<InvoiceResponseType.LineItem>();
        }
        return this.lineItem;
    }


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
     *         &lt;element name="GrossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="TaxDirection" type="{http://www.exactor.com/ns}TaxDirectionType"/>
     *         &lt;element name="TotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="TaxInfo" type="{http://www.exactor.com/ns}TaxInfoType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "grossAmount",
        "taxDirection",
        "totalTaxAmount",
        "taxInfo"
    })
    public static class LineItem {

        @XmlElement(name = "GrossAmount", required = true)
        protected BigDecimal grossAmount;
        @XmlElement(name = "TaxDirection", required = true)
        @XmlSchemaType(name = "string")
        protected TaxDirectionType taxDirection;
        @XmlElement(name = "TotalTaxAmount", required = true)
        protected BigDecimal totalTaxAmount;
        @XmlElement(name = "TaxInfo")
        protected List<TaxInfoType> taxInfo;
        @XmlAttribute(name = "id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Gets the value of the grossAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGrossAmount() {
            return grossAmount;
        }

        /**
         * Sets the value of the grossAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGrossAmount(BigDecimal value) {
            this.grossAmount = value;
        }

        /**
         * Gets the value of the taxDirection property.
         * 
         * @return
         *     possible object is
         *     {@link TaxDirectionType }
         *     
         */
        public TaxDirectionType getTaxDirection() {
            return taxDirection;
        }

        /**
         * Sets the value of the taxDirection property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxDirectionType }
         *     
         */
        public void setTaxDirection(TaxDirectionType value) {
            this.taxDirection = value;
        }

        /**
         * Gets the value of the totalTaxAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalTaxAmount() {
            return totalTaxAmount;
        }

        /**
         * Sets the value of the totalTaxAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalTaxAmount(BigDecimal value) {
            this.totalTaxAmount = value;
        }

        /**
         * Gets the value of the taxInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxInfoType }
         * 
         * 
         */
        public List<TaxInfoType> getTaxInfo() {
            if (taxInfo == null) {
                taxInfo = new ArrayList<TaxInfoType>();
            }
            return this.taxInfo;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
