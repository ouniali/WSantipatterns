
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssignReservationRoomResult" type="{https://NewHotel/Web/Services/}KioskReservationDetailResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "assignReservationRoomResult"
})
@XmlRootElement(name = "AssignReservationRoomResponse")
public class AssignReservationRoomResponse {

    @XmlElement(name = "AssignReservationRoomResult")
    protected KioskReservationDetailResponse assignReservationRoomResult;

    /**
     * Gets the value of the assignReservationRoomResult property.
     * 
     * @return
     *     possible object is
     *     {@link KioskReservationDetailResponse }
     *     
     */
    public KioskReservationDetailResponse getAssignReservationRoomResult() {
        return assignReservationRoomResult;
    }

    /**
     * Sets the value of the assignReservationRoomResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskReservationDetailResponse }
     *     
     */
    public void setAssignReservationRoomResult(KioskReservationDetailResponse value) {
        this.assignReservationRoomResult = value;
    }

}
