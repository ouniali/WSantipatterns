
package com.travelport.schema.vehicle_v17_0;

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
import com.travelport.schema.common_v15_0.SpecialEquipment;
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
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleDateLocation"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}Vehicle"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}SpecialEquipment" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleSpecialRequest" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}PaymentInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}DeliveryAddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}CollectionAddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}FlightArrivalInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Guarantee" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}AssociatedRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}BookingSource" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ThirdPartyInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}SellMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SupplierCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookingConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="PassiveProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="TravelOrder" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    "vehicleDateLocation",
    "vehicle",
    "specialEquipment",
    "vehicleSpecialRequest",
    "paymentInformation",
    "deliveryAddress",
    "collectionAddress",
    "flightArrivalInformation",
    "guarantee",
    "associatedRemark",
    "bookingSource",
    "thirdPartyInformation",
    "sellMessage"
})
@XmlRootElement(name = "VehicleReservation")
public class VehicleReservation
    extends BaseReservation
{

    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
    protected List<BookingTravelerRef> bookingTravelerRef;
    @XmlElement(name = "ReservationName", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected ReservationName reservationName;
    @XmlElement(name = "VehicleDateLocation", required = true)
    protected VehicleDateLocation vehicleDateLocation;
    @XmlElement(name = "Vehicle", required = true)
    protected Vehicle vehicle;
    @XmlElement(name = "SpecialEquipment", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<SpecialEquipment> specialEquipment;
    @XmlElement(name = "VehicleSpecialRequest")
    protected VehicleSpecialRequest vehicleSpecialRequest;
    @XmlElement(name = "PaymentInformation")
    protected PaymentInformation paymentInformation;
    @XmlElement(name = "DeliveryAddress")
    protected DeliveryAddress deliveryAddress;
    @XmlElement(name = "CollectionAddress")
    protected CollectionAddress collectionAddress;
    @XmlElement(name = "FlightArrivalInformation")
    protected FlightArrivalInformation flightArrivalInformation;
    @XmlElement(name = "Guarantee", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected Guarantee guarantee;
    @XmlElement(name = "AssociatedRemark")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "BookingSource", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected BookingSource bookingSource;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected ThirdPartyInformation thirdPartyInformation;
    @XmlElement(name = "SellMessage", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<String> sellMessage;
    @XmlAttribute(name = "SupplierCode", required = true)
    protected String supplierCode;
    @XmlAttribute(name = "BookingConfirmation")
    protected String bookingConfirmation;
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    @XmlAttribute(name = "PassiveProviderReservationInfoRef")
    protected String passiveProviderReservationInfoRef;
    @XmlAttribute(name = "TravelOrder")
    protected BigInteger travelOrder;

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
     * Gets the value of the vehicleDateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDateLocation }
     *     
     */
    public VehicleDateLocation getVehicleDateLocation() {
        return vehicleDateLocation;
    }

    /**
     * Sets the value of the vehicleDateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDateLocation }
     *     
     */
    public void setVehicleDateLocation(VehicleDateLocation value) {
        this.vehicleDateLocation = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the specialEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialEquipment }
     * 
     * 
     */
    public List<SpecialEquipment> getSpecialEquipment() {
        if (specialEquipment == null) {
            specialEquipment = new ArrayList<SpecialEquipment>();
        }
        return this.specialEquipment;
    }

    /**
     * Gets the value of the vehicleSpecialRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSpecialRequest }
     *     
     */
    public VehicleSpecialRequest getVehicleSpecialRequest() {
        return vehicleSpecialRequest;
    }

    /**
     * Sets the value of the vehicleSpecialRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSpecialRequest }
     *     
     */
    public void setVehicleSpecialRequest(VehicleSpecialRequest value) {
        this.vehicleSpecialRequest = value;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInformation }
     *     
     */
    public PaymentInformation getPaymentInformation() {
        return paymentInformation;
    }

    /**
     * Sets the value of the paymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInformation }
     *     
     */
    public void setPaymentInformation(PaymentInformation value) {
        this.paymentInformation = value;
    }

    /**
     * An address to which a rental car should be delivered and a phone number associated with the address.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryAddress }
     *     
     */
    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryAddress }
     *     
     */
    public void setDeliveryAddress(DeliveryAddress value) {
        this.deliveryAddress = value;
    }

    /**
     * An address from which a rental car should be picked up at the end of a rental period and a phone number associated with the address.
     * 
     * @return
     *     possible object is
     *     {@link CollectionAddress }
     *     
     */
    public CollectionAddress getCollectionAddress() {
        return collectionAddress;
    }

    /**
     * Sets the value of the collectionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionAddress }
     *     
     */
    public void setCollectionAddress(CollectionAddress value) {
        this.collectionAddress = value;
    }

    /**
     * 
     *                     				The flight arrival information 
     *                     				(airline code and flight number) for the 
     *                     				airport/city at which the rental car will
     *                     				be picked up
     *                     			
     * 
     * @return
     *     possible object is
     *     {@link FlightArrivalInformation }
     *     
     */
    public FlightArrivalInformation getFlightArrivalInformation() {
        return flightArrivalInformation;
    }

    /**
     * Sets the value of the flightArrivalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightArrivalInformation }
     *     
     */
    public void setFlightArrivalInformation(FlightArrivalInformation value) {
        this.flightArrivalInformation = value;
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
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
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

}
