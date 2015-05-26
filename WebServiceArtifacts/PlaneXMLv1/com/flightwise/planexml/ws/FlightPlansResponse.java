
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
 *         &lt;element name="FlightPlansResult" type="{http://planexml.flightwise.com/ws}ArrayOfFlightPlan" minOccurs="0"/>
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
    "flightPlansResult"
})
@XmlRootElement(name = "FlightPlansResponse")
public class FlightPlansResponse {

    @XmlElement(name = "FlightPlansResult")
    protected ArrayOfFlightPlan flightPlansResult;

    /**
     * Gets the value of the flightPlansResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFlightPlan }
     *     
     */
    public ArrayOfFlightPlan getFlightPlansResult() {
        return flightPlansResult;
    }

    /**
     * Sets the value of the flightPlansResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFlightPlan }
     *     
     */
    public void setFlightPlansResult(ArrayOfFlightPlan value) {
        this.flightPlansResult = value;
    }

}
