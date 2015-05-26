
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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FareInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FareReference" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength0to8">
 *                 &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
 *                 &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="AccountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RuleInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RuleInfoType">
 *                 &lt;attribute name="TripType" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
 *                 &lt;attribute name="MoneySaverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FilingAirline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="MarketingAirline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *         &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *         &lt;element name="Date" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="LastRuleChange"/>
 *                       &lt;enumeration value="RuleBecomesInvalid"/>
 *                       &lt;enumeration value="RestrictiveFareEffective"/>
 *                       &lt;enumeration value="RestrictiveFareDiscontinue"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareInfo" maxOccurs="15" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Date" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="Type">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="EffectiveTravel"/>
 *                                 &lt;enumeration value="DiscontinueTravel"/>
 *                                 &lt;enumeration value="FirstTicketing"/>
 *                                 &lt;enumeration value="LastTicketing"/>
 *                                 &lt;enumeration value="TravelCompletion"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Fare" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="BaseAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="BaseNUC_Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="TaxAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="TotalFare" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="FareDescription" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PTC" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="GlobalIndicatorCode" type="{http://www.opentravel.org/OTA/2003/05}GlobalIndicatorType" />
 *                 &lt;attribute name="MaximumPermittedMileage" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="TripType" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
 *                 &lt;attribute name="FareType" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to3" />
 *                 &lt;attribute name="FareStatus" type="{http://www.opentravel.org/OTA/2003/05}FareStatusType" />
 *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DiscountPricing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountPricingGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="City" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Airport" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}NegotiatedFareAttributes"/>
 *       &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *       &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *       &lt;attribute name="RoutingNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to9999" />
 *       &lt;attribute name="NbrOfCities" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInfoType", propOrder = {
    "departureDate",
    "fareReference",
    "ruleInfo",
    "filingAirline",
    "marketingAirline",
    "departureAirport",
    "arrivalAirport",
    "date",
    "fareInfo",
    "discountPricing",
    "city",
    "airport"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.PTCFareBreakdownType.FareInfo.class,
    org.opentravel.ota._2003._05.AirItineraryPricingInfoType.FareInfos.FareInfo.class
})
public class FareInfoType {

