
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ArrayOfOTA_HotelRatePlanRQRatePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOTA_HotelRatePlanRQRatePlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePlan" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DateRange" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DestinationSystemsCode" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDestinationSystemCodesTypeDestinationSystemCode" minOccurs="0"/>
 *                   &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidatesTypeRatePlanCandidate" minOccurs="0"/>
 *                   &lt;element name="Offers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="HotelRef" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PropertyClassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ArchitecturalStyleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="SupplierIntegrationLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="HotelRatePlanRequestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfOTA_HotelRatePlanRQRatePlan", propOrder = {
    "ratePlan"
})
public class ArrayOfOTAHotelRatePlanRQRatePlan {

    @XmlElement(name = "RatePlan")
    protected List<ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan> ratePlan;

    /**
     * Gets the value of the ratePlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan }
     * 
     * 
     */
    public List<ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan> getRatePlan() {
        if (ratePlan == null) {
            ratePlan = new ArrayList<ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan>();
        }
        return this.ratePlan;
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
     *         &lt;element name="DateRange" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DestinationSystemsCode" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDestinationSystemCodesTypeDestinationSystemCode" minOccurs="0"/>
     *         &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidatesTypeRatePlanCandidate" minOccurs="0"/>
     *         &lt;element name="Offers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
     *                 &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PropertyClassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ArchitecturalStyleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SupplierIntegrationLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="HotelRatePlanRequestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dateRange",
        "destinationSystemsCode",
        "ratePlanCandidates",
        "offers",
        "hotelRef",
        "tpaExtensions"
    })
    public static class RatePlan {

        @XmlElement(name = "DateRange")
        protected ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange dateRange;
        @XmlElement(name = "DestinationSystemsCode")
        protected ArrayOfDestinationSystemCodesTypeDestinationSystemCode destinationSystemsCode;
        @XmlElement(name = "RatePlanCandidates")
        protected ArrayOfRatePlanCandidatesTypeRatePlanCandidate ratePlanCandidates;
        @XmlElement(name = "Offers")
        protected ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.Offers offers;
        @XmlElement(name = "HotelRef")
        protected ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.HotelRef hotelRef;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "HotelRatePlanRequestIdentifier")
        protected String hotelRatePlanRequestIdentifier;

        /**
         * Gets the value of the dateRange property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange }
         *     
         */
        public ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange getDateRange() {
            return dateRange;
        }

        /**
         * Sets the value of the dateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange }
         *     
         */
        public void setDateRange(ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange value) {
            this.dateRange = value;
        }

        /**
         * Gets the value of the destinationSystemsCode property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfDestinationSystemCodesTypeDestinationSystemCode }
         *     
         */
        public ArrayOfDestinationSystemCodesTypeDestinationSystemCode getDestinationSystemsCode() {
            return destinationSystemsCode;
        }

        /**
         * Sets the value of the destinationSystemsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfDestinationSystemCodesTypeDestinationSystemCode }
         *     
         */
        public void setDestinationSystemsCode(ArrayOfDestinationSystemCodesTypeDestinationSystemCode value) {
            this.destinationSystemsCode = value;
        }

        /**
         * Gets the value of the ratePlanCandidates property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate }
         *     
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidate getRatePlanCandidates() {
            return ratePlanCandidates;
        }

        /**
         * Sets the value of the ratePlanCandidates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate }
         *     
         */
        public void setRatePlanCandidates(ArrayOfRatePlanCandidatesTypeRatePlanCandidate value) {
            this.ratePlanCandidates = value;
        }

        /**
         * Gets the value of the offers property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.Offers }
         *     
         */
        public ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.Offers getOffers() {
            return offers;
        }

        /**
         * Sets the value of the offers property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.Offers }
         *     
         */
        public void setOffers(ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.Offers value) {
            this.offers = value;
        }

        /**
         * Gets the value of the hotelRef property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.HotelRef }
         *     
         */
        public ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.HotelRef getHotelRef() {
            return hotelRef;
        }

        /**
         * Sets the value of the hotelRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.HotelRef }
         *     
         */
        public void setHotelRef(ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.HotelRef value) {
            this.hotelRef = value;
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
         * Gets the value of the hotelRatePlanRequestIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelRatePlanRequestIdentifier() {
            return hotelRatePlanRequestIdentifier;
        }

        /**
         * Sets the value of the hotelRatePlanRequestIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelRatePlanRequestIdentifier(String value) {
            this.hotelRatePlanRequestIdentifier = value;
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
         *       &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DateRange {

            @XmlAttribute(name = "Start", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar end;

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
         *       &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PropertyClassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ArchitecturalStyleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SupplierIntegrationLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
            @XmlAttribute(name = "SegmentCategoryCode")
            protected String segmentCategoryCode;
            @XmlAttribute(name = "PropertyClassCode")
            protected String propertyClassCode;
            @XmlAttribute(name = "ArchitecturalStyleCode")
            protected String architecturalStyleCode;
            @XmlAttribute(name = "SupplierIntegrationLevel")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger supplierIntegrationLevel;

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

            /**
             * Gets the value of the segmentCategoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegmentCategoryCode() {
                return segmentCategoryCode;
            }

            /**
             * Sets the value of the segmentCategoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegmentCategoryCode(String value) {
                this.segmentCategoryCode = value;
            }

            /**
             * Gets the value of the propertyClassCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPropertyClassCode() {
                return propertyClassCode;
            }

            /**
             * Sets the value of the propertyClassCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPropertyClassCode(String value) {
                this.propertyClassCode = value;
            }

            /**
             * Gets the value of the architecturalStyleCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArchitecturalStyleCode() {
                return architecturalStyleCode;
            }

            /**
             * Sets the value of the architecturalStyleCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArchitecturalStyleCode(String value) {
                this.architecturalStyleCode = value;
            }

            /**
             * Gets the value of the supplierIntegrationLevel property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSupplierIntegrationLevel() {
                return supplierIntegrationLevel;
            }

            /**
             * Sets the value of the supplierIntegrationLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSupplierIntegrationLevel(BigInteger value) {
                this.supplierIntegrationLevel = value;
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
         *         &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "offer"
        })
        public static class Offers {

            @XmlElement(name = "Offer")
            protected List<ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.Offers.Offer> offer;
            @XmlAttribute(name = "SendData")
            protected Boolean sendData;

            /**
             * Gets the value of the offer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the offer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOffer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.Offers.Offer }
             * 
             * 
             */
            public List<ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.Offers.Offer> getOffer() {
                if (offer == null) {
                    offer = new ArrayList<ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.Offers.Offer>();
                }
                return this.offer;
            }

            /**
             * Gets the value of the sendData property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSendData() {
                return sendData;
            }

            /**
             * Sets the value of the sendData property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSendData(Boolean value) {
                this.sendData = value;
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
             *       &lt;attribute name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Offer {

                @XmlAttribute(name = "OfferCode")
                protected String offerCode;

                /**
                 * Gets the value of the offerCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOfferCode() {
                    return offerCode;
                }

                /**
                 * Sets the value of the offerCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOfferCode(String value) {
                    this.offerCode = value;
                }

            }

        }

    }

}
