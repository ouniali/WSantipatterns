
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOTA_HotelAvailGetRQHotelAvailRequestRoomTypeCandidate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOTA_HotelAvailGetRQHotelAvailRequestRoomTypeCandidate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomTypeCandidate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOTA_HotelAvailGetRQHotelAvailRequestRoomTypeCandidate", propOrder = {
    "roomTypeCandidate"
})
public class ArrayOfOTAHotelAvailGetRQHotelAvailRequestRoomTypeCandidate {

    @XmlElement(name = "RoomTypeCandidate")
    protected List<ArrayOfOTAHotelAvailGetRQHotelAvailRequestRoomTypeCandidate.RoomTypeCandidate> roomTypeCandidate;

    /**
     * Gets the value of the roomTypeCandidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomTypeCandidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomTypeCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequestRoomTypeCandidate.RoomTypeCandidate }
     * 
     * 
     */
    public List<ArrayOfOTAHotelAvailGetRQHotelAvailRequestRoomTypeCandidate.RoomTypeCandidate> getRoomTypeCandidate() {
        if (roomTypeCandidate == null) {
            roomTypeCandidate = new ArrayList<ArrayOfOTAHotelAvailGetRQHotelAvailRequestRoomTypeCandidate.RoomTypeCandidate>();
        }
        return this.roomTypeCandidate;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoomTypeCandidate
        extends RoomStayCandidateType
    {


    }

}
