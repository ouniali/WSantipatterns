
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Instrument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Instrument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="InstrumentClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valoren" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InactiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MostLiquidExchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CFICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CustomAttributes" type="{http://www.xignite.com/services/}ArrayOfCustomAttribute" minOccurs="0"/>
 *         &lt;element name="Securities" type="{http://www.xignite.com/services/}ArrayOfSecurity" minOccurs="0"/>
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
@XmlType(name = "Instrument", propOrder = {
    "instrumentClass",
    "name",
    "cusip",
    "isin",
    "valoren",
    "activeDate",
    "inactiveDate",
    "mostLiquidExchange",
    "cfiCode",
    "description",
    "active",
    "customAttributes",
    "securities",
    "dataProvider"
})
public class Instrument
    extends Common
{

    @XmlElement(name = "InstrumentClass")
    protected String instrumentClass;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CUSIP")
    protected String cusip;
    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "Valoren")
    protected String valoren;
    @XmlElement(name = "ActiveDate")
    protected String activeDate;
    @XmlElement(name = "InactiveDate")
    protected String inactiveDate;
    @XmlElement(name = "MostLiquidExchange")
    protected String mostLiquidExchange;
    @XmlElement(name = "CFICode")
    protected String cfiCode;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "CustomAttributes")
    protected ArrayOfCustomAttribute customAttributes;
    @XmlElement(name = "Securities")
    protected ArrayOfSecurity securities;
    @XmlElement(name = "DataProvider", required = true)
    @XmlSchemaType(name = "string")
    protected DataProviders dataProvider;

    /**
     * Gets the value of the instrumentClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentClass() {
        return instrumentClass;
    }

    /**
     * Sets the value of the instrumentClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentClass(String value) {
        this.instrumentClass = value;
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
     * Gets the value of the cusip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSIP() {
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
    public void setCUSIP(String value) {
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
     * Gets the value of the mostLiquidExchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMostLiquidExchange() {
        return mostLiquidExchange;
    }

    /**
     * Sets the value of the mostLiquidExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMostLiquidExchange(String value) {
        this.mostLiquidExchange = value;
    }

    /**
     * Gets the value of the cfiCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFICode() {
        return cfiCode;
    }

    /**
     * Sets the value of the cfiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFICode(String value) {
        this.cfiCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the securities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecurity }
     *     
     */
    public ArrayOfSecurity getSecurities() {
        return securities;
    }

    /**
     * Sets the value of the securities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecurity }
     *     
     */
    public void setSecurities(ArrayOfSecurity value) {
        this.securities = value;
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
