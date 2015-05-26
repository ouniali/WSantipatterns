
package travel.whl.api.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of RoomStay objects.  Room stays associated with this reservation.
 * 
 * <p>Java class for RoomStaysType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomStaysType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomStay" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://api.whl.travel/soap}RoomStayType">
 *                 &lt;sequence>
 *                   &lt;element name="SpecialRequests" type="{http://api.whl.travel/soap}SpecialRequestType" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "RoomStaysType", propOrder = {
    "roomStay"
})
public class RoomStaysType {

    @XmlElement(name = "RoomStay", required = true)
    protected List<RoomStaysType.RoomStay> roomStay;

    /**
     * Gets the value of the roomStay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomStay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomStay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomStaysType.RoomStay }
     * 
     * 
     */
    public List<RoomStaysType.RoomStay> getRoomStay() {
        if (roomStay == null) {
            roomStay = new ArrayList<RoomStaysType.RoomStay>();
        }
        return this.roomStay;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://api.whl.travel/soap}RoomStayType">
     *       &lt;sequence>
     *         &lt;element name="SpecialRequests" type="{http://api.whl.travel/soap}SpecialRequestType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specialRequests"
    })
    public static class RoomStay
        extends RoomStayType
    {

        @XmlElement(name = "SpecialRequests")
        protected SpecialRequestType specialRequests;

        /**
         * Gets the value of the specialRequests property.
         * 
         * @return
         *     possible object is
         *     {@link SpecialRequestType }
         *     
         */
        public SpecialRequestType getSpecialRequests() {
            return specialRequests;
        }

        /**
         * Sets the value of the specialRequests property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecialRequestType }
         *     
         */
        public void setSpecialRequests(SpecialRequestType value) {
            this.specialRequests = value;
        }

    }

}
