
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestedAirportV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestedAirportV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airport" type="{http://v1.api.alerts.flightstats.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestedAirportV1", propOrder = {
    "requestedCode",
    "fsCode",
    "airport",
    "error"
})
public class RequestedAirportV1 {

    protected String requestedCode;
    protected String fsCode;
    protected AirportV1 airport;
    protected String error;

    /**
     * Gets the value of the requestedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedCode() {
        return requestedCode;
    }

    /**
     * Sets the value of the requestedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedCode(String value) {
        this.requestedCode = value;
    }

    /**
     * Gets the value of the fsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsCode() {
        return fsCode;
    }

    /**
     * Sets the value of the fsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsCode(String value) {
        this.fsCode = value;
    }

    /**
     * Gets the value of the airport property.
     * 
     * @return
     *     possible object is
     *     {@link AirportV1 }
     *     
     */
    public AirportV1 getAirport() {
        return airport;
    }

    /**
     * Sets the value of the airport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportV1 }
     *     
     */
    public void setAirport(AirportV1 value) {
        this.airport = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

}
