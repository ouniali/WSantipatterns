
package com.travelport.schema.universal_v16_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.air_v18_0.AirPricingModifiers;
import com.travelport.schema.air_v18_0.AirPricingSolution;
import com.travelport.schema.common_v15_0.AccountingRemark;
import com.travelport.schema.common_v15_0.AgencyContactInfo;
import com.travelport.schema.common_v15_0.AgencyInfo;
import com.travelport.schema.common_v15_0.BookingTraveler;
import com.travelport.schema.common_v15_0.GeneralRemark;
import com.travelport.schema.common_v15_0.PointOfSale;
import com.travelport.schema.common_v15_0.ReservationName;
import com.travelport.schema.common_v15_0.SearchPassenger;
import com.travelport.schema.common_v15_0.SpecialEquipment;
import com.travelport.schema.common_v15_0.VendorLocation;
import com.travelport.schema.hotel_v17_0.HotelDetailsModifiers;
import com.travelport.schema.hotel_v17_0.HotelProperty;
import com.travelport.schema.hotel_v17_0.HotelRateDetail;
import com.travelport.schema.hotel_v17_0.HotelRulesModifiers;
import com.travelport.schema.hotel_v17_0.HotelStay;
import com.travelport.schema.hotel_v17_0.PromotionCode;
import com.travelport.schema.rail_v12_0.RailFareNoteList;
import com.travelport.schema.rail_v12_0.RailPricingSolution;
import com.travelport.schema.vehicle_v17_0.CollectionAddress;
import com.travelport.schema.vehicle_v17_0.DeliveryAddress;
import com.travelport.schema.vehicle_v17_0.FlightArrivalInformation;
import com.travelport.schema.vehicle_v17_0.PaymentInformation;
import com.travelport.schema.vehicle_v17_0.Vehicle;
import com.travelport.schema.vehicle_v17_0.VehicleDateLocation;
import com.travelport.schema.vehicle_v17_0.VehicleSearchModifiers;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}BookingTraveler" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AgencyContactInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}SearchPassenger" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}PointOfSale" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AccountingRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}GeneralRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AgencyInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ReservationName" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirPricingModifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirPricingSolution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleSearchModifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleDateLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}SpecialEquipment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleSpecialRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}PaymentInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}DeliveryAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}CollectionAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}FlightArrivalInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}Vehicle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}VendorLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelStay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelRulesModifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelDetailsModifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelRateDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}PromotionCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/rail_v12_0}RailPricingSolution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/rail_v12_0}RailFareNoteList" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}SavedTripNote" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}SavedTripActivity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}ProfileAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}PolicyInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LocatorCode" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *       &lt;attribute name="UniversalRecordLocatorCode" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *       &lt;attribute name="Name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Version" type="{http://www.travelport.com/schema/common_v15_0}typeURVersion" />
 *       &lt;attribute name="Status" use="required" type="{http://www.travelport.com/schema/universal_v16_0}typeURStatus" />
 *       &lt;attribute name="CreatedByAgent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ModifiedByAgent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTraveler",
    "agencyContactInfo",
    "searchPassenger",
    "pointOfSale",
    "accountingRemark",
    "generalRemark",
    "agencyInfo",
    "reservationName",
    "airPricingModifiers",
    "airPricingSolution",
    "vehicleSearchModifiers",
    "vehicleDateLocation",
    "specialEquipment",
    "vehicleSpecialRequest",
    "paymentInformation",
    "deliveryAddress",
    "collectionAddress",
    "flightArrivalInformation",
    "vehicle",
    "vendorLocation",
    "hotelProperty",
    "hotelStay",
    "hotelRulesModifiers",
    "hotelDetailsModifiers",
    "hotelRateDetail",
    "promotionCode",
    "railPricingSolution",
    "railFareNoteList",
    "savedTripNote",
    "savedTripActivity",
    "profileAssociation",
    "policyInformation"
})
@XmlRootElement(name = "SavedTrip")
public class SavedTrip {

