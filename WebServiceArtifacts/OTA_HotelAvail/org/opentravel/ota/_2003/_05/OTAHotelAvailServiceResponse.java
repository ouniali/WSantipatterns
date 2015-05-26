
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="OTA_HotelAvailRS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="Criteria" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelSearchCriterionType" minOccurs="0"/>
 *                     &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfErrorType" minOccurs="0"/>
 *                     &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfWarningType" minOccurs="0"/>
 *                     &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions_Type" minOccurs="0"/>
 *                     &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/>
 *                     &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo1" minOccurs="0"/>
 *                     &lt;element name="Areas" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAreasTypeArea" minOccurs="0"/>
 *                     &lt;element name="RoomStays" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
 *                                       &lt;sequence>
 *                                         &lt;element name="Reference" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                                                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                               &lt;/extension>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
 *                                       &lt;attribute name="ResponseType" default="PropertyList">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="PropertyList"/>
 *                                             &lt;enumeration value="AreaList"/>
 *                                             &lt;enumeration value="PropertyRateList"/>
 *                                             &lt;enumeration value="RateInfoDetails"/>
 *                                             &lt;enumeration value="ProfilePrefs"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Services" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServicesTypeService" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IntCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "otaHotelAvailRS"
})
@XmlRootElement(name = "OTA_HotelAvailServiceResponse")
public class OTAHotelAvailServiceResponse {

    @XmlElement(name = "OTA_HotelAvailRS")
    protected OTAHotelAvailServiceResponse.OTAHotelAvailRS otaHotelAvailRS;

    /**
     * Gets the value of the otaHotelAvailRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailServiceResponse.OTAHotelAvailRS }
     *     
     */
    public OTAHotelAvailServiceResponse.OTAHotelAvailRS getOTAHotelAvailRS() {
        return otaHotelAvailRS;
    }

