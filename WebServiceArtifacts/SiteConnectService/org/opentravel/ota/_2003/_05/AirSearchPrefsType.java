
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AirSearchPrefsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirSearchPrefsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorPref" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNamePrefType">
 *                 &lt;attribute name="AllianceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="LoyaltyAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightTypePref" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightTypePrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareRestrictPref" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdvResTicketing" type="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType" minOccurs="0"/>
 *                   &lt;element name="StayRestrictions" type="{http://www.opentravel.org/OTA/2003/05}StayRestrictionsType" minOccurs="0"/>
 *                   &lt;element name="VoluntaryChanges" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareRestrictPrefGroup"/>
 *                 &lt;attribute name="FareDisplayCurrency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                 &lt;attribute name="CurrencyOverride" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EquipPref" type="{http://www.opentravel.org/OTA/2003/05}EquipmentTypePref" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="CabinPref" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CabinPrefGroup"/>
 *                 &lt;attribute name="CabinSubtype" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketDistribPref" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TicketDistribPrefType">
 *                 &lt;attribute name="LastTicketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="FirstTicketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingSeatPref" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SeatsNeeded" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SmokingIndicatorGroup"/>
 *       &lt;attribute name="OnTimeRate" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *       &lt;attribute name="ETicketDesired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MaxStopsQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSearchPrefsType", propOrder = {
    "vendorPref",
    "flightTypePref",
    "fareRestrictPref",
    "equipPref",
    "cabinPref",
    "ticketDistribPref",
    "bookingSeatPref"
})
public class AirSearchPrefsType {

