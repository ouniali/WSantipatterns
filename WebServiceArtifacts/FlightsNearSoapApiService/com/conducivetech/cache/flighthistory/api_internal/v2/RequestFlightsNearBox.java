
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestFlightsNearBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestFlightsNearBox">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="topLatitude" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedDouble" minOccurs="0"/>
 *         &lt;element name="leftLongitude" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedDouble" minOccurs="0"/>
 *         &lt;element name="bottomLatitude" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedDouble" minOccurs="0"/>
 *         &lt;element name="rightLongitude" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedDouble" minOccurs="0"/>
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
@XmlType(name = "requestFlightsNearBox", propOrder = {
    "topLatitude",
    "leftLongitude",
    "bottomLatitude",
    "rightLongitude",
    "maxFlights",
    "extendedOptions"
})
public class RequestFlightsNearBox
    extends RequestBase
{

    protected RequestedDouble topLatitude;
    protected RequestedDouble leftLongitude;
    protected RequestedDouble bottomLatitude;
    protected RequestedDouble rightLongitude;
    protected RequestedInteger maxFlights;
    protected RequestedString extendedOptions;

    /**
     * Gets the value of the topLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDouble }
     *     
     */
    public RequestedDouble getTopLatitude() {
        return topLatitude;
    }

    /**
     * Sets the value of the topLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDouble }
     *     
     */
    public void setTopLatitude(RequestedDouble value) {
        this.topLatitude = value;
    }

    /**
     * Gets the value of the leftLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDouble }
     *     
     */
    public RequestedDouble getLeftLongitude() {
        return leftLongitude;
    }

    /**
     * Sets the value of the leftLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDouble }
     *     
     */
    public void setLeftLongitude(RequestedDouble value) {
        this.leftLongitude = value;
    }

    /**
     * Gets the value of the bottomLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDouble }
     *     
     */
    public RequestedDouble getBottomLatitude() {
        return bottomLatitude;
    }

    /**
     * Sets the value of the bottomLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDouble }
     *     
     */
    public void setBottomLatitude(RequestedDouble value) {
        this.bottomLatitude = value;
    }

    /**
     * Gets the value of the rightLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDouble }
     *     
     */
    public RequestedDouble getRightLongitude() {
        return rightLongitude;
    }

    /**
     * Sets the value of the rightLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDouble }
     *     
     */
    public void setRightLongitude(RequestedDouble value) {
        this.rightLongitude = value;
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
