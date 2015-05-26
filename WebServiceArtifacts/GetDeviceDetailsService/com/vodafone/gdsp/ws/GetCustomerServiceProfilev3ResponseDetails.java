
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerServiceProfilev3ResponseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerServiceProfilev3ResponseDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="customerServiceProfileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerServiceProfileDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postTestModeState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="connectState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unassignedIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkedProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tariff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provisioningProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profileInUseFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imeiMatchRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imeiCaptureRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imeiDeviceAction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imeiAlertingAction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultSmsPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="defaultSmsValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultSmsReplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="testModeLimitCsDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="testModeVolume" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="testModeExpiryLimit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="testModeSmsWakeupLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="testModeSmsMtLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="testModeSmsMoLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="highUsageCsAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highUsageCsMonitoringPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highUsageCsThreshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="highUsagePacketThreshold" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="highUsagePacketAction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="highUsagePacketMonitoringPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="highUsageSmsMoAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highUsageSmsMoMonitoringPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highUsageSmsMoThreshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rogueUsagePacketThreshold" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rogueUsageCsAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rogueUsageCsMonitoringPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rogueUsageCsThreshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rogueUsagePacketAction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rogueUsagePacketMonitoringPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rogueUsageSmsMoAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rogueUsageSmsMoMonitoringPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rogueUsageSmsMoThreshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="vpnGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerServiceProfilev3ResponseDetails", propOrder = {
    "returnCode",
    "customerServiceProfileName",
    "customerServiceProfileDescription",
    "postTestModeState",
    "connectState",
    "unassignedIndicator",
    "linkedProfile",
    "tariff",
    "baseCountry",
    "provisioningProfile",
    "profileInUseFlag",
    "imeiMatchRule",
    "imeiCaptureRule",
    "imeiDeviceAction",
    "imeiAlertingAction",
    "tac",
    "defaultSmsPriority",
    "defaultSmsValidityPeriod",
    "defaultSmsReplace",
    "testModeLimitCsDuration",
    "testModeVolume",
    "testModeExpiryLimit",
    "testModeSmsWakeupLimit",
    "testModeSmsMtLimit",
    "testModeSmsMoLimit",
    "highUsageCsAction",
    "highUsageCsMonitoringPeriod",
    "highUsageCsThreshold",
    "highUsagePacketThreshold",
    "highUsagePacketAction",
    "highUsagePacketMonitoringPeriod",
    "highUsageSmsMoAction",
    "highUsageSmsMoMonitoringPeriod",
    "highUsageSmsMoThreshold",
    "rogueUsagePacketThreshold",
    "rogueUsageCsAction",
    "rogueUsageCsMonitoringPeriod",
    "rogueUsageCsThreshold",
    "rogueUsagePacketAction",
    "rogueUsagePacketMonitoringPeriod",
    "rogueUsageSmsMoAction",
    "rogueUsageSmsMoMonitoringPeriod",
    "rogueUsageSmsMoThreshold",
    "vpnGroup"
})
public class GetCustomerServiceProfilev3ResponseDetails {

    protected ReturnCode returnCode;
    @XmlElement(required = true)
    protected String customerServiceProfileName;
    @XmlElement(required = true)
    protected String customerServiceProfileDescription;
    @XmlElement(required = true)
    protected String postTestModeState;
    @XmlElement(required = true)
    protected String connectState;
    @XmlElement(required = true)
    protected String unassignedIndicator;
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
    @XmlElement(required = true)
    protected String imeiMatchRule;
    @XmlElement(required = true)
    protected String imeiCaptureRule;
    @XmlElement(required = true)
    protected String imeiDeviceAction;
    @XmlElement(required = true)
    protected String imeiAlertingAction;
    @XmlElement(required = true)
    protected String tac;
    protected int defaultSmsPriority;
    @XmlElement(required = true)
    protected String defaultSmsValidityPeriod;
    @XmlElement(required = true)
    protected String defaultSmsReplace;
    protected Long testModeLimitCsDuration;
    protected long testModeVolume;
    protected long testModeExpiryLimit;
    protected int testModeSmsWakeupLimit;
    protected int testModeSmsMtLimit;
    protected int testModeSmsMoLimit;
    protected String highUsageCsAction;
    protected String highUsageCsMonitoringPeriod;
    protected Long highUsageCsThreshold;
    protected long highUsagePacketThreshold;
    @XmlElement(required = true)
    protected String highUsagePacketAction;
    @XmlElement(required = true)
    protected String highUsagePacketMonitoringPeriod;
    protected String highUsageSmsMoAction;
    protected String highUsageSmsMoMonitoringPeriod;
    protected Long highUsageSmsMoThreshold;
    protected long rogueUsagePacketThreshold;
    protected String rogueUsageCsAction;
    protected String rogueUsageCsMonitoringPeriod;
    protected Long rogueUsageCsThreshold;
    @XmlElement(required = true)
    protected String rogueUsagePacketAction;
    @XmlElement(required = true)
    protected String rogueUsagePacketMonitoringPeriod;
    protected String rogueUsageSmsMoAction;
    protected String rogueUsageSmsMoMonitoringPeriod;
    protected Long rogueUsageSmsMoThreshold;
    protected String vpnGroup;

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

