
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionGranted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionGranted">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfSecuritiesUnderlyIngOptions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PercentOfTotalOptionsGrantedInFiscalYear" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExerciseOrBasePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrantDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueOfOptionsPotentialValue5Percent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValueOfOptionsPotentialValue10Percent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="GrantDatePresentValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EstimatedPayoutsNonEquityIncentivePlanAwardsThreshold" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EstimatedPayoutsNonEquityIncentivePlanAwardsTarget" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EstimatedPayoutsNonEquityIncentivePlanAwardsMaximum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EstimatedPayoutsEquityIncentivePlanAwardsThreshold" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EstimatedPayoutsEquityIncentivePlanAwardsTarget" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EstimatedPayoutsEquityIncentivePlanAwardsMaximum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AllOtherStockAwardsNumberOfSharesOrStockOrUnits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AllOtherStockAwardsNumberOfSecuritiesUnderlyIngOptions" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="GrantDateFairValueOfStockandOptionAwards" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionGranted", propOrder = {
    "source",
    "sourceDate",
    "currency",
    "numberOfSecuritiesUnderlyIngOptions",
    "percentOfTotalOptionsGrantedInFiscalYear",
    "exerciseOrBasePrice",
    "expirationDate",
    "grantDate",
    "valueOfOptionsPotentialValue5Percent",
    "valueOfOptionsPotentialValue10Percent",
    "grantDatePresentValue",
    "estimatedPayoutsNonEquityIncentivePlanAwardsThreshold",
    "estimatedPayoutsNonEquityIncentivePlanAwardsTarget",
    "estimatedPayoutsNonEquityIncentivePlanAwardsMaximum",
    "estimatedPayoutsEquityIncentivePlanAwardsThreshold",
    "estimatedPayoutsEquityIncentivePlanAwardsTarget",
    "estimatedPayoutsEquityIncentivePlanAwardsMaximum",
    "allOtherStockAwardsNumberOfSharesOrStockOrUnits",
    "allOtherStockAwardsNumberOfSecuritiesUnderlyIngOptions",
    "grantDateFairValueOfStockandOptionAwards"
})
public class OptionGranted
    extends Common
{

    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "SourceDate")
    protected String sourceDate;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "NumberOfSecuritiesUnderlyIngOptions")
    protected int numberOfSecuritiesUnderlyIngOptions;
    @XmlElement(name = "PercentOfTotalOptionsGrantedInFiscalYear")
    protected double percentOfTotalOptionsGrantedInFiscalYear;
    @XmlElement(name = "ExerciseOrBasePrice")
    protected double exerciseOrBasePrice;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "GrantDate")
    protected String grantDate;
    @XmlElement(name = "ValueOfOptionsPotentialValue5Percent")
    protected double valueOfOptionsPotentialValue5Percent;
    @XmlElement(name = "ValueOfOptionsPotentialValue10Percent")
    protected double valueOfOptionsPotentialValue10Percent;
    @XmlElement(name = "GrantDatePresentValue")
    protected double grantDatePresentValue;
    @XmlElement(name = "EstimatedPayoutsNonEquityIncentivePlanAwardsThreshold")
    protected double estimatedPayoutsNonEquityIncentivePlanAwardsThreshold;
    @XmlElement(name = "EstimatedPayoutsNonEquityIncentivePlanAwardsTarget")
    protected double estimatedPayoutsNonEquityIncentivePlanAwardsTarget;
    @XmlElement(name = "EstimatedPayoutsNonEquityIncentivePlanAwardsMaximum")
    protected double estimatedPayoutsNonEquityIncentivePlanAwardsMaximum;
    @XmlElement(name = "EstimatedPayoutsEquityIncentivePlanAwardsThreshold")
    protected double estimatedPayoutsEquityIncentivePlanAwardsThreshold;
    @XmlElement(name = "EstimatedPayoutsEquityIncentivePlanAwardsTarget")
    protected double estimatedPayoutsEquityIncentivePlanAwardsTarget;
    @XmlElement(name = "EstimatedPayoutsEquityIncentivePlanAwardsMaximum")
    protected double estimatedPayoutsEquityIncentivePlanAwardsMaximum;
    @XmlElement(name = "AllOtherStockAwardsNumberOfSharesOrStockOrUnits")
    protected double allOtherStockAwardsNumberOfSharesOrStockOrUnits;
    @XmlElement(name = "AllOtherStockAwardsNumberOfSecuritiesUnderlyIngOptions")
    protected double allOtherStockAwardsNumberOfSecuritiesUnderlyIngOptions;
    @XmlElement(name = "GrantDateFairValueOfStockandOptionAwards")
    protected double grantDateFairValueOfStockandOptionAwards;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the sourceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDate() {
        return sourceDate;
    }

    /**
     * Sets the value of the sourceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDate(String value) {
        this.sourceDate = value;
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

    /**
     * Gets the value of the numberOfSecuritiesUnderlyIngOptions property.
     * 
     */
    public int getNumberOfSecuritiesUnderlyIngOptions() {
        return numberOfSecuritiesUnderlyIngOptions;
    }

    /**
     * Sets the value of the numberOfSecuritiesUnderlyIngOptions property.
     * 
     */
    public void setNumberOfSecuritiesUnderlyIngOptions(int value) {
        this.numberOfSecuritiesUnderlyIngOptions = value;
    }

    /**
     * Gets the value of the percentOfTotalOptionsGrantedInFiscalYear property.
     * 
     */
    public double getPercentOfTotalOptionsGrantedInFiscalYear() {
        return percentOfTotalOptionsGrantedInFiscalYear;
    }

    /**
     * Sets the value of the percentOfTotalOptionsGrantedInFiscalYear property.
     * 
     */
    public void setPercentOfTotalOptionsGrantedInFiscalYear(double value) {
        this.percentOfTotalOptionsGrantedInFiscalYear = value;
    }

    /**
     * Gets the value of the exerciseOrBasePrice property.
     * 
     */
    public double getExerciseOrBasePrice() {
        return exerciseOrBasePrice;
    }

    /**
     * Sets the value of the exerciseOrBasePrice property.
     * 
     */
    public void setExerciseOrBasePrice(double value) {
        this.exerciseOrBasePrice = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the grantDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantDate() {
        return grantDate;
    }

    /**
     * Sets the value of the grantDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantDate(String value) {
        this.grantDate = value;
    }

    /**
     * Gets the value of the valueOfOptionsPotentialValue5Percent property.
     * 
     */
    public double getValueOfOptionsPotentialValue5Percent() {
        return valueOfOptionsPotentialValue5Percent;
    }

    /**
     * Sets the value of the valueOfOptionsPotentialValue5Percent property.
     * 
     */
    public void setValueOfOptionsPotentialValue5Percent(double value) {
        this.valueOfOptionsPotentialValue5Percent = value;
    }

    /**
     * Gets the value of the valueOfOptionsPotentialValue10Percent property.
     * 
     */
    public double getValueOfOptionsPotentialValue10Percent() {
        return valueOfOptionsPotentialValue10Percent;
    }

    /**
     * Sets the value of the valueOfOptionsPotentialValue10Percent property.
     * 
     */
    public void setValueOfOptionsPotentialValue10Percent(double value) {
        this.valueOfOptionsPotentialValue10Percent = value;
    }

    /**
     * Gets the value of the grantDatePresentValue property.
     * 
     */
    public double getGrantDatePresentValue() {
        return grantDatePresentValue;
    }

    /**
     * Sets the value of the grantDatePresentValue property.
     * 
     */
    public void setGrantDatePresentValue(double value) {
        this.grantDatePresentValue = value;
    }

    /**
     * Gets the value of the estimatedPayoutsNonEquityIncentivePlanAwardsThreshold property.
     * 
     */
    public double getEstimatedPayoutsNonEquityIncentivePlanAwardsThreshold() {
        return estimatedPayoutsNonEquityIncentivePlanAwardsThreshold;
    }

    /**
     * Sets the value of the estimatedPayoutsNonEquityIncentivePlanAwardsThreshold property.
     * 
     */
    public void setEstimatedPayoutsNonEquityIncentivePlanAwardsThreshold(double value) {
        this.estimatedPayoutsNonEquityIncentivePlanAwardsThreshold = value;
    }

    /**
     * Gets the value of the estimatedPayoutsNonEquityIncentivePlanAwardsTarget property.
     * 
     */
    public double getEstimatedPayoutsNonEquityIncentivePlanAwardsTarget() {
        return estimatedPayoutsNonEquityIncentivePlanAwardsTarget;
    }

    /**
     * Sets the value of the estimatedPayoutsNonEquityIncentivePlanAwardsTarget property.
     * 
     */
    public void setEstimatedPayoutsNonEquityIncentivePlanAwardsTarget(double value) {
        this.estimatedPayoutsNonEquityIncentivePlanAwardsTarget = value;
    }

    /**
     * Gets the value of the estimatedPayoutsNonEquityIncentivePlanAwardsMaximum property.
     * 
     */
    public double getEstimatedPayoutsNonEquityIncentivePlanAwardsMaximum() {
        return estimatedPayoutsNonEquityIncentivePlanAwardsMaximum;
    }

    /**
     * Sets the value of the estimatedPayoutsNonEquityIncentivePlanAwardsMaximum property.
     * 
     */
    public void setEstimatedPayoutsNonEquityIncentivePlanAwardsMaximum(double value) {
        this.estimatedPayoutsNonEquityIncentivePlanAwardsMaximum = value;
    }

    /**
     * Gets the value of the estimatedPayoutsEquityIncentivePlanAwardsThreshold property.
     * 
     */
    public double getEstimatedPayoutsEquityIncentivePlanAwardsThreshold() {
        return estimatedPayoutsEquityIncentivePlanAwardsThreshold;
    }

    /**
     * Sets the value of the estimatedPayoutsEquityIncentivePlanAwardsThreshold property.
     * 
     */
    public void setEstimatedPayoutsEquityIncentivePlanAwardsThreshold(double value) {
        this.estimatedPayoutsEquityIncentivePlanAwardsThreshold = value;
    }

    /**
     * Gets the value of the estimatedPayoutsEquityIncentivePlanAwardsTarget property.
     * 
     */
    public double getEstimatedPayoutsEquityIncentivePlanAwardsTarget() {
        return estimatedPayoutsEquityIncentivePlanAwardsTarget;
    }

    /**
     * Sets the value of the estimatedPayoutsEquityIncentivePlanAwardsTarget property.
     * 
     */
    public void setEstimatedPayoutsEquityIncentivePlanAwardsTarget(double value) {
        this.estimatedPayoutsEquityIncentivePlanAwardsTarget = value;
    }

    /**
     * Gets the value of the estimatedPayoutsEquityIncentivePlanAwardsMaximum property.
     * 
     */
    public double getEstimatedPayoutsEquityIncentivePlanAwardsMaximum() {
        return estimatedPayoutsEquityIncentivePlanAwardsMaximum;
    }

    /**
     * Sets the value of the estimatedPayoutsEquityIncentivePlanAwardsMaximum property.
     * 
     */
    public void setEstimatedPayoutsEquityIncentivePlanAwardsMaximum(double value) {
        this.estimatedPayoutsEquityIncentivePlanAwardsMaximum = value;
    }

    /**
     * Gets the value of the allOtherStockAwardsNumberOfSharesOrStockOrUnits property.
     * 
     */
    public double getAllOtherStockAwardsNumberOfSharesOrStockOrUnits() {
        return allOtherStockAwardsNumberOfSharesOrStockOrUnits;
    }

    /**
     * Sets the value of the allOtherStockAwardsNumberOfSharesOrStockOrUnits property.
     * 
     */
    public void setAllOtherStockAwardsNumberOfSharesOrStockOrUnits(double value) {
        this.allOtherStockAwardsNumberOfSharesOrStockOrUnits = value;
    }

    /**
     * Gets the value of the allOtherStockAwardsNumberOfSecuritiesUnderlyIngOptions property.
     * 
     */
    public double getAllOtherStockAwardsNumberOfSecuritiesUnderlyIngOptions() {
        return allOtherStockAwardsNumberOfSecuritiesUnderlyIngOptions;
    }

    /**
     * Sets the value of the allOtherStockAwardsNumberOfSecuritiesUnderlyIngOptions property.
     * 
     */
    public void setAllOtherStockAwardsNumberOfSecuritiesUnderlyIngOptions(double value) {
        this.allOtherStockAwardsNumberOfSecuritiesUnderlyIngOptions = value;
    }

    /**
     * Gets the value of the grantDateFairValueOfStockandOptionAwards property.
     * 
     */
    public double getGrantDateFairValueOfStockandOptionAwards() {
        return grantDateFairValueOfStockandOptionAwards;
    }

    /**
     * Sets the value of the grantDateFairValueOfStockandOptionAwards property.
     * 
     */
    public void setGrantDateFairValueOfStockandOptionAwards(double value) {
        this.grantDateFairValueOfStockandOptionAwards = value;
    }

}
