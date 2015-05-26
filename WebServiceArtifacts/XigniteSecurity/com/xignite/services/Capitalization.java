
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Capitalization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Capitalization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SharesOutstanding" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EndOfDayPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MarketCap" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capitalization", propOrder = {
    "date",
    "sharesOutstanding",
    "endOfDayPrice",
    "marketCap",
    "volume"
})
public class Capitalization
    extends Common
{

    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "SharesOutstanding")
    protected double sharesOutstanding;
    @XmlElement(name = "EndOfDayPrice")
    protected double endOfDayPrice;
    @XmlElement(name = "MarketCap")
    protected double marketCap;
    @XmlElement(name = "Volume")
    protected double volume;

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
     * Gets the value of the sharesOutstanding property.
     * 
     */
    public double getSharesOutstanding() {
        return sharesOutstanding;
    }

    /**
     * Sets the value of the sharesOutstanding property.
     * 
     */
    public void setSharesOutstanding(double value) {
        this.sharesOutstanding = value;
    }

    /**
     * Gets the value of the endOfDayPrice property.
     * 
     */
    public double getEndOfDayPrice() {
        return endOfDayPrice;
    }

    /**
     * Sets the value of the endOfDayPrice property.
     * 
     */
    public void setEndOfDayPrice(double value) {
        this.endOfDayPrice = value;
    }

    /**
     * Gets the value of the marketCap property.
     * 
     */
    public double getMarketCap() {
        return marketCap;
    }

    /**
     * Sets the value of the marketCap property.
     * 
     */
    public void setMarketCap(double value) {
        this.marketCap = value;
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

}
