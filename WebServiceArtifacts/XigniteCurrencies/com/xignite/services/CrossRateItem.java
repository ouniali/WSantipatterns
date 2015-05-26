
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossRateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossRateItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="First" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Last" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossRateItem", propOrder = {
    "date",
    "first",
    "last",
    "high",
    "low"
})
public class CrossRateItem {

    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "First")
    protected double first;
    @XmlElement(name = "Last")
    protected double last;
    @XmlElement(name = "High")
    protected double high;
    @XmlElement(name = "Low")
    protected double low;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the first property.
     * 
     */
    public double getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     */
    public void setFirst(double value) {
        this.first = value;
    }

    /**
     * Gets the value of the last property.
     * 
     */
    public double getLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     */
    public void setLast(double value) {
        this.last = value;
    }

    /**
     * Gets the value of the high property.
     * 
     */
    public double getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     */
    public void setHigh(double value) {
        this.high = value;
    }

    /**
     * Gets the value of the low property.
     * 
     */
    public double getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     */
    public void setLow(double value) {
        this.low = value;
    }

}