    @XmlElement(name = "VendorPref")
    protected List<AirSearchPrefsType.VendorPref> vendorPref;
    @XmlElement(name = "FlightTypePref")
    protected List<AirSearchPrefsType.FlightTypePref> flightTypePref;
    @XmlElement(name = "FareRestrictPref")
    protected List<AirSearchPrefsType.FareRestrictPref> fareRestrictPref;
    @XmlElement(name = "EquipPref")
    protected List<EquipmentTypePref> equipPref;
    @XmlElement(name = "CabinPref")
    protected List<AirSearchPrefsType.CabinPref> cabinPref;
    @XmlElement(name = "TicketDistribPref")
    protected List<AirSearchPrefsType.TicketDistribPref> ticketDistribPref;
    @XmlElement(name = "BookingSeatPref")
    protected AirSearchPrefsType.BookingSeatPref bookingSeatPref;
    @XmlAttribute(name = "OnTimeRate")
    protected BigDecimal onTimeRate;
    @XmlAttribute(name = "ETicketDesired")
    protected Boolean eTicketDesired;
    @XmlAttribute(name = "MaxStopsQuantity")
    protected Integer maxStopsQuantity;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;

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
     * {@link AirSearchPrefsType.VendorPref }
     * 
     * 
     */
    public List<AirSearchPrefsType.VendorPref> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<AirSearchPrefsType.VendorPref>();
        }
        return this.vendorPref;
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
     * {@link AirSearchPrefsType.FlightTypePref }
     * 
     * 
     */
    public List<AirSearchPrefsType.FlightTypePref> getFlightTypePref() {
        if (flightTypePref == null) {
            flightTypePref = new ArrayList<AirSearchPrefsType.FlightTypePref>();
        }
        return this.flightTypePref;
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
     * {@link AirSearchPrefsType.FareRestrictPref }
     * 
     * 
     */
    public List<AirSearchPrefsType.FareRestrictPref> getFareRestrictPref() {
        if (fareRestrictPref == null) {
            fareRestrictPref = new ArrayList<AirSearchPrefsType.FareRestrictPref>();
        }
        return this.fareRestrictPref;
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
     * {@link AirSearchPrefsType.CabinPref }
     * 
     * 
     */
    public List<AirSearchPrefsType.CabinPref> getCabinPref() {
        if (cabinPref == null) {
            cabinPref = new ArrayList<AirSearchPrefsType.CabinPref>();
        }
        return this.cabinPref;
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
     * {@link AirSearchPrefsType.TicketDistribPref }
     * 
     * 
     */
    public List<AirSearchPrefsType.TicketDistribPref> getTicketDistribPref() {
        if (ticketDistribPref == null) {
            ticketDistribPref = new ArrayList<AirSearchPrefsType.TicketDistribPref>();
        }
        return this.ticketDistribPref;
    }

    /**
     * Gets the value of the bookingSeatPref property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchPrefsType.BookingSeatPref }
     *     
     */
    public AirSearchPrefsType.BookingSeatPref getBookingSeatPref() {
        return bookingSeatPref;
    }

    /**
     * Sets the value of the bookingSeatPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchPrefsType.BookingSeatPref }
     *     
     */
    public void setBookingSeatPref(AirSearchPrefsType.BookingSeatPref value) {
        this.bookingSeatPref = value;
    }

    /**
     * Gets the value of the onTimeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnTimeRate() {
        return onTimeRate;
    }

    /**
     * Sets the value of the onTimeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnTimeRate(BigDecimal value) {
        this.onTimeRate = value;
    }

    /**
     * Gets the value of the eTicketDesired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isETicketDesired() {
        return eTicketDesired;
    }

    /**
     * Sets the value of the eTicketDesired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETicketDesired(Boolean value) {
        this.eTicketDesired = value;
    }

    /**
     * Gets the value of the maxStopsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxStopsQuantity() {
        return maxStopsQuantity;
    }

    /**
     * Sets the value of the maxStopsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxStopsQuantity(Integer value) {
        this.maxStopsQuantity = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
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
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="SeatsNeeded" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BookingSeatPref {

        @XmlAttribute(name = "SeatsNeeded")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger seatsNeeded;

        /**
         * Gets the value of the seatsNeeded property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSeatsNeeded() {
            return seatsNeeded;
        }

        /**
         * Sets the value of the seatsNeeded property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSeatsNeeded(BigInteger value) {
            this.seatsNeeded = value;
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
     *       &lt;attribute name="CabinSubtype" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
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

        @XmlAttribute(name = "CabinSubtype")
        protected String cabinSubtype;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "Cabin")
        protected CabinType cabin;

        /**
         * Gets the value of the cabinSubtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCabinSubtype() {
            return cabinSubtype;
        }

        /**
         * Sets the value of the cabinSubtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCabinSubtype(String value) {
            this.cabinSubtype = value;
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
     *       &lt;sequence>
     *         &lt;element name="AdvResTicketing" type="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType" minOccurs="0"/>
     *         &lt;element name="StayRestrictions" type="{http://www.opentravel.org/OTA/2003/05}StayRestrictionsType" minOccurs="0"/>
     *         &lt;element name="VoluntaryChanges" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareRestrictPrefGroup"/>
     *       &lt;attribute name="FareDisplayCurrency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *       &lt;attribute name="CurrencyOverride" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "advResTicketing",
        "stayRestrictions",
        "voluntaryChanges"
    })
    public static class FareRestrictPref {

        @XmlElement(name = "AdvResTicketing")
        protected AdvResTicketingType advResTicketing;
        @XmlElement(name = "StayRestrictions")
        protected StayRestrictionsType stayRestrictions;
        @XmlElement(name = "VoluntaryChanges")
        protected VoluntaryChangesType voluntaryChanges;
        @XmlAttribute(name = "FareDisplayCurrency")
        protected String fareDisplayCurrency;
        @XmlAttribute(name = "CurrencyOverride")
        protected String currencyOverride;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "FareRestriction")
        protected String fareRestriction;
        @XmlAttribute(name = "Date")
        protected String date;

        /**
         * Gets the value of the advResTicketing property.
         * 
         * @return
         *     possible object is
         *     {@link AdvResTicketingType }
         *     
         */
        public AdvResTicketingType getAdvResTicketing() {
            return advResTicketing;
        }

        /**
         * Sets the value of the advResTicketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdvResTicketingType }
         *     
         */
        public void setAdvResTicketing(AdvResTicketingType value) {
            this.advResTicketing = value;
        }

        /**
         * Gets the value of the stayRestrictions property.
         * 
         * @return
         *     possible object is
         *     {@link StayRestrictionsType }
         *     
         */
        public StayRestrictionsType getStayRestrictions() {
            return stayRestrictions;
        }

        /**
         * Sets the value of the stayRestrictions property.
         * 
         * @param value
         *     allowed object is
         *     {@link StayRestrictionsType }
         *     
         */
        public void setStayRestrictions(StayRestrictionsType value) {
            this.stayRestrictions = value;
        }

        /**
         * Gets the value of the voluntaryChanges property.
         * 
         * @return
         *     possible object is
         *     {@link VoluntaryChangesType }
         *     
         */
        public VoluntaryChangesType getVoluntaryChanges() {
            return voluntaryChanges;
        }

        /**
         * Sets the value of the voluntaryChanges property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoluntaryChangesType }
         *     
         */
        public void setVoluntaryChanges(VoluntaryChangesType value) {
            this.voluntaryChanges = value;
        }

        /**
         * Gets the value of the fareDisplayCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareDisplayCurrency() {
            return fareDisplayCurrency;
        }

        /**
         * Sets the value of the fareDisplayCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareDisplayCurrency(String value) {
            this.fareDisplayCurrency = value;
        }

        /**
         * Gets the value of the currencyOverride property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyOverride() {
            return currencyOverride;
        }

        /**
         * Sets the value of the currencyOverride property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyOverride(String value) {
            this.currencyOverride = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TicketDistribPrefType">
     *       &lt;attribute name="LastTicketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="FirstTicketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TicketDistribPref
        extends TicketDistribPrefType
    {

        @XmlAttribute(name = "LastTicketDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastTicketDate;
        @XmlAttribute(name = "FirstTicketDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar firstTicketDate;

        /**
         * Gets the value of the lastTicketDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastTicketDate() {
            return lastTicketDate;
        }

        /**
         * Sets the value of the lastTicketDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastTicketDate(XMLGregorianCalendar value) {
            this.lastTicketDate = value;
        }

        /**
         * Gets the value of the firstTicketDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFirstTicketDate() {
            return firstTicketDate;
        }

        /**
         * Sets the value of the firstTicketDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFirstTicketDate(XMLGregorianCalendar value) {
            this.firstTicketDate = value;
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
     *       &lt;attribute name="AllianceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="LoyaltyAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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

        @XmlAttribute(name = "AllianceAllowedInd")
        protected Boolean allianceAllowedInd;
        @XmlAttribute(name = "LoyaltyAllowedInd")
        protected Boolean loyaltyAllowedInd;

        /**
         * Gets the value of the allianceAllowedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllianceAllowedInd() {
            return allianceAllowedInd;
        }

        /**
         * Sets the value of the allianceAllowedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllianceAllowedInd(Boolean value) {
            this.allianceAllowedInd = value;
        }

        /**
         * Gets the value of the loyaltyAllowedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLoyaltyAllowedInd() {
            return loyaltyAllowedInd;
        }

        /**
         * Sets the value of the loyaltyAllowedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLoyaltyAllowedInd(Boolean value) {
            this.loyaltyAllowedInd = value;
        }

    }

}