    /**
     * Gets the value of the imeiMatchRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImeiMatchRule() {
        return imeiMatchRule;
    }

    /**
     * Sets the value of the imeiMatchRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImeiMatchRule(String value) {
        this.imeiMatchRule = value;
    }

    /**
     * Gets the value of the imeiCaptureRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImeiCaptureRule() {
        return imeiCaptureRule;
    }

    /**
     * Sets the value of the imeiCaptureRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImeiCaptureRule(String value) {
        this.imeiCaptureRule = value;
    }

    /**
     * Gets the value of the imeiDeviceAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImeiDeviceAction() {
        return imeiDeviceAction;
    }

    /**
     * Sets the value of the imeiDeviceAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImeiDeviceAction(String value) {
        this.imeiDeviceAction = value;
    }

    /**
     * Gets the value of the imeiAlertingAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImeiAlertingAction() {
        return imeiAlertingAction;
    }

    /**
     * Sets the value of the imeiAlertingAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImeiAlertingAction(String value) {
        this.imeiAlertingAction = value;
    }

    /**
     * Gets the value of the tac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTac() {
        return tac;
    }

    /**
     * Sets the value of the tac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTac(String value) {
        this.tac = value;
    }

    /**
     * Gets the value of the defaultSmsPriority property.
     * 
     */
    public int getDefaultSmsPriority() {
        return defaultSmsPriority;
    }

    /**
     * Sets the value of the defaultSmsPriority property.
     * 
     */
    public void setDefaultSmsPriority(int value) {
        this.defaultSmsPriority = value;
    }

    /**
     * Gets the value of the defaultSmsValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSmsValidityPeriod() {
        return defaultSmsValidityPeriod;
    }

    /**
     * Sets the value of the defaultSmsValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSmsValidityPeriod(String value) {
        this.defaultSmsValidityPeriod = value;
    }

    /**
     * Gets the value of the defaultSmsReplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSmsReplace() {
        return defaultSmsReplace;
    }

    /**
     * Sets the value of the defaultSmsReplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSmsReplace(String value) {
        this.defaultSmsReplace = value;
    }

    /**
     * Gets the value of the testModeLimitCsDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTestModeLimitCsDuration() {
        return testModeLimitCsDuration;
    }

    /**
     * Sets the value of the testModeLimitCsDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTestModeLimitCsDuration(Long value) {
        this.testModeLimitCsDuration = value;
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
     * Gets the value of the testModeSmsWakeupLimit property.
     * 
     */
    public int getTestModeSmsWakeupLimit() {
        return testModeSmsWakeupLimit;
    }

    /**
     * Sets the value of the testModeSmsWakeupLimit property.
     * 
     */
    public void setTestModeSmsWakeupLimit(int value) {
        this.testModeSmsWakeupLimit = value;
    }

    /**
     * Gets the value of the testModeSmsMtLimit property.
     * 
     */
    public int getTestModeSmsMtLimit() {
        return testModeSmsMtLimit;
    }

    /**
     * Sets the value of the testModeSmsMtLimit property.
     * 
     */
    public void setTestModeSmsMtLimit(int value) {
        this.testModeSmsMtLimit = value;
    }

    /**
     * Gets the value of the testModeSmsMoLimit property.
     * 
     */
    public int getTestModeSmsMoLimit() {
        return testModeSmsMoLimit;
    }

    /**
     * Sets the value of the testModeSmsMoLimit property.
     * 
     */
    public void setTestModeSmsMoLimit(int value) {
        this.testModeSmsMoLimit = value;
    }

    /**
     * Gets the value of the highUsageCsAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighUsageCsAction() {
        return highUsageCsAction;
    }

    /**
     * Sets the value of the highUsageCsAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighUsageCsAction(String value) {
        this.highUsageCsAction = value;
    }

    /**
     * Gets the value of the highUsageCsMonitoringPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighUsageCsMonitoringPeriod() {
        return highUsageCsMonitoringPeriod;
    }

    /**
     * Sets the value of the highUsageCsMonitoringPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighUsageCsMonitoringPeriod(String value) {
        this.highUsageCsMonitoringPeriod = value;
    }

    /**
     * Gets the value of the highUsageCsThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHighUsageCsThreshold() {
        return highUsageCsThreshold;
    }

    /**
     * Sets the value of the highUsageCsThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHighUsageCsThreshold(Long value) {
        this.highUsageCsThreshold = value;
    }

    /**
     * Gets the value of the highUsagePacketThreshold property.
     * 
     */
    public long getHighUsagePacketThreshold() {
        return highUsagePacketThreshold;
    }

    /**
     * Sets the value of the highUsagePacketThreshold property.
     * 
     */
    public void setHighUsagePacketThreshold(long value) {
        this.highUsagePacketThreshold = value;
    }

