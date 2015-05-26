
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
 *         &lt;element name="GetMyShipmentTrackForASPClientResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getMyShipmentTrackForASPClientResult"
})
@XmlRootElement(name = "GetMyShipmentTrackForASPClientResponse")
public class GetMyShipmentTrackForASPClientResponse {

    @XmlElement(name = "GetMyShipmentTrackForASPClientResult")
    protected String getMyShipmentTrackForASPClientResult;

    /**
     * Gets the value of the getMyShipmentTrackForASPClientResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetMyShipmentTrackForASPClientResult() {
        return getMyShipmentTrackForASPClientResult;
    }

    /**
     * Sets the value of the getMyShipmentTrackForASPClientResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetMyShipmentTrackForASPClientResult(String value) {
        this.getMyShipmentTrackForASPClientResult = value;
    }

}
