
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirReservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirItinerary" type="{http://www.opentravel.org/OTA/2003/05}AirItineraryType" minOccurs="0"/>
 *         &lt;element name="PriceInfo" type="{http://www.opentravel.org/OTA/2003/05}BookingPriceInfoType" minOccurs="0"/>
 *         &lt;element name="TravelerInfo" type="{http://www.opentravel.org/OTA/2003/05}TravelerInfoType" minOccurs="0"/>
 *         &lt;element name="Fulfillment" type="{http://www.opentravel.org/OTA/2003/05}FulfillmentType" minOccurs="0"/>
 *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="Queues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Queue" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueGroup"/>
 *                           &lt;attribute name="DateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="Text" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                           &lt;attribute name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingReferenceID" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                 &lt;attribute name="FlightRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *         &lt;element name="PricingOverview" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PricingIndicator" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PricingInfoGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Account" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="10" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="StatisticalCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                 &lt;attribute name="ValidatingAirlineCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                 &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                 &lt;attribute name="PriceType" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                 &lt;attribute name="NUC_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="LastModified" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirReservationType", propOrder = {
    "airItinerary",
    "priceInfo",
    "travelerInfo",
    "fulfillment",
    "ticketing",
    "queues",
    "bookingReferenceID",
    "comment",
    "pricingOverview"
})
public class AirReservationType {

    @XmlElement(name = "AirItinerary")
    protected AirItineraryType airItinerary;
    @XmlElement(name = "PriceInfo")
    protected BookingPriceInfoType priceInfo;
    @XmlElement(name = "TravelerInfo")
    protected TravelerInfoType travelerInfo;
    @XmlElement(name = "Fulfillment")
    protected FulfillmentType fulfillment;
    @XmlElement(name = "Ticketing")
    protected List<TicketingInfoType> ticketing;
    @XmlElement(name = "Queues")
    protected AirReservationType.Queues queues;
    @XmlElement(name = "BookingReferenceID")
    protected List<AirReservationType.BookingReferenceID> bookingReferenceID;
    @XmlElement(name = "Comment")
    protected FormattedTextTextType comment;
    @XmlElement(name = "PricingOverview")
    protected AirReservationType.PricingOverview pricingOverview;
    @XmlAttribute(name = "LastModified")
    protected String lastModified;

    /**
     * Gets the value of the airItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType }
     *     
     */
    public AirItineraryType getAirItinerary() {
        return airItinerary;
    }

    /**
     * Sets the value of the airItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType }
     *     
     */
    public void setAirItinerary(AirItineraryType value) {
        this.airItinerary = value;
    }

    /**
     * Gets the value of the priceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BookingPriceInfoType }
     *     
     */
    public BookingPriceInfoType getPriceInfo() {
        return priceInfo;
    }

    /**
     * Sets the value of the priceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingPriceInfoType }
     *     
     */
    public void setPriceInfo(BookingPriceInfoType value) {
        this.priceInfo = value;
    }

    /**
     * Gets the value of the travelerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfoType }
     *     
     */
    public TravelerInfoType getTravelerInfo() {
        return travelerInfo;
    }

    /**
     * Sets the value of the travelerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfoType }
     *     
     */
    public void setTravelerInfo(TravelerInfoType value) {
        this.travelerInfo = value;
    }

    /**
     * Gets the value of the fulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentType }
     *     
     */
    public FulfillmentType getFulfillment() {
        return fulfillment;
    }

    /**
     * Sets the value of the fulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentType }
     *     
     */
    public void setFulfillment(FulfillmentType value) {
        this.fulfillment = value;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingInfoType }
     * 
     * 
     */
    public List<TicketingInfoType> getTicketing() {
        if (ticketing == null) {
            ticketing = new ArrayList<TicketingInfoType>();
        }
        return this.ticketing;
    }

    /**
     * Gets the value of the queues property.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationType.Queues }
     *     
     */
    public AirReservationType.Queues getQueues() {
        return queues;
    }

    /**
     * Sets the value of the queues property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationType.Queues }
     *     
     */
    public void setQueues(AirReservationType.Queues value) {
        this.queues = value;
    }

