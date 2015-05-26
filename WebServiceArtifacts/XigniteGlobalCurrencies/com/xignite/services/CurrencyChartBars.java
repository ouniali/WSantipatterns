
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyChartBars complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyChartBars">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Timing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyDescription" type="{http://www.xignite.com/services/}CurrencyDescription" minOccurs="0"/>
 *         &lt;element name="ChartBars" type="{http://www.xignite.com/services/}ArrayOfChartBar" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyChartBars", propOrder = {
    "timing",
    "priceType",
    "currencyDescription",
    "chartBars"
})
public class CurrencyChartBars
    extends Common
{

    @XmlElement(name = "Timing")
    protected String timing;
    @XmlElement(name = "PriceType")
    protected String priceType;
    @XmlElement(name = "CurrencyDescription")
    protected CurrencyDescription currencyDescription;
    @XmlElement(name = "ChartBars")
    protected ArrayOfChartBar chartBars;

    /**
     * Gets the value of the timing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiming() {
        return timing;
    }

    /**
     * Sets the value of the timing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiming(String value) {
        this.timing = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the currencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDescription }
     *     
     */
    public CurrencyDescription getCurrencyDescription() {
        return currencyDescription;
    }

    /**
     * Sets the value of the currencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDescription }
     *     
     */
    public void setCurrencyDescription(CurrencyDescription value) {
        this.currencyDescription = value;
    }

    /**
     * Gets the value of the chartBars property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChartBar }
     *     
     */
    public ArrayOfChartBar getChartBars() {
        return chartBars;
    }

    /**
     * Sets the value of the chartBars property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChartBar }
     *     
     */
    public void setChartBars(ArrayOfChartBar value) {
        this.chartBars = value;
    }

}
