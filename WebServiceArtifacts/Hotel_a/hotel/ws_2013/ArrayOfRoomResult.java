
package hotel.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRoomResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoomResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomResult" type="{WS_2013.Hotel}RoomResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoomResult", propOrder = {
    "roomResult"
})
public class ArrayOfRoomResult {

    @XmlElement(name = "RoomResult", nillable = true)
    protected List<RoomResult> roomResult;

    /**
     * Gets the value of the roomResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomResult }
     * 
     * 
     */
    public List<RoomResult> getRoomResult() {
        if (roomResult == null) {
            roomResult = new ArrayList<RoomResult>();
        }
        return this.roomResult;
    }

}
