
package hotel.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRoomDetailPhoto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoomDetailPhoto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomDetailPhoto" type="{WS_2013.Hotel}RoomDetailPhoto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoomDetailPhoto", propOrder = {
    "roomDetailPhoto"
})
public class ArrayOfRoomDetailPhoto {

    @XmlElement(name = "RoomDetailPhoto", nillable = true)
    protected List<RoomDetailPhoto> roomDetailPhoto;

    /**
     * Gets the value of the roomDetailPhoto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomDetailPhoto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomDetailPhoto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomDetailPhoto }
     * 
     * 
     */
    public List<RoomDetailPhoto> getRoomDetailPhoto() {
        if (roomDetailPhoto == null) {
            roomDetailPhoto = new ArrayList<RoomDetailPhoto>();
        }
        return this.roomDetailPhoto;
    }

}
