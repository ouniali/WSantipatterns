
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HotelRatePlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRatePlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *         &lt;element name="DestinationSystemsCode" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeDestinationSystemCode" minOccurs="0"/>
 *         &lt;element name="BookingRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookingRulesType">
 *                 &lt;sequence>
 *                   &lt;element name="InventoryInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="InvCodeApplication">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="DoesNotApply"/>
 *                                 &lt;enumeration value="InvCode"/>
 *                                 &lt;enumeration value="InvGroupingCode"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeRate" minOccurs="0"/>
 *         &lt;element name="Supplements" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeSupplement" minOccurs="0"/>
 *         &lt;element name="Offers" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeOffer" minOccurs="0"/>
 *         &lt;element name="RatePlanShoulders" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeRatePlanShoulder" minOccurs="0"/>
 *         &lt;element name="SellableProducts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProduct" minOccurs="0"/>
 *         &lt;element name="RatePlanLevelFee" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
 *                           &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Commission" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="HotelRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanQualifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanCodeType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="DoesNotApply"/>
 *             &lt;enumeration value="RatePlanCode"/>
 *             &lt;enumeration value="RatePlanGroupingCode"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RatePlanNotifType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="New"/>
 *             &lt;enumeration value="Delta"/>
 *             &lt;enumeration value="Overlay"/>
 *             &lt;enumeration value="Remove"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RatePlanStatusType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Initial"/>
 *             &lt;enumeration value="Active"/>
 *             &lt;enumeration value="Deactivated"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RatePlanNotifScopeType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="RatePlanOnly"/>
 *             &lt;enumeration value="RateOnly"/>
 *             &lt;enumeration value="RatePlanAndRate"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="IsCommissionable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RateReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="YieldableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MarketCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="YieldDeltaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="InventoryAllocatedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="EarliestStartIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="LatestEndIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ExtraNightRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BaseRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="AdjustedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="FloorAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="CeilingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="AdjustUpIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ChargeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRatePlanType", propOrder = {
    "tpaExtensions",
    "destinationSystemsCode",
    "bookingRules",
    "rates",
    "supplements",
    "offers",
    "ratePlanShoulders",
    "sellableProducts",
    "ratePlanLevelFee",
    "commission",
    "description",
    "uniqueID",
    "hotelRef"
})
public class HotelRatePlanType {

    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlElement(name = "DestinationSystemsCode")
    protected ArrayOfHotelRatePlanTypeDestinationSystemCode destinationSystemsCode;
    @XmlElement(name = "BookingRules")
    protected HotelRatePlanType.BookingRules bookingRules;
    @XmlElement(name = "Rates")
    protected ArrayOfHotelRatePlanTypeRate rates;
    @XmlElement(name = "Supplements")
    protected ArrayOfHotelRatePlanTypeSupplement supplements;
    @XmlElement(name = "Offers")
    protected ArrayOfHotelRatePlanTypeOffer offers;
    @XmlElement(name = "RatePlanShoulders")
    protected ArrayOfHotelRatePlanTypeRatePlanShoulder ratePlanShoulders;
    @XmlElement(name = "SellableProducts")
    protected ArrayOfSellableProductsTypeSellableProduct sellableProducts;
    @XmlElement(name = "RatePlanLevelFee")
    protected HotelRatePlanType.RatePlanLevelFee ratePlanLevelFee;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "Description")
    protected List<ParagraphType> description;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "HotelRef")
    protected HotelRatePlanType.HotelRef hotelRef;
    @XmlAttribute(name = "Start", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar start;
    @XmlAttribute(name = "End", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar end;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "RatePlanType")
    protected String ratePlanType;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "RatePlanID")
    protected String ratePlanID;
    @XmlAttribute(name = "RatePlanQualifier")
    protected Boolean ratePlanQualifier;
    @XmlAttribute(name = "RatePlanCategory")
    protected String ratePlanCategory;
    @XmlAttribute(name = "RatePlanCodeType")
    protected String ratePlanCodeType;
    @XmlAttribute(name = "RatePlanNotifType")
    protected String ratePlanNotifType;
    @XmlAttribute(name = "RatePlanStatusType")
    protected String ratePlanStatusType;
    @XmlAttribute(name = "RatePlanNotifScopeType")
    protected String ratePlanNotifScopeType;
    @XmlAttribute(name = "IsCommissionable")
    protected Boolean isCommissionable;
    @XmlAttribute(name = "RateReturn")
    protected Boolean rateReturn;
    @XmlAttribute(name = "YieldableIndicator")
    protected Boolean yieldableIndicator;
    @XmlAttribute(name = "MarketCode")
    protected String marketCode;
    @XmlAttribute(name = "YieldDeltaAmount")
    protected BigDecimal yieldDeltaAmount;
    @XmlAttribute(name = "InventoryAllocatedInd")
    protected Boolean inventoryAllocatedInd;
    @XmlAttribute(name = "RestrictedDisplayIndicator")
    protected Boolean restrictedDisplayIndicator;
    @XmlAttribute(name = "EarliestStartIndicator")
    protected Boolean earliestStartIndicator;
    @XmlAttribute(name = "LatestEndIndicator")
    protected Boolean latestEndIndicator;
    @XmlAttribute(name = "ExtraNightRatePlanCode")
    protected String extraNightRatePlanCode;
    @XmlAttribute(name = "BaseRatePlanCode")
    protected String baseRatePlanCode;
    @XmlAttribute(name = "AdjustedAmount")
    protected BigDecimal adjustedAmount;
    @XmlAttribute(name = "AdjustedPercentage")
    protected BigDecimal adjustedPercentage;
    @XmlAttribute(name = "FloorAmount")
    protected BigDecimal floorAmount;
    @XmlAttribute(name = "CeilingAmount")
    protected BigDecimal ceilingAmount;
    @XmlAttribute(name = "AdjustUpIndicator")
    protected Boolean adjustUpIndicator;
    @XmlAttribute(name = "ChargeTypeCode")
    protected String chargeTypeCode;

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
     * Gets the value of the destinationSystemsCode property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelRatePlanTypeDestinationSystemCode }
     *     
     */
    public ArrayOfHotelRatePlanTypeDestinationSystemCode getDestinationSystemsCode() {
        return destinationSystemsCode;
    }

    /**
     * Sets the value of the destinationSystemsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelRatePlanTypeDestinationSystemCode }
     *     
     */
    public void setDestinationSystemsCode(ArrayOfHotelRatePlanTypeDestinationSystemCode value) {
        this.destinationSystemsCode = value;
    }

    /**
     * Gets the value of the bookingRules property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRatePlanType.BookingRules }
     *     
     */
    public HotelRatePlanType.BookingRules getBookingRules() {
        return bookingRules;
    }

    /**
     * Sets the value of the bookingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRatePlanType.BookingRules }
     *     
     */
    public void setBookingRules(HotelRatePlanType.BookingRules value) {
        this.bookingRules = value;
    }

    /**
     * Gets the value of the rates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelRatePlanTypeRate }
     *     
     */
    public ArrayOfHotelRatePlanTypeRate getRates() {
        return rates;
    }

    /**
     * Sets the value of the rates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelRatePlanTypeRate }
     *     
     */
    public void setRates(ArrayOfHotelRatePlanTypeRate value) {
        this.rates = value;
    }

    /**
     * Gets the value of the supplements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelRatePlanTypeSupplement }
     *     
     */
    public ArrayOfHotelRatePlanTypeSupplement getSupplements() {
        return supplements;
    }

    /**
     * Sets the value of the supplements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelRatePlanTypeSupplement }
     *     
     */
    public void setSupplements(ArrayOfHotelRatePlanTypeSupplement value) {
        this.supplements = value;
    }

    /**
     * Gets the value of the offers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelRatePlanTypeOffer }
     *     
     */
    public ArrayOfHotelRatePlanTypeOffer getOffers() {
        return offers;
    }

    /**
     * Sets the value of the offers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelRatePlanTypeOffer }
     *     
     */
    public void setOffers(ArrayOfHotelRatePlanTypeOffer value) {
        this.offers = value;
    }

    /**
     * Gets the value of the ratePlanShoulders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelRatePlanTypeRatePlanShoulder }
     *     
     */
    public ArrayOfHotelRatePlanTypeRatePlanShoulder getRatePlanShoulders() {
        return ratePlanShoulders;
    }

    /**
     * Sets the value of the ratePlanShoulders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelRatePlanTypeRatePlanShoulder }
     *     
     */
    public void setRatePlanShoulders(ArrayOfHotelRatePlanTypeRatePlanShoulder value) {
        this.ratePlanShoulders = value;
    }

    /**
     * Gets the value of the sellableProducts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellableProductsTypeSellableProduct }
     *     
     */
    public ArrayOfSellableProductsTypeSellableProduct getSellableProducts() {
        return sellableProducts;
    }

    /**
     * Sets the value of the sellableProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellableProductsTypeSellableProduct }
     *     
     */
    public void setSellableProducts(ArrayOfSellableProductsTypeSellableProduct value) {
        this.sellableProducts = value;
    }

    /**
     * Gets the value of the ratePlanLevelFee property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRatePlanType.RatePlanLevelFee }
     *     
     */
    public HotelRatePlanType.RatePlanLevelFee getRatePlanLevelFee() {
        return ratePlanLevelFee;
    }

    /**
     * Sets the value of the ratePlanLevelFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRatePlanType.RatePlanLevelFee }
     *     
     */
    public void setRatePlanLevelFee(HotelRatePlanType.RatePlanLevelFee value) {
        this.ratePlanLevelFee = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getDescription() {
        if (description == null) {
            description = new ArrayList<ParagraphType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the hotelRef property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRatePlanType.HotelRef }
     *     
     */
    public HotelRatePlanType.HotelRef getHotelRef() {
        return hotelRef;
    }

    /**
     * Sets the value of the hotelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRatePlanType.HotelRef }
     *     
     */
    public void setHotelRef(HotelRatePlanType.HotelRef value) {
        this.hotelRef = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the ratePlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * Sets the value of the ratePlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * Gets the value of the ratePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * Sets the value of the ratePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * Gets the value of the ratePlanID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanID() {
        return ratePlanID;
    }

    /**
     * Sets the value of the ratePlanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanID(String value) {
        this.ratePlanID = value;
    }

    /**
     * Gets the value of the ratePlanQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRatePlanQualifier() {
        return ratePlanQualifier;
    }

    /**
     * Sets the value of the ratePlanQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRatePlanQualifier(Boolean value) {
        this.ratePlanQualifier = value;
    }

    /**
     * Gets the value of the ratePlanCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCategory() {
        return ratePlanCategory;
    }

    /**
     * Sets the value of the ratePlanCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCategory(String value) {
        this.ratePlanCategory = value;
    }

    /**
     * Gets the value of the ratePlanCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCodeType() {
        return ratePlanCodeType;
    }

    /**
     * Sets the value of the ratePlanCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCodeType(String value) {
        this.ratePlanCodeType = value;
    }

    /**
     * Gets the value of the ratePlanNotifType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanNotifType() {
        return ratePlanNotifType;
    }

    /**
     * Sets the value of the ratePlanNotifType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanNotifType(String value) {
        this.ratePlanNotifType = value;
    }

    /**
     * Gets the value of the ratePlanStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanStatusType() {
        return ratePlanStatusType;
    }

    /**
     * Sets the value of the ratePlanStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanStatusType(String value) {
        this.ratePlanStatusType = value;
    }

    /**
     * Gets the value of the ratePlanNotifScopeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanNotifScopeType() {
        return ratePlanNotifScopeType;
    }

    /**
     * Sets the value of the ratePlanNotifScopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanNotifScopeType(String value) {
        this.ratePlanNotifScopeType = value;
    }

    /**
     * Gets the value of the isCommissionable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommissionable() {
        return isCommissionable;
    }

    /**
     * Sets the value of the isCommissionable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCommissionable(Boolean value) {
        this.isCommissionable = value;
    }

    /**
     * Gets the value of the rateReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateReturn() {
        return rateReturn;
    }

    /**
     * Sets the value of the rateReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateReturn(Boolean value) {
        this.rateReturn = value;
    }

    /**
     * Gets the value of the yieldableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYieldableIndicator() {
        return yieldableIndicator;
    }

    /**
     * Sets the value of the yieldableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYieldableIndicator(Boolean value) {
        this.yieldableIndicator = value;
    }

    /**
     * Gets the value of the marketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * Sets the value of the marketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * Gets the value of the yieldDeltaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYieldDeltaAmount() {
        return yieldDeltaAmount;
    }

    /**
     * Sets the value of the yieldDeltaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYieldDeltaAmount(BigDecimal value) {
        this.yieldDeltaAmount = value;
    }

    /**
     * Gets the value of the inventoryAllocatedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInventoryAllocatedInd() {
        return inventoryAllocatedInd;
    }

    /**
     * Sets the value of the inventoryAllocatedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInventoryAllocatedInd(Boolean value) {
        this.inventoryAllocatedInd = value;
    }

    /**
     * Gets the value of the restrictedDisplayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedDisplayIndicator() {
        return restrictedDisplayIndicator;
    }

    /**
     * Sets the value of the restrictedDisplayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedDisplayIndicator(Boolean value) {
        this.restrictedDisplayIndicator = value;
    }

    /**
     * Gets the value of the earliestStartIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEarliestStartIndicator() {
        return earliestStartIndicator;
    }

    /**
     * Sets the value of the earliestStartIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEarliestStartIndicator(Boolean value) {
        this.earliestStartIndicator = value;
    }

    /**
     * Gets the value of the latestEndIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatestEndIndicator() {
        return latestEndIndicator;
    }

    /**
     * Sets the value of the latestEndIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatestEndIndicator(Boolean value) {
        this.latestEndIndicator = value;
    }

    /**
     * Gets the value of the extraNightRatePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraNightRatePlanCode() {
        return extraNightRatePlanCode;
    }

    /**
     * Sets the value of the extraNightRatePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraNightRatePlanCode(String value) {
        this.extraNightRatePlanCode = value;
    }

    /**
     * Gets the value of the baseRatePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRatePlanCode() {
        return baseRatePlanCode;
    }

    /**
     * Sets the value of the baseRatePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRatePlanCode(String value) {
        this.baseRatePlanCode = value;
    }

    /**
     * Gets the value of the adjustedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedAmount() {
        return adjustedAmount;
    }

    /**
     * Sets the value of the adjustedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedAmount(BigDecimal value) {
        this.adjustedAmount = value;
    }

    /**
     * Gets the value of the adjustedPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedPercentage() {
        return adjustedPercentage;
    }

    /**
     * Sets the value of the adjustedPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedPercentage(BigDecimal value) {
        this.adjustedPercentage = value;
    }

    /**
     * Gets the value of the floorAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFloorAmount() {
        return floorAmount;
    }

    /**
     * Sets the value of the floorAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFloorAmount(BigDecimal value) {
        this.floorAmount = value;
    }

    /**
     * Gets the value of the ceilingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCeilingAmount() {
        return ceilingAmount;
    }

    /**
     * Sets the value of the ceilingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCeilingAmount(BigDecimal value) {
        this.ceilingAmount = value;
    }

    /**
     * Gets the value of the adjustUpIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustUpIndicator() {
        return adjustUpIndicator;
    }

    /**
     * Sets the value of the adjustUpIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustUpIndicator(Boolean value) {
        this.adjustUpIndicator = value;
    }

    /**
     * Gets the value of the chargeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeTypeCode() {
        return chargeTypeCode;
    }

    /**
     * Sets the value of the chargeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeTypeCode(String value) {
        this.chargeTypeCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookingRulesType">
     *       &lt;sequence>
     *         &lt;element name="InventoryInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="InvCodeApplication">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="DoesNotApply"/>
     *                       &lt;enumeration value="InvCode"/>
     *                       &lt;enumeration value="InvGroupingCode"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inventoryInfo"
    })
    public static class BookingRules
        extends BookingRulesType
    {

        @XmlElement(name = "InventoryInfo")
        protected HotelRatePlanType.BookingRules.InventoryInfo inventoryInfo;

        /**
         * Gets the value of the inventoryInfo property.
         * 
         * @return
         *     possible object is
         *     {@link HotelRatePlanType.BookingRules.InventoryInfo }
         *     
         */
        public HotelRatePlanType.BookingRules.InventoryInfo getInventoryInfo() {
            return inventoryInfo;
        }

        /**
         * Sets the value of the inventoryInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelRatePlanType.BookingRules.InventoryInfo }
         *     
         */
        public void setInventoryInfo(HotelRatePlanType.BookingRules.InventoryInfo value) {
            this.inventoryInfo = value;
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
         *       &lt;attribute name="InvCodeApplication">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="DoesNotApply"/>
         *             &lt;enumeration value="InvCode"/>
         *             &lt;enumeration value="InvGroupingCode"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InventoryInfo {

            @XmlAttribute(name = "InvCodeApplication")
            protected String invCodeApplication;
            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "InvType")
            protected String invType;
            @XmlAttribute(name = "InvTypeCode")
            protected String invTypeCode;
            @XmlAttribute(name = "IsRoom")
            protected Boolean isRoom;

            /**
             * Gets the value of the invCodeApplication property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * Sets the value of the invCodeApplication property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * Gets the value of the invCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * Sets the value of the invCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * Gets the value of the invType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvType() {
                return invType;
            }

            /**
             * Sets the value of the invType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * Gets the value of the invTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * Sets the value of the invTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * Gets the value of the isRoom property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * Sets the value of the isRoom property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
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
     *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelRef {

        @XmlAttribute(name = "ChainCode")
        protected String chainCode;
        @XmlAttribute(name = "BrandCode")
        protected String brandCode;
        @XmlAttribute(name = "HotelCode")
        protected String hotelCode;
        @XmlAttribute(name = "HotelCityCode")
        protected String hotelCityCode;
        @XmlAttribute(name = "HotelName")
        protected String hotelName;
        @XmlAttribute(name = "HotelCodeContext")
        protected String hotelCodeContext;
        @XmlAttribute(name = "ChainName")
        protected String chainName;
        @XmlAttribute(name = "BrandName")
        protected String brandName;

        /**
         * Gets the value of the chainCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainCode() {
            return chainCode;
        }

        /**
         * Sets the value of the chainCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainCode(String value) {
            this.chainCode = value;
        }

        /**
         * Gets the value of the brandCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandCode() {
            return brandCode;
        }

        /**
         * Sets the value of the brandCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandCode(String value) {
            this.brandCode = value;
        }

        /**
         * Gets the value of the hotelCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCode() {
            return hotelCode;
        }

        /**
         * Sets the value of the hotelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCode(String value) {
            this.hotelCode = value;
        }

        /**
         * Gets the value of the hotelCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCityCode() {
            return hotelCityCode;
        }

        /**
         * Sets the value of the hotelCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCityCode(String value) {
            this.hotelCityCode = value;
        }

        /**
         * Gets the value of the hotelName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelName() {
            return hotelName;
        }

        /**
         * Sets the value of the hotelName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelName(String value) {
            this.hotelName = value;
        }

        /**
         * Gets the value of the hotelCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCodeContext() {
            return hotelCodeContext;
        }

        /**
         * Sets the value of the hotelCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCodeContext(String value) {
            this.hotelCodeContext = value;
        }

        /**
         * Gets the value of the chainName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainName() {
            return chainName;
        }

        /**
         * Sets the value of the chainName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainName(String value) {
            this.chainName = value;
        }

        /**
         * Gets the value of the brandName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandName() {
            return brandName;
        }

        /**
         * Sets the value of the brandName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandName(String value) {
            this.brandName = value;
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
     *       &lt;sequence>
     *         &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
     *                 &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fee"
    })
    public static class RatePlanLevelFee {

        @XmlElement(name = "Fee")
        protected List<HotelRatePlanType.RatePlanLevelFee.Fee> fee;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;

        /**
         * Gets the value of the fee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelRatePlanType.RatePlanLevelFee.Fee }
         * 
         * 
         */
        public List<HotelRatePlanType.RatePlanLevelFee.Fee> getFee() {
            if (fee == null) {
                fee = new ArrayList<HotelRatePlanType.RatePlanLevelFee.Fee>();
            }
            return this.fee;
        }

        /**
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
         *       &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Fee
            extends FeeType
        {

            @XmlAttribute(name = "MealPlanCode")
            protected String mealPlanCode;

            /**
             * Gets the value of the mealPlanCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMealPlanCode() {
                return mealPlanCode;
            }

            /**
             * Sets the value of the mealPlanCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMealPlanCode(String value) {
                this.mealPlanCode = value;
            }

        }

    }

}
