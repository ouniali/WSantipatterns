
package com.avalara.avatax.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JurisType" type="{http://avatax.avalara.com/services}JurisdictionType"/>
 *         &lt;element name="JurisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxType" type="{http://avatax.avalara.com/services}TaxType"/>
 *         &lt;element name="Base" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Taxable" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TaxCalculated" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NonTaxable" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Exemption" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="JurisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxAuthorityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TaxGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateAssignedNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetail", propOrder = {
    "country",
    "region",
    "jurisType",
    "jurisCode",
    "taxType",
    "base",
    "taxable",
    "rate",
    "tax",
    "taxCalculated",
    "nonTaxable",
    "exemption",
    "jurisName",
    "taxName",
    "taxAuthorityType",
    "taxGroup",
    "rateType",
    "stateAssignedNo"
})
public class TaxDetail {

    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "JurisType", required = true)
    @XmlSchemaType(name = "string")
    protected JurisdictionType jurisType;
    @XmlElement(name = "JurisCode")
    protected String jurisCode;
    @XmlElement(name = "TaxType", required = true)
    @XmlSchemaType(name = "string")
    protected TaxType taxType;
    @XmlElement(name = "Base", required = true)
    protected BigDecimal base;
    @XmlElement(name = "Taxable", required = true)
    protected BigDecimal taxable;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "Tax", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "TaxCalculated", required = true)
    protected BigDecimal taxCalculated;
    @XmlElement(name = "NonTaxable", required = true)
    protected BigDecimal nonTaxable;
    @XmlElement(name = "Exemption", required = true)
    protected BigDecimal exemption;
    @XmlElement(name = "JurisName")
    protected String jurisName;
    @XmlElement(name = "TaxName")
    protected String taxName;
    @XmlElement(name = "TaxAuthorityType")
    protected int taxAuthorityType;
    @XmlElement(name = "TaxGroup")
    protected String taxGroup;
    @XmlElement(name = "RateType")
    protected String rateType;
    @XmlElement(name = "StateAssignedNo")
    protected String stateAssignedNo;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the jurisType property.
     * 
     * @return
     *     possible object is
     *     {@link JurisdictionType }
     *     
     */
    public JurisdictionType getJurisType() {
        return jurisType;
    }

    /**
     * Sets the value of the jurisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JurisdictionType }
     *     
     */
    public void setJurisType(JurisdictionType value) {
        this.jurisType = value;
    }

    /**
     * Gets the value of the jurisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisCode() {
        return jurisCode;
    }

    /**
     * Sets the value of the jurisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisCode(String value) {
        this.jurisCode = value;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setTaxType(TaxType value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBase(BigDecimal value) {
        this.base = value;
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
     * Gets the value of the nonTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonTaxable() {
        return nonTaxable;
    }

    /**
     * Sets the value of the nonTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonTaxable(BigDecimal value) {
        this.nonTaxable = value;
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
     * Gets the value of the jurisName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisName() {
        return jurisName;
    }

    /**
     * Sets the value of the jurisName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisName(String value) {
        this.jurisName = value;
    }

    /**
     * Gets the value of the taxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * Sets the value of the taxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    /**
     * Gets the value of the taxAuthorityType property.
     * 
     */
    public int getTaxAuthorityType() {
        return taxAuthorityType;
    }

    /**
     * Sets the value of the taxAuthorityType property.
     * 
     */
    public void setTaxAuthorityType(int value) {
        this.taxAuthorityType = value;
    }

    /**
     * Gets the value of the taxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxGroup() {
        return taxGroup;
    }

    /**
     * Sets the value of the taxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxGroup(String value) {
        this.taxGroup = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(String value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the stateAssignedNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateAssignedNo() {
        return stateAssignedNo;
    }

    /**
     * Sets the value of the stateAssignedNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateAssignedNo(String value) {
        this.stateAssignedNo = value;
    }

}
