
package com.travelport.schema.universal_v16_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="BookingTravelerRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SearchPassengerRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PointOfSaleRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccountingRemarkRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GeneralRemarkRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AirPricingModifierRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AirPricingSolutionRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleSearchModifiersRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleDateLocationRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialEquipmentRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleSpecialRequestRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentInformationRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeliveryAddressRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CollectionAddressRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightArrivalInformationRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VendorLocationRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelPropertyRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelStayRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelRulesModifiersRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelDetailsModifiersRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelRateDetailRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PromotionCodeRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RailPricingSolutionRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="LowFareSearch"/>
 *             &lt;enumeration value="AirPrice"/>
 *             &lt;enumeration value="VehicleSearchAvailability"/>
 *             &lt;enumeration value="VehicleBook"/>
 *             &lt;enumeration value="HotelDetailsSearch"/>
 *             &lt;enumeration value="HotelRulesSearch"/>
 *             &lt;enumeration value="HotelSearch"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerRef",
    "searchPassengerRef",
    "pointOfSaleRef",
    "accountingRemarkRef",
    "generalRemarkRef",
    "airPricingModifierRef",
    "airPricingSolutionRef",
    "vehicleSearchModifiersRef",
    "vehicleDateLocationRef",
    "specialEquipmentRef",
    "vehicleSpecialRequestRef",
    "paymentInformationRef",
    "deliveryAddressRef",
    "collectionAddressRef",
    "flightArrivalInformationRef",
    "vehicleRef",
    "vendorLocationRef",
    "hotelPropertyRef",
    "hotelStayRef",
    "hotelRulesModifiersRef",
    "hotelDetailsModifiersRef",
    "hotelRateDetailRef",
    "promotionCodeRef",
    "railPricingSolutionRef"
})
@XmlRootElement(name = "SavedTripActivity")
public class SavedTripActivity {

