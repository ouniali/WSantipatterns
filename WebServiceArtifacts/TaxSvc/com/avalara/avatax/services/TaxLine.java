
package com.avalara.avatax.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TaxLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Taxability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BoundaryLevel" type="{http://avatax.avalara.com/services}BoundaryLevel"/>
 *         &lt;element name="Exemption" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Taxable" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TaxCalculated" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TaxDetails" type="{http://avatax.avalara.com/services}ArrayOfTaxDetail" minOccurs="0"/>
 *         &lt;element name="ExemptCertId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TaxDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ReportingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="AccountingMethod" type="{http://avatax.avalara.com/services}AccountingMethod"/>
 *         &lt;element name="TaxIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxLine", propOrder = {
    "no",
    "taxCode",
    "taxability",
    "boundaryLevel",
    "exemption",
    "discount",
    "taxable",
    "rate",
    "tax",
    "taxCalculated",
    "taxDetails",
    "exemptCertId",
    "taxDate",
    "reportingDate",
    "accountingMethod",
    "taxIncluded"
})
public class TaxLine {

    @XmlElement(name = "No")
    protected String no;
    @XmlElement(name = "TaxCode")
    protected String taxCode;
    @XmlElement(name = "Taxability")
    protected boolean taxability;
    @XmlElement(name = "BoundaryLevel", required = true)
    @XmlSchemaType(name = "string")
    protected BoundaryLevel boundaryLevel;
    @XmlElement(name = "Exemption", required = true)
    protected BigDecimal exemption;
    @XmlElement(name = "Discount", required = true)
    protected BigDecimal discount;
    @XmlElement(name = "Taxable", required = true)
    protected BigDecimal taxable;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "Tax", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "TaxCalculated", required = true)
    protected BigDecimal taxCalculated;
    @XmlElement(name = "TaxDetails")
    protected ArrayOfTaxDetail taxDetails;
    @XmlElement(name = "ExemptCertId")
    protected int exemptCertId;
    @XmlElement(name = "TaxDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDate;
    @XmlElement(name = "ReportingDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportingDate;
    @XmlElement(name = "AccountingMethod", required = true)
    @XmlSchemaType(name = "string")
    protected AccountingMethod accountingMethod;
    @XmlElement(name = "TaxIncluded", defaultValue = "false")
    protected Boolean taxIncluded;

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo(String value) {
        this.no = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxability property.
     * 
     */
    public boolean isTaxability() {
        return taxability;
    }

    /**
     * Sets the value of the taxability property.
     * 
     */
    public void setTaxability(boolean value) {
        this.taxability = value;
    }

    /**
     * Gets the value of the boundaryLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BoundaryLevel }
     *     
     */
    public BoundaryLevel getBoundaryLevel() {
        return boundaryLevel;
    }

    /**
     * Sets the value of the boundaryLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundaryLevel }
     *     
     */
    public void setBoundaryLevel(BoundaryLevel value) {
        this.boundaryLevel = value;
    }

    /**
     * Gets the value of the exemption property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExemption() {
        return exemption;
    }

    /**
     * Sets the value of the exemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExemption(BigDecimal value) {
        this.exemption = value;
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
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxable() {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxable(BigDecimal value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the taxCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxCalculated() {
        return taxCalculated;
    }

    /**
     * Sets the value of the taxCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxCalculated(BigDecimal value) {
        this.taxCalculated = value;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaxDetail }
     *     
     */
    public ArrayOfTaxDetail getTaxDetails() {
        return taxDetails;
    }

    /**
     * Sets the value of the taxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaxDetail }
     *     
     */
    public void setTaxDetails(ArrayOfTaxDetail value) {
        this.taxDetails = value;
    }

    /**
     * Gets the value of the exemptCertId property.
     * 
     */
    public int getExemptCertId() {
        return exemptCertId;
    }

    /**
     * Sets the value of the exemptCertId property.
     * 
     */
    public void setExemptCertId(int value) {
        this.exemptCertId = value;
    }

    /**
     * Gets the value of the taxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxDate() {
        return taxDate;
    }

    /**
     * Sets the value of the taxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxDate(XMLGregorianCalendar value) {
        this.taxDate = value;
    }

    /**
     * Gets the value of the reportingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportingDate() {
        return reportingDate;
    }

    /**
     * Sets the value of the reportingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportingDate(XMLGregorianCalendar value) {
        this.reportingDate = value;
    }

    /**
     * Gets the value of the accountingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingMethod }
     *     
     */
    public AccountingMethod getAccountingMethod() {
        return accountingMethod;
    }

    /**
     * Sets the value of the accountingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingMethod }
     *     
     */
    public void setAccountingMethod(AccountingMethod value) {
        this.accountingMethod = value;
    }

    /**
     * Gets the value of the taxIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxIncluded() {
        return taxIncluded;
    }

    /**
     * Sets the value of the taxIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxIncluded(Boolean value) {
        this.taxIncluded = value;
    }

}
