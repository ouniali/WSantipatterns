
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Compensation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compensation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="DirectorAsReported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectorStandardized" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Salary" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Bonus" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OtherAnnualCompensation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RestrictedStockAwards" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SecurityUnderlyingOptions" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LongTermIncentivePlanPayouts" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AllOtherCompensation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OptionAwards" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NonEquityIncentivePlanCompensation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangeInPensionValueAndNondisqualifiedDeferredCompensationEarnings" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalCompensation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compensation", propOrder = {
    "directorAsReported",
    "directorStandardized",
    "year",
    "salary",
    "bonus",
    "otherAnnualCompensation",
    "restrictedStockAwards",
    "securityUnderlyingOptions",
    "longTermIncentivePlanPayouts",
    "allOtherCompensation",
    "optionAwards",
    "nonEquityIncentivePlanCompensation",
    "changeInPensionValueAndNondisqualifiedDeferredCompensationEarnings",
    "totalCompensation",
    "currency"
})
public class Compensation
    extends Common
{

    @XmlElement(name = "DirectorAsReported")
    protected String directorAsReported;
    @XmlElement(name = "DirectorStandardized")
    protected String directorStandardized;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Salary")
    protected double salary;
    @XmlElement(name = "Bonus")
    protected double bonus;
    @XmlElement(name = "OtherAnnualCompensation")
    protected double otherAnnualCompensation;
    @XmlElement(name = "RestrictedStockAwards")
    protected double restrictedStockAwards;
    @XmlElement(name = "SecurityUnderlyingOptions")
    protected double securityUnderlyingOptions;
    @XmlElement(name = "LongTermIncentivePlanPayouts")
    protected double longTermIncentivePlanPayouts;
    @XmlElement(name = "AllOtherCompensation")
    protected double allOtherCompensation;
    @XmlElement(name = "OptionAwards")
    protected double optionAwards;
    @XmlElement(name = "NonEquityIncentivePlanCompensation")
    protected double nonEquityIncentivePlanCompensation;
    @XmlElement(name = "ChangeInPensionValueAndNondisqualifiedDeferredCompensationEarnings")
    protected double changeInPensionValueAndNondisqualifiedDeferredCompensationEarnings;
    @XmlElement(name = "TotalCompensation")
    protected double totalCompensation;
    @XmlElement(name = "Currency")
    protected String currency;

    /**
     * Gets the value of the directorAsReported property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorAsReported() {
        return directorAsReported;
    }

    /**
     * Sets the value of the directorAsReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorAsReported(String value) {
        this.directorAsReported = value;
    }

    /**
     * Gets the value of the directorStandardized property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorStandardized() {
        return directorStandardized;
    }

    /**
     * Sets the value of the directorStandardized property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorStandardized(String value) {
        this.directorStandardized = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     */
    public void setSalary(double value) {
        this.salary = value;
    }

    /**
     * Gets the value of the bonus property.
     * 
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * Sets the value of the bonus property.
     * 
     */
    public void setBonus(double value) {
        this.bonus = value;
    }

    /**
     * Gets the value of the otherAnnualCompensation property.
     * 
     */
    public double getOtherAnnualCompensation() {
        return otherAnnualCompensation;
    }

    /**
     * Sets the value of the otherAnnualCompensation property.
     * 
     */
    public void setOtherAnnualCompensation(double value) {
        this.otherAnnualCompensation = value;
    }

    /**
     * Gets the value of the restrictedStockAwards property.
     * 
     */
    public double getRestrictedStockAwards() {
        return restrictedStockAwards;
    }

    /**
     * Sets the value of the restrictedStockAwards property.
     * 
     */
    public void setRestrictedStockAwards(double value) {
        this.restrictedStockAwards = value;
    }

    /**
     * Gets the value of the securityUnderlyingOptions property.
     * 
     */
    public double getSecurityUnderlyingOptions() {
        return securityUnderlyingOptions;
    }

    /**
     * Sets the value of the securityUnderlyingOptions property.
     * 
     */
    public void setSecurityUnderlyingOptions(double value) {
        this.securityUnderlyingOptions = value;
    }

    /**
     * Gets the value of the longTermIncentivePlanPayouts property.
     * 
     */
    public double getLongTermIncentivePlanPayouts() {
        return longTermIncentivePlanPayouts;
    }

    /**
     * Sets the value of the longTermIncentivePlanPayouts property.
     * 
     */
    public void setLongTermIncentivePlanPayouts(double value) {
        this.longTermIncentivePlanPayouts = value;
    }

    /**
     * Gets the value of the allOtherCompensation property.
     * 
     */
    public double getAllOtherCompensation() {
        return allOtherCompensation;
    }

    /**
     * Sets the value of the allOtherCompensation property.
     * 
     */
    public void setAllOtherCompensation(double value) {
        this.allOtherCompensation = value;
    }

    /**
     * Gets the value of the optionAwards property.
     * 
     */
    public double getOptionAwards() {
        return optionAwards;
    }

    /**
     * Sets the value of the optionAwards property.
     * 
     */
    public void setOptionAwards(double value) {
        this.optionAwards = value;
    }

    /**
     * Gets the value of the nonEquityIncentivePlanCompensation property.
     * 
     */
    public double getNonEquityIncentivePlanCompensation() {
        return nonEquityIncentivePlanCompensation;
    }

    /**
     * Sets the value of the nonEquityIncentivePlanCompensation property.
     * 
     */
    public void setNonEquityIncentivePlanCompensation(double value) {
        this.nonEquityIncentivePlanCompensation = value;
    }

    /**
     * Gets the value of the changeInPensionValueAndNondisqualifiedDeferredCompensationEarnings property.
     * 
     */
    public double getChangeInPensionValueAndNondisqualifiedDeferredCompensationEarnings() {
        return changeInPensionValueAndNondisqualifiedDeferredCompensationEarnings;
    }

    /**
     * Sets the value of the changeInPensionValueAndNondisqualifiedDeferredCompensationEarnings property.
     * 
     */
    public void setChangeInPensionValueAndNondisqualifiedDeferredCompensationEarnings(double value) {
        this.changeInPensionValueAndNondisqualifiedDeferredCompensationEarnings = value;
    }

    /**
     * Gets the value of the totalCompensation property.
     * 
     */
    public double getTotalCompensation() {
        return totalCompensation;
    }

    /**
     * Sets the value of the totalCompensation property.
     * 
     */
    public void setTotalCompensation(double value) {
        this.totalCompensation = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
