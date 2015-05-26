
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceStateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceStateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="deviceStateList" type="{http://ws.gdsp.vodafone.com/}tState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceStateResponse", propOrder = {
    "returnCode",
    "deviceStateList"
})
public class DeviceStateResponse {

    protected ReturnCode returnCode;
    protected TState deviceStateList;

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
     * Gets the value of the deviceStateList property.
     * 
     * @return
     *     possible object is
     *     {@link TState }
     *     
     */
    public TState getDeviceStateList() {
        return deviceStateList;
    }

    /**
     * Sets the value of the deviceStateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TState }
     *     
     */
    public void setDeviceStateList(TState value) {
        this.deviceStateList = value;
    }

}
