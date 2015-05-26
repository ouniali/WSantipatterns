
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
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ArrayOfOTA_HotelAvailGetRQHotelAvailRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOTA_HotelAvailGetRQHotelAvailRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelAvailRequest" maxOccurs="unbounded" minOccurs="0">
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
 *                   &lt;element name="RoomTypeCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOTA_HotelAvailGetRQHotelAvailRequestRoomTypeCandidate" minOccurs="0"/>
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
 *                   &lt;element name="RestrictionStatusCandidates" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RestrictionStatusCandidate" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Restriction">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="Master"/>
 *                                           &lt;enumeration value="Arrival"/>
 *                                           &lt;enumeration value="Departure"/>
 *                                           &lt;enumeration value="NonGuarantee"/>
 *                                           &lt;enumeration value="TravelAgent"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
 *                                     &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                                     &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SendAllRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LengthsOfStayCandidates" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LengthOfStayCandidate" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="DepartureDateBased" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="ArrivalDateBased" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="MinMaxMessageType">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="SetMinLOS"/>
 *                                           &lt;enumeration value="RemoveMinLOS"/>
 *                                           &lt;enumeration value="SetMaxLOS"/>
 *                                           &lt;enumeration value="RemoveMaxLOS"/>
 *                                           &lt;enumeration value="SetForwardMinStay"/>
 *                                           &lt;enumeration value="RemoveForwardMinStay"/>
 *                                           &lt;enumeration value="SetForwardMaxStay"/>
 *                                           &lt;enumeration value="RemoveForwardMaxStay"/>
 *                                           &lt;enumeration value="FixedLOS"/>
 *                                           &lt;enumeration value="FullPatternLOS"/>
 *                                           &lt;enumeration value="MinLOS"/>
 *                                           &lt;enumeration value="MaxLOS"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SendAllLengthsOfStay" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="FixedPatternLength" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BestAvailableRateCandidate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SendLengthOfStayTime" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="SendRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="SendAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="HurdleRateCandidate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SendAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DeltaCandidate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SendAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
 *                   &lt;element name="RebatePrograms" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RebateProgram" type="{http://www.opentravel.org/OTA/2003/05}RebateType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SendDataInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="HotelAvailRequestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SendBookingLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="BookingLimitMessageType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="RemoveLimit"/>
 *                       &lt;enumeration value="SetLimit"/>
 *                       &lt;enumeration value="AdjustLimit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "ArrayOfOTA_HotelAvailGetRQHotelAvailRequest", propOrder = {
    "hotelAvailRequest"
})
public class ArrayOfOTAHotelAvailGetRQHotelAvailRequest {

    @XmlElement(name = "HotelAvailRequest")
    protected List<ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest> hotelAvailRequest;

