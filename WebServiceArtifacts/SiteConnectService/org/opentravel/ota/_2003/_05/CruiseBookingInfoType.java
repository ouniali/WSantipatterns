
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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CruiseBookingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CruiseBookingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingPrices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BookingPrice" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruisePriceGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentSchedule" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Payment" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                           &lt;attribute name="PaymentNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                           &lt;attribute name="DueDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GuestPrices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GuestPrice" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GuestType">
 *                           &lt;sequence>
 *                             &lt;element name="PriceInfos">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PriceInfo" maxOccurs="99">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruisePriceGroup"/>
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
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PolicyInfo" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseBookingInfoType", propOrder = {
    "bookingPrices",
    "paymentSchedule",
    "guestPrices",
    "policyInfo"
})
public class CruiseBookingInfoType {

    @XmlElement(name = "BookingPrices")
    protected CruiseBookingInfoType.BookingPrices bookingPrices;
    @XmlElement(name = "PaymentSchedule")
    protected CruiseBookingInfoType.PaymentSchedule paymentSchedule;
    @XmlElement(name = "GuestPrices")
    protected CruiseBookingInfoType.GuestPrices guestPrices;
    @XmlElement(name = "PolicyInfo")
    protected List<ParagraphType> policyInfo;

    /**
     * Gets the value of the bookingPrices property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseBookingInfoType.BookingPrices }
     *     
     */
    public CruiseBookingInfoType.BookingPrices getBookingPrices() {
        return bookingPrices;
    }

    /**
     * Sets the value of the bookingPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseBookingInfoType.BookingPrices }
     *     
     */
    public void setBookingPrices(CruiseBookingInfoType.BookingPrices value) {
        this.bookingPrices = value;
    }

    /**
     * Gets the value of the paymentSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseBookingInfoType.PaymentSchedule }
     *     
     */
    public CruiseBookingInfoType.PaymentSchedule getPaymentSchedule() {
        return paymentSchedule;
    }

    /**
     * Sets the value of the paymentSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseBookingInfoType.PaymentSchedule }
     *     
     */
    public void setPaymentSchedule(CruiseBookingInfoType.PaymentSchedule value) {
        this.paymentSchedule = value;
    }

    /**
     * Gets the value of the guestPrices property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseBookingInfoType.GuestPrices }
     *     
     */
    public CruiseBookingInfoType.GuestPrices getGuestPrices() {
        return guestPrices;
    }

    /**
     * Sets the value of the guestPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseBookingInfoType.GuestPrices }
     *     
     */
    public void setGuestPrices(CruiseBookingInfoType.GuestPrices value) {
        this.guestPrices = value;
    }

    /**
     * Gets the value of the policyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getPolicyInfo() {
        if (policyInfo == null) {
            policyInfo = new ArrayList<ParagraphType>();
        }
        return this.policyInfo;
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
     *         &lt;element name="BookingPrice" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruisePriceGroup"/>
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
        "bookingPrice"
    })
    public static class BookingPrices {

        @XmlElement(name = "BookingPrice", required = true)
        protected List<CruiseBookingInfoType.BookingPrices.BookingPrice> bookingPrice;

        /**
         * Gets the value of the bookingPrice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingPrice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseBookingInfoType.BookingPrices.BookingPrice }
         * 
         * 
         */
        public List<CruiseBookingInfoType.BookingPrices.BookingPrice> getBookingPrice() {
            if (bookingPrice == null) {
                bookingPrice = new ArrayList<CruiseBookingInfoType.BookingPrices.BookingPrice>();
            }
            return this.bookingPrice;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruisePriceGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BookingPrice {

            @XmlAttribute(name = "PriceTypeCode", required = true)
            protected String priceTypeCode;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "RestrictedIndicator")
            protected Boolean restrictedIndicator;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "Percent")
            protected BigDecimal percent;

