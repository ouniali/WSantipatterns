
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetHistoricalTrackResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHistoricalTrackResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetHistoricalTrackResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfTrackStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHistoricalTrackResults", propOrder = {
    "getHistoricalTrackResult"
})
public class GetHistoricalTrackResults {

    @XmlElement(name = "GetHistoricalTrackResult", required = true)
    protected ArrayOfTrackStruct getHistoricalTrackResult;

    /**
     * Gets the value of the getHistoricalTrackResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackStruct }
     *     
     */
    public ArrayOfTrackStruct getGetHistoricalTrackResult() {
        return getHistoricalTrackResult;
    }

    /**
     * Sets the value of the getHistoricalTrackResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackStruct }
     *     
     */
    public void setGetHistoricalTrackResult(ArrayOfTrackStruct value) {
        this.getHistoricalTrackResult = value;
    }

}
