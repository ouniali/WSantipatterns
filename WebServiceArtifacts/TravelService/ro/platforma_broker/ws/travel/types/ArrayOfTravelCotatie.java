
package ro.platforma_broker.ws.travel.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTravelCotatie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTravelCotatie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelCotatie" type="{http://www.platforma-broker.ro/ws/travel/types/}TravelCotatie" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTravelCotatie", propOrder = {
    "travelCotatie"
})
public class ArrayOfTravelCotatie {

    @XmlElement(name = "TravelCotatie", nillable = true)
    protected List<TravelCotatie> travelCotatie;

    /**
     * Gets the value of the travelCotatie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelCotatie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelCotatie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelCotatie }
     * 
     * 
     */
    public List<TravelCotatie> getTravelCotatie() {
        if (travelCotatie == null) {
            travelCotatie = new ArrayList<TravelCotatie>();
        }
        return this.travelCotatie;
    }

}
