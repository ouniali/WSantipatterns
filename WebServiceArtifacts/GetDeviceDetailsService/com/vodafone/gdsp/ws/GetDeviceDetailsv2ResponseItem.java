
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDeviceDetailsv2ResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDeviceDetailsv2ResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerServiceProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customAttribute1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customAttribute2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customAttribute3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customAttribute4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customAttribute5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceInformationList" type="{http://ws.gdsp.vodafone.com/}tDeviceInformationList"/>
 *         &lt;element name="apnList" type="{http://ws.gdsp.vodafone.com/}cApnProfile"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDeviceDetailsv2ResponseItem", propOrder = {
    "returnCode",
    "deviceId",
    "customerServiceProfile",
    "state",
    "imei",
    "baseCountry",
    "customAttribute1",
    "customAttribute2",
    "customAttribute3",
    "customAttribute4",
    "customAttribute5",
    "deviceInformationList",
    "apnList"
})
public class GetDeviceDetailsv2ResponseItem {

    protected ReturnCode returnCode;
    @XmlElement(required = true)
    protected String deviceId;
    @XmlElement(required = true)
    protected String customerServiceProfile;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected String imei;
    @XmlElement(required = true)
    protected String baseCountry;
    @XmlElement(required = true)
    protected String customAttribute1;
    @XmlElement(required = true)
    protected String customAttribute2;
    @XmlElement(required = true)
    protected String customAttribute3;
    @XmlElement(required = true)
    protected String customAttribute4;
    @XmlElement(required = true)
    protected String customAttribute5;
    @XmlElement(required = true)
    protected TDeviceInformationList deviceInformationList;
    @XmlElement(required = true)
    protected CApnProfile apnList;

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
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
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
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
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
     * Gets the value of the deviceInformationList property.
     * 
     * @return
     *     possible object is
     *     {@link TDeviceInformationList }
     *     
     */
    public TDeviceInformationList getDeviceInformationList() {
        return deviceInformationList;
    }

    /**
     * Sets the value of the deviceInformationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDeviceInformationList }
     *     
     */
    public void setDeviceInformationList(TDeviceInformationList value) {
        this.deviceInformationList = value;
    }

    /**
     * Gets the value of the apnList property.
     * 
     * @return
     *     possible object is
     *     {@link CApnProfile }
     *     
     */
    public CApnProfile getApnList() {
        return apnList;
    }

    /**
     * Sets the value of the apnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CApnProfile }
     *     
     */
    public void setApnList(CApnProfile value) {
        this.apnList = value;
    }

}
