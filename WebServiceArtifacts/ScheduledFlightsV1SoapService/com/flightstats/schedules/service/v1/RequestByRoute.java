
package com.flightstats.schedules.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestByRoute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestByRoute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.schedules.flightstats.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="departureAirport" type="{http://v1.service.schedules.flightstats.com/}requestedAirportV1" minOccurs="0"/>
 *         &lt;element name="arrivalAirport" type="{http://v1.service.schedules.flightstats.com/}requestedAirportV1" minOccurs="0"/>
 *         &lt;element name="codeType" type="{http://v1.service.schedules.flightstats.com/}requestedString" minOccurs="0"/>
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
@XmlType(name = "requestByRoute", propOrder = {
    "departureAirport",
    "arrivalAirport",
    "codeType",
    "departing",
    "date"
})
public class RequestByRoute
    extends RequestBase
{

    protected RequestedAirportV1 departureAirport;
    protected RequestedAirportV1 arrivalAirport;
    protected RequestedString codeType;
    protected boolean departing;
    protected RequestedDate date;

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAirportV1 }
     *     
     */
    public RequestedAirportV1 getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAirportV1 }
     *     
     */
    public void setDepartureAirport(RequestedAirportV1 value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAirportV1 }
     *     
     */
    public RequestedAirportV1 getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAirportV1 }
     *     
     */
    public void setArrivalAirport(RequestedAirportV1 value) {
        this.arrivalAirport = value;
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
