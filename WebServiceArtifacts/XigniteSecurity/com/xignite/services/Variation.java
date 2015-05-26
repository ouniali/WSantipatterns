
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Variation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Variation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Years" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EndValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChange" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variation", propOrder = {
    "startDate",
    "endDate",
    "years",
    "startValue",
    "endValue",
    "percentChange"
})
public class Variation {

    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "Years")
    protected int years;
    @XmlElement(name = "StartValue")
    protected double startValue;
    @XmlElement(name = "EndValue")
    protected double endValue;
    @XmlElement(name = "PercentChange")
    protected double percentChange;

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
     * Gets the value of the years property.
     * 
     */
    public int getYears() {
        return years;
    }

    /**
     * Sets the value of the years property.
     * 
     */
    public void setYears(int value) {
        this.years = value;
    }

    /**
     * Gets the value of the startValue property.
     * 
     */
    public double getStartValue() {
        return startValue;
    }

    /**
     * Sets the value of the startValue property.
     * 
     */
    public void setStartValue(double value) {
        this.startValue = value;
    }

    /**
     * Gets the value of the endValue property.
     * 
     */
    public double getEndValue() {
        return endValue;
    }

    /**
     * Sets the value of the endValue property.
     * 
     */
    public void setEndValue(double value) {
        this.endValue = value;
    }

    /**
     * Gets the value of the percentChange property.
     * 
     */
    public double getPercentChange() {
        return percentChange;
    }

    /**
     * Sets the value of the percentChange property.
     * 
     */
    public void setPercentChange(double value) {
        this.percentChange = value;
    }

}
