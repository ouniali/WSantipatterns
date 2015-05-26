
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountAirportOperationsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountAirportOperationsResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountAirportOperationsResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}CountAirportOperationsStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountAirportOperationsResults", propOrder = {
    "countAirportOperationsResult"
})
public class CountAirportOperationsResults {

    @XmlElement(name = "CountAirportOperationsResult", required = true)
    protected CountAirportOperationsStruct countAirportOperationsResult;

    /**
     * Gets the value of the countAirportOperationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CountAirportOperationsStruct }
     *     
     */
    public CountAirportOperationsStruct getCountAirportOperationsResult() {
        return countAirportOperationsResult;
    }

    /**
     * Sets the value of the countAirportOperationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountAirportOperationsStruct }
     *     
     */
    public void setCountAirportOperationsResult(CountAirportOperationsStruct value) {
        this.countAirportOperationsResult = value;
    }

}
