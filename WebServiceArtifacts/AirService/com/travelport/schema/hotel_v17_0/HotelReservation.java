
package com.travelport.schema.hotel_v17_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseReservation;
import com.travelport.schema.common_v15_0.BookingSource;
import com.travelport.schema.common_v15_0.BookingTravelerRef;
import com.travelport.schema.common_v15_0.Guarantee;
import com.travelport.schema.common_v15_0.ReservationName;
import com.travelport.schema.common_v15_0.ThirdPartyInformation;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseReservation">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}BookingTravelerRef" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ReservationName" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ThirdPartyInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelProperty"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelRateDetail"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelStay"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelSpecialRequest" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Guarantee" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}PromotionCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}BookingSource" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelBedding" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}GuestInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}AssociatedRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}SellMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookingConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CancelConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="TravelOrder" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PassiveProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerRef",
    "reservationName",
    "thirdPartyInformation",
    "hotelProperty",
    "hotelRateDetail",
    "hotelStay",
    "hotelSpecialRequest",
    "guarantee",
    "promotionCode",
    "bookingSource",
    "hotelBedding",
    "guestInformation",
    "associatedRemark",
    "sellMessage"
})
@XmlRootElement(name = "HotelReservation")
public class HotelReservation
    extends BaseReservation
{

    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
    protected List<BookingTravelerRef> bookingTravelerRef;
    @XmlElement(name = "ReservationName", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected ReservationName reservationName;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected ThirdPartyInformation thirdPartyInformation;
    @XmlElement(name = "HotelProperty", required = true)
    protected HotelProperty hotelProperty;
    @XmlElement(name = "HotelRateDetail", required = true)
    protected HotelRateDetail hotelRateDetail;
    @XmlElement(name = "HotelStay", required = true)
    protected HotelStay hotelStay;
    @XmlElement(name = "HotelSpecialRequest")
    protected String hotelSpecialRequest;
    @XmlElement(name = "Guarantee", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected Guarantee guarantee;
    @XmlElement(name = "PromotionCode")
    protected PromotionCode promotionCode;
    @XmlElement(name = "BookingSource", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected BookingSource bookingSource;
    @XmlElement(name = "HotelBedding")
    protected List<HotelBedding> hotelBedding;
    @XmlElement(name = "GuestInformation")
    protected GuestInformation guestInformation;
    @XmlElement(name = "AssociatedRemark")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "SellMessage", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<String> sellMessage;
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    @XmlAttribute(name = "BookingConfirmation")
    protected String bookingConfirmation;
    @XmlAttribute(name = "CancelConfirmation")
    protected String cancelConfirmation;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    @XmlAttribute(name = "TravelOrder")
    protected BigInteger travelOrder;
    @XmlAttribute(name = "PassiveProviderReservationInfoRef")
    protected String passiveProviderReservationInfoRef;

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTravelerRef }
     * 
     * 
     */
    public List<BookingTravelerRef> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<BookingTravelerRef>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Gets the value of the reservationName property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationName }
     *     
     */
    public ReservationName getReservationName() {
        return reservationName;
    }

    /**
     * Sets the value of the reservationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationName }
     *     
     */
    public void setReservationName(ReservationName value) {
        this.reservationName = value;
    }

    /**
     * Gets the value of the thirdPartyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyInformation }
     *     
     */
    public ThirdPartyInformation getThirdPartyInformation() {
        return thirdPartyInformation;
    }

    /**
     * Sets the value of the thirdPartyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyInformation }
     *     
     */
    public void setThirdPartyInformation(ThirdPartyInformation value) {
        this.thirdPartyInformation = value;
    }

    /**
     * Gets the value of the hotelProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProperty }
     *     
     */
    public HotelProperty getHotelProperty() {
        return hotelProperty;
    }

    /**
     * Sets the value of the hotelProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProperty }
     *     
     */
    public void setHotelProperty(HotelProperty value) {
        this.hotelProperty = value;
    }

    /**
     * Gets the value of the hotelRateDetail property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRateDetail }
     *     
     */
    public HotelRateDetail getHotelRateDetail() {
        return hotelRateDetail;
    }

    /**
     * Sets the value of the hotelRateDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateDetail }
     *     
     */
    public void setHotelRateDetail(HotelRateDetail value) {
        this.hotelRateDetail = value;
    }

    /**
     * Gets the value of the hotelStay property.
     * 
     * @return
     *     possible object is
     *     {@link HotelStay }
     *     
     */
    public HotelStay getHotelStay() {
        return hotelStay;
    }

    /**
     * Sets the value of the hotelStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelStay }
     *     
     */
    public void setHotelStay(HotelStay value) {
        this.hotelStay = value;
    }

    /**
     * Gets the value of the hotelSpecialRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelSpecialRequest() {
        return hotelSpecialRequest;
    }

    /**
     * Sets the value of the hotelSpecialRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelSpecialRequest(String value) {
        this.hotelSpecialRequest = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link Guarantee }
     *     
     */
    public Guarantee getGuarantee() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guarantee }
     *     
     */
    public void setGuarantee(Guarantee value) {
        this.guarantee = value;
    }

    /**
     * Specifies promotional code used in hotel booking
     * 
     * @return
     *     possible object is
     *     {@link PromotionCode }
     *     
     */
    public PromotionCode getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCode }
     *     
     */
    public void setPromotionCode(PromotionCode value) {
        this.promotionCode = value;
    }

    /**
     * Specify alternate booking source
     * 
     * @return
     *     possible object is
     *     {@link BookingSource }
     *     
     */
    public BookingSource getBookingSource() {
        return bookingSource;
    }

    /**
     * Sets the value of the bookingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingSource }
     *     
     */
    public void setBookingSource(BookingSource value) {
        this.bookingSource = value;
    }

    /**
     * Gets the value of the hotelBedding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelBedding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelBedding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelBedding }
     * 
     * 
     */
    public List<HotelBedding> getHotelBedding() {
        if (hotelBedding == null) {
            hotelBedding = new ArrayList<HotelBedding>();
        }
        return this.hotelBedding;
    }

    /**
     * Gets the value of the guestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GuestInformation }
     *     
     */
    public GuestInformation getGuestInformation() {
        return guestInformation;
    }

    /**
     * Sets the value of the guestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestInformation }
     *     
     */
    public void setGuestInformation(GuestInformation value) {
        this.guestInformation = value;
    }

    /**
     * Gets the value of the associatedRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedRemark }
     * 
     * 
     */
    public List<AssociatedRemark> getAssociatedRemark() {
        if (associatedRemark == null) {
            associatedRemark = new ArrayList<AssociatedRemark>();
        }
        return this.associatedRemark;
    }

    /**
     * Gets the value of the sellMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSellMessage() {
        if (sellMessage == null) {
            sellMessage = new ArrayList<String>();
        }
        return this.sellMessage;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the bookingConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingConfirmation() {
        return bookingConfirmation;
    }

    /**
     * Sets the value of the bookingConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingConfirmation(String value) {
        this.bookingConfirmation = value;
    }

    /**
     * Gets the value of the cancelConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelConfirmation() {
        return cancelConfirmation;
    }

    /**
     * Sets the value of the cancelConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelConfirmation(String value) {
        this.cancelConfirmation = value;
    }

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Gets the value of the travelOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelOrder() {
        return travelOrder;
    }

    /**
     * Sets the value of the travelOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravelOrder(BigInteger value) {
        this.travelOrder = value;
    }

    /**
     * Gets the value of the passiveProviderReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassiveProviderReservationInfoRef() {
        return passiveProviderReservationInfoRef;
    }

    /**
     * Sets the value of the passiveProviderReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassiveProviderReservationInfoRef(String value) {
        this.passiveProviderReservationInfoRef = value;
    }

}
