
package org.tempuri.tws_hoteldetailsv3;

import java.math.BigDecimal;
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


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="StatusCode">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Hotel">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Location" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="searchingCity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="destinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="destinationId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="zip" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RefPoints" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="airportCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Descriptions" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VoucherRemark" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *                             &lt;element name="ShortDescription" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FreeTextShortDescription" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LongDescription" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FreeTextLongDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="languageID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="templateID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="textFieldType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Media" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Images" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Image" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="hotelID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="HotelImgID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Movies" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Movie" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="MovieId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="activityId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Amenities" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Amenity" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="amenityID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RoomType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HotelRoomTypeIds" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="HotelRoomTypeId" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Facilities" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Facility" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="facilityId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Discounts" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Discount" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="roomId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="maxGuest" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="maxChild" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="roomCategoryID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="roomCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="roomTypeCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="roomTypeCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DrivingDirections" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Option" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DrivingDirectionDesc" form="unqualified">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="2147483647"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="seqNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="brand" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="brandId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="rooms" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="checkInTime" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="checkOutTime" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="hotelPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="hotelFax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="starLevel" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="isOpaque" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ranking" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="bestValue" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Home">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PropertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PropertySubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NumOfBathrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusCodeOrHotelOrHome"
})
@XmlRootElement(name = "TWS_HotelDetailsV3")
public class TWSHotelDetailsV3 {

    @XmlElements({
        @XmlElement(name = "StatusCode", type = TWSHotelDetailsV3 .StatusCode.class),
        @XmlElement(name = "Hotel", type = TWSHotelDetailsV3 .Hotel.class),
        @XmlElement(name = "Home", type = TWSHotelDetailsV3 .Home.class)
    })
    protected List<Object> statusCodeOrHotelOrHome;

