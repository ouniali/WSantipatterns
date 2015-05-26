
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestRouteStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestRouteStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="departureAirport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedAirportV1" minOccurs="0"/>
 *         &lt;element name="arrivalAirport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedAirportV1" minOccurs="0"/>
 *         &lt;element name="date" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedDate" minOccurs="0"/>
 *         &lt;element name="utc" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedBoolean" minOccurs="0"/>
 *         &lt;element name="codeType" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedString" minOccurs="0"/>
 *         &lt;element name="maxFlights" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedInteger" minOccurs="0"/>
 *         &lt;element name="extendedOptions" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestRouteStatus", propOrder = {
    "departureAirport",
    "arrivalAirport",
    "date",
    "utc",
    "codeType",
    "maxFlights",
    "extendedOptions"
})
public class RequestRouteStatus
    extends RequestBase
{

    protected RequestedAirportV1 departureAirport;
    protected RequestedAirportV1 arrivalAirport;
    protected RequestedDate date;
    protected RequestedBoolean utc;
    protected RequestedString codeType;
    protected RequestedInteger maxFlights;
    protected RequestedString extendedOptions;

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
     * Gets the value of the utc property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedBoolean }
     *     
     */
    public RequestedBoolean getUtc() {
        return utc;
    }

    /**
     * Sets the value of the utc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedBoolean }
     *     
     */
    public void setUtc(RequestedBoolean value) {
        this.utc = value;
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
     * Gets the value of the maxFlights property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedInteger }
     *     
     */
    public RequestedInteger getMaxFlights() {
        return maxFlights;
    }

    /**
     * Sets the value of the maxFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedInteger }
     *     
     */
    public void setMaxFlights(RequestedInteger value) {
        this.maxFlights = value;
    }

    /**
     * Gets the value of the extendedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedString }
     *     
     */
    public RequestedString getExtendedOptions() {
        return extendedOptions;
    }

    /**
     * Sets the value of the extendedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedString }
     *     
     */
    public void setExtendedOptions(RequestedString value) {
        this.extendedOptions = value;
    }

}
