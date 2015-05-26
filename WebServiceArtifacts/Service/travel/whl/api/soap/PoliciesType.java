
package travel.whl.api.soap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Describes the policies of the hotel, such as the type of payments, or whether children or pets are accepted.
 * 
 * <p>Java class for PoliciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoliciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Policy" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CancelPolicy" type="{http://api.whl.travel/soap}CancelPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="GuaranteePaymentPolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://api.whl.travel/soap}RequiredPaymentsType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CheckoutCharges" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CheckoutCharge" maxOccurs="2">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://api.whl.travel/soap}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Type">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                           &lt;enumeration value="Early"/>
 *                                           &lt;enumeration value="Late"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PolicyInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" type="{http://api.whl.travel/soap}ParagraphType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CheckInTime" type="{http://api.whl.travel/soap}TimeOrDateTimeType" />
 *                           &lt;attribute name="CheckOutTime" type="{http://api.whl.travel/soap}TimeOrDateTimeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TaxPolicies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TaxPolicy" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://api.whl.travel/soap}TaxType">
 *                                     &lt;attribute name="ApplyType" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CommissionPolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://api.whl.travel/soap}FeeType">
 *                           &lt;attribute name="CommissionApplicability">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
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
 *                   &lt;element name="FeePolicies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FeePolicy" type="{http://api.whl.travel/soap}FeeType" maxOccurs="unbounded"/>
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
    travel.whl.api.soap.HotelDescriptiveContentType.Policies.class
})
public class PoliciesType {

