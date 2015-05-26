
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestFlightsNearRadius complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestFlightsNearRadius">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="latitude" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedDouble" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedDouble" minOccurs="0"/>
 *         &lt;element name="radiusMiles" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedInteger" minOccurs="0"/>
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
@XmlType(name = "requestFlightsNearRadius", propOrder = {
    "latitude",
    "longitude",
    "radiusMiles",
    "maxFlights",
    "extendedOptions"
})
public class RequestFlightsNearRadius
    extends RequestBase
{

    protected RequestedDouble latitude;
    protected RequestedDouble longitude;
    protected RequestedInteger radiusMiles;
    protected RequestedInteger maxFlights;
    protected RequestedString extendedOptions;

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDouble }
     *     
     */
    public RequestedDouble getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDouble }
     *     
     */
    public void setLatitude(RequestedDouble value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDouble }
     *     
     */
    public RequestedDouble getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDouble }
     *     
     */
    public void setLongitude(RequestedDouble value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the radiusMiles property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedInteger }
     *     
     */
    public RequestedInteger getRadiusMiles() {
        return radiusMiles;
    }

    /**
     * Sets the value of the radiusMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedInteger }
     *     
     */
    public void setRadiusMiles(RequestedInteger value) {
        this.radiusMiles = value;
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
