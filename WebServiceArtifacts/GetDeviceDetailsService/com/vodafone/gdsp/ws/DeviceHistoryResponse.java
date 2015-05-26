
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceHistoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="matchedResults" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="deviceHistoryList" type="{http://ws.gdsp.vodafone.com/}tDeviceHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceHistoryResponse", propOrder = {
    "returnCode",
    "matchedResults",
    "deviceHistoryList"
})
public class DeviceHistoryResponse {

    protected ReturnCode returnCode;
    protected long matchedResults;
    protected TDeviceHistory deviceHistoryList;

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
     * Gets the value of the matchedResults property.
     * 
     */
    public long getMatchedResults() {
        return matchedResults;
    }

    /**
     * Sets the value of the matchedResults property.
     * 
     */
    public void setMatchedResults(long value) {
        this.matchedResults = value;
    }

    /**
     * Gets the value of the deviceHistoryList property.
     * 
     * @return
     *     possible object is
     *     {@link TDeviceHistory }
     *     
     */
    public TDeviceHistory getDeviceHistoryList() {
        return deviceHistoryList;
    }

    /**
     * Sets the value of the deviceHistoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDeviceHistory }
     *     
     */
    public void setDeviceHistoryList(TDeviceHistory value) {
        this.deviceHistoryList = value;
    }

}
