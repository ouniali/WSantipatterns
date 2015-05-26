
package com.flightaware.flightxml.soap.flightxml2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightAlertListing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightAlertListing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num_alerts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alerts" type="{http://flightxml.flightaware.com/soap/FlightXML2}FlightAlertEntry" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightAlertListing", propOrder = {
    "numAlerts",
    "alerts"
})
public class FlightAlertListing {

    @XmlElement(name = "num_alerts")
    protected int numAlerts;
    @XmlElement(required = true)
    protected List<FlightAlertEntry> alerts;

    /**
     * Gets the value of the numAlerts property.
     * 
     */
    public int getNumAlerts() {
        return numAlerts;
    }

    /**
     * Sets the value of the numAlerts property.
     * 
     */
    public void setNumAlerts(int value) {
        this.numAlerts = value;
    }

    /**
     * Gets the value of the alerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightAlertEntry }
     * 
     * 
     */
    public List<FlightAlertEntry> getAlerts() {
        if (alerts == null) {
            alerts = new ArrayList<FlightAlertEntry>();
        }
        return this.alerts;
    }

}
