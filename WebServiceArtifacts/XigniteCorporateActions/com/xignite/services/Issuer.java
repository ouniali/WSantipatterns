
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Issuer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Issuer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InactiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Domicile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CustomAttributes" type="{http://www.xignite.com/services/}ArrayOfCustomAttribute" minOccurs="0"/>
 *         &lt;element name="Instruments" type="{http://www.xignite.com/services/}ArrayOfInstrument" minOccurs="0"/>
 *         &lt;element name="DataProvider" type="{http://www.xignite.com/services/}DataProviders"/>
 *         &lt;element name="Classifications" type="{http://www.xignite.com/services/}ArrayOfClassification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Issuer", propOrder = {
    "name",
    "cik",
    "industry",
    "sector",
    "activeDate",
    "inactiveDate",
    "companyIdentifier",
    "domicile",
    "active",
    "customAttributes",
    "instruments",
    "dataProvider",
    "classifications"
})
public class Issuer
    extends Common
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CIK")
    protected String cik;
    @XmlElement(name = "Industry")
    protected String industry;
    @XmlElement(name = "Sector")
    protected String sector;
    @XmlElement(name = "ActiveDate")
    protected String activeDate;
    @XmlElement(name = "InactiveDate")
    protected String inactiveDate;
    @XmlElement(name = "CompanyIdentifier")
    protected String companyIdentifier;
    @XmlElement(name = "Domicile")
    protected String domicile;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "CustomAttributes")
    protected ArrayOfCustomAttribute customAttributes;
    @XmlElement(name = "Instruments")
    protected ArrayOfInstrument instruments;
    @XmlElement(name = "DataProvider", required = true)
    @XmlSchemaType(name = "string")
    protected DataProviders dataProvider;
    @XmlElement(name = "Classifications")
    protected ArrayOfClassification classifications;

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
     * Gets the value of the companyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyIdentifier() {
        return companyIdentifier;
    }

    /**
     * Sets the value of the companyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyIdentifier(String value) {
        this.companyIdentifier = value;
    }

    /**
     * Gets the value of the domicile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicile() {
        return domicile;
    }

    /**
     * Sets the value of the domicile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicile(String value) {
        this.domicile = value;
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
     * Gets the value of the instruments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstrument }
     *     
     */
    public ArrayOfInstrument getInstruments() {
        return instruments;
    }

    /**
     * Sets the value of the instruments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstrument }
     *     
     */
    public void setInstruments(ArrayOfInstrument value) {
        this.instruments = value;
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

    /**
     * Gets the value of the classifications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClassification }
     *     
     */
    public ArrayOfClassification getClassifications() {
        return classifications;
    }

    /**
     * Sets the value of the classifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClassification }
     *     
     */
    public void setClassifications(ArrayOfClassification value) {
        this.classifications = value;
    }

}
