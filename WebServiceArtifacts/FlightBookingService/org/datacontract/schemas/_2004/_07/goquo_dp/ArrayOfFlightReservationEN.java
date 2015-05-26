
package org.datacontract.schemas._2004._07.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFlightReservationEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFlightReservationEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightReservationEN" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}FlightReservationEN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFlightReservationEN", propOrder = {
    "flightReservationEN"
})
public class ArrayOfFlightReservationEN {

    @XmlElement(name = "FlightReservationEN", nillable = true)
    protected List<FlightReservationEN> flightReservationEN;

    /**
     * Gets the value of the flightReservationEN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightReservationEN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightReservationEN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightReservationEN }
     * 
     * 
     */
    public List<FlightReservationEN> getFlightReservationEN() {
        if (flightReservationEN == null) {
            flightReservationEN = new ArrayList<FlightReservationEN>();
        }
        return this.flightReservationEN;
    }

}