    /**
     * Sets the value of the otaHotelAvailRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailServiceResponse.OTAHotelAvailRS }
     *     
     */
    public void setOTAHotelAvailRS(OTAHotelAvailServiceResponse.OTAHotelAvailRS value) {
        this.otaHotelAvailRS = value;
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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="Criteria" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelSearchCriterionType" minOccurs="0"/>
     *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfErrorType" minOccurs="0"/>
     *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfWarningType" minOccurs="0"/>
     *           &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions_Type" minOccurs="0"/>
     *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/>
     *           &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo1" minOccurs="0"/>
     *           &lt;element name="Areas" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAreasTypeArea" minOccurs="0"/>
     *           &lt;element name="RoomStays" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
     *                             &lt;sequence>
     *                               &lt;element name="Reference" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *                                       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                     &lt;/extension>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                             &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
     *                             &lt;attribute name="ResponseType" default="PropertyList">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="PropertyList"/>
     *                                   &lt;enumeration value="AreaList"/>
     *                                   &lt;enumeration value="PropertyRateList"/>
     *                                   &lt;enumeration value="RateInfoDetails"/>
     *                                   &lt;enumeration value="ProfilePrefs"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/attribute>
     *                             &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;/extension>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                   &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Services" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServicesTypeService" minOccurs="0"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IntCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "criteriaOrErrorsOrWarnings"
    })
    public static class OTAHotelAvailRS {

        @XmlElements({
            @XmlElement(name = "Criteria", type = ArrayOfHotelSearchCriterionType.class),
            @XmlElement(name = "Errors", type = ArrayOfErrorType.class),
            @XmlElement(name = "Warnings", type = ArrayOfWarningType.class),
            @XmlElement(name = "TPA_Extensions", type = TPAExtensionsType.class),
            @XmlElement(name = "Success", type = SuccessType.class),
            @XmlElement(name = "Profiles", type = ArrayOfProfilesTypeProfileInfo1 .class),
            @XmlElement(name = "Areas", type = ArrayOfAreasTypeArea.class),
            @XmlElement(name = "RoomStays", type = OTAHotelAvailServiceResponse.OTAHotelAvailRS.RoomStays.class),
            @XmlElement(name = "Services", type = ArrayOfServicesTypeService.class)
        })
        protected List<Object> criteriaOrErrorsOrWarnings;
        @XmlAttribute(name = "TimeStamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timeStamp;
        @XmlAttribute(name = "SequenceNmbr")
        protected String sequenceNmbr;
        @XmlAttribute(name = "URL")
        protected String url;
        @XmlAttribute(name = "IntCode")
        protected String intCode;

        /**
         * Gets the value of the criteriaOrErrorsOrWarnings property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the criteriaOrErrorsOrWarnings property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCriteriaOrErrorsOrWarnings().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfHotelSearchCriterionType }
         * {@link ArrayOfErrorType }
         * {@link ArrayOfWarningType }
         * {@link TPAExtensionsType }
         * {@link SuccessType }
         * {@link ArrayOfProfilesTypeProfileInfo1 }
         * {@link ArrayOfAreasTypeArea }
         * {@link OTAHotelAvailServiceResponse.OTAHotelAvailRS.RoomStays }
         * {@link ArrayOfServicesTypeService }
         * 
         * 
         */
        public List<Object> getCriteriaOrErrorsOrWarnings() {
            if (criteriaOrErrorsOrWarnings == null) {
                criteriaOrErrorsOrWarnings = new ArrayList<Object>();
            }
            return this.criteriaOrErrorsOrWarnings;
        }

        /**
         * Gets the value of the timeStamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimeStamp() {
            return timeStamp;
        }

        /**
         * Sets the value of the timeStamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimeStamp(XMLGregorianCalendar value) {
            this.timeStamp = value;
        }

        /**
         * Gets the value of the sequenceNmbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequenceNmbr() {
            return sequenceNmbr;
        }

        /**
         * Sets the value of the sequenceNmbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequenceNmbr(String value) {
            this.sequenceNmbr = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURL() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURL(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the intCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntCode() {
            return intCode;
        }

        /**
         * Sets the value of the intCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntCode(String value) {
            this.intCode = value;
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
         *         &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
         *                 &lt;sequence>
         *                   &lt;element name="Reference" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
         *                           &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                 &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
         *                 &lt;attribute name="ResponseType" default="PropertyList">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="PropertyList"/>
         *                       &lt;enumeration value="AreaList"/>
         *                       &lt;enumeration value="PropertyRateList"/>
         *                       &lt;enumeration value="RateInfoDetails"/>
         *                       &lt;enumeration value="ProfilePrefs"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "roomStay"
        })
        public static class RoomStays {

            @XmlElement(name = "RoomStay")
            protected List<OTAHotelAvailServiceResponse.OTAHotelAvailRS.RoomStays.RoomStay> roomStay;
            @XmlAttribute(name = "MoreIndicator")
            protected String moreIndicator;

            /**
             * Gets the value of the roomStay property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the roomStay property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoomStay().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAHotelAvailServiceResponse.OTAHotelAvailRS.RoomStays.RoomStay }
             * 
             * 
             */
            public List<OTAHotelAvailServiceResponse.OTAHotelAvailRS.RoomStays.RoomStay> getRoomStay() {
                if (roomStay == null) {
                    roomStay = new ArrayList<OTAHotelAvailServiceResponse.OTAHotelAvailRS.RoomStays.RoomStay>();
                }
                return this.roomStay;
            }

            /**
             * Gets the value of the moreIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoreIndicator() {
                return moreIndicator;
            }

            /**
             * Sets the value of the moreIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoreIndicator(String value) {
                this.moreIndicator = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
             *       &lt;sequence>
             *         &lt;element name="Reference" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
             *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
             *       &lt;attribute name="ResponseType" default="PropertyList">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="PropertyList"/>
             *             &lt;enumeration value="AreaList"/>
             *             &lt;enumeration value="PropertyRateList"/>
             *             &lt;enumeration value="RateInfoDetails"/>
             *             &lt;enumeration value="ProfilePrefs"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "reference",
                "serviceRPHs"
            })
            public static class RoomStay
                extends RoomStayType
            {

                @XmlElement(name = "Reference")
                protected OTAHotelAvailServiceResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference reference;
                @XmlElement(name = "ServiceRPHs")
                protected ArrayOfServiceRPHsTypeServiceRPH serviceRPHs;
                @XmlAttribute(name = "IsAlternate")
                protected Boolean isAlternate;
                @XmlAttribute(name = "AvailabilityStatus")
                protected RateIndicatorType availabilityStatus;
                @XmlAttribute(name = "ResponseType")
                protected String responseType;
                @XmlAttribute(name = "RoomStayCandidateRPH")
                protected String roomStayCandidateRPH;
                @XmlAttribute(name = "MoreDataEchoToken")
                protected String moreDataEchoToken;
                @XmlAttribute(name = "InfoSource")
                protected String infoSource;

                /**
                 * Gets the value of the reference property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAHotelAvailServiceResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference }
                 *     
                 */
                public OTAHotelAvailServiceResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference getReference() {
                    return reference;
                }

                /**
                 * Sets the value of the reference property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAHotelAvailServiceResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference }
                 *     
                 */
                public void setReference(OTAHotelAvailServiceResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference value) {
                    this.reference = value;
                }

                /**
                 * Gets the value of the serviceRPHs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ArrayOfServiceRPHsTypeServiceRPH }
                 *     
                 */
                public ArrayOfServiceRPHsTypeServiceRPH getServiceRPHs() {
                    return serviceRPHs;
                }

                /**
                 * Sets the value of the serviceRPHs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ArrayOfServiceRPHsTypeServiceRPH }
                 *     
                 */
                public void setServiceRPHs(ArrayOfServiceRPHsTypeServiceRPH value) {
                    this.serviceRPHs = value;
                }

                /**
                 * Gets the value of the isAlternate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isIsAlternate() {
                    if (isAlternate == null) {
                        return false;
                    } else {
                        return isAlternate;
                    }
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

                /**
                 * Gets the value of the availabilityStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RateIndicatorType }
                 *     
                 */
                public RateIndicatorType getAvailabilityStatus() {
                    return availabilityStatus;
                }

                /**
                 * Sets the value of the availabilityStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RateIndicatorType }
                 *     
                 */
                public void setAvailabilityStatus(RateIndicatorType value) {
                    this.availabilityStatus = value;
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
                    if (responseType == null) {
                        return "PropertyList";
                    } else {
                        return responseType;
                    }
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
                 *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Reference
                    extends UniqueIDType
                {

                    @XmlAttribute(name = "DateTime")
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar dateTime;

                    /**
                     * Gets the value of the dateTime property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDateTime() {
                        return dateTime;
                    }

                    /**
                     * Sets the value of the dateTime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDateTime(XMLGregorianCalendar value) {
                        this.dateTime = value;
                    }

                }

            }

        }

    }

}