    @XmlElement(name = "BookingTraveler", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
    protected List<BookingTraveler> bookingTraveler;
    @XmlElement(name = "AgencyContactInfo", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected AgencyContactInfo agencyContactInfo;
    @XmlElement(name = "SearchPassenger", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<SearchPassenger> searchPassenger;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<PointOfSale> pointOfSale;
    @XmlElement(name = "AccountingRemark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<AccountingRemark> accountingRemark;
    @XmlElement(name = "GeneralRemark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<GeneralRemark> generalRemark;
    @XmlElement(name = "AgencyInfo", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected AgencyInfo agencyInfo;
    @XmlElement(name = "ReservationName", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected ReservationName reservationName;
    @XmlElement(name = "AirPricingModifiers", namespace = "http://www.travelport.com/schema/air_v18_0")
    protected List<AirPricingModifiers> airPricingModifiers;
    @XmlElement(name = "AirPricingSolution", namespace = "http://www.travelport.com/schema/air_v18_0")
    protected List<AirPricingSolution> airPricingSolution;
    @XmlElement(name = "VehicleSearchModifiers", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected List<VehicleSearchModifiers> vehicleSearchModifiers;
    @XmlElement(name = "VehicleDateLocation", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected List<VehicleDateLocation> vehicleDateLocation;
    @XmlElement(name = "SpecialEquipment", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<SpecialEquipment> specialEquipment;
    @XmlElement(name = "VehicleSpecialRequest", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected List<VehicleSpecialRequest> vehicleSpecialRequest;
    @XmlElement(name = "PaymentInformation", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected List<PaymentInformation> paymentInformation;
    @XmlElement(name = "DeliveryAddress", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected List<DeliveryAddress> deliveryAddress;
    @XmlElement(name = "CollectionAddress", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected List<CollectionAddress> collectionAddress;
    @XmlElement(name = "FlightArrivalInformation", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected List<FlightArrivalInformation> flightArrivalInformation;
    @XmlElement(name = "Vehicle", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected List<Vehicle> vehicle;
    @XmlElement(name = "VendorLocation", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<VendorLocation> vendorLocation;
    @XmlElement(name = "HotelProperty", namespace = "http://www.travelport.com/schema/hotel_v17_0")
    protected List<HotelProperty> hotelProperty;
    @XmlElement(name = "HotelStay", namespace = "http://www.travelport.com/schema/hotel_v17_0")
    protected List<HotelStay> hotelStay;
    @XmlElement(name = "HotelRulesModifiers", namespace = "http://www.travelport.com/schema/hotel_v17_0")
    protected List<HotelRulesModifiers> hotelRulesModifiers;
    @XmlElement(name = "HotelDetailsModifiers", namespace = "http://www.travelport.com/schema/hotel_v17_0")
    protected List<HotelDetailsModifiers> hotelDetailsModifiers;
    @XmlElement(name = "HotelRateDetail", namespace = "http://www.travelport.com/schema/hotel_v17_0")
    protected List<HotelRateDetail> hotelRateDetail;
    @XmlElement(name = "PromotionCode", namespace = "http://www.travelport.com/schema/hotel_v17_0")
    protected List<PromotionCode> promotionCode;
    @XmlElement(name = "RailPricingSolution", namespace = "http://www.travelport.com/schema/rail_v12_0")
    protected List<RailPricingSolution> railPricingSolution;
    @XmlElement(name = "RailFareNoteList", namespace = "http://www.travelport.com/schema/rail_v12_0")
    protected RailFareNoteList railFareNoteList;
    @XmlElement(name = "SavedTripNote")
    protected List<SavedTripNote> savedTripNote;
    @XmlElement(name = "SavedTripActivity")
    protected List<SavedTripActivity> savedTripActivity;
    @XmlElement(name = "ProfileAssociation")
    protected List<ProfileAssociation> profileAssociation;
    @XmlElement(name = "PolicyInformation")
    protected PolicyInformation policyInformation;
    @XmlAttribute(name = "LocatorCode")
    protected String locatorCode;
    @XmlAttribute(name = "UniversalRecordLocatorCode")
    protected String universalRecordLocatorCode;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlAttribute(name = "ModifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    @XmlAttribute(name = "Version")
    protected BigInteger version;
    @XmlAttribute(name = "Status", required = true)
    protected TypeURStatus status;
    @XmlAttribute(name = "CreatedByAgent")
    protected String createdByAgent;
    @XmlAttribute(name = "ModifiedByAgent")
    protected String modifiedByAgent;

    /**
     * Gets the value of the bookingTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTraveler }
     * 
     * 
     */
    public List<BookingTraveler> getBookingTraveler() {
        if (bookingTraveler == null) {
            bookingTraveler = new ArrayList<BookingTraveler>();
        }
        return this.bookingTraveler;
    }

    /**
     * Gets the value of the agencyContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyContactInfo }
     *     
     */
    public AgencyContactInfo getAgencyContactInfo() {
        return agencyContactInfo;
    }

    /**
     * Sets the value of the agencyContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyContactInfo }
     *     
     */
    public void setAgencyContactInfo(AgencyContactInfo value) {
        this.agencyContactInfo = value;
    }

    /**
     * Gets the value of the searchPassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchPassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchPassenger }
     * 
     * 
     */
    public List<SearchPassenger> getSearchPassenger() {
        if (searchPassenger == null) {
            searchPassenger = new ArrayList<SearchPassenger>();
        }
        return this.searchPassenger;
    }

    /**
     * Gets the value of the pointOfSale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfSale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfSale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfSale }
     * 
     * 
     */
    public List<PointOfSale> getPointOfSale() {
        if (pointOfSale == null) {
            pointOfSale = new ArrayList<PointOfSale>();
        }
        return this.pointOfSale;
    }

    /**
     * Gets the value of the accountingRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingRemark }
     * 
     * 
     */
    public List<AccountingRemark> getAccountingRemark() {
        if (accountingRemark == null) {
            accountingRemark = new ArrayList<AccountingRemark>();
        }
        return this.accountingRemark;
    }

    /**
     * Gets the value of the generalRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralRemark }
     * 
     * 
     */
    public List<GeneralRemark> getGeneralRemark() {
        if (generalRemark == null) {
            generalRemark = new ArrayList<GeneralRemark>();
        }
        return this.generalRemark;
    }

    /**
     * Gets the value of the agencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyInfo }
     *     
     */
    public AgencyInfo getAgencyInfo() {
        return agencyInfo;
    }

    /**
     * Sets the value of the agencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyInfo }
     *     
     */
    public void setAgencyInfo(AgencyInfo value) {
        this.agencyInfo = value;
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
     * Gets the value of the airPricingModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingModifiers }
     * 
     * 
     */
    public List<AirPricingModifiers> getAirPricingModifiers() {
        if (airPricingModifiers == null) {
            airPricingModifiers = new ArrayList<AirPricingModifiers>();
        }
        return this.airPricingModifiers;
    }

    /**
     * Gets the value of the airPricingSolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingSolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingSolution }
     * 
     * 
     */
    public List<AirPricingSolution> getAirPricingSolution() {
        if (airPricingSolution == null) {
            airPricingSolution = new ArrayList<AirPricingSolution>();
        }
        return this.airPricingSolution;
    }

    /**
     * Gets the value of the vehicleSearchModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleSearchModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleSearchModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleSearchModifiers }
     * 
     * 
     */
    public List<VehicleSearchModifiers> getVehicleSearchModifiers() {
        if (vehicleSearchModifiers == null) {
            vehicleSearchModifiers = new ArrayList<VehicleSearchModifiers>();
        }
        return this.vehicleSearchModifiers;
    }

    /**
     * Gets the value of the vehicleDateLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleDateLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleDateLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleDateLocation }
     * 
     * 
     */
    public List<VehicleDateLocation> getVehicleDateLocation() {
        if (vehicleDateLocation == null) {
            vehicleDateLocation = new ArrayList<VehicleDateLocation>();
        }
        return this.vehicleDateLocation;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleSpecialRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleSpecialRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleSpecialRequest }
     * 
     * 
     */
    public List<VehicleSpecialRequest> getVehicleSpecialRequest() {
        if (vehicleSpecialRequest == null) {
            vehicleSpecialRequest = new ArrayList<VehicleSpecialRequest>();
        }
        return this.vehicleSpecialRequest;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInformation }
     * 
     * 
     */
    public List<PaymentInformation> getPaymentInformation() {
        if (paymentInformation == null) {
            paymentInformation = new ArrayList<PaymentInformation>();
        }
        return this.paymentInformation;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryAddress }
     * 
     * 
     */
    public List<DeliveryAddress> getDeliveryAddress() {
        if (deliveryAddress == null) {
            deliveryAddress = new ArrayList<DeliveryAddress>();
        }
        return this.deliveryAddress;
    }

    /**
     * Gets the value of the collectionAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionAddress }
     * 
     * 
     */
    public List<CollectionAddress> getCollectionAddress() {
        if (collectionAddress == null) {
            collectionAddress = new ArrayList<CollectionAddress>();
        }
        return this.collectionAddress;
    }

    /**
     * Gets the value of the flightArrivalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightArrivalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightArrivalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightArrivalInformation }
     * 
     * 
     */
    public List<FlightArrivalInformation> getFlightArrivalInformation() {
        if (flightArrivalInformation == null) {
            flightArrivalInformation = new ArrayList<FlightArrivalInformation>();
        }
        return this.flightArrivalInformation;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle }
     * 
     * 
     */
    public List<Vehicle> getVehicle() {
        if (vehicle == null) {
            vehicle = new ArrayList<Vehicle>();
        }
        return this.vehicle;
    }

    /**
     * Gets the value of the vendorLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorLocation }
     * 
     * 
     */
    public List<VendorLocation> getVendorLocation() {
        if (vendorLocation == null) {
            vendorLocation = new ArrayList<VendorLocation>();
        }
        return this.vendorLocation;
    }

    /**
     * Gets the value of the hotelProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelProperty }
     * 
     * 
     */
    public List<HotelProperty> getHotelProperty() {
        if (hotelProperty == null) {
            hotelProperty = new ArrayList<HotelProperty>();
        }
        return this.hotelProperty;
    }

    /**
     * Gets the value of the hotelStay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelStay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelStay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelStay }
     * 
     * 
     */
    public List<HotelStay> getHotelStay() {
        if (hotelStay == null) {
            hotelStay = new ArrayList<HotelStay>();
        }
        return this.hotelStay;
    }

    /**
     * Gets the value of the hotelRulesModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRulesModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRulesModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRulesModifiers }
     * 
     * 
     */
    public List<HotelRulesModifiers> getHotelRulesModifiers() {
        if (hotelRulesModifiers == null) {
            hotelRulesModifiers = new ArrayList<HotelRulesModifiers>();
        }
        return this.hotelRulesModifiers;
    }

    /**
     * Gets the value of the hotelDetailsModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelDetailsModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelDetailsModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelDetailsModifiers }
     * 
     * 
     */
    public List<HotelDetailsModifiers> getHotelDetailsModifiers() {
        if (hotelDetailsModifiers == null) {
            hotelDetailsModifiers = new ArrayList<HotelDetailsModifiers>();
        }
        return this.hotelDetailsModifiers;
    }

    /**
     * Gets the value of the hotelRateDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRateDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRateDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRateDetail }
     * 
     * 
     */
    public List<HotelRateDetail> getHotelRateDetail() {
        if (hotelRateDetail == null) {
            hotelRateDetail = new ArrayList<HotelRateDetail>();
        }
        return this.hotelRateDetail;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionCode }
     * 
     * 
     */
    public List<PromotionCode> getPromotionCode() {
        if (promotionCode == null) {
            promotionCode = new ArrayList<PromotionCode>();
        }
        return this.promotionCode;
    }

    /**
     * Gets the value of the railPricingSolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railPricingSolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPricingSolution }
     * 
     * 
     */
    public List<RailPricingSolution> getRailPricingSolution() {
        if (railPricingSolution == null) {
            railPricingSolution = new ArrayList<RailPricingSolution>();
        }
        return this.railPricingSolution;
    }

    /**
     * Gets the value of the railFareNoteList property.
     * 
     * @return
     *     possible object is
     *     {@link RailFareNoteList }
     *     
     */
    public RailFareNoteList getRailFareNoteList() {
        return railFareNoteList;
    }

    /**
     * Sets the value of the railFareNoteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareNoteList }
     *     
     */
    public void setRailFareNoteList(RailFareNoteList value) {
        this.railFareNoteList = value;
    }

    /**
     * Gets the value of the savedTripNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the savedTripNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSavedTripNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripNote }
     * 
     * 
     */
    public List<SavedTripNote> getSavedTripNote() {
        if (savedTripNote == null) {
            savedTripNote = new ArrayList<SavedTripNote>();
        }
        return this.savedTripNote;
    }

    /**
     * Gets the value of the savedTripActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the savedTripActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSavedTripActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity }
     * 
     * 
     */
    public List<SavedTripActivity> getSavedTripActivity() {
        if (savedTripActivity == null) {
            savedTripActivity = new ArrayList<SavedTripActivity>();
        }
        return this.savedTripActivity;
    }

    /**
     * Gets the value of the profileAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileAssociation }
     * 
     * 
     */
    public List<ProfileAssociation> getProfileAssociation() {
        if (profileAssociation == null) {
            profileAssociation = new ArrayList<ProfileAssociation>();
        }
        return this.profileAssociation;
    }

    /**
     * Gets the value of the policyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyInformation }
     *     
     */
    public PolicyInformation getPolicyInformation() {
        return policyInformation;
    }

    /**
     * Sets the value of the policyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyInformation }
     *     
     */
    public void setPolicyInformation(PolicyInformation value) {
        this.policyInformation = value;
    }

    /**
     * Gets the value of the locatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatorCode() {
        return locatorCode;
    }

    /**
     * Sets the value of the locatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocatorCode(String value) {
        this.locatorCode = value;
    }

    /**
     * Gets the value of the universalRecordLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalRecordLocatorCode() {
        return universalRecordLocatorCode;
    }

    /**
     * Sets the value of the universalRecordLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalRecordLocatorCode(String value) {
        this.universalRecordLocatorCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TypeURStatus }
     *     
     */
    public TypeURStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeURStatus }
     *     
     */
    public void setStatus(TypeURStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the createdByAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByAgent() {
        return createdByAgent;
    }

    /**
     * Sets the value of the createdByAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByAgent(String value) {
        this.createdByAgent = value;
    }

    /**
     * Gets the value of the modifiedByAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedByAgent() {
        return modifiedByAgent;
    }

    /**
     * Sets the value of the modifiedByAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedByAgent(String value) {
        this.modifiedByAgent = value;
    }

}
