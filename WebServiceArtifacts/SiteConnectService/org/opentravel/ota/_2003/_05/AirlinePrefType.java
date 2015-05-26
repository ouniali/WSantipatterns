
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AirlinePrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlinePrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPref" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VendorPref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNamePrefType">
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentFormPref" type="{http://www.opentravel.org/OTA/2003/05}PaymentFormPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirportOriginPref" type="{http://www.opentravel.org/OTA/2003/05}AirportPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirportDestinationPref" type="{http://www.opentravel.org/OTA/2003/05}AirportPrefType" minOccurs="0"/>
 *         &lt;element name="AirportRoutePref" type="{http://www.opentravel.org/OTA/2003/05}AirportPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareRestrictPref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareRestrictPrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FarePref" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                 &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                 &lt;attribute name="RateCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TourCodePref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="TourCodeInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PromotionCodeGroup"/>
 *                           &lt;attribute name="TourTypeCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                           &lt;attribute name="YearNum">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                 &lt;minInclusive value="0"/>
 *                                 &lt;maxInclusive value="9"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="PartyID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="StaffTourCodeInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="StaffType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="Current"/>
 *                                 &lt;enumeration value="Duty"/>
 *                                 &lt;enumeration value="CabinCrew"/>
 *                                 &lt;enumeration value="Retired"/>
 *                                 &lt;enumeration value="TechCrew"/>
 *                                 &lt;enumeration value="UnaccompaniedFamilyMember"/>
 *                                 &lt;enumeration value="OtherAirlinePersonnel"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="EmployeeID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="VendorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                           &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *                 &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                 &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightTypePref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightTypePrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EquipPref" type="{http://www.opentravel.org/OTA/2003/05}EquipmentTypePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CabinPref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CabinPrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SeatPref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SeatPrefGroup"/>
 *                 &lt;attribute name="FlightDistanceQualifier">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="LongHaul"/>
 *                       &lt;enumeration value="ShortHaul"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="InternationalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                 &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketDistribPref" type="{http://www.opentravel.org/OTA/2003/05}TicketDistribPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MealPref" type="{http://www.opentravel.org/OTA/2003/05}MealPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecRequestPref" type="{http://www.opentravel.org/OTA/2003/05}SpecRequestPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SSR_Pref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SSR_PrefGroup"/>
 *                 &lt;attribute name="VendorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="DefaultStatusCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="Remark" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                 &lt;attribute name="LookupKey" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                 &lt;attribute name="TransferActionType" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *         &lt;element name="MediaEntertainPref" type="{http://www.opentravel.org/OTA/2003/05}MediaEntertainPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PetInfoPref" type="{http://www.opentravel.org/OTA/2003/05}PetInfoPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccountInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxRegistrationDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="TaxID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="RecipientName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                           &lt;attribute name="RecipientAddress" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to32" />
 *                 &lt;attribute name="CostCenter" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
 *                 &lt;attribute name="CompanyNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to32" />
 *                 &lt;attribute name="ClientReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OSI_Pref" type="{http://www.opentravel.org/OTA/2003/05}OtherServiceInfoType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="KeywordPref" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="VendorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to32" />
 *                 &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to128" />
 *                 &lt;attribute name="Keyword" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="StatusCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="AirlineVendorRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SmokingIndicatorGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="AirTicketType" type="{http://www.opentravel.org/OTA/2003/05}TicketType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlinePrefType", propOrder = {
    "loyaltyPref",
    "vendorPref",
    "paymentFormPref",
    "airportOriginPref",
    "airportDestinationPref",
    "airportRoutePref",
    "fareRestrictPref",
    "farePref",
    "tourCodePref",
    "flightTypePref",
    "equipPref",
    "cabinPref",
    "seatPref",
    "ticketDistribPref",
    "mealPref",
    "specRequestPref",
    "ssrPref",
    "tpaExtensions",
    "mediaEntertainPref",
    "petInfoPref",
    "accountInformation",
    "osiPref",
    "keywordPref"
})
public class AirlinePrefType {

    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPrefType> loyaltyPref;
    @XmlElement(name = "VendorPref")
    protected List<AirlinePrefType.VendorPref> vendorPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPrefType> paymentFormPref;
    @XmlElement(name = "AirportOriginPref")
    protected List<AirportPrefType> airportOriginPref;
    @XmlElement(name = "AirportDestinationPref")
    protected AirportPrefType airportDestinationPref;
    @XmlElement(name = "AirportRoutePref")
    protected List<AirportPrefType> airportRoutePref;
    @XmlElement(name = "FareRestrictPref")
    protected List<AirlinePrefType.FareRestrictPref> fareRestrictPref;
    @XmlElement(name = "FarePref")
    protected List<AirlinePrefType.FarePref> farePref;
    @XmlElement(name = "TourCodePref")
    protected List<AirlinePrefType.TourCodePref> tourCodePref;
    @XmlElement(name = "FlightTypePref")
    protected List<AirlinePrefType.FlightTypePref> flightTypePref;
    @XmlElement(name = "EquipPref")
    protected List<EquipmentTypePref> equipPref;
    @XmlElement(name = "CabinPref")
    protected List<AirlinePrefType.CabinPref> cabinPref;
    @XmlElement(name = "SeatPref")
    protected List<AirlinePrefType.SeatPref> seatPref;
    @XmlElement(name = "TicketDistribPref")
    protected List<TicketDistribPrefType> ticketDistribPref;
    @XmlElement(name = "MealPref")
    protected List<MealPrefType> mealPref;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPrefType> specRequestPref;
    @XmlElement(name = "SSR_Pref")
    protected List<AirlinePrefType.SSRPref> ssrPref;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlElement(name = "MediaEntertainPref")
    protected List<MediaEntertainPrefType> mediaEntertainPref;
    @XmlElement(name = "PetInfoPref")
    protected List<PetInfoPrefType> petInfoPref;
    @XmlElement(name = "AccountInformation")
    protected AirlinePrefType.AccountInformation accountInformation;
    @XmlElement(name = "OSI_Pref")
    protected List<OtherServiceInfoType> osiPref;
    @XmlElement(name = "KeywordPref")
    protected List<AirlinePrefType.KeywordPref> keywordPref;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlAttribute(name = "AirTicketType")
    protected TicketType airTicketType;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;

    /**
     * Gets the value of the loyaltyPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPrefType }
     * 
     * 
     */
    public List<LoyaltyPrefType> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPrefType>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the vendorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.VendorPref }
     * 
     * 
     */
    public List<AirlinePrefType.VendorPref> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<AirlinePrefType.VendorPref>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormPrefType }
     * 
     * 
     */
    public List<PaymentFormPrefType> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPrefType>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the airportOriginPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportOriginPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportOriginPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportPrefType }
     * 
     * 
     */
    public List<AirportPrefType> getAirportOriginPref() {
        if (airportOriginPref == null) {
            airportOriginPref = new ArrayList<AirportPrefType>();
        }
        return this.airportOriginPref;
    }

    /**
     * Gets the value of the airportDestinationPref property.
     * 
     * @return
     *     possible object is
     *     {@link AirportPrefType }
     *     
     */
    public AirportPrefType getAirportDestinationPref() {
        return airportDestinationPref;
    }

    /**
     * Sets the value of the airportDestinationPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportPrefType }
     *     
     */
    public void setAirportDestinationPref(AirportPrefType value) {
        this.airportDestinationPref = value;
    }

    /**
     * Gets the value of the airportRoutePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportRoutePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportRoutePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportPrefType }
     * 
     * 
     */
    public List<AirportPrefType> getAirportRoutePref() {
        if (airportRoutePref == null) {
            airportRoutePref = new ArrayList<AirportPrefType>();
        }
        return this.airportRoutePref;
    }

    /**
     * Gets the value of the fareRestrictPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestrictPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRestrictPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.FareRestrictPref }
     * 
     * 
     */
    public List<AirlinePrefType.FareRestrictPref> getFareRestrictPref() {
        if (fareRestrictPref == null) {
            fareRestrictPref = new ArrayList<AirlinePrefType.FareRestrictPref>();
        }
        return this.fareRestrictPref;
    }

    /**
     * Gets the value of the farePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.FarePref }
     * 
     * 
     */
    public List<AirlinePrefType.FarePref> getFarePref() {
        if (farePref == null) {
            farePref = new ArrayList<AirlinePrefType.FarePref>();
        }
        return this.farePref;
    }

    /**
     * Gets the value of the tourCodePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourCodePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourCodePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.TourCodePref }
     * 
     * 
     */
    public List<AirlinePrefType.TourCodePref> getTourCodePref() {
        if (tourCodePref == null) {
            tourCodePref = new ArrayList<AirlinePrefType.TourCodePref>();
        }
        return this.tourCodePref;
    }

    /**
     * Gets the value of the flightTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.FlightTypePref }
     * 
     * 
     */
    public List<AirlinePrefType.FlightTypePref> getFlightTypePref() {
        if (flightTypePref == null) {
            flightTypePref = new ArrayList<AirlinePrefType.FlightTypePref>();
        }
        return this.flightTypePref;
    }

    /**
     * Gets the value of the equipPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentTypePref }
     * 
     * 
     */
    public List<EquipmentTypePref> getEquipPref() {
        if (equipPref == null) {
            equipPref = new ArrayList<EquipmentTypePref>();
        }
        return this.equipPref;
    }

    /**
     * Gets the value of the cabinPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.CabinPref }
     * 
     * 
     */
    public List<AirlinePrefType.CabinPref> getCabinPref() {
        if (cabinPref == null) {
            cabinPref = new ArrayList<AirlinePrefType.CabinPref>();
        }
        return this.cabinPref;
    }

    /**
     * Gets the value of the seatPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.SeatPref }
     * 
     * 
     */
    public List<AirlinePrefType.SeatPref> getSeatPref() {
        if (seatPref == null) {
            seatPref = new ArrayList<AirlinePrefType.SeatPref>();
        }
        return this.seatPref;
    }

    /**
     * Gets the value of the ticketDistribPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDistribPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDistribPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDistribPrefType }
     * 
     * 
     */
    public List<TicketDistribPrefType> getTicketDistribPref() {
        if (ticketDistribPref == null) {
            ticketDistribPref = new ArrayList<TicketDistribPrefType>();
        }
        return this.ticketDistribPref;
    }

    /**
     * Gets the value of the mealPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MealPrefType }
     * 
     * 
     */
    public List<MealPrefType> getMealPref() {
        if (mealPref == null) {
            mealPref = new ArrayList<MealPrefType>();
        }
        return this.mealPref;
    }

    /**
     * Gets the value of the specRequestPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specRequestPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecRequestPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecRequestPrefType }
     * 
     * 
     */
    public List<SpecRequestPrefType> getSpecRequestPref() {
        if (specRequestPref == null) {
            specRequestPref = new ArrayList<SpecRequestPrefType>();
        }
        return this.specRequestPref;
    }

    /**
     * Gets the value of the ssrPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.SSRPref }
     * 
     * 
     */
    public List<AirlinePrefType.SSRPref> getSSRPref() {
        if (ssrPref == null) {
            ssrPref = new ArrayList<AirlinePrefType.SSRPref>();
        }
        return this.ssrPref;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the mediaEntertainPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaEntertainPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaEntertainPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaEntertainPrefType }
     * 
     * 
     */
    public List<MediaEntertainPrefType> getMediaEntertainPref() {
        if (mediaEntertainPref == null) {
            mediaEntertainPref = new ArrayList<MediaEntertainPrefType>();
        }
        return this.mediaEntertainPref;
    }

    /**
     * Gets the value of the petInfoPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petInfoPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetInfoPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PetInfoPrefType }
     * 
     * 
     */
    public List<PetInfoPrefType> getPetInfoPref() {
        if (petInfoPref == null) {
            petInfoPref = new ArrayList<PetInfoPrefType>();
        }
        return this.petInfoPref;
    }

    /**
     * Gets the value of the accountInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AirlinePrefType.AccountInformation }
     *     
     */
    public AirlinePrefType.AccountInformation getAccountInformation() {
        return accountInformation;
    }

    /**
     * Sets the value of the accountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlinePrefType.AccountInformation }
     *     
     */
    public void setAccountInformation(AirlinePrefType.AccountInformation value) {
        this.accountInformation = value;
    }

    /**
     * Gets the value of the osiPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osiPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOSIPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherServiceInfoType }
     * 
     * 
     */
    public List<OtherServiceInfoType> getOSIPref() {
        if (osiPref == null) {
            osiPref = new ArrayList<OtherServiceInfoType>();
        }
        return this.osiPref;
    }

    /**
     * Gets the value of the keywordPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.KeywordPref }
     * 
     * 
     */
    public List<AirlinePrefType.KeywordPref> getKeywordPref() {
        if (keywordPref == null) {
            keywordPref = new ArrayList<AirlinePrefType.KeywordPref>();
        }
        return this.keywordPref;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Gets the value of the airTicketType property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType }
     *     
     */
    public TicketType getAirTicketType() {
        return airTicketType;
    }

    /**
     * Sets the value of the airTicketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType }
     *     
     */
    public void setAirTicketType(TicketType value) {
        this.airTicketType = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
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
     *         &lt;element name="TaxRegistrationDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="TaxID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="RecipientName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *                 &lt;attribute name="RecipientAddress" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to32" />
     *       &lt;attribute name="CostCenter" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
     *       &lt;attribute name="CompanyNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to32" />
     *       &lt;attribute name="ClientReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxRegistrationDetails"
    })
    public static class AccountInformation {

        @XmlElement(name = "TaxRegistrationDetails")
        protected AirlinePrefType.AccountInformation.TaxRegistrationDetails taxRegistrationDetails;
        @XmlAttribute(name = "Number")
        protected String number;
        @XmlAttribute(name = "CostCenter")
        protected String costCenter;
        @XmlAttribute(name = "CompanyNumber")
        protected String companyNumber;
        @XmlAttribute(name = "ClientReference")
        protected String clientReference;

        /**
         * Gets the value of the taxRegistrationDetails property.
         * 
         * @return
         *     possible object is
         *     {@link AirlinePrefType.AccountInformation.TaxRegistrationDetails }
         *     
         */
        public AirlinePrefType.AccountInformation.TaxRegistrationDetails getTaxRegistrationDetails() {
            return taxRegistrationDetails;
        }

        /**
         * Sets the value of the taxRegistrationDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlinePrefType.AccountInformation.TaxRegistrationDetails }
         *     
         */
        public void setTaxRegistrationDetails(AirlinePrefType.AccountInformation.TaxRegistrationDetails value) {
            this.taxRegistrationDetails = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * Gets the value of the costCenter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCostCenter() {
            return costCenter;
        }

        /**
         * Sets the value of the costCenter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCostCenter(String value) {
            this.costCenter = value;
        }

        /**
         * Gets the value of the companyNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyNumber() {
            return companyNumber;
        }

        /**
         * Sets the value of the companyNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyNumber(String value) {
            this.companyNumber = value;
        }

        /**
         * Gets the value of the clientReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientReference() {
            return clientReference;
        }

        /**
         * Sets the value of the clientReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientReference(String value) {
            this.clientReference = value;
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
         *       &lt;attribute name="TaxID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="RecipientName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *       &lt;attribute name="RecipientAddress" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TaxRegistrationDetails {

            @XmlAttribute(name = "TaxID")
            protected String taxID;
            @XmlAttribute(name = "RecipientName")
            protected String recipientName;
            @XmlAttribute(name = "RecipientAddress")
            protected String recipientAddress;

            /**
             * Gets the value of the taxID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxID() {
                return taxID;
            }

            /**
             * Sets the value of the taxID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxID(String value) {
                this.taxID = value;
            }

            /**
             * Gets the value of the recipientName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecipientName() {
                return recipientName;
            }

            /**
             * Sets the value of the recipientName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecipientName(String value) {
                this.recipientName = value;
            }

            /**
             * Gets the value of the recipientAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecipientAddress() {
                return recipientAddress;
            }

            /**
             * Sets the value of the recipientAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecipientAddress(String value) {
                this.recipientAddress = value;
            }

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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CabinPrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CabinPref {

        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "Cabin")
        protected CabinType cabin;

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
        }

        /**
         * Gets the value of the cabin property.
         * 
         * @return
         *     possible object is
         *     {@link CabinType }
         *     
         */
        public CabinType getCabin() {
            return cabin;
        }

        /**
         * Sets the value of the cabin property.
         * 
         * @param value
         *     allowed object is
         *     {@link CabinType }
         *     
         */
        public void setCabin(CabinType value) {
            this.cabin = value;
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
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *       &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *       &lt;attribute name="RateCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FarePref {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "AirlineVendorPrefRPH")
        protected List<String> airlineVendorPrefRPH;
        @XmlAttribute(name = "RateCategoryCode")
        protected String rateCategoryCode;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the airlineVendorPrefRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineVendorPrefRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineVendorPrefRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirlineVendorPrefRPH() {
            if (airlineVendorPrefRPH == null) {
                airlineVendorPrefRPH = new ArrayList<String>();
            }
            return this.airlineVendorPrefRPH;
        }

        /**
         * Gets the value of the rateCategoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateCategoryCode() {
            return rateCategoryCode;
        }

        /**
         * Sets the value of the rateCategoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateCategoryCode(String value) {
            this.rateCategoryCode = value;
        }

        /**
         * Gets the value of the transferAction property.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * Sets the value of the transferAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareRestrictPrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FareRestrictPref {

        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "FareRestriction")
        protected String fareRestriction;
        @XmlAttribute(name = "Date")
        protected String date;

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
        }

        /**
         * Gets the value of the fareRestriction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareRestriction() {
            return fareRestriction;
        }

        /**
         * Sets the value of the fareRestriction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareRestriction(String value) {
            this.fareRestriction = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightTypePrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightTypePref {

        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "FlightType")
        protected FlightTypeType flightType;
        @XmlAttribute(name = "MaxConnections")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxConnections;
        @XmlAttribute(name = "NonScheduledFltInfo")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String nonScheduledFltInfo;
        @XmlAttribute(name = "BackhaulIndicator")
        protected Boolean backhaulIndicator;
        @XmlAttribute(name = "GroundTransportIndicator")
        protected Boolean groundTransportIndicator;
        @XmlAttribute(name = "DirectAndNonStopOnlyInd")
        protected Boolean directAndNonStopOnlyInd;
        @XmlAttribute(name = "NonStopsOnlyInd")
        protected Boolean nonStopsOnlyInd;
        @XmlAttribute(name = "OnlineConnectionsOnlyInd")
        protected Boolean onlineConnectionsOnlyInd;
        @XmlAttribute(name = "RoutingType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String routingType;
        @XmlAttribute(name = "ExcludeTrainInd")
        protected Boolean excludeTrainInd;

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
        }

        /**
         * Gets the value of the flightType property.
         * 
         * @return
         *     possible object is
         *     {@link FlightTypeType }
         *     
         */
        public FlightTypeType getFlightType() {
            return flightType;
        }

        /**
         * Sets the value of the flightType property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightTypeType }
         *     
         */
        public void setFlightType(FlightTypeType value) {
            this.flightType = value;
        }

        /**
         * Gets the value of the maxConnections property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxConnections() {
            return maxConnections;
        }

        /**
         * Sets the value of the maxConnections property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxConnections(BigInteger value) {
            this.maxConnections = value;
        }

        /**
         * Gets the value of the nonScheduledFltInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNonScheduledFltInfo() {
            return nonScheduledFltInfo;
        }

        /**
         * Sets the value of the nonScheduledFltInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNonScheduledFltInfo(String value) {
            this.nonScheduledFltInfo = value;
        }

        /**
         * Gets the value of the backhaulIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBackhaulIndicator() {
            return backhaulIndicator;
        }

        /**
         * Sets the value of the backhaulIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBackhaulIndicator(Boolean value) {
            this.backhaulIndicator = value;
        }

        /**
         * Gets the value of the groundTransportIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGroundTransportIndicator() {
            return groundTransportIndicator;
        }

        /**
         * Sets the value of the groundTransportIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGroundTransportIndicator(Boolean value) {
            this.groundTransportIndicator = value;
        }

        /**
         * Gets the value of the directAndNonStopOnlyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDirectAndNonStopOnlyInd() {
            return directAndNonStopOnlyInd;
        }

        /**
         * Sets the value of the directAndNonStopOnlyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDirectAndNonStopOnlyInd(Boolean value) {
            this.directAndNonStopOnlyInd = value;
        }

        /**
         * Gets the value of the nonStopsOnlyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonStopsOnlyInd() {
            return nonStopsOnlyInd;
        }

        /**
         * Sets the value of the nonStopsOnlyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonStopsOnlyInd(Boolean value) {
            this.nonStopsOnlyInd = value;
        }

        /**
         * Gets the value of the onlineConnectionsOnlyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOnlineConnectionsOnlyInd() {
            return onlineConnectionsOnlyInd;
        }

        /**
         * Sets the value of the onlineConnectionsOnlyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOnlineConnectionsOnlyInd(Boolean value) {
            this.onlineConnectionsOnlyInd = value;
        }

        /**
         * Gets the value of the routingType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoutingType() {
            return routingType;
        }

        /**
         * Sets the value of the routingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoutingType(String value) {
            this.routingType = value;
        }

        /**
         * Gets the value of the excludeTrainInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExcludeTrainInd() {
            return excludeTrainInd;
        }

        /**
         * Sets the value of the excludeTrainInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExcludeTrainInd(Boolean value) {
            this.excludeTrainInd = value;
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
     *       &lt;attribute name="VendorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to32" />
     *       &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to128" />
     *       &lt;attribute name="Keyword" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="StatusCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="AirlineVendorRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class KeywordPref {

        @XmlAttribute(name = "VendorCode")
        protected String vendorCode;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "Keyword")
        protected String keyword;
        @XmlAttribute(name = "StatusCode")
        protected String statusCode;
        @XmlAttribute(name = "NumberInParty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger numberInParty;
        @XmlAttribute(name = "AirlineVendorRPH")
        protected List<String> airlineVendorRPH;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

        /**
         * Gets the value of the vendorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorCode() {
            return vendorCode;
        }

        /**
         * Sets the value of the vendorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorCode(String value) {
            this.vendorCode = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the keyword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeyword() {
            return keyword;
        }

        /**
         * Sets the value of the keyword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeyword(String value) {
            this.keyword = value;
        }

        /**
         * Gets the value of the statusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusCode() {
            return statusCode;
        }

        /**
         * Sets the value of the statusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusCode(String value) {
            this.statusCode = value;
        }

        /**
         * Gets the value of the numberInParty property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumberInParty() {
            return numberInParty;
        }

        /**
         * Sets the value of the numberInParty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumberInParty(BigInteger value) {
            this.numberInParty = value;
        }

        /**
         * Gets the value of the airlineVendorRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineVendorRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineVendorRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirlineVendorRPH() {
            if (airlineVendorRPH == null) {
                airlineVendorRPH = new ArrayList<String>();
            }
            return this.airlineVendorRPH;
        }

        /**
         * Gets the value of the transferAction property.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * Sets the value of the transferAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SSR_PrefGroup"/>
     *       &lt;attribute name="VendorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="DefaultStatusCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="Remark" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *       &lt;attribute name="LookupKey" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *       &lt;attribute name="TransferActionType" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SSRPref {

        @XmlAttribute(name = "VendorCode")
        protected String vendorCode;
        @XmlAttribute(name = "NumberInParty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger numberInParty;
        @XmlAttribute(name = "DefaultStatusCode")
        protected String defaultStatusCode;
        @XmlAttribute(name = "Remark")
        protected String remark;
        @XmlAttribute(name = "LookupKey")
        protected String lookupKey;
        @XmlAttribute(name = "AirlineVendorPrefRPH")
        protected List<String> airlineVendorPrefRPH;
        @XmlAttribute(name = "TransferActionType")
        protected TransferActionType transferActionType;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "SSR_Code")
        protected String ssrCode;

        /**
         * Gets the value of the vendorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorCode() {
            return vendorCode;
        }

        /**
         * Sets the value of the vendorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorCode(String value) {
            this.vendorCode = value;
        }

        /**
         * Gets the value of the numberInParty property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumberInParty() {
            return numberInParty;
        }

        /**
         * Sets the value of the numberInParty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumberInParty(BigInteger value) {
            this.numberInParty = value;
        }

        /**
         * Gets the value of the defaultStatusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefaultStatusCode() {
            return defaultStatusCode;
        }

        /**
         * Sets the value of the defaultStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefaultStatusCode(String value) {
            this.defaultStatusCode = value;
        }

        /**
         * Gets the value of the remark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemark() {
            return remark;
        }

        /**
         * Sets the value of the remark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemark(String value) {
            this.remark = value;
        }

        /**
         * Gets the value of the lookupKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLookupKey() {
            return lookupKey;
        }

        /**
         * Sets the value of the lookupKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLookupKey(String value) {
            this.lookupKey = value;
        }

        /**
         * Gets the value of the airlineVendorPrefRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineVendorPrefRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineVendorPrefRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirlineVendorPrefRPH() {
            if (airlineVendorPrefRPH == null) {
                airlineVendorPrefRPH = new ArrayList<String>();
            }
            return this.airlineVendorPrefRPH;
        }

        /**
         * Gets the value of the transferActionType property.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferActionType() {
            return transferActionType;
        }

        /**
         * Sets the value of the transferActionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferActionType(TransferActionType value) {
            this.transferActionType = value;
        }

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
        }

        /**
         * Gets the value of the ssrCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSSRCode() {
            return ssrCode;
        }

        /**
         * Sets the value of the ssrCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSSRCode(String value) {
            this.ssrCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SeatPrefGroup"/>
     *       &lt;attribute name="FlightDistanceQualifier">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="LongHaul"/>
     *             &lt;enumeration value="ShortHaul"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="InternationalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *       &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SeatPref {

        @XmlAttribute(name = "FlightDistanceQualifier")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String flightDistanceQualifier;
        @XmlAttribute(name = "InternationalIndicator")
        protected Boolean internationalIndicator;
        @XmlAttribute(name = "AirlineVendorPrefRPH")
        protected List<String> airlineVendorPrefRPH;
        @XmlAttribute(name = "PassengerTypeCode")
        protected String passengerTypeCode;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "SeatNumber")
        protected String seatNumber;
        @XmlAttribute(name = "SeatPreference")
        protected List<String> seatPreference;
        @XmlAttribute(name = "SmokingAllowed")
        protected Boolean smokingAllowed;
        @XmlAttribute(name = "DeckNumber")
        protected Integer deckNumber;
        @XmlAttribute(name = "RowNumber")
        protected Integer rowNumber;
        @XmlAttribute(name = "SeatInRow")
        protected String seatInRow;

        /**
         * Gets the value of the flightDistanceQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightDistanceQualifier() {
            return flightDistanceQualifier;
        }

        /**
         * Sets the value of the flightDistanceQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightDistanceQualifier(String value) {
            this.flightDistanceQualifier = value;
        }

        /**
         * Gets the value of the internationalIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInternationalIndicator() {
            return internationalIndicator;
        }

        /**
         * Sets the value of the internationalIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInternationalIndicator(Boolean value) {
            this.internationalIndicator = value;
        }

        /**
         * Gets the value of the airlineVendorPrefRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineVendorPrefRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineVendorPrefRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirlineVendorPrefRPH() {
            if (airlineVendorPrefRPH == null) {
                airlineVendorPrefRPH = new ArrayList<String>();
            }
            return this.airlineVendorPrefRPH;
        }

        /**
         * Gets the value of the passengerTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassengerTypeCode() {
            return passengerTypeCode;
        }

        /**
         * Sets the value of the passengerTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassengerTypeCode(String value) {
            this.passengerTypeCode = value;
        }

        /**
         * Gets the value of the transferAction property.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * Sets the value of the transferAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
        }

        /**
         * Gets the value of the seatNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeatNumber() {
            return seatNumber;
        }

        /**
         * Sets the value of the seatNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeatNumber(String value) {
            this.seatNumber = value;
        }

        /**
         * Gets the value of the seatPreference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seatPreference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeatPreference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSeatPreference() {
            if (seatPreference == null) {
                seatPreference = new ArrayList<String>();
            }
            return this.seatPreference;
        }

        /**
         * Gets the value of the smokingAllowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSmokingAllowed() {
            return smokingAllowed;
        }

        /**
         * Sets the value of the smokingAllowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSmokingAllowed(Boolean value) {
            this.smokingAllowed = value;
        }

        /**
         * Gets the value of the deckNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDeckNumber() {
            return deckNumber;
        }

        /**
         * Sets the value of the deckNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDeckNumber(Integer value) {
            this.deckNumber = value;
        }

        /**
         * Gets the value of the rowNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRowNumber() {
            return rowNumber;
        }

        /**
         * Sets the value of the rowNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRowNumber(Integer value) {
            this.rowNumber = value;
        }

        /**
         * Gets the value of the seatInRow property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeatInRow() {
            return seatInRow;
        }

        /**
         * Sets the value of the seatInRow property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeatInRow(String value) {
            this.seatInRow = value;
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
     *       &lt;choice>
     *         &lt;element name="TourCodeInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PromotionCodeGroup"/>
     *                 &lt;attribute name="TourTypeCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                 &lt;attribute name="YearNum">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                       &lt;minInclusive value="0"/>
     *                       &lt;maxInclusive value="9"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="PartyID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="StaffTourCodeInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="StaffType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="Current"/>
     *                       &lt;enumeration value="Duty"/>
     *                       &lt;enumeration value="CabinCrew"/>
     *                       &lt;enumeration value="Retired"/>
     *                       &lt;enumeration value="TechCrew"/>
     *                       &lt;enumeration value="UnaccompaniedFamilyMember"/>
     *                       &lt;enumeration value="OtherAirlinePersonnel"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="EmployeeID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="VendorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                 &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *       &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *       &lt;attribute name="AirlineVendorPrefRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tourCodeInfo",
        "staffTourCodeInfo"
    })
    public static class TourCodePref {

        @XmlElement(name = "TourCodeInfo")
        protected AirlinePrefType.TourCodePref.TourCodeInfo tourCodeInfo;
        @XmlElement(name = "StaffTourCodeInfo")
        protected AirlinePrefType.TourCodePref.StaffTourCodeInfo staffTourCodeInfo;
        @XmlAttribute(name = "PassengerTypeCode")
        protected String passengerTypeCode;
        @XmlAttribute(name = "AirlineVendorPrefRPH")
        protected List<String> airlineVendorPrefRPH;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

        /**
         * Gets the value of the tourCodeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AirlinePrefType.TourCodePref.TourCodeInfo }
         *     
         */
        public AirlinePrefType.TourCodePref.TourCodeInfo getTourCodeInfo() {
            return tourCodeInfo;
        }

        /**
         * Sets the value of the tourCodeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlinePrefType.TourCodePref.TourCodeInfo }
         *     
         */
        public void setTourCodeInfo(AirlinePrefType.TourCodePref.TourCodeInfo value) {
            this.tourCodeInfo = value;
        }

        /**
         * Gets the value of the staffTourCodeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AirlinePrefType.TourCodePref.StaffTourCodeInfo }
         *     
         */
        public AirlinePrefType.TourCodePref.StaffTourCodeInfo getStaffTourCodeInfo() {
            return staffTourCodeInfo;
        }

        /**
         * Sets the value of the staffTourCodeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlinePrefType.TourCodePref.StaffTourCodeInfo }
         *     
         */
        public void setStaffTourCodeInfo(AirlinePrefType.TourCodePref.StaffTourCodeInfo value) {
            this.staffTourCodeInfo = value;
        }

        /**
         * Gets the value of the passengerTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassengerTypeCode() {
            return passengerTypeCode;
        }

        /**
         * Sets the value of the passengerTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassengerTypeCode(String value) {
            this.passengerTypeCode = value;
        }

        /**
         * Gets the value of the airlineVendorPrefRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineVendorPrefRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineVendorPrefRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirlineVendorPrefRPH() {
            if (airlineVendorPrefRPH == null) {
                airlineVendorPrefRPH = new ArrayList<String>();
            }
            return this.airlineVendorPrefRPH;
        }

        /**
         * Gets the value of the transferAction property.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * Sets the value of the transferAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
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
         *       &lt;attribute name="StaffType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="Current"/>
         *             &lt;enumeration value="Duty"/>
         *             &lt;enumeration value="CabinCrew"/>
         *             &lt;enumeration value="Retired"/>
         *             &lt;enumeration value="TechCrew"/>
         *             &lt;enumeration value="UnaccompaniedFamilyMember"/>
         *             &lt;enumeration value="OtherAirlinePersonnel"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="EmployeeID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="VendorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *       &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StaffTourCodeInfo {

            @XmlAttribute(name = "StaffType")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String staffType;
            @XmlAttribute(name = "EmployeeID")
            protected String employeeID;
            @XmlAttribute(name = "VendorCode")
            protected String vendorCode;
            @XmlAttribute(name = "Description")
            protected String description;

            /**
             * Gets the value of the staffType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStaffType() {
                return staffType;
            }

            /**
             * Sets the value of the staffType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStaffType(String value) {
                this.staffType = value;
            }

            /**
             * Gets the value of the employeeID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmployeeID() {
                return employeeID;
            }

            /**
             * Sets the value of the employeeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmployeeID(String value) {
                this.employeeID = value;
            }

            /**
             * Gets the value of the vendorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVendorCode() {
                return vendorCode;
            }

            /**
             * Sets the value of the vendorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVendorCode(String value) {
                this.vendorCode = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PromotionCodeGroup"/>
         *       &lt;attribute name="TourTypeCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *       &lt;attribute name="YearNum">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *             &lt;minInclusive value="0"/>
         *             &lt;maxInclusive value="9"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="PartyID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TourCodeInfo {

            @XmlAttribute(name = "TourTypeCode")
            protected String tourTypeCode;
            @XmlAttribute(name = "YearNum")
            protected Integer yearNum;
            @XmlAttribute(name = "PartyID")
            protected String partyID;
            @XmlAttribute(name = "PromotionCode")
            protected String promotionCode;
            @XmlAttribute(name = "PromotionVendorCode")
            protected List<String> promotionVendorCode;

            /**
             * Gets the value of the tourTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTourTypeCode() {
                return tourTypeCode;
            }

            /**
             * Sets the value of the tourTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTourTypeCode(String value) {
                this.tourTypeCode = value;
            }

            /**
             * Gets the value of the yearNum property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getYearNum() {
                return yearNum;
            }

            /**
             * Sets the value of the yearNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setYearNum(Integer value) {
                this.yearNum = value;
            }

            /**
             * Gets the value of the partyID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPartyID() {
                return partyID;
            }

            /**
             * Sets the value of the partyID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPartyID(String value) {
                this.partyID = value;
            }

            /**
             * Gets the value of the promotionCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPromotionCode() {
                return promotionCode;
            }

            /**
             * Sets the value of the promotionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPromotionCode(String value) {
                this.promotionCode = value;
            }

            /**
             * Gets the value of the promotionVendorCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPromotionVendorCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getPromotionVendorCode() {
                if (promotionVendorCode == null) {
                    promotionVendorCode = new ArrayList<String>();
                }
                return this.promotionVendorCode;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNamePrefType">
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VendorPref
        extends CompanyNamePrefType
    {

        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

    }

}
