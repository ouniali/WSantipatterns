
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecodeFlightRouteResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecodeFlightRouteResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DecodeFlightRouteResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfFlightRouteStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecodeFlightRouteResults", propOrder = {
    "decodeFlightRouteResult"
})
public class DecodeFlightRouteResults {

    @XmlElement(name = "DecodeFlightRouteResult", required = true)
    protected ArrayOfFlightRouteStruct decodeFlightRouteResult;

    /**
     * Gets the value of the decodeFlightRouteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFlightRouteStruct }
     *     
     */
    public ArrayOfFlightRouteStruct getDecodeFlightRouteResult() {
        return decodeFlightRouteResult;
    }

    /**
     * Sets the value of the decodeFlightRouteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFlightRouteStruct }
     *     
     */
    public void setDecodeFlightRouteResult(ArrayOfFlightRouteStruct value) {
        this.decodeFlightRouteResult = value;
    }

}
