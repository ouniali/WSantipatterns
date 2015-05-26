
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Security complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Security">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="CIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cusip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valoren" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Market" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryOrIndustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Security", propOrder = {
    "cik",
    "cusip",
    "symbol",
    "isin",
    "valoren",
    "name",
    "market",
    "categoryOrIndustry"
})
public class Security
    extends Common
{

    @XmlElement(name = "CIK")
    protected String cik;
    @XmlElement(name = "Cusip")
    protected String cusip;
    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "Valoren")
    protected String valoren;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Market")
    protected String market;
    @XmlElement(name = "CategoryOrIndustry")
    protected String categoryOrIndustry;

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
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket(String value) {
        this.market = value;
    }

    /**
     * Gets the value of the categoryOrIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryOrIndustry() {
        return categoryOrIndustry;
    }

    /**
     * Sets the value of the categoryOrIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryOrIndustry(String value) {
        this.categoryOrIndustry = value;
    }

}
