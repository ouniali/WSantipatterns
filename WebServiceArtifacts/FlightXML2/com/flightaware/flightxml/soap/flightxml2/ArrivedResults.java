
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrivedResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrivedResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrivedResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrivalStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivedResults", propOrder = {
    "arrivedResult"
})
public class ArrivedResults {

    @XmlElement(name = "ArrivedResult", required = true)
    protected ArrivalStruct arrivedResult;

    /**
     * Gets the value of the arrivedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalStruct }
     *     
     */
    public ArrivalStruct getArrivedResult() {
        return arrivedResult;
    }

    /**
     * Sets the value of the arrivedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalStruct }
     *     
     */
    public void setArrivedResult(ArrivalStruct value) {
        this.arrivedResult = value;
    }

}
