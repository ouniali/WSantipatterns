
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceCredentialsResponsev2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceCredentialsResponsev2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apnCredentailsResponse" type="{http://ws.gdsp.vodafone.com/}apnCredentialResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deviceId" type="{http://ws.gdsp.vodafone.com/}tDeviceId" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceCredentialsResponsev2", propOrder = {
    "apnCredentailsResponse",
    "deviceId",
    "returnCode"
})
public class DeviceCredentialsResponsev2 {

    @XmlElement(nillable = true)
    protected List<ApnCredentialResponse> apnCredentailsResponse;
    protected String deviceId;
    protected ReturnCode returnCode;

    /**
     * Gets the value of the apnCredentailsResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apnCredentailsResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApnCredentailsResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApnCredentialResponse }
     * 
     * 
     */
    public List<ApnCredentialResponse> getApnCredentailsResponse() {
        if (apnCredentailsResponse == null) {
            apnCredentailsResponse = new ArrayList<ApnCredentialResponse>();
        }
        return this.apnCredentailsResponse;
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

}
