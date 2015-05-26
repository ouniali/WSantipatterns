
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InboundFlightInfoResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InboundFlightInfoResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InboundFlightInfoResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}FlightExStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InboundFlightInfoResults", propOrder = {
    "inboundFlightInfoResult"
})
public class InboundFlightInfoResults {

    @XmlElement(name = "InboundFlightInfoResult", required = true)
    protected FlightExStruct inboundFlightInfoResult;

    /**
     * Gets the value of the inboundFlightInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link FlightExStruct }
     *     
     */
    public FlightExStruct getInboundFlightInfoResult() {
        return inboundFlightInfoResult;
    }

    /**
     * Sets the value of the inboundFlightInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightExStruct }
     *     
     */
    public void setInboundFlightInfoResult(FlightExStruct value) {
        this.inboundFlightInfoResult = value;
    }

}
