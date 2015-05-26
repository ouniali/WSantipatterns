
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDeviceLocationHistoryDetailsResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDeviceLocationHistoryDetailsResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceLocationHistory" type="{http://ws.gdsp.vodafone.com/}deviceLocationHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deviceLocationHistoryListLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deviceLocationHistoryTableLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "getDeviceLocationHistoryDetailsResponseItem", propOrder = {
    "deviceLocationHistory",
    "deviceLocationHistoryListLength",
    "deviceLocationHistoryTableLength",
    "returnCode"
})
public class GetDeviceLocationHistoryDetailsResponseItem {

    @XmlElement(nillable = true)
    protected List<DeviceLocationHistory> deviceLocationHistory;
    protected Integer deviceLocationHistoryListLength;
    protected Integer deviceLocationHistoryTableLength;
    protected ReturnCode returnCode;

    /**
     * Gets the value of the deviceLocationHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceLocationHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceLocationHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceLocationHistory }
     * 
     * 
     */
    public List<DeviceLocationHistory> getDeviceLocationHistory() {
        if (deviceLocationHistory == null) {
            deviceLocationHistory = new ArrayList<DeviceLocationHistory>();
        }
        return this.deviceLocationHistory;
    }

    /**
     * Gets the value of the deviceLocationHistoryListLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeviceLocationHistoryListLength() {
        return deviceLocationHistoryListLength;
    }

    /**
     * Sets the value of the deviceLocationHistoryListLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeviceLocationHistoryListLength(Integer value) {
        this.deviceLocationHistoryListLength = value;
    }

    /**
     * Gets the value of the deviceLocationHistoryTableLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeviceLocationHistoryTableLength() {
        return deviceLocationHistoryTableLength;
    }

    /**
     * Sets the value of the deviceLocationHistoryTableLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeviceLocationHistoryTableLength(Integer value) {
        this.deviceLocationHistoryTableLength = value;
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
