
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Option complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Option">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SymbologyKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}OptionTypes"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StrikePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Last" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Bid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Ask" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Change" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChange" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OpenInterest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InTheMoney" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Option", propOrder = {
    "symbol",
    "baseSymbol",
    "optionSymbol",
    "symbologyKey",
    "date",
    "time",
    "type",
    "month",
    "year",
    "strikePrice",
    "last",
    "bid",
    "ask",
    "change",
    "percentChange",
    "volume",
    "openInterest",
    "inTheMoney"
})
public class Option
    extends Common
{

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "BaseSymbol")
    protected String baseSymbol;
    @XmlElement(name = "OptionSymbol")
    protected String optionSymbol;
    @XmlElement(name = "SymbologyKey")
    protected String symbologyKey;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected OptionTypes type;
    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "StrikePrice")
    protected double strikePrice;
    @XmlElement(name = "Last")
    protected double last;
    @XmlElement(name = "Bid")
    protected double bid;
    @XmlElement(name = "Ask")
    protected double ask;
    @XmlElement(name = "Change")
    protected double change;
    @XmlElement(name = "PercentChange")
    protected double percentChange;
    @XmlElement(name = "Volume")
    protected double volume;
    @XmlElement(name = "OpenInterest")
    protected double openInterest;
    @XmlElement(name = "InTheMoney")
    protected boolean inTheMoney;

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
     * Gets the value of the optionSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionSymbol() {
        return optionSymbol;
    }

    /**
     * Sets the value of the optionSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionSymbol(String value) {
        this.optionSymbol = value;
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
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
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
     * Gets the value of the bid property.
     * 
     */
    public double getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     */
    public void setBid(double value) {
        this.bid = value;
    }

    /**
     * Gets the value of the ask property.
     * 
     */
    public double getAsk() {
        return ask;
    }

    /**
     * Sets the value of the ask property.
     * 
     */
    public void setAsk(double value) {
        this.ask = value;
    }

    /**
     * Gets the value of the change property.
     * 
     */
    public double getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     */
    public void setChange(double value) {
        this.change = value;
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

    /**
     * Gets the value of the volume property.
     * 
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(double value) {
        this.volume = value;
    }

    /**
     * Gets the value of the openInterest property.
     * 
     */
    public double getOpenInterest() {
        return openInterest;
    }

    /**
     * Sets the value of the openInterest property.
     * 
     */
    public void setOpenInterest(double value) {
        this.openInterest = value;
    }

    /**
     * Gets the value of the inTheMoney property.
     * 
     */
    public boolean isInTheMoney() {
        return inTheMoney;
    }

    /**
     * Sets the value of the inTheMoney property.
     * 
     */
    public void setInTheMoney(boolean value) {
        this.inTheMoney = value;
    }

}
