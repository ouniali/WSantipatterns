
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutesBetweenAirportsExRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutesBetweenAirportsExRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="howMany" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxDepartureAge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxFileAge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutesBetweenAirportsExRequest", propOrder = {
    "origin",
    "destination",
    "howMany",
    "offset",
    "maxDepartureAge",
    "maxFileAge"
})
public class RoutesBetweenAirportsExRequest {

    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    protected int howMany;
    protected int offset;
    @XmlElement(required = true)
    protected String maxDepartureAge;
    @XmlElement(required = true)
    protected String maxFileAge;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the howMany property.
     * 
     */
    public int getHowMany() {
        return howMany;
    }

    /**
     * Sets the value of the howMany property.
     * 
     */
    public void setHowMany(int value) {
        this.howMany = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Gets the value of the maxDepartureAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDepartureAge() {
        return maxDepartureAge;
    }

    /**
     * Sets the value of the maxDepartureAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDepartureAge(String value) {
        this.maxDepartureAge = value;
    }

    /**
     * Gets the value of the maxFileAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxFileAge() {
        return maxFileAge;
    }

    /**
     * Sets the value of the maxFileAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxFileAge(String value) {
        this.maxFileAge = value;
    }

}
