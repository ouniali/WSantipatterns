
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
 * <p>Java class for RatePlanCandidatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlanCandidatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePlanCandidate" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HotelRefs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HotelRef" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MealsIncluded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MealsIncludedGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ArrivalPolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="GuaranteePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="DepositPolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="HoldTimePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RatePlanCommission" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="MaxCommissionPercentage" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *                           &lt;attribute name="MinCommissionPercentage" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *                           &lt;attribute name="CommissionableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RatePlanGroup"/>
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="PrepaidQualifier">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="IncludePrepaid"/>
 *                       &lt;enumeration value="PrepaidOnly"/>
 *                       &lt;enumeration value="ExcludePrepaid"/>
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
@XmlType(name = "RatePlanCandidatesType", propOrder = {
    "ratePlanCandidate"
})
public class RatePlanCandidatesType {

    @XmlElement(name = "RatePlanCandidate", required = true)
    protected List<RatePlanCandidatesType.RatePlanCandidate> ratePlanCandidate;

    /**
     * Gets the value of the ratePlanCandidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanCandidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatePlanCandidatesType.RatePlanCandidate }
     * 
     * 
     */
    public List<RatePlanCandidatesType.RatePlanCandidate> getRatePlanCandidate() {
        if (ratePlanCandidate == null) {
            ratePlanCandidate = new ArrayList<RatePlanCandidatesType.RatePlanCandidate>();
        }
        return this.ratePlanCandidate;
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
     *         &lt;element name="HotelRefs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HotelRef" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MealsIncluded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MealsIncludedGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ArrivalPolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="GuaranteePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="DepositPolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="HoldTimePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RatePlanCommission" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="MaxCommissionPercentage" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *                 &lt;attribute name="MinCommissionPercentage" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *                 &lt;attribute name="CommissionableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RatePlanGroup"/>
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="PrepaidQualifier">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="IncludePrepaid"/>
     *             &lt;enumeration value="PrepaidOnly"/>
     *             &lt;enumeration value="ExcludePrepaid"/>
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
        "hotelRefs",
        "mealsIncluded",
        "arrivalPolicy",
        "ratePlanCommission"
    })
    public static class RatePlanCandidate {

        @XmlElement(name = "HotelRefs")
        protected RatePlanCandidatesType.RatePlanCandidate.HotelRefs hotelRefs;
        @XmlElement(name = "MealsIncluded")
        protected RatePlanCandidatesType.RatePlanCandidate.MealsIncluded mealsIncluded;
        @XmlElement(name = "ArrivalPolicy")
        protected RatePlanCandidatesType.RatePlanCandidate.ArrivalPolicy arrivalPolicy;
        @XmlElement(name = "RatePlanCommission")
        protected RatePlanCandidatesType.RatePlanCandidate.RatePlanCommission ratePlanCommission;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "PrepaidQualifier")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String prepaidQualifier;
        @XmlAttribute(name = "RatePlanType")
        protected String ratePlanType;
        @XmlAttribute(name = "RatePlanCode")
        protected String ratePlanCode;
        @XmlAttribute(name = "RatePlanID")
        protected String ratePlanID;
        @XmlAttribute(name = "RatePlanQualifier")
        protected Boolean ratePlanQualifier;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "PromotionVendorCode")
        protected List<String> promotionVendorCode;
        @XmlAttribute(name = "RatePlanCategory")
        protected String ratePlanCategory;

        /**
         * Gets the value of the hotelRefs property.
         * 
         * @return
         *     possible object is
         *     {@link RatePlanCandidatesType.RatePlanCandidate.HotelRefs }
         *     
         */
        public RatePlanCandidatesType.RatePlanCandidate.HotelRefs getHotelRefs() {
            return hotelRefs;
        }

        /**
         * Sets the value of the hotelRefs property.
         * 
         * @param value
         *     allowed object is
         *     {@link RatePlanCandidatesType.RatePlanCandidate.HotelRefs }
         *     
         */
        public void setHotelRefs(RatePlanCandidatesType.RatePlanCandidate.HotelRefs value) {
            this.hotelRefs = value;
        }

        /**
         * Gets the value of the mealsIncluded property.
         * 
         * @return
         *     possible object is
         *     {@link RatePlanCandidatesType.RatePlanCandidate.MealsIncluded }
         *     
         */
        public RatePlanCandidatesType.RatePlanCandidate.MealsIncluded getMealsIncluded() {
            return mealsIncluded;
        }

        /**
         * Sets the value of the mealsIncluded property.
         * 
         * @param value
         *     allowed object is
         *     {@link RatePlanCandidatesType.RatePlanCandidate.MealsIncluded }
         *     
         */
        public void setMealsIncluded(RatePlanCandidatesType.RatePlanCandidate.MealsIncluded value) {
            this.mealsIncluded = value;
        }

        /**
         * Gets the value of the arrivalPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link RatePlanCandidatesType.RatePlanCandidate.ArrivalPolicy }
         *     
         */
        public RatePlanCandidatesType.RatePlanCandidate.ArrivalPolicy getArrivalPolicy() {
            return arrivalPolicy;
        }

        /**
         * Sets the value of the arrivalPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link RatePlanCandidatesType.RatePlanCandidate.ArrivalPolicy }
         *     
         */
        public void setArrivalPolicy(RatePlanCandidatesType.RatePlanCandidate.ArrivalPolicy value) {
            this.arrivalPolicy = value;
        }

        /**
         * Gets the value of the ratePlanCommission property.
         * 
         * @return
         *     possible object is
         *     {@link RatePlanCandidatesType.RatePlanCandidate.RatePlanCommission }
         *     
         */
        public RatePlanCandidatesType.RatePlanCandidate.RatePlanCommission getRatePlanCommission() {
            return ratePlanCommission;
        }

        /**
         * Sets the value of the ratePlanCommission property.
         * 
         * @param value
         *     allowed object is
         *     {@link RatePlanCandidatesType.RatePlanCandidate.RatePlanCommission }
         *     
         */
        public void setRatePlanCommission(RatePlanCandidatesType.RatePlanCandidate.RatePlanCommission value) {
            this.ratePlanCommission = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the prepaidQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrepaidQualifier() {
            return prepaidQualifier;
        }

        /**
         * Sets the value of the prepaidQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrepaidQualifier(String value) {
            this.prepaidQualifier = value;
        }

        /**
         * Gets the value of the ratePlanType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanType() {
            return ratePlanType;
        }

        /**
         * Sets the value of the ratePlanType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanType(String value) {
            this.ratePlanType = value;
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
         * Gets the value of the ratePlanID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanID() {
            return ratePlanID;
        }

        /**
         * Sets the value of the ratePlanID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanID(String value) {
            this.ratePlanID = value;
        }

        /**
         * Gets the value of the ratePlanQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRatePlanQualifier() {
            return ratePlanQualifier;
        }

        /**
         * Sets the value of the ratePlanQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRatePlanQualifier(Boolean value) {
            this.ratePlanQualifier = value;
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
         * Gets the value of the ratePlanCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanCategory() {
            return ratePlanCategory;
        }

        /**
         * Sets the value of the ratePlanCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanCategory(String value) {
            this.ratePlanCategory = value;
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
         *       &lt;attribute name="GuaranteePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="DepositPolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="HoldTimePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ArrivalPolicy {

            @XmlAttribute(name = "GuaranteePolicyIndicator")
            protected Boolean guaranteePolicyIndicator;
            @XmlAttribute(name = "DepositPolicyIndicator")
            protected Boolean depositPolicyIndicator;
            @XmlAttribute(name = "HoldTimePolicyIndicator")
            protected Boolean holdTimePolicyIndicator;

            /**
             * Gets the value of the guaranteePolicyIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isGuaranteePolicyIndicator() {
                return guaranteePolicyIndicator;
            }

            /**
             * Sets the value of the guaranteePolicyIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setGuaranteePolicyIndicator(Boolean value) {
                this.guaranteePolicyIndicator = value;
            }

            /**
             * Gets the value of the depositPolicyIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDepositPolicyIndicator() {
                return depositPolicyIndicator;
            }

            /**
             * Sets the value of the depositPolicyIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDepositPolicyIndicator(Boolean value) {
                this.depositPolicyIndicator = value;
            }

            /**
             * Gets the value of the holdTimePolicyIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHoldTimePolicyIndicator() {
                return holdTimePolicyIndicator;
            }

            /**
             * Sets the value of the holdTimePolicyIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setHoldTimePolicyIndicator(Boolean value) {
                this.holdTimePolicyIndicator = value;
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
         *         &lt;element name="HotelRef" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
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
            "hotelRef"
        })
        public static class HotelRefs {

            @XmlElement(name = "HotelRef", required = true)
            protected List<RatePlanCandidatesType.RatePlanCandidate.HotelRefs.HotelRef> hotelRef;

            /**
             * Gets the value of the hotelRef property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hotelRef property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHotelRef().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RatePlanCandidatesType.RatePlanCandidate.HotelRefs.HotelRef }
             * 
             * 
             */
            public List<RatePlanCandidatesType.RatePlanCandidate.HotelRefs.HotelRef> getHotelRef() {
                if (hotelRef == null) {
                    hotelRef = new ArrayList<RatePlanCandidatesType.RatePlanCandidate.HotelRefs.HotelRef>();
                }
                return this.hotelRef;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
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
                @XmlAttribute(name = "AreaID")
                protected String areaID;

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
                 * Gets the value of the areaID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAreaID() {
                    return areaID;
                }

                /**
                 * Sets the value of the areaID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAreaID(String value) {
                    this.areaID = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MealsIncludedGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MealsIncluded {

            @XmlAttribute(name = "Breakfast")
            protected Boolean breakfast;
            @XmlAttribute(name = "Lunch")
            protected Boolean lunch;
            @XmlAttribute(name = "Dinner")
            protected Boolean dinner;
            @XmlAttribute(name = "MealPlanIndicator")
            protected Boolean mealPlanIndicator;
            @XmlAttribute(name = "MealPlanCodes")
            protected List<String> mealPlanCodes;

            /**
             * Gets the value of the breakfast property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBreakfast() {
                return breakfast;
            }

            /**
             * Sets the value of the breakfast property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBreakfast(Boolean value) {
                this.breakfast = value;
            }

            /**
             * Gets the value of the lunch property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLunch() {
                return lunch;
            }

            /**
             * Sets the value of the lunch property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLunch(Boolean value) {
                this.lunch = value;
            }

            /**
             * Gets the value of the dinner property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDinner() {
                return dinner;
            }

            /**
             * Sets the value of the dinner property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDinner(Boolean value) {
                this.dinner = value;
            }

            /**
             * Gets the value of the mealPlanIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMealPlanIndicator() {
                return mealPlanIndicator;
            }

            /**
             * Sets the value of the mealPlanIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMealPlanIndicator(Boolean value) {
                this.mealPlanIndicator = value;
            }

            /**
             * Gets the value of the mealPlanCodes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mealPlanCodes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMealPlanCodes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMealPlanCodes() {
                if (mealPlanCodes == null) {
                    mealPlanCodes = new ArrayList<String>();
                }
                return this.mealPlanCodes;
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
         *       &lt;attribute name="MaxCommissionPercentage" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
         *       &lt;attribute name="MinCommissionPercentage" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
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
        public static class RatePlanCommission {

            @XmlAttribute(name = "MaxCommissionPercentage")
            protected BigDecimal maxCommissionPercentage;
            @XmlAttribute(name = "MinCommissionPercentage")
            protected BigDecimal minCommissionPercentage;
            @XmlAttribute(name = "CommissionableIndicator")
            protected Boolean commissionableIndicator;

            /**
             * Gets the value of the maxCommissionPercentage property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMaxCommissionPercentage() {
                return maxCommissionPercentage;
            }

            /**
             * Sets the value of the maxCommissionPercentage property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMaxCommissionPercentage(BigDecimal value) {
                this.maxCommissionPercentage = value;
            }

            /**
             * Gets the value of the minCommissionPercentage property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMinCommissionPercentage() {
                return minCommissionPercentage;
            }

            /**
             * Sets the value of the minCommissionPercentage property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMinCommissionPercentage(BigDecimal value) {
                this.minCommissionPercentage = value;
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

    }

}
