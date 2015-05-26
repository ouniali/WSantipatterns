
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForwardRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForwardRate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="From" type="{http://www.xignite.com/services/}Currency" minOccurs="0"/>
 *         &lt;element name="To" type="{http://www.xignite.com/services/}Currency" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BidTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ask" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AskTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Forwards" type="{http://www.xignite.com/services/}ArrayOfForward" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForwardRate", propOrder = {
    "symbol",
    "from",
    "to",
    "date",
    "time",
    "bid",
    "bidTime",
    "ask",
    "askTime",
    "factor",
    "forwards"
})
public class ForwardRate
    extends Common
{

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "From")
    protected Currency from;
    @XmlElement(name = "To")
    protected Currency to;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "Bid")
    protected double bid;
    @XmlElement(name = "BidTime")
    protected String bidTime;
    @XmlElement(name = "Ask")
    protected double ask;
    @XmlElement(name = "AskTime")
    protected String askTime;
    @XmlElement(name = "Factor")
    protected int factor;
    @XmlElement(name = "Forwards")
    protected ArrayOfForward forwards;

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
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setFrom(Currency value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTo(Currency value) {
        this.to = value;
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
     * Gets the value of the factor property.
     * 
     */
    public int getFactor() {
        return factor;
    }

    /**
     * Sets the value of the factor property.
     * 
     */
    public void setFactor(int value) {
        this.factor = value;
    }

    /**
     * Gets the value of the forwards property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfForward }
     *     
     */
    public ArrayOfForward getForwards() {
        return forwards;
    }

    /**
     * Sets the value of the forwards property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfForward }
     *     
     */
    public void setForwards(ArrayOfForward value) {
        this.forwards = value;
    }

}
