
package com.vodafone.gdsp.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cloneCustomerServiceProfilev3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cloneCustomerServiceProfilev3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceCustomerServiceProfileName" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileName"/>
 *         &lt;element name="customerServiceProfileName" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileName"/>
 *         &lt;element name="customerServiceProfileDescription" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileDescription"/>
 *         &lt;element name="postTestModeState" type="{http://ws.gdsp.vodafone.com/}tDeviceState" minOccurs="0"/>
 *         &lt;element name="connectState" type="{http://ws.gdsp.vodafone.com/}tDeviceState" minOccurs="0"/>
 *         &lt;element name="unassignedIndicator" type="{http://ws.gdsp.vodafone.com/}tYesNoOptions" minOccurs="0"/>
 *         &lt;element name="highUsageThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highUsageAction" type="{http://ws.gdsp.vodafone.com/}tAlertActionOptionsv2" minOccurs="0"/>
 *         &lt;element name="highUsageMonitoringPeriod" type="{http://ws.gdsp.vodafone.com/}tAlertMonitoringPeriodOptions" minOccurs="0"/>
 *         &lt;element name="rogueUsageThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rogueUsageAction" type="{http://ws.gdsp.vodafone.com/}tAlertActionOptionsv2" minOccurs="0"/>
 *         &lt;element name="rogueUsageMonitoringPeriod" type="{http://ws.gdsp.vodafone.com/}tAlertMonitoringPeriodOptions" minOccurs="0"/>
 *         &lt;element name="linkedProfile" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileNameNillable" minOccurs="0"/>
 *         &lt;element name="tariff" type="{http://ws.gdsp.vodafone.com/}tTariffName" minOccurs="0"/>
 *         &lt;element name="baseCountry" type="{http://ws.gdsp.vodafone.com/}tCountryCode" minOccurs="0"/>
 *         &lt;element name="provisioningProfile" type="{http://ws.gdsp.vodafone.com/}tProvisioningProfileName" minOccurs="0"/>
 *         &lt;element name="imeiMatchRule" type="{http://ws.gdsp.vodafone.com/}tImeiMatchRuleOptions" minOccurs="0"/>
 *         &lt;element name="imeiCaptureRule" type="{http://ws.gdsp.vodafone.com/}tImeiCaptureRuleOptions" minOccurs="0"/>
 *         &lt;element name="imeiDeviceAction" type="{http://ws.gdsp.vodafone.com/}tImeiDeviceActionOptions" minOccurs="0"/>
 *         &lt;element name="imeiAlertingAction" type="{http://ws.gdsp.vodafone.com/}tAlertActionOptions" minOccurs="0"/>
 *         &lt;element name="tac" type="{http://ws.gdsp.vodafone.com/}tTac" minOccurs="0"/>
 *         &lt;element name="defaultSmsPriority" type="{http://ws.gdsp.vodafone.com/}tSmsPriorityOptions" minOccurs="0"/>
 *         &lt;element name="defaultSmsValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultSmsReplace" type="{http://ws.gdsp.vodafone.com/}tYesNoOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cloneCustomerServiceProfilev3", propOrder = {
    "sourceCustomerServiceProfileName",
    "customerServiceProfileName",
    "customerServiceProfileDescription",
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
    "imeiMatchRule",
    "imeiCaptureRule",
    "imeiDeviceAction",
    "imeiAlertingAction",
    "tac",
    "defaultSmsPriority",
    "defaultSmsValidityPeriod",
    "defaultSmsReplace"
})
public class CloneCustomerServiceProfilev3_Type {

