
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
import javax.xml.datatype.Duration;


/**
 * <p>Java class for BookingRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingRule" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcceptableGuarantees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee" minOccurs="0"/>
 *                   &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="RequiredPaymts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
 *                   &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/>
 *                   &lt;element name="DOW_Restrictions" type="{http://www.opentravel.org/OTA/2003/05}DOW_RestrictionsType" minOccurs="0"/>
 *                   &lt;element name="RestrictionStatus" minOccurs="0">
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
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Viewerships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewership" minOccurs="0"/>
 *                   &lt;element name="AddtionalRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRuleAdditionalRule" minOccurs="0"/>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="CheckoutCharge" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Type">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Early"/>
 *                                 &lt;enumeration value="Late"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="ForceGuaranteeOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="DepositWaiverOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="MinTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaxTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="AbsoluteDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GenerallyBookable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PriceViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="QualifiedRateYN" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AddressRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="OffsetCalculationMode">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="BeforeBlockStartDate"/>
 *                       &lt;enumeration value="AfterBlockCreation"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="MaxContiguousBookings" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
@XmlType(name = "BookingRulesType", propOrder = {
    "bookingRule"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.HotelRatePlanType.BookingRules.class
})
public class BookingRulesType {

    @XmlElement(name = "BookingRule")
    protected List<BookingRulesType.BookingRule> bookingRule;

    /**
     * Gets the value of the bookingRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingRulesType.BookingRule }
     * 
     * 
     */
    public List<BookingRulesType.BookingRule> getBookingRule() {
        if (bookingRule == null) {
            bookingRule = new ArrayList<BookingRulesType.BookingRule>();
        }
        return this.bookingRule;
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
     *         &lt;element name="AcceptableGuarantees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee" minOccurs="0"/>
     *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
     *         &lt;element name="RequiredPaymts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
     *         &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/>
     *         &lt;element name="DOW_Restrictions" type="{http://www.opentravel.org/OTA/2003/05}DOW_RestrictionsType" minOccurs="0"/>
     *         &lt;element name="RestrictionStatus" minOccurs="0">
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
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Viewerships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewership" minOccurs="0"/>
     *         &lt;element name="AddtionalRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRuleAdditionalRule" minOccurs="0"/>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *         &lt;element name="CheckoutCharge" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Type">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Early"/>
     *                       &lt;enumeration value="Late"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="ForceGuaranteeOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="DepositWaiverOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="MinTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaxTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="AbsoluteDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GenerallyBookable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PriceViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="QualifiedRateYN" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AddressRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="OffsetCalculationMode">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="BeforeBlockStartDate"/>
     *             &lt;enumeration value="AfterBlockCreation"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="MaxContiguousBookings" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acceptableGuarantees",
        "cancelPenalties",
        "requiredPaymts",
        "lengthsOfStay",
        "dowRestrictions",
        "restrictionStatus",
        "viewerships",
        "addtionalRules",
        "description",
        "uniqueID",
        "checkoutCharge"
    })
    public static class BookingRule {

        @XmlElement(name = "AcceptableGuarantees")
        protected ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee acceptableGuarantees;
        @XmlElement(name = "CancelPenalties")
        protected CancelPenaltiesType cancelPenalties;
        @XmlElement(name = "RequiredPaymts")
        protected ArrayOfRequiredPaymentsTypeGuaranteePayment requiredPaymts;
        @XmlElement(name = "LengthsOfStay")
        protected LengthsOfStayType lengthsOfStay;
        @XmlElement(name = "DOW_Restrictions")
        protected DOWRestrictionsType dowRestrictions;
        @XmlElement(name = "RestrictionStatus")
        protected BookingRulesType.BookingRule.RestrictionStatus restrictionStatus;
        @XmlElement(name = "Viewerships")
        protected ArrayOfViewershipsTypeViewership viewerships;
        @XmlElement(name = "AddtionalRules")
        protected ArrayOfBookingRulesTypeBookingRuleAdditionalRule addtionalRules;
        @XmlElement(name = "Description")
        protected List<ParagraphType> description;
        @XmlElement(name = "UniqueID")
        protected UniqueIDType uniqueID;
        @XmlElement(name = "CheckoutCharge")
        protected List<BookingRulesType.BookingRule.CheckoutCharge> checkoutCharge;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "MaxAdvancedBookingOffset")
        protected Duration maxAdvancedBookingOffset;
        @XmlAttribute(name = "MinAdvancedBookingOffset")
        protected Duration minAdvancedBookingOffset;
        @XmlAttribute(name = "ForceGuaranteeOffset")
        protected Duration forceGuaranteeOffset;
        @XmlAttribute(name = "DepositWaiverOffset")
        protected Duration depositWaiverOffset;
        @XmlAttribute(name = "MinTotalOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minTotalOccupancy;
        @XmlAttribute(name = "MaxTotalOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxTotalOccupancy;
        @XmlAttribute(name = "AbsoluteDropTime")
        protected String absoluteDropTime;
        @XmlAttribute(name = "GenerallyBookable")
        protected Boolean generallyBookable;
        @XmlAttribute(name = "PriceViewable")
        protected Boolean priceViewable;
        @XmlAttribute(name = "QualifiedRateYN")
        protected Boolean qualifiedRateYN;
        @XmlAttribute(name = "AddressRequired")
        protected Boolean addressRequired;
        @XmlAttribute(name = "AbsoluteCutoff")
        protected String absoluteCutoff;
        @XmlAttribute(name = "OffsetDuration")
        protected Duration offsetDuration;
        @XmlAttribute(name = "OffsetCalculationMode")
        protected String offsetCalculationMode;
        @XmlAttribute(name = "MaxContiguousBookings")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxContiguousBookings;

        /**
         * Gets the value of the acceptableGuarantees property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee }
         *     
         */
        public ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee getAcceptableGuarantees() {
            return acceptableGuarantees;
        }

        /**
         * Sets the value of the acceptableGuarantees property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee }
         *     
         */
        public void setAcceptableGuarantees(ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee value) {
            this.acceptableGuarantees = value;
        }

        /**
         * Gets the value of the cancelPenalties property.
         * 
         * @return
         *     possible object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public CancelPenaltiesType getCancelPenalties() {
            return cancelPenalties;
        }

        /**
         * Sets the value of the cancelPenalties property.
         * 
         * @param value
         *     allowed object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public void setCancelPenalties(CancelPenaltiesType value) {
            this.cancelPenalties = value;
        }

        /**
         * Gets the value of the requiredPaymts property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
         *     
         */
        public ArrayOfRequiredPaymentsTypeGuaranteePayment getRequiredPaymts() {
            return requiredPaymts;
        }

        /**
         * Sets the value of the requiredPaymts property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
         *     
         */
        public void setRequiredPaymts(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
            this.requiredPaymts = value;
        }

        /**
         * Gets the value of the lengthsOfStay property.
         * 
         * @return
         *     possible object is
         *     {@link LengthsOfStayType }
         *     
         */
        public LengthsOfStayType getLengthsOfStay() {
            return lengthsOfStay;
        }

        /**
         * Sets the value of the lengthsOfStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link LengthsOfStayType }
         *     
         */
        public void setLengthsOfStay(LengthsOfStayType value) {
            this.lengthsOfStay = value;
        }

        /**
         * Gets the value of the dowRestrictions property.
         * 
         * @return
         *     possible object is
         *     {@link DOWRestrictionsType }
         *     
         */
        public DOWRestrictionsType getDOWRestrictions() {
            return dowRestrictions;
        }

        /**
         * Sets the value of the dowRestrictions property.
         * 
         * @param value
         *     allowed object is
         *     {@link DOWRestrictionsType }
         *     
         */
        public void setDOWRestrictions(DOWRestrictionsType value) {
            this.dowRestrictions = value;
        }

        /**
         * Gets the value of the restrictionStatus property.
         * 
         * @return
         *     possible object is
         *     {@link BookingRulesType.BookingRule.RestrictionStatus }
         *     
         */
        public BookingRulesType.BookingRule.RestrictionStatus getRestrictionStatus() {
            return restrictionStatus;
        }

        /**
         * Sets the value of the restrictionStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookingRulesType.BookingRule.RestrictionStatus }
         *     
         */
        public void setRestrictionStatus(BookingRulesType.BookingRule.RestrictionStatus value) {
            this.restrictionStatus = value;
        }

        /**
         * Gets the value of the viewerships property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewership }
         *     
         */
        public ArrayOfViewershipsTypeViewership getViewerships() {
            return viewerships;
        }

        /**
         * Sets the value of the viewerships property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewership }
         *     
         */
        public void setViewerships(ArrayOfViewershipsTypeViewership value) {
            this.viewerships = value;
        }

        /**
         * Gets the value of the addtionalRules property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfBookingRulesTypeBookingRuleAdditionalRule }
         *     
         */
        public ArrayOfBookingRulesTypeBookingRuleAdditionalRule getAddtionalRules() {
            return addtionalRules;
        }

        /**
         * Sets the value of the addtionalRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfBookingRulesTypeBookingRuleAdditionalRule }
         *     
         */
        public void setAddtionalRules(ArrayOfBookingRulesTypeBookingRuleAdditionalRule value) {
            this.addtionalRules = value;
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
         * {@link ParagraphType }
         * 
         * 
         */
        public List<ParagraphType> getDescription() {
            if (description == null) {
                description = new ArrayList<ParagraphType>();
            }
            return this.description;
        }

        /**
         * Gets the value of the uniqueID property.
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getUniqueID() {
            return uniqueID;
        }

        /**
         * Sets the value of the uniqueID property.
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setUniqueID(UniqueIDType value) {
            this.uniqueID = value;
        }

        /**
         * Gets the value of the checkoutCharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkoutCharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckoutCharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingRulesType.BookingRule.CheckoutCharge }
         * 
         * 
         */
        public List<BookingRulesType.BookingRule.CheckoutCharge> getCheckoutCharge() {
            if (checkoutCharge == null) {
                checkoutCharge = new ArrayList<BookingRulesType.BookingRule.CheckoutCharge>();
            }
            return this.checkoutCharge;
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

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
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

        /**
         * Gets the value of the forceGuaranteeOffset property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getForceGuaranteeOffset() {
            return forceGuaranteeOffset;
        }

        /**
         * Sets the value of the forceGuaranteeOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setForceGuaranteeOffset(Duration value) {
            this.forceGuaranteeOffset = value;
        }

        /**
         * Gets the value of the depositWaiverOffset property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDepositWaiverOffset() {
            return depositWaiverOffset;
        }

        /**
         * Sets the value of the depositWaiverOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDepositWaiverOffset(Duration value) {
            this.depositWaiverOffset = value;
        }

        /**
         * Gets the value of the minTotalOccupancy property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinTotalOccupancy() {
            return minTotalOccupancy;
        }

        /**
         * Sets the value of the minTotalOccupancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinTotalOccupancy(BigInteger value) {
            this.minTotalOccupancy = value;
        }

        /**
         * Gets the value of the maxTotalOccupancy property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxTotalOccupancy() {
            return maxTotalOccupancy;
        }

        /**
         * Sets the value of the maxTotalOccupancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxTotalOccupancy(BigInteger value) {
            this.maxTotalOccupancy = value;
        }

        /**
         * Gets the value of the absoluteDropTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteDropTime() {
            return absoluteDropTime;
        }

        /**
         * Sets the value of the absoluteDropTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteDropTime(String value) {
            this.absoluteDropTime = value;
        }

        /**
         * Gets the value of the generallyBookable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGenerallyBookable() {
            return generallyBookable;
        }

        /**
         * Sets the value of the generallyBookable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGenerallyBookable(Boolean value) {
            this.generallyBookable = value;
        }

        /**
         * Gets the value of the priceViewable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPriceViewable() {
            return priceViewable;
        }

        /**
         * Sets the value of the priceViewable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPriceViewable(Boolean value) {
            this.priceViewable = value;
        }

        /**
         * Gets the value of the qualifiedRateYN property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isQualifiedRateYN() {
            return qualifiedRateYN;
        }

        /**
         * Sets the value of the qualifiedRateYN property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setQualifiedRateYN(Boolean value) {
            this.qualifiedRateYN = value;
        }

        /**
         * Gets the value of the addressRequired property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAddressRequired() {
            return addressRequired;
        }

        /**
         * Sets the value of the addressRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAddressRequired(Boolean value) {
            this.addressRequired = value;
        }

        /**
         * Gets the value of the absoluteCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteCutoff() {
            return absoluteCutoff;
        }

        /**
         * Sets the value of the absoluteCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteCutoff(String value) {
            this.absoluteCutoff = value;
        }

        /**
         * Gets the value of the offsetDuration property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getOffsetDuration() {
            return offsetDuration;
        }

        /**
         * Sets the value of the offsetDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setOffsetDuration(Duration value) {
            this.offsetDuration = value;
        }

        /**
         * Gets the value of the offsetCalculationMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetCalculationMode() {
            return offsetCalculationMode;
        }

        /**
         * Sets the value of the offsetCalculationMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetCalculationMode(String value) {
            this.offsetCalculationMode = value;
        }

        /**
         * Gets the value of the maxContiguousBookings property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxContiguousBookings() {
            return maxContiguousBookings;
        }

        /**
         * Sets the value of the maxContiguousBookings property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxContiguousBookings(BigInteger value) {
            this.maxContiguousBookings = value;
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
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Type">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Early"/>
         *             &lt;enumeration value="Late"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CheckoutCharge {

            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "Percent")
            protected BigDecimal percent;
            @XmlAttribute(name = "Type")
            protected String type;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "NmbrOfNights")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger nmbrOfNights;
            @XmlAttribute(name = "ExistsCode")
            protected String existsCode;
            @XmlAttribute(name = "BalanceOfStayInd")
            protected Boolean balanceOfStayInd;

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

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

            /**
             * Gets the value of the percent property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercent() {
                return percent;
            }

            /**
             * Sets the value of the percent property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercent(BigDecimal value) {
                this.percent = value;
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
             * Gets the value of the removal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRemoval() {
                return removal;
            }

            /**
             * Sets the value of the removal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }

            /**
             * Gets the value of the codeDetail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * Sets the value of the codeDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * Gets the value of the nmbrOfNights property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNmbrOfNights() {
                return nmbrOfNights;
            }

            /**
             * Sets the value of the nmbrOfNights property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNmbrOfNights(BigInteger value) {
                this.nmbrOfNights = value;
            }

            /**
             * Gets the value of the existsCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExistsCode() {
                return existsCode;
            }

            /**
             * Sets the value of the existsCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExistsCode(String value) {
                this.existsCode = value;
            }

            /**
             * Gets the value of the balanceOfStayInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBalanceOfStayInd() {
                return balanceOfStayInd;
            }

            /**
             * Sets the value of the balanceOfStayInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBalanceOfStayInd(Boolean value) {
                this.balanceOfStayInd = value;
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RestrictionStatus {

            @XmlAttribute(name = "Restriction")
            protected String restriction;
            @XmlAttribute(name = "Status")
            protected AvailabilityStatusType status;
            @XmlAttribute(name = "SellThroughOpenIndicator")
            protected Boolean sellThroughOpenIndicator;

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

        }

    }

}