    /**
     * Gets the value of the bookingReferenceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingReferenceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingReferenceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirReservationType.BookingReferenceID }
     * 
     * 
     */
    public List<AirReservationType.BookingReferenceID> getBookingReferenceID() {
        if (bookingReferenceID == null) {
            bookingReferenceID = new ArrayList<AirReservationType.BookingReferenceID>();
        }
        return this.bookingReferenceID;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextTextType }
     *     
     */
    public FormattedTextTextType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextTextType }
     *     
     */
    public void setComment(FormattedTextTextType value) {
        this.comment = value;
    }

    /**
     * Gets the value of the pricingOverview property.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationType.PricingOverview }
     *     
     */
    public AirReservationType.PricingOverview getPricingOverview() {
        return pricingOverview;
    }

    /**
     * Sets the value of the pricingOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationType.PricingOverview }
     *     
     */
    public void setPricingOverview(AirReservationType.PricingOverview value) {
        this.pricingOverview = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModified(String value) {
        this.lastModified = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *       &lt;attribute name="FlightRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BookingReferenceID
        extends UniqueIDType
    {

        @XmlAttribute(name = "FlightRefNumberRPHList")
        protected List<String> flightRefNumberRPHList;

        /**
         * Gets the value of the flightRefNumberRPHList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightRefNumberRPHList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightRefNumberRPHList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFlightRefNumberRPHList() {
            if (flightRefNumberRPHList == null) {
                flightRefNumberRPHList = new ArrayList<String>();
            }
            return this.flightRefNumberRPHList;
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
     *         &lt;element name="PricingIndicator" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PricingInfoGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Account" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="10" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="StatisticalCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *       &lt;attribute name="ValidatingAirlineCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *       &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *       &lt;attribute name="PriceType" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *       &lt;attribute name="NUC_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pricingIndicator",
        "account",
        "comment"
    })
    public static class PricingOverview {

        @XmlElement(name = "PricingIndicator")
        protected List<AirReservationType.PricingOverview.PricingIndicator> pricingIndicator;
        @XmlElement(name = "Account")
        protected List<AirReservationType.PricingOverview.Account> account;
        @XmlElement(name = "Comment")
        protected List<FreeTextType> comment;
        @XmlAttribute(name = "StatisticalCode")
        protected String statisticalCode;
        @XmlAttribute(name = "ValidatingAirlineCode")
        protected String validatingAirlineCode;
        @XmlAttribute(name = "DepartureDate")
        protected String departureDate;
        @XmlAttribute(name = "PriceType")
        protected String priceType;
        @XmlAttribute(name = "NUC_Rate")
        protected BigDecimal nucRate;
        @XmlAttribute(name = "ExchangeRate")
        protected BigDecimal exchangeRate;

        /**
         * Gets the value of the pricingIndicator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pricingIndicator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPricingIndicator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirReservationType.PricingOverview.PricingIndicator }
         * 
         * 
         */
        public List<AirReservationType.PricingOverview.PricingIndicator> getPricingIndicator() {
            if (pricingIndicator == null) {
                pricingIndicator = new ArrayList<AirReservationType.PricingOverview.PricingIndicator>();
            }
            return this.pricingIndicator;
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
         * {@link AirReservationType.PricingOverview.Account }
         * 
         * 
         */
        public List<AirReservationType.PricingOverview.Account> getAccount() {
            if (account == null) {
                account = new ArrayList<AirReservationType.PricingOverview.Account>();
            }
            return this.account;
        }

        /**
         * Gets the value of the comment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeTextType }
         * 
         * 
         */
        public List<FreeTextType> getComment() {
            if (comment == null) {
                comment = new ArrayList<FreeTextType>();
            }
            return this.comment;
        }

        /**
         * Gets the value of the statisticalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatisticalCode() {
            return statisticalCode;
        }

        /**
         * Sets the value of the statisticalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatisticalCode(String value) {
            this.statisticalCode = value;
        }

        /**
         * Gets the value of the validatingAirlineCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidatingAirlineCode() {
            return validatingAirlineCode;
        }

        /**
         * Sets the value of the validatingAirlineCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidatingAirlineCode(String value) {
            this.validatingAirlineCode = value;
        }

        /**
         * Gets the value of the departureDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureDate() {
            return departureDate;
        }

        /**
         * Sets the value of the departureDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureDate(String value) {
            this.departureDate = value;
        }

        /**
         * Gets the value of the priceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceType() {
            return priceType;
        }

        /**
         * Sets the value of the priceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceType(String value) {
            this.priceType = value;
        }

        /**
         * Gets the value of the nucRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNUCRate() {
            return nucRate;
        }

        /**
         * Sets the value of the nucRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNUCRate(BigDecimal value) {
            this.nucRate = value;
        }

        /**
         * Gets the value of the exchangeRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getExchangeRate() {
            return exchangeRate;
        }

        /**
         * Sets the value of the exchangeRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setExchangeRate(BigDecimal value) {
            this.exchangeRate = value;
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

            @XmlAttribute(name = "Code", required = true)
            protected String code;

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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PricingInfoGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PricingIndicator {

            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "ExcludeInd")
            protected Boolean excludeInd;
            @XmlAttribute(name = "Qualifier")
            protected String qualifier;

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
             * Gets the value of the excludeInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isExcludeInd() {
                return excludeInd;
            }

            /**
             * Sets the value of the excludeInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setExcludeInd(Boolean value) {
                this.excludeInd = value;
            }

            /**
             * Gets the value of the qualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQualifier() {
                return qualifier;
            }

            /**
             * Sets the value of the qualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQualifier(String value) {
                this.qualifier = value;
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
     *       &lt;sequence>
     *         &lt;element name="Queue" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueGroup"/>
     *                 &lt;attribute name="DateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="Text" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *                 &lt;attribute name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *               &lt;/restriction>
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
    @XmlType(name = "", propOrder = {
        "queue"
    })
    public static class Queues {

        @XmlElement(name = "Queue", required = true)
        protected List<AirReservationType.Queues.Queue> queue;

        /**
         * Gets the value of the queue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirReservationType.Queues.Queue }
         * 
         * 
         */
        public List<AirReservationType.Queues.Queue> getQueue() {
            if (queue == null) {
                queue = new ArrayList<AirReservationType.Queues.Queue>();
            }
            return this.queue;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueGroup"/>
         *       &lt;attribute name="DateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="Text" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *       &lt;attribute name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Queue {

            @XmlAttribute(name = "DateTime")
            protected String dateTime;
            @XmlAttribute(name = "Text")
            protected String text;
            @XmlAttribute(name = "CarrierCode")
            protected String carrierCode;
            @XmlAttribute(name = "Operation")
            protected ActionType operation;
            @XmlAttribute(name = "PseudoCityCode")
            protected String pseudoCityCode;
            @XmlAttribute(name = "QueueNumber")
            protected String queueNumber;
            @XmlAttribute(name = "QueueCategory")
            protected String queueCategory;
            @XmlAttribute(name = "SystemCode")
            protected String systemCode;
            @XmlAttribute(name = "QueueID")
            protected String queueID;

            /**
             * Gets the value of the dateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateTime() {
                return dateTime;
            }

            /**
             * Sets the value of the dateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateTime(String value) {
                this.dateTime = value;
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
             * Gets the value of the carrierCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCarrierCode() {
                return carrierCode;
            }

            /**
             * Sets the value of the carrierCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCarrierCode(String value) {
                this.carrierCode = value;
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
             * Gets the value of the pseudoCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPseudoCityCode() {
                return pseudoCityCode;
            }

            /**
             * Sets the value of the pseudoCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPseudoCityCode(String value) {
                this.pseudoCityCode = value;
            }

            /**
             * Gets the value of the queueNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueueNumber() {
                return queueNumber;
            }

            /**
             * Sets the value of the queueNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueueNumber(String value) {
                this.queueNumber = value;
            }

            /**
             * Gets the value of the queueCategory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueueCategory() {
                return queueCategory;
            }

            /**
             * Sets the value of the queueCategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueueCategory(String value) {
                this.queueCategory = value;
            }

            /**
             * Gets the value of the systemCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSystemCode() {
                return systemCode;
            }

            /**
             * Sets the value of the systemCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSystemCode(String value) {
                this.systemCode = value;
            }

            /**
             * Gets the value of the queueID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueueID() {
                return queueID;
            }

            /**
             * Sets the value of the queueID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueueID(String value) {
                this.queueID = value;
            }

        }

    }

}
