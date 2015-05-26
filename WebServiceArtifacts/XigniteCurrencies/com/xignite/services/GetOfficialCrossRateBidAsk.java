
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
 *         &lt;element name="CountryType" type="{http://www.xignite.com/services/}CountryTypes"/>
 *         &lt;element name="Symbol" type="{http://www.xignite.com/services/}Currencies"/>
 *         &lt;element name="AsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "countryType",
    "symbol",
    "asOfDate"
})
@XmlRootElement(name = "GetOfficialCrossRateBidAsk")
public class GetOfficialCrossRateBidAsk {

    @XmlElement(name = "CountryType", required = true)
    @XmlSchemaType(name = "string")
    protected CountryTypes countryType;
    @XmlElement(name = "Symbol", required = true)
    @XmlSchemaType(name = "string")
    protected Currencies symbol;
    @XmlElement(name = "AsOfDate")
    protected String asOfDate;

    /**
     * Gets the value of the countryType property.
     * 
     * @return
     *     possible object is
     *     {@link CountryTypes }
     *     
     */
    public CountryTypes getCountryType() {
        return countryType;
    }

    /**
     * Sets the value of the countryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryTypes }
     *     
     */
    public void setCountryType(CountryTypes value) {
        this.countryType = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link Currencies }
     *     
     */
    public Currencies getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currencies }
     *     
     */
    public void setSymbol(Currencies value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsOfDate(String value) {
        this.asOfDate = value;
    }

}
