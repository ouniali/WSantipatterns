
package com.flightstats.schedules.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestByFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestByFlight">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.schedules.flightstats.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="carrier" type="{http://v1.service.schedules.flightstats.com/}requestedAirlineV1" minOccurs="0"/>
 *         &lt;element name="codeType" type="{http://v1.service.schedules.flightstats.com/}requestedString" minOccurs="0"/>
 *         &lt;element name="flightNumber" type="{http://v1.service.schedules.flightstats.com/}requestedString" minOccurs="0"/>
 *         &lt;element name="departing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="date" type="{http://v1.service.schedules.flightstats.com/}requestedDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestByFlight", propOrder = {
    "carrier",
    "codeType",
    "flightNumber",
    "departing",
    "date"
})
public class RequestByFlight
    extends RequestBase
{

    protected RequestedAirlineV1 carrier;
    protected RequestedString codeType;
    protected RequestedString flightNumber;
    protected boolean departing;
    protected RequestedDate date;

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAirlineV1 }
     *     
     */
    public RequestedAirlineV1 getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAirlineV1 }
     *     
     */
    public void setCarrier(RequestedAirlineV1 value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the codeType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedString }
     *     
     */
    public RequestedString getCodeType() {
        return codeType;
    }

    /**
     * Sets the value of the codeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedString }
     *     
     */
    public void setCodeType(RequestedString value) {
        this.codeType = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedString }
     *     
     */
    public RequestedString getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedString }
     *     
     */
    public void setFlightNumber(RequestedString value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the departing property.
     * 
     */
    public boolean isDeparting() {
        return departing;
    }

    /**
     * Sets the value of the departing property.
     * 
     */
    public void setDeparting(boolean value) {
        this.departing = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDate }
     *     
     */
    public RequestedDate getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDate }
     *     
     */
    public void setDate(RequestedDate value) {
        this.date = value;
    }

}
