
package _170._0._168._192.tt.bookingapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSFlightItinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSFlightItinerary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSFlightItinerary" type="{http://192.168.0.170/TT/BookingAPI}WSFlightItinerary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSFlightItinerary", propOrder = {
    "wsFlightItinerary"
})
public class ArrayOfWSFlightItinerary {

    @XmlElement(name = "WSFlightItinerary", nillable = true)
    protected List<WSFlightItinerary> wsFlightItinerary;

    /**
     * Gets the value of the wsFlightItinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsFlightItinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSFlightItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSFlightItinerary }
     * 
     * 
     */
    public List<WSFlightItinerary> getWSFlightItinerary() {
        if (wsFlightItinerary == null) {
            wsFlightItinerary = new ArrayList<WSFlightItinerary>();
        }
        return this.wsFlightItinerary;
    }

}
