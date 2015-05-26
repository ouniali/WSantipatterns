
package com.serviceobjects;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyFIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalTaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalTaxExempt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CityRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CountyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CountyDistrictRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CityDistrictRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Error" type="{http://www.serviceobjects.com/}Err" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInfo", propOrder = {
    "zip",
    "city",
    "county",
    "countyFIPS",
    "stateName",
    "stateAbbreviation",
    "totalTaxRate",
    "totalTaxExempt",
    "stateRate",
    "cityRate",
    "countyRate",
    "countyDistrictRate",
    "cityDistrictRate",
    "error"
})
public class TaxInfo {

    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "CountyFIPS")
    protected String countyFIPS;
    @XmlElement(name = "StateName")
    protected String stateName;
    @XmlElement(name = "StateAbbreviation")
    protected String stateAbbreviation;
    @XmlElement(name = "TotalTaxRate", required = true)
    protected BigDecimal totalTaxRate;
    @XmlElement(name = "TotalTaxExempt")
    protected String totalTaxExempt;
    @XmlElement(name = "StateRate", required = true)
    protected BigDecimal stateRate;
    @XmlElement(name = "CityRate", required = true)
    protected BigDecimal cityRate;
    @XmlElement(name = "CountyRate", required = true)
    protected BigDecimal countyRate;
    @XmlElement(name = "CountyDistrictRate", required = true)
    protected BigDecimal countyDistrictRate;
    @XmlElement(name = "CityDistrictRate", required = true)
    protected BigDecimal cityDistrictRate;
    @XmlElement(name = "Error")
    protected Err error;

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the countyFIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyFIPS() {
        return countyFIPS;
    }

    /**
     * Sets the value of the countyFIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyFIPS(String value) {
        this.countyFIPS = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

    /**
     * Gets the value of the stateAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    /**
     * Sets the value of the stateAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateAbbreviation(String value) {
        this.stateAbbreviation = value;
    }

    /**
     * Gets the value of the totalTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxRate() {
        return totalTaxRate;
    }

    /**
     * Sets the value of the totalTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxRate(BigDecimal value) {
        this.totalTaxRate = value;
    }

    /**
     * Gets the value of the totalTaxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTaxExempt() {
        return totalTaxExempt;
    }

    /**
     * Sets the value of the totalTaxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTaxExempt(String value) {
        this.totalTaxExempt = value;
    }

    /**
     * Gets the value of the stateRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStateRate() {
        return stateRate;
    }

    /**
     * Sets the value of the stateRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStateRate(BigDecimal value) {
        this.stateRate = value;
    }

    /**
     * Gets the value of the cityRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCityRate() {
        return cityRate;
    }

    /**
     * Sets the value of the cityRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCityRate(BigDecimal value) {
        this.cityRate = value;
    }

    /**
     * Gets the value of the countyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountyRate() {
        return countyRate;
    }

    /**
     * Sets the value of the countyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountyRate(BigDecimal value) {
        this.countyRate = value;
    }

    /**
     * Gets the value of the countyDistrictRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountyDistrictRate() {
        return countyDistrictRate;
    }

    /**
     * Sets the value of the countyDistrictRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountyDistrictRate(BigDecimal value) {
        this.countyDistrictRate = value;
    }

    /**
     * Gets the value of the cityDistrictRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCityDistrictRate() {
        return cityDistrictRate;
    }

    /**
     * Sets the value of the cityDistrictRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCityDistrictRate(BigDecimal value) {
        this.cityDistrictRate = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Err }
     *     
     */
    public Err getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Err }
     *     
     */
    public void setError(Err value) {
        this.error = value;
    }

}
