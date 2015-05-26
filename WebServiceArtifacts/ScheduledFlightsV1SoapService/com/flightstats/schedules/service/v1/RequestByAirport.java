
package com.flightstats.schedules.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestByAirport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestByAirport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.schedules.flightstats.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="airport" type="{http://v1.service.schedules.flightstats.com/}requestedAirportV1" minOccurs="0"/>
 *         &lt;element name="codeType" type="{http://v1.service.schedules.flightstats.com/}requestedString" minOccurs="0"/>
 *         &lt;element name="departing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="date" type="{http://v1.service.schedules.flightstats.com/}requestedDate" minOccurs="0"/>
 *         &lt;element name="hourOfDay" type="{http://v1.service.schedules.flightstats.com/}requestedInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestByAirport", propOrder = {
    "airport",
    "codeType",
    "departing",
    "date",
    "hourOfDay"
})
public class RequestByAirport
    extends RequestBase
{

    protected RequestedAirportV1 airport;
    protected RequestedString codeType;
    protected boolean departing;
    protected RequestedDate date;
    protected RequestedInteger hourOfDay;

    /**
     * Gets the value of the airport property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAirportV1 }
     *     
     */
    public RequestedAirportV1 getAirport() {
        return airport;
    }

    /**
     * Sets the value of the airport property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAirportV1 }
     *     
     */
    public void setAirport(RequestedAirportV1 value) {
        this.airport = value;
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

    /**
     * Gets the value of the hourOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedInteger }
     *     
     */
    public RequestedInteger getHourOfDay() {
        return hourOfDay;
    }

    /**
     * Sets the value of the hourOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedInteger }
     *     
     */
    public void setHourOfDay(RequestedInteger value) {
        this.hourOfDay = value;
    }

}
