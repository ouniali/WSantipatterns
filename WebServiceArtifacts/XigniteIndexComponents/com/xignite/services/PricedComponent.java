
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricedComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cusip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEDOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valoren" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndustryGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Style" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MarketCapitalization" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AdjustmentFactor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="IndexComponentWeightType" type="{http://www.xignite.com/services/}IndexComponentWeightTypes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedComponent", propOrder = {
    "symbol",
    "name",
    "exchange",
    "cik",
    "cusip",
    "isin",
    "sedol",
    "valoren",
    "sector",
    "clazz",
    "industryGroup",
    "industry",
    "country",
    "currency",
    "style",
    "price",
    "weight",
    "value",
    "marketCapitalization",
    "adjustmentFactor",
    "indexComponentWeightType"
})
public class PricedComponent
    extends Common
{

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Exchange")
    protected String exchange;
    @XmlElement(name = "CIK")
    protected String cik;
    @XmlElement(name = "Cusip")
    protected String cusip;
    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "SEDOL")
    protected String sedol;
    @XmlElement(name = "Valoren")
    protected String valoren;
    @XmlElement(name = "Sector")
    protected String sector;
    @XmlElement(name = "Class")
    protected String clazz;
    @XmlElement(name = "IndustryGroup")
    protected String industryGroup;
    @XmlElement(name = "Industry")
    protected String industry;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Style")
    protected String style;
    @XmlElement(name = "Price")
    protected double price;
    @XmlElement(name = "Weight")
    protected double weight;
    @XmlElement(name = "Value")
    protected double value;
    @XmlElement(name = "MarketCapitalization")
    protected double marketCapitalization;
    @XmlElement(name = "AdjustmentFactor")
    protected double adjustmentFactor;
    @XmlElement(name = "IndexComponentWeightType", required = true)
    @XmlSchemaType(name = "string")
    protected IndexComponentWeightTypes indexComponentWeightType;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchange(String value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the cik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIK() {
        return cik;
    }

    /**
     * Sets the value of the cik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIK(String value) {
        this.cik = value;
    }

    /**
     * Gets the value of the cusip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusip() {
        return cusip;
    }

    /**
     * Sets the value of the cusip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusip(String value) {
        this.cusip = value;
    }

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Gets the value of the sedol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDOL() {
        return sedol;
    }

    /**
     * Sets the value of the sedol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDOL(String value) {
        this.sedol = value;
    }

    /**
     * Gets the value of the valoren property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValoren() {
        return valoren;
    }

    /**
     * Sets the value of the valoren property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValoren(String value) {
        this.valoren = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the industryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryGroup() {
        return industryGroup;
    }

    /**
     * Sets the value of the industryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryGroup(String value) {
        this.industryGroup = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the marketCapitalization property.
     * 
     */
    public double getMarketCapitalization() {
        return marketCapitalization;
    }

    /**
     * Sets the value of the marketCapitalization property.
     * 
     */
    public void setMarketCapitalization(double value) {
        this.marketCapitalization = value;
    }

    /**
     * Gets the value of the adjustmentFactor property.
     * 
     */
    public double getAdjustmentFactor() {
        return adjustmentFactor;
    }

    /**
     * Sets the value of the adjustmentFactor property.
     * 
     */
    public void setAdjustmentFactor(double value) {
        this.adjustmentFactor = value;
    }

    /**
     * Gets the value of the indexComponentWeightType property.
     * 
     * @return
     *     possible object is
     *     {@link IndexComponentWeightTypes }
     *     
     */
    public IndexComponentWeightTypes getIndexComponentWeightType() {
        return indexComponentWeightType;
    }

    /**
     * Sets the value of the indexComponentWeightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexComponentWeightTypes }
     *     
     */
    public void setIndexComponentWeightType(IndexComponentWeightTypes value) {
        this.indexComponentWeightType = value;
    }

}
