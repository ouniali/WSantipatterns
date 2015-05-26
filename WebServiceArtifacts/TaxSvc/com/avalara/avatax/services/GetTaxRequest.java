
package com.avalara.avatax.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetTaxRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTaxRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocType" type="{http://avatax.avalara.com/services}DocumentType"/>
 *         &lt;element name="DocCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SalespersonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerUsageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PurchaseOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExemptionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://avatax.avalara.com/services}ArrayOfBaseAddress" minOccurs="0"/>
 *         &lt;element name="Lines" type="{http://avatax.avalara.com/services}ArrayOfLine" minOccurs="0"/>
 *         &lt;element name="DetailLevel" type="{http://avatax.avalara.com/services}DetailLevel"/>
 *         &lt;element name="ReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HashCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Commit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BatchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxOverride" type="{http://avatax.avalara.com/services}TaxOverride" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceMode" type="{http://avatax.avalara.com/services}ServiceMode"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ExchangeRateEffDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PosLaneCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessIdentificationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTaxRequest", propOrder = {
    "companyCode",
    "docType",
    "docCode",
    "docDate",
    "salespersonCode",
    "customerCode",
    "customerUsageType",
    "discount",
    "purchaseOrderNo",
    "exemptionNo",
    "originCode",
    "destinationCode",
    "addresses",
    "lines",
    "detailLevel",
    "referenceCode",
    "hashCode",
    "locationCode",
    "commit",
    "batchCode",
    "taxOverride",
    "currencyCode",
    "serviceMode",
    "paymentDate",
    "exchangeRate",
    "exchangeRateEffDate",
    "posLaneCode",
    "businessIdentificationNo"
})
public class GetTaxRequest {

    @XmlElement(name = "CompanyCode")
    protected String companyCode;
    @XmlElement(name = "DocType", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentType docType;
    @XmlElement(name = "DocCode")
    protected String docCode;
    @XmlElement(name = "DocDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    @XmlElement(name = "SalespersonCode")
    protected String salespersonCode;
    @XmlElement(name = "CustomerCode")
    protected String customerCode;
    @XmlElement(name = "CustomerUsageType")
    protected String customerUsageType;
    @XmlElement(name = "Discount", required = true)
    protected BigDecimal discount;
    @XmlElement(name = "PurchaseOrderNo")
    protected String purchaseOrderNo;
    @XmlElement(name = "ExemptionNo")
    protected String exemptionNo;
    @XmlElement(name = "OriginCode")
    protected String originCode;
    @XmlElement(name = "DestinationCode")
    protected String destinationCode;
    @XmlElement(name = "Addresses")
    protected ArrayOfBaseAddress addresses;
    @XmlElement(name = "Lines")
    protected ArrayOfLine lines;
    @XmlElement(name = "DetailLevel", required = true)
    @XmlSchemaType(name = "string")
    protected DetailLevel detailLevel;
    @XmlElement(name = "ReferenceCode")
    protected String referenceCode;
    @XmlElement(name = "HashCode")
    protected int hashCode;
    @XmlElement(name = "LocationCode")
    protected String locationCode;
    @XmlElement(name = "Commit")
    protected boolean commit;
    @XmlElement(name = "BatchCode")
    protected String batchCode;
    @XmlElement(name = "TaxOverride")
    protected TaxOverride taxOverride;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "ServiceMode", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceMode serviceMode;
    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "ExchangeRate", required = true)
    protected BigDecimal exchangeRate;
    @XmlElement(name = "ExchangeRateEffDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeRateEffDate;
    @XmlElement(name = "PosLaneCode")
    protected String posLaneCode;
    @XmlElement(name = "BusinessIdentificationNo")
    protected String businessIdentificationNo;

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocType(DocumentType value) {
        this.docType = value;
    }

    /**
     * Gets the value of the docCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCode() {
        return docCode;
    }

    /**
     * Sets the value of the docCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCode(String value) {
        this.docCode = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the salespersonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalespersonCode() {
        return salespersonCode;
    }

    /**
     * Sets the value of the salespersonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalespersonCode(String value) {
        this.salespersonCode = value;
    }

    /**
     * Gets the value of the customerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets the value of the customerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Gets the value of the customerUsageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUsageType() {
        return customerUsageType;
    }

    /**
     * Sets the value of the customerUsageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUsageType(String value) {
        this.customerUsageType = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the purchaseOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNo() {
        return purchaseOrderNo;
    }

    /**
     * Sets the value of the purchaseOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNo(String value) {
        this.purchaseOrderNo = value;
    }

    /**
     * Gets the value of the exemptionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionNo() {
        return exemptionNo;
    }

    /**
     * Sets the value of the exemptionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionNo(String value) {
        this.exemptionNo = value;
    }

    /**
     * Gets the value of the originCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCode() {
        return originCode;
    }

    /**
     * Sets the value of the originCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCode(String value) {
        this.originCode = value;
    }

    /**
     * Gets the value of the destinationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCode() {
        return destinationCode;
    }

    /**
     * Sets the value of the destinationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCode(String value) {
        this.destinationCode = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseAddress }
     *     
     */
    public ArrayOfBaseAddress getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseAddress }
     *     
     */
    public void setAddresses(ArrayOfBaseAddress value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLine }
     *     
     */
    public ArrayOfLine getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLine }
     *     
     */
    public void setLines(ArrayOfLine value) {
        this.lines = value;
    }

