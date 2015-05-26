
package transfer.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import common.ws_2013.Pax;
import ws_2013.PriceValue;


/**
 * <p>Java class for TransferBookingResultBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferBookingResultBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalAirportId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AirportId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutomaticCancellation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditInformationDestinationCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditInformationOriginCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyCommission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DestinationComplement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginComplement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReservationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DestinationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditInformationTimeDestination" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AdditInformationTimeOrigin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InitialTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogXMLAuditId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyCurrencyCommission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalAirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AditDestinationCompanyNameInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AditOriginCompanyNameInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfChildren" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DestinationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AditionalDestinationNumberInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AditionalOriginNumberInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LuggageMaxNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaxsMaxNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Observation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoucherObservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainPax" type="{WS_2013.Common}Pax" minOccurs="0"/>
 *         &lt;element name="Paxs" type="{WS_2013.Transfer}ArrayOfPax" minOccurs="0"/>
 *         &lt;element name="Price" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="OperatorCancellationPolicies" type="{WS_2013.Transfer}ArrayOfCancellationPolicy" minOccurs="0"/>
 *         &lt;element name="ReservationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TransferTransportResult" type="{WS_2013.Transfer}TransferTransport" minOccurs="0"/>
 *         &lt;element name="ServiceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{WS_2013.Transfer}ePaymentStatus"/>
 *         &lt;element name="SystemStatus" type="{WS_2013.Transfer}eReservationStatus"/>
 *         &lt;element name="DestinationSubLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginSubLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DestinationType" type="{WS_2013.Transfer}eLocation"/>
 *         &lt;element name="OriginType" type="{WS_2013.Transfer}eLocation"/>
 *         &lt;element name="TransportType" type="{WS_2013.Transfer}eTransportType"/>
 *         &lt;element name="DestinationZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotConsist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ProviderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentType" type="{WS_2013.Transfer}ePaymentType"/>
 *         &lt;element name="CreationUserDetail" type="{WS_2013.Transfer}UserDetail" minOccurs="0"/>
 *         &lt;element name="LastUpdateUserDetail" type="{WS_2013.Transfer}UserDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferBookingResultBase", propOrder = {
    "additionalAirportId",
    "airportId",
    "bookingDescription",
    "automaticCancellation",
    "cityId",
    "additInformationDestinationCity",
    "additInformationOriginCity",
    "agencyCommission",
    "destinationComplement",
    "originComplement",
    "cancellationDate",
    "checkInDate",
    "paymentDeadline",
    "reservationDate",
    "destinationAddress",
    "originAddress",
    "additInformationTimeDestination",
    "additInformationTimeOrigin",
    "initialTime",
    "hotelId",
    "serviceId",
    "language",
    "logXMLAuditId",
    "agencyCurrencyCommission",
    "airportName",
    "additionalAirportName",
    "aditDestinationCompanyNameInformation",
    "aditOriginCompanyNameInformation",
    "cityName",
    "destinationName",
    "originName",
    "transportName",
    "numberOfAdults",
    "numberOfChildren",
    "destinationNumber",
    "aditionalDestinationNumberInfo",
    "aditionalOriginNumberInfo",
    "originNumber",
    "luggageMaxNumber",
    "paxsMaxNumber",
    "observation",
    "voucherObservation",
    "mainPax",
    "paxs",
    "price",
    "operatorCancellationPolicies",
    "reservationId",
    "transferTransportResult",
    "serviceDescription",
    "paymentStatus",
    "systemStatus",
    "destinationSubLocation",
    "originSubLocation",
    "conversionRate",
    "destinationType",
    "originType",
    "transportType",
    "destinationZipCode",
    "originZipCode",
    "doNotConsist",
    "providerId",
    "providerName",
    "providerLogo",
    "providerBookingCode",
    "paymentDate",
    "paymentType",
    "creationUserDetail",
    "lastUpdateUserDetail"
})
@XmlSeeAlso({
    TransferBookingResult.class
})
public abstract class TransferBookingResultBase {

    @XmlElement(name = "AdditionalAirportId")
    protected int additionalAirportId;
    @XmlElement(name = "AirportId")
    protected int airportId;
    @XmlElement(name = "BookingDescription")
    protected String bookingDescription;
    @XmlElement(name = "AutomaticCancellation")
    protected boolean automaticCancellation;
    @XmlElement(name = "CityId")
    protected int cityId;
    @XmlElement(name = "AdditInformationDestinationCity")
    protected String additInformationDestinationCity;
    @XmlElement(name = "AdditInformationOriginCity")
    protected String additInformationOriginCity;
    @XmlElement(name = "AgencyCommission")
    protected double agencyCommission;
    @XmlElement(name = "DestinationComplement")
    protected String destinationComplement;
    @XmlElement(name = "OriginComplement")
    protected String originComplement;
    @XmlElement(name = "CancellationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(name = "CheckInDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInDate;
    @XmlElement(name = "PaymentDeadline", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDeadline;
    @XmlElement(name = "ReservationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationDate;
    @XmlElement(name = "DestinationAddress")
    protected String destinationAddress;
    @XmlElement(name = "OriginAddress")
    protected String originAddress;
    @XmlElement(name = "AdditInformationTimeDestination", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar additInformationTimeDestination;
    @XmlElement(name = "AdditInformationTimeOrigin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar additInformationTimeOrigin;
    @XmlElement(name = "InitialTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialTime;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "ServiceId")
    protected int serviceId;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "LogXMLAuditId")
    protected String logXMLAuditId;
    @XmlElement(name = "AgencyCurrencyCommission")
    protected String agencyCurrencyCommission;
    @XmlElement(name = "AirportName")
    protected String airportName;
    @XmlElement(name = "AdditionalAirportName")
    protected String additionalAirportName;
    @XmlElement(name = "AditDestinationCompanyNameInformation")
    protected String aditDestinationCompanyNameInformation;
    @XmlElement(name = "AditOriginCompanyNameInformation")
    protected String aditOriginCompanyNameInformation;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "DestinationName")
    protected String destinationName;
    @XmlElement(name = "OriginName")
    protected String originName;
    @XmlElement(name = "TransportName")
    protected String transportName;
    @XmlElement(name = "NumberOfAdults")
    protected int numberOfAdults;
    @XmlElement(name = "NumberOfChildren")
    protected int numberOfChildren;
    @XmlElement(name = "DestinationNumber")
    protected String destinationNumber;
    @XmlElement(name = "AditionalDestinationNumberInfo")
    protected String aditionalDestinationNumberInfo;
    @XmlElement(name = "AditionalOriginNumberInfo")
    protected String aditionalOriginNumberInfo;
    @XmlElement(name = "OriginNumber")
    protected String originNumber;
    @XmlElement(name = "LuggageMaxNumber")
    protected int luggageMaxNumber;
    @XmlElement(name = "PaxsMaxNumber")
    protected int paxsMaxNumber;
    @XmlElement(name = "Observation")
    protected String observation;
    @XmlElement(name = "VoucherObservation")
    protected String voucherObservation;
    @XmlElement(name = "MainPax")
    protected Pax mainPax;
    @XmlElement(name = "Paxs")
    protected ArrayOfPax paxs;
    @XmlElement(name = "Price")
    protected PriceValue price;
    @XmlElement(name = "OperatorCancellationPolicies")
    protected ArrayOfCancellationPolicy operatorCancellationPolicies;
    @XmlElement(name = "ReservationId")
    protected int reservationId;
    @XmlElement(name = "TransferTransportResult")
    protected TransferTransport transferTransportResult;
    @XmlElement(name = "ServiceDescription")
    protected String serviceDescription;
    @XmlElement(name = "PaymentStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EPaymentStatus paymentStatus;
    @XmlElement(name = "SystemStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EReservationStatus systemStatus;
    @XmlElement(name = "DestinationSubLocation")
    protected String destinationSubLocation;
    @XmlElement(name = "OriginSubLocation")
    protected String originSubLocation;
    @XmlElement(name = "ConversionRate")
    protected double conversionRate;
    @XmlElement(name = "DestinationType", required = true)
    @XmlSchemaType(name = "string")
    protected ELocation destinationType;
    @XmlElement(name = "OriginType", required = true)
    @XmlSchemaType(name = "string")
    protected ELocation originType;
    @XmlElement(name = "TransportType", required = true)
    @XmlSchemaType(name = "string")
    protected ETransportType transportType;
    @XmlElement(name = "DestinationZipCode")
    protected String destinationZipCode;
    @XmlElement(name = "OriginZipCode")
    protected String originZipCode;
    @XmlElement(name = "DoNotConsist")
    protected boolean doNotConsist;
    @XmlElement(name = "ProviderId")
    protected int providerId;
    @XmlElement(name = "ProviderName")
    protected String providerName;
    @XmlElement(name = "ProviderLogo")
    protected String providerLogo;
    @XmlElement(name = "ProviderBookingCode")
    protected String providerBookingCode;
    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "PaymentType", required = true)
    @XmlSchemaType(name = "string")
    protected EPaymentType paymentType;
    @XmlElement(name = "CreationUserDetail")
    protected UserDetail creationUserDetail;
    @XmlElement(name = "LastUpdateUserDetail")
    protected UserDetail lastUpdateUserDetail;

    /**
     * Gets the value of the additionalAirportId property.
     * 
     */
    public int getAdditionalAirportId() {
        return additionalAirportId;
    }

    /**
     * Sets the value of the additionalAirportId property.
     * 
     */
    public void setAdditionalAirportId(int value) {
        this.additionalAirportId = value;
    }

    /**
     * Gets the value of the airportId property.
     * 
     */
    public int getAirportId() {
        return airportId;
    }

    /**
     * Sets the value of the airportId property.
     * 
     */
    public void setAirportId(int value) {
        this.airportId = value;
    }

    /**
     * Gets the value of the bookingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingDescription() {
        return bookingDescription;
    }

    /**
     * Sets the value of the bookingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDescription(String value) {
        this.bookingDescription = value;
    }

    /**
     * Gets the value of the automaticCancellation property.
     * 
     */
    public boolean isAutomaticCancellation() {
        return automaticCancellation;
    }

    /**
     * Sets the value of the automaticCancellation property.
     * 
     */
    public void setAutomaticCancellation(boolean value) {
        this.automaticCancellation = value;
    }

    /**
     * Gets the value of the cityId property.
     * 
     */
    public int getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     */
    public void setCityId(int value) {
        this.cityId = value;
    }

    /**
     * Gets the value of the additInformationDestinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditInformationDestinationCity() {
        return additInformationDestinationCity;
    }

    /**
     * Sets the value of the additInformationDestinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditInformationDestinationCity(String value) {
        this.additInformationDestinationCity = value;
    }

    /**
     * Gets the value of the additInformationOriginCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditInformationOriginCity() {
        return additInformationOriginCity;
    }

    /**
     * Sets the value of the additInformationOriginCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditInformationOriginCity(String value) {
        this.additInformationOriginCity = value;
    }

    /**
     * Gets the value of the agencyCommission property.
     * 
     */
    public double getAgencyCommission() {
        return agencyCommission;
    }

    /**
     * Sets the value of the agencyCommission property.
     * 
     */
    public void setAgencyCommission(double value) {
        this.agencyCommission = value;
    }

    /**
     * Gets the value of the destinationComplement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationComplement() {
        return destinationComplement;
    }

    /**
     * Sets the value of the destinationComplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationComplement(String value) {
        this.destinationComplement = value;
    }

    /**
     * Gets the value of the originComplement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginComplement() {
        return originComplement;
    }

    /**
     * Sets the value of the originComplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginComplement(String value) {
        this.originComplement = value;
    }

    /**
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the checkInDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the value of the checkInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckInDate(XMLGregorianCalendar value) {
        this.checkInDate = value;
    }

    /**
     * Gets the value of the paymentDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDeadline() {
        return paymentDeadline;
    }

    /**
     * Sets the value of the paymentDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDeadline(XMLGregorianCalendar value) {
        this.paymentDeadline = value;
    }

    /**
     * Gets the value of the reservationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReservationDate() {
        return reservationDate;
    }

    /**
     * Sets the value of the reservationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReservationDate(XMLGregorianCalendar value) {
        this.reservationDate = value;
    }

    /**
     * Gets the value of the destinationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Sets the value of the destinationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAddress(String value) {
        this.destinationAddress = value;
    }

    /**
     * Gets the value of the originAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAddress() {
        return originAddress;
    }

    /**
     * Sets the value of the originAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAddress(String value) {
        this.originAddress = value;
    }

    /**
     * Gets the value of the additInformationTimeDestination property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdditInformationTimeDestination() {
        return additInformationTimeDestination;
    }

    /**
     * Sets the value of the additInformationTimeDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdditInformationTimeDestination(XMLGregorianCalendar value) {
        this.additInformationTimeDestination = value;
    }

    /**
     * Gets the value of the additInformationTimeOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdditInformationTimeOrigin() {
        return additInformationTimeOrigin;
    }

    /**
     * Sets the value of the additInformationTimeOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdditInformationTimeOrigin(XMLGregorianCalendar value) {
        this.additInformationTimeOrigin = value;
    }

    /**
     * Gets the value of the initialTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialTime() {
        return initialTime;
    }

    /**
     * Sets the value of the initialTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialTime(XMLGregorianCalendar value) {
        this.initialTime = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     */
    public int getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     */
    public void setHotelId(int value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     */
    public void setServiceId(int value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the logXMLAuditId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogXMLAuditId() {
        return logXMLAuditId;
    }

    /**
     * Sets the value of the logXMLAuditId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogXMLAuditId(String value) {
        this.logXMLAuditId = value;
    }

    /**
     * Gets the value of the agencyCurrencyCommission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCurrencyCommission() {
        return agencyCurrencyCommission;
    }

    /**
     * Sets the value of the agencyCurrencyCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCurrencyCommission(String value) {
        this.agencyCurrencyCommission = value;
    }

    /**
     * Gets the value of the airportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportName() {
        return airportName;
    }

    /**
     * Sets the value of the airportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportName(String value) {
        this.airportName = value;
    }

    /**
     * Gets the value of the additionalAirportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAirportName() {
        return additionalAirportName;
    }

    /**
     * Sets the value of the additionalAirportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAirportName(String value) {
        this.additionalAirportName = value;
    }

    /**
     * Gets the value of the aditDestinationCompanyNameInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAditDestinationCompanyNameInformation() {
        return aditDestinationCompanyNameInformation;
    }

    /**
     * Sets the value of the aditDestinationCompanyNameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAditDestinationCompanyNameInformation(String value) {
        this.aditDestinationCompanyNameInformation = value;
    }

    /**
     * Gets the value of the aditOriginCompanyNameInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAditOriginCompanyNameInformation() {
        return aditOriginCompanyNameInformation;
    }

    /**
     * Sets the value of the aditOriginCompanyNameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAditOriginCompanyNameInformation(String value) {
        this.aditOriginCompanyNameInformation = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the destinationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * Sets the value of the destinationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationName(String value) {
        this.destinationName = value;
    }

    /**
     * Gets the value of the originName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginName() {
        return originName;
    }

    /**
     * Sets the value of the originName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginName(String value) {
        this.originName = value;
    }

    /**
     * Gets the value of the transportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportName() {
        return transportName;
    }

    /**
     * Sets the value of the transportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportName(String value) {
        this.transportName = value;
    }

    /**
     * Gets the value of the numberOfAdults property.
     * 
     */
    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * Sets the value of the numberOfAdults property.
     * 
     */
    public void setNumberOfAdults(int value) {
        this.numberOfAdults = value;
    }

    /**
     * Gets the value of the numberOfChildren property.
     * 
     */
    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * Sets the value of the numberOfChildren property.
     * 
     */
    public void setNumberOfChildren(int value) {
        this.numberOfChildren = value;
    }

    /**
     * Gets the value of the destinationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationNumber() {
        return destinationNumber;
    }

    /**
     * Sets the value of the destinationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationNumber(String value) {
        this.destinationNumber = value;
    }

    /**
     * Gets the value of the aditionalDestinationNumberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAditionalDestinationNumberInfo() {
        return aditionalDestinationNumberInfo;
    }

    /**
     * Sets the value of the aditionalDestinationNumberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAditionalDestinationNumberInfo(String value) {
        this.aditionalDestinationNumberInfo = value;
    }

    /**
     * Gets the value of the aditionalOriginNumberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAditionalOriginNumberInfo() {
        return aditionalOriginNumberInfo;
    }

    /**
     * Sets the value of the aditionalOriginNumberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAditionalOriginNumberInfo(String value) {
        this.aditionalOriginNumberInfo = value;
    }

    /**
     * Gets the value of the originNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginNumber() {
        return originNumber;
    }

    /**
     * Sets the value of the originNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginNumber(String value) {
        this.originNumber = value;
    }

    /**
     * Gets the value of the luggageMaxNumber property.
     * 
     */
    public int getLuggageMaxNumber() {
        return luggageMaxNumber;
    }

    /**
     * Sets the value of the luggageMaxNumber property.
     * 
     */
    public void setLuggageMaxNumber(int value) {
        this.luggageMaxNumber = value;
    }

    /**
     * Gets the value of the paxsMaxNumber property.
     * 
     */
    public int getPaxsMaxNumber() {
        return paxsMaxNumber;
    }

    /**
     * Sets the value of the paxsMaxNumber property.
     * 
     */
    public void setPaxsMaxNumber(int value) {
        this.paxsMaxNumber = value;
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservation(String value) {
        this.observation = value;
    }

    /**
     * Gets the value of the voucherObservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherObservation() {
        return voucherObservation;
    }

    /**
     * Sets the value of the voucherObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherObservation(String value) {
        this.voucherObservation = value;
    }

    /**
     * Gets the value of the mainPax property.
     * 
     * @return
     *     possible object is
     *     {@link Pax }
     *     
     */
    public Pax getMainPax() {
        return mainPax;
    }

    /**
     * Sets the value of the mainPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pax }
     *     
     */
    public void setMainPax(Pax value) {
        this.mainPax = value;
    }

    /**
     * Gets the value of the paxs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPax }
     *     
     */
    public ArrayOfPax getPaxs() {
        return paxs;
    }

    /**
     * Sets the value of the paxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPax }
     *     
     */
    public void setPaxs(ArrayOfPax value) {
        this.paxs = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPrice(PriceValue value) {
        this.price = value;
    }

    /**
     * Gets the value of the operatorCancellationPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public ArrayOfCancellationPolicy getOperatorCancellationPolicies() {
        return operatorCancellationPolicies;
    }

    /**
     * Sets the value of the operatorCancellationPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public void setOperatorCancellationPolicies(ArrayOfCancellationPolicy value) {
        this.operatorCancellationPolicies = value;
    }

    /**
     * Gets the value of the reservationId property.
     * 
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     */
    public void setReservationId(int value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the transferTransportResult property.
     * 
     * @return
     *     possible object is
     *     {@link TransferTransport }
     *     
     */
    public TransferTransport getTransferTransportResult() {
        return transferTransportResult;
    }

    /**
     * Sets the value of the transferTransportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferTransport }
     *     
     */
    public void setTransferTransportResult(TransferTransport value) {
        this.transferTransportResult = value;
    }

    /**
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EPaymentStatus }
     *     
     */
    public EPaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPaymentStatus }
     *     
     */
    public void setPaymentStatus(EPaymentStatus value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the systemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EReservationStatus }
     *     
     */
    public EReservationStatus getSystemStatus() {
        return systemStatus;
    }

    /**
     * Sets the value of the systemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EReservationStatus }
     *     
     */
    public void setSystemStatus(EReservationStatus value) {
        this.systemStatus = value;
    }

    /**
     * Gets the value of the destinationSubLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationSubLocation() {
        return destinationSubLocation;
    }

    /**
     * Sets the value of the destinationSubLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationSubLocation(String value) {
        this.destinationSubLocation = value;
    }

    /**
     * Gets the value of the originSubLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginSubLocation() {
        return originSubLocation;
    }

    /**
     * Sets the value of the originSubLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginSubLocation(String value) {
        this.originSubLocation = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     */
    public double getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     */
    public void setConversionRate(double value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the destinationType property.
     * 
     * @return
     *     possible object is
     *     {@link ELocation }
     *     
     */
    public ELocation getDestinationType() {
        return destinationType;
    }

    /**
     * Sets the value of the destinationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELocation }
     *     
     */
    public void setDestinationType(ELocation value) {
        this.destinationType = value;
    }

    /**
     * Gets the value of the originType property.
     * 
     * @return
     *     possible object is
     *     {@link ELocation }
     *     
     */
    public ELocation getOriginType() {
        return originType;
    }

    /**
     * Sets the value of the originType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELocation }
     *     
     */
    public void setOriginType(ELocation value) {
        this.originType = value;
    }

    /**
     * Gets the value of the transportType property.
     * 
     * @return
     *     possible object is
     *     {@link ETransportType }
     *     
     */
    public ETransportType getTransportType() {
        return transportType;
    }

    /**
     * Sets the value of the transportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETransportType }
     *     
     */
    public void setTransportType(ETransportType value) {
        this.transportType = value;
    }

    /**
     * Gets the value of the destinationZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationZipCode() {
        return destinationZipCode;
    }

    /**
     * Sets the value of the destinationZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationZipCode(String value) {
        this.destinationZipCode = value;
    }

    /**
     * Gets the value of the originZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginZipCode() {
        return originZipCode;
    }

    /**
     * Sets the value of the originZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginZipCode(String value) {
        this.originZipCode = value;
    }

    /**
     * Gets the value of the doNotConsist property.
     * 
     */
    public boolean isDoNotConsist() {
        return doNotConsist;
    }

    /**
     * Sets the value of the doNotConsist property.
     * 
     */
    public void setDoNotConsist(boolean value) {
        this.doNotConsist = value;
    }

    /**
     * Gets the value of the providerId property.
     * 
     */
    public int getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     */
    public void setProviderId(int value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the providerLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLogo() {
        return providerLogo;
    }

    /**
     * Sets the value of the providerLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderLogo(String value) {
        this.providerLogo = value;
    }

    /**
     * Gets the value of the providerBookingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderBookingCode() {
        return providerBookingCode;
    }

    /**
     * Sets the value of the providerBookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderBookingCode(String value) {
        this.providerBookingCode = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link EPaymentType }
     *     
     */
    public EPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPaymentType }
     *     
     */
    public void setPaymentType(EPaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the creationUserDetail property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetail }
     *     
     */
    public UserDetail getCreationUserDetail() {
        return creationUserDetail;
    }

    /**
     * Sets the value of the creationUserDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetail }
     *     
     */
    public void setCreationUserDetail(UserDetail value) {
        this.creationUserDetail = value;
    }

    /**
     * Gets the value of the lastUpdateUserDetail property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetail }
     *     
     */
    public UserDetail getLastUpdateUserDetail() {
        return lastUpdateUserDetail;
    }

    /**
     * Sets the value of the lastUpdateUserDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetail }
     *     
     */
    public void setLastUpdateUserDetail(UserDetail value) {
        this.lastUpdateUserDetail = value;
    }

}
