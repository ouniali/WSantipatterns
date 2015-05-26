
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoricalQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricalQuote">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Open" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LastClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangeFromOpen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChangeFromOpen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangeFromLastClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChangeFromLastClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SplitRatio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LastAdjusted" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OpenAdjusted" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LastCloseAdjusted" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="HighAdjusted" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LowAdjusted" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangeFromOpenAdjusted" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangeFromLastCloseAdjusted" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VolumeAdjusted" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NotTraded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricalQuote", propOrder = {
    "security",
    "date",
    "last",
    "open",
    "lastClose",
    "high",
    "low",
    "changeFromOpen",
    "percentChangeFromOpen",
    "changeFromLastClose",
    "percentChangeFromLastClose",
    "volume",
    "splitRatio",
    "lastAdjusted",
    "openAdjusted",
    "lastCloseAdjusted",
    "highAdjusted",
    "lowAdjusted",
    "changeFromOpenAdjusted",
    "changeFromLastCloseAdjusted",
    "volumeAdjusted",
    "notTraded"
})
public class HistoricalQuote
    extends Common
{

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Last")
    protected double last;
    @XmlElement(name = "Open")
    protected double open;
    @XmlElement(name = "LastClose")
    protected double lastClose;
    @XmlElement(name = "High")
    protected double high;
    @XmlElement(name = "Low")
    protected double low;
    @XmlElement(name = "ChangeFromOpen")
    protected double changeFromOpen;
    @XmlElement(name = "PercentChangeFromOpen")
    protected double percentChangeFromOpen;
    @XmlElement(name = "ChangeFromLastClose")
    protected double changeFromLastClose;
    @XmlElement(name = "PercentChangeFromLastClose")
    protected double percentChangeFromLastClose;
    @XmlElement(name = "Volume")
    protected double volume;
    @XmlElement(name = "SplitRatio")
    protected double splitRatio;
    @XmlElement(name = "LastAdjusted")
    protected double lastAdjusted;
    @XmlElement(name = "OpenAdjusted")
    protected double openAdjusted;
    @XmlElement(name = "LastCloseAdjusted")
    protected double lastCloseAdjusted;
    @XmlElement(name = "HighAdjusted")
    protected double highAdjusted;
    @XmlElement(name = "LowAdjusted")
    protected double lowAdjusted;
    @XmlElement(name = "ChangeFromOpenAdjusted")
    protected double changeFromOpenAdjusted;
    @XmlElement(name = "ChangeFromLastCloseAdjusted")
    protected double changeFromLastCloseAdjusted;
    @XmlElement(name = "VolumeAdjusted")
    protected double volumeAdjusted;
    @XmlElement(name = "NotTraded")
    protected boolean notTraded;

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
     * Gets the value of the lastClose property.
     * 
     */
    public double getLastClose() {
        return lastClose;
    }

    /**
     * Sets the value of the lastClose property.
     * 
     */
    public void setLastClose(double value) {
        this.lastClose = value;
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
     * Gets the value of the changeFromOpen property.
     * 
     */
    public double getChangeFromOpen() {
        return changeFromOpen;
    }

    /**
     * Sets the value of the changeFromOpen property.
     * 
     */
    public void setChangeFromOpen(double value) {
        this.changeFromOpen = value;
    }

    /**
     * Gets the value of the percentChangeFromOpen property.
     * 
     */
    public double getPercentChangeFromOpen() {
        return percentChangeFromOpen;
    }

    /**
     * Sets the value of the percentChangeFromOpen property.
     * 
     */
    public void setPercentChangeFromOpen(double value) {
        this.percentChangeFromOpen = value;
    }

    /**
     * Gets the value of the changeFromLastClose property.
     * 
     */
    public double getChangeFromLastClose() {
        return changeFromLastClose;
    }

    /**
     * Sets the value of the changeFromLastClose property.
     * 
     */
    public void setChangeFromLastClose(double value) {
        this.changeFromLastClose = value;
    }

    /**
     * Gets the value of the percentChangeFromLastClose property.
     * 
     */
    public double getPercentChangeFromLastClose() {
        return percentChangeFromLastClose;
    }

    /**
     * Sets the value of the percentChangeFromLastClose property.
     * 
     */
    public void setPercentChangeFromLastClose(double value) {
        this.percentChangeFromLastClose = value;
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
     * Gets the value of the splitRatio property.
     * 
     */
    public double getSplitRatio() {
        return splitRatio;
    }

    /**
     * Sets the value of the splitRatio property.
     * 
     */
    public void setSplitRatio(double value) {
        this.splitRatio = value;
    }

    /**
     * Gets the value of the lastAdjusted property.
     * 
     */
    public double getLastAdjusted() {
        return lastAdjusted;
    }

    /**
     * Sets the value of the lastAdjusted property.
     * 
     */
    public void setLastAdjusted(double value) {
        this.lastAdjusted = value;
    }

    /**
     * Gets the value of the openAdjusted property.
     * 
     */
    public double getOpenAdjusted() {
        return openAdjusted;
    }

    /**
     * Sets the value of the openAdjusted property.
     * 
     */
    public void setOpenAdjusted(double value) {
        this.openAdjusted = value;
    }

    /**
     * Gets the value of the lastCloseAdjusted property.
     * 
     */
    public double getLastCloseAdjusted() {
        return lastCloseAdjusted;
    }

    /**
     * Sets the value of the lastCloseAdjusted property.
     * 
     */
    public void setLastCloseAdjusted(double value) {
        this.lastCloseAdjusted = value;
    }

    /**
     * Gets the value of the highAdjusted property.
     * 
     */
    public double getHighAdjusted() {
        return highAdjusted;
    }

    /**
     * Sets the value of the highAdjusted property.
     * 
     */
    public void setHighAdjusted(double value) {
        this.highAdjusted = value;
    }

    /**
     * Gets the value of the lowAdjusted property.
     * 
     */
    public double getLowAdjusted() {
        return lowAdjusted;
    }

    /**
     * Sets the value of the lowAdjusted property.
     * 
     */
    public void setLowAdjusted(double value) {
        this.lowAdjusted = value;
    }

    /**
     * Gets the value of the changeFromOpenAdjusted property.
     * 
     */
    public double getChangeFromOpenAdjusted() {
        return changeFromOpenAdjusted;
    }

    /**
     * Sets the value of the changeFromOpenAdjusted property.
     * 
     */
    public void setChangeFromOpenAdjusted(double value) {
        this.changeFromOpenAdjusted = value;
    }

    /**
     * Gets the value of the changeFromLastCloseAdjusted property.
     * 
     */
    public double getChangeFromLastCloseAdjusted() {
        return changeFromLastCloseAdjusted;
    }

    /**
     * Sets the value of the changeFromLastCloseAdjusted property.
     * 
     */
    public void setChangeFromLastCloseAdjusted(double value) {
        this.changeFromLastCloseAdjusted = value;
    }

    /**
     * Gets the value of the volumeAdjusted property.
     * 
     */
    public double getVolumeAdjusted() {
        return volumeAdjusted;
    }

    /**
     * Sets the value of the volumeAdjusted property.
     * 
     */
    public void setVolumeAdjusted(double value) {
        this.volumeAdjusted = value;
    }

    /**
     * Gets the value of the notTraded property.
     * 
     */
    public boolean isNotTraded() {
        return notTraded;
    }

    /**
     * Sets the value of the notTraded property.
     * 
     */
    public void setNotTraded(boolean value) {
        this.notTraded = value;
    }

}
