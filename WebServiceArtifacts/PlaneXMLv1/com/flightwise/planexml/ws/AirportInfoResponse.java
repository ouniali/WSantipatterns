
package com.flightwise.planexml.ws;

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
 *         &lt;element name="AirportInfoResult" type="{http://planexml.flightwise.com/ws}ArrayOfAirport" minOccurs="0"/>
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
    "airportInfoResult"
})
@XmlRootElement(name = "AirportInfoResponse")
public class AirportInfoResponse {

    @XmlElement(name = "AirportInfoResult")
    protected ArrayOfAirport airportInfoResult;

    /**
     * Gets the value of the airportInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirport }
     *     
     */
    public ArrayOfAirport getAirportInfoResult() {
        return airportInfoResult;
    }

    /**
     * Sets the value of the airportInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirport }
     *     
     */
    public void setAirportInfoResult(ArrayOfAirport value) {
        this.airportInfoResult = value;
    }

}
