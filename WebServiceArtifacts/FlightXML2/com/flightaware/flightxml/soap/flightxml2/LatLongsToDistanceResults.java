
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LatLongsToDistanceResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LatLongsToDistanceResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatLongsToDistanceResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLongsToDistanceResults", propOrder = {
    "latLongsToDistanceResult"
})
public class LatLongsToDistanceResults {

    @XmlElement(name = "LatLongsToDistanceResult")
    protected int latLongsToDistanceResult;

    /**
     * Gets the value of the latLongsToDistanceResult property.
     * 
     */
    public int getLatLongsToDistanceResult() {
        return latLongsToDistanceResult;
    }

    /**
     * Sets the value of the latLongsToDistanceResult property.
     * 
     */
    public void setLatLongsToDistanceResult(int value) {
        this.latLongsToDistanceResult = value;
    }

}
