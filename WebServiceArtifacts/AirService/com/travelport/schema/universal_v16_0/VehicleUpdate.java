
package com.travelport.schema.universal_v16_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BookingSource;
import com.travelport.schema.common_v15_0.DriversLicense;
import com.travelport.schema.common_v15_0.Guarantee;
import com.travelport.schema.common_v15_0.LoyaltyCard;
import com.travelport.schema.common_v15_0.ThirdPartyInformation;
import com.travelport.schema.common_v15_0.TravelComplianceData;
import com.travelport.schema.vehicle_v17_0.AssociatedRemark;
import com.travelport.schema.vehicle_v17_0.CollectionAddress;
import com.travelport.schema.vehicle_v17_0.DeliveryAddress;
import com.travelport.schema.vehicle_v17_0.PaymentInformation;
import com.travelport.schema.vehicle_v17_0.VehiclePickupDateLocation;
import com.travelport.schema.vehicle_v17_0.VehicleRateInfo;
import com.travelport.schema.vehicle_v17_0.VehicleReturnDateLocation;
import com.travelport.schema.vehicle_v17_0.VehicleSpecialRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}LoyaltyCard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}DriversLicense" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Guarantee" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}BookingSource" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleRateInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}PaymentInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}AssociatedRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleSpecialRequest" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}DeliveryAddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}CollectionAddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleReturnDateLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehiclePickupDateLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ThirdPartyInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}TravelComplianceData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="ReservationLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *       &lt;attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loyaltyCard",
    "driversLicense",
    "guarantee",
    "bookingSource",
    "vehicleRateInfo",
    "paymentInformation",
    "associatedRemark",
    "vehicleSpecialRequest",
    "deliveryAddress",
    "collectionAddress",
    "vehicleReturnDateLocation",
    "vehiclePickupDateLocation",
    "thirdPartyInformation",
    "travelComplianceData"
})
@XmlRootElement(name = "VehicleUpdate")
public class VehicleUpdate {

    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "DriversLicense", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected DriversLicense driversLicense;
    @XmlElement(name = "Guarantee", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected Guarantee guarantee;
    @XmlElement(name = "BookingSource", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected BookingSource bookingSource;
    @XmlElement(name = "VehicleRateInfo", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected VehicleRateInfo vehicleRateInfo;
    @XmlElement(name = "PaymentInformation", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected PaymentInformation paymentInformation;
    @XmlElement(name = "AssociatedRemark", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "VehicleSpecialRequest", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected VehicleSpecialRequest vehicleSpecialRequest;
    @XmlElement(name = "DeliveryAddress", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected DeliveryAddress deliveryAddress;
    @XmlElement(name = "CollectionAddress", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected CollectionAddress collectionAddress;
    @XmlElement(name = "VehicleReturnDateLocation", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected VehicleReturnDateLocation vehicleReturnDateLocation;
    @XmlElement(name = "VehiclePickupDateLocation", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected VehiclePickupDateLocation vehiclePickupDateLocation;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected ThirdPartyInformation thirdPartyInformation;
    @XmlElement(name = "TravelComplianceData", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<TravelComplianceData> travelComplianceData;
    @XmlAttribute(name = "ReservationLocatorCode", required = true)
    protected String reservationLocatorCode;
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;

    /**
     * Gets the value of the loyaltyCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * 
     * 
     */
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<LoyaltyCard>();
        }
        return this.loyaltyCard;
    }

    /**
     * Gets the value of the driversLicense property.
     * 
     * @return
     *     possible object is
     *     {@link DriversLicense }
     *     
     */
    public DriversLicense getDriversLicense() {
        return driversLicense;
    }

    /**
     * Sets the value of the driversLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriversLicense }
     *     
     */
    public void setDriversLicense(DriversLicense value) {
        this.driversLicense = value;
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
     * Gets the value of the bookingSource property.
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
     * Gets the value of the vehicleRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRateInfo }
     *     
     */
    public VehicleRateInfo getVehicleRateInfo() {
        return vehicleRateInfo;
    }

    /**
     * Sets the value of the vehicleRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRateInfo }
     *     
     */
    public void setVehicleRateInfo(VehicleRateInfo value) {
        this.vehicleRateInfo = value;
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
     * Gets the value of the deliveryAddress property.
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
     * Gets the value of the collectionAddress property.
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
     * Gets the value of the vehicleReturnDateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReturnDateLocation }
     *     
     */
    public VehicleReturnDateLocation getVehicleReturnDateLocation() {
        return vehicleReturnDateLocation;
    }

    /**
     * Sets the value of the vehicleReturnDateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReturnDateLocation }
     *     
     */
    public void setVehicleReturnDateLocation(VehicleReturnDateLocation value) {
        this.vehicleReturnDateLocation = value;
    }

    /**
     * Gets the value of the vehiclePickupDateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePickupDateLocation }
     *     
     */
    public VehiclePickupDateLocation getVehiclePickupDateLocation() {
        return vehiclePickupDateLocation;
    }

    /**
     * Sets the value of the vehiclePickupDateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePickupDateLocation }
     *     
     */
    public void setVehiclePickupDateLocation(VehiclePickupDateLocation value) {
        this.vehiclePickupDateLocation = value;
    }

    /**
     * Third party supplier locator information. Specifically applicable for SDK booking. Previously saved values can be updated for SupplierCode, SupplierName and SupplierLocatorCode. If an attribute is not passed here, then previously saved value for that attribute will be deleted.
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
     * Gets the value of the travelComplianceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelComplianceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelComplianceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelComplianceData }
     * 
     * 
     */
    public List<TravelComplianceData> getTravelComplianceData() {
        if (travelComplianceData == null) {
            travelComplianceData = new ArrayList<TravelComplianceData>();
        }
        return this.travelComplianceData;
    }

    /**
     * Gets the value of the reservationLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationLocatorCode() {
        return reservationLocatorCode;
    }

    /**
     * Sets the value of the reservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationLocatorCode(String value) {
        this.reservationLocatorCode = value;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

}