            /**
             * Gets the value of the priceTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceTypeCode() {
                return priceTypeCode;
            }

            /**
             * Sets the value of the priceTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceTypeCode(String value) {
                this.priceTypeCode = value;
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
             * Gets the value of the restrictedIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRestrictedIndicator() {
                return restrictedIndicator;
            }

            /**
             * Sets the value of the restrictedIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRestrictedIndicator(Boolean value) {
                this.restrictedIndicator = value;
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
     *         &lt;element name="GuestPrice" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GuestType">
     *                 &lt;sequence>
     *                   &lt;element name="PriceInfos">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PriceInfo" maxOccurs="99">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruisePriceGroup"/>
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
        "guestPrice"
    })
    public static class GuestPrices {

        @XmlElement(name = "GuestPrice", required = true)
        protected List<CruiseBookingInfoType.GuestPrices.GuestPrice> guestPrice;

        /**
         * Gets the value of the guestPrice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guestPrice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuestPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseBookingInfoType.GuestPrices.GuestPrice }
         * 
         * 
         */
        public List<CruiseBookingInfoType.GuestPrices.GuestPrice> getGuestPrice() {
            if (guestPrice == null) {
                guestPrice = new ArrayList<CruiseBookingInfoType.GuestPrices.GuestPrice>();
            }
            return this.guestPrice;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GuestType">
         *       &lt;sequence>
         *         &lt;element name="PriceInfos">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PriceInfo" maxOccurs="99">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruisePriceGroup"/>
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
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "priceInfos"
        })
        public static class GuestPrice
            extends GuestType
        {

            @XmlElement(name = "PriceInfos", required = true)
            protected CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos priceInfos;

            /**
             * Gets the value of the priceInfos property.
             * 
             * @return
             *     possible object is
             *     {@link CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos }
             *     
             */
            public CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos getPriceInfos() {
                return priceInfos;
            }

            /**
             * Sets the value of the priceInfos property.
             * 
             * @param value
             *     allowed object is
             *     {@link CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos }
             *     
             */
            public void setPriceInfos(CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos value) {
                this.priceInfos = value;
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
             *         &lt;element name="PriceInfo" maxOccurs="99">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruisePriceGroup"/>
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
                "priceInfo"
            })
            public static class PriceInfos {

                @XmlElement(name = "PriceInfo", required = true)
                protected List<CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos.PriceInfo> priceInfo;

                /**
                 * Gets the value of the priceInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the priceInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPriceInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos.PriceInfo }
                 * 
                 * 
                 */
                public List<CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos.PriceInfo> getPriceInfo() {
                    if (priceInfo == null) {
                        priceInfo = new ArrayList<CruiseBookingInfoType.GuestPrices.GuestPrice.PriceInfos.PriceInfo>();
                    }
                    return this.priceInfo;
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
                 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruisePriceGroup"/>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class PriceInfo {

                    @XmlAttribute(name = "PriceTypeCode", required = true)
                    protected String priceTypeCode;
                    @XmlAttribute(name = "Amount")
                    protected BigDecimal amount;
                    @XmlAttribute(name = "RestrictedIndicator")
                    protected Boolean restrictedIndicator;
                    @XmlAttribute(name = "CodeDetail")
                    protected String codeDetail;
                    @XmlAttribute(name = "Percent")
                    protected BigDecimal percent;

                    /**
                     * Gets the value of the priceTypeCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPriceTypeCode() {
                        return priceTypeCode;
                    }

                    /**
                     * Sets the value of the priceTypeCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPriceTypeCode(String value) {
                        this.priceTypeCode = value;
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
                     * Gets the value of the restrictedIndicator property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isRestrictedIndicator() {
                        return restrictedIndicator;
                    }

                    /**
                     * Sets the value of the restrictedIndicator property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setRestrictedIndicator(Boolean value) {
                        this.restrictedIndicator = value;
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
     *         &lt;element name="Payment" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                 &lt;attribute name="PaymentNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *                 &lt;attribute name="DueDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
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
        "payment"
    })
    public static class PaymentSchedule {

        @XmlElement(name = "Payment", required = true)
        protected List<CruiseBookingInfoType.PaymentSchedule.Payment> payment;

        /**
         * Gets the value of the payment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseBookingInfoType.PaymentSchedule.Payment }
         * 
         * 
         */
        public List<CruiseBookingInfoType.PaymentSchedule.Payment> getPayment() {
            if (payment == null) {
                payment = new ArrayList<CruiseBookingInfoType.PaymentSchedule.Payment>();
            }
            return this.payment;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *       &lt;attribute name="PaymentNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
         *       &lt;attribute name="DueDate" use="required" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Payment {

            @XmlAttribute(name = "PaymentNumber", required = true)
            protected int paymentNumber;
            @XmlAttribute(name = "DueDate", required = true)
            protected String dueDate;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the paymentNumber property.
             * 
             */
            public int getPaymentNumber() {
                return paymentNumber;
            }

            /**
             * Sets the value of the paymentNumber property.
             * 
             */
            public void setPaymentNumber(int value) {
                this.paymentNumber = value;
            }

            /**
             * Gets the value of the dueDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDueDate() {
                return dueDate;
            }

            /**
             * Sets the value of the dueDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDueDate(String value) {
                this.dueDate = value;
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

    }

}
