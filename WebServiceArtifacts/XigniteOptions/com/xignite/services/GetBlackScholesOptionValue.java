
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
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}OptionType"/>
 *         &lt;element name="StockPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="StrikePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="YearsToMaturity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RiskFreeRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Volatility" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "type",
    "stockPrice",
    "strikePrice",
    "yearsToMaturity",
    "riskFreeRate",
    "volatility"
})
@XmlRootElement(name = "GetBlackScholesOptionValue")
public class GetBlackScholesOptionValue {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected OptionType type;
    @XmlElement(name = "StockPrice")
    protected double stockPrice;
    @XmlElement(name = "StrikePrice")
    protected double strikePrice;
    @XmlElement(name = "YearsToMaturity")
    protected double yearsToMaturity;
    @XmlElement(name = "RiskFreeRate")
    protected double riskFreeRate;
    @XmlElement(name = "Volatility")
    protected double volatility;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType }
     *     
     */
    public OptionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType }
     *     
     */
    public void setType(OptionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the stockPrice property.
     * 
     */
    public double getStockPrice() {
        return stockPrice;
    }

    /**
     * Sets the value of the stockPrice property.
     * 
     */
    public void setStockPrice(double value) {
        this.stockPrice = value;
    }

    /**
     * Gets the value of the strikePrice property.
     * 
     */
    public double getStrikePrice() {
        return strikePrice;
    }

    /**
     * Sets the value of the strikePrice property.
     * 
     */
    public void setStrikePrice(double value) {
        this.strikePrice = value;
    }

    /**
     * Gets the value of the yearsToMaturity property.
     * 
     */
    public double getYearsToMaturity() {
        return yearsToMaturity;
    }

    /**
     * Sets the value of the yearsToMaturity property.
     * 
     */
    public void setYearsToMaturity(double value) {
        this.yearsToMaturity = value;
    }

    /**
     * Gets the value of the riskFreeRate property.
     * 
     */
    public double getRiskFreeRate() {
        return riskFreeRate;
    }

    /**
     * Sets the value of the riskFreeRate property.
     * 
     */
    public void setRiskFreeRate(double value) {
        this.riskFreeRate = value;
    }

    /**
     * Gets the value of the volatility property.
     * 
     */
    public double getVolatility() {
        return volatility;
    }

    /**
     * Sets the value of the volatility property.
     * 
     */
    public void setVolatility(double value) {
        this.volatility = value;
    }

}
