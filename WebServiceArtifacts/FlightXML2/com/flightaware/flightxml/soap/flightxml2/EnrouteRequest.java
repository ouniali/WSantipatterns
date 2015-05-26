
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnrouteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrouteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="howMany" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrouteRequest", propOrder = {
    "airport",
    "howMany",
    "filter",
    "offset"
})
public class EnrouteRequest {

    @XmlElement(required = true)
    protected String airport;
    protected int howMany;
    @XmlElement(required = true)
    protected String filter;
    protected int offset;

    /**
     * Gets the value of the airport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirport() {
        return airport;
    }

    /**
     * Sets the value of the airport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirport(String value) {
        this.airport = value;
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
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
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

}
