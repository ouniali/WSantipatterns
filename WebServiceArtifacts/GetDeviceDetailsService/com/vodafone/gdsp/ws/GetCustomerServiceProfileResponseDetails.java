
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerServiceProfileResponseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerServiceProfileResponseDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="customerServiceProfileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerServiceProfileDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="testModeVolume" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="testModeExpiryLimit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="postTestModeState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="connectState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unassignedIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="highUsageThreshold" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="highUsageAction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="highUsageMonitoringPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rogueUsageThreshold" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rogueUsageAction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rogueUsageMonitoringPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkedProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tariff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provisioningProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profileInUseFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerServiceProfileResponseDetails", propOrder = {
    "returnCode",
    "customerServiceProfileName",
    "customerServiceProfileDescription",
    "testModeVolume",
    "testModeExpiryLimit",
    "postTestModeState",
    "connectState",
    "unassignedIndicator",
    "highUsageThreshold",
    "highUsageAction",
    "highUsageMonitoringPeriod",
    "rogueUsageThreshold",
    "rogueUsageAction",
    "rogueUsageMonitoringPeriod",
    "linkedProfile",
    "tariff",
    "baseCountry",
    "provisioningProfile",
    "profileInUseFlag"
})
public class GetCustomerServiceProfileResponseDetails {

    protected ReturnCode returnCode;
    @XmlElement(required = true)
    protected String customerServiceProfileName;
    @XmlElement(required = true)
    protected String customerServiceProfileDescription;
    protected long testModeVolume;
    protected long testModeExpiryLimit;
    @XmlElement(required = true)
    protected String postTestModeState;
    @XmlElement(required = true)
    protected String connectState;
    @XmlElement(required = true)
    protected String unassignedIndicator;
    protected long highUsageThreshold;
    protected int highUsageAction;
    @XmlElement(required = true)
    protected String highUsageMonitoringPeriod;
    protected long rogueUsageThreshold;
    protected int rogueUsageAction;
    @XmlElement(required = true)
    protected String rogueUsageMonitoringPeriod;
    @XmlElement(required = true)
    protected String linkedProfile;
    @XmlElement(required = true)
    protected String tariff;
    @XmlElement(required = true)
    protected String baseCountry;
    @XmlElement(required = true)
    protected String provisioningProfile;
    @XmlElement(required = true)
    protected String profileInUseFlag;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCode }
     *     
     */
    public ReturnCode getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCode }
     *     
     */
    public void setReturnCode(ReturnCode value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the customerServiceProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceProfileName() {
        return customerServiceProfileName;
    }

    /**
     * Sets the value of the customerServiceProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceProfileName(String value) {
        this.customerServiceProfileName = value;
    }

    /**
     * Gets the value of the customerServiceProfileDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceProfileDescription() {
        return customerServiceProfileDescription;
    }

    /**
     * Sets the value of the customerServiceProfileDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceProfileDescription(String value) {
        this.customerServiceProfileDescription = value;
    }

    /**
     * Gets the value of the testModeVolume property.
     * 
     */
    public long getTestModeVolume() {
        return testModeVolume;
    }

    /**
     * Sets the value of the testModeVolume property.
     * 
     */
    public void setTestModeVolume(long value) {
        this.testModeVolume = value;
    }

    /**
     * Gets the value of the testModeExpiryLimit property.
     * 
     */
    public long getTestModeExpiryLimit() {
        return testModeExpiryLimit;
    }

    /**
     * Sets the value of the testModeExpiryLimit property.
     * 
     */
    public void setTestModeExpiryLimit(long value) {
        this.testModeExpiryLimit = value;
    }

    /**
     * Gets the value of the postTestModeState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostTestModeState() {
        return postTestModeState;
    }

    /**
     * Sets the value of the postTestModeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostTestModeState(String value) {
        this.postTestModeState = value;
    }

    /**
     * Gets the value of the connectState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectState() {
        return connectState;
    }

    /**
     * Sets the value of the connectState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectState(String value) {
        this.connectState = value;
    }

    /**
     * Gets the value of the unassignedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnassignedIndicator() {
        return unassignedIndicator;
    }

    /**
     * Sets the value of the unassignedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnassignedIndicator(String value) {
        this.unassignedIndicator = value;
    }

    /**
     * Gets the value of the highUsageThreshold property.
     * 
     */
    public long getHighUsageThreshold() {
        return highUsageThreshold;
    }

    /**
     * Sets the value of the highUsageThreshold property.
     * 
     */
    public void setHighUsageThreshold(long value) {
        this.highUsageThreshold = value;
    }

    /**
     * Gets the value of the highUsageAction property.
     * 
     */
    public int getHighUsageAction() {
        return highUsageAction;
    }

    /**
     * Sets the value of the highUsageAction property.
     * 
     */
    public void setHighUsageAction(int value) {
        this.highUsageAction = value;
    }

    /**
     * Gets the value of the highUsageMonitoringPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighUsageMonitoringPeriod() {
        return highUsageMonitoringPeriod;
    }

    /**
     * Sets the value of the highUsageMonitoringPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighUsageMonitoringPeriod(String value) {
        this.highUsageMonitoringPeriod = value;
    }

    /**
     * Gets the value of the rogueUsageThreshold property.
     * 
     */
    public long getRogueUsageThreshold() {
        return rogueUsageThreshold;
    }

    /**
     * Sets the value of the rogueUsageThreshold property.
     * 
     */
    public void setRogueUsageThreshold(long value) {
        this.rogueUsageThreshold = value;
    }

    /**
     * Gets the value of the rogueUsageAction property.
     * 
     */
    public int getRogueUsageAction() {
        return rogueUsageAction;
    }

    /**
     * Sets the value of the rogueUsageAction property.
     * 
     */
    public void setRogueUsageAction(int value) {
        this.rogueUsageAction = value;
    }

    /**
     * Gets the value of the rogueUsageMonitoringPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRogueUsageMonitoringPeriod() {
        return rogueUsageMonitoringPeriod;
    }

    /**
     * Sets the value of the rogueUsageMonitoringPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRogueUsageMonitoringPeriod(String value) {
        this.rogueUsageMonitoringPeriod = value;
    }

    /**
     * Gets the value of the linkedProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedProfile() {
        return linkedProfile;
    }

    /**
     * Sets the value of the linkedProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedProfile(String value) {
        this.linkedProfile = value;
    }

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariff(String value) {
        this.tariff = value;
    }

    /**
     * Gets the value of the baseCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCountry() {
        return baseCountry;
    }

    /**
     * Sets the value of the baseCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCountry(String value) {
        this.baseCountry = value;
    }

    /**
     * Gets the value of the provisioningProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioningProfile() {
        return provisioningProfile;
    }

    /**
     * Sets the value of the provisioningProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioningProfile(String value) {
        this.provisioningProfile = value;
    }

    /**
     * Gets the value of the profileInUseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileInUseFlag() {
        return profileInUseFlag;
    }

    /**
     * Sets the value of the profileInUseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileInUseFlag(String value) {
        this.profileInUseFlag = value;
    }

}
