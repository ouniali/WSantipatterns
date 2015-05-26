
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Swaption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Swaption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="FirstType" type="{http://www.xignite.com/services/}SwaptionTypes"/>
 *         &lt;element name="SecondType" type="{http://www.xignite.com/services/}SwaptionTypes"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.xignite.com/services/}SwapCurrencyTypes"/>
 *         &lt;element name="Last" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Open" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Close" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Bid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Ask" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Change" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Swaption", propOrder = {
    "firstType",
    "secondType",
    "date",
    "currency",
    "last",
    "open",
    "high",
    "low",
    "close",
    "bid",
    "ask",
    "change"
})
public class Swaption
    extends Common
{

    @XmlElement(name = "FirstType", required = true)
    @XmlSchemaType(name = "string")
    protected SwaptionTypes firstType;
    @XmlElement(name = "SecondType", required = true)
    @XmlSchemaType(name = "string")
    protected SwaptionTypes secondType;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Currency", required = true)
    @XmlSchemaType(name = "string")
    protected SwapCurrencyTypes currency;
    @XmlElement(name = "Last")
    protected double last;
    @XmlElement(name = "Open")
    protected double open;
    @XmlElement(name = "High")
    protected double high;
    @XmlElement(name = "Low")
    protected double low;
    @XmlElement(name = "Close")
    protected double close;
    @XmlElement(name = "Bid")
    protected double bid;
    @XmlElement(name = "Ask")
    protected double ask;
    @XmlElement(name = "Change")
    protected double change;

    /**
     * Gets the value of the firstType property.
     * 
     * @return
     *     possible object is
     *     {@link SwaptionTypes }
     *     
     */
    public SwaptionTypes getFirstType() {
        return firstType;
    }

    /**
     * Sets the value of the firstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwaptionTypes }
     *     
     */
    public void setFirstType(SwaptionTypes value) {
        this.firstType = value;
    }

    /**
     * Gets the value of the secondType property.
     * 
     * @return
     *     possible object is
     *     {@link SwaptionTypes }
     *     
     */
    public SwaptionTypes getSecondType() {
        return secondType;
    }

    /**
     * Sets the value of the secondType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwaptionTypes }
     *     
     */
    public void setSecondType(SwaptionTypes value) {
        this.secondType = value;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link SwapCurrencyTypes }
     *     
     */
    public SwapCurrencyTypes getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwapCurrencyTypes }
     *     
     */
    public void setCurrency(SwapCurrencyTypes value) {
        this.currency = value;
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

}
