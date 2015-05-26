
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
 * <p>Java class for ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptableGuarantee" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GuaranteeType">
 *                 &lt;attribute name="GuaranteePolicyType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="NoGuaranteesAccepted"/>
 *                       &lt;enumeration value="GuaranteesAccepted"/>
 *                       &lt;enumeration value="GuaranteesRequired"/>
 *                       &lt;enumeration value="DepositRequired"/>
 *                       &lt;enumeration value="GuaranteesNotRequired"/>
 *                       &lt;enumeration value="DepositNotRequired"/>
 *                       &lt;enumeration value="PrepayRequired"/>
 *                       &lt;enumeration value="PrepayNotRequired"/>
 *                       &lt;enumeration value="NoDepositsAccepted"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="UnacceptablePaymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee", propOrder = {
    "acceptableGuarantee"
})
public class ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee {

    @XmlElement(name = "AcceptableGuarantee")
    protected List<ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee> acceptableGuarantee;

    /**
     * Gets the value of the acceptableGuarantee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptableGuarantee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptableGuarantee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee }
     * 
     * 
     */
    public List<ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee> getAcceptableGuarantee() {
        if (acceptableGuarantee == null) {
            acceptableGuarantee = new ArrayList<ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee>();
        }
        return this.acceptableGuarantee;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GuaranteeType">
     *       &lt;attribute name="GuaranteePolicyType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="NoGuaranteesAccepted"/>
     *             &lt;enumeration value="GuaranteesAccepted"/>
     *             &lt;enumeration value="GuaranteesRequired"/>
     *             &lt;enumeration value="DepositRequired"/>
     *             &lt;enumeration value="GuaranteesNotRequired"/>
     *             &lt;enumeration value="DepositNotRequired"/>
     *             &lt;enumeration value="PrepayRequired"/>
     *             &lt;enumeration value="PrepayNotRequired"/>
     *             &lt;enumeration value="NoDepositsAccepted"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="UnacceptablePaymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AcceptableGuarantee
        extends GuaranteeType
    {

        @XmlAttribute(name = "GuaranteePolicyType")
        protected String guaranteePolicyType;
        @XmlAttribute(name = "PaymentType")
        protected String paymentType;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;
        @XmlAttribute(name = "UnacceptablePaymentType")
        protected String unacceptablePaymentType;

        /**
         * Gets the value of the guaranteePolicyType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteePolicyType() {
            return guaranteePolicyType;
        }

        /**
         * Sets the value of the guaranteePolicyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteePolicyType(String value) {
            this.guaranteePolicyType = value;
        }

        /**
         * Gets the value of the paymentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentType() {
            return paymentType;
        }

        /**
         * Sets the value of the paymentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentType(String value) {
            this.paymentType = value;
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
         * Gets the value of the unacceptablePaymentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnacceptablePaymentType() {
            return unacceptablePaymentType;
        }

        /**
         * Sets the value of the unacceptablePaymentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnacceptablePaymentType(String value) {
            this.unacceptablePaymentType = value;
        }

    }

}
