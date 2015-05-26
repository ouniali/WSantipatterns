
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateDeviceCredentialsv2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateDeviceCredentialsv2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceId" type="{http://ws.gdsp.vodafone.com/}tDeviceId"/>
 *         &lt;element name="credentialList" type="{http://ws.gdsp.vodafone.com/}uCredentialList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateDeviceCredentialsv2", propOrder = {
    "deviceId",
    "credentialList"
})
public class UpdateDeviceCredentialsv2 {

    @XmlElement(required = true)
    protected String deviceId;
    @XmlElement(required = true)
    protected UCredentialList credentialList;

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
     * Gets the value of the credentialList property.
     * 
     * @return
     *     possible object is
     *     {@link UCredentialList }
     *     
     */
    public UCredentialList getCredentialList() {
        return credentialList;
    }

    /**
     * Sets the value of the credentialList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCredentialList }
     *     
     */
    public void setCredentialList(UCredentialList value) {
        this.credentialList = value;
    }

}
