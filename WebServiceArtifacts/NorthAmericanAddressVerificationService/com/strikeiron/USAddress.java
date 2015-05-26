
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.strikeiron.com}Address">
 *       &lt;sequence>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Urbanization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZIPPlus4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZIPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZIPAddOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMBDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DPCheckDigit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LACS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMRA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DPV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DPVFootnote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CongressDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeoCode" type="{http://www.strikeiron.com}USGeocode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USAddress", propOrder = {
    "state",
    "urbanization",
    "zipPlus4",
    "zipCode",
    "zipAddOn",
    "carrierRoute",
    "pmb",
    "pmbDesignator",
    "deliveryPoint",
    "dpCheckDigit",
    "lacs",
    "cmra",
    "dpv",
    "dpvFootnote",
    "rdi",
    "recordType",
    "congressDistrict",
    "county",
    "countyNumber",
    "stateNumber",
    "geoCode"
})
public class USAddress
    extends Address
{

    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Urbanization")
    protected String urbanization;
    @XmlElement(name = "ZIPPlus4")
    protected String zipPlus4;
    @XmlElement(name = "ZIPCode")
    protected String zipCode;
    @XmlElement(name = "ZIPAddOn")
    protected String zipAddOn;
    @XmlElement(name = "CarrierRoute")
    protected String carrierRoute;
    @XmlElement(name = "PMB")
    protected String pmb;
    @XmlElement(name = "PMBDesignator")
    protected String pmbDesignator;
    @XmlElement(name = "DeliveryPoint")
    protected String deliveryPoint;
    @XmlElement(name = "DPCheckDigit")
    protected String dpCheckDigit;
    @XmlElement(name = "LACS")
    protected String lacs;
    @XmlElement(name = "CMRA")
    protected String cmra;
    @XmlElement(name = "DPV")
    protected String dpv;
    @XmlElement(name = "DPVFootnote")
    protected String dpvFootnote;
    @XmlElement(name = "RDI")
    protected String rdi;
    @XmlElement(name = "RecordType")
    protected String recordType;
    @XmlElement(name = "CongressDistrict")
    protected String congressDistrict;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "CountyNumber")
    protected String countyNumber;
    @XmlElement(name = "StateNumber")
    protected String stateNumber;
    @XmlElement(name = "GeoCode")
    protected USGeocode geoCode;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the urbanization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrbanization() {
        return urbanization;
    }

    /**
     * Sets the value of the urbanization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrbanization(String value) {
        this.urbanization = value;
    }

    /**
     * Gets the value of the zipPlus4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPPlus4() {
        return zipPlus4;
    }

    /**
     * Sets the value of the zipPlus4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPPlus4(String value) {
        this.zipPlus4 = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the zipAddOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPAddOn() {
        return zipAddOn;
    }

    /**
     * Sets the value of the zipAddOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPAddOn(String value) {
        this.zipAddOn = value;
    }

    /**
     * Gets the value of the carrierRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierRoute() {
        return carrierRoute;
    }

    /**
     * Sets the value of the carrierRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierRoute(String value) {
        this.carrierRoute = value;
    }

    /**
     * Gets the value of the pmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMB() {
        return pmb;
    }

    /**
     * Sets the value of the pmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMB(String value) {
        this.pmb = value;
    }

    /**
     * Gets the value of the pmbDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMBDesignator() {
        return pmbDesignator;
    }

    /**
     * Sets the value of the pmbDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMBDesignator(String value) {
        this.pmbDesignator = value;
    }

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Sets the value of the deliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPoint(String value) {
        this.deliveryPoint = value;
    }

    /**
     * Gets the value of the dpCheckDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPCheckDigit() {
        return dpCheckDigit;
    }

    /**
     * Sets the value of the dpCheckDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPCheckDigit(String value) {
        this.dpCheckDigit = value;
    }

    /**
     * Gets the value of the lacs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLACS() {
        return lacs;
    }

    /**
     * Sets the value of the lacs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLACS(String value) {
        this.lacs = value;
    }

    /**
     * Gets the value of the cmra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMRA() {
        return cmra;
    }

    /**
     * Sets the value of the cmra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMRA(String value) {
        this.cmra = value;
    }

    /**
     * Gets the value of the dpv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPV() {
        return dpv;
    }

    /**
     * Sets the value of the dpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPV(String value) {
        this.dpv = value;
    }

    /**
     * Gets the value of the dpvFootnote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPVFootnote() {
        return dpvFootnote;
    }

    /**
     * Sets the value of the dpvFootnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPVFootnote(String value) {
        this.dpvFootnote = value;
    }

    /**
     * Gets the value of the rdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDI() {
        return rdi;
    }

    /**
     * Sets the value of the rdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDI(String value) {
        this.rdi = value;
    }

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordType(String value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the congressDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCongressDistrict() {
        return congressDistrict;
    }

    /**
     * Sets the value of the congressDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCongressDistrict(String value) {
        this.congressDistrict = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the countyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyNumber() {
        return countyNumber;
    }

    /**
     * Sets the value of the countyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyNumber(String value) {
        this.countyNumber = value;
    }

    /**
     * Gets the value of the stateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateNumber() {
        return stateNumber;
    }

    /**
     * Sets the value of the stateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateNumber(String value) {
        this.stateNumber = value;
    }

    /**
     * Gets the value of the geoCode property.
     * 
     * @return
     *     possible object is
     *     {@link USGeocode }
     *     
     */
    public USGeocode getGeoCode() {
        return geoCode;
    }

    /**
     * Sets the value of the geoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link USGeocode }
     *     
     */
    public void setGeoCode(USGeocode value) {
        this.geoCode = value;
    }

}
