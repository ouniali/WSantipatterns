
package travel.whl.api.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of required payments.
 * 
 * <p>Java class for RequiredPaymentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredPaymentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuaranteePayment" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcceptedPayments" type="{http://api.whl.travel/soap}AcceptedPaymentsType" minOccurs="0"/>
 *                   &lt;element name="AmountPercent" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://api.whl.travel/soap}AmountPercentType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="GuaranteeType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://api.whl.travel/soap}StringLength1to32">
 *                       &lt;enumeration value="GuaranteeRequired"/>
 *                       &lt;enumeration value="None"/>
 *                       &lt;enumeration value="CC/DC/Voucher"/>
 *                       &lt;enumeration value="Profile"/>
 *                       &lt;enumeration value="Deposit"/>
 *                       &lt;enumeration value="PrePay"/>
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
@XmlType(name = "RequiredPaymentsType", propOrder = {
    "guaranteePayment"
})
@XmlSeeAlso({
    travel.whl.api.soap.PoliciesType.Policy.GuaranteePaymentPolicy.class
})
public class RequiredPaymentsType {

    @XmlElement(name = "GuaranteePayment", required = true)
    protected List<RequiredPaymentsType.GuaranteePayment> guaranteePayment;

    /**
     * Gets the value of the guaranteePayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteePayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteePayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredPaymentsType.GuaranteePayment }
     * 
     * 
     */
    public List<RequiredPaymentsType.GuaranteePayment> getGuaranteePayment() {
        if (guaranteePayment == null) {
            guaranteePayment = new ArrayList<RequiredPaymentsType.GuaranteePayment>();
        }
        return this.guaranteePayment;
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
     *         &lt;element name="AcceptedPayments" type="{http://api.whl.travel/soap}AcceptedPaymentsType" minOccurs="0"/>
     *         &lt;element name="AmountPercent" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://api.whl.travel/soap}AmountPercentType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="GuaranteeType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://api.whl.travel/soap}StringLength1to32">
     *             &lt;enumeration value="GuaranteeRequired"/>
     *             &lt;enumeration value="None"/>
     *             &lt;enumeration value="CC/DC/Voucher"/>
     *             &lt;enumeration value="Profile"/>
     *             &lt;enumeration value="Deposit"/>
     *             &lt;enumeration value="PrePay"/>
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
        "acceptedPayments",
        "amountPercent"
    })
    public static class GuaranteePayment {

        @XmlElement(name = "AcceptedPayments")
        protected AcceptedPaymentsType acceptedPayments;
        @XmlElement(name = "AmountPercent")
        protected RequiredPaymentsType.GuaranteePayment.AmountPercent amountPercent;
        @XmlAttribute(name = "GuaranteeType")
        protected String guaranteeType;

        /**
         * Gets the value of the acceptedPayments property.
         * 
         * @return
         *     possible object is
         *     {@link AcceptedPaymentsType }
         *     
         */
        public AcceptedPaymentsType getAcceptedPayments() {
            return acceptedPayments;
        }

        /**
         * Sets the value of the acceptedPayments property.
         * 
         * @param value
         *     allowed object is
         *     {@link AcceptedPaymentsType }
         *     
         */
        public void setAcceptedPayments(AcceptedPaymentsType value) {
            this.acceptedPayments = value;
        }

        /**
         * Gets the value of the amountPercent property.
         * 
         * @return
         *     possible object is
         *     {@link RequiredPaymentsType.GuaranteePayment.AmountPercent }
         *     
         */
        public RequiredPaymentsType.GuaranteePayment.AmountPercent getAmountPercent() {
            return amountPercent;
        }

        /**
         * Sets the value of the amountPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequiredPaymentsType.GuaranteePayment.AmountPercent }
         *     
         */
        public void setAmountPercent(RequiredPaymentsType.GuaranteePayment.AmountPercent value) {
            this.amountPercent = value;
        }

        /**
         * Gets the value of the guaranteeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteeType() {
            return guaranteeType;
        }

        /**
         * Sets the value of the guaranteeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteeType(String value) {
            this.guaranteeType = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://api.whl.travel/soap}AmountPercentType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AmountPercent
            extends AmountPercentType
        {


        }

    }

}
