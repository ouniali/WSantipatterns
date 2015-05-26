
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PoliciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoliciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Policy" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CancelPolicy" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="GuaranteePaymentPolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType">
 *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PolicyInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyPolicyInfoCode" minOccurs="0"/>
 *                   &lt;element name="CheckoutCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyCheckoutCharge" minOccurs="0"/>
 *                   &lt;element name="PolicyInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="MinGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="MinRecommendedGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="UsualStayFreeCutoffAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="UsualStayFreeChildPerAdult" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="DefaultTaxServiceInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="KidsStayFree" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="MaxChildAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="InternetGuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TaxPolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyTaxPolicy" minOccurs="0"/>
 *                   &lt;element name="PetsPolicies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="PetsPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="MaxPetQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="RefundableDeposit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="NonRefundableFee" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="PetsAllowedCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Pets Allowed"/>
 *                                 &lt;enumeration value="Pets Not Allowed"/>
 *                                 &lt;enumeration value="Assistive Animals Only"/>
 *                                 &lt;enumeration value="Pets By Arrangements"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="StayRequirements" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyStayRequirement" minOccurs="0"/>
 *                   &lt;element name="CommissionPolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
 *                           &lt;sequence>
 *                             &lt;element name="PaymentCompany" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CommissionApplicability">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="AllRates"/>
 *                                 &lt;enumeration value="NoRates"/>
 *                                 &lt;enumeration value="SomeRates"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FeePolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="DefaultValidBookingMinOffset" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "PoliciesType", propOrder = {
    "policy"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.HotelDescriptiveContentType.Policies.class
})
public class PoliciesType {

