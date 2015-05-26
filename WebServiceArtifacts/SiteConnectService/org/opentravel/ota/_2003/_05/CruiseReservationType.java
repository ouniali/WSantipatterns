
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CruiseReservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CruiseReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SailingInfo" type="{http://www.opentravel.org/OTA/2003/05}SailingCategoryInfoType"/>
 *         &lt;element name="SailingProfile" type="{http://www.opentravel.org/OTA/2003/05}CruiseProfileType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="ReservationInfo" type="{http://www.opentravel.org/OTA/2003/05}CruiseGuestInfoType"/>
 *         &lt;element name="PaymentsDue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentDue" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="PaymentNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                           &lt;attribute name="DueDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Information" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseReservationType", propOrder = {
    "sailingInfo",
    "sailingProfile",
    "reservationInfo",
    "paymentsDue",
    "information"
})
public class CruiseReservationType {

    @XmlElement(name = "SailingInfo", required = true)
    protected SailingCategoryInfoType sailingInfo;
    @XmlElement(name = "SailingProfile")
    protected List<CruiseProfileType> sailingProfile;
    @XmlElement(name = "ReservationInfo", required = true)
    protected CruiseGuestInfoType reservationInfo;
    @XmlElement(name = "PaymentsDue")
    protected CruiseReservationType.PaymentsDue paymentsDue;
    @XmlElement(name = "Information")
    protected List<ParagraphType> information;

    /**
     * Gets the value of the sailingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SailingCategoryInfoType }
     *     
     */
    public SailingCategoryInfoType getSailingInfo() {
        return sailingInfo;
    }

    /**
     * Sets the value of the sailingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SailingCategoryInfoType }
     *     
     */
    public void setSailingInfo(SailingCategoryInfoType value) {
        this.sailingInfo = value;
    }

    /**
     * Gets the value of the sailingProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sailingProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSailingProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseProfileType }
     * 
     * 
     */
    public List<CruiseProfileType> getSailingProfile() {
        if (sailingProfile == null) {
            sailingProfile = new ArrayList<CruiseProfileType>();
        }
        return this.sailingProfile;
    }

    /**
     * Gets the value of the reservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestInfoType }
     *     
     */
    public CruiseGuestInfoType getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Sets the value of the reservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestInfoType }
     *     
     */
    public void setReservationInfo(CruiseGuestInfoType value) {
        this.reservationInfo = value;
    }

    /**
     * Gets the value of the paymentsDue property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseReservationType.PaymentsDue }
     *     
     */
    public CruiseReservationType.PaymentsDue getPaymentsDue() {
        return paymentsDue;
    }

    /**
     * Sets the value of the paymentsDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseReservationType.PaymentsDue }
     *     
     */
    public void setPaymentsDue(CruiseReservationType.PaymentsDue value) {
        this.paymentsDue = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getInformation() {
        if (information == null) {
            information = new ArrayList<ParagraphType>();
        }
        return this.information;
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
     *         &lt;element name="PaymentDue" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="PaymentNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *                 &lt;attribute name="DueDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
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
        "paymentDue"
    })
    public static class PaymentsDue {

        @XmlElement(name = "PaymentDue", required = true)
        protected List<CruiseReservationType.PaymentsDue.PaymentDue> paymentDue;

        /**
         * Gets the value of the paymentDue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentDue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentDue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseReservationType.PaymentsDue.PaymentDue }
         * 
         * 
         */
        public List<CruiseReservationType.PaymentsDue.PaymentDue> getPaymentDue() {
            if (paymentDue == null) {
                paymentDue = new ArrayList<CruiseReservationType.PaymentsDue.PaymentDue>();
            }
            return this.paymentDue;
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
         *       &lt;attribute name="PaymentNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
         *       &lt;attribute name="DueDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PaymentDue {

            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "PaymentNumber")
            protected Integer paymentNumber;
            @XmlAttribute(name = "DueDate")
            protected String dueDate;

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
             * Gets the value of the paymentNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPaymentNumber() {
                return paymentNumber;
            }

            /**
             * Sets the value of the paymentNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPaymentNumber(Integer value) {
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

        }

    }

}
