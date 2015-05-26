
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Price_Earnings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price_Sales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Market_Cap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EPS_Estimate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockStatistics", propOrder = {
    "priceEarnings",
    "priceSales",
    "marketCap",
    "eps",
    "epsEstimate"
})
public class StockStatistics {

    @XmlElement(name = "Price_Earnings")
    protected String priceEarnings;
    @XmlElement(name = "Price_Sales")
    protected String priceSales;
    @XmlElement(name = "Market_Cap")
    protected String marketCap;
    @XmlElement(name = "EPS")
    protected String eps;
    @XmlElement(name = "EPS_Estimate")
    protected String epsEstimate;

    /**
     * Gets the value of the priceEarnings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceEarnings() {
        return priceEarnings;
    }

    /**
     * Sets the value of the priceEarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceEarnings(String value) {
        this.priceEarnings = value;
    }

    /**
     * Gets the value of the priceSales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceSales() {
        return priceSales;
    }

    /**
     * Sets the value of the priceSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceSales(String value) {
        this.priceSales = value;
    }

    /**
     * Gets the value of the marketCap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCap() {
        return marketCap;
    }

    /**
     * Sets the value of the marketCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCap(String value) {
        this.marketCap = value;
    }

    /**
     * Gets the value of the eps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPS() {
        return eps;
    }

    /**
     * Sets the value of the eps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPS(String value) {
        this.eps = value;
    }

    /**
     * Gets the value of the epsEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPSEstimate() {
        return epsEstimate;
    }

    /**
     * Sets the value of the epsEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPSEstimate(String value) {
        this.epsEstimate = value;
    }

}
