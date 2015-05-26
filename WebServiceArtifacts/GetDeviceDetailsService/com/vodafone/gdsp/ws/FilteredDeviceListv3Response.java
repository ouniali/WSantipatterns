
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filteredDeviceListv3Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filteredDeviceListv3Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="matchedResults" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="deviceList" type="{http://ws.gdsp.vodafone.com/}tDeviceListv2" maxOccurs="100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filteredDeviceListv3Response", propOrder = {
    "returnCode",
    "matchedResults",
    "deviceList"
})
public class FilteredDeviceListv3Response {

    protected ReturnCode returnCode;
    protected long matchedResults;
    @XmlElement(nillable = true)
    protected List<TDeviceListv2> deviceList;

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
     * Gets the value of the deviceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDeviceListv2 }
     * 
     * 
     */
    public List<TDeviceListv2> getDeviceList() {
        if (deviceList == null) {
            deviceList = new ArrayList<TDeviceListv2>();
        }
        return this.deviceList;
    }

}
