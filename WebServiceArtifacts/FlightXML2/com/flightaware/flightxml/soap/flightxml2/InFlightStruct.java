
package com.flightaware.flightxml.soap.flightxml2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InFlightStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InFlightStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="next_offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aircraft" type="{http://flightxml.flightaware.com/soap/FlightXML2}InFlightAircraftStruct" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InFlightStruct", propOrder = {
    "nextOffset",
    "aircraft"
})
public class InFlightStruct {

    @XmlElement(name = "next_offset")
    protected int nextOffset;
    @XmlElement(required = true)
    protected List<InFlightAircraftStruct> aircraft;

    /**
     * Gets the value of the nextOffset property.
     * 
     */
    public int getNextOffset() {
        return nextOffset;
    }

    /**
     * Sets the value of the nextOffset property.
     * 
     */
    public void setNextOffset(int value) {
        this.nextOffset = value;
    }

    /**
     * Gets the value of the aircraft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InFlightAircraftStruct }
     * 
     * 
     */
    public List<InFlightAircraftStruct> getAircraft() {
        if (aircraft == null) {
            aircraft = new ArrayList<InFlightAircraftStruct>();
        }
        return this.aircraft;
    }

}
