
package org.opentravel.ota._2003._05;

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


/**
 * <p>Java class for TravelerInfoSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerInfoSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatsRequested" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="AirTravelerAvail" type="{http://www.opentravel.org/OTA/2003/05}TravelerInformationType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="PriceRequestInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PriceRequestInformationType">
 *                 &lt;sequence>
 *                   &lt;element name="FareRestrictionPref" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareRestrictPrefGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="20" minOccurs="0"/>
 *                   &lt;element name="DiscountPricing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightReference" maxOccurs="16" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="FlightRefNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountPricingGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SegmentOverride" maxOccurs="20" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SegmentNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                           &lt;attribute name="SegmentType" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="Connection"/>
 *                                 &lt;enumeration value="Stopover"/>
 *                                 &lt;enumeration value="TurnaroundPoint"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Account" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="CodeOnlyFaresInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LocationRequirement" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="LocalEmployee"/>
 *                                 &lt;enumeration value="LocalResident"/>
 *                                 &lt;enumeration value="LocalNationalityShipReg"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="State" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
 *                           &lt;attribute name="Country" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerInfoSummaryType", propOrder = {
    "seatsRequested",
    "airTravelerAvail",
    "priceRequestInformation"
})
public class TravelerInfoSummaryType {

    @XmlElement(name = "SeatsRequested")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected List<BigInteger> seatsRequested;
    @XmlElement(name = "AirTravelerAvail")
    protected List<TravelerInformationType> airTravelerAvail;
    @XmlElement(name = "PriceRequestInformation")
    protected TravelerInfoSummaryType.PriceRequestInformation priceRequestInformation;

    /**
     * Gets the value of the seatsRequested property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatsRequested property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatsRequested().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getSeatsRequested() {
        if (seatsRequested == null) {
            seatsRequested = new ArrayList<BigInteger>();
        }
        return this.seatsRequested;
    }

    /**
     * Gets the value of the airTravelerAvail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTravelerAvail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirTravelerAvail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInformationType }
     * 
     * 
     */
    public List<TravelerInformationType> getAirTravelerAvail() {
        if (airTravelerAvail == null) {
            airTravelerAvail = new ArrayList<TravelerInformationType>();
        }
        return this.airTravelerAvail;
    }

    /**
     * Gets the value of the priceRequestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfoSummaryType.PriceRequestInformation }
     *     
     */
    public TravelerInfoSummaryType.PriceRequestInformation getPriceRequestInformation() {
        return priceRequestInformation;
    }

    /**
     * Sets the value of the priceRequestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfoSummaryType.PriceRequestInformation }
     *     
     */
    public void setPriceRequestInformation(TravelerInfoSummaryType.PriceRequestInformation value) {
        this.priceRequestInformation = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PriceRequestInformationType">
     *       &lt;sequence>
     *         &lt;element name="FareRestrictionPref" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareRestrictPrefGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="20" minOccurs="0"/>
     *         &lt;element name="DiscountPricing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightReference" maxOccurs="16" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="FlightRefNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountPricingGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SegmentOverride" maxOccurs="20" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SegmentNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *                 &lt;attribute name="SegmentType" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="Connection"/>
     *                       &lt;enumeration value="Stopover"/>
     *                       &lt;enumeration value="TurnaroundPoint"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Account" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="CodeOnlyFaresInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LocationRequirement" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="LocalEmployee"/>
     *                       &lt;enumeration value="LocalResident"/>
     *                       &lt;enumeration value="LocalNationalityShipReg"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="State" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
     *                 &lt;attribute name="Country" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
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
        "fareRestrictionPref",
        "tax",
        "discountPricing",
        "segmentOverride",
        "account",
        "locationRequirement"
    })
    public static class PriceRequestInformation
        extends PriceRequestInformationType
    {

        @XmlElement(name = "FareRestrictionPref")
        protected List<TravelerInfoSummaryType.PriceRequestInformation.FareRestrictionPref> fareRestrictionPref;
        @XmlElement(name = "Tax")
        protected List<AirTaxType> tax;
        @XmlElement(name = "DiscountPricing")
        protected TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing discountPricing;
        @XmlElement(name = "SegmentOverride")
        protected List<TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride> segmentOverride;
        @XmlElement(name = "Account")
        protected List<TravelerInfoSummaryType.PriceRequestInformation.Account> account;
        @XmlElement(name = "LocationRequirement")
        protected TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement locationRequirement;

        /**
         * Gets the value of the fareRestrictionPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareRestrictionPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareRestrictionPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelerInfoSummaryType.PriceRequestInformation.FareRestrictionPref }
         * 
         * 
         */
        public List<TravelerInfoSummaryType.PriceRequestInformation.FareRestrictionPref> getFareRestrictionPref() {
            if (fareRestrictionPref == null) {
                fareRestrictionPref = new ArrayList<TravelerInfoSummaryType.PriceRequestInformation.FareRestrictionPref>();
            }
            return this.fareRestrictionPref;
        }

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirTaxType }
         * 
         * 
         */
        public List<AirTaxType> getTax() {
            if (tax == null) {
                tax = new ArrayList<AirTaxType>();
            }
            return this.tax;
        }

        /**
         * Gets the value of the discountPricing property.
         * 
         * @return
         *     possible object is
         *     {@link TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing }
         *     
         */
        public TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing getDiscountPricing() {
            return discountPricing;
        }

        /**
         * Sets the value of the discountPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing }
         *     
         */
        public void setDiscountPricing(TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing value) {
            this.discountPricing = value;
        }

        /**
         * Gets the value of the segmentOverride property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentOverride property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentOverride().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride }
         * 
         * 
         */
        public List<TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride> getSegmentOverride() {
            if (segmentOverride == null) {
                segmentOverride = new ArrayList<TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride>();
            }
            return this.segmentOverride;
        }

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelerInfoSummaryType.PriceRequestInformation.Account }
         * 
         * 
         */
        public List<TravelerInfoSummaryType.PriceRequestInformation.Account> getAccount() {
            if (account == null) {
                account = new ArrayList<TravelerInfoSummaryType.PriceRequestInformation.Account>();
            }
            return this.account;
        }

        /**
         * Gets the value of the locationRequirement property.
         * 
         * @return
         *     possible object is
         *     {@link TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement }
         *     
         */
        public TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement getLocationRequirement() {
            return locationRequirement;
        }

        /**
         * Sets the value of the locationRequirement property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement }
         *     
         */
        public void setLocationRequirement(TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement value) {
            this.locationRequirement = value;
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
         *       &lt;attribute name="CodeOnlyFaresInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Account {

            @XmlAttribute(name = "CodeOnlyFaresInd")
            protected Boolean codeOnlyFaresInd;
            @XmlAttribute(name = "Code", required = true)
            protected String code;

            /**
             * Gets the value of the codeOnlyFaresInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCodeOnlyFaresInd() {
                return codeOnlyFaresInd;
            }

            /**
             * Sets the value of the codeOnlyFaresInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCodeOnlyFaresInd(Boolean value) {
                this.codeOnlyFaresInd = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
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
         *         &lt;element name="FlightReference" maxOccurs="16" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="FlightRefNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountPricingGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flightReference"
        })
        public static class DiscountPricing {

            @XmlElement(name = "FlightReference")
            protected List<TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference> flightReference;
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
             * Gets the value of the flightReference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightReference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference }
             * 
             * 
             */
            public List<TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference> getFlightReference() {
                if (flightReference == null) {
                    flightReference = new ArrayList<TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference>();
                }
                return this.flightReference;
            }

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


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="FlightRefNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FlightReference {

                @XmlAttribute(name = "FlightRefNumber", required = true)
                protected String flightRefNumber;

                /**
                 * Gets the value of the flightRefNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFlightRefNumber() {
                    return flightRefNumber;
                }

                /**
                 * Sets the value of the flightRefNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFlightRefNumber(String value) {
                    this.flightRefNumber = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareRestrictPrefGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FareRestrictionPref {

            @XmlAttribute(name = "PreferLevel")
            protected PreferLevelType preferLevel;
            @XmlAttribute(name = "FareRestriction")
            protected String fareRestriction;
            @XmlAttribute(name = "Date")
            protected String date;

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
         *       &lt;attribute name="Type">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="LocalEmployee"/>
         *             &lt;enumeration value="LocalResident"/>
         *             &lt;enumeration value="LocalNationalityShipReg"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="State" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
         *       &lt;attribute name="Country" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LocationRequirement {

            @XmlAttribute(name = "Type")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String type;
            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "Country")
            protected String country;

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
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

            /**
             * Gets the value of the country property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountry() {
                return country;
            }

            /**
             * Sets the value of the country property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountry(String value) {
                this.country = value;
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
         *       &lt;attribute name="SegmentNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
         *       &lt;attribute name="SegmentType" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="Connection"/>
         *             &lt;enumeration value="Stopover"/>
         *             &lt;enumeration value="TurnaroundPoint"/>
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
        public static class SegmentOverride {

            @XmlAttribute(name = "SegmentNumber", required = true)
            protected int segmentNumber;
            @XmlAttribute(name = "SegmentType", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String segmentType;

            /**
             * Gets the value of the segmentNumber property.
             * 
             */
            public int getSegmentNumber() {
                return segmentNumber;
            }

            /**
             * Sets the value of the segmentNumber property.
             * 
             */
            public void setSegmentNumber(int value) {
                this.segmentNumber = value;
            }

            /**
             * Gets the value of the segmentType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegmentType() {
                return segmentType;
            }

            /**
             * Sets the value of the segmentType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegmentType(String value) {
                this.segmentType = value;
            }

        }

    }

}
