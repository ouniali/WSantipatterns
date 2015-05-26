
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
 *         &lt;element name="FlightsNearResult" type="{http://planexml.flightwise.com/ws}ArrayOfFIStatic" minOccurs="0"/>
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
    "flightsNearResult"
})
@XmlRootElement(name = "FlightsNearResponse")
public class FlightsNearResponse {

    @XmlElement(name = "FlightsNearResult")
    protected ArrayOfFIStatic flightsNearResult;

    /**
     * Gets the value of the flightsNearResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFIStatic }
     *     
     */
    public ArrayOfFIStatic getFlightsNearResult() {
        return flightsNearResult;
    }

    /**
     * Sets the value of the flightsNearResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFIStatic }
     *     
     */
    public void setFlightsNearResult(ArrayOfFIStatic value) {
        this.flightsNearResult = value;
    }

}
