
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


/**
 * <p>Java class for InvBlockRoomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvBlockRoomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomTypeAllocations" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomTypeAllocation" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                           &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="CompRoomQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *                           &lt;attribute name="CompRoomFactor" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *                           &lt;attribute name="EndDateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="SellLimit" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                           &lt;attribute name="ProcureBlockCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="AllocationID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RoomTypePickUpStatus" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RatePlans" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RatePlan" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateUploadType">
 *                           &lt;sequence>
 *                             &lt;element name="MarketCode" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="MarketCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                                     &lt;attribute name="MarketCodeName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                                     &lt;attribute name="CommissionableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Commission" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/>
 *                             &lt;element name="MethodInfo" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MethodInfoGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DaysOfWeeks" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DaysOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DOW_RulesType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PromotionCodeGroup"/>
 *                           &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="BookingCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="UpgradeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DaysOfWeeks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DaysOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DOW_RulesType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *       &lt;attribute name="RoomTypeCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvBlockRoomType", propOrder = {
    "roomTypeAllocations",
    "ratePlans",
    "daysOfWeeks"
})
public class InvBlockRoomType {

    @XmlElement(name = "RoomTypeAllocations")
    protected List<InvBlockRoomType.RoomTypeAllocations> roomTypeAllocations;
    @XmlElement(name = "RatePlans")
    protected InvBlockRoomType.RatePlans ratePlans;
    @XmlElement(name = "DaysOfWeeks")
    protected InvBlockRoomType.DaysOfWeeks daysOfWeeks;
    @XmlAttribute(name = "RoomTypeCode")
    protected String roomTypeCode;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;

    /**
     * Gets the value of the roomTypeAllocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomTypeAllocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomTypeAllocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvBlockRoomType.RoomTypeAllocations }
     * 
     * 
     */
    public List<InvBlockRoomType.RoomTypeAllocations> getRoomTypeAllocations() {
        if (roomTypeAllocations == null) {
            roomTypeAllocations = new ArrayList<InvBlockRoomType.RoomTypeAllocations>();
        }
        return this.roomTypeAllocations;
    }

    /**
     * Gets the value of the ratePlans property.
     * 
     * @return
     *     possible object is
     *     {@link InvBlockRoomType.RatePlans }
     *     
     */
    public InvBlockRoomType.RatePlans getRatePlans() {
        return ratePlans;
    }

    /**
     * Sets the value of the ratePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvBlockRoomType.RatePlans }
     *     
     */
    public void setRatePlans(InvBlockRoomType.RatePlans value) {
        this.ratePlans = value;
    }

    /**
     * Gets the value of the daysOfWeeks property.
     * 
     * @return
     *     possible object is
     *     {@link InvBlockRoomType.DaysOfWeeks }
     *     
     */
    public InvBlockRoomType.DaysOfWeeks getDaysOfWeeks() {
        return daysOfWeeks;
    }

    /**
     * Sets the value of the daysOfWeeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvBlockRoomType.DaysOfWeeks }
     *     
     */
    public void setDaysOfWeeks(InvBlockRoomType.DaysOfWeeks value) {
        this.daysOfWeeks = value;
    }

    /**
     * Gets the value of the roomTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * Sets the value of the roomTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DaysOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DOW_RulesType" maxOccurs="unbounded"/>
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
        "daysOfWeek"
    })
    public static class DaysOfWeeks {

        @XmlElement(name = "DaysOfWeek", required = true)
        protected List<DOWRulesType> daysOfWeek;

        /**
         * Gets the value of the daysOfWeek property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the daysOfWeek property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDaysOfWeek().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DOWRulesType }
         * 
         * 
         */
        public List<DOWRulesType> getDaysOfWeek() {
            if (daysOfWeek == null) {
                daysOfWeek = new ArrayList<DOWRulesType>();
            }
            return this.daysOfWeek;
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
     *         &lt;element name="RatePlan" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateUploadType">
     *                 &lt;sequence>
     *                   &lt;element name="MarketCode" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="MarketCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                           &lt;attribute name="MarketCodeName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                           &lt;attribute name="CommissionableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Commission" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/>
     *                   &lt;element name="MethodInfo" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MethodInfoGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DaysOfWeeks" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DaysOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DOW_RulesType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PromotionCodeGroup"/>
     *                 &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="BookingCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="UpgradeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "ratePlan"
    })
    public static class RatePlans {

        @XmlElement(name = "RatePlan", required = true)
        protected List<InvBlockRoomType.RatePlans.RatePlan> ratePlan;

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
         * {@link InvBlockRoomType.RatePlans.RatePlan }
         * 
         * 
         */
        public List<InvBlockRoomType.RatePlans.RatePlan> getRatePlan() {
            if (ratePlan == null) {
                ratePlan = new ArrayList<InvBlockRoomType.RatePlans.RatePlan>();
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateUploadType">
         *       &lt;sequence>
         *         &lt;element name="MarketCode" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="MarketCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *                 &lt;attribute name="MarketCodeName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *                 &lt;attribute name="CommissionableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Commission" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/>
         *         &lt;element name="MethodInfo" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MethodInfoGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DaysOfWeeks" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DaysOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DOW_RulesType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PromotionCodeGroup"/>
         *       &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="BookingCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="UpgradeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "marketCode",
            "commission",
            "methodInfo",
            "daysOfWeeks"
        })
        public static class RatePlan
            extends RateUploadType
        {

            @XmlElement(name = "MarketCode")
            protected List<InvBlockRoomType.RatePlans.RatePlan.MarketCode> marketCode;
            @XmlElement(name = "Commission")
            protected CommissionType commission;
            @XmlElement(name = "MethodInfo")
            protected List<InvBlockRoomType.RatePlans.RatePlan.MethodInfo> methodInfo;
            @XmlElement(name = "DaysOfWeeks")
            protected InvBlockRoomType.RatePlans.RatePlan.DaysOfWeeks daysOfWeeks;
            @XmlAttribute(name = "RatePlanCode")
            protected String ratePlanCode;
            @XmlAttribute(name = "BookingCode")
            protected String bookingCode;
            @XmlAttribute(name = "UpgradeIndicator")
            protected Boolean upgradeIndicator;
            @XmlAttribute(name = "PromotionCode")
            protected String promotionCode;
            @XmlAttribute(name = "PromotionVendorCode")
            protected List<String> promotionVendorCode;

            /**
             * Gets the value of the marketCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the marketCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMarketCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InvBlockRoomType.RatePlans.RatePlan.MarketCode }
             * 
             * 
             */
            public List<InvBlockRoomType.RatePlans.RatePlan.MarketCode> getMarketCode() {
                if (marketCode == null) {
                    marketCode = new ArrayList<InvBlockRoomType.RatePlans.RatePlan.MarketCode>();
                }
                return this.marketCode;
            }

            /**
             * Gets the value of the commission property.
             * 
             * @return
             *     possible object is
             *     {@link CommissionType }
             *     
             */
            public CommissionType getCommission() {
                return commission;
            }

            /**
             * Sets the value of the commission property.
             * 
             * @param value
             *     allowed object is
             *     {@link CommissionType }
             *     
             */
            public void setCommission(CommissionType value) {
                this.commission = value;
            }

            /**
             * Gets the value of the methodInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the methodInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMethodInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InvBlockRoomType.RatePlans.RatePlan.MethodInfo }
             * 
             * 
             */
            public List<InvBlockRoomType.RatePlans.RatePlan.MethodInfo> getMethodInfo() {
                if (methodInfo == null) {
                    methodInfo = new ArrayList<InvBlockRoomType.RatePlans.RatePlan.MethodInfo>();
                }
                return this.methodInfo;
            }

            /**
             * Gets the value of the daysOfWeeks property.
             * 
             * @return
             *     possible object is
             *     {@link InvBlockRoomType.RatePlans.RatePlan.DaysOfWeeks }
             *     
             */
            public InvBlockRoomType.RatePlans.RatePlan.DaysOfWeeks getDaysOfWeeks() {
                return daysOfWeeks;
            }

            /**
             * Sets the value of the daysOfWeeks property.
             * 
             * @param value
             *     allowed object is
             *     {@link InvBlockRoomType.RatePlans.RatePlan.DaysOfWeeks }
             *     
             */
            public void setDaysOfWeeks(InvBlockRoomType.RatePlans.RatePlan.DaysOfWeeks value) {
                this.daysOfWeeks = value;
            }

            /**
             * Gets the value of the ratePlanCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRatePlanCode() {
                return ratePlanCode;
            }

            /**
             * Sets the value of the ratePlanCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRatePlanCode(String value) {
                this.ratePlanCode = value;
            }

            /**
             * Gets the value of the bookingCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBookingCode() {
                return bookingCode;
            }

            /**
             * Sets the value of the bookingCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBookingCode(String value) {
                this.bookingCode = value;
            }

            /**
             * Gets the value of the upgradeIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isUpgradeIndicator() {
                return upgradeIndicator;
            }

            /**
             * Sets the value of the upgradeIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setUpgradeIndicator(Boolean value) {
                this.upgradeIndicator = value;
            }

            /**
             * Gets the value of the promotionCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPromotionCode() {
                return promotionCode;
            }

            /**
             * Sets the value of the promotionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPromotionCode(String value) {
                this.promotionCode = value;
            }

            /**
             * Gets the value of the promotionVendorCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPromotionVendorCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getPromotionVendorCode() {
                if (promotionVendorCode == null) {
                    promotionVendorCode = new ArrayList<String>();
                }
                return this.promotionVendorCode;
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
             *         &lt;element name="DaysOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DOW_RulesType" maxOccurs="unbounded"/>
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
                "daysOfWeek"
            })
            public static class DaysOfWeeks {

                @XmlElement(name = "DaysOfWeek", required = true)
                protected List<DOWRulesType> daysOfWeek;

                /**
                 * Gets the value of the daysOfWeek property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the daysOfWeek property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDaysOfWeek().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DOWRulesType }
                 * 
                 * 
                 */
                public List<DOWRulesType> getDaysOfWeek() {
                    if (daysOfWeek == null) {
                        daysOfWeek = new ArrayList<DOWRulesType>();
                    }
                    return this.daysOfWeek;
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
             *       &lt;attribute name="MarketCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
             *       &lt;attribute name="MarketCodeName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
             *       &lt;attribute name="CommissionableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MarketCode {

                @XmlAttribute(name = "MarketCode")
                protected String marketCode;
                @XmlAttribute(name = "MarketCodeName")
                protected String marketCodeName;
                @XmlAttribute(name = "CommissionableIndicator")
                protected Boolean commissionableIndicator;

                /**
                 * Gets the value of the marketCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMarketCode() {
                    return marketCode;
                }

                /**
                 * Sets the value of the marketCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMarketCode(String value) {
                    this.marketCode = value;
                }

                /**
                 * Gets the value of the marketCodeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMarketCodeName() {
                    return marketCodeName;
                }

                /**
                 * Sets the value of the marketCodeName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMarketCodeName(String value) {
                    this.marketCodeName = value;
                }

                /**
                 * Gets the value of the commissionableIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isCommissionableIndicator() {
                    return commissionableIndicator;
                }

                /**
                 * Sets the value of the commissionableIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setCommissionableIndicator(Boolean value) {
                    this.commissionableIndicator = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MethodInfoGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MethodInfo {

                @XmlAttribute(name = "BillingType")
                protected String billingType;
                @XmlAttribute(name = "SignFoodAndBev")
                protected Boolean signFoodAndBev;
                @XmlAttribute(name = "ReservationMethodCode")
                protected String reservationMethodCode;

                /**
                 * Gets the value of the billingType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBillingType() {
                    return billingType;
                }

                /**
                 * Sets the value of the billingType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBillingType(String value) {
                    this.billingType = value;
                }

                /**
                 * Gets the value of the signFoodAndBev property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSignFoodAndBev() {
                    return signFoodAndBev;
                }

                /**
                 * Sets the value of the signFoodAndBev property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSignFoodAndBev(Boolean value) {
                    this.signFoodAndBev = value;
                }

                /**
                 * Gets the value of the reservationMethodCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReservationMethodCode() {
                    return reservationMethodCode;
                }

                /**
                 * Sets the value of the reservationMethodCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReservationMethodCode(String value) {
                    this.reservationMethodCode = value;
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
     *         &lt;element name="RoomTypeAllocation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *                 &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="CompRoomQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
     *                 &lt;attribute name="CompRoomFactor" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
     *                 &lt;attribute name="EndDateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="SellLimit" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;attribute name="ProcureBlockCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="AllocationID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RoomTypePickUpStatus" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomTypeAllocation"
    })
    public static class RoomTypeAllocations {

        @XmlElement(name = "RoomTypeAllocation", required = true)
        protected List<InvBlockRoomType.RoomTypeAllocations.RoomTypeAllocation> roomTypeAllocation;
        @XmlAttribute(name = "RoomTypePickUpStatus")
        protected String roomTypePickUpStatus;

        /**
         * Gets the value of the roomTypeAllocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomTypeAllocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomTypeAllocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvBlockRoomType.RoomTypeAllocations.RoomTypeAllocation }
         * 
         * 
         */
        public List<InvBlockRoomType.RoomTypeAllocations.RoomTypeAllocation> getRoomTypeAllocation() {
            if (roomTypeAllocation == null) {
                roomTypeAllocation = new ArrayList<InvBlockRoomType.RoomTypeAllocations.RoomTypeAllocation>();
            }
            return this.roomTypeAllocation;
        }

        /**
         * Gets the value of the roomTypePickUpStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomTypePickUpStatus() {
            return roomTypePickUpStatus;
        }

        /**
         * Sets the value of the roomTypePickUpStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomTypePickUpStatus(String value) {
            this.roomTypePickUpStatus = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
         *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="CompRoomQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
         *       &lt;attribute name="CompRoomFactor" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
         *       &lt;attribute name="EndDateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="SellLimit" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *       &lt;attribute name="ProcureBlockCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="AllocationID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RoomTypeAllocation {

            @XmlAttribute(name = "NumberOfUnits")
            protected BigInteger numberOfUnits;
            @XmlAttribute(name = "CompRoomQuantity")
            protected Integer compRoomQuantity;
            @XmlAttribute(name = "CompRoomFactor")
            protected Integer compRoomFactor;
            @XmlAttribute(name = "EndDateIndicator")
            protected Boolean endDateIndicator;
            @XmlAttribute(name = "SellLimit")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger sellLimit;
            @XmlAttribute(name = "ProcureBlockCode")
            protected String procureBlockCode;
            @XmlAttribute(name = "AllocationID")
            protected String allocationID;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;

            /**
             * Gets the value of the numberOfUnits property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumberOfUnits() {
                return numberOfUnits;
            }

            /**
             * Sets the value of the numberOfUnits property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumberOfUnits(BigInteger value) {
                this.numberOfUnits = value;
            }

            /**
             * Gets the value of the compRoomQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCompRoomQuantity() {
                return compRoomQuantity;
            }

            /**
             * Sets the value of the compRoomQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCompRoomQuantity(Integer value) {
                this.compRoomQuantity = value;
            }

            /**
             * Gets the value of the compRoomFactor property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCompRoomFactor() {
                return compRoomFactor;
            }

            /**
             * Sets the value of the compRoomFactor property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCompRoomFactor(Integer value) {
                this.compRoomFactor = value;
            }

            /**
             * Gets the value of the endDateIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isEndDateIndicator() {
                return endDateIndicator;
            }

            /**
             * Sets the value of the endDateIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEndDateIndicator(Boolean value) {
                this.endDateIndicator = value;
            }

            /**
             * Gets the value of the sellLimit property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSellLimit() {
                return sellLimit;
            }

            /**
             * Sets the value of the sellLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSellLimit(BigInteger value) {
                this.sellLimit = value;
            }

            /**
             * Gets the value of the procureBlockCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProcureBlockCode() {
                return procureBlockCode;
            }

            /**
             * Sets the value of the procureBlockCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProcureBlockCode(String value) {
                this.procureBlockCode = value;
            }

            /**
             * Gets the value of the allocationID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAllocationID() {
                return allocationID;
            }

            /**
             * Sets the value of the allocationID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAllocationID(String value) {
                this.allocationID = value;
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

        }

    }

}
