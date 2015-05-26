
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundQuote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Previous_Close" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Change" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Percent_Change" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YTDReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Net_Assets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Yield" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundQuote", propOrder = {
    "symbol",
    "previousClose",
    "nav",
    "change",
    "percentChange",
    "time",
    "ytdReturn",
    "netAssets",
    "yield"
})
public class FundQuote {

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "Previous_Close")
    protected String previousClose;
    @XmlElement(name = "NAV")
    protected String nav;
    @XmlElement(name = "Change")
    protected String change;
    @XmlElement(name = "Percent_Change")
    protected String percentChange;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "YTDReturn")
    protected String ytdReturn;
    @XmlElement(name = "Net_Assets")
    protected String netAssets;
    @XmlElement(name = "Yield")
    protected String yield;

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
     * Gets the value of the previousClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousClose() {
        return previousClose;
    }

    /**
     * Sets the value of the previousClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousClose(String value) {
        this.previousClose = value;
    }

    /**
     * Gets the value of the nav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAV() {
        return nav;
    }

    /**
     * Sets the value of the nav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAV(String value) {
        this.nav = value;
    }

    /**
     * Gets the value of the change property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChange(String value) {
        this.change = value;
    }

    /**
     * Gets the value of the percentChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentChange() {
        return percentChange;
    }

    /**
     * Sets the value of the percentChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentChange(String value) {
        this.percentChange = value;
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
     * Gets the value of the ytdReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYTDReturn() {
        return ytdReturn;
    }

    /**
     * Sets the value of the ytdReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYTDReturn(String value) {
        this.ytdReturn = value;
    }

    /**
     * Gets the value of the netAssets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetAssets() {
        return netAssets;
    }

    /**
     * Sets the value of the netAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetAssets(String value) {
        this.netAssets = value;
    }

    /**
     * Gets the value of the yield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYield() {
        return yield;
    }

    /**
     * Sets the value of the yield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYield(String value) {
        this.yield = value;
    }

}