    /**
     * Gets the value of the statusCodeOrHotelOrHome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusCodeOrHotelOrHome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusCodeOrHotelOrHome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TWSHotelDetailsV3 .StatusCode }
     * {@link TWSHotelDetailsV3 .Hotel }
     * {@link TWSHotelDetailsV3 .Home }
     * 
     * 
     */
    public List<Object> getStatusCodeOrHotelOrHome() {
        if (statusCodeOrHotelOrHome == null) {
            statusCodeOrHotelOrHome = new ArrayList<Object>();
        }
        return this.statusCodeOrHotelOrHome;
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
     *         &lt;element name="PropertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PropertySubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NumOfBathrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "propertyType",
        "propertySubType",
        "numOfBathrooms",
        "hotelId"
    })
    public static class Home {

        @XmlElement(name = "PropertyType")
        protected String propertyType;
        @XmlElement(name = "PropertySubType")
        protected String propertySubType;
        @XmlElement(name = "NumOfBathrooms")
        protected Integer numOfBathrooms;
        @XmlElement(name = "HotelId")
        protected int hotelId;

        /**
         * Gets the value of the propertyType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyType() {
            return propertyType;
        }

        /**
         * Sets the value of the propertyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyType(String value) {
            this.propertyType = value;
        }

        /**
         * Gets the value of the propertySubType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertySubType() {
            return propertySubType;
        }

        /**
         * Sets the value of the propertySubType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertySubType(String value) {
            this.propertySubType = value;
        }

        /**
         * Gets the value of the numOfBathrooms property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNumOfBathrooms() {
            return numOfBathrooms;
        }

        /**
         * Sets the value of the numOfBathrooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNumOfBathrooms(Integer value) {
            this.numOfBathrooms = value;
        }

        /**
         * Gets the value of the hotelId property.
         * 
         */
        public int getHotelId() {
            return hotelId;
        }

        /**
         * Sets the value of the hotelId property.
         * 
         */
        public void setHotelId(int value) {
            this.hotelId = value;
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
     *         &lt;element name="Location" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="searchingCity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="destinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="destinationId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="zip" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RefPoints" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="airportCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Descriptions" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VoucherRemark" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
     *                   &lt;element name="ShortDescription" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FreeTextShortDescription" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LongDescription" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FreeTextLongDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="languageID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="templateID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="textFieldType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Media" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Images" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Image" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="hotelID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="HotelImgID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Movies" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Movie" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="MovieId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="activityId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Amenities" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Amenity" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="amenityID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RoomType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HotelRoomTypeIds" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="HotelRoomTypeId" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Facilities" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Facility" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="facilityId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Discounts" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Discount" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="roomId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="maxGuest" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="maxChild" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="roomCategoryID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="roomCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="roomTypeCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="roomTypeCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DrivingDirections" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Option" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DrivingDirectionDesc" form="unqualified">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="2147483647"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="seqNum" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="brand" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="brandId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="rooms" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="provider" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="checkInTime" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="checkOutTime" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="hotelPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="hotelFax" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="starLevel" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="isOpaque" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ranking" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="bestValue" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "location",
        "refPoints",
        "descriptions",
        "media",
        "amenities",
        "roomType",
        "drivingDirections"
    })
    public static class Hotel {

        @XmlElement(name = "Location")
        protected List<TWSHotelDetailsV3 .Hotel.Location> location;
        @XmlElement(name = "RefPoints")
        protected List<TWSHotelDetailsV3 .Hotel.RefPoints> refPoints;
        @XmlElement(name = "Descriptions")
        protected List<TWSHotelDetailsV3 .Hotel.Descriptions> descriptions;
        @XmlElement(name = "Media")
        protected List<TWSHotelDetailsV3 .Hotel.Media> media;
        @XmlElement(name = "Amenities")
        protected List<TWSHotelDetailsV3 .Hotel.Amenities> amenities;
        @XmlElement(name = "RoomType")
        protected List<TWSHotelDetailsV3 .Hotel.RoomType> roomType;
        @XmlElement(name = "DrivingDirections")
        protected List<TWSHotelDetailsV3 .Hotel.DrivingDirections> drivingDirections;
        @XmlAttribute(name = "hotelID", required = true)
        protected int hotelID;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "brand")
        protected String brand;
        @XmlAttribute(name = "brandId")
        protected Integer brandId;
        @XmlAttribute(name = "rooms")
        protected Integer rooms;
        @XmlAttribute(name = "provider")
        protected String provider;
        @XmlAttribute(name = "checkInTime")
        protected Integer checkInTime;
        @XmlAttribute(name = "checkOutTime")
        protected Integer checkOutTime;
        @XmlAttribute(name = "currency")
        protected String currency;
        @XmlAttribute(name = "thumb")
        protected String thumb;
        @XmlAttribute(name = "hotelPhone")
        protected String hotelPhone;
        @XmlAttribute(name = "hotelFax")
        protected String hotelFax;
        @XmlAttribute(name = "starLevel")
        protected Double starLevel;
        @XmlAttribute(name = "isOpaque")
        protected Boolean isOpaque;
        @XmlAttribute(name = "ranking")
        protected Integer ranking;
        @XmlAttribute(name = "bestValue")
        @XmlSchemaType(name = "unsignedByte")
        protected Short bestValue;

        /**
         * Gets the value of the location property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the location property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.Location }
         * 
         * 
         */
        public List<TWSHotelDetailsV3 .Hotel.Location> getLocation() {
            if (location == null) {
                location = new ArrayList<TWSHotelDetailsV3 .Hotel.Location>();
            }
            return this.location;
        }

        /**
         * Gets the value of the refPoints property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refPoints property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefPoints().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.RefPoints }
         * 
         * 
         */
        public List<TWSHotelDetailsV3 .Hotel.RefPoints> getRefPoints() {
            if (refPoints == null) {
                refPoints = new ArrayList<TWSHotelDetailsV3 .Hotel.RefPoints>();
            }
            return this.refPoints;
        }

        /**
         * Gets the value of the descriptions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descriptions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescriptions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.Descriptions }
         * 
         * 
         */
        public List<TWSHotelDetailsV3 .Hotel.Descriptions> getDescriptions() {
            if (descriptions == null) {
                descriptions = new ArrayList<TWSHotelDetailsV3 .Hotel.Descriptions>();
            }
            return this.descriptions;
        }

        /**
         * Gets the value of the media property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the media property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.Media }
         * 
         * 
         */
        public List<TWSHotelDetailsV3 .Hotel.Media> getMedia() {
            if (media == null) {
                media = new ArrayList<TWSHotelDetailsV3 .Hotel.Media>();
            }
            return this.media;
        }

        /**
         * Gets the value of the amenities property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amenities property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmenities().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.Amenities }
         * 
         * 
         */
        public List<TWSHotelDetailsV3 .Hotel.Amenities> getAmenities() {
            if (amenities == null) {
                amenities = new ArrayList<TWSHotelDetailsV3 .Hotel.Amenities>();
            }
            return this.amenities;
        }

        /**
         * Gets the value of the roomType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.RoomType }
         * 
         * 
         */
        public List<TWSHotelDetailsV3 .Hotel.RoomType> getRoomType() {
            if (roomType == null) {
                roomType = new ArrayList<TWSHotelDetailsV3 .Hotel.RoomType>();
            }
            return this.roomType;
        }

        /**
         * Gets the value of the drivingDirections property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the drivingDirections property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDrivingDirections().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.DrivingDirections }
         * 
         * 
         */
        public List<TWSHotelDetailsV3 .Hotel.DrivingDirections> getDrivingDirections() {
            if (drivingDirections == null) {
                drivingDirections = new ArrayList<TWSHotelDetailsV3 .Hotel.DrivingDirections>();
            }
            return this.drivingDirections;
        }

        /**
         * Gets the value of the hotelID property.
         * 
         */
        public int getHotelID() {
            return hotelID;
        }

        /**
         * Sets the value of the hotelID property.
         * 
         */
        public void setHotelID(int value) {
            this.hotelID = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the brand property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrand() {
            return brand;
        }

        /**
         * Sets the value of the brand property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrand(String value) {
            this.brand = value;
        }

        /**
         * Gets the value of the brandId property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBrandId() {
            return brandId;
        }

        /**
         * Sets the value of the brandId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBrandId(Integer value) {
            this.brandId = value;
        }

        /**
         * Gets the value of the rooms property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRooms() {
            return rooms;
        }

        /**
         * Sets the value of the rooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRooms(Integer value) {
            this.rooms = value;
        }

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProvider() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProvider(String value) {
            this.provider = value;
        }

        /**
         * Gets the value of the checkInTime property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCheckInTime() {
            return checkInTime;
        }

        /**
         * Sets the value of the checkInTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCheckInTime(Integer value) {
            this.checkInTime = value;
        }

        /**
         * Gets the value of the checkOutTime property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCheckOutTime() {
            return checkOutTime;
        }

        /**
         * Sets the value of the checkOutTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCheckOutTime(Integer value) {
            this.checkOutTime = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the thumb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getThumb() {
            return thumb;
        }

        /**
         * Sets the value of the thumb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setThumb(String value) {
            this.thumb = value;
        }

        /**
         * Gets the value of the hotelPhone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelPhone() {
            return hotelPhone;
        }

        /**
         * Sets the value of the hotelPhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelPhone(String value) {
            this.hotelPhone = value;
        }

        /**
         * Gets the value of the hotelFax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelFax() {
            return hotelFax;
        }

        /**
         * Sets the value of the hotelFax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelFax(String value) {
            this.hotelFax = value;
        }

        /**
         * Gets the value of the starLevel property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getStarLevel() {
            return starLevel;
        }

        /**
         * Sets the value of the starLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setStarLevel(Double value) {
            this.starLevel = value;
        }

        /**
         * Gets the value of the isOpaque property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsOpaque() {
            return isOpaque;
        }

        /**
         * Sets the value of the isOpaque property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsOpaque(Boolean value) {
            this.isOpaque = value;
        }

        /**
         * Gets the value of the ranking property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRanking() {
            return ranking;
        }

        /**
         * Sets the value of the ranking property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRanking(Integer value) {
            this.ranking = value;
        }

        /**
         * Gets the value of the bestValue property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getBestValue() {
            return bestValue;
        }

        /**
         * Sets the value of the bestValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setBestValue(Short value) {
            this.bestValue = value;
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
         *         &lt;element name="Amenity" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="amenityID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "amenity"
        })
        public static class Amenities {

            @XmlElement(name = "Amenity")
            protected List<TWSHotelDetailsV3 .Hotel.Amenities.Amenity> amenity;

            /**
             * Gets the value of the amenity property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the amenity property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAmenity().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.Amenities.Amenity }
             * 
             * 
             */
            public List<TWSHotelDetailsV3 .Hotel.Amenities.Amenity> getAmenity() {
                if (amenity == null) {
                    amenity = new ArrayList<TWSHotelDetailsV3 .Hotel.Amenities.Amenity>();
                }
                return this.amenity;
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
             *       &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="amenityID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Amenity {

                @XmlAttribute(name = "hotelID", required = true)
                protected int hotelID;
                @XmlAttribute(name = "amenityID", required = true)
                protected int amenityID;
                @XmlAttribute(name = "name")
                protected String name;

                /**
                 * Gets the value of the hotelID property.
                 * 
                 */
                public int getHotelID() {
                    return hotelID;
                }

                /**
                 * Sets the value of the hotelID property.
                 * 
                 */
                public void setHotelID(int value) {
                    this.hotelID = value;
                }

                /**
                 * Gets the value of the amenityID property.
                 * 
                 */
                public int getAmenityID() {
                    return amenityID;
                }

                /**
                 * Sets the value of the amenityID property.
                 * 
                 */
                public void setAmenityID(int value) {
                    this.amenityID = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
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
         *         &lt;element name="VoucherRemark" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
         *         &lt;element name="ShortDescription" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FreeTextShortDescription" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LongDescription" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FreeTextLongDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="languageID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="templateID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="textFieldType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
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
            "voucherRemark",
            "shortDescription",
            "freeTextShortDescription",
            "longDescription"
        })
        public static class Descriptions {

            @XmlElement(name = "VoucherRemark", namespace = "", required = true)
            protected String voucherRemark;
            @XmlElement(name = "ShortDescription")
            protected List<TWSHotelDetailsV3 .Hotel.Descriptions.ShortDescription> shortDescription;
            @XmlElement(name = "FreeTextShortDescription")
            protected List<TWSHotelDetailsV3 .Hotel.Descriptions.FreeTextShortDescription> freeTextShortDescription;
            @XmlElement(name = "LongDescription")
            protected List<TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription> longDescription;

            /**
             * Gets the value of the voucherRemark property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVoucherRemark() {
                return voucherRemark;
            }

            /**
             * Sets the value of the voucherRemark property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVoucherRemark(String value) {
                this.voucherRemark = value;
            }

            /**
             * Gets the value of the shortDescription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the shortDescription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getShortDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.Descriptions.ShortDescription }
             * 
             * 
             */
            public List<TWSHotelDetailsV3 .Hotel.Descriptions.ShortDescription> getShortDescription() {
                if (shortDescription == null) {
                    shortDescription = new ArrayList<TWSHotelDetailsV3 .Hotel.Descriptions.ShortDescription>();
                }
                return this.shortDescription;
            }

            /**
             * Gets the value of the freeTextShortDescription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the freeTextShortDescription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFreeTextShortDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.Descriptions.FreeTextShortDescription }
             * 
             * 
             */
            public List<TWSHotelDetailsV3 .Hotel.Descriptions.FreeTextShortDescription> getFreeTextShortDescription() {
                if (freeTextShortDescription == null) {
                    freeTextShortDescription = new ArrayList<TWSHotelDetailsV3 .Hotel.Descriptions.FreeTextShortDescription>();
                }
                return this.freeTextShortDescription;
            }

            /**
             * Gets the value of the longDescription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the longDescription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLongDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription }
             * 
             * 
             */
            public List<TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription> getLongDescription() {
                if (longDescription == null) {
                    longDescription = new ArrayList<TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription>();
                }
                return this.longDescription;
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
             *       &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FreeTextShortDescription {

                @XmlAttribute(name = "desc")
                protected String desc;

                /**
                 * Gets the value of the desc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDesc() {
                    return desc;
                }

                /**
                 * Sets the value of the desc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDesc(String value) {
                    this.desc = value;
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
             *         &lt;element name="FreeTextLongDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="languageID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="templateID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="textFieldType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "freeTextLongDescription",
                "description"
            })
            public static class LongDescription {

                @XmlElement(name = "FreeTextLongDescription", required = true)
                protected String freeTextLongDescription;
                @XmlElement(name = "Description")
                protected List<TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription.Description> description;

                /**
                 * Gets the value of the freeTextLongDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFreeTextLongDescription() {
                    return freeTextLongDescription;
                }

                /**
                 * Sets the value of the freeTextLongDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFreeTextLongDescription(String value) {
                    this.freeTextLongDescription = value;
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
                 * {@link TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription.Description }
                 * 
                 * 
                 */
                public List<TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription.Description> getDescription() {
                    if (description == null) {
                        description = new ArrayList<TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription.Description>();
                    }
                    return this.description;
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
                 *       &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="languageID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="templateID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="textFieldType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Description {

                    @XmlAttribute(name = "hotelID", required = true)
                    protected int hotelID;
                    @XmlAttribute(name = "languageID", required = true)
                    protected int languageID;
                    @XmlAttribute(name = "templateID", required = true)
                    protected int templateID;
                    @XmlAttribute(name = "textFieldType", required = true)
                    protected int textFieldType;
                    @XmlAttribute(name = "category")
                    protected String category;
                    @XmlAttribute(name = "categoryId")
                    protected Integer categoryId;
                    @XmlAttribute(name = "value")
                    protected String value;

                    /**
                     * Gets the value of the hotelID property.
                     * 
                     */
                    public int getHotelID() {
                        return hotelID;
                    }

                    /**
                     * Sets the value of the hotelID property.
                     * 
                     */
                    public void setHotelID(int value) {
                        this.hotelID = value;
                    }

                    /**
                     * Gets the value of the languageID property.
                     * 
                     */
                    public int getLanguageID() {
                        return languageID;
                    }

                    /**
                     * Sets the value of the languageID property.
                     * 
                     */
                    public void setLanguageID(int value) {
                        this.languageID = value;
                    }

                    /**
                     * Gets the value of the templateID property.
                     * 
                     */
                    public int getTemplateID() {
                        return templateID;
                    }

                    /**
                     * Sets the value of the templateID property.
                     * 
                     */
                    public void setTemplateID(int value) {
                        this.templateID = value;
                    }

                    /**
                     * Gets the value of the textFieldType property.
                     * 
                     */
                    public int getTextFieldType() {
                        return textFieldType;
                    }

                    /**
                     * Sets the value of the textFieldType property.
                     * 
                     */
                    public void setTextFieldType(int value) {
                        this.textFieldType = value;
                    }

                    /**
                     * Gets the value of the category property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCategory() {
                        return category;
                    }

                    /**
                     * Sets the value of the category property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCategory(String value) {
                        this.category = value;
                    }

                    /**
                     * Gets the value of the categoryId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getCategoryId() {
                        return categoryId;
                    }

                    /**
                     * Sets the value of the categoryId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setCategoryId(Integer value) {
                        this.categoryId = value;
                    }

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
             *       &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ShortDescription {

                @XmlAttribute(name = "desc")
                protected String desc;

                /**
                 * Gets the value of the desc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDesc() {
                    return desc;
                }

                /**
                 * Sets the value of the desc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDesc(String value) {
                    this.desc = value;
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
         *         &lt;element name="Option" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DrivingDirectionDesc" form="unqualified">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="2147483647"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="seqNum" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "option"
        })
        public static class DrivingDirections {

            @XmlElement(name = "Option")
            protected List<TWSHotelDetailsV3 .Hotel.DrivingDirections.Option> option;

            /**
             * Gets the value of the option property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the option property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOption().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.DrivingDirections.Option }
             * 
             * 
             */
            public List<TWSHotelDetailsV3 .Hotel.DrivingDirections.Option> getOption() {
                if (option == null) {
                    option = new ArrayList<TWSHotelDetailsV3 .Hotel.DrivingDirections.Option>();
                }
                return this.option;
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
             *         &lt;element name="DrivingDirectionDesc" form="unqualified">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="2147483647"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="seqNum" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "drivingDirectionDesc"
            })
            public static class Option {

                @XmlElement(name = "DrivingDirectionDesc", namespace = "", required = true)
                protected String drivingDirectionDesc;
                @XmlAttribute(name = "hotelId")
                protected Integer hotelId;
                @XmlAttribute(name = "seqNum")
                protected Integer seqNum;
                @XmlAttribute(name = "name")
                protected String name;

                /**
                 * Gets the value of the drivingDirectionDesc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDrivingDirectionDesc() {
                    return drivingDirectionDesc;
                }

                /**
                 * Sets the value of the drivingDirectionDesc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDrivingDirectionDesc(String value) {
                    this.drivingDirectionDesc = value;
                }

                /**
                 * Gets the value of the hotelId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getHotelId() {
                    return hotelId;
                }

                /**
                 * Sets the value of the hotelId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setHotelId(Integer value) {
                    this.hotelId = value;
                }

                /**
                 * Gets the value of the seqNum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSeqNum() {
                    return seqNum;
                }

                /**
                 * Sets the value of the seqNum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSeqNum(Integer value) {
                    this.seqNum = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
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
         *       &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="searchingCity" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="destinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="destinationId" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="zip" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Location {

            @XmlAttribute(name = "country")
            protected String country;
            @XmlAttribute(name = "state")
            protected String state;
            @XmlAttribute(name = "city")
            protected String city;
            @XmlAttribute(name = "searchingCity")
            protected String searchingCity;
            @XmlAttribute(name = "destinationCode")
            protected String destinationCode;
            @XmlAttribute(name = "destinationId")
            protected String destinationId;
            @XmlAttribute(name = "location")
            protected String location;
            @XmlAttribute(name = "address")
            protected String address;
            @XmlAttribute(name = "zip")
            protected String zip;
            @XmlAttribute(name = "longitude")
            protected BigDecimal longitude;
            @XmlAttribute(name = "latitude")
            protected BigDecimal latitude;

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
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Gets the value of the searchingCity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSearchingCity() {
                return searchingCity;
            }

            /**
             * Sets the value of the searchingCity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSearchingCity(String value) {
                this.searchingCity = value;
            }

            /**
             * Gets the value of the destinationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDestinationCode() {
                return destinationCode;
            }

            /**
             * Sets the value of the destinationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDestinationCode(String value) {
                this.destinationCode = value;
            }

            /**
             * Gets the value of the destinationId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDestinationId() {
                return destinationId;
            }

            /**
             * Sets the value of the destinationId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDestinationId(String value) {
                this.destinationId = value;
            }

            /**
             * Gets the value of the location property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocation() {
                return location;
            }

            /**
             * Sets the value of the location property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocation(String value) {
                this.location = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Gets the value of the zip property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZip() {
                return zip;
            }

            /**
             * Sets the value of the zip property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZip(String value) {
                this.zip = value;
            }

            /**
             * Gets the value of the longitude property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLongitude() {
                return longitude;
            }

            /**
             * Sets the value of the longitude property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLongitude(BigDecimal value) {
                this.longitude = value;
            }

            /**
             * Gets the value of the latitude property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLatitude() {
                return latitude;
            }

            /**
             * Sets the value of the latitude property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLatitude(BigDecimal value) {
                this.latitude = value;
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
         *         &lt;element name="Images" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Image" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="hotelID" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="HotelImgID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Movies" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Movie" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="MovieId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="activityId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
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
            "images",
            "movies"
        })
        public static class Media {

            @XmlElement(name = "Images")
            protected List<TWSHotelDetailsV3 .Hotel.Media.Images> images;
            @XmlElement(name = "Movies")
            protected List<TWSHotelDetailsV3 .Hotel.Media.Movies> movies;

            /**
             * Gets the value of the images property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the images property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImages().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.Media.Images }
             * 
             * 
             */
            public List<TWSHotelDetailsV3 .Hotel.Media.Images> getImages() {
                if (images == null) {
                    images = new ArrayList<TWSHotelDetailsV3 .Hotel.Media.Images>();
                }
                return this.images;
            }

            /**
             * Gets the value of the movies property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the movies property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMovies().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.Media.Movies }
             * 
             * 
             */
            public List<TWSHotelDetailsV3 .Hotel.Media.Movies> getMovies() {
                if (movies == null) {
                    movies = new ArrayList<TWSHotelDetailsV3 .Hotel.Media.Movies>();
                }
                return this.movies;
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
             *         &lt;element name="Image" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="hotelID" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="HotelImgID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                "image"
            })
            public static class Images {

                @XmlElement(name = "Image")
                protected List<TWSHotelDetailsV3 .Hotel.Media.Images.Image> image;

                /**
                 * Gets the value of the image property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the image property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getImage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TWSHotelDetailsV3 .Hotel.Media.Images.Image }
                 * 
                 * 
                 */
                public List<TWSHotelDetailsV3 .Hotel.Media.Images.Image> getImage() {
                    if (image == null) {
                        image = new ArrayList<TWSHotelDetailsV3 .Hotel.Media.Images.Image>();
                    }
                    return this.image;
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
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="hotelID" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="HotelImgID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Image {

                    @XmlAttribute(name = "type")
                    protected Integer type;
                    @XmlAttribute(name = "path")
                    protected String path;
                    @XmlAttribute(name = "hotelID")
                    protected Integer hotelID;
                    @XmlAttribute(name = "HotelImgID", required = true)
                    protected int hotelImgID;

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setType(Integer value) {
                        this.type = value;
                    }

                    /**
                     * Gets the value of the path property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPath() {
                        return path;
                    }

                    /**
                     * Sets the value of the path property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPath(String value) {
                        this.path = value;
                    }

                    /**
                     * Gets the value of the hotelID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getHotelID() {
                        return hotelID;
                    }

                    /**
                     * Sets the value of the hotelID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setHotelID(Integer value) {
                        this.hotelID = value;
                    }

                    /**
                     * Gets the value of the hotelImgID property.
                     * 
                     */
                    public int getHotelImgID() {
                        return hotelImgID;
                    }

                    /**
                     * Sets the value of the hotelImgID property.
                     * 
                     */
                    public void setHotelImgID(int value) {
                        this.hotelImgID = value;
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
             *         &lt;element name="Movie" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="MovieId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="activityId" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "movie"
            })
            public static class Movies {

                @XmlElement(name = "Movie")
                protected List<TWSHotelDetailsV3 .Hotel.Media.Movies.Movie> movie;

                /**
                 * Gets the value of the movie property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the movie property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMovie().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TWSHotelDetailsV3 .Hotel.Media.Movies.Movie }
                 * 
                 * 
                 */
                public List<TWSHotelDetailsV3 .Hotel.Media.Movies.Movie> getMovie() {
                    if (movie == null) {
                        movie = new ArrayList<TWSHotelDetailsV3 .Hotel.Media.Movies.Movie>();
                    }
                    return this.movie;
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
                 *       &lt;attribute name="MovieId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="activityId" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Movie {

                    @XmlAttribute(name = "MovieId", required = true)
                    protected int movieId;
                    @XmlAttribute(name = "activityId")
                    protected Integer activityId;
                    @XmlAttribute(name = "title")
                    protected String title;
                    @XmlAttribute(name = "path")
                    protected String path;

                    /**
                     * Gets the value of the movieId property.
                     * 
                     */
                    public int getMovieId() {
                        return movieId;
                    }

                    /**
                     * Sets the value of the movieId property.
                     * 
                     */
                    public void setMovieId(int value) {
                        this.movieId = value;
                    }

                    /**
                     * Gets the value of the activityId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getActivityId() {
                        return activityId;
                    }

                    /**
                     * Sets the value of the activityId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setActivityId(Integer value) {
                        this.activityId = value;
                    }

                    /**
                     * Gets the value of the title property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTitle() {
                        return title;
                    }

                    /**
                     * Sets the value of the title property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTitle(String value) {
                        this.title = value;
                    }

                    /**
                     * Gets the value of the path property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPath() {
                        return path;
                    }

                    /**
                     * Sets the value of the path property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPath(String value) {
                        this.path = value;
                    }

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
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="airportCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RefPoints {

            @XmlAttribute(name = "type")
            protected String type;
            @XmlAttribute(name = "typeId")
            protected Integer typeId;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "airportCode")
            protected String airportCode;
            @XmlAttribute(name = "direction")
            protected String direction;
            @XmlAttribute(name = "distance")
            protected BigDecimal distance;
            @XmlAttribute(name = "unit")
            protected String unit;

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
             * Gets the value of the typeId property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTypeId() {
                return typeId;
            }

            /**
             * Sets the value of the typeId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTypeId(Integer value) {
                this.typeId = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the airportCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAirportCode() {
                return airportCode;
            }

            /**
             * Sets the value of the airportCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAirportCode(String value) {
                this.airportCode = value;
            }

            /**
             * Gets the value of the direction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDirection() {
                return direction;
            }

            /**
             * Sets the value of the direction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDirection(String value) {
                this.direction = value;
            }

            /**
             * Gets the value of the distance property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDistance() {
                return distance;
            }

            /**
             * Sets the value of the distance property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDistance(BigDecimal value) {
                this.distance = value;
            }

            /**
             * Gets the value of the unit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                return unit;
            }

            /**
             * Sets the value of the unit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
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
         *         &lt;element name="HotelRoomTypeIds" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="HotelRoomTypeId" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Facilities" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Facility" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="facilityId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Discounts" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Discount" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="roomId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="maxGuest" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="maxChild" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="roomCategoryID" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="roomCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="roomTypeCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="roomTypeCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hotelRoomTypeIds",
            "facilities",
            "discounts"
        })
        public static class RoomType {

            @XmlElement(name = "HotelRoomTypeIds")
            protected List<TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds> hotelRoomTypeIds;
            @XmlElement(name = "Facilities")
            protected List<TWSHotelDetailsV3 .Hotel.RoomType.Facilities> facilities;
            @XmlElement(name = "Discounts")
            protected List<TWSHotelDetailsV3 .Hotel.RoomType.Discounts> discounts;
            @XmlAttribute(name = "hotelID", required = true)
            protected int hotelID;
            @XmlAttribute(name = "roomId", required = true)
            protected int roomId;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "description")
            protected String description;
            @XmlAttribute(name = "maxGuest")
            protected Integer maxGuest;
            @XmlAttribute(name = "maxChild")
            protected Integer maxChild;
            @XmlAttribute(name = "roomCategoryID")
            protected Integer roomCategoryID;
            @XmlAttribute(name = "roomCategory")
            protected String roomCategory;
            @XmlAttribute(name = "roomTypeCategory")
            protected String roomTypeCategory;
            @XmlAttribute(name = "roomTypeCategoryId")
            protected Integer roomTypeCategoryId;

            /**
             * Gets the value of the hotelRoomTypeIds property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hotelRoomTypeIds property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHotelRoomTypeIds().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds }
             * 
             * 
             */
            public List<TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds> getHotelRoomTypeIds() {
                if (hotelRoomTypeIds == null) {
                    hotelRoomTypeIds = new ArrayList<TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds>();
                }
                return this.hotelRoomTypeIds;
            }

            /**
             * Gets the value of the facilities property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the facilities property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFacilities().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.RoomType.Facilities }
             * 
             * 
             */
            public List<TWSHotelDetailsV3 .Hotel.RoomType.Facilities> getFacilities() {
                if (facilities == null) {
                    facilities = new ArrayList<TWSHotelDetailsV3 .Hotel.RoomType.Facilities>();
                }
                return this.facilities;
            }

            /**
             * Gets the value of the discounts property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the discounts property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDiscounts().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.RoomType.Discounts }
             * 
             * 
             */
            public List<TWSHotelDetailsV3 .Hotel.RoomType.Discounts> getDiscounts() {
                if (discounts == null) {
                    discounts = new ArrayList<TWSHotelDetailsV3 .Hotel.RoomType.Discounts>();
                }
                return this.discounts;
            }

            /**
             * Gets the value of the hotelID property.
             * 
             */
            public int getHotelID() {
                return hotelID;
            }

            /**
             * Sets the value of the hotelID property.
             * 
             */
            public void setHotelID(int value) {
                this.hotelID = value;
            }

            /**
             * Gets the value of the roomId property.
             * 
             */
            public int getRoomId() {
                return roomId;
            }

            /**
             * Sets the value of the roomId property.
             * 
             */
            public void setRoomId(int value) {
                this.roomId = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the maxGuest property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxGuest() {
                return maxGuest;
            }

            /**
             * Sets the value of the maxGuest property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxGuest(Integer value) {
                this.maxGuest = value;
            }

            /**
             * Gets the value of the maxChild property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxChild() {
                return maxChild;
            }

            /**
             * Sets the value of the maxChild property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxChild(Integer value) {
                this.maxChild = value;
            }

            /**
             * Gets the value of the roomCategoryID property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRoomCategoryID() {
                return roomCategoryID;
            }

            /**
             * Sets the value of the roomCategoryID property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRoomCategoryID(Integer value) {
                this.roomCategoryID = value;
            }

            /**
             * Gets the value of the roomCategory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomCategory() {
                return roomCategory;
            }

            /**
             * Sets the value of the roomCategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomCategory(String value) {
                this.roomCategory = value;
            }

            /**
             * Gets the value of the roomTypeCategory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomTypeCategory() {
                return roomTypeCategory;
            }

            /**
             * Sets the value of the roomTypeCategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomTypeCategory(String value) {
                this.roomTypeCategory = value;
            }

            /**
             * Gets the value of the roomTypeCategoryId property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRoomTypeCategoryId() {
                return roomTypeCategoryId;
            }

            /**
             * Sets the value of the roomTypeCategoryId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRoomTypeCategoryId(Integer value) {
                this.roomTypeCategoryId = value;
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
             *         &lt;element name="Discount" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "discount"
            })
            public static class Discounts {

                @XmlElement(name = "Discount")
                protected List<TWSHotelDetailsV3 .Hotel.RoomType.Discounts.Discount> discount;

                /**
                 * Gets the value of the discount property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the discount property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDiscount().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TWSHotelDetailsV3 .Hotel.RoomType.Discounts.Discount }
                 * 
                 * 
                 */
                public List<TWSHotelDetailsV3 .Hotel.RoomType.Discounts.Discount> getDiscount() {
                    if (discount == null) {
                        discount = new ArrayList<TWSHotelDetailsV3 .Hotel.RoomType.Discounts.Discount>();
                    }
                    return this.discount;
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
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Discount {

                    @XmlAttribute(name = "type")
                    protected String type;
                    @XmlAttribute(name = "fromDate")
                    protected String fromDate;
                    @XmlAttribute(name = "toDate")
                    protected String toDate;
                    @XmlAttribute(name = "value")
                    protected String value;

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
                     * Gets the value of the fromDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFromDate() {
                        return fromDate;
                    }

                    /**
                     * Sets the value of the fromDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFromDate(String value) {
                        this.fromDate = value;
                    }

                    /**
                     * Gets the value of the toDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getToDate() {
                        return toDate;
                    }

                    /**
                     * Sets the value of the toDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setToDate(String value) {
                        this.toDate = value;
                    }

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
             *         &lt;element name="Facility" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="facilityId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "facility"
            })
            public static class Facilities {

                @XmlElement(name = "Facility")
                protected List<TWSHotelDetailsV3 .Hotel.RoomType.Facilities.Facility> facility;

                /**
                 * Gets the value of the facility property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the facility property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFacility().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TWSHotelDetailsV3 .Hotel.RoomType.Facilities.Facility }
                 * 
                 * 
                 */
                public List<TWSHotelDetailsV3 .Hotel.RoomType.Facilities.Facility> getFacility() {
                    if (facility == null) {
                        facility = new ArrayList<TWSHotelDetailsV3 .Hotel.RoomType.Facilities.Facility>();
                    }
                    return this.facility;
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
                 *       &lt;attribute name="facilityId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Facility {

                    @XmlAttribute(name = "facilityId", required = true)
                    protected int facilityId;
                    @XmlAttribute(name = "name")
                    protected String name;

                    /**
                     * Gets the value of the facilityId property.
                     * 
                     */
                    public int getFacilityId() {
                        return facilityId;
                    }

                    /**
                     * Sets the value of the facilityId property.
                     * 
                     */
                    public void setFacilityId(int value) {
                        this.facilityId = value;
                    }

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
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
             *         &lt;element name="HotelRoomTypeId" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                "hotelRoomTypeId"
            })
            public static class HotelRoomTypeIds {

                @XmlElement(name = "HotelRoomTypeId")
                protected List<TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds.HotelRoomTypeId> hotelRoomTypeId;

                /**
                 * Gets the value of the hotelRoomTypeId property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the hotelRoomTypeId property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHotelRoomTypeId().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds.HotelRoomTypeId }
                 * 
                 * 
                 */
                public List<TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds.HotelRoomTypeId> getHotelRoomTypeId() {
                    if (hotelRoomTypeId == null) {
                        hotelRoomTypeId = new ArrayList<TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds.HotelRoomTypeId>();
                    }
                    return this.hotelRoomTypeId;
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
                 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class HotelRoomTypeId {

                    @XmlAttribute(name = "ID")
                    protected Integer id;

                    /**
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getID() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setID(Integer value) {
                        this.id = value;
                    }

                }

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
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "type",
        "code",
        "description"
    })
    public static class StatusCode {

        @XmlElement(required = true)
        protected String type;
        @XmlElement(required = true)
        protected String code;
        @XmlElement(required = true)
        protected String description;

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

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

    }

}
