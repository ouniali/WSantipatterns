
package com.vodafone.gdsp.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cloneCustomerServiceProfilev4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cloneCustomerServiceProfilev4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceCustomerServiceProfileName" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileName"/>
 *         &lt;element name="customerServiceProfileName" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileName"/>
 *         &lt;element name="customerServiceProfileDescription" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileDescription"/>
 *         &lt;element name="postTestModeState" type="{http://ws.gdsp.vodafone.com/}tDeviceState" minOccurs="0"/>
 *         &lt;element name="connectState" type="{http://ws.gdsp.vodafone.com/}tDeviceState" minOccurs="0"/>
 *         &lt;element name="unassignedIndicator" type="{http://ws.gdsp.vodafone.com/}tYesNoOptions" minOccurs="0"/>
 *         &lt;element name="highUsagePacketThreshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="highUsagePacketAction" type="{http://ws.gdsp.vodafone.com/}tAlertActionOptionsv2" minOccurs="0"/>
 *         &lt;element name="highUsagePacketMonitoringPeriod" type="{http://ws.gdsp.vodafone.com/}tAlertMonitoringPeriodOptions" minOccurs="0"/>
 *         &lt;element name="rogueUsagePacketThreshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rogueUsagePacketAction" type="{http://ws.gdsp.vodafone.com/}tAlertActionOptionsv2" minOccurs="0"/>
 *         &lt;element name="rogueUsagePacketMonitoringPeriod" type="{http://ws.gdsp.vodafone.com/}tAlertMonitoringPeriodOptions" minOccurs="0"/>
 *         &lt;element name="highUsageCsThreshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="highUsageCsAction" type="{http://ws.gdsp.vodafone.com/}tAlertActionOptionsv2" minOccurs="0"/>
 *         &lt;element name="highUsageCsMonitoringPeriod" type="{http://ws.gdsp.vodafone.com/}tAlertMonitoringPeriodOptions" minOccurs="0"/>
 *         &lt;element name="rogueUsageCsThreshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rogueUsageCsAction" type="{http://ws.gdsp.vodafone.com/}tAlertActionOptionsv2" minOccurs="0"/>
 *         &lt;element name="rogueUsageCsMonitoringPeriod" type="{http://ws.gdsp.vodafone.com/}tAlertMonitoringPeriodOptions" minOccurs="0"/>
 *         &lt;element name="highUsageSmsMoThreshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="highUsageSmsMoAction" type="{http://ws.gdsp.vodafone.com/}tAlertActionOptionsv2" minOccurs="0"/>
 *         &lt;element name="highUsageSmsMoMonitoringPeriod" type="{http://ws.gdsp.vodafone.com/}tAlertMonitoringPeriodOptions" minOccurs="0"/>
 *         &lt;element name="rogueUsageSmsMoThreshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rogueUsageSmsMoAction" type="{http://ws.gdsp.vodafone.com/}tAlertActionOptionsv2" minOccurs="0"/>
 *         &lt;element name="rogueUsageSmsMoMonitoringPeriod" type="{http://ws.gdsp.vodafone.com/}tAlertMonitoringPeriodOptions" minOccurs="0"/>
 *         &lt;element name="vpnGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "cloneCustomerServiceProfilev4", propOrder = {
    "sourceCustomerServiceProfileName",
    "customerServiceProfileName",
    "customerServiceProfileDescription",
    "postTestModeState",
    "connectState",
    "unassignedIndicator",
    "highUsagePacketThreshold",
    "highUsagePacketAction",
    "highUsagePacketMonitoringPeriod",
    "rogueUsagePacketThreshold",
    "rogueUsagePacketAction",
    "rogueUsagePacketMonitoringPeriod",
    "highUsageCsThreshold",
    "highUsageCsAction",
    "highUsageCsMonitoringPeriod",
    "rogueUsageCsThreshold",
    "rogueUsageCsAction",
    "rogueUsageCsMonitoringPeriod",
    "highUsageSmsMoThreshold",
    "highUsageSmsMoAction",
    "highUsageSmsMoMonitoringPeriod",
    "rogueUsageSmsMoThreshold",
    "rogueUsageSmsMoAction",
    "rogueUsageSmsMoMonitoringPeriod",
    "vpnGroup",
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
public class CloneCustomerServiceProfilev4_Type {

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
    protected Long highUsagePacketThreshold;
    protected String highUsagePacketAction;
    protected String highUsagePacketMonitoringPeriod;
    protected Long rogueUsagePacketThreshold;
    protected String rogueUsagePacketAction;
    protected String rogueUsagePacketMonitoringPeriod;
    protected Long highUsageCsThreshold;
    protected String highUsageCsAction;
    protected String highUsageCsMonitoringPeriod;
    protected Long rogueUsageCsThreshold;
    protected String rogueUsageCsAction;
    protected String rogueUsageCsMonitoringPeriod;
    protected Long highUsageSmsMoThreshold;
    protected String highUsageSmsMoAction;
    protected String highUsageSmsMoMonitoringPeriod;
    protected Long rogueUsageSmsMoThreshold;
    protected String rogueUsageSmsMoAction;
    protected String rogueUsageSmsMoMonitoringPeriod;
    protected String vpnGroup;
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
     * Gets the value of the highUsagePacketThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHighUsagePacketThreshold() {
        return highUsagePacketThreshold;
    }

    /**
     * Sets the value of the highUsagePacketThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHighUsagePacketThreshold(Long value) {
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
     * Gets the value of the rogueUsagePacketThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRogueUsagePacketThreshold() {
        return rogueUsagePacketThreshold;
    }

    /**
     * Sets the value of the rogueUsagePacketThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRogueUsagePacketThreshold(Long value) {
        this.rogueUsagePacketThreshold = value;
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
