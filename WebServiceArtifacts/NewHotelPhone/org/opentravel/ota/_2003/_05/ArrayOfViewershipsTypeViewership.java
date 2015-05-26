
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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ArrayOfViewershipsTypeViewership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfViewershipsTypeViewership">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Viewership" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ViewershipCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ViewershipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SystemCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SystemCode" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SystemCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProfileTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewershipProfileType" minOccurs="0"/>
 *                   &lt;element name="ProfileRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfUniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfileType" minOccurs="0"/>
 *                   &lt;element name="LocationCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LocationCode" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LocationCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BookingChannelCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BookingChannelCode" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ChannelCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DistributorTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewershipDistributorType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ViewershipRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ViewOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfViewershipsTypeViewership", propOrder = {
    "viewership"
})
public class ArrayOfViewershipsTypeViewership {

    @XmlElement(name = "Viewership")
    protected List<ArrayOfViewershipsTypeViewership.Viewership> viewership;

    /**
     * Gets the value of the viewership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfViewershipsTypeViewership.Viewership }
     * 
     * 
     */
    public List<ArrayOfViewershipsTypeViewership.Viewership> getViewership() {
        if (viewership == null) {
            viewership = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership>();
        }
        return this.viewership;
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
     *         &lt;element name="ViewershipCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ViewershipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SystemCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SystemCode" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SystemCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProfileTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewershipProfileType" minOccurs="0"/>
     *         &lt;element name="ProfileRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfUniqueID_Type" minOccurs="0"/>
     *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfileType" minOccurs="0"/>
     *         &lt;element name="LocationCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LocationCode" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LocationCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BookingChannelCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BookingChannelCode" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ChannelCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DistributorTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewershipDistributorType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ViewershipRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ViewOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "viewershipCodes",
        "systemCodes",
        "profileTypes",
        "profileRefs",
        "profiles",
        "locationCodes",
        "bookingChannelCodes",
        "distributorTypes"
    })
    public static class Viewership {

        @XmlElement(name = "ViewershipCodes")
        protected ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes viewershipCodes;
        @XmlElement(name = "SystemCodes")
        protected ArrayOfViewershipsTypeViewership.Viewership.SystemCodes systemCodes;
        @XmlElement(name = "ProfileTypes")
        protected ArrayOfViewershipsTypeViewershipProfileType profileTypes;
        @XmlElement(name = "ProfileRefs")
        protected ArrayOfUniqueIDType profileRefs;
        @XmlElement(name = "Profiles")
        protected ArrayOfProfileType profiles;
        @XmlElement(name = "LocationCodes")
        protected ArrayOfViewershipsTypeViewership.Viewership.LocationCodes locationCodes;
        @XmlElement(name = "BookingChannelCodes")
        protected ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes bookingChannelCodes;
        @XmlElement(name = "DistributorTypes")
        protected ArrayOfViewershipsTypeViewershipDistributorType distributorTypes;
        @XmlAttribute(name = "ViewershipRPH")
        protected String viewershipRPH;
        @XmlAttribute(name = "ViewOnly")
        protected Boolean viewOnly;

        /**
         * Gets the value of the viewershipCodes property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes }
         *     
         */
        public ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes getViewershipCodes() {
            return viewershipCodes;
        }

        /**
         * Sets the value of the viewershipCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes }
         *     
         */
        public void setViewershipCodes(ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes value) {
            this.viewershipCodes = value;
        }

        /**
         * Gets the value of the systemCodes property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes }
         *     
         */
        public ArrayOfViewershipsTypeViewership.Viewership.SystemCodes getSystemCodes() {
            return systemCodes;
        }

        /**
         * Sets the value of the systemCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes }
         *     
         */
        public void setSystemCodes(ArrayOfViewershipsTypeViewership.Viewership.SystemCodes value) {
            this.systemCodes = value;
        }

        /**
         * Gets the value of the profileTypes property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewershipProfileType }
         *     
         */
        public ArrayOfViewershipsTypeViewershipProfileType getProfileTypes() {
            return profileTypes;
        }

        /**
         * Sets the value of the profileTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewershipProfileType }
         *     
         */
        public void setProfileTypes(ArrayOfViewershipsTypeViewershipProfileType value) {
            this.profileTypes = value;
        }

        /**
         * Gets the value of the profileRefs property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfUniqueIDType }
         *     
         */
        public ArrayOfUniqueIDType getProfileRefs() {
            return profileRefs;
        }

        /**
         * Sets the value of the profileRefs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfUniqueIDType }
         *     
         */
        public void setProfileRefs(ArrayOfUniqueIDType value) {
            this.profileRefs = value;
        }

        /**
         * Gets the value of the profiles property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfProfileType }
         *     
         */
        public ArrayOfProfileType getProfiles() {
            return profiles;
        }

        /**
         * Sets the value of the profiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfProfileType }
         *     
         */
        public void setProfiles(ArrayOfProfileType value) {
            this.profiles = value;
        }

        /**
         * Gets the value of the locationCodes property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes }
         *     
         */
        public ArrayOfViewershipsTypeViewership.Viewership.LocationCodes getLocationCodes() {
            return locationCodes;
        }

        /**
         * Sets the value of the locationCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes }
         *     
         */
        public void setLocationCodes(ArrayOfViewershipsTypeViewership.Viewership.LocationCodes value) {
            this.locationCodes = value;
        }

        /**
         * Gets the value of the bookingChannelCodes property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes }
         *     
         */
        public ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes getBookingChannelCodes() {
            return bookingChannelCodes;
        }

        /**
         * Sets the value of the bookingChannelCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes }
         *     
         */
        public void setBookingChannelCodes(ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes value) {
            this.bookingChannelCodes = value;
        }

        /**
         * Gets the value of the distributorTypes property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewershipDistributorType }
         *     
         */
        public ArrayOfViewershipsTypeViewershipDistributorType getDistributorTypes() {
            return distributorTypes;
        }

        /**
         * Sets the value of the distributorTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewershipDistributorType }
         *     
         */
        public void setDistributorTypes(ArrayOfViewershipsTypeViewershipDistributorType value) {
            this.distributorTypes = value;
        }

        /**
         * Gets the value of the viewershipRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getViewershipRPH() {
            return viewershipRPH;
        }

        /**
         * Sets the value of the viewershipRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setViewershipRPH(String value) {
            this.viewershipRPH = value;
        }

        /**
         * Gets the value of the viewOnly property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isViewOnly() {
            return viewOnly;
        }

        /**
         * Sets the value of the viewOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setViewOnly(Boolean value) {
            this.viewOnly = value;
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
         *         &lt;element name="BookingChannelCode" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ChannelCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bookingChannelCode"
        })
        public static class BookingChannelCodes {

            @XmlElement(name = "BookingChannelCode")
            protected List<ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode> bookingChannelCode;
            @XmlAttribute(name = "ChannelCodesInclusive")
            protected Boolean channelCodesInclusive;

            /**
             * Gets the value of the bookingChannelCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bookingChannelCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBookingChannelCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode }
             * 
             * 
             */
            public List<ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode> getBookingChannelCode() {
                if (bookingChannelCode == null) {
                    bookingChannelCode = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode>();
                }
                return this.bookingChannelCode;
            }

            /**
             * Gets the value of the channelCodesInclusive property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isChannelCodesInclusive() {
                return channelCodesInclusive;
            }

            /**
             * Sets the value of the channelCodesInclusive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setChannelCodesInclusive(Boolean value) {
                this.channelCodesInclusive = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
            public static class BookingChannelCode {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "RestrictedDisplayIndicator")
                protected Boolean restrictedDisplayIndicator;
                @XmlAttribute(name = "Sort")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger sort;

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
                 * Gets the value of the sort property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSort() {
                    return sort;
                }

                /**
                 * Sets the value of the sort property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSort(BigInteger value) {
                    this.sort = value;
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
         *         &lt;element name="LocationCode" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="LocationCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "locationCode"
        })
        public static class LocationCodes {

            @XmlElement(name = "LocationCode")
            protected List<ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode> locationCode;
            @XmlAttribute(name = "LocationCodesInclusive")
            protected Boolean locationCodesInclusive;

            /**
             * Gets the value of the locationCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the locationCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLocationCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode }
             * 
             * 
             */
            public List<ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode> getLocationCode() {
                if (locationCode == null) {
                    locationCode = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode>();
                }
                return this.locationCode;
            }

            /**
             * Gets the value of the locationCodesInclusive property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLocationCodesInclusive() {
                return locationCodesInclusive;
            }

            /**
             * Sets the value of the locationCodesInclusive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLocationCodesInclusive(Boolean value) {
                this.locationCodesInclusive = value;
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
             *       &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LocationCode {

                @XmlAttribute(name = "CityCode")
                protected String cityCode;
                @XmlAttribute(name = "StateProvinceCode")
                protected String stateProvinceCode;
                @XmlAttribute(name = "CountryCode")
                protected String countryCode;

                /**
                 * Gets the value of the cityCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCityCode() {
                    return cityCode;
                }

                /**
                 * Sets the value of the cityCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCityCode(String value) {
                    this.cityCode = value;
                }

                /**
                 * Gets the value of the stateProvinceCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateProvinceCode() {
                    return stateProvinceCode;
                }

                /**
                 * Sets the value of the stateProvinceCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateProvinceCode(String value) {
                    this.stateProvinceCode = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountryCode(String value) {
                    this.countryCode = value;
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
         *         &lt;element name="SystemCode" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SystemCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "systemCode"
        })
        public static class SystemCodes {

            @XmlElement(name = "SystemCode")
            protected List<ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode> systemCode;
            @XmlAttribute(name = "SystemCodesInclusive")
            protected Boolean systemCodesInclusive;

            /**
             * Gets the value of the systemCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the systemCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSystemCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode }
             * 
             * 
             */
            public List<ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode> getSystemCode() {
                if (systemCode == null) {
                    systemCode = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode>();
                }
                return this.systemCode;
            }

            /**
             * Gets the value of the systemCodesInclusive property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSystemCodesInclusive() {
                return systemCodesInclusive;
            }

            /**
             * Sets the value of the systemCodesInclusive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSystemCodesInclusive(Boolean value) {
                this.systemCodesInclusive = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
            public static class SystemCode {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "RestrictedDisplayIndicator")
                protected Boolean restrictedDisplayIndicator;
                @XmlAttribute(name = "Sort")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger sort;

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
                 * Gets the value of the sort property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSort() {
                    return sort;
                }

                /**
                 * Sets the value of the sort property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSort(BigInteger value) {
                    this.sort = value;
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
         *         &lt;element name="ViewershipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "viewershipCode"
        })
        public static class ViewershipCodes {

            @XmlElement(name = "ViewershipCode")
            protected String viewershipCode;

            /**
             * Gets the value of the viewershipCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getViewershipCode() {
                return viewershipCode;
            }

            /**
             * Sets the value of the viewershipCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setViewershipCode(String value) {
                this.viewershipCode = value;
            }

        }

    }

}
