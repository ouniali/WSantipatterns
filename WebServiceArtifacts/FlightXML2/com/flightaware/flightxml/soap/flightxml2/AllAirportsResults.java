
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllAirportsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllAirportsResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllAirportsResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllAirportsResults", propOrder = {
    "allAirportsResult"
})
public class AllAirportsResults {

    @XmlElement(name = "AllAirportsResult", required = true)
    protected ArrayOfString allAirportsResult;

    /**
     * Gets the value of the allAirportsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAllAirportsResult() {
        return allAirportsResult;
    }

    /**
     * Sets the value of the allAirportsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAllAirportsResult(ArrayOfString value) {
        this.allAirportsResult = value;
    }

}
