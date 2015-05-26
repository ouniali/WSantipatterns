
package travelpackage.ws_2013;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws_2013.PriceValue;


/**
 * <p>Java class for TravelPackageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelPackageResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NamePackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceFrom" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="DepartureCitiesId" type="{WS_2013.TravelPackage}ArrayOfDepartureCities" minOccurs="0"/>
 *         &lt;element name="URLThumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServicesInclude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServicesNotIncluded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeMaxCHD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Categories" type="{WS_2013.TravelPackage}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="DayByDays" type="{WS_2013.TravelPackage}ArrayOfDayByDay" minOccurs="0"/>
 *         &lt;element name="Pictures" type="{WS_2013.TravelPackage}ArrayOfPictures" minOccurs="0"/>
 *         &lt;element name="Tax" type="{WS_2013.TravelPackage}ArrayOfTax" minOccurs="0"/>
 *         &lt;element name="PercentageRuleReservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuleQuantityDaysBeforeCheckIn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReservationInformation" type="{WS_2013.TravelPackage}ReservationInfo" minOccurs="0"/>
 *         &lt;element name="Recommended" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsOnrequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Mode" type="{WS_2013.TravelPackage}eModeTravelPackage"/>
 *         &lt;element name="IncludeAir" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeHotel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeCar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeTour" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeTicket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeCruise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Politics" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BeginExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PercentTaxAdm" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OriginalValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NumberDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberNights" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InstallmentPrice" type="{WS_2013}PriceValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelPackageResult", propOrder = {
    "packageId",
    "namePackage",
    "supplierId",
    "supplierName",
    "priceFrom",
    "departureCitiesId",
    "urlThumb",
    "servicesInclude",
    "servicesNotIncluded",
    "ageMaxCHD",
    "categories",
    "dayByDays",
    "pictures",
    "tax",
    "percentageRuleReservation",
    "ruleQuantityDaysBeforeCheckIn",
    "reservationInformation",
    "recommended",
    "isOnrequest",
    "mode",
    "includeAir",
    "includeHotel",
    "includeCar",
    "includeTransfer",
    "includeTour",
    "includeTicket",
    "includeCruise",
    "description",
    "observation",
    "politics",
    "cityId",
    "beginExpirationDate",
    "endExpirationDate",
    "percentTaxAdm",
    "originalValue",
    "numberDays",
    "numberNights",
    "installmentPrice"
})
public class TravelPackageResult {

    @XmlElement(name = "PackageId")
    protected int packageId;
    @XmlElement(name = "NamePackage")
    protected String namePackage;
    @XmlElement(name = "SupplierId")
    protected int supplierId;
    @XmlElement(name = "SupplierName")
    protected String supplierName;
    @XmlElement(name = "PriceFrom")
    protected PriceValue priceFrom;
    @XmlElement(name = "DepartureCitiesId")
    protected ArrayOfDepartureCities departureCitiesId;
    @XmlElement(name = "URLThumb")
    protected String urlThumb;
    @XmlElement(name = "ServicesInclude")
    protected String servicesInclude;
    @XmlElement(name = "ServicesNotIncluded")
    protected String servicesNotIncluded;
    @XmlElement(name = "AgeMaxCHD")
    protected int ageMaxCHD;
    @XmlElement(name = "Categories")
    protected ArrayOfString categories;
    @XmlElement(name = "DayByDays")
    protected ArrayOfDayByDay dayByDays;
    @XmlElement(name = "Pictures")
    protected ArrayOfPictures pictures;
    @XmlElement(name = "Tax")
    protected ArrayOfTax tax;
    @XmlElement(name = "PercentageRuleReservation")
    protected String percentageRuleReservation;
    @XmlElement(name = "RuleQuantityDaysBeforeCheckIn")
    protected int ruleQuantityDaysBeforeCheckIn;
    @XmlElement(name = "ReservationInformation")
    protected ReservationInfo reservationInformation;
    @XmlElement(name = "Recommended")
    protected boolean recommended;
    @XmlElement(name = "IsOnrequest")
    protected boolean isOnrequest;
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected EModeTravelPackage mode;
    @XmlElement(name = "IncludeAir", required = true, type = Boolean.class, nillable = true)
    protected Boolean includeAir;
    @XmlElement(name = "IncludeHotel", required = true, type = Boolean.class, nillable = true)
    protected Boolean includeHotel;
    @XmlElement(name = "IncludeCar", required = true, type = Boolean.class, nillable = true)
    protected Boolean includeCar;
    @XmlElement(name = "IncludeTransfer", required = true, type = Boolean.class, nillable = true)
    protected Boolean includeTransfer;
    @XmlElement(name = "IncludeTour", required = true, type = Boolean.class, nillable = true)
    protected Boolean includeTour;
    @XmlElement(name = "IncludeTicket", required = true, type = Boolean.class, nillable = true)
    protected Boolean includeTicket;
    @XmlElement(name = "IncludeCruise", required = true, type = Boolean.class, nillable = true)
    protected Boolean includeCruise;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Observation")
    protected String observation;
    @XmlElement(name = "Politics")
    protected String politics;
    @XmlElement(name = "CityId", required = true, type = Integer.class, nillable = true)
    protected Integer cityId;
    @XmlElement(name = "BeginExpirationDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginExpirationDate;
    @XmlElement(name = "EndExpirationDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endExpirationDate;
    @XmlElement(name = "PercentTaxAdm", required = true, nillable = true)
    protected BigDecimal percentTaxAdm;
    @XmlElement(name = "OriginalValue", required = true, nillable = true)
    protected BigDecimal originalValue;
    @XmlElement(name = "NumberDays", required = true, type = Integer.class, nillable = true)
    protected Integer numberDays;
    @XmlElement(name = "NumberNights", required = true, type = Integer.class, nillable = true)
    protected Integer numberNights;
    @XmlElement(name = "InstallmentPrice")
    protected PriceValue installmentPrice;

    /**
     * Gets the value of the packageId property.
     * 
     */
    public int getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     */
    public void setPackageId(int value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the namePackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePackage() {
        return namePackage;
    }

    /**
     * Sets the value of the namePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePackage(String value) {
        this.namePackage = value;
    }

    /**
     * Gets the value of the supplierId property.
     * 
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     */
    public void setSupplierId(int value) {
        this.supplierId = value;
    }

    /**
     * Gets the value of the supplierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the value of the supplierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

    /**
     * Gets the value of the priceFrom property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPriceFrom() {
        return priceFrom;
    }

    /**
     * Sets the value of the priceFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPriceFrom(PriceValue value) {
        this.priceFrom = value;
    }

    /**
     * Gets the value of the departureCitiesId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDepartureCities }
     *     
     */
    public ArrayOfDepartureCities getDepartureCitiesId() {
        return departureCitiesId;
    }

    /**
     * Sets the value of the departureCitiesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDepartureCities }
     *     
     */
    public void setDepartureCitiesId(ArrayOfDepartureCities value) {
        this.departureCitiesId = value;
    }

    /**
     * Gets the value of the urlThumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLThumb() {
        return urlThumb;
    }

    /**
     * Sets the value of the urlThumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLThumb(String value) {
        this.urlThumb = value;
    }

    /**
     * Gets the value of the servicesInclude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicesInclude() {
        return servicesInclude;
    }

    /**
     * Sets the value of the servicesInclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicesInclude(String value) {
        this.servicesInclude = value;
    }

    /**
     * Gets the value of the servicesNotIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicesNotIncluded() {
        return servicesNotIncluded;
    }

    /**
     * Sets the value of the servicesNotIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicesNotIncluded(String value) {
        this.servicesNotIncluded = value;
    }

    /**
     * Gets the value of the ageMaxCHD property.
     * 
     */
    public int getAgeMaxCHD() {
        return ageMaxCHD;
    }

    /**
     * Sets the value of the ageMaxCHD property.
     * 
     */
    public void setAgeMaxCHD(int value) {
        this.ageMaxCHD = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCategories(ArrayOfString value) {
        this.categories = value;
    }

    /**
     * Gets the value of the dayByDays property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDayByDay }
     *     
     */
    public ArrayOfDayByDay getDayByDays() {
        return dayByDays;
    }

    /**
     * Sets the value of the dayByDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDayByDay }
     *     
     */
    public void setDayByDays(ArrayOfDayByDay value) {
        this.dayByDays = value;
    }

    /**
     * Gets the value of the pictures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPictures }
     *     
     */
    public ArrayOfPictures getPictures() {
        return pictures;
    }

    /**
     * Sets the value of the pictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPictures }
     *     
     */
    public void setPictures(ArrayOfPictures value) {
        this.pictures = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTax }
     *     
     */
    public ArrayOfTax getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTax }
     *     
     */
    public void setTax(ArrayOfTax value) {
        this.tax = value;
    }

    /**
     * Gets the value of the percentageRuleReservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentageRuleReservation() {
        return percentageRuleReservation;
    }

    /**
     * Sets the value of the percentageRuleReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageRuleReservation(String value) {
        this.percentageRuleReservation = value;
    }

    /**
     * Gets the value of the ruleQuantityDaysBeforeCheckIn property.
     * 
     */
    public int getRuleQuantityDaysBeforeCheckIn() {
        return ruleQuantityDaysBeforeCheckIn;
    }

    /**
     * Sets the value of the ruleQuantityDaysBeforeCheckIn property.
     * 
     */
    public void setRuleQuantityDaysBeforeCheckIn(int value) {
        this.ruleQuantityDaysBeforeCheckIn = value;
    }

    /**
     * Gets the value of the reservationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationInfo }
     *     
     */
    public ReservationInfo getReservationInformation() {
        return reservationInformation;
    }

    /**
     * Sets the value of the reservationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationInfo }
     *     
     */
    public void setReservationInformation(ReservationInfo value) {
        this.reservationInformation = value;
    }

    /**
     * Gets the value of the recommended property.
     * 
     */
    public boolean isRecommended() {
        return recommended;
    }

    /**
     * Sets the value of the recommended property.
     * 
     */
    public void setRecommended(boolean value) {
        this.recommended = value;
    }

    /**
     * Gets the value of the isOnrequest property.
     * 
     */
    public boolean isIsOnrequest() {
        return isOnrequest;
    }

    /**
     * Sets the value of the isOnrequest property.
     * 
     */
    public void setIsOnrequest(boolean value) {
        this.isOnrequest = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link EModeTravelPackage }
     *     
     */
    public EModeTravelPackage getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EModeTravelPackage }
     *     
     */
    public void setMode(EModeTravelPackage value) {
        this.mode = value;
    }

    /**
     * Gets the value of the includeAir property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAir() {
        return includeAir;
    }

    /**
     * Sets the value of the includeAir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAir(Boolean value) {
        this.includeAir = value;
    }

    /**
     * Gets the value of the includeHotel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeHotel() {
        return includeHotel;
    }

    /**
     * Sets the value of the includeHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHotel(Boolean value) {
        this.includeHotel = value;
    }

    /**
     * Gets the value of the includeCar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCar() {
        return includeCar;
    }

    /**
     * Sets the value of the includeCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCar(Boolean value) {
        this.includeCar = value;
    }

    /**
     * Gets the value of the includeTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTransfer() {
        return includeTransfer;
    }

    /**
     * Sets the value of the includeTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTransfer(Boolean value) {
        this.includeTransfer = value;
    }

    /**
     * Gets the value of the includeTour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTour() {
        return includeTour;
    }

    /**
     * Sets the value of the includeTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTour(Boolean value) {
        this.includeTour = value;
    }

    /**
     * Gets the value of the includeTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTicket() {
        return includeTicket;
    }

    /**
     * Sets the value of the includeTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTicket(Boolean value) {
        this.includeTicket = value;
    }

    /**
     * Gets the value of the includeCruise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCruise() {
        return includeCruise;
    }

    /**
     * Sets the value of the includeCruise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCruise(Boolean value) {
        this.includeCruise = value;
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
     * Gets the value of the politics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolitics() {
        return politics;
    }

    /**
     * Sets the value of the politics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolitics(String value) {
        this.politics = value;
    }

    /**
     * Gets the value of the cityId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCityId(Integer value) {
        this.cityId = value;
    }

    /**
     * Gets the value of the beginExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginExpirationDate() {
        return beginExpirationDate;
    }

    /**
     * Sets the value of the beginExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginExpirationDate(XMLGregorianCalendar value) {
        this.beginExpirationDate = value;
    }

    /**
     * Gets the value of the endExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndExpirationDate() {
        return endExpirationDate;
    }

    /**
     * Sets the value of the endExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndExpirationDate(XMLGregorianCalendar value) {
        this.endExpirationDate = value;
    }

    /**
     * Gets the value of the percentTaxAdm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentTaxAdm() {
        return percentTaxAdm;
    }

    /**
     * Sets the value of the percentTaxAdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentTaxAdm(BigDecimal value) {
        this.percentTaxAdm = value;
    }

    /**
     * Gets the value of the originalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalValue() {
        return originalValue;
    }

    /**
     * Sets the value of the originalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalValue(BigDecimal value) {
        this.originalValue = value;
    }

    /**
     * Gets the value of the numberDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDays() {
        return numberDays;
    }

    /**
     * Sets the value of the numberDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDays(Integer value) {
        this.numberDays = value;
    }

    /**
     * Gets the value of the numberNights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberNights() {
        return numberNights;
    }

    /**
     * Sets the value of the numberNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberNights(Integer value) {
        this.numberNights = value;
    }

    /**
     * Gets the value of the installmentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getInstallmentPrice() {
        return installmentPrice;
    }

    /**
     * Sets the value of the installmentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setInstallmentPrice(PriceValue value) {
        this.installmentPrice = value;
    }

}