    @XmlElement(name = "BookingTravelerRef")
    protected List<SavedTripActivity.BookingTravelerRef> bookingTravelerRef;
    @XmlElement(name = "SearchPassengerRef")
    protected List<SavedTripActivity.SearchPassengerRef> searchPassengerRef;
    @XmlElement(name = "PointOfSaleRef")
    protected List<SavedTripActivity.PointOfSaleRef> pointOfSaleRef;
    @XmlElement(name = "AccountingRemarkRef")
    protected List<SavedTripActivity.AccountingRemarkRef> accountingRemarkRef;
    @XmlElement(name = "GeneralRemarkRef")
    protected List<SavedTripActivity.GeneralRemarkRef> generalRemarkRef;
    @XmlElement(name = "AirPricingModifierRef")
    protected List<SavedTripActivity.AirPricingModifierRef> airPricingModifierRef;
    @XmlElement(name = "AirPricingSolutionRef")
    protected List<SavedTripActivity.AirPricingSolutionRef> airPricingSolutionRef;
    @XmlElement(name = "VehicleSearchModifiersRef")
    protected List<SavedTripActivity.VehicleSearchModifiersRef> vehicleSearchModifiersRef;
    @XmlElement(name = "VehicleDateLocationRef")
    protected List<SavedTripActivity.VehicleDateLocationRef> vehicleDateLocationRef;
    @XmlElement(name = "SpecialEquipmentRef")
    protected List<SavedTripActivity.SpecialEquipmentRef> specialEquipmentRef;
    @XmlElement(name = "VehicleSpecialRequestRef")
    protected List<SavedTripActivity.VehicleSpecialRequestRef> vehicleSpecialRequestRef;
    @XmlElement(name = "PaymentInformationRef")
    protected List<SavedTripActivity.PaymentInformationRef> paymentInformationRef;
    @XmlElement(name = "DeliveryAddressRef")
    protected List<SavedTripActivity.DeliveryAddressRef> deliveryAddressRef;
    @XmlElement(name = "CollectionAddressRef")
    protected List<SavedTripActivity.CollectionAddressRef> collectionAddressRef;
    @XmlElement(name = "FlightArrivalInformationRef")
    protected List<SavedTripActivity.FlightArrivalInformationRef> flightArrivalInformationRef;
    @XmlElement(name = "VehicleRef")
    protected List<SavedTripActivity.VehicleRef> vehicleRef;
    @XmlElement(name = "VendorLocationRef")
    protected List<SavedTripActivity.VendorLocationRef> vendorLocationRef;
    @XmlElement(name = "HotelPropertyRef")
    protected List<SavedTripActivity.HotelPropertyRef> hotelPropertyRef;
    @XmlElement(name = "HotelStayRef")
    protected List<SavedTripActivity.HotelStayRef> hotelStayRef;
    @XmlElement(name = "HotelRulesModifiersRef")
    protected List<SavedTripActivity.HotelRulesModifiersRef> hotelRulesModifiersRef;
    @XmlElement(name = "HotelDetailsModifiersRef")
    protected List<SavedTripActivity.HotelDetailsModifiersRef> hotelDetailsModifiersRef;
    @XmlElement(name = "HotelRateDetailRef")
    protected List<SavedTripActivity.HotelRateDetailRef> hotelRateDetailRef;
    @XmlElement(name = "PromotionCodeRef")
    protected List<SavedTripActivity.PromotionCodeRef> promotionCodeRef;
    @XmlElement(name = "RailPricingSolutionRef")
    protected List<SavedTripActivity.RailPricingSolutionRef> railPricingSolutionRef;
    @XmlAttribute(name = "Type", required = true)
    protected String type;

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
     * {@link SavedTripActivity.BookingTravelerRef }
     * 
     * 
     */
    public List<SavedTripActivity.BookingTravelerRef> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<SavedTripActivity.BookingTravelerRef>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Gets the value of the searchPassengerRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchPassengerRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchPassengerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.SearchPassengerRef }
     * 
     * 
     */
    public List<SavedTripActivity.SearchPassengerRef> getSearchPassengerRef() {
        if (searchPassengerRef == null) {
            searchPassengerRef = new ArrayList<SavedTripActivity.SearchPassengerRef>();
        }
        return this.searchPassengerRef;
    }

    /**
     * Gets the value of the pointOfSaleRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfSaleRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfSaleRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.PointOfSaleRef }
     * 
     * 
     */
    public List<SavedTripActivity.PointOfSaleRef> getPointOfSaleRef() {
        if (pointOfSaleRef == null) {
            pointOfSaleRef = new ArrayList<SavedTripActivity.PointOfSaleRef>();
        }
        return this.pointOfSaleRef;
    }

    /**
     * Gets the value of the accountingRemarkRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingRemarkRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingRemarkRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.AccountingRemarkRef }
     * 
     * 
     */
    public List<SavedTripActivity.AccountingRemarkRef> getAccountingRemarkRef() {
        if (accountingRemarkRef == null) {
            accountingRemarkRef = new ArrayList<SavedTripActivity.AccountingRemarkRef>();
        }
        return this.accountingRemarkRef;
    }

    /**
     * Gets the value of the generalRemarkRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalRemarkRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralRemarkRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.GeneralRemarkRef }
     * 
     * 
     */
    public List<SavedTripActivity.GeneralRemarkRef> getGeneralRemarkRef() {
        if (generalRemarkRef == null) {
            generalRemarkRef = new ArrayList<SavedTripActivity.GeneralRemarkRef>();
        }
        return this.generalRemarkRef;
    }

    /**
     * Gets the value of the airPricingModifierRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingModifierRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingModifierRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.AirPricingModifierRef }
     * 
     * 
     */
    public List<SavedTripActivity.AirPricingModifierRef> getAirPricingModifierRef() {
        if (airPricingModifierRef == null) {
            airPricingModifierRef = new ArrayList<SavedTripActivity.AirPricingModifierRef>();
        }
        return this.airPricingModifierRef;
    }

    /**
     * Gets the value of the airPricingSolutionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingSolutionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingSolutionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.AirPricingSolutionRef }
     * 
     * 
     */
    public List<SavedTripActivity.AirPricingSolutionRef> getAirPricingSolutionRef() {
        if (airPricingSolutionRef == null) {
            airPricingSolutionRef = new ArrayList<SavedTripActivity.AirPricingSolutionRef>();
        }
        return this.airPricingSolutionRef;
    }

    /**
     * Gets the value of the vehicleSearchModifiersRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleSearchModifiersRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleSearchModifiersRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.VehicleSearchModifiersRef }
     * 
     * 
     */
    public List<SavedTripActivity.VehicleSearchModifiersRef> getVehicleSearchModifiersRef() {
        if (vehicleSearchModifiersRef == null) {
            vehicleSearchModifiersRef = new ArrayList<SavedTripActivity.VehicleSearchModifiersRef>();
        }
        return this.vehicleSearchModifiersRef;
    }

    /**
     * Gets the value of the vehicleDateLocationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleDateLocationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleDateLocationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.VehicleDateLocationRef }
     * 
     * 
     */
    public List<SavedTripActivity.VehicleDateLocationRef> getVehicleDateLocationRef() {
        if (vehicleDateLocationRef == null) {
            vehicleDateLocationRef = new ArrayList<SavedTripActivity.VehicleDateLocationRef>();
        }
        return this.vehicleDateLocationRef;
    }

    /**
     * Gets the value of the specialEquipmentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipmentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.SpecialEquipmentRef }
     * 
     * 
     */
    public List<SavedTripActivity.SpecialEquipmentRef> getSpecialEquipmentRef() {
        if (specialEquipmentRef == null) {
            specialEquipmentRef = new ArrayList<SavedTripActivity.SpecialEquipmentRef>();
        }
        return this.specialEquipmentRef;
    }

    /**
     * Gets the value of the vehicleSpecialRequestRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleSpecialRequestRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleSpecialRequestRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.VehicleSpecialRequestRef }
     * 
     * 
     */
    public List<SavedTripActivity.VehicleSpecialRequestRef> getVehicleSpecialRequestRef() {
        if (vehicleSpecialRequestRef == null) {
            vehicleSpecialRequestRef = new ArrayList<SavedTripActivity.VehicleSpecialRequestRef>();
        }
        return this.vehicleSpecialRequestRef;
    }

    /**
     * Gets the value of the paymentInformationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInformationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInformationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.PaymentInformationRef }
     * 
     * 
     */
    public List<SavedTripActivity.PaymentInformationRef> getPaymentInformationRef() {
        if (paymentInformationRef == null) {
            paymentInformationRef = new ArrayList<SavedTripActivity.PaymentInformationRef>();
        }
        return this.paymentInformationRef;
    }

    /**
     * Gets the value of the deliveryAddressRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryAddressRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryAddressRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.DeliveryAddressRef }
     * 
     * 
     */
    public List<SavedTripActivity.DeliveryAddressRef> getDeliveryAddressRef() {
        if (deliveryAddressRef == null) {
            deliveryAddressRef = new ArrayList<SavedTripActivity.DeliveryAddressRef>();
        }
        return this.deliveryAddressRef;
    }

    /**
     * Gets the value of the collectionAddressRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionAddressRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionAddressRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.CollectionAddressRef }
     * 
     * 
     */
    public List<SavedTripActivity.CollectionAddressRef> getCollectionAddressRef() {
        if (collectionAddressRef == null) {
            collectionAddressRef = new ArrayList<SavedTripActivity.CollectionAddressRef>();
        }
        return this.collectionAddressRef;
    }

    /**
     * Gets the value of the flightArrivalInformationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightArrivalInformationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightArrivalInformationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.FlightArrivalInformationRef }
     * 
     * 
     */
    public List<SavedTripActivity.FlightArrivalInformationRef> getFlightArrivalInformationRef() {
        if (flightArrivalInformationRef == null) {
            flightArrivalInformationRef = new ArrayList<SavedTripActivity.FlightArrivalInformationRef>();
        }
        return this.flightArrivalInformationRef;
    }

    /**
     * Gets the value of the vehicleRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.VehicleRef }
     * 
     * 
     */
    public List<SavedTripActivity.VehicleRef> getVehicleRef() {
        if (vehicleRef == null) {
            vehicleRef = new ArrayList<SavedTripActivity.VehicleRef>();
        }
        return this.vehicleRef;
    }

    /**
     * Gets the value of the vendorLocationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorLocationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorLocationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.VendorLocationRef }
     * 
     * 
     */
    public List<SavedTripActivity.VendorLocationRef> getVendorLocationRef() {
        if (vendorLocationRef == null) {
            vendorLocationRef = new ArrayList<SavedTripActivity.VendorLocationRef>();
        }
        return this.vendorLocationRef;
    }

    /**
     * Gets the value of the hotelPropertyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelPropertyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelPropertyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.HotelPropertyRef }
     * 
     * 
     */
    public List<SavedTripActivity.HotelPropertyRef> getHotelPropertyRef() {
        if (hotelPropertyRef == null) {
            hotelPropertyRef = new ArrayList<SavedTripActivity.HotelPropertyRef>();
        }
        return this.hotelPropertyRef;
    }

    /**
     * Gets the value of the hotelStayRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelStayRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelStayRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.HotelStayRef }
     * 
     * 
     */
    public List<SavedTripActivity.HotelStayRef> getHotelStayRef() {
        if (hotelStayRef == null) {
            hotelStayRef = new ArrayList<SavedTripActivity.HotelStayRef>();
        }
        return this.hotelStayRef;
    }

    /**
     * Gets the value of the hotelRulesModifiersRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRulesModifiersRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRulesModifiersRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.HotelRulesModifiersRef }
     * 
     * 
     */
    public List<SavedTripActivity.HotelRulesModifiersRef> getHotelRulesModifiersRef() {
        if (hotelRulesModifiersRef == null) {
            hotelRulesModifiersRef = new ArrayList<SavedTripActivity.HotelRulesModifiersRef>();
        }
        return this.hotelRulesModifiersRef;
    }

    /**
     * Gets the value of the hotelDetailsModifiersRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelDetailsModifiersRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelDetailsModifiersRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.HotelDetailsModifiersRef }
     * 
     * 
     */
    public List<SavedTripActivity.HotelDetailsModifiersRef> getHotelDetailsModifiersRef() {
        if (hotelDetailsModifiersRef == null) {
            hotelDetailsModifiersRef = new ArrayList<SavedTripActivity.HotelDetailsModifiersRef>();
        }
        return this.hotelDetailsModifiersRef;
    }

    /**
     * Gets the value of the hotelRateDetailRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRateDetailRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRateDetailRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.HotelRateDetailRef }
     * 
     * 
     */
    public List<SavedTripActivity.HotelRateDetailRef> getHotelRateDetailRef() {
        if (hotelRateDetailRef == null) {
            hotelRateDetailRef = new ArrayList<SavedTripActivity.HotelRateDetailRef>();
        }
        return this.hotelRateDetailRef;
    }

    /**
     * Gets the value of the promotionCodeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionCodeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionCodeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.PromotionCodeRef }
     * 
     * 
     */
    public List<SavedTripActivity.PromotionCodeRef> getPromotionCodeRef() {
        if (promotionCodeRef == null) {
            promotionCodeRef = new ArrayList<SavedTripActivity.PromotionCodeRef>();
        }
        return this.promotionCodeRef;
    }

    /**
     * Gets the value of the railPricingSolutionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railPricingSolutionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailPricingSolutionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedTripActivity.RailPricingSolutionRef }
     * 
     * 
     */
    public List<SavedTripActivity.RailPricingSolutionRef> getRailPricingSolutionRef() {
        if (railPricingSolutionRef == null) {
            railPricingSolutionRef = new ArrayList<SavedTripActivity.RailPricingSolutionRef>();
        }
        return this.railPricingSolutionRef;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AccountingRemarkRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirPricingModifierRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirPricingSolutionRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BookingTravelerRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CollectionAddressRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DeliveryAddressRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightArrivalInformationRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GeneralRemarkRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelDetailsModifiersRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelPropertyRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelRateDetailRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelRulesModifiersRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelStayRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PaymentInformationRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PointOfSaleRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PromotionCodeRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RailPricingSolutionRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SearchPassengerRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpecialEquipmentRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehicleDateLocationRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehicleRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehicleSearchModifiersRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehicleSpecialRequestRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VendorLocationRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

    }

}
