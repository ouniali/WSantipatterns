
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerOwnership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuerOwnership">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Insider" type="{http://www.xignite.com/services/}Insider" minOccurs="0"/>
 *         &lt;element name="Relationship" type="{http://www.xignite.com/services/}Relationship" minOccurs="0"/>
 *         &lt;element name="Shares" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Options" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MarketValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentageOwnership" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerOwnership", propOrder = {
    "insider",
    "relationship",
    "shares",
    "options",
    "price",
    "marketValue",
    "percentageOwnership"
})
public class IssuerOwnership
    extends Common
{

    @XmlElement(name = "Insider")
    protected Insider insider;
    @XmlElement(name = "Relationship")
    protected Relationship relationship;
    @XmlElement(name = "Shares")
    protected int shares;
    @XmlElement(name = "Options")
    protected int options;
    @XmlElement(name = "Price")
    protected double price;
    @XmlElement(name = "MarketValue")
    protected double marketValue;
    @XmlElement(name = "PercentageOwnership")
    protected double percentageOwnership;

    /**
     * Gets the value of the insider property.
     * 
     * @return
     *     possible object is
     *     {@link Insider }
     *     
     */
    public Insider getInsider() {
        return insider;
    }

    /**
     * Sets the value of the insider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Insider }
     *     
     */
    public void setInsider(Insider value) {
        this.insider = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link Relationship }
     *     
     */
    public Relationship getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationship }
     *     
     */
    public void setRelationship(Relationship value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the shares property.
     * 
     */
    public int getShares() {
        return shares;
    }

    /**
     * Sets the value of the shares property.
     * 
     */
    public void setShares(int value) {
        this.shares = value;
    }

    /**
     * Gets the value of the options property.
     * 
     */
    public int getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     */
    public void setOptions(int value) {
        this.options = value;
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
     * Gets the value of the marketValue property.
     * 
     */
    public double getMarketValue() {
        return marketValue;
    }

    /**
     * Sets the value of the marketValue property.
     * 
     */
    public void setMarketValue(double value) {
        this.marketValue = value;
    }

    /**
     * Gets the value of the percentageOwnership property.
     * 
     */
    public double getPercentageOwnership() {
        return percentageOwnership;
    }

    /**
     * Sets the value of the percentageOwnership property.
     * 
     */
    public void setPercentageOwnership(double value) {
        this.percentageOwnership = value;
    }

}