    /**
     * Gets the value of the detailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DetailLevel }
     *     
     */
    public DetailLevel getDetailLevel() {
        return detailLevel;
    }

    /**
     * Sets the value of the detailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailLevel }
     *     
     */
    public void setDetailLevel(DetailLevel value) {
        this.detailLevel = value;
    }

    /**
     * Gets the value of the referenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceCode() {
        return referenceCode;
    }

    /**
     * Sets the value of the referenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }

    /**
     * Gets the value of the hashCode property.
     * 
     */
    public int getHashCode() {
        return hashCode;
    }

    /**
     * Sets the value of the hashCode property.
     * 
     */
    public void setHashCode(int value) {
        this.hashCode = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the commit property.
     * 
     */
    public boolean isCommit() {
        return commit;
    }

    /**
     * Sets the value of the commit property.
     * 
     */
    public void setCommit(boolean value) {
        this.commit = value;
    }

    /**
     * Gets the value of the batchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchCode() {
        return batchCode;
    }

    /**
     * Sets the value of the batchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchCode(String value) {
        this.batchCode = value;
    }

    /**
     * Gets the value of the taxOverride property.
     * 
     * @return
     *     possible object is
     *     {@link TaxOverride }
     *     
     */
    public TaxOverride getTaxOverride() {
        return taxOverride;
    }

    /**
     * Sets the value of the taxOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxOverride }
     *     
     */
    public void setTaxOverride(TaxOverride value) {
        this.taxOverride = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the serviceMode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceMode }
     *     
     */
    public ServiceMode getServiceMode() {
        return serviceMode;
    }

    /**
     * Sets the value of the serviceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceMode }
     *     
     */
    public void setServiceMode(ServiceMode value) {
        this.serviceMode = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the exchangeRateEffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeRateEffDate() {
        return exchangeRateEffDate;
    }

    /**
     * Sets the value of the exchangeRateEffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeRateEffDate(XMLGregorianCalendar value) {
        this.exchangeRateEffDate = value;
    }

    /**
     * Gets the value of the posLaneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosLaneCode() {
        return posLaneCode;
    }

    /**
     * Sets the value of the posLaneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosLaneCode(String value) {
        this.posLaneCode = value;
    }

    /**
     * Gets the value of the businessIdentificationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessIdentificationNo() {
        return businessIdentificationNo;
    }

    /**
     * Sets the value of the businessIdentificationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessIdentificationNo(String value) {
        this.businessIdentificationNo = value;
    }

}
