
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutesBetweenAirportsExStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutesBetweenAirportsExStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filedAltitude_min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filedAltitude_max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="last_departuretime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutesBetweenAirportsExStruct", propOrder = {
    "count",
    "route",
    "filedAltitudeMin",
    "filedAltitudeMax",
    "lastDeparturetime"
})
public class RoutesBetweenAirportsExStruct {

    protected int count;
    @XmlElement(required = true)
    protected String route;
    @XmlElement(name = "filedAltitude_min")
    protected int filedAltitudeMin;
    @XmlElement(name = "filedAltitude_max")
    protected int filedAltitudeMax;
    @XmlElement(name = "last_departuretime")
    protected int lastDeparturetime;

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the filedAltitudeMin property.
     * 
     */
    public int getFiledAltitudeMin() {
        return filedAltitudeMin;
    }

    /**
     * Sets the value of the filedAltitudeMin property.
     * 
     */
    public void setFiledAltitudeMin(int value) {
        this.filedAltitudeMin = value;
    }

    /**
     * Gets the value of the filedAltitudeMax property.
     * 
     */
    public int getFiledAltitudeMax() {
        return filedAltitudeMax;
    }

    /**
     * Sets the value of the filedAltitudeMax property.
     * 
     */
    public void setFiledAltitudeMax(int value) {
        this.filedAltitudeMax = value;
    }

    /**
     * Gets the value of the lastDeparturetime property.
     * 
     */
    public int getLastDeparturetime() {
        return lastDeparturetime;
    }

    /**
     * Sets the value of the lastDeparturetime property.
     * 
     */
    public void setLastDeparturetime(int value) {
        this.lastDeparturetime = value;
    }

}
