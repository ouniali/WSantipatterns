
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightInfoResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInfoResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightInfoResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}FlightInfoStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfoResults", propOrder = {
    "flightInfoResult"
})
public class FlightInfoResults {

    @XmlElement(name = "FlightInfoResult", required = true)
    protected FlightInfoStruct flightInfoResult;

    /**
     * Gets the value of the flightInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfoStruct }
     *     
     */
    public FlightInfoStruct getFlightInfoResult() {
        return flightInfoResult;
    }

    /**
     * Sets the value of the flightInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfoStruct }
     *     
     */
    public void setFlightInfoResult(FlightInfoStruct value) {
        this.flightInfoResult = value;
    }

}
