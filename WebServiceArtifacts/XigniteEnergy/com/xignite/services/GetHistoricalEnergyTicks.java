
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HistoricalPeriod" type="{http://www.xignite.com/services/}HistoricalPeriods"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TickPrecision" type="{http://www.xignite.com/services/}TickPeriod"/>
 *         &lt;element name="TickPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "symbol",
    "month",
    "year",
    "historicalPeriod",
    "startTime",
    "endTime",
    "tickPrecision",
    "tickPeriods"
})
@XmlRootElement(name = "GetHistoricalEnergyTicks")
public class GetHistoricalEnergyTicks {

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "HistoricalPeriod", required = true)
    @XmlSchemaType(name = "string")
    protected HistoricalPeriods historicalPeriod;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "EndTime")
    protected String endTime;
    @XmlElement(name = "TickPrecision", required = true)
    @XmlSchemaType(name = "string")
    protected TickPeriod tickPrecision;
    @XmlElement(name = "TickPeriods")
    protected int tickPeriods;

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
     * Gets the value of the historicalPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalPeriods }
     *     
     */
    public HistoricalPeriods getHistoricalPeriod() {
        return historicalPeriod;
    }

    /**
     * Sets the value of the historicalPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalPeriods }
     *     
     */
    public void setHistoricalPeriod(HistoricalPeriods value) {
        this.historicalPeriod = value;
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
     * Gets the value of the tickPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link TickPeriod }
     *     
     */
    public TickPeriod getTickPrecision() {
        return tickPrecision;
    }

    /**
     * Sets the value of the tickPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link TickPeriod }
     *     
     */
    public void setTickPrecision(TickPeriod value) {
        this.tickPrecision = value;
    }

    /**
     * Gets the value of the tickPeriods property.
     * 
     */
    public int getTickPeriods() {
        return tickPeriods;
    }

    /**
     * Sets the value of the tickPeriods property.
     * 
     */
    public void setTickPeriods(int value) {
        this.tickPeriods = value;
    }

}
