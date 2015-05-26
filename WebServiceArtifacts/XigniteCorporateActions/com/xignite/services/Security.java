
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEDOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InactiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeTradingPlace" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AlternateSecurityIdentifiers" type="{http://www.xignite.com/services/}ArrayOfAlternateSecurityIdentifier" minOccurs="0"/>
 *         &lt;element name="CustomAttributes" type="{http://www.xignite.com/services/}ArrayOfCustomAttribute" minOccurs="0"/>
 *         &lt;element name="DataProvider" type="{http://www.xignite.com/services/}DataProviders"/>
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
    "symbol",
    "name",
    "sedol",
    "currency",
    "exchange",
    "activeDate",
    "inactiveDate",
    "homeTradingPlace",
    "active",
    "alternateSecurityIdentifiers",
    "customAttributes",
    "dataProvider"
})
public class Security
    extends Common
{

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SEDOL")
    protected String sedol;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Exchange")
    protected String exchange;
    @XmlElement(name = "ActiveDate")
    protected String activeDate;
    @XmlElement(name = "InactiveDate")
    protected String inactiveDate;
    @XmlElement(name = "HomeTradingPlace")
    protected boolean homeTradingPlace;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "AlternateSecurityIdentifiers")
    protected ArrayOfAlternateSecurityIdentifier alternateSecurityIdentifiers;
    @XmlElement(name = "CustomAttributes")
    protected ArrayOfCustomAttribute customAttributes;
    @XmlElement(name = "DataProvider", required = true)
    @XmlSchemaType(name = "string")
    protected DataProviders dataProvider;

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
     * Gets the value of the activeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveDate() {
        return activeDate;
    }

    /**
     * Sets the value of the activeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveDate(String value) {
        this.activeDate = value;
    }

    /**
     * Gets the value of the inactiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactiveDate() {
        return inactiveDate;
    }

    /**
     * Sets the value of the inactiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactiveDate(String value) {
        this.inactiveDate = value;
    }

    /**
     * Gets the value of the homeTradingPlace property.
     * 
     */
    public boolean isHomeTradingPlace() {
        return homeTradingPlace;
    }

    /**
     * Sets the value of the homeTradingPlace property.
     * 
     */
    public void setHomeTradingPlace(boolean value) {
        this.homeTradingPlace = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the alternateSecurityIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlternateSecurityIdentifier }
     *     
     */
    public ArrayOfAlternateSecurityIdentifier getAlternateSecurityIdentifiers() {
        return alternateSecurityIdentifiers;
    }

    /**
     * Sets the value of the alternateSecurityIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlternateSecurityIdentifier }
     *     
     */
    public void setAlternateSecurityIdentifiers(ArrayOfAlternateSecurityIdentifier value) {
        this.alternateSecurityIdentifiers = value;
    }

    /**
     * Gets the value of the customAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomAttribute }
     *     
     */
    public ArrayOfCustomAttribute getCustomAttributes() {
        return customAttributes;
    }

    /**
     * Sets the value of the customAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomAttribute }
     *     
     */
    public void setCustomAttributes(ArrayOfCustomAttribute value) {
        this.customAttributes = value;
    }

    /**
     * Gets the value of the dataProvider property.
     * 
     * @return
     *     possible object is
     *     {@link DataProviders }
     *     
     */
    public DataProviders getDataProvider() {
        return dataProvider;
    }

    /**
     * Sets the value of the dataProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProviders }
     *     
     */
    public void setDataProvider(DataProviders value) {
        this.dataProvider = value;
    }

}
