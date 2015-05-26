
package com.flightaware.flightxml.soap.flightxml2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduledStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduledStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="next_offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scheduled" type="{http://flightxml.flightaware.com/soap/FlightXML2}ScheduledFlightStruct" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledStruct", propOrder = {
    "nextOffset",
    "scheduled"
})
public class ScheduledStruct {

    @XmlElement(name = "next_offset")
    protected int nextOffset;
    @XmlElement(required = true)
    protected List<ScheduledFlightStruct> scheduled;

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
     * Gets the value of the scheduled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduledFlightStruct }
     * 
     * 
     */
    public List<ScheduledFlightStruct> getScheduled() {
        if (scheduled == null) {
            scheduled = new ArrayList<ScheduledFlightStruct>();
        }
        return this.scheduled;
    }

}
