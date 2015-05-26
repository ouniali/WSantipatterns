
package com.vodafone.gdsp.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cloneCustomerServiceProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cloneCustomerServiceProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceCustomerServiceProfileName" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileName"/>
 *         &lt;element name="customerServiceProfileName" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileName"/>
 *         &lt;element name="customerServiceProfileDescription" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileDescription"/>
 *         &lt;element name="postTestModeState" type="{http://ws.gdsp.vodafone.com/}tDeviceState" minOccurs="0"/>
 *         &lt;element name="connectState" type="{http://ws.gdsp.vodafone.com/}tDeviceState" minOccurs="0"/>
 *         &lt;element name="unassignedIndicator" type="{http://ws.gdsp.vodafone.com/}tYesNoOptions" minOccurs="0"/>
 *         &lt;element name="highUsageThreshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="highUsageAction" type="{http://ws.gdsp.vodafone.com/}tAlertActionOptions" minOccurs="0"/>
 *         &lt;element name="highUsageMonitoringPeriod" type="{http://ws.gdsp.vodafone.com/}tAlertMonitoringPeriodOptions" minOccurs="0"/>
 *         &lt;element name="rogueUsageThreshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rogueUsageAction" type="{http://ws.gdsp.vodafone.com/}tAlertActionOptions" minOccurs="0"/>
 *         &lt;element name="rogueUsageMonitoringPeriod" type="{http://ws.gdsp.vodafone.com/}tAlertMonitoringPeriodOptions" minOccurs="0"/>
 *         &lt;element name="linkedProfile" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileNameNillable" minOccurs="0"/>
 *         &lt;element name="tariff" type="{http://ws.gdsp.vodafone.com/}tTariffName" minOccurs="0"/>
 *         &lt;element name="baseCountry" type="{http://ws.gdsp.vodafone.com/}tCountryCode" minOccurs="0"/>
 *         &lt;element name="provisioningProfile" type="{http://ws.gdsp.vodafone.com/}tProvisioningProfileName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cloneCustomerServiceProfile", propOrder = {
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
    "provisioningProfile"
})
public class CloneCustomerServiceProfile_Type {

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
    protected Long highUsageThreshold;
    protected Integer highUsageAction;
    protected String highUsageMonitoringPeriod;
    protected Long rogueUsageThreshold;
    protected Integer rogueUsageAction;
    protected String rogueUsageMonitoringPeriod;
    @XmlElementRef(name = "linkedProfile", type = JAXBElement.class, required = false)
    protected JAXBElement<String> linkedProfile;
    protected String tariff;
    protected String baseCountry;
    @XmlElementRef(name = "provisioningProfile", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provisioningProfile;

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
     *     {@link Long }
     *     
     */
    public Long getHighUsageThreshold() {
        return highUsageThreshold;
    }

    /**
     * Sets the value of the highUsageThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHighUsageThreshold(Long value) {
        this.highUsageThreshold = value;
    }

    /**
     * Gets the value of the highUsageAction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHighUsageAction() {
        return highUsageAction;
    }

    /**
     * Sets the value of the highUsageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHighUsageAction(Integer value) {
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
     *     {@link Long }
     *     
     */
    public Long getRogueUsageThreshold() {
        return rogueUsageThreshold;
    }

    /**
     * Sets the value of the rogueUsageThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRogueUsageThreshold(Long value) {
        this.rogueUsageThreshold = value;
    }

    /**
     * Gets the value of the rogueUsageAction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRogueUsageAction() {
        return rogueUsageAction;
    }

    /**
     * Sets the value of the rogueUsageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRogueUsageAction(Integer value) {
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

}