    @XmlElement(name = "Policy", required = true)
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
     *         &lt;element name="CancelPolicy" type="{http://api.whl.travel/soap}CancelPenaltiesType" minOccurs="0"/>
     *         &lt;element name="GuaranteePaymentPolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://api.whl.travel/soap}RequiredPaymentsType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CheckoutCharges" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CheckoutCharge" maxOccurs="2">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://api.whl.travel/soap}ParagraphType" maxOccurs="5" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Type">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                                 &lt;enumeration value="Early"/>
     *                                 &lt;enumeration value="Late"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PolicyInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" type="{http://api.whl.travel/soap}ParagraphType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CheckInTime" type="{http://api.whl.travel/soap}TimeOrDateTimeType" />
     *                 &lt;attribute name="CheckOutTime" type="{http://api.whl.travel/soap}TimeOrDateTimeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TaxPolicies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TaxPolicy" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://api.whl.travel/soap}TaxType">
     *                           &lt;attribute name="ApplyType" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CommissionPolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://api.whl.travel/soap}FeeType">
     *                 &lt;attribute name="CommissionApplicability">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
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
     *         &lt;element name="FeePolicies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FeePolicy" type="{http://api.whl.travel/soap}FeeType" maxOccurs="unbounded"/>
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
        "cancelPolicy",
        "guaranteePaymentPolicy",
        "checkoutCharges",
        "policyInfo",
        "taxPolicies",
        "commissionPolicy",
        "feePolicies"
    })
    public static class Policy {

        @XmlElement(name = "CancelPolicy")
        protected CancelPenaltiesType cancelPolicy;
        @XmlElement(name = "GuaranteePaymentPolicy")
        protected PoliciesType.Policy.GuaranteePaymentPolicy guaranteePaymentPolicy;
        @XmlElement(name = "CheckoutCharges")
        protected PoliciesType.Policy.CheckoutCharges checkoutCharges;
        @XmlElement(name = "PolicyInfo")
        protected PoliciesType.Policy.PolicyInfo policyInfo;
        @XmlElement(name = "TaxPolicies")
        protected PoliciesType.Policy.TaxPolicies taxPolicies;
        @XmlElement(name = "CommissionPolicy")
        protected PoliciesType.Policy.CommissionPolicy commissionPolicy;
        @XmlElement(name = "FeePolicies")
        protected PoliciesType.Policy.FeePolicies feePolicies;

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
         * Gets the value of the checkoutCharges property.
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.CheckoutCharges }
         *     
         */
        public PoliciesType.Policy.CheckoutCharges getCheckoutCharges() {
            return checkoutCharges;
        }

        /**
         * Sets the value of the checkoutCharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.CheckoutCharges }
         *     
         */
        public void setCheckoutCharges(PoliciesType.Policy.CheckoutCharges value) {
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
         *     {@link PoliciesType.Policy.TaxPolicies }
         *     
         */
        public PoliciesType.Policy.TaxPolicies getTaxPolicies() {
            return taxPolicies;
        }

        /**
         * Sets the value of the taxPolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.TaxPolicies }
         *     
         */
        public void setTaxPolicies(PoliciesType.Policy.TaxPolicies value) {
            this.taxPolicies = value;
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
         *     {@link PoliciesType.Policy.FeePolicies }
         *     
         */
        public PoliciesType.Policy.FeePolicies getFeePolicies() {
            return feePolicies;
        }

        /**
         * Sets the value of the feePolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.FeePolicies }
         *     
         */
        public void setFeePolicies(PoliciesType.Policy.FeePolicies value) {
            this.feePolicies = value;
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
         *         &lt;element name="CheckoutCharge" maxOccurs="2">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://api.whl.travel/soap}ParagraphType" maxOccurs="5" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Type">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                       &lt;enumeration value="Early"/>
         *                       &lt;enumeration value="Late"/>
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
        @XmlType(name = "", propOrder = {
            "checkoutCharge"
        })
        public static class CheckoutCharges {

            @XmlElement(name = "CheckoutCharge", required = true)
            protected List<PoliciesType.Policy.CheckoutCharges.CheckoutCharge> checkoutCharge;

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
             * {@link PoliciesType.Policy.CheckoutCharges.CheckoutCharge }
             * 
             * 
             */
            public List<PoliciesType.Policy.CheckoutCharges.CheckoutCharge> getCheckoutCharge() {
                if (checkoutCharge == null) {
                    checkoutCharge = new ArrayList<PoliciesType.Policy.CheckoutCharges.CheckoutCharge>();
                }
                return this.checkoutCharge;
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
             *         &lt;element name="Description" type="{http://api.whl.travel/soap}ParagraphType" maxOccurs="5" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="Type">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *             &lt;enumeration value="Early"/>
             *             &lt;enumeration value="Late"/>
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
                "description"
            })
            public static class CheckoutCharge {

                @XmlElement(name = "Description")
                protected List<ParagraphType> description;
                @XmlAttribute(name = "Type")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String type;

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
         *     &lt;extension base="{http://api.whl.travel/soap}FeeType">
         *       &lt;attribute name="CommissionApplicability">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
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
        @XmlType(name = "")
        public static class CommissionPolicy
            extends FeeType
        {

            @XmlAttribute(name = "CommissionApplicability")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String commissionApplicability;

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
         *         &lt;element name="FeePolicy" type="{http://api.whl.travel/soap}FeeType" maxOccurs="unbounded"/>
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
            "feePolicy"
        })
        public static class FeePolicies {

            @XmlElement(name = "FeePolicy", required = true)
            protected List<FeeType> feePolicy;

            /**
             * Gets the value of the feePolicy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the feePolicy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFeePolicy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FeeType }
             * 
             * 
             */
            public List<FeeType> getFeePolicy() {
                if (feePolicy == null) {
                    feePolicy = new ArrayList<FeeType>();
                }
                return this.feePolicy;
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
         *     &lt;extension base="{http://api.whl.travel/soap}RequiredPaymentsType">
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
         *         &lt;element name="Description" type="{http://api.whl.travel/soap}ParagraphType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="CheckInTime" type="{http://api.whl.travel/soap}TimeOrDateTimeType" />
         *       &lt;attribute name="CheckOutTime" type="{http://api.whl.travel/soap}TimeOrDateTimeType" />
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
         *         &lt;element name="TaxPolicy" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://api.whl.travel/soap}TaxType">
         *                 &lt;attribute name="ApplyType" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
            "taxPolicy"
        })
        public static class TaxPolicies {

            @XmlElement(name = "TaxPolicy")
            protected List<PoliciesType.Policy.TaxPolicies.TaxPolicy> taxPolicy;

            /**
             * Gets the value of the taxPolicy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the taxPolicy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTaxPolicy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.TaxPolicies.TaxPolicy }
             * 
             * 
             */
            public List<PoliciesType.Policy.TaxPolicies.TaxPolicy> getTaxPolicy() {
                if (taxPolicy == null) {
                    taxPolicy = new ArrayList<PoliciesType.Policy.TaxPolicies.TaxPolicy>();
                }
                return this.taxPolicy;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://api.whl.travel/soap}TaxType">
             *       &lt;attribute name="ApplyType" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TaxPolicy
                extends TaxType
            {

                @XmlAttribute(name = "ApplyType")
                protected BigInteger applyType;

                /**
                 * Gets the value of the applyType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getApplyType() {
                    return applyType;
                }

                /**
                 * Sets the value of the applyType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setApplyType(BigInteger value) {
                    this.applyType = value;
                }

            }

        }

    }

}
