
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountAirportOperationsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountAirportOperationsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enroute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scheduled_departures" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scheduled_arrivals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountAirportOperationsStruct", propOrder = {
    "enroute",
    "departed",
    "scheduledDepartures",
    "scheduledArrivals"
})
public class CountAirportOperationsStruct {

    protected int enroute;
    protected int departed;
    @XmlElement(name = "scheduled_departures")
    protected int scheduledDepartures;
    @XmlElement(name = "scheduled_arrivals")
    protected int scheduledArrivals;

    /**
     * Gets the value of the enroute property.
     * 
     */
    public int getEnroute() {
        return enroute;
    }

    /**
     * Sets the value of the enroute property.
     * 
     */
    public void setEnroute(int value) {
        this.enroute = value;
    }

    /**
     * Gets the value of the departed property.
     * 
     */
    public int getDeparted() {
        return departed;
    }

    /**
     * Sets the value of the departed property.
     * 
     */
    public void setDeparted(int value) {
        this.departed = value;
    }

    /**
     * Gets the value of the scheduledDepartures property.
     * 
     */
    public int getScheduledDepartures() {
        return scheduledDepartures;
    }

    /**
     * Sets the value of the scheduledDepartures property.
     * 
     */
    public void setScheduledDepartures(int value) {
        this.scheduledDepartures = value;
    }

    /**
     * Gets the value of the scheduledArrivals property.
     * 
     */
    public int getScheduledArrivals() {
        return scheduledArrivals;
    }

    /**
     * Sets the value of the scheduledArrivals property.
     * 
     */
    public void setScheduledArrivals(int value) {
        this.scheduledArrivals = value;
    }

}