    @XmlElement(name = "DepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "FareReference")
    protected List<FareInfoType.FareReference> fareReference;
    @XmlElement(name = "RuleInfo")
    protected FareInfoType.RuleInfo ruleInfo;
    @XmlElement(name = "FilingAirline")
    protected CompanyNameType filingAirline;
    @XmlElement(name = "MarketingAirline")
    protected List<CompanyNameType> marketingAirline;
    @XmlElement(name = "DepartureAirport")
    protected LocationType departureAirport;
    @XmlElement(name = "ArrivalAirport")
    protected LocationType arrivalAirport;
    @XmlElement(name = "Date")
    protected List<FareInfoType.Date> date;
    @XmlElement(name = "FareInfo")
    protected List<FareInfoType.FareInfo> fareInfo;
    @XmlElement(name = "DiscountPricing")
    protected FareInfoType.DiscountPricing discountPricing;
    @XmlElement(name = "City")
    protected List<FareInfoType.City> city;
    @XmlElement(name = "Airport")
    protected List<FareInfoType.Airport> airport;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "TariffNumber")
    protected String tariffNumber;
    @XmlAttribute(name = "RuleNumber")
    protected String ruleNumber;
    @XmlAttribute(name = "RoutingNumber")
    protected Integer routingNumber;
    @XmlAttribute(name = "NbrOfCities")
    protected Integer nbrOfCities;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "NegotiatedFareCode")
    protected String negotiatedFareCode;

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
     * Gets the value of the fareReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoType.FareReference }
     * 
     * 
     */
    public List<FareInfoType.FareReference> getFareReference() {
        if (fareReference == null) {
            fareReference = new ArrayList<FareInfoType.FareReference>();
        }
        return this.fareReference;
    }

    /**
     * Gets the value of the ruleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareInfoType.RuleInfo }
     *     
     */
    public FareInfoType.RuleInfo getRuleInfo() {
        return ruleInfo;
    }

    /**
     * Sets the value of the ruleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInfoType.RuleInfo }
     *     
     */
    public void setRuleInfo(FareInfoType.RuleInfo value) {
        this.ruleInfo = value;
    }

    /**
     * Gets the value of the filingAirline property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getFilingAirline() {
        return filingAirline;
    }

    /**
     * Sets the value of the filingAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setFilingAirline(CompanyNameType value) {
        this.filingAirline = value;
    }

    /**
     * Gets the value of the marketingAirline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingAirline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingAirline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNameType }
     * 
     * 
     */
    public List<CompanyNameType> getMarketingAirline() {
        if (marketingAirline == null) {
            marketingAirline = new ArrayList<CompanyNameType>();
        }
        return this.marketingAirline;
    }

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDepartureAirport(LocationType value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setArrivalAirport(LocationType value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the date property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoType.Date }
     * 
     * 
     */
    public List<FareInfoType.Date> getDate() {
        if (date == null) {
            date = new ArrayList<FareInfoType.Date>();
        }
        return this.date;
    }

    /**
     * Gets the value of the fareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoType.FareInfo }
     * 
     * 
     */
    public List<FareInfoType.FareInfo> getFareInfo() {
        if (fareInfo == null) {
            fareInfo = new ArrayList<FareInfoType.FareInfo>();
        }
        return this.fareInfo;
    }

    /**
     * Gets the value of the discountPricing property.
     * 
     * @return
     *     possible object is
     *     {@link FareInfoType.DiscountPricing }
     *     
     */
    public FareInfoType.DiscountPricing getDiscountPricing() {
        return discountPricing;
    }

    /**
     * Sets the value of the discountPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInfoType.DiscountPricing }
     *     
     */
    public void setDiscountPricing(FareInfoType.DiscountPricing value) {
        this.discountPricing = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the city property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoType.City }
     * 
     * 
     */
    public List<FareInfoType.City> getCity() {
        if (city == null) {
            city = new ArrayList<FareInfoType.City>();
        }
        return this.city;
    }

    /**
     * Gets the value of the airport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoType.Airport }
     * 
     * 
     */
    public List<FareInfoType.Airport> getAirport() {
        if (airport == null) {
            airport = new ArrayList<FareInfoType.Airport>();
        }
        return this.airport;
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
     * Gets the value of the tariffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffNumber() {
        return tariffNumber;
    }

    /**
     * Sets the value of the tariffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffNumber(String value) {
        this.tariffNumber = value;
    }

    /**
     * Gets the value of the ruleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleNumber() {
        return ruleNumber;
    }

    /**
     * Sets the value of the ruleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleNumber(String value) {
        this.ruleNumber = value;
    }

    /**
     * Gets the value of the routingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoutingNumber(Integer value) {
        this.routingNumber = value;
    }

    /**
     * Gets the value of the nbrOfCities property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbrOfCities() {
        return nbrOfCities;
    }

    /**
     * Sets the value of the nbrOfCities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbrOfCities(Integer value) {
        this.nbrOfCities = value;
    }

    /**
     * Gets the value of the negotiatedFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiatedFare() {
        return negotiatedFare;
    }

    /**
     * Sets the value of the negotiatedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiatedFare(Boolean value) {
        this.negotiatedFare = value;
    }

    /**
     * Gets the value of the negotiatedFareCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedFareCode() {
        return negotiatedFareCode;
    }

    /**
     * Sets the value of the negotiatedFareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiatedFareCode(String value) {
        this.negotiatedFareCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Airport {

        @XmlAttribute(name = "LocationCode")
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * Gets the value of the locationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationCode() {
            return locationCode;
        }

        /**
         * Sets the value of the locationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationCode(String value) {
            this.locationCode = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class City {

        @XmlAttribute(name = "LocationCode")
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * Gets the value of the locationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationCode() {
            return locationCode;
        }

        /**
         * Sets the value of the locationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationCode(String value) {
            this.locationCode = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
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
     *       &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="LastRuleChange"/>
     *             &lt;enumeration value="RuleBecomesInvalid"/>
     *             &lt;enumeration value="RestrictiveFareEffective"/>
     *             &lt;enumeration value="RestrictiveFareDiscontinue"/>
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
    @XmlType(name = "")
    public static class Date {

        @XmlAttribute(name = "Date")
        protected String date;
        @XmlAttribute(name = "Type")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountPricingGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DiscountPricing {

        @XmlAttribute(name = "Purpose")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String purpose;
        @XmlAttribute(name = "Type")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;
        @XmlAttribute(name = "Usage")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String usage;
        @XmlAttribute(name = "Discount")
        protected String discount;
        @XmlAttribute(name = "TicketDesignatorCode")
        protected String ticketDesignatorCode;
        @XmlAttribute(name = "Text")
        protected String text;

        /**
         * Gets the value of the purpose property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurpose() {
            return purpose;
        }

        /**
         * Sets the value of the purpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurpose(String value) {
            this.purpose = value;
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
         * Gets the value of the usage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsage() {
            return usage;
        }

        /**
         * Sets the value of the usage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsage(String value) {
            this.usage = value;
        }

        /**
         * Gets the value of the discount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscount() {
            return discount;
        }

        /**
         * Sets the value of the discount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscount(String value) {
            this.discount = value;
        }

        /**
         * Gets the value of the ticketDesignatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDesignatorCode() {
            return ticketDesignatorCode;
        }

        /**
         * Sets the value of the ticketDesignatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDesignatorCode(String value) {
            this.ticketDesignatorCode = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
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
     *         &lt;element name="Date" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="Type">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="EffectiveTravel"/>
     *                       &lt;enumeration value="DiscontinueTravel"/>
     *                       &lt;enumeration value="FirstTicketing"/>
     *                       &lt;enumeration value="LastTicketing"/>
     *                       &lt;enumeration value="TravelCompletion"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Fare" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="BaseAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="BaseNUC_Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="TaxAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="TotalFare" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="FareDescription" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PTC" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="GlobalIndicatorCode" type="{http://www.opentravel.org/OTA/2003/05}GlobalIndicatorType" />
     *       &lt;attribute name="MaximumPermittedMileage" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="TripType" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
     *       &lt;attribute name="FareType" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to3" />
     *       &lt;attribute name="FareStatus" type="{http://www.opentravel.org/OTA/2003/05}FareStatusType" />
     *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "date",
        "fare",
        "ptc"
    })
    public static class FareInfo {

        @XmlElement(name = "Date")
        protected List<FareInfoType.FareInfo.Date> date;
        @XmlElement(name = "Fare")
        protected FareInfoType.FareInfo.Fare fare;
        @XmlElement(name = "PTC")
        protected List<FareInfoType.FareInfo.PTC> ptc;
        @XmlAttribute(name = "FareBasisCode")
        protected String fareBasisCode;
        @XmlAttribute(name = "GlobalIndicatorCode")
        protected GlobalIndicatorType globalIndicatorCode;
        @XmlAttribute(name = "MaximumPermittedMileage")
        protected BigInteger maximumPermittedMileage;
        @XmlAttribute(name = "TripType")
        protected AirTripType tripType;
        @XmlAttribute(name = "FareType")
        protected String fareType;
        @XmlAttribute(name = "FareStatus")
        protected FareStatusType fareStatus;
        @XmlAttribute(name = "Operation")
        protected ActionType operation;
        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * Gets the value of the date property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the date property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareInfoType.FareInfo.Date }
         * 
         * 
         */
        public List<FareInfoType.FareInfo.Date> getDate() {
            if (date == null) {
                date = new ArrayList<FareInfoType.FareInfo.Date>();
            }
            return this.date;
        }

        /**
         * Gets the value of the fare property.
         * 
         * @return
         *     possible object is
         *     {@link FareInfoType.FareInfo.Fare }
         *     
         */
        public FareInfoType.FareInfo.Fare getFare() {
            return fare;
        }

        /**
         * Sets the value of the fare property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareInfoType.FareInfo.Fare }
         *     
         */
        public void setFare(FareInfoType.FareInfo.Fare value) {
            this.fare = value;
        }

        /**
         * Gets the value of the ptc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPTC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareInfoType.FareInfo.PTC }
         * 
         * 
         */
        public List<FareInfoType.FareInfo.PTC> getPTC() {
            if (ptc == null) {
                ptc = new ArrayList<FareInfoType.FareInfo.PTC>();
            }
            return this.ptc;
        }

        /**
         * Gets the value of the fareBasisCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareBasisCode() {
            return fareBasisCode;
        }

        /**
         * Sets the value of the fareBasisCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareBasisCode(String value) {
            this.fareBasisCode = value;
        }

        /**
         * Gets the value of the globalIndicatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link GlobalIndicatorType }
         *     
         */
        public GlobalIndicatorType getGlobalIndicatorCode() {
            return globalIndicatorCode;
        }

        /**
         * Sets the value of the globalIndicatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link GlobalIndicatorType }
         *     
         */
        public void setGlobalIndicatorCode(GlobalIndicatorType value) {
            this.globalIndicatorCode = value;
        }

        /**
         * Gets the value of the maximumPermittedMileage property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumPermittedMileage() {
            return maximumPermittedMileage;
        }

        /**
         * Sets the value of the maximumPermittedMileage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumPermittedMileage(BigInteger value) {
            this.maximumPermittedMileage = value;
        }

        /**
         * Gets the value of the tripType property.
         * 
         * @return
         *     possible object is
         *     {@link AirTripType }
         *     
         */
        public AirTripType getTripType() {
            return tripType;
        }

        /**
         * Sets the value of the tripType property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirTripType }
         *     
         */
        public void setTripType(AirTripType value) {
            this.tripType = value;
        }

        /**
         * Gets the value of the fareType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareType() {
            return fareType;
        }

        /**
         * Sets the value of the fareType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareType(String value) {
            this.fareType = value;
        }

        /**
         * Gets the value of the fareStatus property.
         * 
         * @return
         *     possible object is
         *     {@link FareStatusType }
         *     
         */
        public FareStatusType getFareStatus() {
            return fareStatus;
        }

        /**
         * Sets the value of the fareStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareStatusType }
         *     
         */
        public void setFareStatus(FareStatusType value) {
            this.fareStatus = value;
        }

        /**
         * Gets the value of the operation property.
         * 
         * @return
         *     possible object is
         *     {@link ActionType }
         *     
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *     
         */
        public void setOperation(ActionType value) {
            this.operation = value;
        }

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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="Type">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="EffectiveTravel"/>
         *             &lt;enumeration value="DiscontinueTravel"/>
         *             &lt;enumeration value="FirstTicketing"/>
         *             &lt;enumeration value="LastTicketing"/>
         *             &lt;enumeration value="TravelCompletion"/>
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
        @XmlType(name = "")
        public static class Date {

            @XmlAttribute(name = "Date")
            protected String date;
            @XmlAttribute(name = "Type")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String type;

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
         *       &lt;attribute name="BaseAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="BaseNUC_Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="TaxAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="TotalFare" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="FareDescription" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Fare {

            @XmlAttribute(name = "BaseAmount")
            protected BigDecimal baseAmount;
            @XmlAttribute(name = "BaseNUC_Amount")
            protected BigDecimal baseNUCAmount;
            @XmlAttribute(name = "TaxAmount")
            protected BigDecimal taxAmount;
            @XmlAttribute(name = "TotalFare")
            protected BigDecimal totalFare;
            @XmlAttribute(name = "FareDescription")
            protected String fareDescription;

            /**
             * Gets the value of the baseAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseAmount() {
                return baseAmount;
            }

            /**
             * Sets the value of the baseAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseAmount(BigDecimal value) {
                this.baseAmount = value;
            }

            /**
             * Gets the value of the baseNUCAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseNUCAmount() {
                return baseNUCAmount;
            }

            /**
             * Sets the value of the baseNUCAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseNUCAmount(BigDecimal value) {
                this.baseNUCAmount = value;
            }

            /**
             * Gets the value of the taxAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTaxAmount() {
                return taxAmount;
            }

            /**
             * Sets the value of the taxAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTaxAmount(BigDecimal value) {
                this.taxAmount = value;
            }

            /**
             * Gets the value of the totalFare property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalFare() {
                return totalFare;
            }

            /**
             * Sets the value of the totalFare property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalFare(BigDecimal value) {
                this.totalFare = value;
            }

            /**
             * Gets the value of the fareDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareDescription() {
                return fareDescription;
            }

            /**
             * Sets the value of the fareDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareDescription(String value) {
                this.fareDescription = value;
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
         *       &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PTC {

            @XmlAttribute(name = "PassengerTypeCode")
            protected String passengerTypeCode;

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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength0to8">
     *       &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
     *       &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="AccountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class FareReference {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ResBookDesigCode")
        protected String resBookDesigCode;
        @XmlAttribute(name = "TicketDesignatorCode")
        protected String ticketDesignatorCode;
        @XmlAttribute(name = "AccountCode")
        protected String accountCode;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the resBookDesigCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigCode() {
            return resBookDesigCode;
        }

        /**
         * Sets the value of the resBookDesigCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigCode(String value) {
            this.resBookDesigCode = value;
        }

        /**
         * Gets the value of the ticketDesignatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDesignatorCode() {
            return ticketDesignatorCode;
        }

        /**
         * Sets the value of the ticketDesignatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDesignatorCode(String value) {
            this.ticketDesignatorCode = value;
        }

        /**
         * Gets the value of the accountCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountCode() {
            return accountCode;
        }

        /**
         * Sets the value of the accountCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountCode(String value) {
            this.accountCode = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RuleInfoType">
     *       &lt;attribute name="TripType" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
     *       &lt;attribute name="MoneySaverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RuleInfo
        extends RuleInfoType
    {

        @XmlAttribute(name = "TripType")
        protected AirTripType tripType;
        @XmlAttribute(name = "MoneySaverInd")
        protected Boolean moneySaverInd;

        /**
         * Gets the value of the tripType property.
         * 
         * @return
         *     possible object is
         *     {@link AirTripType }
         *     
         */
        public AirTripType getTripType() {
            return tripType;
        }

        /**
         * Sets the value of the tripType property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirTripType }
         *     
         */
        public void setTripType(AirTripType value) {
            this.tripType = value;
        }

        /**
         * Gets the value of the moneySaverInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMoneySaverInd() {
            return moneySaverInd;
        }

        /**
         * Sets the value of the moneySaverInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMoneySaverInd(Boolean value) {
            this.moneySaverInd = value;
        }

    }

}
