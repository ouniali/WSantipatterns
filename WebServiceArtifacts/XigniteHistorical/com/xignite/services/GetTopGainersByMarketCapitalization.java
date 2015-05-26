
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LowCapitalization" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="HighCapitalization" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asOfDate",
    "lowCapitalization",
    "highCapitalization",
    "count"
})
@XmlRootElement(name = "GetTopGainersByMarketCapitalization")
public class GetTopGainersByMarketCapitalization {

    @XmlElement(name = "AsOfDate")
    protected String asOfDate;
    @XmlElement(name = "LowCapitalization")
    protected double lowCapitalization;
    @XmlElement(name = "HighCapitalization")
    protected double highCapitalization;
    @XmlElement(name = "Count")
    protected int count;

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsOfDate(String value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the lowCapitalization property.
     * 
     */
    public double getLowCapitalization() {
        return lowCapitalization;
    }

    /**
     * Sets the value of the lowCapitalization property.
     * 
     */
    public void setLowCapitalization(double value) {
        this.lowCapitalization = value;
    }

    /**
     * Gets the value of the highCapitalization property.
     * 
     */
    public double getHighCapitalization() {
        return highCapitalization;
    }

    /**
     * Sets the value of the highCapitalization property.
     * 
     */
    public void setHighCapitalization(double value) {
        this.highCapitalization = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

}
