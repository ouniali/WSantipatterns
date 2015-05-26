
package com.carrierate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMyShipmentTrackResult" type="{http://carrierate.com/}TrackingInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMyShipmentTrackResult"
})
@XmlRootElement(name = "GetMyShipmentTrackResponse")
public class GetMyShipmentTrackResponse {

    @XmlElement(name = "GetMyShipmentTrackResult")
    protected TrackingInfo getMyShipmentTrackResult;

    /**
     * Gets the value of the getMyShipmentTrackResult property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingInfo }
     *     
     */
    public TrackingInfo getGetMyShipmentTrackResult() {
        return getMyShipmentTrackResult;
    }

    /**
     * Sets the value of the getMyShipmentTrackResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingInfo }
     *     
     */
    public void setGetMyShipmentTrackResult(TrackingInfo value) {
        this.getMyShipmentTrackResult = value;
    }

}
