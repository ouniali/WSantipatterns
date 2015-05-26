
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerTypeQuantity" type="{http://www.opentravel.org/OTA/2003/05}PassengerTypeQuantityType" maxOccurs="10"/>
 *         &lt;element name="AirTraveler" type="{http://www.opentravel.org/OTA/2003/05}AirTravelerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerInformationType", propOrder = {
    "passengerTypeQuantity",
    "airTraveler"
})
public class TravelerInformationType {

    @XmlElement(name = "PassengerTypeQuantity", required = true)
    protected List<PassengerTypeQuantityType> passengerTypeQuantity;
    @XmlElement(name = "AirTraveler")
    protected AirTravelerType airTraveler;

    /**
     * Gets the value of the passengerTypeQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTypeQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerTypeQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerTypeQuantityType }
     * 
     * 
     */
    public List<PassengerTypeQuantityType> getPassengerTypeQuantity() {
        if (passengerTypeQuantity == null) {
            passengerTypeQuantity = new ArrayList<PassengerTypeQuantityType>();
        }
        return this.passengerTypeQuantity;
    }

    /**
     * Gets the value of the airTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link AirTravelerType }
     *     
     */
    public AirTravelerType getAirTraveler() {
        return airTraveler;
    }

    /**
     * Sets the value of the airTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTravelerType }
     *     
     */
    public void setAirTraveler(AirTravelerType value) {
        this.airTraveler = value;
    }

}
