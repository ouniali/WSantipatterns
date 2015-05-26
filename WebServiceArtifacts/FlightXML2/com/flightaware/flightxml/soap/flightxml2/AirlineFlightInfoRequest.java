
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineFlightInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineFlightInfoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faFlightID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineFlightInfoRequest", propOrder = {
    "faFlightID"
})
public class AirlineFlightInfoRequest {

    @XmlElement(required = true)
    protected String faFlightID;

    /**
     * Gets the value of the faFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaFlightID() {
        return faFlightID;
    }

    /**
     * Sets the value of the faFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaFlightID(String value) {
        this.faFlightID = value;
    }

}
