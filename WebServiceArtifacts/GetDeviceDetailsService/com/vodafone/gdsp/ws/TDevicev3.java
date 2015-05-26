
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tDevicev3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDevicev3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryMsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iccid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerServiceProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ragStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rogueUsageAlertPresent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highUsageAlertPresent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationLatitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationLongitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationRequestedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationTrackingStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationPollingInterval" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="locationTrackingPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDevicev3", propOrder = {
    "imsi",
    "msisdn",
    "secondaryMsisdn",
    "iccid",
    "customerOrderNumber",
    "customerServiceProfile",
    "ragStatus",
    "state",
    "rogueUsageAlertPresent",
    "highUsageAlertPresent",
    "customAttribute1",
    "customAttribute2",
    "customAttribute3",
    "customAttribute4",
    "customAttribute5",
    "locationLatitude",
    "locationLongitude",
    "locationRequestedFlag",
    "locationTrackingStartDate",
    "locationPollingInterval",
    "locationTrackingPeriod"
})
public class TDevicev3 {

    protected String imsi;
    protected String msisdn;
    protected String secondaryMsisdn;
    protected String iccid;
    protected String customerOrderNumber;
    protected String customerServiceProfile;
    protected String ragStatus;
    protected String state;
    protected String rogueUsageAlertPresent;
    protected String highUsageAlertPresent;
    protected String customAttribute1;
    protected String customAttribute2;
    protected String customAttribute3;
    protected String customAttribute4;
    protected String customAttribute5;
    protected String locationLatitude;
    protected String locationLongitude;
    protected String locationRequestedFlag;
    protected String locationTrackingStartDate;
    protected Long locationPollingInterval;
    protected Long locationTrackingPeriod;

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the secondaryMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryMsisdn() {
        return secondaryMsisdn;
    }

    /**
     * Sets the value of the secondaryMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryMsisdn(String value) {
        this.secondaryMsisdn = value;
    }

    /**
     * Gets the value of the iccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * Sets the value of the iccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccid(String value) {
        this.iccid = value;
    }

    /**
     * Gets the value of the customerOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerOrderNumber() {
        return customerOrderNumber;
    }

    /**
     * Sets the value of the customerOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerOrderNumber(String value) {
        this.customerOrderNumber = value;
    }

    /**
     * Gets the value of the customerServiceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceProfile() {
        return customerServiceProfile;
    }

    /**
     * Sets the value of the customerServiceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceProfile(String value) {
        this.customerServiceProfile = value;
    }

    /**
     * Gets the value of the ragStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRagStatus() {
        return ragStatus;
    }

    /**
     * Sets the value of the ragStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRagStatus(String value) {
        this.ragStatus = value;
    }

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
     * Gets the value of the rogueUsageAlertPresent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRogueUsageAlertPresent() {
        return rogueUsageAlertPresent;
    }

    /**
     * Sets the value of the rogueUsageAlertPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRogueUsageAlertPresent(String value) {
        this.rogueUsageAlertPresent = value;
    }

    /**
     * Gets the value of the highUsageAlertPresent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighUsageAlertPresent() {
        return highUsageAlertPresent;
    }

    /**
     * Sets the value of the highUsageAlertPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighUsageAlertPresent(String value) {
        this.highUsageAlertPresent = value;
    }

    /**
     * Gets the value of the customAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttribute1() {
        return customAttribute1;
    }

    /**
     * Sets the value of the customAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttribute1(String value) {
        this.customAttribute1 = value;
    }

    /**
     * Gets the value of the customAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttribute2() {
        return customAttribute2;
    }

    /**
     * Sets the value of the customAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttribute2(String value) {
        this.customAttribute2 = value;
    }

    /**
     * Gets the value of the customAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttribute3() {
        return customAttribute3;
    }

    /**
     * Sets the value of the customAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttribute3(String value) {
        this.customAttribute3 = value;
    }

    /**
     * Gets the value of the customAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttribute4() {
        return customAttribute4;
    }

    /**
     * Sets the value of the customAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttribute4(String value) {
        this.customAttribute4 = value;
    }

    /**
     * Gets the value of the customAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttribute5() {
        return customAttribute5;
    }

    /**
     * Sets the value of the customAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttribute5(String value) {
        this.customAttribute5 = value;
    }

    /**
     * Gets the value of the locationLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationLatitude() {
        return locationLatitude;
    }

    /**
     * Sets the value of the locationLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationLatitude(String value) {
        this.locationLatitude = value;
    }

    /**
     * Gets the value of the locationLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationLongitude() {
        return locationLongitude;
    }

    /**
     * Sets the value of the locationLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationLongitude(String value) {
        this.locationLongitude = value;
    }

    /**
     * Gets the value of the locationRequestedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationRequestedFlag() {
        return locationRequestedFlag;
    }

    /**
     * Sets the value of the locationRequestedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationRequestedFlag(String value) {
        this.locationRequestedFlag = value;
    }

    /**
     * Gets the value of the locationTrackingStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTrackingStartDate() {
        return locationTrackingStartDate;
    }

    /**
     * Sets the value of the locationTrackingStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTrackingStartDate(String value) {
        this.locationTrackingStartDate = value;
    }

    /**
     * Gets the value of the locationPollingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationPollingInterval() {
        return locationPollingInterval;
    }

    /**
     * Sets the value of the locationPollingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationPollingInterval(Long value) {
        this.locationPollingInterval = value;
    }

    /**
     * Gets the value of the locationTrackingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationTrackingPeriod() {
        return locationTrackingPeriod;
    }

    /**
     * Sets the value of the locationTrackingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationTrackingPeriod(Long value) {
        this.locationTrackingPeriod = value;
    }

}
