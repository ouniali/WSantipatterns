
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoricalStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricalStatistics">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quotes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Dividends" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastDividendDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Splits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastSplitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricalStatistics", propOrder = {
    "security",
    "startDate",
    "endDate",
    "quotes",
    "dividends",
    "lastDividendDate",
    "splits",
    "lastSplitDate"
})
public class HistoricalStatistics
    extends Common
{

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "Quotes")
    protected int quotes;
    @XmlElement(name = "Dividends")
    protected int dividends;
    @XmlElement(name = "LastDividendDate")
    protected String lastDividendDate;
    @XmlElement(name = "Splits")
    protected int splits;
    @XmlElement(name = "LastSplitDate")
    protected String lastSplitDate;

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
     * Gets the value of the quotes property.
     * 
     */
    public int getQuotes() {
        return quotes;
    }

    /**
     * Sets the value of the quotes property.
     * 
     */
    public void setQuotes(int value) {
        this.quotes = value;
    }

    /**
     * Gets the value of the dividends property.
     * 
     */
    public int getDividends() {
        return dividends;
    }

    /**
     * Sets the value of the dividends property.
     * 
     */
    public void setDividends(int value) {
        this.dividends = value;
    }

    /**
     * Gets the value of the lastDividendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDividendDate() {
        return lastDividendDate;
    }

    /**
     * Sets the value of the lastDividendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDividendDate(String value) {
        this.lastDividendDate = value;
    }

    /**
     * Gets the value of the splits property.
     * 
     */
    public int getSplits() {
        return splits;
    }

    /**
     * Sets the value of the splits property.
     * 
     */
    public void setSplits(int value) {
        this.splits = value;
    }

    /**
     * Gets the value of the lastSplitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSplitDate() {
        return lastSplitDate;
    }

    /**
     * Sets the value of the lastSplitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSplitDate(String value) {
        this.lastSplitDate = value;
    }

}
