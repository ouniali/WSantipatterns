
package trainticket.ws_2013;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws_2013.PriceValue;


/**
 * <p>Java class for TrainBookingResultBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainBookingResultBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutomaticCancellation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FinalCityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialCityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyCommission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ArrivalDateInCountry" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReservationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureDateOfCountry" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlreadyGotPass" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LogXMLAuditId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyCurrencyCommission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfChildren" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfSeniors" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfYoungPeople" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Observation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Paxs" type="{WS_2013.TrainTicket}ArrayOfPax" minOccurs="0"/>
 *         &lt;element name="NETCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NETPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="IncludedBooking" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ForwardTrainResult" type="{WS_2013.TrainTicket}Package" minOccurs="0"/>
 *         &lt;element name="ReturnTrainResult" type="{WS_2013.TrainTicket}Package" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{WS_2013.TrainTicket}ePaymentStatus"/>
 *         &lt;element name="SystemStatus" type="{WS_2013.TrainTicket}eReservationStatus"/>
 *         &lt;element name="TotalCommunicationRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CountryEmissionRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SaleTotalValue" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="OperatorCancellationPolicies" type="{WS_2013.TrainTicket}ArrayOfCancellationPolicy" minOccurs="0"/>
 *         &lt;element name="ReservationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProviderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentType" type="{WS_2013.TrainTicket}ePaymentType"/>
 *         &lt;element name="CreationUserDetail" type="{WS_2013.TrainTicket}UserDetail" minOccurs="0"/>
 *         &lt;element name="LastUpdateUserDetail" type="{WS_2013.TrainTicket}UserDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainBookingResultBase", propOrder = {
    "bookingDescription",
    "automaticCancellation",
    "finalCityId",
    "initialCityId",
    "category",
    "agencyCommission",
    "cancellationDate",
    "arrivalDateInCountry",
    "departureDate",
    "paymentDeadline",
    "reservationDate",
    "departureDateOfCountry",
    "returnDate",
    "serviceId",
    "alreadyGotPass",
    "logXMLAuditId",
    "agencyCurrencyCommission",
    "numberOfAdults",
    "numberOfChildren",
    "numberOfSeniors",
    "numberOfYoungPeople",
    "observation",
    "paxs",
    "netCurrency",
    "netPrice",
    "includedBooking",
    "forwardTrainResult",
    "returnTrainResult",
    "paymentStatus",
    "systemStatus",
    "totalCommunicationRate",
    "conversionRate",
    "countryEmissionRate",
    "saleTotalValue",
    "operatorCancellationPolicies",
    "reservationId",
    "providerID",
    "providerName",
    "providerLogo",
    "providerBookingCode",
    "paymentDate",
    "paymentType",
    "creationUserDetail",
    "lastUpdateUserDetail"
})
@XmlSeeAlso({
    TrainBookingResult.class
})
public abstract class TrainBookingResultBase {

    @XmlElement(name = "BookingDescription")
    protected String bookingDescription;
    @XmlElement(name = "AutomaticCancellation")
    protected boolean automaticCancellation;
    @XmlElement(name = "FinalCityId")
    protected int finalCityId;
    @XmlElement(name = "InitialCityId")
    protected int initialCityId;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "AgencyCommission")
    protected double agencyCommission;
    @XmlElement(name = "CancellationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(name = "ArrivalDateInCountry", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateInCountry;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "PaymentDeadline", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDeadline;
    @XmlElement(name = "ReservationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationDate;
    @XmlElement(name = "DepartureDateOfCountry", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateOfCountry;
    @XmlElement(name = "ReturnDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDate;
    @XmlElement(name = "ServiceId")
    protected int serviceId;
    @XmlElement(name = "AlreadyGotPass")
    protected boolean alreadyGotPass;
    @XmlElement(name = "LogXMLAuditId")
    protected String logXMLAuditId;
    @XmlElement(name = "AgencyCurrencyCommission")
    protected String agencyCurrencyCommission;
    @XmlElement(name = "NumberOfAdults")
    protected int numberOfAdults;
    @XmlElement(name = "NumberOfChildren")
    protected int numberOfChildren;
    @XmlElement(name = "NumberOfSeniors")
    protected int numberOfSeniors;
    @XmlElement(name = "NumberOfYoungPeople")
    protected int numberOfYoungPeople;
    @XmlElement(name = "Observation")
    protected String observation;
    @XmlElement(name = "Paxs")
    protected ArrayOfPax paxs;
    @XmlElement(name = "NETCurrency")
    protected String netCurrency;
    @XmlElement(name = "NETPrice")
    protected double netPrice;
    @XmlElement(name = "IncludedBooking")
    protected double includedBooking;
    @XmlElement(name = "ForwardTrainResult")
    protected Package forwardTrainResult;
    @XmlElement(name = "ReturnTrainResult")
    protected Package returnTrainResult;
    @XmlElement(name = "PaymentStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EPaymentStatus paymentStatus;
    @XmlElement(name = "SystemStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EReservationStatus systemStatus;
    @XmlElement(name = "TotalCommunicationRate")
    protected double totalCommunicationRate;
    @XmlElement(name = "ConversionRate")
    protected double conversionRate;
    @XmlElement(name = "CountryEmissionRate", required = true)
    protected BigDecimal countryEmissionRate;
    @XmlElement(name = "SaleTotalValue")
    protected PriceValue saleTotalValue;
    @XmlElement(name = "OperatorCancellationPolicies")
    protected ArrayOfCancellationPolicy operatorCancellationPolicies;
    @XmlElement(name = "ReservationId")
    protected int reservationId;
    @XmlElement(name = "ProviderID")
    protected int providerID;
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
     * Gets the value of the finalCityId property.
     * 
     */
    public int getFinalCityId() {
        return finalCityId;
    }

    /**
     * Sets the value of the finalCityId property.
     * 
     */
    public void setFinalCityId(int value) {
        this.finalCityId = value;
    }

    /**
     * Gets the value of the initialCityId property.
     * 
     */
    public int getInitialCityId() {
        return initialCityId;
    }

    /**
     * Sets the value of the initialCityId property.
     * 
     */
    public void setInitialCityId(int value) {
        this.initialCityId = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
     * Gets the value of the arrivalDateInCountry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateInCountry() {
        return arrivalDateInCountry;
    }

    /**
     * Sets the value of the arrivalDateInCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateInCountry(XMLGregorianCalendar value) {
        this.arrivalDateInCountry = value;
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
     * Gets the value of the departureDateOfCountry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateOfCountry() {
        return departureDateOfCountry;
    }

    /**
     * Sets the value of the departureDateOfCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateOfCountry(XMLGregorianCalendar value) {
        this.departureDateOfCountry = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDate(XMLGregorianCalendar value) {
        this.returnDate = value;
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
     * Gets the value of the alreadyGotPass property.
     * 
     */
    public boolean isAlreadyGotPass() {
        return alreadyGotPass;
    }

    /**
     * Sets the value of the alreadyGotPass property.
     * 
     */
    public void setAlreadyGotPass(boolean value) {
        this.alreadyGotPass = value;
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
     * Gets the value of the numberOfSeniors property.
     * 
     */
    public int getNumberOfSeniors() {
        return numberOfSeniors;
    }

    /**
     * Sets the value of the numberOfSeniors property.
     * 
     */
    public void setNumberOfSeniors(int value) {
        this.numberOfSeniors = value;
    }

    /**
     * Gets the value of the numberOfYoungPeople property.
     * 
     */
    public int getNumberOfYoungPeople() {
        return numberOfYoungPeople;
    }

    /**
     * Sets the value of the numberOfYoungPeople property.
     * 
     */
    public void setNumberOfYoungPeople(int value) {
        this.numberOfYoungPeople = value;
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
     * Gets the value of the netCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNETCurrency() {
        return netCurrency;
    }

    /**
     * Sets the value of the netCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNETCurrency(String value) {
        this.netCurrency = value;
    }

    /**
     * Gets the value of the netPrice property.
     * 
     */
    public double getNETPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     * 
     */
    public void setNETPrice(double value) {
        this.netPrice = value;
    }

    /**
     * Gets the value of the includedBooking property.
     * 
     */
    public double getIncludedBooking() {
        return includedBooking;
    }

    /**
     * Sets the value of the includedBooking property.
     * 
     */
    public void setIncludedBooking(double value) {
        this.includedBooking = value;
    }

    /**
     * Gets the value of the forwardTrainResult property.
     * 
     * @return
     *     possible object is
     *     {@link Package }
     *     
     */
    public Package getForwardTrainResult() {
        return forwardTrainResult;
    }

    /**
     * Sets the value of the forwardTrainResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Package }
     *     
     */
    public void setForwardTrainResult(Package value) {
        this.forwardTrainResult = value;
    }

    /**
     * Gets the value of the returnTrainResult property.
     * 
     * @return
     *     possible object is
     *     {@link Package }
     *     
     */
    public Package getReturnTrainResult() {
        return returnTrainResult;
    }

    /**
     * Sets the value of the returnTrainResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Package }
     *     
     */
    public void setReturnTrainResult(Package value) {
        this.returnTrainResult = value;
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
     * Gets the value of the totalCommunicationRate property.
     * 
     */
    public double getTotalCommunicationRate() {
        return totalCommunicationRate;
    }

    /**
     * Sets the value of the totalCommunicationRate property.
     * 
     */
    public void setTotalCommunicationRate(double value) {
        this.totalCommunicationRate = value;
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
     * Gets the value of the countryEmissionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountryEmissionRate() {
        return countryEmissionRate;
    }

    /**
     * Sets the value of the countryEmissionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountryEmissionRate(BigDecimal value) {
        this.countryEmissionRate = value;
    }

    /**
     * Gets the value of the saleTotalValue property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getSaleTotalValue() {
        return saleTotalValue;
    }

    /**
     * Sets the value of the saleTotalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setSaleTotalValue(PriceValue value) {
        this.saleTotalValue = value;
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
     * Gets the value of the providerID property.
     * 
     */
    public int getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     */
    public void setProviderID(int value) {
        this.providerID = value;
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
