
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionSymbol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionSymbol">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SymbologyKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}OptionTypes"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StrikePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionSymbol", propOrder = {
    "symbol",
    "baseSymbol",
    "symbologyKey",
    "type",
    "month",
    "year",
    "strikePrice"
})
public class OptionSymbol
    extends Common
{

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "BaseSymbol")
    protected String baseSymbol;
    @XmlElement(name = "SymbologyKey")
    protected String symbologyKey;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected OptionTypes type;
    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "StrikePrice")
    protected double strikePrice;

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the baseSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseSymbol() {
        return baseSymbol;
    }

    /**
     * Sets the value of the baseSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseSymbol(String value) {
        this.baseSymbol = value;
    }

    /**
     * Gets the value of the symbologyKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbologyKey() {
        return symbologyKey;
    }

    /**
     * Sets the value of the symbologyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbologyKey(String value) {
        this.symbologyKey = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OptionTypes }
     *     
     */
    public OptionTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionTypes }
     *     
     */
    public void setType(OptionTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
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
     * Gets the value of the strikePrice property.
     * 
     */
    public double getStrikePrice() {
        return strikePrice;
    }

    /**
     * Sets the value of the strikePrice property.
     * 
     */
    public void setStrikePrice(double value) {
        this.strikePrice = value;
    }

}