    /**
     * Gets the value of the hotelAvailRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelAvailRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelAvailRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest }
     * 
     * 
     */
    public List<ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest> getHotelAvailRequest() {
        if (hotelAvailRequest == null) {
            hotelAvailRequest = new ArrayList<ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest>();
        }
        return this.hotelAvailRequest;
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
     *         &lt;element name="RoomTypeCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOTA_HotelAvailGetRQHotelAvailRequestRoomTypeCandidate" minOccurs="0"/>
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
     *         &lt;element name="RestrictionStatusCandidates" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RestrictionStatusCandidate" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Restriction">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="Master"/>
     *                                 &lt;enumeration value="Arrival"/>
     *                                 &lt;enumeration value="Departure"/>
     *                                 &lt;enumeration value="NonGuarantee"/>
     *                                 &lt;enumeration value="TravelAgent"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
     *                           &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *                           &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SendAllRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LengthsOfStayCandidates" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LengthOfStayCandidate" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="DepartureDateBased" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="ArrivalDateBased" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="MinMaxMessageType">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="SetMinLOS"/>
     *                                 &lt;enumeration value="RemoveMinLOS"/>
     *                                 &lt;enumeration value="SetMaxLOS"/>
     *                                 &lt;enumeration value="RemoveMaxLOS"/>
     *                                 &lt;enumeration value="SetForwardMinStay"/>
     *                                 &lt;enumeration value="RemoveForwardMinStay"/>
     *                                 &lt;enumeration value="SetForwardMaxStay"/>
     *                                 &lt;enumeration value="RemoveForwardMaxStay"/>
     *                                 &lt;enumeration value="FixedLOS"/>
     *                                 &lt;enumeration value="FullPatternLOS"/>
     *                                 &lt;enumeration value="MinLOS"/>
     *                                 &lt;enumeration value="MaxLOS"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SendAllLengthsOfStay" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="FixedPatternLength" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BestAvailableRateCandidate" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SendLengthOfStayTime" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="SendRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="SendAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="HurdleRateCandidate" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SendAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DeltaCandidate" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SendAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
     *         &lt;element name="RebatePrograms" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RebateProgram" type="{http://www.opentravel.org/OTA/2003/05}RebateType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SendDataInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="HotelAvailRequestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SendBookingLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="BookingLimitMessageType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="RemoveLimit"/>
     *             &lt;enumeration value="SetLimit"/>
     *             &lt;enumeration value="AdjustLimit"/>
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
    @XmlType(name = "", propOrder = {
        "dateRange",
        "destinationSystemsCode",
        "ratePlanCandidates",
        "roomTypeCandidates",
        "offers",
        "restrictionStatusCandidates",
        "lengthsOfStayCandidates",
        "bestAvailableRateCandidate",
        "hurdleRateCandidate",
        "deltaCandidate",
        "hotelRef",
        "rebatePrograms",
        "tpaExtensions"
    })
    public static class HotelAvailRequest {

        @XmlElement(name = "DateRange")
        protected ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.DateRange dateRange;
        @XmlElement(name = "DestinationSystemsCode")
        protected ArrayOfDestinationSystemCodesTypeDestinationSystemCode destinationSystemsCode;
        @XmlElement(name = "RatePlanCandidates")
        protected ArrayOfRatePlanCandidatesTypeRatePlanCandidate ratePlanCandidates;
        @XmlElement(name = "RoomTypeCandidates")
        protected ArrayOfOTAHotelAvailGetRQHotelAvailRequestRoomTypeCandidate roomTypeCandidates;
        @XmlElement(name = "Offers")
        protected ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.Offers offers;
        @XmlElement(name = "RestrictionStatusCandidates")
        protected ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RestrictionStatusCandidates restrictionStatusCandidates;
        @XmlElement(name = "LengthsOfStayCandidates")
        protected ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.LengthsOfStayCandidates lengthsOfStayCandidates;
        @XmlElement(name = "BestAvailableRateCandidate")
        protected ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.BestAvailableRateCandidate bestAvailableRateCandidate;
        @XmlElement(name = "HurdleRateCandidate")
        protected ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.HurdleRateCandidate hurdleRateCandidate;
        @XmlElement(name = "DeltaCandidate")
        protected ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.DeltaCandidate deltaCandidate;
        @XmlElement(name = "HotelRef")
        protected ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.HotelRef hotelRef;
        @XmlElement(name = "RebatePrograms")
        protected ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RebatePrograms rebatePrograms;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "HotelAvailRequestIdentifier")
        protected String hotelAvailRequestIdentifier;
        @XmlAttribute(name = "SendBookingLimit")
        protected Boolean sendBookingLimit;
        @XmlAttribute(name = "BookingLimitMessageType")
        protected String bookingLimitMessageType;

        /**
         * Gets the value of the dateRange property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.DateRange }
         *     
         */
        public ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.DateRange getDateRange() {
            return dateRange;
        }

        /**
         * Sets the value of the dateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.DateRange }
         *     
         */
        public void setDateRange(ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.DateRange value) {
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
         * Gets the value of the roomTypeCandidates property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequestRoomTypeCandidate }
         *     
         */
        public ArrayOfOTAHotelAvailGetRQHotelAvailRequestRoomTypeCandidate getRoomTypeCandidates() {
            return roomTypeCandidates;
        }

        /**
         * Sets the value of the roomTypeCandidates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequestRoomTypeCandidate }
         *     
         */
        public void setRoomTypeCandidates(ArrayOfOTAHotelAvailGetRQHotelAvailRequestRoomTypeCandidate value) {
            this.roomTypeCandidates = value;
        }

        /**
         * Gets the value of the offers property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.Offers }
         *     
         */
        public ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.Offers getOffers() {
            return offers;
        }

        /**
         * Sets the value of the offers property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.Offers }
         *     
         */
        public void setOffers(ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.Offers value) {
            this.offers = value;
        }

        /**
         * Gets the value of the restrictionStatusCandidates property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RestrictionStatusCandidates }
         *     
         */
        public ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RestrictionStatusCandidates getRestrictionStatusCandidates() {
            return restrictionStatusCandidates;
        }

        /**
         * Sets the value of the restrictionStatusCandidates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RestrictionStatusCandidates }
         *     
         */
        public void setRestrictionStatusCandidates(ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RestrictionStatusCandidates value) {
            this.restrictionStatusCandidates = value;
        }

        /**
         * Gets the value of the lengthsOfStayCandidates property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.LengthsOfStayCandidates }
         *     
         */
        public ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.LengthsOfStayCandidates getLengthsOfStayCandidates() {
            return lengthsOfStayCandidates;
        }

        /**
         * Sets the value of the lengthsOfStayCandidates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.LengthsOfStayCandidates }
         *     
         */
        public void setLengthsOfStayCandidates(ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.LengthsOfStayCandidates value) {
            this.lengthsOfStayCandidates = value;
        }

        /**
         * Gets the value of the bestAvailableRateCandidate property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.BestAvailableRateCandidate }
         *     
         */
        public ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.BestAvailableRateCandidate getBestAvailableRateCandidate() {
            return bestAvailableRateCandidate;
        }

        /**
         * Sets the value of the bestAvailableRateCandidate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.BestAvailableRateCandidate }
         *     
         */
        public void setBestAvailableRateCandidate(ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.BestAvailableRateCandidate value) {
            this.bestAvailableRateCandidate = value;
        }

        /**
         * Gets the value of the hurdleRateCandidate property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.HurdleRateCandidate }
         *     
         */
        public ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.HurdleRateCandidate getHurdleRateCandidate() {
            return hurdleRateCandidate;
        }

        /**
         * Sets the value of the hurdleRateCandidate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.HurdleRateCandidate }
         *     
         */
        public void setHurdleRateCandidate(ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.HurdleRateCandidate value) {
            this.hurdleRateCandidate = value;
        }

        /**
         * Gets the value of the deltaCandidate property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.DeltaCandidate }
         *     
         */
        public ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.DeltaCandidate getDeltaCandidate() {
            return deltaCandidate;
        }

        /**
         * Sets the value of the deltaCandidate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.DeltaCandidate }
         *     
         */
        public void setDeltaCandidate(ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.DeltaCandidate value) {
            this.deltaCandidate = value;
        }

        /**
         * Gets the value of the hotelRef property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.HotelRef }
         *     
         */
        public ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.HotelRef getHotelRef() {
            return hotelRef;
        }

        /**
         * Sets the value of the hotelRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.HotelRef }
         *     
         */
        public void setHotelRef(ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.HotelRef value) {
            this.hotelRef = value;
        }

        /**
         * Gets the value of the rebatePrograms property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RebatePrograms }
         *     
         */
        public ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RebatePrograms getRebatePrograms() {
            return rebatePrograms;
        }

        /**
         * Sets the value of the rebatePrograms property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RebatePrograms }
         *     
         */
        public void setRebatePrograms(ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RebatePrograms value) {
            this.rebatePrograms = value;
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
         * Gets the value of the hotelAvailRequestIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelAvailRequestIdentifier() {
            return hotelAvailRequestIdentifier;
        }

        /**
         * Sets the value of the hotelAvailRequestIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelAvailRequestIdentifier(String value) {
            this.hotelAvailRequestIdentifier = value;
        }

        /**
         * Gets the value of the sendBookingLimit property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendBookingLimit() {
            return sendBookingLimit;
        }

        /**
         * Sets the value of the sendBookingLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendBookingLimit(Boolean value) {
            this.sendBookingLimit = value;
        }

        /**
         * Gets the value of the bookingLimitMessageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingLimitMessageType() {
            return bookingLimitMessageType;
        }

        /**
         * Sets the value of the bookingLimitMessageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingLimitMessageType(String value) {
            this.bookingLimitMessageType = value;
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
         *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="SendLengthOfStayTime" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="SendRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="SendAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tpaExtensions"
        })
        public static class BestAvailableRateCandidate {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;
            @XmlAttribute(name = "SendLengthOfStayTime")
            protected Boolean sendLengthOfStayTime;
            @XmlAttribute(name = "SendRatePlanCode")
            protected Boolean sendRatePlanCode;
            @XmlAttribute(name = "SendAmount")
            protected Boolean sendAmount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

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
             * Gets the value of the sendLengthOfStayTime property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSendLengthOfStayTime() {
                return sendLengthOfStayTime;
            }

            /**
             * Sets the value of the sendLengthOfStayTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSendLengthOfStayTime(Boolean value) {
                this.sendLengthOfStayTime = value;
            }

            /**
             * Gets the value of the sendRatePlanCode property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSendRatePlanCode() {
                return sendRatePlanCode;
            }

            /**
             * Sets the value of the sendRatePlanCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSendRatePlanCode(Boolean value) {
                this.sendRatePlanCode = value;
            }

            /**
             * Gets the value of the sendAmount property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSendAmount() {
                return sendAmount;
            }

            /**
             * Sets the value of the sendAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSendAmount(Boolean value) {
                this.sendAmount = value;
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
         *       &lt;attribute name="SendAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DeltaCandidate {

            @XmlAttribute(name = "SendAmount")
            protected Boolean sendAmount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the sendAmount property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSendAmount() {
                return sendAmount;
            }

            /**
             * Sets the value of the sendAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSendAmount(Boolean value) {
                this.sendAmount = value;
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
         *       &lt;attribute name="SendAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HurdleRateCandidate {

            @XmlAttribute(name = "SendAmount")
            protected Boolean sendAmount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the sendAmount property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSendAmount() {
                return sendAmount;
            }

            /**
             * Sets the value of the sendAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSendAmount(Boolean value) {
                this.sendAmount = value;
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
         *         &lt;element name="LengthOfStayCandidate" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="DepartureDateBased" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="ArrivalDateBased" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="MinMaxMessageType">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="SetMinLOS"/>
         *                       &lt;enumeration value="RemoveMinLOS"/>
         *                       &lt;enumeration value="SetMaxLOS"/>
         *                       &lt;enumeration value="RemoveMaxLOS"/>
         *                       &lt;enumeration value="SetForwardMinStay"/>
         *                       &lt;enumeration value="RemoveForwardMinStay"/>
         *                       &lt;enumeration value="SetForwardMaxStay"/>
         *                       &lt;enumeration value="RemoveForwardMaxStay"/>
         *                       &lt;enumeration value="FixedLOS"/>
         *                       &lt;enumeration value="FullPatternLOS"/>
         *                       &lt;enumeration value="MinLOS"/>
         *                       &lt;enumeration value="MaxLOS"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SendAllLengthsOfStay" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="FixedPatternLength" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "lengthOfStayCandidate"
        })
        public static class LengthsOfStayCandidates {

            @XmlElement(name = "LengthOfStayCandidate")
            protected List<ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.LengthsOfStayCandidates.LengthOfStayCandidate> lengthOfStayCandidate;
            @XmlAttribute(name = "SendAllLengthsOfStay")
            protected Boolean sendAllLengthsOfStay;
            @XmlAttribute(name = "FixedPatternLength")
            protected BigInteger fixedPatternLength;

            /**
             * Gets the value of the lengthOfStayCandidate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the lengthOfStayCandidate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLengthOfStayCandidate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.LengthsOfStayCandidates.LengthOfStayCandidate }
             * 
             * 
             */
            public List<ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.LengthsOfStayCandidates.LengthOfStayCandidate> getLengthOfStayCandidate() {
                if (lengthOfStayCandidate == null) {
                    lengthOfStayCandidate = new ArrayList<ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.LengthsOfStayCandidates.LengthOfStayCandidate>();
                }
                return this.lengthOfStayCandidate;
            }

            /**
             * Gets the value of the sendAllLengthsOfStay property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSendAllLengthsOfStay() {
                return sendAllLengthsOfStay;
            }

            /**
             * Sets the value of the sendAllLengthsOfStay property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSendAllLengthsOfStay(Boolean value) {
                this.sendAllLengthsOfStay = value;
            }

            /**
             * Gets the value of the fixedPatternLength property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getFixedPatternLength() {
                return fixedPatternLength;
            }

            /**
             * Sets the value of the fixedPatternLength property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setFixedPatternLength(BigInteger value) {
                this.fixedPatternLength = value;
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
             *       &lt;attribute name="DepartureDateBased" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="ArrivalDateBased" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="MinMaxMessageType">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="SetMinLOS"/>
             *             &lt;enumeration value="RemoveMinLOS"/>
             *             &lt;enumeration value="SetMaxLOS"/>
             *             &lt;enumeration value="RemoveMaxLOS"/>
             *             &lt;enumeration value="SetForwardMinStay"/>
             *             &lt;enumeration value="RemoveForwardMinStay"/>
             *             &lt;enumeration value="SetForwardMaxStay"/>
             *             &lt;enumeration value="RemoveForwardMaxStay"/>
             *             &lt;enumeration value="FixedLOS"/>
             *             &lt;enumeration value="FullPatternLOS"/>
             *             &lt;enumeration value="MinLOS"/>
             *             &lt;enumeration value="MaxLOS"/>
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
            public static class LengthOfStayCandidate {

                @XmlAttribute(name = "DepartureDateBased")
                protected Boolean departureDateBased;
                @XmlAttribute(name = "ArrivalDateBased")
                protected Boolean arrivalDateBased;
                @XmlAttribute(name = "MinMaxMessageType")
                protected String minMaxMessageType;

                /**
                 * Gets the value of the departureDateBased property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isDepartureDateBased() {
                    return departureDateBased;
                }

                /**
                 * Sets the value of the departureDateBased property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setDepartureDateBased(Boolean value) {
                    this.departureDateBased = value;
                }

                /**
                 * Gets the value of the arrivalDateBased property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isArrivalDateBased() {
                    return arrivalDateBased;
                }

                /**
                 * Sets the value of the arrivalDateBased property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setArrivalDateBased(Boolean value) {
                    this.arrivalDateBased = value;
                }

                /**
                 * Gets the value of the minMaxMessageType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMinMaxMessageType() {
                    return minMaxMessageType;
                }

                /**
                 * Sets the value of the minMaxMessageType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMinMaxMessageType(String value) {
                    this.minMaxMessageType = value;
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
            protected List<ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.Offers.Offer> offer;
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
             * {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.Offers.Offer }
             * 
             * 
             */
            public List<ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.Offers.Offer> getOffer() {
                if (offer == null) {
                    offer = new ArrayList<ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.Offers.Offer>();
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
         *         &lt;element name="RebateProgram" type="{http://www.opentravel.org/OTA/2003/05}RebateType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="SendDataInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "rebateProgram"
        })
        public static class RebatePrograms {

            @XmlElement(name = "RebateProgram")
            protected List<RebateType> rebateProgram;
            @XmlAttribute(name = "SendDataInd")
            protected Boolean sendDataInd;

            /**
             * Gets the value of the rebateProgram property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the rebateProgram property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRebateProgram().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RebateType }
             * 
             * 
             */
            public List<RebateType> getRebateProgram() {
                if (rebateProgram == null) {
                    rebateProgram = new ArrayList<RebateType>();
                }
                return this.rebateProgram;
            }

            /**
             * Gets the value of the sendDataInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSendDataInd() {
                return sendDataInd;
            }

            /**
             * Sets the value of the sendDataInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSendDataInd(Boolean value) {
                this.sendDataInd = value;
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
         *         &lt;element name="RestrictionStatusCandidate" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Restriction">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="Master"/>
         *                       &lt;enumeration value="Arrival"/>
         *                       &lt;enumeration value="Departure"/>
         *                       &lt;enumeration value="NonGuarantee"/>
         *                       &lt;enumeration value="TravelAgent"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
         *                 &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
         *                 &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SendAllRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "restrictionStatusCandidate"
        })
        public static class RestrictionStatusCandidates {

            @XmlElement(name = "RestrictionStatusCandidate")
            protected List<ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RestrictionStatusCandidates.RestrictionStatusCandidate> restrictionStatusCandidate;
            @XmlAttribute(name = "SendAllRestrictions")
            protected Boolean sendAllRestrictions;

            /**
             * Gets the value of the restrictionStatusCandidate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the restrictionStatusCandidate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRestrictionStatusCandidate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RestrictionStatusCandidates.RestrictionStatusCandidate }
             * 
             * 
             */
            public List<ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RestrictionStatusCandidates.RestrictionStatusCandidate> getRestrictionStatusCandidate() {
                if (restrictionStatusCandidate == null) {
                    restrictionStatusCandidate = new ArrayList<ArrayOfOTAHotelAvailGetRQHotelAvailRequest.HotelAvailRequest.RestrictionStatusCandidates.RestrictionStatusCandidate>();
                }
                return this.restrictionStatusCandidate;
            }

            /**
             * Gets the value of the sendAllRestrictions property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSendAllRestrictions() {
                return sendAllRestrictions;
            }

            /**
             * Sets the value of the sendAllRestrictions property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSendAllRestrictions(Boolean value) {
                this.sendAllRestrictions = value;
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
             *       &lt;attribute name="Restriction">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="Master"/>
             *             &lt;enumeration value="Arrival"/>
             *             &lt;enumeration value="Departure"/>
             *             &lt;enumeration value="NonGuarantee"/>
             *             &lt;enumeration value="TravelAgent"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
             *       &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
             *       &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RestrictionStatusCandidate {

                @XmlAttribute(name = "Restriction")
                protected String restriction;
                @XmlAttribute(name = "Status")
                protected AvailabilityStatusType status;
                @XmlAttribute(name = "SellThroughOpenIndicator")
                protected Boolean sellThroughOpenIndicator;
                @XmlAttribute(name = "MaxAdvancedBookingOffset")
                protected Duration maxAdvancedBookingOffset;
                @XmlAttribute(name = "MinAdvancedBookingOffset")
                protected Duration minAdvancedBookingOffset;

                /**
                 * Gets the value of the restriction property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRestriction() {
                    return restriction;
                }

                /**
                 * Sets the value of the restriction property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRestriction(String value) {
                    this.restriction = value;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AvailabilityStatusType }
                 *     
                 */
                public AvailabilityStatusType getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AvailabilityStatusType }
                 *     
                 */
                public void setStatus(AvailabilityStatusType value) {
                    this.status = value;
                }

                /**
                 * Gets the value of the sellThroughOpenIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSellThroughOpenIndicator() {
                    return sellThroughOpenIndicator;
                }

                /**
                 * Sets the value of the sellThroughOpenIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSellThroughOpenIndicator(Boolean value) {
                    this.sellThroughOpenIndicator = value;
                }

                /**
                 * Gets the value of the maxAdvancedBookingOffset property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Duration }
                 *     
                 */
                public Duration getMaxAdvancedBookingOffset() {
                    return maxAdvancedBookingOffset;
                }

                /**
                 * Sets the value of the maxAdvancedBookingOffset property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Duration }
                 *     
                 */
                public void setMaxAdvancedBookingOffset(Duration value) {
                    this.maxAdvancedBookingOffset = value;
                }

                /**
                 * Gets the value of the minAdvancedBookingOffset property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Duration }
                 *     
                 */
                public Duration getMinAdvancedBookingOffset() {
                    return minAdvancedBookingOffset;
                }

                /**
                 * Sets the value of the minAdvancedBookingOffset property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Duration }
                 *     
                 */
                public void setMinAdvancedBookingOffset(Duration value) {
                    this.minAdvancedBookingOffset = value;
                }

            }

        }

    }

}
