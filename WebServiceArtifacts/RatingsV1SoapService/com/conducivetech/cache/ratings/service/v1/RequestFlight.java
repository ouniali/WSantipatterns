
package com.conducivetech.cache.ratings.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestFlight">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.ratings.cache.conducivetech.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="airlineCode" type="{http://v1.service.ratings.cache.conducivetech.com/}requestedAirlineV1" minOccurs="0"/>
 *         &lt;element name="flightNumber" type="{http://v1.service.ratings.cache.conducivetech.com/}requestedFlightNumber" minOccurs="0"/>
 *         &lt;element name="departureAirport" type="{http://v1.service.ratings.cache.conducivetech.com/}requestedAirportV1" minOccurs="0"/>
 *         &lt;element name="codeType" type="{http://v1.service.ratings.cache.conducivetech.com/}requestedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestFlight", propOrder = {
    "airlineCode",
    "flightNumber",
    "departureAirport",
    "codeType"
})
public class RequestFlight
    extends RequestBase
{

    protected RequestedAirlineV1 airlineCode;
    protected RequestedFlightNumber flightNumber;
    protected RequestedAirportV1 departureAirport;
    protected RequestedString codeType;

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAirlineV1 }
     *     
     */
    public RequestedAirlineV1 getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAirlineV1 }
     *     
     */
    public void setAirlineCode(RequestedAirlineV1 value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedFlightNumber }
     *     
     */
    public RequestedFlightNumber getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedFlightNumber }
     *     
     */
    public void setFlightNumber(RequestedFlightNumber value) {
        this.flightNumber = value;
    }

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

}
