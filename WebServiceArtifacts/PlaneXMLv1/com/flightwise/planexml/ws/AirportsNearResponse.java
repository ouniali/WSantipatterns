
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
 *         &lt;element name="AirportsNearResult" type="{http://planexml.flightwise.com/ws}ArrayOfAirport" minOccurs="0"/>
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
    "airportsNearResult"
})
@XmlRootElement(name = "AirportsNearResponse")
public class AirportsNearResponse {

    @XmlElement(name = "AirportsNearResult")
    protected ArrayOfAirport airportsNearResult;

    /**
     * Gets the value of the airportsNearResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirport }
     *     
     */
    public ArrayOfAirport getAirportsNearResult() {
        return airportsNearResult;
    }

    /**
     * Sets the value of the airportsNearResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirport }
     *     
     */
    public void setAirportsNearResult(ArrayOfAirport value) {
        this.airportsNearResult = value;
    }

}
