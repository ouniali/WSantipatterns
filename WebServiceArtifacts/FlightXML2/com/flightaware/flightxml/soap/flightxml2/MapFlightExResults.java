
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapFlightExResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapFlightExResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MapFlightExResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapFlightExResults", propOrder = {
    "mapFlightExResult"
})
public class MapFlightExResults {

    @XmlElement(name = "MapFlightExResult", required = true)
    protected String mapFlightExResult;

    /**
     * Gets the value of the mapFlightExResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapFlightExResult() {
        return mapFlightExResult;
    }

    /**
     * Sets the value of the mapFlightExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapFlightExResult(String value) {
        this.mapFlightExResult = value;
    }

}
