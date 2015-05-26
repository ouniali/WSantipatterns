
package insurance.ws_2013.cangooroo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import insurance.ws_2013.InsuranceResult;
import ws_2013.PriceValue;


/**
 * <p>Java class for InsuranceBookingResultBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceBookingResultBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutomaticCancellation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgencyCommission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="VoucherAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LogXMLAuditId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyCurrencyCommission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfChildren" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Observation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Paxs" type="{Cangooroo.WS_2013.Insurance}ArrayOfPax" minOccurs="0"/>
 *         &lt;element name="PriceValue" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="InsuranceResult" type="{WS_2013.Insurance}InsuranceResult" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{Cangooroo.WS_2013.Insurance}ePaymentStatus"/>
 *         &lt;element name="SystemStatus" type="{Cangooroo.WS_2013.Insurance}eReservationStatus"/>
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ReservationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OperatorCancellationPolicies" type="{Cangooroo.WS_2013.Insurance}ArrayOfCancellationPolicy" minOccurs="0"/>
 *         &lt;element name="ReservationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProviderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentType" type="{Cangooroo.WS_2013.Insurance}ePaymentType"/>
 *         &lt;element name="CreationUserDetail" type="{Cangooroo.WS_2013.Insurance}UserDetail" minOccurs="0"/>
 *         &lt;element name="LastUpdateUserDetail" type="{Cangooroo.WS_2013.Insurance}UserDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceBookingResultBase", propOrder = {
    "bookingDescription",
    "automaticCancellation",
    "cityId",
    "agencyCommission",
    "cancellationDate",
    "paymentDeadline",
    "serviceDate",
    "voucherAddress",
    "serviceId",
    "logXMLAuditId",
    "agencyCurrencyCommission",
    "name",
    "numberOfAdults",
    "numberOfChildren",
    "numberOfDays",
    "observation",
    "paxs",
    "priceValue",
    "insuranceResult",
    "paymentStatus",
    "systemStatus",
    "conversionRate",
    "reservationDate",
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
    InsuranceBookingResult.class
})
public abstract class InsuranceBookingResultBase {

    @XmlElement(name = "BookingDescription")
    protected String bookingDescription;
    @XmlElement(name = "AutomaticCancellation")
    protected boolean automaticCancellation;
    @XmlElement(name = "CityId")
    protected int cityId;
    @XmlElement(name = "AgencyCommission")
    protected double agencyCommission;
    @XmlElement(name = "CancellationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(name = "PaymentDeadline", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDeadline;
    @XmlElement(name = "ServiceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceDate;
    @XmlElement(name = "VoucherAddress")
    protected String voucherAddress;
    @XmlElement(name = "ServiceId")
    protected int serviceId;
    @XmlElement(name = "LogXMLAuditId")
    protected String logXMLAuditId;
    @XmlElement(name = "AgencyCurrencyCommission")
    protected String agencyCurrencyCommission;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NumberOfAdults")
    protected int numberOfAdults;
    @XmlElement(name = "NumberOfChildren")
    protected int numberOfChildren;
    @XmlElement(name = "NumberOfDays")
    protected int numberOfDays;
    @XmlElement(name = "Observation")
    protected String observation;
    @XmlElement(name = "Paxs")
    protected ArrayOfPax paxs;
    @XmlElement(name = "PriceValue")
    protected PriceValue priceValue;
    @XmlElement(name = "InsuranceResult")
    protected InsuranceResult insuranceResult;
    @XmlElement(name = "PaymentStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EPaymentStatus paymentStatus;
    @XmlElement(name = "SystemStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EReservationStatus systemStatus;
    @XmlElement(name = "ConversionRate")
    protected double conversionRate;
    @XmlElement(name = "ReservationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationDate;
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
     * Gets the value of the voucherAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherAddress() {
        return voucherAddress;
    }

    /**
     * Sets the value of the voucherAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherAddress(String value) {
        this.voucherAddress = value;
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
     * Gets the value of the insuranceResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceResult }
     *     
     */
    public InsuranceResult getInsuranceResult() {
        return insuranceResult;
    }

    /**
     * Sets the value of the insuranceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceResult }
     *     
     */
    public void setInsuranceResult(InsuranceResult value) {
        this.insuranceResult = value;
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
