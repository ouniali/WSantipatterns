
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapFlightResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapFlightResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MapFlightResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapFlightResults", propOrder = {
    "mapFlightResult"
})
public class MapFlightResults {

    @XmlElement(name = "MapFlightResult", required = true)
    protected String mapFlightResult;

    /**
     * Gets the value of the mapFlightResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapFlightResult() {
        return mapFlightResult;
    }

    /**
     * Sets the value of the mapFlightResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapFlightResult(String value) {
        this.mapFlightResult = value;
    }

}
