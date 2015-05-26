
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_HotelRatePlanRQRoomTypeCandidatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_HotelRatePlanRQRoomTypeCandidatesType">
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
@XmlType(name = "OTA_HotelRatePlanRQRoomTypeCandidatesType", propOrder = {
    "roomTypeCandidate"
})
public class OTAHotelRatePlanRQRoomTypeCandidatesType {

    @XmlElement(name = "RoomTypeCandidate")
    protected List<OTAHotelRatePlanRQRoomTypeCandidatesType.RoomTypeCandidate> roomTypeCandidate;

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
     * {@link OTAHotelRatePlanRQRoomTypeCandidatesType.RoomTypeCandidate }
     * 
     * 
     */
    public List<OTAHotelRatePlanRQRoomTypeCandidatesType.RoomTypeCandidate> getRoomTypeCandidate() {
        if (roomTypeCandidate == null) {
            roomTypeCandidate = new ArrayList<OTAHotelRatePlanRQRoomTypeCandidatesType.RoomTypeCandidate>();
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
