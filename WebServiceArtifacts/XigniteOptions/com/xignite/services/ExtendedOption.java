
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SymbologyKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}OptionTypes"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StrikePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelayedMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LastTradeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastTradeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastTradeSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LastPriceStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Change" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChange" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InTheMoney" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VolumeStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ask" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AskDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AskTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AskQuantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AskStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BidDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BidTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BidQuantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BidStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MidDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MidTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MidStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valuation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValuationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValuationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValuationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValuationStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpenInterest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OpenInterestDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Open" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OpenStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Close" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CloseStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="HighStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LowStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PreviousCloseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnderlyingSpot" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UnderlyingSpotDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayLast" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PreviousDayLastDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayLastTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayLastPriceStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayLastSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PreviousDayValuation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PreviousDayValuationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayValuationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayValuationStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayAsk" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PreviousDayAskDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayAskTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayAskStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayBid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PreviousDayBidDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayBidTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayBidStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayMid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PreviousDayMidDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousDayMidStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceForYieldCalculation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PriceForYieldCalculationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceForYieldCalculationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceForYieldCalculationStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedOption", propOrder = {
    "symbol",
    "baseSymbol",
    "optionSymbol",
    "symbologyKey",
    "type",
    "expirationDate",
    "month",
    "year",
    "strikePrice",
    "cfi",
    "exchange",
    "quoteType",
    "contractSize",
    "currency",
    "delayedMinutes",
    "date",
    "time",
    "last",
    "lastTradeDate",
    "lastTradeTime",
    "lastTradeSize",
    "lastPriceStyle",
    "change",
    "percentChange",
    "inTheMoney",
    "volume",
    "volumeStyle",
    "ask",
    "askDate",
    "askTime",
    "askQuantity",
    "askStyle",
    "bid",
    "bidDate",
    "bidTime",
    "bidQuantity",
    "bidStyle",
    "mid",
    "midDate",
    "midTime",
    "midStyle",
    "valuation",
    "valuationDate",
    "valuationTime",
    "valuationType",
    "valuationStyle",
    "openInterest",
    "openInterestDate",
    "open",
    "openStyle",
    "close",
    "closeStyle",
    "high",
    "highStyle",
    "low",
    "lowStyle",
    "previousClose",
    "previousCloseDate",
    "underlyingSpot",
    "underlyingSpotDate",
    "previousDayLast",
    "previousDayLastDate",
    "previousDayLastTime",
    "previousDayLastPriceStyle",
    "previousDayLastSize",
    "previousDayValuation",
    "previousDayValuationDate",
    "previousDayValuationTime",
    "previousDayValuationStyle",
    "previousDayAsk",
    "previousDayAskDate",
    "previousDayAskTime",
    "previousDayAskStyle",
    "previousDayBid",
    "previousDayBidDate",
    "previousDayBidTime",
    "previousDayBidStyle",
    "previousDayMid",
    "previousDayMidDate",
    "previousDayMidStyle",
    "priceForYieldCalculation",
    "priceForYieldCalculationDate",
    "priceForYieldCalculationTime",
    "priceForYieldCalculationStyle"
})
public class ExtendedOption
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
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected OptionTypes type;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "StrikePrice")
    protected double strikePrice;
    @XmlElement(name = "CFI")
    protected String cfi;
    @XmlElement(name = "Exchange")
    protected String exchange;
    @XmlElement(name = "QuoteType")
    protected String quoteType;
    @XmlElement(name = "ContractSize")
    protected double contractSize;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "DelayedMinutes")
    protected int delayedMinutes;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "Last")
    protected double last;
    @XmlElement(name = "LastTradeDate")
    protected String lastTradeDate;
    @XmlElement(name = "LastTradeTime")
    protected String lastTradeTime;
    @XmlElement(name = "LastTradeSize")
    protected double lastTradeSize;
    @XmlElement(name = "LastPriceStyle")
    protected String lastPriceStyle;
    @XmlElement(name = "Change")
    protected double change;
    @XmlElement(name = "PercentChange")
    protected double percentChange;
    @XmlElement(name = "InTheMoney")
    protected boolean inTheMoney;
    @XmlElement(name = "Volume")
    protected double volume;
    @XmlElement(name = "VolumeStyle")
    protected String volumeStyle;
    @XmlElement(name = "Ask")
    protected double ask;
    @XmlElement(name = "AskDate")
    protected String askDate;
    @XmlElement(name = "AskTime")
    protected String askTime;
    @XmlElement(name = "AskQuantity")
    protected double askQuantity;
    @XmlElement(name = "AskStyle")
    protected String askStyle;
    @XmlElement(name = "Bid")
    protected double bid;
    @XmlElement(name = "BidDate")
    protected String bidDate;
    @XmlElement(name = "BidTime")
    protected String bidTime;
    @XmlElement(name = "BidQuantity")
    protected double bidQuantity;
    @XmlElement(name = "BidStyle")
    protected String bidStyle;
    @XmlElement(name = "Mid")
    protected double mid;
    @XmlElement(name = "MidDate")
    protected String midDate;
    @XmlElement(name = "MidTime")
    protected String midTime;
    @XmlElement(name = "MidStyle")
    protected String midStyle;
    @XmlElement(name = "Valuation")
    protected double valuation;
    @XmlElement(name = "ValuationDate")
    protected String valuationDate;
    @XmlElement(name = "ValuationTime")
    protected String valuationTime;
    @XmlElement(name = "ValuationType")
    protected String valuationType;
    @XmlElement(name = "ValuationStyle")
    protected String valuationStyle;
    @XmlElement(name = "OpenInterest")
    protected double openInterest;
    @XmlElement(name = "OpenInterestDate")
    protected String openInterestDate;
    @XmlElement(name = "Open")
    protected double open;
    @XmlElement(name = "OpenStyle")
    protected String openStyle;
    @XmlElement(name = "Close")
    protected double close;
    @XmlElement(name = "CloseStyle")
    protected String closeStyle;
    @XmlElement(name = "High")
    protected double high;
    @XmlElement(name = "HighStyle")
    protected String highStyle;
    @XmlElement(name = "Low")
    protected double low;
    @XmlElement(name = "LowStyle")
    protected String lowStyle;
    @XmlElement(name = "PreviousClose")
    protected double previousClose;
    @XmlElement(name = "PreviousCloseDate")
    protected String previousCloseDate;
    @XmlElement(name = "UnderlyingSpot")
    protected double underlyingSpot;
    @XmlElement(name = "UnderlyingSpotDate")
    protected String underlyingSpotDate;
    @XmlElement(name = "PreviousDayLast")
    protected double previousDayLast;
    @XmlElement(name = "PreviousDayLastDate")
    protected String previousDayLastDate;
    @XmlElement(name = "PreviousDayLastTime")
    protected String previousDayLastTime;
    @XmlElement(name = "PreviousDayLastPriceStyle")
    protected String previousDayLastPriceStyle;
    @XmlElement(name = "PreviousDayLastSize")
    protected double previousDayLastSize;
    @XmlElement(name = "PreviousDayValuation")
    protected double previousDayValuation;
    @XmlElement(name = "PreviousDayValuationDate")
    protected String previousDayValuationDate;
    @XmlElement(name = "PreviousDayValuationTime")
    protected String previousDayValuationTime;
    @XmlElement(name = "PreviousDayValuationStyle")
    protected String previousDayValuationStyle;
    @XmlElement(name = "PreviousDayAsk")
    protected double previousDayAsk;
    @XmlElement(name = "PreviousDayAskDate")
    protected String previousDayAskDate;
    @XmlElement(name = "PreviousDayAskTime")
    protected String previousDayAskTime;
    @XmlElement(name = "PreviousDayAskStyle")
    protected String previousDayAskStyle;
    @XmlElement(name = "PreviousDayBid")
    protected double previousDayBid;
    @XmlElement(name = "PreviousDayBidDate")
    protected String previousDayBidDate;
    @XmlElement(name = "PreviousDayBidTime")
    protected String previousDayBidTime;
    @XmlElement(name = "PreviousDayBidStyle")
    protected String previousDayBidStyle;
    @XmlElement(name = "PreviousDayMid")
    protected double previousDayMid;
    @XmlElement(name = "PreviousDayMidDate")
    protected String previousDayMidDate;
    @XmlElement(name = "PreviousDayMidStyle")
    protected String previousDayMidStyle;
    @XmlElement(name = "PriceForYieldCalculation")
    protected double priceForYieldCalculation;
    @XmlElement(name = "PriceForYieldCalculationDate")
    protected String priceForYieldCalculationDate;
    @XmlElement(name = "PriceForYieldCalculationTime")
    protected String priceForYieldCalculationTime;
    @XmlElement(name = "PriceForYieldCalculationStyle")
    protected String priceForYieldCalculationStyle;

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
     * Gets the value of the cfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFI() {
        return cfi;
    }

    /**
     * Sets the value of the cfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFI(String value) {
        this.cfi = value;
    }

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchange(String value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the quoteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteType() {
        return quoteType;
    }

    /**
     * Sets the value of the quoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteType(String value) {
        this.quoteType = value;
    }

    /**
     * Gets the value of the contractSize property.
     * 
     */
    public double getContractSize() {
        return contractSize;
    }

    /**
     * Sets the value of the contractSize property.
     * 
     */
    public void setContractSize(double value) {
        this.contractSize = value;
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
     * Gets the value of the delayedMinutes property.
     * 
     */
    public int getDelayedMinutes() {
        return delayedMinutes;
    }

    /**
     * Sets the value of the delayedMinutes property.
     * 
     */
    public void setDelayedMinutes(int value) {
        this.delayedMinutes = value;
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
     * Gets the value of the lastTradeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTradeDate() {
        return lastTradeDate;
    }

    /**
     * Sets the value of the lastTradeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTradeDate(String value) {
        this.lastTradeDate = value;
    }

    /**
     * Gets the value of the lastTradeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTradeTime() {
        return lastTradeTime;
    }

    /**
     * Sets the value of the lastTradeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTradeTime(String value) {
        this.lastTradeTime = value;
    }

    /**
     * Gets the value of the lastTradeSize property.
     * 
     */
    public double getLastTradeSize() {
        return lastTradeSize;
    }

    /**
     * Sets the value of the lastTradeSize property.
     * 
     */
    public void setLastTradeSize(double value) {
        this.lastTradeSize = value;
    }

    /**
     * Gets the value of the lastPriceStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPriceStyle() {
        return lastPriceStyle;
    }

    /**
     * Sets the value of the lastPriceStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPriceStyle(String value) {
        this.lastPriceStyle = value;
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
     * Gets the value of the volumeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeStyle() {
        return volumeStyle;
    }

    /**
     * Sets the value of the volumeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeStyle(String value) {
        this.volumeStyle = value;
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
     * Gets the value of the askDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAskDate() {
        return askDate;
    }

    /**
     * Sets the value of the askDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAskDate(String value) {
        this.askDate = value;
    }

    /**
     * Gets the value of the askTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAskTime() {
        return askTime;
    }

    /**
     * Sets the value of the askTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAskTime(String value) {
        this.askTime = value;
    }

    /**
     * Gets the value of the askQuantity property.
     * 
     */
    public double getAskQuantity() {
        return askQuantity;
    }

    /**
     * Sets the value of the askQuantity property.
     * 
     */
    public void setAskQuantity(double value) {
        this.askQuantity = value;
    }

    /**
     * Gets the value of the askStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAskStyle() {
        return askStyle;
    }

    /**
     * Sets the value of the askStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAskStyle(String value) {
        this.askStyle = value;
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
     * Gets the value of the bidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidDate() {
        return bidDate;
    }

    /**
     * Sets the value of the bidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidDate(String value) {
        this.bidDate = value;
    }

    /**
     * Gets the value of the bidTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidTime() {
        return bidTime;
    }

    /**
     * Sets the value of the bidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidTime(String value) {
        this.bidTime = value;
    }

    /**
     * Gets the value of the bidQuantity property.
     * 
     */
    public double getBidQuantity() {
        return bidQuantity;
    }

    /**
     * Sets the value of the bidQuantity property.
     * 
     */
    public void setBidQuantity(double value) {
        this.bidQuantity = value;
    }

    /**
     * Gets the value of the bidStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidStyle() {
        return bidStyle;
    }

    /**
     * Sets the value of the bidStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidStyle(String value) {
        this.bidStyle = value;
    }

    /**
     * Gets the value of the mid property.
     * 
     */
    public double getMid() {
        return mid;
    }

    /**
     * Sets the value of the mid property.
     * 
     */
    public void setMid(double value) {
        this.mid = value;
    }

    /**
     * Gets the value of the midDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidDate() {
        return midDate;
    }

    /**
     * Sets the value of the midDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidDate(String value) {
        this.midDate = value;
    }

    /**
     * Gets the value of the midTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidTime() {
        return midTime;
    }

    /**
     * Sets the value of the midTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidTime(String value) {
        this.midTime = value;
    }

    /**
     * Gets the value of the midStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidStyle() {
        return midStyle;
    }

    /**
     * Sets the value of the midStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidStyle(String value) {
        this.midStyle = value;
    }

    /**
     * Gets the value of the valuation property.
     * 
     */
    public double getValuation() {
        return valuation;
    }

    /**
     * Sets the value of the valuation property.
     * 
     */
    public void setValuation(double value) {
        this.valuation = value;
    }

    /**
     * Gets the value of the valuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuationDate() {
        return valuationDate;
    }

    /**
     * Sets the value of the valuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuationDate(String value) {
        this.valuationDate = value;
    }

    /**
     * Gets the value of the valuationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuationTime() {
        return valuationTime;
    }

    /**
     * Sets the value of the valuationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuationTime(String value) {
        this.valuationTime = value;
    }

    /**
     * Gets the value of the valuationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuationType() {
        return valuationType;
    }

    /**
     * Sets the value of the valuationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuationType(String value) {
        this.valuationType = value;
    }

    /**
     * Gets the value of the valuationStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuationStyle() {
        return valuationStyle;
    }

    /**
     * Sets the value of the valuationStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuationStyle(String value) {
        this.valuationStyle = value;
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
     * Gets the value of the openInterestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenInterestDate() {
        return openInterestDate;
    }

    /**
     * Sets the value of the openInterestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenInterestDate(String value) {
        this.openInterestDate = value;
    }

    /**
     * Gets the value of the open property.
     * 
     */
    public double getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     */
    public void setOpen(double value) {
        this.open = value;
    }

    /**
     * Gets the value of the openStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenStyle() {
        return openStyle;
    }

    /**
     * Sets the value of the openStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenStyle(String value) {
        this.openStyle = value;
    }

    /**
     * Gets the value of the close property.
     * 
     */
    public double getClose() {
        return close;
    }

    /**
     * Sets the value of the close property.
     * 
     */
    public void setClose(double value) {
        this.close = value;
    }

    /**
     * Gets the value of the closeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseStyle() {
        return closeStyle;
    }

    /**
     * Sets the value of the closeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseStyle(String value) {
        this.closeStyle = value;
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
     * Gets the value of the highStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighStyle() {
        return highStyle;
    }

    /**
     * Sets the value of the highStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighStyle(String value) {
        this.highStyle = value;
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

    /**
     * Gets the value of the lowStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowStyle() {
        return lowStyle;
    }

    /**
     * Sets the value of the lowStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowStyle(String value) {
        this.lowStyle = value;
    }

    /**
     * Gets the value of the previousClose property.
     * 
     */
    public double getPreviousClose() {
        return previousClose;
    }

    /**
     * Sets the value of the previousClose property.
     * 
     */
    public void setPreviousClose(double value) {
        this.previousClose = value;
    }

    /**
     * Gets the value of the previousCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousCloseDate() {
        return previousCloseDate;
    }

    /**
     * Sets the value of the previousCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousCloseDate(String value) {
        this.previousCloseDate = value;
    }

    /**
     * Gets the value of the underlyingSpot property.
     * 
     */
    public double getUnderlyingSpot() {
        return underlyingSpot;
    }

    /**
     * Sets the value of the underlyingSpot property.
     * 
     */
    public void setUnderlyingSpot(double value) {
        this.underlyingSpot = value;
    }

    /**
     * Gets the value of the underlyingSpotDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderlyingSpotDate() {
        return underlyingSpotDate;
    }

    /**
     * Sets the value of the underlyingSpotDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderlyingSpotDate(String value) {
        this.underlyingSpotDate = value;
    }

    /**
     * Gets the value of the previousDayLast property.
     * 
     */
    public double getPreviousDayLast() {
        return previousDayLast;
    }

    /**
     * Sets the value of the previousDayLast property.
     * 
     */
    public void setPreviousDayLast(double value) {
        this.previousDayLast = value;
    }

    /**
     * Gets the value of the previousDayLastDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayLastDate() {
        return previousDayLastDate;
    }

    /**
     * Sets the value of the previousDayLastDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayLastDate(String value) {
        this.previousDayLastDate = value;
    }

    /**
     * Gets the value of the previousDayLastTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayLastTime() {
        return previousDayLastTime;
    }

    /**
     * Sets the value of the previousDayLastTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayLastTime(String value) {
        this.previousDayLastTime = value;
    }

    /**
     * Gets the value of the previousDayLastPriceStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayLastPriceStyle() {
        return previousDayLastPriceStyle;
    }

    /**
     * Sets the value of the previousDayLastPriceStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayLastPriceStyle(String value) {
        this.previousDayLastPriceStyle = value;
    }

    /**
     * Gets the value of the previousDayLastSize property.
     * 
     */
    public double getPreviousDayLastSize() {
        return previousDayLastSize;
    }

    /**
     * Sets the value of the previousDayLastSize property.
     * 
     */
    public void setPreviousDayLastSize(double value) {
        this.previousDayLastSize = value;
    }

    /**
     * Gets the value of the previousDayValuation property.
     * 
     */
    public double getPreviousDayValuation() {
        return previousDayValuation;
    }

    /**
     * Sets the value of the previousDayValuation property.
     * 
     */
    public void setPreviousDayValuation(double value) {
        this.previousDayValuation = value;
    }

    /**
     * Gets the value of the previousDayValuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayValuationDate() {
        return previousDayValuationDate;
    }

    /**
     * Sets the value of the previousDayValuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayValuationDate(String value) {
        this.previousDayValuationDate = value;
    }

    /**
     * Gets the value of the previousDayValuationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayValuationTime() {
        return previousDayValuationTime;
    }

    /**
     * Sets the value of the previousDayValuationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayValuationTime(String value) {
        this.previousDayValuationTime = value;
    }

    /**
     * Gets the value of the previousDayValuationStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayValuationStyle() {
        return previousDayValuationStyle;
    }

    /**
     * Sets the value of the previousDayValuationStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayValuationStyle(String value) {
        this.previousDayValuationStyle = value;
    }

    /**
     * Gets the value of the previousDayAsk property.
     * 
     */
    public double getPreviousDayAsk() {
        return previousDayAsk;
    }

    /**
     * Sets the value of the previousDayAsk property.
     * 
     */
    public void setPreviousDayAsk(double value) {
        this.previousDayAsk = value;
    }

    /**
     * Gets the value of the previousDayAskDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayAskDate() {
        return previousDayAskDate;
    }

    /**
     * Sets the value of the previousDayAskDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayAskDate(String value) {
        this.previousDayAskDate = value;
    }

    /**
     * Gets the value of the previousDayAskTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayAskTime() {
        return previousDayAskTime;
    }

    /**
     * Sets the value of the previousDayAskTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayAskTime(String value) {
        this.previousDayAskTime = value;
    }

    /**
     * Gets the value of the previousDayAskStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayAskStyle() {
        return previousDayAskStyle;
    }

    /**
     * Sets the value of the previousDayAskStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayAskStyle(String value) {
        this.previousDayAskStyle = value;
    }

    /**
     * Gets the value of the previousDayBid property.
     * 
     */
    public double getPreviousDayBid() {
        return previousDayBid;
    }

    /**
     * Sets the value of the previousDayBid property.
     * 
     */
    public void setPreviousDayBid(double value) {
        this.previousDayBid = value;
    }

    /**
     * Gets the value of the previousDayBidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayBidDate() {
        return previousDayBidDate;
    }

    /**
     * Sets the value of the previousDayBidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayBidDate(String value) {
        this.previousDayBidDate = value;
    }

    /**
     * Gets the value of the previousDayBidTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayBidTime() {
        return previousDayBidTime;
    }

    /**
     * Sets the value of the previousDayBidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayBidTime(String value) {
        this.previousDayBidTime = value;
    }

    /**
     * Gets the value of the previousDayBidStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayBidStyle() {
        return previousDayBidStyle;
    }

    /**
     * Sets the value of the previousDayBidStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayBidStyle(String value) {
        this.previousDayBidStyle = value;
    }

    /**
     * Gets the value of the previousDayMid property.
     * 
     */
    public double getPreviousDayMid() {
        return previousDayMid;
    }

    /**
     * Sets the value of the previousDayMid property.
     * 
     */
    public void setPreviousDayMid(double value) {
        this.previousDayMid = value;
    }

    /**
     * Gets the value of the previousDayMidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayMidDate() {
        return previousDayMidDate;
    }

    /**
     * Sets the value of the previousDayMidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayMidDate(String value) {
        this.previousDayMidDate = value;
    }

    /**
     * Gets the value of the previousDayMidStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDayMidStyle() {
        return previousDayMidStyle;
    }

    /**
     * Sets the value of the previousDayMidStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDayMidStyle(String value) {
        this.previousDayMidStyle = value;
    }

    /**
     * Gets the value of the priceForYieldCalculation property.
     * 
     */
    public double getPriceForYieldCalculation() {
        return priceForYieldCalculation;
    }

    /**
     * Sets the value of the priceForYieldCalculation property.
     * 
     */
    public void setPriceForYieldCalculation(double value) {
        this.priceForYieldCalculation = value;
    }

    /**
     * Gets the value of the priceForYieldCalculationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceForYieldCalculationDate() {
        return priceForYieldCalculationDate;
    }

    /**
     * Sets the value of the priceForYieldCalculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceForYieldCalculationDate(String value) {
        this.priceForYieldCalculationDate = value;
    }

    /**
     * Gets the value of the priceForYieldCalculationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceForYieldCalculationTime() {
        return priceForYieldCalculationTime;
    }

    /**
     * Sets the value of the priceForYieldCalculationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceForYieldCalculationTime(String value) {
        this.priceForYieldCalculationTime = value;
    }

    /**
     * Gets the value of the priceForYieldCalculationStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceForYieldCalculationStyle() {
        return priceForYieldCalculationStyle;
    }

    /**
     * Sets the value of the priceForYieldCalculationStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceForYieldCalculationStyle(String value) {
        this.priceForYieldCalculationStyle = value;
    }

}
