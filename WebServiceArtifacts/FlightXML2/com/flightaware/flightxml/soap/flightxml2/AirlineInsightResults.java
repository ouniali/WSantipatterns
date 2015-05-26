
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineInsightResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineInsightResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineInsightResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfAirlineInsightStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineInsightResults", propOrder = {
    "airlineInsightResult"
})
public class AirlineInsightResults {

    @XmlElement(name = "AirlineInsightResult", required = true)
    protected ArrayOfAirlineInsightStruct airlineInsightResult;

    /**
     * Gets the value of the airlineInsightResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirlineInsightStruct }
     *     
     */
    public ArrayOfAirlineInsightStruct getAirlineInsightResult() {
        return airlineInsightResult;
    }

    /**
     * Sets the value of the airlineInsightResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirlineInsightStruct }
     *     
     */
    public void setAirlineInsightResult(ArrayOfAirlineInsightStruct value) {
        this.airlineInsightResult = value;
    }

}
