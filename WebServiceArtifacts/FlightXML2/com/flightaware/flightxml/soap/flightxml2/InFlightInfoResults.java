
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InFlightInfoResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InFlightInfoResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InFlightInfoResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}InFlightAircraftStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InFlightInfoResults", propOrder = {
    "inFlightInfoResult"
})
public class InFlightInfoResults {

    @XmlElement(name = "InFlightInfoResult", required = true)
    protected InFlightAircraftStruct inFlightInfoResult;

    /**
     * Gets the value of the inFlightInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link InFlightAircraftStruct }
     *     
     */
    public InFlightAircraftStruct getInFlightInfoResult() {
        return inFlightInfoResult;
    }

    /**
     * Sets the value of the inFlightInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InFlightAircraftStruct }
     *     
     */
    public void setInFlightInfoResult(InFlightAircraftStruct value) {
        this.inFlightInfoResult = value;
    }

}
