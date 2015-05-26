
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepartedResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartedResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartedResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}DepartureStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartedResults", propOrder = {
    "departedResult"
})
public class DepartedResults {

    @XmlElement(name = "DepartedResult", required = true)
    protected DepartureStruct departedResult;

    /**
     * Gets the value of the departedResult property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureStruct }
     *     
     */
    public DepartureStruct getDepartedResult() {
        return departedResult;
    }

    /**
     * Sets the value of the departedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureStruct }
     *     
     */
    public void setDepartedResult(DepartureStruct value) {
        this.departedResult = value;
    }

}
