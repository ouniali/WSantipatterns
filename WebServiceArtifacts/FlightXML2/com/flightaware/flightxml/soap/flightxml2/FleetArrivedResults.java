
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FleetArrivedResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FleetArrivedResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FleetArrivedResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrivalStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetArrivedResults", propOrder = {
    "fleetArrivedResult"
})
public class FleetArrivedResults {

    @XmlElement(name = "FleetArrivedResult", required = true)
    protected ArrivalStruct fleetArrivedResult;

    /**
     * Gets the value of the fleetArrivedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalStruct }
     *     
     */
    public ArrivalStruct getFleetArrivedResult() {
        return fleetArrivedResult;
    }

    /**
     * Sets the value of the fleetArrivedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalStruct }
     *     
     */
    public void setFleetArrivedResult(ArrivalStruct value) {
        this.fleetArrivedResult = value;
    }

}
