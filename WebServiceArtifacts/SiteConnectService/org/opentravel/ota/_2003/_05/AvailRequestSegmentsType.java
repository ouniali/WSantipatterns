
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


/**
 * <p>Java class for AvailRequestSegmentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailRequestSegmentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailRequestSegment" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StayDateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
 *                   &lt;element name="RateRange" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateRangeGroup"/>
 *                           &lt;attribute name="RoomStayCandidateRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}RatePlanCandidatesType" minOccurs="0"/>
 *                   &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType" minOccurs="0"/>
 *                   &lt;element name="RoomStayCandidates" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RoomStayCandidate" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
 *                                     &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="HotelSearchCriteria" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ResponseTypeGroup"/>
 *                 &lt;attribute name="AvailReqType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to16">
 *                       &lt;enumeration value="Room"/>
 *                       &lt;enumeration value="NonRoom"/>
 *                       &lt;enumeration value="Both"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                 &lt;attribute name="InfoSource" type="{http://www.opentravel.org/OTA/2003/05}InfoSourceType" />
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
@XmlType(name = "AvailRequestSegmentsType", propOrder = {
    "availRequestSegment"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.OTAHotelAvailRQ.AvailRequestSegments.class
})
public class AvailRequestSegmentsType {

    @XmlElement(name = "AvailRequestSegment", required = true)
    protected List<AvailRequestSegmentsType.AvailRequestSegment> availRequestSegment;

    /**
     * Gets the value of the availRequestSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availRequestSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailRequestSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailRequestSegmentsType.AvailRequestSegment }
     * 
     * 
     */
    public List<AvailRequestSegmentsType.AvailRequestSegment> getAvailRequestSegment() {
        if (availRequestSegment == null) {
            availRequestSegment = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment>();
        }
        return this.availRequestSegment;
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
     *         &lt;element name="StayDateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
     *         &lt;element name="RateRange" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateRangeGroup"/>
     *                 &lt;attribute name="RoomStayCandidateRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}RatePlanCandidatesType" minOccurs="0"/>
     *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType" minOccurs="0"/>
     *         &lt;element name="RoomStayCandidates" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RoomStayCandidate" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
     *                           &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="HotelSearchCriteria" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ResponseTypeGroup"/>
     *       &lt;attribute name="AvailReqType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to16">
     *             &lt;enumeration value="Room"/>
     *             &lt;enumeration value="NonRoom"/>
     *             &lt;enumeration value="Both"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="MoreDataEchoToken" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *       &lt;attribute name="InfoSource" type="{http://www.opentravel.org/OTA/2003/05}InfoSourceType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stayDateRange",
        "rateRange",
        "ratePlanCandidates",
        "profiles",
        "roomStayCandidates",
        "hotelSearchCriteria",
        "tpaExtensions"
    })
    public static class AvailRequestSegment {

        @XmlElement(name = "StayDateRange")
        protected DateTimeSpanType stayDateRange;
        @XmlElement(name = "RateRange")
        protected List<AvailRequestSegmentsType.AvailRequestSegment.RateRange> rateRange;
        @XmlElement(name = "RatePlanCandidates")
        protected RatePlanCandidatesType ratePlanCandidates;
        @XmlElement(name = "Profiles")
        protected ProfilesType profiles;
        @XmlElement(name = "RoomStayCandidates")
        protected AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates roomStayCandidates;
        @XmlElement(name = "HotelSearchCriteria")
        protected AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria hotelSearchCriteria;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "AvailReqType")
        protected String availReqType;
        @XmlAttribute(name = "MoreDataEchoToken")
        protected String moreDataEchoToken;
        @XmlAttribute(name = "InfoSource")
        protected String infoSource;
        @XmlAttribute(name = "ResponseType")
        protected String responseType;

        /**
         * Gets the value of the stayDateRange property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimeSpanType }
         *     
         */
        public DateTimeSpanType getStayDateRange() {
            return stayDateRange;
        }

        /**
         * Sets the value of the stayDateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeSpanType }
         *     
         */
        public void setStayDateRange(DateTimeSpanType value) {
            this.stayDateRange = value;
        }

        /**
         * Gets the value of the rateRange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rateRange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRateRange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AvailRequestSegmentsType.AvailRequestSegment.RateRange }
         * 
         * 
         */
        public List<AvailRequestSegmentsType.AvailRequestSegment.RateRange> getRateRange() {
            if (rateRange == null) {
                rateRange = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment.RateRange>();
            }
            return this.rateRange;
        }

        /**
         * Gets the value of the ratePlanCandidates property.
         * 
         * @return
         *     possible object is
         *     {@link RatePlanCandidatesType }
         *     
         */
        public RatePlanCandidatesType getRatePlanCandidates() {
            return ratePlanCandidates;
        }

        /**
         * Sets the value of the ratePlanCandidates property.
         * 
         * @param value
         *     allowed object is
         *     {@link RatePlanCandidatesType }
         *     
         */
        public void setRatePlanCandidates(RatePlanCandidatesType value) {
            this.ratePlanCandidates = value;
        }

        /**
         * Gets the value of the profiles property.
         * 
         * @return
         *     possible object is
         *     {@link ProfilesType }
         *     
         */
        public ProfilesType getProfiles() {
            return profiles;
        }

        /**
         * Sets the value of the profiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProfilesType }
         *     
         */
        public void setProfiles(ProfilesType value) {
            this.profiles = value;
        }

        /**
         * Gets the value of the roomStayCandidates property.
         * 
         * @return
         *     possible object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates }
         *     
         */
        public AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates getRoomStayCandidates() {
            return roomStayCandidates;
        }

        /**
         * Sets the value of the roomStayCandidates property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates }
         *     
         */
        public void setRoomStayCandidates(AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates value) {
            this.roomStayCandidates = value;
        }

        /**
         * Gets the value of the hotelSearchCriteria property.
         * 
         * @return
         *     possible object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
         *     
         */
        public AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria getHotelSearchCriteria() {
            return hotelSearchCriteria;
        }

        /**
         * Sets the value of the hotelSearchCriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
         *     
         */
        public void setHotelSearchCriteria(AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria value) {
            this.hotelSearchCriteria = value;
        }

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
         * Gets the value of the availReqType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvailReqType() {
            return availReqType;
        }

        /**
         * Sets the value of the availReqType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvailReqType(String value) {
            this.availReqType = value;
        }

        /**
         * Gets the value of the moreDataEchoToken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoreDataEchoToken() {
            return moreDataEchoToken;
        }

        /**
         * Sets the value of the moreDataEchoToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoreDataEchoToken(String value) {
            this.moreDataEchoToken = value;
        }

        /**
         * Gets the value of the infoSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * Sets the value of the infoSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }

        /**
         * Gets the value of the responseType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseType() {
            return responseType;
        }

        /**
         * Sets the value of the responseType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseType(String value) {
            this.responseType = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HotelSearchCriteria
            extends HotelSearchCriteriaType
        {


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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateRangeGroup"/>
         *       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RateRange {

            @XmlAttribute(name = "RoomStayCandidateRPH")
            protected String roomStayCandidateRPH;
            @XmlAttribute(name = "MinRate")
            protected BigDecimal minRate;
            @XmlAttribute(name = "MaxRate")
            protected BigDecimal maxRate;
            @XmlAttribute(name = "FixedRate")
            protected BigDecimal fixedRate;
            @XmlAttribute(name = "RateTimeUnit")
            protected TimeUnitType rateTimeUnit;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the roomStayCandidateRPH property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomStayCandidateRPH() {
                return roomStayCandidateRPH;
            }

            /**
             * Sets the value of the roomStayCandidateRPH property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomStayCandidateRPH(String value) {
                this.roomStayCandidateRPH = value;
            }

            /**
             * Gets the value of the minRate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMinRate() {
                return minRate;
            }

            /**
             * Sets the value of the minRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMinRate(BigDecimal value) {
                this.minRate = value;
            }

            /**
             * Gets the value of the maxRate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMaxRate() {
                return maxRate;
            }

            /**
             * Sets the value of the maxRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMaxRate(BigDecimal value) {
                this.maxRate = value;
            }

            /**
             * Gets the value of the fixedRate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFixedRate() {
                return fixedRate;
            }

            /**
             * Sets the value of the fixedRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFixedRate(BigDecimal value) {
                this.fixedRate = value;
            }

            /**
             * Gets the value of the rateTimeUnit property.
             * 
             * @return
             *     possible object is
             *     {@link TimeUnitType }
             *     
             */
            public TimeUnitType getRateTimeUnit() {
                return rateTimeUnit;
            }

            /**
             * Sets the value of the rateTimeUnit property.
             * 
             * @param value
             *     allowed object is
             *     {@link TimeUnitType }
             *     
             */
            public void setRateTimeUnit(TimeUnitType value) {
                this.rateTimeUnit = value;
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
         *         &lt;element name="RoomStayCandidate" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
         *                 &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        @XmlType(name = "", propOrder = {
            "roomStayCandidate"
        })
        public static class RoomStayCandidates {

            @XmlElement(name = "RoomStayCandidate", required = true)
            protected List<AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate> roomStayCandidate;

            /**
             * Gets the value of the roomStayCandidate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the roomStayCandidate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoomStayCandidate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate }
             * 
             * 
             */
            public List<AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate> getRoomStayCandidate() {
                if (roomStayCandidate == null) {
                    roomStayCandidate = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate>();
                }
                return this.roomStayCandidate;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
             *       &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RoomStayCandidate
                extends RoomStayCandidateType
            {

                @XmlAttribute(name = "IsAlternate")
                protected Boolean isAlternate;

                /**
                 * Gets the value of the isAlternate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isIsAlternate() {
                    return isAlternate;
                }

                /**
                 * Sets the value of the isAlternate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setIsAlternate(Boolean value) {
                    this.isAlternate = value;
                }

            }

        }

    }

}
