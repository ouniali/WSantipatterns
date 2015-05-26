
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreetInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreetInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZIPPlus4Low" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZIPPlus4High" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetPreDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetPostDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNumberLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNumberLowCanadaSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNumberHigh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNumberHighCanadaSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OddEvenCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryStreetNumberLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryStreetNumberHigh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryOddEvenCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuildingFirmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierRouteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseAlterateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LACSStatusInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GovernmentBuildingInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CongressionalDistrictNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanadaStreetSequenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreetInfo", propOrder = {
    "zipPlus4Low",
    "zipPlus4High",
    "streetPreDirection",
    "streetName",
    "streetSuffix",
    "streetPostDirection",
    "streetNumberLow",
    "streetNumberLowCanadaSuffix",
    "streetNumberHigh",
    "streetNumberHighCanadaSuffix",
    "oddEvenCode",
    "secondaryAbbreviation",
    "secondaryStreetNumberLow",
    "secondaryStreetNumberHigh",
    "secondaryOddEvenCode",
    "buildingFirmName",
    "recordTypeCode",
    "carrierRouteId",
    "baseAlterateCode",
    "lacsStatusInd",
    "governmentBuildingInd",
    "congressionalDistrictNumber",
    "canadaStreetSequenceCode"
})
public class StreetInfo {