    @XmlElement(required = true)
    protected String sourceCustomerServiceProfileName;
    @XmlElement(required = true)
    protected String customerServiceProfileName;
    @XmlElement(required = true)
    protected String customerServiceProfileDescription;
    protected String postTestModeState;
    protected String connectState;
    @XmlSchemaType(name = "string")
    protected TYesNoOptions unassignedIndicator;
    protected String highUsageThreshold;
    protected String highUsageAction;
    protected String highUsageMonitoringPeriod;
    protected String rogueUsageThreshold;
    protected String rogueUsageAction;
    protected String rogueUsageMonitoringPeriod;
    @XmlElementRef(name = "linkedProfile", type = JAXBElement.class, required = false)
    protected JAXBElement<String> linkedProfile;
    protected String tariff;
    protected String baseCountry;
    @XmlElementRef(name = "provisioningProfile", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provisioningProfile;
    @XmlSchemaType(name = "string")
    protected TImeiMatchRuleOptions imeiMatchRule;
    @XmlSchemaType(name = "string")
    protected TImeiCaptureRuleOptions imeiCaptureRule;
    @XmlSchemaType(name = "string")
    protected TImeiDeviceActionOptions imeiDeviceAction;
    protected Integer imeiAlertingAction;
    protected String tac;
    protected Integer defaultSmsPriority;
    protected String defaultSmsValidityPeriod;
    @XmlSchemaType(name = "string")
    protected TYesNoOptions defaultSmsReplace;

    /**
     * Gets the value of the sourceCustomerServiceProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCustomerServiceProfileName() {
        return sourceCustomerServiceProfileName;
    }

    /**
     * Sets the value of the sourceCustomerServiceProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCustomerServiceProfileName(String value) {
        this.sourceCustomerServiceProfileName = value;
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
     *     {@link TYesNoOptions }
     *     
     */
    public TYesNoOptions getUnassignedIndicator() {
        return unassignedIndicator;
    }

    /**
     * Sets the value of the unassignedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYesNoOptions }
     *     
     */
    public void setUnassignedIndicator(TYesNoOptions value) {
        this.unassignedIndicator = value;
    }

    /**
     * Gets the value of the highUsageThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighUsageThreshold() {
        return highUsageThreshold;
    }

    /**
     * Sets the value of the highUsageThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighUsageThreshold(String value) {
        this.highUsageThreshold = value;
    }

    /**
     * Gets the value of the highUsageAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighUsageAction() {
        return highUsageAction;
    }

    /**
     * Sets the value of the highUsageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighUsageAction(String value) {
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRogueUsageThreshold() {
        return rogueUsageThreshold;
    }

    /**
     * Sets the value of the rogueUsageThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRogueUsageThreshold(String value) {
        this.rogueUsageThreshold = value;
    }

    /**
     * Gets the value of the rogueUsageAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRogueUsageAction() {
        return rogueUsageAction;
    }

    /**
     * Sets the value of the rogueUsageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRogueUsageAction(String value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLinkedProfile() {
        return linkedProfile;
    }

    /**
     * Sets the value of the linkedProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLinkedProfile(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvisioningProfile() {
        return provisioningProfile;
    }

    /**
     * Sets the value of the provisioningProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvisioningProfile(JAXBElement<String> value) {
        this.provisioningProfile = value;
    }

    /**
     * Gets the value of the imeiMatchRule property.
     * 
     * @return
     *     possible object is
     *     {@link TImeiMatchRuleOptions }
     *     
     */
    public TImeiMatchRuleOptions getImeiMatchRule() {
        return imeiMatchRule;
    }

    /**
     * Sets the value of the imeiMatchRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImeiMatchRuleOptions }
     *     
     */
    public void setImeiMatchRule(TImeiMatchRuleOptions value) {
        this.imeiMatchRule = value;
    }

    /**
     * Gets the value of the imeiCaptureRule property.
     * 
     * @return
     *     possible object is
     *     {@link TImeiCaptureRuleOptions }
     *     
     */
    public TImeiCaptureRuleOptions getImeiCaptureRule() {
        return imeiCaptureRule;
    }

    /**
     * Sets the value of the imeiCaptureRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImeiCaptureRuleOptions }
     *     
     */
    public void setImeiCaptureRule(TImeiCaptureRuleOptions value) {
        this.imeiCaptureRule = value;
    }

    /**
     * Gets the value of the imeiDeviceAction property.
     * 
     * @return
     *     possible object is
     *     {@link TImeiDeviceActionOptions }
     *     
     */
    public TImeiDeviceActionOptions getImeiDeviceAction() {
        return imeiDeviceAction;
    }

    /**
     * Sets the value of the imeiDeviceAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImeiDeviceActionOptions }
     *     
     */
    public void setImeiDeviceAction(TImeiDeviceActionOptions value) {
        this.imeiDeviceAction = value;
    }

    /**
     * Gets the value of the imeiAlertingAction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImeiAlertingAction() {
        return imeiAlertingAction;
    }

    /**
     * Sets the value of the imeiAlertingAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImeiAlertingAction(Integer value) {
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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultSmsPriority() {
        return defaultSmsPriority;
    }

    /**
     * Sets the value of the defaultSmsPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultSmsPriority(Integer value) {
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
     *     {@link TYesNoOptions }
     *     
     */
    public TYesNoOptions getDefaultSmsReplace() {
        return defaultSmsReplace;
    }

    /**
     * Sets the value of the defaultSmsReplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYesNoOptions }
     *     
     */
    public void setDefaultSmsReplace(TYesNoOptions value) {
        this.defaultSmsReplace = value;
    }

}
