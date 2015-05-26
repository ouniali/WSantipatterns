
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopicStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopicStatistics">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrowthLow" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="GrowthHigh" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Mean" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="StdDev" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MeanOfRollingMean" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="StdDevOfRollingMean" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MeanOfRollingStdDev" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="StdDevOfRollingStdDev" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopicStatistics", propOrder = {
    "code",
    "name",
    "frequency",
    "units",
    "startDate",
    "endDate",
    "growthLow",
    "growthHigh",
    "mean",
    "stdDev",
    "meanOfRollingMean",
    "stdDevOfRollingMean",
    "meanOfRollingStdDev",
    "stdDevOfRollingStdDev"
})
public class TopicStatistics
    extends Common
{

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Frequency")
    protected String frequency;
    @XmlElement(name = "Units")
    protected String units;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "GrowthLow")
    protected double growthLow;
    @XmlElement(name = "GrowthHigh")
    protected double growthHigh;
    @XmlElement(name = "Mean")
    protected double mean;
    @XmlElement(name = "StdDev")
    protected double stdDev;
    @XmlElement(name = "MeanOfRollingMean")
    protected double meanOfRollingMean;
    @XmlElement(name = "StdDevOfRollingMean")
    protected double stdDevOfRollingMean;
    @XmlElement(name = "MeanOfRollingStdDev")
    protected double meanOfRollingStdDev;
    @XmlElement(name = "StdDevOfRollingStdDev")
    protected double stdDevOfRollingStdDev;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the growthLow property.
     * 
     */
    public double getGrowthLow() {
        return growthLow;
    }

    /**
     * Sets the value of the growthLow property.
     * 
     */
    public void setGrowthLow(double value) {
        this.growthLow = value;
    }

    /**
     * Gets the value of the growthHigh property.
     * 
     */
    public double getGrowthHigh() {
        return growthHigh;
    }

    /**
     * Sets the value of the growthHigh property.
     * 
     */
    public void setGrowthHigh(double value) {
        this.growthHigh = value;
    }

    /**
     * Gets the value of the mean property.
     * 
     */
    public double getMean() {
        return mean;
    }

    /**
     * Sets the value of the mean property.
     * 
     */
    public void setMean(double value) {
        this.mean = value;
    }

    /**
     * Gets the value of the stdDev property.
     * 
     */
    public double getStdDev() {
        return stdDev;
    }

    /**
     * Sets the value of the stdDev property.
     * 
     */
    public void setStdDev(double value) {
        this.stdDev = value;
    }

    /**
     * Gets the value of the meanOfRollingMean property.
     * 
     */
    public double getMeanOfRollingMean() {
        return meanOfRollingMean;
    }

    /**
     * Sets the value of the meanOfRollingMean property.
     * 
     */
    public void setMeanOfRollingMean(double value) {
        this.meanOfRollingMean = value;
    }

    /**
     * Gets the value of the stdDevOfRollingMean property.
     * 
     */
    public double getStdDevOfRollingMean() {
        return stdDevOfRollingMean;
    }

    /**
     * Sets the value of the stdDevOfRollingMean property.
     * 
     */
    public void setStdDevOfRollingMean(double value) {
        this.stdDevOfRollingMean = value;
    }

    /**
     * Gets the value of the meanOfRollingStdDev property.
     * 
     */
    public double getMeanOfRollingStdDev() {
        return meanOfRollingStdDev;
    }

    /**
     * Sets the value of the meanOfRollingStdDev property.
     * 
     */
    public void setMeanOfRollingStdDev(double value) {
        this.meanOfRollingStdDev = value;
    }

    /**
     * Gets the value of the stdDevOfRollingStdDev property.
     * 
     */
    public double getStdDevOfRollingStdDev() {
        return stdDevOfRollingStdDev;
    }

    /**
     * Sets the value of the stdDevOfRollingStdDev property.
     * 
     */
    public void setStdDevOfRollingStdDev(double value) {
        this.stdDevOfRollingStdDev = value;
    }

}