    /**
     * Gets the value of the highUsagePacketAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighUsagePacketAction() {
        return highUsagePacketAction;
    }

    /**
     * Sets the value of the highUsagePacketAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighUsagePacketAction(String value) {
        this.highUsagePacketAction = value;
    }

    /**
     * Gets the value of the highUsagePacketMonitoringPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighUsagePacketMonitoringPeriod() {
        return highUsagePacketMonitoringPeriod;
    }

    /**
     * Sets the value of the highUsagePacketMonitoringPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighUsagePacketMonitoringPeriod(String value) {
        this.highUsagePacketMonitoringPeriod = value;
    }

    /**
     * Gets the value of the highUsageSmsMoAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighUsageSmsMoAction() {
        return highUsageSmsMoAction;
    }

    /**
     * Sets the value of the highUsageSmsMoAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighUsageSmsMoAction(String value) {
        this.highUsageSmsMoAction = value;
    }

    /**
     * Gets the value of the highUsageSmsMoMonitoringPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighUsageSmsMoMonitoringPeriod() {
        return highUsageSmsMoMonitoringPeriod;
    }

    /**
     * Sets the value of the highUsageSmsMoMonitoringPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighUsageSmsMoMonitoringPeriod(String value) {
        this.highUsageSmsMoMonitoringPeriod = value;
    }

    /**
     * Gets the value of the highUsageSmsMoThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHighUsageSmsMoThreshold() {
        return highUsageSmsMoThreshold;
    }

    /**
     * Sets the value of the highUsageSmsMoThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHighUsageSmsMoThreshold(Long value) {
        this.highUsageSmsMoThreshold = value;
    }

    /**
     * Gets the value of the rogueUsagePacketThreshold property.
     * 
     */
    public long getRogueUsagePacketThreshold() {
        return rogueUsagePacketThreshold;
    }

    /**
     * Sets the value of the rogueUsagePacketThreshold property.
     * 
     */
    public void setRogueUsagePacketThreshold(long value) {
        this.rogueUsagePacketThreshold = value;
    }

    /**
     * Gets the value of the rogueUsageCsAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRogueUsageCsAction() {
        return rogueUsageCsAction;
    }

    /**
     * Sets the value of the rogueUsageCsAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRogueUsageCsAction(String value) {
        this.rogueUsageCsAction = value;
    }

    /**
     * Gets the value of the rogueUsageCsMonitoringPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRogueUsageCsMonitoringPeriod() {
        return rogueUsageCsMonitoringPeriod;
    }

    /**
     * Sets the value of the rogueUsageCsMonitoringPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRogueUsageCsMonitoringPeriod(String value) {
        this.rogueUsageCsMonitoringPeriod = value;
    }

    /**
     * Gets the value of the rogueUsageCsThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRogueUsageCsThreshold() {
        return rogueUsageCsThreshold;
    }

    /**
     * Sets the value of the rogueUsageCsThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRogueUsageCsThreshold(Long value) {
        this.rogueUsageCsThreshold = value;
    }

    /**
     * Gets the value of the rogueUsagePacketAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRogueUsagePacketAction() {
        return rogueUsagePacketAction;
    }

    /**
     * Sets the value of the rogueUsagePacketAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRogueUsagePacketAction(String value) {
        this.rogueUsagePacketAction = value;
    }

    /**
     * Gets the value of the rogueUsagePacketMonitoringPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRogueUsagePacketMonitoringPeriod() {
        return rogueUsagePacketMonitoringPeriod;
    }

    /**
     * Sets the value of the rogueUsagePacketMonitoringPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRogueUsagePacketMonitoringPeriod(String value) {
        this.rogueUsagePacketMonitoringPeriod = value;
    }

    /**
     * Gets the value of the rogueUsageSmsMoAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRogueUsageSmsMoAction() {
        return rogueUsageSmsMoAction;
    }

    /**
     * Sets the value of the rogueUsageSmsMoAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRogueUsageSmsMoAction(String value) {
        this.rogueUsageSmsMoAction = value;
    }

    /**
     * Gets the value of the rogueUsageSmsMoMonitoringPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRogueUsageSmsMoMonitoringPeriod() {
        return rogueUsageSmsMoMonitoringPeriod;
    }

    /**
     * Sets the value of the rogueUsageSmsMoMonitoringPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRogueUsageSmsMoMonitoringPeriod(String value) {
        this.rogueUsageSmsMoMonitoringPeriod = value;
    }

    /**
     * Gets the value of the rogueUsageSmsMoThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRogueUsageSmsMoThreshold() {
        return rogueUsageSmsMoThreshold;
    }

    /**
     * Sets the value of the rogueUsageSmsMoThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRogueUsageSmsMoThreshold(Long value) {
        this.rogueUsageSmsMoThreshold = value;
    }

    /**
     * Gets the value of the vpnGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnGroup() {
        return vpnGroup;
    }

    /**
     * Sets the value of the vpnGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnGroup(String value) {
        this.vpnGroup = value;
    }

}