    @XmlElement(name = "ZIPPlus4Low")
    protected String zipPlus4Low;
    @XmlElement(name = "ZIPPlus4High")
    protected String zipPlus4High;
    @XmlElement(name = "StreetPreDirection")
    protected String streetPreDirection;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "StreetSuffix")
    protected String streetSuffix;
    @XmlElement(name = "StreetPostDirection")
    protected String streetPostDirection;
    @XmlElement(name = "StreetNumberLow")
    protected String streetNumberLow;
    @XmlElement(name = "StreetNumberLowCanadaSuffix")
    protected String streetNumberLowCanadaSuffix;
    @XmlElement(name = "StreetNumberHigh")
    protected String streetNumberHigh;
    @XmlElement(name = "StreetNumberHighCanadaSuffix")
    protected String streetNumberHighCanadaSuffix;
    @XmlElement(name = "OddEvenCode")
    protected String oddEvenCode;
    @XmlElement(name = "SecondaryAbbreviation")
    protected String secondaryAbbreviation;
    @XmlElement(name = "SecondaryStreetNumberLow")
    protected String secondaryStreetNumberLow;
    @XmlElement(name = "SecondaryStreetNumberHigh")
    protected String secondaryStreetNumberHigh;
    @XmlElement(name = "SecondaryOddEvenCode")
    protected String secondaryOddEvenCode;
    @XmlElement(name = "BuildingFirmName")
    protected String buildingFirmName;
    @XmlElement(name = "RecordTypeCode")
    protected String recordTypeCode;
    @XmlElement(name = "CarrierRouteId")
    protected String carrierRouteId;
    @XmlElement(name = "BaseAlterateCode")
    protected String baseAlterateCode;
    @XmlElement(name = "LACSStatusInd")
    protected String lacsStatusInd;
    @XmlElement(name = "GovernmentBuildingInd")
    protected String governmentBuildingInd;
    @XmlElement(name = "CongressionalDistrictNumber")
    protected String congressionalDistrictNumber;
    @XmlElement(name = "CanadaStreetSequenceCode")
    protected String canadaStreetSequenceCode;

    /**
     * Gets the value of the zipPlus4Low property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPPlus4Low() {
        return zipPlus4Low;
    }

    /**
     * Sets the value of the zipPlus4Low property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPPlus4Low(String value) {
        this.zipPlus4Low = value;
    }

    /**
     * Gets the value of the zipPlus4High property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPPlus4High() {
        return zipPlus4High;
    }

    /**
     * Sets the value of the zipPlus4High property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPPlus4High(String value) {
        this.zipPlus4High = value;
    }

    /**
     * Gets the value of the streetPreDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPreDirection() {
        return streetPreDirection;
    }

    /**
     * Sets the value of the streetPreDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPreDirection(String value) {
        this.streetPreDirection = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetSuffix(String value) {
        this.streetSuffix = value;
    }

    /**
     * Gets the value of the streetPostDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPostDirection() {
        return streetPostDirection;
    }

    /**
     * Sets the value of the streetPostDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPostDirection(String value) {
        this.streetPostDirection = value;
    }

    /**
     * Gets the value of the streetNumberLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumberLow() {
        return streetNumberLow;
    }

    /**
     * Sets the value of the streetNumberLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumberLow(String value) {
        this.streetNumberLow = value;
    }

    /**
     * Gets the value of the streetNumberLowCanadaSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumberLowCanadaSuffix() {
        return streetNumberLowCanadaSuffix;
    }

    /**
     * Sets the value of the streetNumberLowCanadaSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumberLowCanadaSuffix(String value) {
        this.streetNumberLowCanadaSuffix = value;
    }

    /**
     * Gets the value of the streetNumberHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumberHigh() {
        return streetNumberHigh;
    }

    /**
     * Sets the value of the streetNumberHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumberHigh(String value) {
        this.streetNumberHigh = value;
    }

    /**
     * Gets the value of the streetNumberHighCanadaSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumberHighCanadaSuffix() {
        return streetNumberHighCanadaSuffix;
    }

    /**
     * Sets the value of the streetNumberHighCanadaSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumberHighCanadaSuffix(String value) {
        this.streetNumberHighCanadaSuffix = value;
    }

    /**
     * Gets the value of the oddEvenCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOddEvenCode() {
        return oddEvenCode;
    }

    /**
     * Sets the value of the oddEvenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOddEvenCode(String value) {
        this.oddEvenCode = value;
    }

    /**
     * Gets the value of the secondaryAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryAbbreviation() {
        return secondaryAbbreviation;
    }

    /**
     * Sets the value of the secondaryAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryAbbreviation(String value) {
        this.secondaryAbbreviation = value;
    }

    /**
     * Gets the value of the secondaryStreetNumberLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryStreetNumberLow() {
        return secondaryStreetNumberLow;
    }

    /**
     * Sets the value of the secondaryStreetNumberLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryStreetNumberLow(String value) {
        this.secondaryStreetNumberLow = value;
    }

    /**
     * Gets the value of the secondaryStreetNumberHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryStreetNumberHigh() {
        return secondaryStreetNumberHigh;
    }

    /**
     * Sets the value of the secondaryStreetNumberHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryStreetNumberHigh(String value) {
        this.secondaryStreetNumberHigh = value;
    }

    /**
     * Gets the value of the secondaryOddEvenCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryOddEvenCode() {
        return secondaryOddEvenCode;
    }

    /**
     * Sets the value of the secondaryOddEvenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryOddEvenCode(String value) {
        this.secondaryOddEvenCode = value;
    }

    /**
     * Gets the value of the buildingFirmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingFirmName() {
        return buildingFirmName;
    }

    /**
     * Sets the value of the buildingFirmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingFirmName(String value) {
        this.buildingFirmName = value;
    }

    /**
     * Gets the value of the recordTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTypeCode() {
        return recordTypeCode;
    }

    /**
     * Sets the value of the recordTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTypeCode(String value) {
        this.recordTypeCode = value;
    }

    /**
     * Gets the value of the carrierRouteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierRouteId() {
        return carrierRouteId;
    }

    /**
     * Sets the value of the carrierRouteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierRouteId(String value) {
        this.carrierRouteId = value;
    }

    /**
     * Gets the value of the baseAlterateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseAlterateCode() {
        return baseAlterateCode;
    }

    /**
     * Sets the value of the baseAlterateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseAlterateCode(String value) {
        this.baseAlterateCode = value;
    }

    /**
     * Gets the value of the lacsStatusInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLACSStatusInd() {
        return lacsStatusInd;
    }

    /**
     * Sets the value of the lacsStatusInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLACSStatusInd(String value) {
        this.lacsStatusInd = value;
    }

    /**
     * Gets the value of the governmentBuildingInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentBuildingInd() {
        return governmentBuildingInd;
    }

    /**
     * Sets the value of the governmentBuildingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentBuildingInd(String value) {
        this.governmentBuildingInd = value;
    }

    /**
     * Gets the value of the congressionalDistrictNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCongressionalDistrictNumber() {
        return congressionalDistrictNumber;
    }

    /**
     * Sets the value of the congressionalDistrictNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCongressionalDistrictNumber(String value) {
        this.congressionalDistrictNumber = value;
    }

    /**
     * Gets the value of the canadaStreetSequenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanadaStreetSequenceCode() {
        return canadaStreetSequenceCode;
    }

    /**
     * Sets the value of the canadaStreetSequenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanadaStreetSequenceCode(String value) {
        this.canadaStreetSequenceCode = value;
    }

}
