
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
 * <p>Java class for InvoiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.exactor.com/ns}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="TaxClass" type="{http://www.exactor.com/ns}TaxClassType" minOccurs="0"/>
 *         &lt;element name="TaxDirection" type="{http://www.exactor.com/ns}TaxDirectionType" minOccurs="0"/>
 *         &lt;element name="ExemptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillTo" type="{http://www.exactor.com/ns}AddressType" minOccurs="0"/>
 *         &lt;element name="ShipTo" type="{http://www.exactor.com/ns}AddressType" minOccurs="0"/>
 *         &lt;element name="ShipFrom" type="{http://www.exactor.com/ns}AddressType" minOccurs="0"/>
 *         &lt;element name="LineItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="GrossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="TaxDirection" type="{http://www.exactor.com/ns}TaxDirectionType" minOccurs="0"/>
 *                   &lt;element name="BillTo" type="{http://www.exactor.com/ns}AddressType" minOccurs="0"/>
 *                   &lt;element name="ShipTo" type="{http://www.exactor.com/ns}AddressType" minOccurs="0"/>
 *                   &lt;element name="ShipFrom" type="{http://www.exactor.com/ns}AddressType" minOccurs="0"/>
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
@XmlType(name = "InvoiceRequestType", propOrder = {
    "saleDate",
    "purchaseOrderNumber",
    "currencyCode",
    "taxClass",
    "taxDirection",
    "exemptionId",
    "billTo",
    "shipTo",
    "shipFrom",
    "lineItem"
})
public class InvoiceRequestType {

    @XmlElement(name = "SaleDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleDate;
    @XmlElement(name = "PurchaseOrderNumber")
    protected String purchaseOrderNumber;
    @XmlElement(name = "CurrencyCode")
    @XmlSchemaType(name = "string")
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "TaxClass")
    @XmlSchemaType(name = "string")
    protected TaxClassType taxClass;
    @XmlElement(name = "TaxDirection")
    @XmlSchemaType(name = "string")
    protected TaxDirectionType taxDirection;
    @XmlElement(name = "ExemptionId")
    protected String exemptionId;
    @XmlElement(name = "BillTo")
    protected AddressType billTo;
    @XmlElement(name = "ShipTo")
    protected AddressType shipTo;
    @XmlElement(name = "ShipFrom")
    protected AddressType shipFrom;
    @XmlElement(name = "LineItem", required = true)
    protected List<InvoiceRequestType.LineItem> lineItem;

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
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBillTo(AddressType value) {
        this.billTo = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setShipTo(AddressType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setShipFrom(AddressType value) {
        this.shipFrom = value;
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
     * {@link InvoiceRequestType.LineItem }
     * 
     * 
     */
    public List<InvoiceRequestType.LineItem> getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<InvoiceRequestType.LineItem>();
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
     *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="GrossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="TaxDirection" type="{http://www.exactor.com/ns}TaxDirectionType" minOccurs="0"/>
     *         &lt;element name="BillTo" type="{http://www.exactor.com/ns}AddressType" minOccurs="0"/>
     *         &lt;element name="ShipTo" type="{http://www.exactor.com/ns}AddressType" minOccurs="0"/>
     *         &lt;element name="ShipFrom" type="{http://www.exactor.com/ns}AddressType" minOccurs="0"/>
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
        "sku",
        "description",
        "quantity",
        "grossAmount",
        "taxDirection",
        "billTo",
        "shipTo",
        "shipFrom"
    })
    public static class LineItem {

        @XmlElement(name = "SKU")
        protected String sku;
        @XmlElement(name = "Description")
        protected String description;
        @XmlElement(name = "Quantity")
        protected BigDecimal quantity;
        @XmlElement(name = "GrossAmount", required = true)
        protected BigDecimal grossAmount;
        @XmlElement(name = "TaxDirection")
        @XmlSchemaType(name = "string")
        protected TaxDirectionType taxDirection;
        @XmlElement(name = "BillTo")
        protected AddressType billTo;
        @XmlElement(name = "ShipTo")
        protected AddressType shipTo;
        @XmlElement(name = "ShipFrom")
        protected AddressType shipFrom;
        @XmlAttribute(name = "id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Gets the value of the sku property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSKU() {
            return sku;
        }

        /**
         * Sets the value of the sku property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSKU(String value) {
            this.sku = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setQuantity(BigDecimal value) {
            this.quantity = value;
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
         * Gets the value of the billTo property.
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getBillTo() {
            return billTo;
        }

        /**
         * Sets the value of the billTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         */
        public void setBillTo(AddressType value) {
            this.billTo = value;
        }

        /**
         * Gets the value of the shipTo property.
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getShipTo() {
            return shipTo;
        }

        /**
         * Sets the value of the shipTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         */
        public void setShipTo(AddressType value) {
            this.shipTo = value;
        }

        /**
         * Gets the value of the shipFrom property.
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getShipFrom() {
            return shipFrom;
        }

        /**
         * Sets the value of the shipFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         */
        public void setShipFrom(AddressType value) {
            this.shipFrom = value;
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
