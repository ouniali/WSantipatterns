
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FleetScheduledRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FleetScheduledRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fleet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="howMany" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "FleetScheduledRequest", propOrder = {
    "fleet",
    "howMany",
    "offset"
})
public class FleetScheduledRequest {

    @XmlElement(required = true)
    protected String fleet;
    protected int howMany;
    protected int offset;

    /**
     * Gets the value of the fleet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleet() {
        return fleet;
    }

    /**
     * Sets the value of the fleet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleet(String value) {
        this.fleet = value;
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

}
