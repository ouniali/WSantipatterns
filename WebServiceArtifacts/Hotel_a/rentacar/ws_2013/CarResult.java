
package rentacar.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws_2013.PriceValue;


/**
 * <p>Java class for CarResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirConditioner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Charges" type="{WS_2013.RentACar}ArrayOfCharge" minOccurs="0"/>
 *         &lt;element name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoyaltyCodeAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SIPPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalRateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PaymentDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CarDetails" type="{WS_2013.RentACar}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="DropOffLocationDetail" type="{WS_2013.RentACar}LocationResult" minOccurs="0"/>
 *         &lt;element name="PickUpLocationDetail" type="{WS_2013.RentACar}LocationResult" minOccurs="0"/>
 *         &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SecuredEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ProviderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ResponseId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Images" type="{WS_2013.RentACar}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="IsPromotional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Features" type="{WS_2013.RentACar}ArrayOfFeature" minOccurs="0"/>
 *         &lt;element name="CarModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaggageQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PassengerQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DoorsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SellingPricePerDay" type="{WS_2013.RentACar}ArrayOfPriceValue" minOccurs="0"/>
 *         &lt;element name="TotalSellingPrice" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="Rules" type="{WS_2013.RentACar}ArrayOfRule" minOccurs="0"/>
 *         &lt;element name="CancellationPolicies" type="{WS_2013.RentACar}ArrayOfCancellationPolicy" minOccurs="0"/>
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TransmissionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingBaseValue" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarResult", propOrder = {
    "airConditioner",
    "charges",
    "discountCode",
    "loyaltyCodeAllowed",
    "sippCode",
    "rateCode",
    "originalRateCode",
    "commission",
    "paymentDeadline",
    "carDetails",
    "dropOffLocationDetail",
    "pickUpLocationDetail",
    "available",
    "securedEquipment",
    "providerId",
    "groupId",
    "responseId",
    "images",
    "isPromotional",
    "features",
    "carModel",
    "commissionCurrency",
    "providerName",
    "baggageQuantity",
    "passengerQuantity",
    "doorsCount",
    "sellingPricePerDay",
    "totalSellingPrice",
    "rules",
    "cancellationPolicies",
    "conversionRate",
    "transmissionType",
    "sellingBaseValue",
    "groupName",
    "providerGroup",
    "emailRequired"
})
public class CarResult {

    @XmlElement(name = "AirConditioner")
    protected boolean airConditioner;
    @XmlElement(name = "Charges")
    protected ArrayOfCharge charges;
    @XmlElement(name = "DiscountCode")
    protected String discountCode;
    @XmlElement(name = "LoyaltyCodeAllowed")
    protected boolean loyaltyCodeAllowed;
    @XmlElement(name = "SIPPCode")
    protected String sippCode;
    @XmlElement(name = "RateCode")
    protected String rateCode;
    @XmlElement(name = "OriginalRateCode")
    protected String originalRateCode;
    @XmlElement(name = "Commission")
    protected double commission;
    @XmlElement(name = "PaymentDeadline", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDeadline;
    @XmlElement(name = "CarDetails")
    protected ArrayOfString carDetails;
    @XmlElement(name = "DropOffLocationDetail")
    protected LocationResult dropOffLocationDetail;
    @XmlElement(name = "PickUpLocationDetail")
    protected LocationResult pickUpLocationDetail;
    @XmlElement(name = "Available")
    protected boolean available;
    @XmlElement(name = "SecuredEquipment")
    protected boolean securedEquipment;
    @XmlElement(name = "ProviderId")
    protected int providerId;
    @XmlElement(name = "GroupId")
    protected int groupId;
    @XmlElement(name = "ResponseId")
    protected int responseId;
    @XmlElement(name = "Images")
    protected ArrayOfString images;
    @XmlElement(name = "IsPromotional")
    protected boolean isPromotional;
    @XmlElement(name = "Features")
    protected ArrayOfFeature features;
    @XmlElement(name = "CarModel")
    protected String carModel;
    @XmlElement(name = "CommissionCurrency")
    protected String commissionCurrency;
    @XmlElement(name = "ProviderName")
    protected String providerName;
    @XmlElement(name = "BaggageQuantity")
    protected int baggageQuantity;
    @XmlElement(name = "PassengerQuantity")
    protected int passengerQuantity;
    @XmlElement(name = "DoorsCount")
    protected int doorsCount;
    @XmlElement(name = "SellingPricePerDay")
    protected ArrayOfPriceValue sellingPricePerDay;
    @XmlElement(name = "TotalSellingPrice")
    protected PriceValue totalSellingPrice;
    @XmlElement(name = "Rules")
    protected ArrayOfRule rules;
    @XmlElement(name = "CancellationPolicies")
    protected ArrayOfCancellationPolicy cancellationPolicies;
    @XmlElement(name = "ConversionRate")
    protected double conversionRate;
    @XmlElement(name = "TransmissionType")
    protected String transmissionType;
    @XmlElement(name = "SellingBaseValue")
    protected PriceValue sellingBaseValue;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "ProviderGroup")
    protected String providerGroup;
    @XmlElement(name = "EmailRequired")
    protected boolean emailRequired;

    /**
     * Gets the value of the airConditioner property.
     * 
     */
    public boolean isAirConditioner() {
        return airConditioner;
    }

    /**
     * Sets the value of the airConditioner property.
     * 
     */
    public void setAirConditioner(boolean value) {
        this.airConditioner = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCharge }
     *     
     */
    public ArrayOfCharge getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCharge }
     *     
     */
    public void setCharges(ArrayOfCharge value) {
        this.charges = value;
    }

    /**
     * Gets the value of the discountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

    /**
     * Gets the value of the loyaltyCodeAllowed property.
     * 
     */
    public boolean isLoyaltyCodeAllowed() {
        return loyaltyCodeAllowed;
    }

    /**
     * Sets the value of the loyaltyCodeAllowed property.
     * 
     */
    public void setLoyaltyCodeAllowed(boolean value) {
        this.loyaltyCodeAllowed = value;
    }

    /**
     * Gets the value of the sippCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPPCode() {
        return sippCode;
    }

    /**
     * Sets the value of the sippCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPPCode(String value) {
        this.sippCode = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the originalRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalRateCode() {
        return originalRateCode;
    }

    /**
     * Sets the value of the originalRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalRateCode(String value) {
        this.originalRateCode = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     */
    public double getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     */
    public void setCommission(double value) {
        this.commission = value;
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
     * Gets the value of the carDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCarDetails() {
        return carDetails;
    }

    /**
     * Sets the value of the carDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCarDetails(ArrayOfString value) {
        this.carDetails = value;
    }

    /**
     * Gets the value of the dropOffLocationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationResult }
     *     
     */
    public LocationResult getDropOffLocationDetail() {
        return dropOffLocationDetail;
    }

    /**
     * Sets the value of the dropOffLocationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationResult }
     *     
     */
    public void setDropOffLocationDetail(LocationResult value) {
        this.dropOffLocationDetail = value;
    }

    /**
     * Gets the value of the pickUpLocationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationResult }
     *     
     */
    public LocationResult getPickUpLocationDetail() {
        return pickUpLocationDetail;
    }

    /**
     * Sets the value of the pickUpLocationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationResult }
     *     
     */
    public void setPickUpLocationDetail(LocationResult value) {
        this.pickUpLocationDetail = value;
    }

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the securedEquipment property.
     * 
     */
    public boolean isSecuredEquipment() {
        return securedEquipment;
    }

    /**
     * Sets the value of the securedEquipment property.
     * 
     */
    public void setSecuredEquipment(boolean value) {
        this.securedEquipment = value;
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
     * Gets the value of the groupId property.
     * 
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     */
    public void setGroupId(int value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the responseId property.
     * 
     */
    public int getResponseId() {
        return responseId;
    }

    /**
     * Sets the value of the responseId property.
     * 
     */
    public void setResponseId(int value) {
        this.responseId = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setImages(ArrayOfString value) {
        this.images = value;
    }

    /**
     * Gets the value of the isPromotional property.
     * 
     */
    public boolean isIsPromotional() {
        return isPromotional;
    }

    /**
     * Sets the value of the isPromotional property.
     * 
     */
    public void setIsPromotional(boolean value) {
        this.isPromotional = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeature }
     *     
     */
    public ArrayOfFeature getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeature }
     *     
     */
    public void setFeatures(ArrayOfFeature value) {
        this.features = value;
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
     * Gets the value of the commissionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionCurrency() {
        return commissionCurrency;
    }

    /**
     * Sets the value of the commissionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionCurrency(String value) {
        this.commissionCurrency = value;
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
     * Gets the value of the baggageQuantity property.
     * 
     */
    public int getBaggageQuantity() {
        return baggageQuantity;
    }

    /**
     * Sets the value of the baggageQuantity property.
     * 
     */
    public void setBaggageQuantity(int value) {
        this.baggageQuantity = value;
    }

    /**
     * Gets the value of the passengerQuantity property.
     * 
     */
    public int getPassengerQuantity() {
        return passengerQuantity;
    }

    /**
     * Sets the value of the passengerQuantity property.
     * 
     */
    public void setPassengerQuantity(int value) {
        this.passengerQuantity = value;
    }

    /**
     * Gets the value of the doorsCount property.
     * 
     */
    public int getDoorsCount() {
        return doorsCount;
    }

    /**
     * Sets the value of the doorsCount property.
     * 
     */
    public void setDoorsCount(int value) {
        this.doorsCount = value;
    }

    /**
     * Gets the value of the sellingPricePerDay property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceValue }
     *     
     */
    public ArrayOfPriceValue getSellingPricePerDay() {
        return sellingPricePerDay;
    }

    /**
     * Sets the value of the sellingPricePerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceValue }
     *     
     */
    public void setSellingPricePerDay(ArrayOfPriceValue value) {
        this.sellingPricePerDay = value;
    }

    /**
     * Gets the value of the totalSellingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getTotalSellingPrice() {
        return totalSellingPrice;
    }

    /**
     * Sets the value of the totalSellingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setTotalSellingPrice(PriceValue value) {
        this.totalSellingPrice = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRule }
     *     
     */
    public ArrayOfRule getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRule }
     *     
     */
    public void setRules(ArrayOfRule value) {
        this.rules = value;
    }

    /**
     * Gets the value of the cancellationPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public ArrayOfCancellationPolicy getCancellationPolicies() {
        return cancellationPolicies;
    }

    /**
     * Sets the value of the cancellationPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public void setCancellationPolicies(ArrayOfCancellationPolicy value) {
        this.cancellationPolicies = value;
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
     * Gets the value of the transmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionType() {
        return transmissionType;
    }

    /**
     * Sets the value of the transmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionType(String value) {
        this.transmissionType = value;
    }

    /**
     * Gets the value of the sellingBaseValue property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getSellingBaseValue() {
        return sellingBaseValue;
    }

    /**
     * Sets the value of the sellingBaseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setSellingBaseValue(PriceValue value) {
        this.sellingBaseValue = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the providerGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderGroup() {
        return providerGroup;
    }

    /**
     * Sets the value of the providerGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderGroup(String value) {
        this.providerGroup = value;
    }

    /**
     * Gets the value of the emailRequired property.
     * 
     */
    public boolean isEmailRequired() {
        return emailRequired;
    }

    /**
     * Sets the value of the emailRequired property.
     * 
     */
    public void setEmailRequired(boolean value) {
        this.emailRequired = value;
    }

}
