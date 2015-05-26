
package travel.whl.api.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of AvailRequestSegment. Each segment includes a collection of criteria that requests a bookable entity, which may include designated rate plans, room types, amenities or services, and the request can be used for guest rooms or other inventory items for which availability is sought. Each segment would be presumed to have a unique date range for each request.
 * 
 * <p>Java class for AvailRequestSegmentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailRequestSegmentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailRequestSegment" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StayDateRange" type="{http://api.whl.travel/soap}DateTimeSpanType" minOccurs="0"/>
 *                   &lt;element name="RoomStayCandidates" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RoomStayCandidate" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://api.whl.travel/soap}RoomStayCandidateType">
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="HotelSearchCriteria" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://api.whl.travel/soap}HotelSearchCriteriaType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "AvailRequestSegmentsType", propOrder = {
    "availRequestSegment"
})
@XmlSeeAlso({
    travel.whl.api.soap.HotelAvailRQ.AvailRequestSegments.class
})
public class AvailRequestSegmentsType {

    @XmlElement(name = "AvailRequestSegment", required = true)
    protected List<AvailRequestSegmentsType.AvailRequestSegment> availRequestSegment;

    /**
     * Gets the value of the availRequestSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availRequestSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailRequestSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailRequestSegmentsType.AvailRequestSegment }
     * 
     * 
     */
    public List<AvailRequestSegmentsType.AvailRequestSegment> getAvailRequestSegment() {
        if (availRequestSegment == null) {
            availRequestSegment = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment>();
        }
        return this.availRequestSegment;
    }


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
     *         &lt;element name="StayDateRange" type="{http://api.whl.travel/soap}DateTimeSpanType" minOccurs="0"/>
     *         &lt;element name="RoomStayCandidates" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RoomStayCandidate" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://api.whl.travel/soap}RoomStayCandidateType">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="HotelSearchCriteria" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://api.whl.travel/soap}HotelSearchCriteriaType">
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
    @XmlType(name = "", propOrder = {
        "stayDateRange",
        "roomStayCandidates",
        "hotelSearchCriteria"
    })
    public static class AvailRequestSegment {

        @XmlElement(name = "StayDateRange")
        protected DateTimeSpanType stayDateRange;
        @XmlElement(name = "RoomStayCandidates")
        protected AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates roomStayCandidates;
        @XmlElement(name = "HotelSearchCriteria")
        protected AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria hotelSearchCriteria;

        /**
         * Gets the value of the stayDateRange property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimeSpanType }
         *     
         */
        public DateTimeSpanType getStayDateRange() {
            return stayDateRange;
        }

        /**
         * Sets the value of the stayDateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeSpanType }
         *     
         */
        public void setStayDateRange(DateTimeSpanType value) {
            this.stayDateRange = value;
        }

        /**
         * Gets the value of the roomStayCandidates property.
         * 
         * @return
         *     possible object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates }
         *     
         */
        public AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates getRoomStayCandidates() {
            return roomStayCandidates;
        }

        /**
         * Sets the value of the roomStayCandidates property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates }
         *     
         */
        public void setRoomStayCandidates(AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates value) {
            this.roomStayCandidates = value;
        }

        /**
         * Gets the value of the hotelSearchCriteria property.
         * 
         * @return
         *     possible object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
         *     
         */
        public AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria getHotelSearchCriteria() {
            return hotelSearchCriteria;
        }

        /**
         * Sets the value of the hotelSearchCriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
         *     
         */
        public void setHotelSearchCriteria(AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria value) {
            this.hotelSearchCriteria = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://api.whl.travel/soap}HotelSearchCriteriaType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HotelSearchCriteria
            extends HotelSearchCriteriaType
        {


        }


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
         *         &lt;element name="RoomStayCandidate" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://api.whl.travel/soap}RoomStayCandidateType">
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
        @XmlType(name = "", propOrder = {
            "roomStayCandidate"
        })
        public static class RoomStayCandidates {

            @XmlElement(name = "RoomStayCandidate", required = true)
            protected List<AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate> roomStayCandidate;

            /**
             * Gets the value of the roomStayCandidate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the roomStayCandidate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoomStayCandidate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate }
             * 
             * 
             */
            public List<AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate> getRoomStayCandidate() {
                if (roomStayCandidate == null) {
                    roomStayCandidate = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate>();
                }
                return this.roomStayCandidate;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://api.whl.travel/soap}RoomStayCandidateType">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RoomStayCandidate
                extends RoomStayCandidateType
            {


            }

        }

    }

}
