
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChartBar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChartBar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UTCOffset" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Open" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Close" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Trades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TWAP" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VWAP" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Session" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustmentRatio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChartBar", propOrder = {
    "startDate",
    "startTime",
    "endDate",
    "endTime",
    "utcOffset",
    "open",
    "high",
    "low",
    "close",
    "volume",
    "trades",
    "twap",
    "vwap",
    "currency",
    "session",
    "adjustmentRatio"
})
public class ChartBar {

    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "EndTime")
    protected String endTime;
    @XmlElement(name = "UTCOffset")
    protected double utcOffset;
    @XmlElement(name = "Open")
    protected double open;
    @XmlElement(name = "High")
    protected double high;
    @XmlElement(name = "Low")
    protected double low;
    @XmlElement(name = "Close")
    protected double close;
    @XmlElement(name = "Volume")
    protected double volume;
    @XmlElement(name = "Trades")
    protected int trades;
    @XmlElement(name = "TWAP")
    protected double twap;
    @XmlElement(name = "VWAP")
    protected double vwap;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Session")
    protected String session;
    @XmlElement(name = "AdjustmentRatio")
    protected double adjustmentRatio;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the utcOffset property.
     * 
     */
    public double getUTCOffset() {
        return utcOffset;
    }

    /**
     * Sets the value of the utcOffset property.
     * 
     */
    public void setUTCOffset(double value) {
        this.utcOffset = value;
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
     * Gets the value of the trades property.
     * 
     */
    public int getTrades() {
        return trades;
    }

    /**
     * Sets the value of the trades property.
     * 
     */
    public void setTrades(int value) {
        this.trades = value;
    }

    /**
     * Gets the value of the twap property.
     * 
     */
    public double getTWAP() {
        return twap;
    }

    /**
     * Sets the value of the twap property.
     * 
     */
    public void setTWAP(double value) {
        this.twap = value;
    }

    /**
     * Gets the value of the vwap property.
     * 
     */
    public double getVWAP() {
        return vwap;
    }

    /**
     * Sets the value of the vwap property.
     * 
     */
    public void setVWAP(double value) {
        this.vwap = value;
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
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSession(String value) {
        this.session = value;
    }

    /**
     * Gets the value of the adjustmentRatio property.
     * 
     */
    public double getAdjustmentRatio() {
        return adjustmentRatio;
    }

    /**
     * Sets the value of the adjustmentRatio property.
     * 
     */
    public void setAdjustmentRatio(double value) {
        this.adjustmentRatio = value;
    }

}
