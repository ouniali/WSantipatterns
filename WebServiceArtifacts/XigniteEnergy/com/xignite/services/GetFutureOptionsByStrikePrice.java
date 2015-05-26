
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
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}OptionTypes"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StrikePrices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "type",
    "year",
    "strikePrices"
})
@XmlRootElement(name = "GetFutureOptionsByStrikePrice")
public class GetFutureOptionsByStrikePrice {

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected OptionTypes type;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "StrikePrices")
    protected String strikePrices;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OptionTypes }
     *     
     */
    public OptionTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionTypes }
     *     
     */
    public void setType(OptionTypes value) {
        this.type = value;
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
     * Gets the value of the strikePrices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrikePrices() {
        return strikePrices;
    }

    /**
     * Sets the value of the strikePrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrikePrices(String value) {
        this.strikePrices = value;
    }

}