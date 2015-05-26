
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LatLongsToDistanceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LatLongsToDistanceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lat1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="lon1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="lat2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="lon2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLongsToDistanceRequest", propOrder = {
    "lat1",
    "lon1",
    "lat2",
    "lon2"
})
public class LatLongsToDistanceRequest {

    protected float lat1;
    protected float lon1;
    protected float lat2;
    protected float lon2;

    /**
     * Gets the value of the lat1 property.
     * 
     */
    public float getLat1() {
        return lat1;
    }

    /**
     * Sets the value of the lat1 property.
     * 
     */
    public void setLat1(float value) {
        this.lat1 = value;
    }

    /**
     * Gets the value of the lon1 property.
     * 
     */
    public float getLon1() {
        return lon1;
    }

    /**
     * Sets the value of the lon1 property.
     * 
     */
    public void setLon1(float value) {
        this.lon1 = value;
    }

    /**
     * Gets the value of the lat2 property.
     * 
     */
    public float getLat2() {
        return lat2;
    }

    /**
     * Sets the value of the lat2 property.
     * 
     */
    public void setLat2(float value) {
        this.lat2 = value;
    }

    /**
     * Gets the value of the lon2 property.
     * 
     */
    public float getLon2() {
        return lon2;
    }

    /**
     * Sets the value of the lon2 property.
     * 
     */
    public void setLon2(float value) {
        this.lon2 = value;
    }

}
