
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineInfoResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineInfoResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineInfoResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}AirlineInfoStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineInfoResults", propOrder = {
    "airlineInfoResult"
})
public class AirlineInfoResults {

    @XmlElement(name = "AirlineInfoResult", required = true)
    protected AirlineInfoStruct airlineInfoResult;

    /**
     * Gets the value of the airlineInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineInfoStruct }
     *     
     */
    public AirlineInfoStruct getAirlineInfoResult() {
        return airlineInfoResult;
    }

    /**
     * Sets the value of the airlineInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineInfoStruct }
     *     
     */
    public void setAirlineInfoResult(AirlineInfoStruct value) {
        this.airlineInfoResult = value;
    }

}
