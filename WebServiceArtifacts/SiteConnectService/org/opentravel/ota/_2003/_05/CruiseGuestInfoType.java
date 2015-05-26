
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CruiseGuestInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CruiseGuestInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}ReservationID_Type" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="GuestDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GuestDetail" type="{http://www.opentravel.org/OTA/2003/05}CruiseGuestDetailType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LinkedBookings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LinkedBooking" maxOccurs="32">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType">
 *                           &lt;attribute name="LinkTypeCode" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentOption" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
 *                           &lt;attribute name="ExtendedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="PaymentPurpose">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="GiftOrder"/>
 *                                 &lt;enumeration value="Reservation"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ExtendedDepositDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="ReferenceNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CancellationPenalty" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
@XmlType(name = "CruiseGuestInfoType", propOrder = {
    "reservationID",
    "guestDetails",
    "linkedBookings",
    "paymentOptions",
    "cancellationPenalty"
})
public class CruiseGuestInfoType {

    @XmlElement(name = "ReservationID")
    protected List<ReservationIDType> reservationID;
    @XmlElement(name = "GuestDetails", required = true)
    protected CruiseGuestInfoType.GuestDetails guestDetails;
    @XmlElement(name = "LinkedBookings")
    protected CruiseGuestInfoType.LinkedBookings linkedBookings;
    @XmlElement(name = "PaymentOptions")
    protected CruiseGuestInfoType.PaymentOptions paymentOptions;
    @XmlElement(name = "CancellationPenalty")
    protected CruiseGuestInfoType.CancellationPenalty cancellationPenalty;

    /**
     * Gets the value of the reservationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationIDType }
     * 
     * 
     */
    public List<ReservationIDType> getReservationID() {
        if (reservationID == null) {
            reservationID = new ArrayList<ReservationIDType>();
        }
        return this.reservationID;
    }

    /**
     * Gets the value of the guestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestInfoType.GuestDetails }
     *     
     */
    public CruiseGuestInfoType.GuestDetails getGuestDetails() {
        return guestDetails;
    }

    /**
     * Sets the value of the guestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestInfoType.GuestDetails }
     *     
     */
    public void setGuestDetails(CruiseGuestInfoType.GuestDetails value) {
        this.guestDetails = value;
    }

    /**
     * Gets the value of the linkedBookings property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestInfoType.LinkedBookings }
     *     
     */
    public CruiseGuestInfoType.LinkedBookings getLinkedBookings() {
        return linkedBookings;
    }

    /**
     * Sets the value of the linkedBookings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestInfoType.LinkedBookings }
     *     
     */
    public void setLinkedBookings(CruiseGuestInfoType.LinkedBookings value) {
        this.linkedBookings = value;
    }

    /**
     * Gets the value of the paymentOptions property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestInfoType.PaymentOptions }
     *     
     */
    public CruiseGuestInfoType.PaymentOptions getPaymentOptions() {
        return paymentOptions;
    }

    /**
     * Sets the value of the paymentOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestInfoType.PaymentOptions }
     *     
     */
    public void setPaymentOptions(CruiseGuestInfoType.PaymentOptions value) {
        this.paymentOptions = value;
    }

    /**
     * Gets the value of the cancellationPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestInfoType.CancellationPenalty }
     *     
     */
    public CruiseGuestInfoType.CancellationPenalty getCancellationPenalty() {
        return cancellationPenalty;
    }

    /**
     * Sets the value of the cancellationPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestInfoType.CancellationPenalty }
     *     
     */
    public void setCancellationPenalty(CruiseGuestInfoType.CancellationPenalty value) {
        this.cancellationPenalty = value;
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
     *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CancellationPenalty {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

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
     *         &lt;element name="GuestDetail" type="{http://www.opentravel.org/OTA/2003/05}CruiseGuestDetailType" maxOccurs="9"/>
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
        "guestDetail"
    })
    public static class GuestDetails {

        @XmlElement(name = "GuestDetail", required = true)
        protected List<CruiseGuestDetailType> guestDetail;

        /**
         * Gets the value of the guestDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guestDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuestDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseGuestDetailType }
         * 
         * 
         */
        public List<CruiseGuestDetailType> getGuestDetail() {
            if (guestDetail == null) {
                guestDetail = new ArrayList<CruiseGuestDetailType>();
            }
            return this.guestDetail;
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
     *         &lt;element name="LinkedBooking" maxOccurs="32">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType">
     *                 &lt;attribute name="LinkTypeCode" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
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
        "linkedBooking"
    })
    public static class LinkedBookings {

        @XmlElement(name = "LinkedBooking", required = true)
        protected List<CruiseGuestInfoType.LinkedBookings.LinkedBooking> linkedBooking;

        /**
         * Gets the value of the linkedBooking property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linkedBooking property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinkedBooking().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseGuestInfoType.LinkedBookings.LinkedBooking }
         * 
         * 
         */
        public List<CruiseGuestInfoType.LinkedBookings.LinkedBooking> getLinkedBooking() {
            if (linkedBooking == null) {
                linkedBooking = new ArrayList<CruiseGuestInfoType.LinkedBookings.LinkedBooking>();
            }
            return this.linkedBooking;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType">
         *       &lt;attribute name="LinkTypeCode" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LinkedBooking
            extends RelatedTravelerType
        {

            @XmlAttribute(name = "LinkTypeCode")
            protected List<String> linkTypeCode;

            /**
             * Gets the value of the linkTypeCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the linkTypeCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLinkTypeCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getLinkTypeCode() {
                if (linkTypeCode == null) {
                    linkTypeCode = new ArrayList<String>();
                }
                return this.linkTypeCode;
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
     *         &lt;element name="PaymentOption" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
     *                 &lt;attribute name="ExtendedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="PaymentPurpose">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="GiftOrder"/>
     *                       &lt;enumeration value="Reservation"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="ExtendedDepositDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="ReferenceNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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
        "paymentOption"
    })
    public static class PaymentOptions {

        @XmlElement(name = "PaymentOption", required = true)
        protected List<CruiseGuestInfoType.PaymentOptions.PaymentOption> paymentOption;

        /**
         * Gets the value of the paymentOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseGuestInfoType.PaymentOptions.PaymentOption }
         * 
         * 
         */
        public List<CruiseGuestInfoType.PaymentOptions.PaymentOption> getPaymentOption() {
            if (paymentOption == null) {
                paymentOption = new ArrayList<CruiseGuestInfoType.PaymentOptions.PaymentOption>();
            }
            return this.paymentOption;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
         *       &lt;attribute name="ExtendedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="PaymentPurpose">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="GiftOrder"/>
         *             &lt;enumeration value="Reservation"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="ExtendedDepositDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="ReferenceNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PaymentOption
            extends PaymentDetailType
        {

            @XmlAttribute(name = "ExtendedIndicator")
            protected Boolean extendedIndicator;
            @XmlAttribute(name = "PaymentPurpose")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String paymentPurpose;
            @XmlAttribute(name = "ExtendedDepositDate")
            protected String extendedDepositDate;
            @XmlAttribute(name = "ReferenceNumber")
            protected String referenceNumber;

            /**
             * Gets the value of the extendedIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isExtendedIndicator() {
                return extendedIndicator;
            }

            /**
             * Sets the value of the extendedIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setExtendedIndicator(Boolean value) {
                this.extendedIndicator = value;
            }

            /**
             * Gets the value of the paymentPurpose property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentPurpose() {
                return paymentPurpose;
            }

            /**
             * Sets the value of the paymentPurpose property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentPurpose(String value) {
                this.paymentPurpose = value;
            }

            /**
             * Gets the value of the extendedDepositDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtendedDepositDate() {
                return extendedDepositDate;
            }

            /**
             * Sets the value of the extendedDepositDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtendedDepositDate(String value) {
                this.extendedDepositDate = value;
            }

            /**
             * Gets the value of the referenceNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenceNumber() {
                return referenceNumber;
            }

            /**
             * Sets the value of the referenceNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenceNumber(String value) {
                this.referenceNumber = value;
            }

        }

    }

}
