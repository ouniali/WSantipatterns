
package com.exactor.ns;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthorityLevel" type="{http://www.exactor.com/ns}AuthorityLevelType"/>
 *         &lt;element name="AuthorityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CityOrCountyOrDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AuthorityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExemptionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInfoType", propOrder = {
    "authorityLevel",
    "authorityName",
    "cityOrCountyOrDistrict",
    "stateOrProvince",
    "country",
    "taxAmount",
    "taxRate",
    "authorityCode",
    "exemptionReason"
})
public class TaxInfoType {

    @XmlElement(name = "AuthorityLevel", required = true)
    @XmlSchemaType(name = "string")
    protected AuthorityLevelType authorityLevel;
    @XmlElement(name = "AuthorityName", required = true)
    protected String authorityName;
    @XmlElement(name = "CityOrCountyOrDistrict")
    protected String cityOrCountyOrDistrict;
    @XmlElement(name = "StateOrProvince")
    protected String stateOrProvince;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "TaxAmount", required = true)
    protected BigDecimal taxAmount;
    @XmlElement(name = "TaxRate", required = true)
    protected BigDecimal taxRate;
    @XmlElement(name = "AuthorityCode")
    protected String authorityCode;
    @XmlElement(name = "ExemptionReason")
    protected String exemptionReason;

    /**
     * Gets the value of the authorityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityLevelType }
     *     
     */
    public AuthorityLevelType getAuthorityLevel() {
        return authorityLevel;
    }

    /**
     * Sets the value of the authorityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityLevelType }
     *     
     */
    public void setAuthorityLevel(AuthorityLevelType value) {
        this.authorityLevel = value;
    }

    /**
     * Gets the value of the authorityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * Sets the value of the authorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityName(String value) {
        this.authorityName = value;
    }

    /**
     * Gets the value of the cityOrCountyOrDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOrCountyOrDistrict() {
        return cityOrCountyOrDistrict;
    }

    /**
     * Sets the value of the cityOrCountyOrDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOrCountyOrDistrict(String value) {
        this.cityOrCountyOrDistrict = value;
    }

    /**
     * Gets the value of the stateOrProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvince(String value) {
        this.stateOrProvince = value;
    }

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
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the authorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityCode() {
        return authorityCode;
    }

    /**
     * Sets the value of the authorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityCode(String value) {
        this.authorityCode = value;
    }

    /**
     * Gets the value of the exemptionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionReason() {
        return exemptionReason;
    }

    /**
     * Sets the value of the exemptionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionReason(String value) {
        this.exemptionReason = value;
    }

}
