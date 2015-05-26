
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricedComponents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedComponents">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Divisor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DivisorDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricedComponents" type="{http://www.xignite.com/services/}ArrayOfPricedComponent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedComponents", propOrder = {
    "security",
    "count",
    "asOfDate",
    "price",
    "divisor",
    "divisorDate",
    "pricedComponents"
})
public class PricedComponents
    extends Common
{

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "AsOfDate")
    protected String asOfDate;
    @XmlElement(name = "Price")
    protected double price;
    @XmlElement(name = "Divisor")
    protected double divisor;
    @XmlElement(name = "DivisorDate")
    protected String divisorDate;
    @XmlElement(name = "PricedComponents")
    protected ArrayOfPricedComponent pricedComponents;

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setSecurity(Security value) {
        this.security = value;
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
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the divisor property.
     * 
     */
    public double getDivisor() {
        return divisor;
    }

    /**
     * Sets the value of the divisor property.
     * 
     */
    public void setDivisor(double value) {
        this.divisor = value;
    }

    /**
     * Gets the value of the divisorDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisorDate() {
        return divisorDate;
    }

    /**
     * Sets the value of the divisorDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisorDate(String value) {
        this.divisorDate = value;
    }

    /**
     * Gets the value of the pricedComponents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPricedComponent }
     *     
     */
    public ArrayOfPricedComponent getPricedComponents() {
        return pricedComponents;
    }

    /**
     * Sets the value of the pricedComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPricedComponent }
     *     
     */
    public void setPricedComponents(ArrayOfPricedComponent value) {
        this.pricedComponents = value;
    }

}
