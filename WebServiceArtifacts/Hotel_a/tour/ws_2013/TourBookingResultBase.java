
package tour.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws_2013.PriceValue;


/**
 * <p>Java class for TourBookingResultBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourBookingResultBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutomaticCancellation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgencyCommission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CheckOutDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReservationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TourDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DurationInHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AvailableLanguages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImportantInformations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogXMLAuditId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FurtherInformations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyCurrencyCommission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TourName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfChildren" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Observation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TourObservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoucherObservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Paxs" type="{WS_2013.Tour}ArrayOfPax" minOccurs="0"/>
 *         &lt;element name="PriceValue" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="OperatorCancellationPolicies" type="{WS_2013.Tour}ArrayOfCancellationPolicy" minOccurs="0"/>
 *         &lt;element name="ReservationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TourResult" type="{WS_2013.Tour}TourItem" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{WS_2013.Tour}ePaymentStatus"/>
 *         &lt;element name="SystemStatus" type="{WS_2013.Tour}eReservationStatus"/>
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentType" type="{WS_2013.Tour}ePaymentType"/>
 *         &lt;element name="CreationUserDetail" type="{WS_2013.Tour}UserDetail" minOccurs="0"/>
 *         &lt;element name="LastUpdateUserDetail" type="{WS_2013.Tour}UserDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourBookingResultBase", propOrder = {
    "bookingDescription",
    "automaticCancellation",
    "activityCategory",
    "cityId",
    "agencyCommission",
    "cancellationDate",
    "checkInDate",
    "checkOutDate",
    "paymentDeadline",
    "reservationDate",
    "serviceDate",
    "departureCode",
    "departureDate",
    "tourDescription",
    "durationInHours",
    "serviceId",
    "availableLanguages",
    "importantInformations",
    "logXMLAuditId",
    "furtherInformations",
    "agencyCurrencyCommission",
    "tourName",
    "numberOfAdults",
    "numberOfChildren",
    "observation",
    "tourObservation",
    "voucherObservation",
    "specialOffer",
    "paxs",
    "priceValue",
    "operatorCancellationPolicies",
    "reservationId",
    "tourResult",
    "paymentStatus",
    "systemStatus",
    "conversionRate",
    "activityType",
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
    TourBookingResult.class
})
public abstract class TourBookingResultBase {

    @XmlElement(name = "BookingDescription")
    protected String bookingDescription;
    @XmlElement(name = "AutomaticCancellation")
    protected String automaticCancellation;
    @XmlElement(name = "ActivityCategory")
    protected String activityCategory;
    @XmlElement(name = "CityId")
    protected int cityId;
    @XmlElement(name = "AgencyCommission")
    protected double agencyCommission;
    @XmlElement(name = "CancellationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(name = "CheckInDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInDate;
    @XmlElement(name = "CheckOutDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkOutDate;
    @XmlElement(name = "PaymentDeadline", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDeadline;
    @XmlElement(name = "ReservationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationDate;
    @XmlElement(name = "ServiceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceDate;
    @XmlElement(name = "DepartureCode")
    protected String departureCode;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "TourDescription")
    protected String tourDescription;
    @XmlElement(name = "DurationInHours")
    protected String durationInHours;
    @XmlElement(name = "ServiceId")
    protected int serviceId;
    @XmlElement(name = "AvailableLanguages")
    protected String availableLanguages;
    @XmlElement(name = "ImportantInformations")
    protected String importantInformations;
    @XmlElement(name = "LogXMLAuditId")
    protected String logXMLAuditId;
    @XmlElement(name = "FurtherInformations")
    protected String furtherInformations;
    @XmlElement(name = "AgencyCurrencyCommission")
    protected String agencyCurrencyCommission;
    @XmlElement(name = "TourName")
    protected String tourName;
    @XmlElement(name = "NumberOfAdults")
    protected int numberOfAdults;
    @XmlElement(name = "NumberOfChildren")
    protected int numberOfChildren;
    @XmlElement(name = "Observation")
    protected String observation;
    @XmlElement(name = "TourObservation")
    protected String tourObservation;
    @XmlElement(name = "VoucherObservation")
    protected String voucherObservation;
    @XmlElement(name = "SpecialOffer")
    protected boolean specialOffer;
    @XmlElement(name = "Paxs")
    protected ArrayOfPax paxs;
    @XmlElement(name = "PriceValue")
    protected PriceValue priceValue;
    @XmlElement(name = "OperatorCancellationPolicies")
    protected ArrayOfCancellationPolicy operatorCancellationPolicies;
    @XmlElement(name = "ReservationId")
    protected int reservationId;
    @XmlElement(name = "TourResult")
    protected TourItem tourResult;
    @XmlElement(name = "PaymentStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EPaymentStatus paymentStatus;
    @XmlElement(name = "SystemStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EReservationStatus systemStatus;
    @XmlElement(name = "ConversionRate")
    protected String conversionRate;
    @XmlElement(name = "ActivityType")
    protected String activityType;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticCancellation() {
        return automaticCancellation;
    }

    /**
     * Sets the value of the automaticCancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticCancellation(String value) {
        this.automaticCancellation = value;
    }

    /**
     * Gets the value of the activityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCategory() {
        return activityCategory;
    }

    /**
     * Sets the value of the activityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCategory(String value) {
        this.activityCategory = value;
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
     * Gets the value of the checkOutDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * Sets the value of the checkOutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOutDate(XMLGregorianCalendar value) {
        this.checkOutDate = value;
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
     * Gets the value of the departureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCode() {
        return departureCode;
    }

    /**
     * Sets the value of the departureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCode(String value) {
        this.departureCode = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the tourDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourDescription() {
        return tourDescription;
    }

    /**
     * Sets the value of the tourDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourDescription(String value) {
        this.tourDescription = value;
    }

    /**
     * Gets the value of the durationInHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationInHours() {
        return durationInHours;
    }

    /**
     * Sets the value of the durationInHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationInHours(String value) {
        this.durationInHours = value;
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
     * Gets the value of the availableLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableLanguages() {
        return availableLanguages;
    }

    /**
     * Sets the value of the availableLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableLanguages(String value) {
        this.availableLanguages = value;
    }

    /**
     * Gets the value of the importantInformations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportantInformations() {
        return importantInformations;
    }

    /**
     * Sets the value of the importantInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportantInformations(String value) {
        this.importantInformations = value;
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
     * Gets the value of the furtherInformations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurtherInformations() {
        return furtherInformations;
    }

    /**
     * Sets the value of the furtherInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurtherInformations(String value) {
        this.furtherInformations = value;
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
     * Gets the value of the tourName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourName() {
        return tourName;
    }

    /**
     * Sets the value of the tourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourName(String value) {
        this.tourName = value;
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
     * Gets the value of the tourObservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourObservation() {
        return tourObservation;
    }

    /**
     * Sets the value of the tourObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourObservation(String value) {
        this.tourObservation = value;
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
     * Gets the value of the specialOffer property.
     * 
     */
    public boolean isSpecialOffer() {
        return specialOffer;
    }

    /**
     * Sets the value of the specialOffer property.
     * 
     */
    public void setSpecialOffer(boolean value) {
        this.specialOffer = value;
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
     * Gets the value of the tourResult property.
     * 
     * @return
     *     possible object is
     *     {@link TourItem }
     *     
     */
    public TourItem getTourResult() {
        return tourResult;
    }

    /**
     * Sets the value of the tourResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourItem }
     *     
     */
    public void setTourResult(TourItem value) {
        this.tourResult = value;
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
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionRate(String value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityType(String value) {
        this.activityType = value;
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
