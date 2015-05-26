
package com.fboweb.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumEngines" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EngineType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumSeats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AvgCruiseSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EngineTypeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AircraftTypeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegOwnerAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegOwnerAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegOwnerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegOwnerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegOwnerZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcftMfgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcftModelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeightClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearMfr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registry", propOrder = {
    "numEngines",
    "engineType",
    "aircraftType",
    "numSeats",
    "category",
    "avgCruiseSpeed",
    "serialNumber",
    "categoryText",
    "engineTypeText",
    "aircraftTypeText",
    "regOwnerName",
    "regOwnerAddress1",
    "regOwnerAddress2",
    "regOwnerCity",
    "regOwnerState",
    "regOwnerZip",
    "acftMfgName",
    "acftModelName",
    "weightClass",
    "yearMfr"
})
public class Registry {

    @XmlElement(name = "NumEngines")
    protected int numEngines;
    @XmlElement(name = "EngineType")
    protected int engineType;
    @XmlElement(name = "AircraftType")
    protected int aircraftType;
    @XmlElement(name = "NumSeats")
    protected int numSeats;
    @XmlElement(name = "Category")
    protected int category;
    @XmlElement(name = "AvgCruiseSpeed")
    protected int avgCruiseSpeed;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "CategoryText")
    protected String categoryText;
    @XmlElement(name = "EngineTypeText")
    protected String engineTypeText;
    @XmlElement(name = "AircraftTypeText")
    protected String aircraftTypeText;
    @XmlElement(name = "RegOwnerName")
    protected String regOwnerName;
    @XmlElement(name = "RegOwnerAddress1")
    protected String regOwnerAddress1;
    @XmlElement(name = "RegOwnerAddress2")
    protected String regOwnerAddress2;
    @XmlElement(name = "RegOwnerCity")
    protected String regOwnerCity;
    @XmlElement(name = "RegOwnerState")
    protected String regOwnerState;
    @XmlElement(name = "RegOwnerZip")
    protected String regOwnerZip;
    @XmlElement(name = "AcftMfgName")
    protected String acftMfgName;
    @XmlElement(name = "AcftModelName")
    protected String acftModelName;
    @XmlElement(name = "WeightClass")
    protected String weightClass;
    @XmlElement(name = "YearMfr")
    protected String yearMfr;

    /**
     * Gets the value of the numEngines property.
     * 
     */
    public int getNumEngines() {
        return numEngines;
    }

    /**
     * Sets the value of the numEngines property.
     * 
     */
    public void setNumEngines(int value) {
        this.numEngines = value;
    }

    /**
     * Gets the value of the engineType property.
     * 
     */
    public int getEngineType() {
        return engineType;
    }

    /**
     * Sets the value of the engineType property.
     * 
     */
    public void setEngineType(int value) {
        this.engineType = value;
    }

    /**
     * Gets the value of the aircraftType property.
     * 
     */
    public int getAircraftType() {
        return aircraftType;
    }

    /**
     * Sets the value of the aircraftType property.
     * 
     */
    public void setAircraftType(int value) {
        this.aircraftType = value;
    }

    /**
     * Gets the value of the numSeats property.
     * 
     */
    public int getNumSeats() {
        return numSeats;
    }

    /**
     * Sets the value of the numSeats property.
     * 
     */
    public void setNumSeats(int value) {
        this.numSeats = value;
    }

    /**
     * Gets the value of the category property.
     * 
     */
    public int getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     */
    public void setCategory(int value) {
        this.category = value;
    }

    /**
     * Gets the value of the avgCruiseSpeed property.
     * 
     */
    public int getAvgCruiseSpeed() {
        return avgCruiseSpeed;
    }

    /**
     * Sets the value of the avgCruiseSpeed property.
     * 
     */
    public void setAvgCruiseSpeed(int value) {
        this.avgCruiseSpeed = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the categoryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryText() {
        return categoryText;
    }

    /**
     * Sets the value of the categoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryText(String value) {
        this.categoryText = value;
    }

    /**
     * Gets the value of the engineTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineTypeText() {
        return engineTypeText;
    }

    /**
     * Sets the value of the engineTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineTypeText(String value) {
        this.engineTypeText = value;
    }

    /**
     * Gets the value of the aircraftTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftTypeText() {
        return aircraftTypeText;
    }

    /**
     * Sets the value of the aircraftTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftTypeText(String value) {
        this.aircraftTypeText = value;
    }

    /**
     * Gets the value of the regOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegOwnerName() {
        return regOwnerName;
    }

    /**
     * Sets the value of the regOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegOwnerName(String value) {
        this.regOwnerName = value;
    }

    /**
     * Gets the value of the regOwnerAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegOwnerAddress1() {
        return regOwnerAddress1;
    }

    /**
     * Sets the value of the regOwnerAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegOwnerAddress1(String value) {
        this.regOwnerAddress1 = value;
    }

    /**
     * Gets the value of the regOwnerAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegOwnerAddress2() {
        return regOwnerAddress2;
    }

    /**
     * Sets the value of the regOwnerAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegOwnerAddress2(String value) {
        this.regOwnerAddress2 = value;
    }

    /**
     * Gets the value of the regOwnerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegOwnerCity() {
        return regOwnerCity;
    }

    /**
     * Sets the value of the regOwnerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegOwnerCity(String value) {
        this.regOwnerCity = value;
    }

    /**
     * Gets the value of the regOwnerState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegOwnerState() {
        return regOwnerState;
    }

    /**
     * Sets the value of the regOwnerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegOwnerState(String value) {
        this.regOwnerState = value;
    }

    /**
     * Gets the value of the regOwnerZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegOwnerZip() {
        return regOwnerZip;
    }

    /**
     * Sets the value of the regOwnerZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegOwnerZip(String value) {
        this.regOwnerZip = value;
    }

    /**
     * Gets the value of the acftMfgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcftMfgName() {
        return acftMfgName;
    }

    /**
     * Sets the value of the acftMfgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcftMfgName(String value) {
        this.acftMfgName = value;
    }

    /**
     * Gets the value of the acftModelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcftModelName() {
        return acftModelName;
    }

    /**
     * Sets the value of the acftModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcftModelName(String value) {
        this.acftModelName = value;
    }

    /**
     * Gets the value of the weightClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightClass() {
        return weightClass;
    }

    /**
     * Sets the value of the weightClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightClass(String value) {
        this.weightClass = value;
    }

    /**
     * Gets the value of the yearMfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearMfr() {
        return yearMfr;
    }

    /**
     * Sets the value of the yearMfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearMfr(String value) {
        this.yearMfr = value;
    }

}
