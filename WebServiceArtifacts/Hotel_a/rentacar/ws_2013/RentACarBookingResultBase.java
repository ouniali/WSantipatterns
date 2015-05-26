
package rentacar.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws_2013.PriceValue;


/**
 * <p>Java class for RentACarBookingResultBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RentACarBookingResultBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutomaticCancellation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CarModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InitialCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginCity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DropOffCityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProviderBookingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyComission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CancelationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FinalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReservationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Equipments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LogXMLAuditId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyCurrencyCommission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceValue" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="DriverNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfChildren" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FidelityNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Observation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Paxs" type="{WS_2013.RentACar}ArrayOfPax" minOccurs="0"/>
 *         &lt;element name="CancellationPolicyList" type="{WS_2013.RentACar}ArrayOfCancellationPolicy" minOccurs="0"/>
 *         &lt;element name="ReservationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CarResult" type="{WS_2013.RentACar}CarResult" minOccurs="0"/>
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FidelityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatorCancellationPolicies" type="{WS_2013.RentACar}ArrayOfCancellationPolicy" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{WS_2013.RentACar}ePaymentStatus"/>
 *         &lt;element name="SystemStatus" type="{WS_2013.RentACar}eReservationStatus"/>
 *         &lt;element name="ProviderLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentType" type="{WS_2013.RentACar}ePaymentType"/>
 *         &lt;element name="CreationUserDetail" type="{WS_2013.RentACar}UserDetail" minOccurs="0"/>
 *         &lt;element name="LastUpdateUserDetail" type="{WS_2013.RentACar}UserDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentACarBookingResultBase", propOrder = {
    "bookingDescription",
    "automaticCancellation",
    "carModel",
    "carType",
    "finalCity",
    "initialCity",
    "originCity",
    "dropOffCityId",
    "providerBookingId",
    "flightCode",
    "agencyComission",
    "cancelationDate",
    "finalDate",
    "paymentDeadline",
    "reservationDate",
    "serviceDate",
    "equipments",
    "providerId",
    "serviceId",
    "logXMLAuditId",
    "agencyCurrencyCommission",
    "priceValue",
    "driverNationality",
    "numberOfAdults",
    "numberOfChildren",
    "numberOfDays",
    "fidelityNumber",
    "flightNumber",
    "observation",
    "paxs",
    "cancellationPolicyList",
    "reservationId",
    "carResult",
    "conversionRate",
    "fidelityType",
    "providerName",
    "operatorCancellationPolicies",
    "paymentStatus",
    "systemStatus",
    "providerLogo",
    "providerBookingCode",
    "paymentDate",
    "paymentType",
    "creationUserDetail",
    "lastUpdateUserDetail"
})
@XmlSeeAlso({
    RentACarBookingResult.class
})
public abstract class RentACarBookingResultBase {

    @XmlElement(name = "BookingDescription")
    protected String bookingDescription;
    @XmlElement(name = "AutomaticCancellation")
    protected boolean automaticCancellation;
    @XmlElement(name = "CarModel")
    protected String carModel;
    @XmlElement(name = "CarType")
    protected String carType;
    @XmlElement(name = "FinalCity")
    protected String finalCity;
    @XmlElement(name = "InitialCity")
    protected String initialCity;
    @XmlElement(name = "OriginCity")
    protected int originCity;
    @XmlElement(name = "DropOffCityId")
    protected int dropOffCityId;
    @XmlElement(name = "ProviderBookingId")
    protected String providerBookingId;
    @XmlElement(name = "FlightCode")
    protected String flightCode;
    @XmlElement(name = "AgencyComission")
    protected double agencyComission;
    @XmlElement(name = "CancelationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelationDate;
    @XmlElement(name = "FinalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finalDate;
    @XmlElement(name = "PaymentDeadline", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDeadline;
    @XmlElement(name = "ReservationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationDate;
    @XmlElement(name = "ServiceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceDate;
    @XmlElement(name = "Equipments")
    protected String equipments;
    @XmlElement(name = "ProviderId")
    protected int providerId;
    @XmlElement(name = "ServiceId")
    protected int serviceId;
    @XmlElement(name = "LogXMLAuditId")
    protected String logXMLAuditId;
    @XmlElement(name = "AgencyCurrencyCommission")
    protected String agencyCurrencyCommission;
    @XmlElement(name = "PriceValue")
    protected PriceValue priceValue;
    @XmlElement(name = "DriverNationality")
    protected String driverNationality;
    @XmlElement(name = "NumberOfAdults")
    protected int numberOfAdults;
    @XmlElement(name = "NumberOfChildren")
    protected int numberOfChildren;
    @XmlElement(name = "NumberOfDays")
    protected int numberOfDays;
    @XmlElement(name = "FidelityNumber")
    protected int fidelityNumber;
    @XmlElement(name = "FlightNumber")
    protected int flightNumber;
    @XmlElement(name = "Observation")
    protected String observation;
    @XmlElement(name = "Paxs")
    protected ArrayOfPax paxs;
    @XmlElement(name = "CancellationPolicyList")
    protected ArrayOfCancellationPolicy cancellationPolicyList;
    @XmlElement(name = "ReservationId")
    protected int reservationId;
    @XmlElement(name = "CarResult")
    protected CarResult carResult;
    @XmlElement(name = "ConversionRate")
    protected double conversionRate;
    @XmlElement(name = "FidelityType")
    protected String fidelityType;
    @XmlElement(name = "ProviderName")
    protected String providerName;
    @XmlElement(name = "OperatorCancellationPolicies")
    protected ArrayOfCancellationPolicy operatorCancellationPolicies;
    @XmlElement(name = "PaymentStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EPaymentStatus paymentStatus;
    @XmlElement(name = "SystemStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EReservationStatus systemStatus;
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
     * Gets the value of the carModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * Sets the value of the carModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarModel(String value) {
        this.carModel = value;
    }

    /**
     * Gets the value of the carType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarType() {
        return carType;
    }

    /**
     * Sets the value of the carType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarType(String value) {
        this.carType = value;
    }

    /**
     * Gets the value of the finalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalCity() {
        return finalCity;
    }

    /**
     * Sets the value of the finalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalCity(String value) {
        this.finalCity = value;
    }

    /**
     * Gets the value of the initialCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialCity() {
        return initialCity;
    }

    /**
     * Sets the value of the initialCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialCity(String value) {
        this.initialCity = value;
    }

    /**
     * Gets the value of the originCity property.
     * 
     */
    public int getOriginCity() {
        return originCity;
    }

    /**
     * Sets the value of the originCity property.
     * 
     */
    public void setOriginCity(int value) {
        this.originCity = value;
    }

    /**
     * Gets the value of the dropOffCityId property.
     * 
     */
    public int getDropOffCityId() {
        return dropOffCityId;
    }

    /**
     * Sets the value of the dropOffCityId property.
     * 
     */
    public void setDropOffCityId(int value) {
        this.dropOffCityId = value;
    }

    /**
     * Gets the value of the providerBookingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderBookingId() {
        return providerBookingId;
    }

    /**
     * Sets the value of the providerBookingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderBookingId(String value) {
        this.providerBookingId = value;
    }

    /**
     * Gets the value of the flightCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightCode() {
        return flightCode;
    }

    /**
     * Sets the value of the flightCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightCode(String value) {
        this.flightCode = value;
    }

    /**
     * Gets the value of the agencyComission property.
     * 
     */
    public double getAgencyComission() {
        return agencyComission;
    }

    /**
     * Sets the value of the agencyComission property.
     * 
     */
    public void setAgencyComission(double value) {
        this.agencyComission = value;
    }

    /**
     * Gets the value of the cancelationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelationDate() {
        return cancelationDate;
    }

    /**
     * Sets the value of the cancelationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelationDate(XMLGregorianCalendar value) {
        this.cancelationDate = value;
    }

    /**
     * Gets the value of the finalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalDate() {
        return finalDate;
    }

    /**
     * Sets the value of the finalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalDate(XMLGregorianCalendar value) {
        this.finalDate = value;
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
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceDate(XMLGregorianCalendar value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the equipments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipments() {
        return equipments;
    }

    /**
     * Sets the value of the equipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipments(String value) {
        this.equipments = value;
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
     * Gets the value of the priceValue property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPriceValue() {
        return priceValue;
    }

    /**
     * Sets the value of the priceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPriceValue(PriceValue value) {
        this.priceValue = value;
    }

    /**
     * Gets the value of the driverNationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverNationality() {
        return driverNationality;
    }

    /**
     * Sets the value of the driverNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverNationality(String value) {
        this.driverNationality = value;
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
     * Gets the value of the numberOfDays property.
     * 
     */
    public int getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the value of the numberOfDays property.
     * 
     */
    public void setNumberOfDays(int value) {
        this.numberOfDays = value;
    }

    /**
     * Gets the value of the fidelityNumber property.
     * 
     */
    public int getFidelityNumber() {
        return fidelityNumber;
    }

    /**
     * Sets the value of the fidelityNumber property.
     * 
     */
    public void setFidelityNumber(int value) {
        this.fidelityNumber = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     */
    public int getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     */
    public void setFlightNumber(int value) {
        this.flightNumber = value;
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
     * Gets the value of the cancellationPolicyList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public ArrayOfCancellationPolicy getCancellationPolicyList() {
        return cancellationPolicyList;
    }

    /**
     * Sets the value of the cancellationPolicyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public void setCancellationPolicyList(ArrayOfCancellationPolicy value) {
        this.cancellationPolicyList = value;
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
     * Gets the value of the carResult property.
     * 
     * @return
     *     possible object is
     *     {@link CarResult }
     *     
     */
    public CarResult getCarResult() {
        return carResult;
    }

    /**
     * Sets the value of the carResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarResult }
     *     
     */
    public void setCarResult(CarResult value) {
        this.carResult = value;
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
     * Gets the value of the fidelityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidelityType() {
        return fidelityType;
    }

    /**
     * Sets the value of the fidelityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidelityType(String value) {
        this.fidelityType = value;
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
