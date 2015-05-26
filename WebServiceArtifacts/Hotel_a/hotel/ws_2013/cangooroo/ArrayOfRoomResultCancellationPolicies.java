
package hotel.ws_2013.cangooroo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import hotel.v2.webservice.cangooroo.RoomResultCancellationPolicies;


/**
 * <p>Java class for ArrayOfRoomResultCancellationPolicies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoomResultCancellationPolicies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomResultCancellationPolicies" type="{Cangooroo.Webservice.V2.Hotel}RoomResultCancellationPolicies" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoomResultCancellationPolicies", propOrder = {
    "roomResultCancellationPolicies"
})
public class ArrayOfRoomResultCancellationPolicies {

    @XmlElement(name = "RoomResultCancellationPolicies", nillable = true)
    protected List<RoomResultCancellationPolicies> roomResultCancellationPolicies;

    /**
     * Gets the value of the roomResultCancellationPolicies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomResultCancellationPolicies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomResultCancellationPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomResultCancellationPolicies }
     * 
     * 
     */
    public List<RoomResultCancellationPolicies> getRoomResultCancellationPolicies() {
        if (roomResultCancellationPolicies == null) {
            roomResultCancellationPolicies = new ArrayList<RoomResultCancellationPolicies>();
        }
        return this.roomResultCancellationPolicies;
    }

}