    @XmlElement(name = "Policy")
    protected List<PoliciesType.Policy> policy;

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoliciesType.Policy }
     * 
     * 
     */
    public List<PoliciesType.Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<PoliciesType.Policy>();
        }
        return this.policy;
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
     *         &lt;element name="CancelPolicy" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
     *         &lt;element name="GuaranteePaymentPolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType">
     *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PolicyInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyPolicyInfoCode" minOccurs="0"/>
     *         &lt;element name="CheckoutCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyCheckoutCharge" minOccurs="0"/>
     *         &lt;element name="PolicyInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="MinGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="MinRecommendedGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="UsualStayFreeCutoffAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="UsualStayFreeChildPerAdult" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="DefaultTaxServiceInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="KidsStayFree" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="MaxChildAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="InternetGuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TaxPolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyTaxPolicy" minOccurs="0"/>
     *         &lt;element name="PetsPolicies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="PetsPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="MaxPetQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="RefundableDeposit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="NonRefundableFee" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="PetsAllowedCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Pets Allowed"/>
     *                       &lt;enumeration value="Pets Not Allowed"/>
     *                       &lt;enumeration value="Assistive Animals Only"/>
     *                       &lt;enumeration value="Pets By Arrangements"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="StayRequirements" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyStayRequirement" minOccurs="0"/>
     *         &lt;element name="CommissionPolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
     *                 &lt;sequence>
     *                   &lt;element name="PaymentCompany" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CommissionApplicability">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="AllRates"/>
     *                       &lt;enumeration value="NoRates"/>
     *                       &lt;enumeration value="SomeRates"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FeePolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="DefaultValidBookingMinOffset" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cancelPolicy",
        "guaranteePaymentPolicy",
        "policyInfoCodes",
        "checkoutCharges",
        "policyInfo",
        "taxPolicies",
        "petsPolicies",
        "stayRequirements",
        "commissionPolicy",
        "feePolicies"
    })
    public static class Policy {

        @XmlElement(name = "CancelPolicy")
        protected CancelPenaltiesType cancelPolicy;
        @XmlElement(name = "GuaranteePaymentPolicy")
        protected PoliciesType.Policy.GuaranteePaymentPolicy guaranteePaymentPolicy;
        @XmlElement(name = "PolicyInfoCodes")
        protected ArrayOfPoliciesTypePolicyPolicyInfoCode policyInfoCodes;
        @XmlElement(name = "CheckoutCharges")
        protected ArrayOfPoliciesTypePolicyCheckoutCharge checkoutCharges;
        @XmlElement(name = "PolicyInfo")
        protected PoliciesType.Policy.PolicyInfo policyInfo;
        @XmlElement(name = "TaxPolicies")
        protected ArrayOfPoliciesTypePolicyTaxPolicy taxPolicies;
        @XmlElement(name = "PetsPolicies")
        protected PoliciesType.Policy.PetsPolicies petsPolicies;
        @XmlElement(name = "StayRequirements")
        protected ArrayOfPoliciesTypePolicyStayRequirement stayRequirements;
        @XmlElement(name = "CommissionPolicy")
        protected PoliciesType.Policy.CommissionPolicy commissionPolicy;
        @XmlElement(name = "FeePolicies")
        protected ArrayOfFeeType feePolicies;
        @XmlAttribute(name = "DefaultValidBookingMinOffset")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger defaultValidBookingMinOffset;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;
        @XmlAttribute(name = "Mon")
        protected Boolean mon;
        @XmlAttribute(name = "Tue")
        protected Boolean tue;
        @XmlAttribute(name = "Weds")
        protected Boolean weds;
        @XmlAttribute(name = "Thur")
        protected Boolean thur;
        @XmlAttribute(name = "Fri")
        protected Boolean fri;
        @XmlAttribute(name = "Sat")
        protected Boolean sat;
        @XmlAttribute(name = "Sun")
        protected Boolean sun;

        /**
         * Gets the value of the cancelPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public CancelPenaltiesType getCancelPolicy() {
            return cancelPolicy;
        }

        /**
         * Sets the value of the cancelPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public void setCancelPolicy(CancelPenaltiesType value) {
            this.cancelPolicy = value;
        }

        /**
         * Gets the value of the guaranteePaymentPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.GuaranteePaymentPolicy }
         *     
         */
        public PoliciesType.Policy.GuaranteePaymentPolicy getGuaranteePaymentPolicy() {
            return guaranteePaymentPolicy;
        }

        /**
         * Sets the value of the guaranteePaymentPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.GuaranteePaymentPolicy }
         *     
         */
        public void setGuaranteePaymentPolicy(PoliciesType.Policy.GuaranteePaymentPolicy value) {
            this.guaranteePaymentPolicy = value;
        }

        /**
         * Gets the value of the policyInfoCodes property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPoliciesTypePolicyPolicyInfoCode }
         *     
         */
        public ArrayOfPoliciesTypePolicyPolicyInfoCode getPolicyInfoCodes() {
            return policyInfoCodes;
        }

        /**
         * Sets the value of the policyInfoCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPoliciesTypePolicyPolicyInfoCode }
         *     
         */
        public void setPolicyInfoCodes(ArrayOfPoliciesTypePolicyPolicyInfoCode value) {
            this.policyInfoCodes = value;
        }

        /**
         * Gets the value of the checkoutCharges property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPoliciesTypePolicyCheckoutCharge }
         *     
         */
        public ArrayOfPoliciesTypePolicyCheckoutCharge getCheckoutCharges() {
            return checkoutCharges;
        }

        /**
         * Sets the value of the checkoutCharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPoliciesTypePolicyCheckoutCharge }
         *     
         */
        public void setCheckoutCharges(ArrayOfPoliciesTypePolicyCheckoutCharge value) {
            this.checkoutCharges = value;
        }

        /**
         * Gets the value of the policyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.PolicyInfo }
         *     
         */
        public PoliciesType.Policy.PolicyInfo getPolicyInfo() {
            return policyInfo;
        }

        /**
         * Sets the value of the policyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.PolicyInfo }
         *     
         */
        public void setPolicyInfo(PoliciesType.Policy.PolicyInfo value) {
            this.policyInfo = value;
        }

        /**
         * Gets the value of the taxPolicies property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPoliciesTypePolicyTaxPolicy }
         *     
         */
        public ArrayOfPoliciesTypePolicyTaxPolicy getTaxPolicies() {
            return taxPolicies;
        }

        /**
         * Sets the value of the taxPolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPoliciesTypePolicyTaxPolicy }
         *     
         */
        public void setTaxPolicies(ArrayOfPoliciesTypePolicyTaxPolicy value) {
            this.taxPolicies = value;
        }

        /**
         * Gets the value of the petsPolicies property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.PetsPolicies }
         *     
         */
        public PoliciesType.Policy.PetsPolicies getPetsPolicies() {
            return petsPolicies;
        }

        /**
         * Sets the value of the petsPolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.PetsPolicies }
         *     
         */
        public void setPetsPolicies(PoliciesType.Policy.PetsPolicies value) {
            this.petsPolicies = value;
        }

        /**
         * Gets the value of the stayRequirements property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPoliciesTypePolicyStayRequirement }
         *     
         */
        public ArrayOfPoliciesTypePolicyStayRequirement getStayRequirements() {
            return stayRequirements;
        }

        /**
         * Sets the value of the stayRequirements property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPoliciesTypePolicyStayRequirement }
         *     
         */
        public void setStayRequirements(ArrayOfPoliciesTypePolicyStayRequirement value) {
            this.stayRequirements = value;
        }

        /**
         * Gets the value of the commissionPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.CommissionPolicy }
         *     
         */
        public PoliciesType.Policy.CommissionPolicy getCommissionPolicy() {
            return commissionPolicy;
        }

        /**
         * Sets the value of the commissionPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.CommissionPolicy }
         *     
         */
        public void setCommissionPolicy(PoliciesType.Policy.CommissionPolicy value) {
            this.commissionPolicy = value;
        }

        /**
         * Gets the value of the feePolicies property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfFeeType }
         *     
         */
        public ArrayOfFeeType getFeePolicies() {
            return feePolicies;
        }

        /**
         * Sets the value of the feePolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfFeeType }
         *     
         */
        public void setFeePolicies(ArrayOfFeeType value) {
            this.feePolicies = value;
        }

        /**
         * Gets the value of the defaultValidBookingMinOffset property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDefaultValidBookingMinOffset() {
            return defaultValidBookingMinOffset;
        }

        /**
         * Sets the value of the defaultValidBookingMinOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDefaultValidBookingMinOffset(BigInteger value) {
            this.defaultValidBookingMinOffset = value;
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
         * Gets the value of the lastUpdated property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * Sets the value of the lastUpdated property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
        }

        /**
         * Gets the value of the mon property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMon() {
            return mon;
        }

        /**
         * Sets the value of the mon property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMon(Boolean value) {
            this.mon = value;
        }

        /**
         * Gets the value of the tue property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTue() {
            return tue;
        }

        /**
         * Sets the value of the tue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTue(Boolean value) {
            this.tue = value;
        }

        /**
         * Gets the value of the weds property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWeds() {
            return weds;
        }

        /**
         * Sets the value of the weds property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWeds(Boolean value) {
            this.weds = value;
        }

        /**
         * Gets the value of the thur property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isThur() {
            return thur;
        }

        /**
         * Sets the value of the thur property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setThur(Boolean value) {
            this.thur = value;
        }

        /**
         * Gets the value of the fri property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFri() {
            return fri;
        }

        /**
         * Sets the value of the fri property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFri(Boolean value) {
            this.fri = value;
        }

        /**
         * Gets the value of the sat property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSat() {
            return sat;
        }

        /**
         * Sets the value of the sat property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSat(Boolean value) {
            this.sat = value;
        }

        /**
         * Gets the value of the sun property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSun() {
            return sun;
        }

        /**
         * Sets the value of the sun property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSun(Boolean value) {
            this.sun = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
         *       &lt;sequence>
         *         &lt;element name="PaymentCompany" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="CommissionApplicability">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="AllRates"/>
         *             &lt;enumeration value="NoRates"/>
         *             &lt;enumeration value="SomeRates"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "paymentCompany"
        })
        public static class CommissionPolicy
            extends FeeType
        {

            @XmlElement(name = "PaymentCompany")
            protected List<PoliciesType.Policy.CommissionPolicy.PaymentCompany> paymentCompany;
            @XmlAttribute(name = "CommissionApplicability")
            protected String commissionApplicability;

            /**
             * Gets the value of the paymentCompany property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the paymentCompany property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPaymentCompany().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.CommissionPolicy.PaymentCompany }
             * 
             * 
             */
            public List<PoliciesType.Policy.CommissionPolicy.PaymentCompany> getPaymentCompany() {
                if (paymentCompany == null) {
                    paymentCompany = new ArrayList<PoliciesType.Policy.CommissionPolicy.PaymentCompany>();
                }
                return this.paymentCompany;
            }

            /**
             * Gets the value of the commissionApplicability property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommissionApplicability() {
                return commissionApplicability;
            }

            /**
             * Sets the value of the commissionApplicability property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommissionApplicability(String value) {
                this.commissionApplicability = value;
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
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PaymentCompany {

                @XmlAttribute(name = "Name")
                protected String name;

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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType">
         *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GuaranteePaymentPolicy
            extends RequiredPaymentsType
        {

            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * Gets the value of the removal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
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
         *         &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="PetsPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="MaxPetQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="RefundableDeposit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="NonRefundableFee" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="PetsAllowedCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Pets Allowed"/>
         *             &lt;enumeration value="Pets Not Allowed"/>
         *             &lt;enumeration value="Assistive Animals Only"/>
         *             &lt;enumeration value="Pets By Arrangements"/>
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
            "petsPolicy"
        })
        public static class PetsPolicies {

            @XmlElement(name = "PetsPolicy")
            protected List<PoliciesType.Policy.PetsPolicies.PetsPolicy> petsPolicy;
            @XmlAttribute(name = "PetsAllowedCode")
            protected String petsAllowedCode;

            /**
             * Gets the value of the petsPolicy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the petsPolicy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPetsPolicy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.PetsPolicies.PetsPolicy }
             * 
             * 
             */
            public List<PoliciesType.Policy.PetsPolicies.PetsPolicy> getPetsPolicy() {
                if (petsPolicy == null) {
                    petsPolicy = new ArrayList<PoliciesType.Policy.PetsPolicies.PetsPolicy>();
                }
                return this.petsPolicy;
            }

            /**
             * Gets the value of the petsAllowedCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPetsAllowedCode() {
                return petsAllowedCode;
            }

            /**
             * Sets the value of the petsAllowedCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPetsAllowedCode(String value) {
                this.petsAllowedCode = value;
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
             *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="PetsPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="MaxPetQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="RefundableDeposit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="NonRefundableFee" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "description"
            })
            public static class PetsPolicy {

                @XmlElement(name = "Description")
                protected List<ParagraphType> description;
                @XmlAttribute(name = "PetsPolicyCode")
                protected String petsPolicyCode;
                @XmlAttribute(name = "UnitOfMeasureQuantity")
                protected BigDecimal unitOfMeasureQuantity;
                @XmlAttribute(name = "UnitOfMeasure")
                protected String unitOfMeasure;
                @XmlAttribute(name = "UnitOfMeasureCode")
                protected String unitOfMeasureCode;
                @XmlAttribute(name = "MaxPetQuantity")
                protected BigInteger maxPetQuantity;
                @XmlAttribute(name = "RefundableDeposit")
                protected BigDecimal refundableDeposit;
                @XmlAttribute(name = "NonRefundableFee")
                protected BigDecimal nonRefundableFee;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;
                @XmlAttribute(name = "ChargeCode")
                protected String chargeCode;
                @XmlAttribute(name = "RestrictionInd")
                protected Boolean restrictionInd;
                @XmlAttribute(name = "MinUnitOfMeasureQuantity")
                protected BigDecimal minUnitOfMeasureQuantity;

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
                 * Gets the value of the petsPolicyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPetsPolicyCode() {
                    return petsPolicyCode;
                }

                /**
                 * Sets the value of the petsPolicyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPetsPolicyCode(String value) {
                    this.petsPolicyCode = value;
                }

                /**
                 * Gets the value of the unitOfMeasureQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getUnitOfMeasureQuantity() {
                    return unitOfMeasureQuantity;
                }

                /**
                 * Sets the value of the unitOfMeasureQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setUnitOfMeasureQuantity(BigDecimal value) {
                    this.unitOfMeasureQuantity = value;
                }

                /**
                 * Gets the value of the unitOfMeasure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitOfMeasure() {
                    return unitOfMeasure;
                }

                /**
                 * Sets the value of the unitOfMeasure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitOfMeasure(String value) {
                    this.unitOfMeasure = value;
                }

                /**
                 * Gets the value of the unitOfMeasureCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitOfMeasureCode() {
                    return unitOfMeasureCode;
                }

                /**
                 * Sets the value of the unitOfMeasureCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitOfMeasureCode(String value) {
                    this.unitOfMeasureCode = value;
                }

                /**
                 * Gets the value of the maxPetQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMaxPetQuantity() {
                    return maxPetQuantity;
                }

                /**
                 * Sets the value of the maxPetQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMaxPetQuantity(BigInteger value) {
                    this.maxPetQuantity = value;
                }

                /**
                 * Gets the value of the refundableDeposit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getRefundableDeposit() {
                    return refundableDeposit;
                }

                /**
                 * Sets the value of the refundableDeposit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setRefundableDeposit(BigDecimal value) {
                    this.refundableDeposit = value;
                }

                /**
                 * Gets the value of the nonRefundableFee property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNonRefundableFee() {
                    return nonRefundableFee;
                }

                /**
                 * Sets the value of the nonRefundableFee property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNonRefundableFee(BigDecimal value) {
                    this.nonRefundableFee = value;
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

                /**
                 * Gets the value of the chargeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChargeCode() {
                    return chargeCode;
                }

                /**
                 * Sets the value of the chargeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChargeCode(String value) {
                    this.chargeCode = value;
                }

                /**
                 * Gets the value of the restrictionInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRestrictionInd() {
                    return restrictionInd;
                }

                /**
                 * Sets the value of the restrictionInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRestrictionInd(Boolean value) {
                    this.restrictionInd = value;
                }

                /**
                 * Gets the value of the minUnitOfMeasureQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMinUnitOfMeasureQuantity() {
                    return minUnitOfMeasureQuantity;
                }

                /**
                 * Sets the value of the minUnitOfMeasureQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMinUnitOfMeasureQuantity(BigDecimal value) {
                    this.minUnitOfMeasureQuantity = value;
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
         *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="MinGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="MinRecommendedGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="UsualStayFreeCutoffAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="UsualStayFreeChildPerAdult" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="DefaultTaxServiceInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="KidsStayFree" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="MaxChildAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="InternetGuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description"
        })
        public static class PolicyInfo {

            @XmlElement(name = "Description")
            protected ParagraphType description;
            @XmlAttribute(name = "CheckInTime")
            protected String checkInTime;
            @XmlAttribute(name = "CheckOutTime")
            protected String checkOutTime;
            @XmlAttribute(name = "MinGuestAge")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger minGuestAge;
            @XmlAttribute(name = "MinRecommendedGuestAge")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger minRecommendedGuestAge;
            @XmlAttribute(name = "UsualStayFreeCutoffAge")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger usualStayFreeCutoffAge;
            @XmlAttribute(name = "UsualStayFreeChildPerAdult")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger usualStayFreeChildPerAdult;
            @XmlAttribute(name = "TotalGuestCount")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger totalGuestCount;
            @XmlAttribute(name = "DefaultTaxServiceInclusive")
            protected Boolean defaultTaxServiceInclusive;
            @XmlAttribute(name = "KidsStayFree")
            protected Boolean kidsStayFree;
            @XmlAttribute(name = "MaxChildAge")
            protected BigInteger maxChildAge;
            @XmlAttribute(name = "InternetGuaranteeRequiredInd")
            protected Boolean internetGuaranteeRequiredInd;

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link ParagraphType }
             *     
             */
            public ParagraphType getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link ParagraphType }
             *     
             */
            public void setDescription(ParagraphType value) {
                this.description = value;
            }

            /**
             * Gets the value of the checkInTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckInTime() {
                return checkInTime;
            }

            /**
             * Sets the value of the checkInTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckInTime(String value) {
                this.checkInTime = value;
            }

            /**
             * Gets the value of the checkOutTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckOutTime() {
                return checkOutTime;
            }

            /**
             * Sets the value of the checkOutTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckOutTime(String value) {
                this.checkOutTime = value;
            }

            /**
             * Gets the value of the minGuestAge property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinGuestAge() {
                return minGuestAge;
            }

            /**
             * Sets the value of the minGuestAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinGuestAge(BigInteger value) {
                this.minGuestAge = value;
            }

            /**
             * Gets the value of the minRecommendedGuestAge property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinRecommendedGuestAge() {
                return minRecommendedGuestAge;
            }

            /**
             * Sets the value of the minRecommendedGuestAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinRecommendedGuestAge(BigInteger value) {
                this.minRecommendedGuestAge = value;
            }

            /**
             * Gets the value of the usualStayFreeCutoffAge property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUsualStayFreeCutoffAge() {
                return usualStayFreeCutoffAge;
            }

            /**
             * Sets the value of the usualStayFreeCutoffAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUsualStayFreeCutoffAge(BigInteger value) {
                this.usualStayFreeCutoffAge = value;
            }

            /**
             * Gets the value of the usualStayFreeChildPerAdult property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUsualStayFreeChildPerAdult() {
                return usualStayFreeChildPerAdult;
            }

            /**
             * Sets the value of the usualStayFreeChildPerAdult property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUsualStayFreeChildPerAdult(BigInteger value) {
                this.usualStayFreeChildPerAdult = value;
            }

            /**
             * Gets the value of the totalGuestCount property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalGuestCount() {
                return totalGuestCount;
            }

            /**
             * Sets the value of the totalGuestCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalGuestCount(BigInteger value) {
                this.totalGuestCount = value;
            }

            /**
             * Gets the value of the defaultTaxServiceInclusive property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDefaultTaxServiceInclusive() {
                return defaultTaxServiceInclusive;
            }

            /**
             * Sets the value of the defaultTaxServiceInclusive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDefaultTaxServiceInclusive(Boolean value) {
                this.defaultTaxServiceInclusive = value;
            }

            /**
             * Gets the value of the kidsStayFree property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isKidsStayFree() {
                return kidsStayFree;
            }

            /**
             * Sets the value of the kidsStayFree property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setKidsStayFree(Boolean value) {
                this.kidsStayFree = value;
            }

            /**
             * Gets the value of the maxChildAge property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxChildAge() {
                return maxChildAge;
            }

            /**
             * Sets the value of the maxChildAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxChildAge(BigInteger value) {
                this.maxChildAge = value;
            }

            /**
             * Gets the value of the internetGuaranteeRequiredInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInternetGuaranteeRequiredInd() {
                return internetGuaranteeRequiredInd;
            }

            /**
             * Sets the value of the internetGuaranteeRequiredInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInternetGuaranteeRequiredInd(Boolean value) {
                this.internetGuaranteeRequiredInd = value;
            }

        }

    }

}
