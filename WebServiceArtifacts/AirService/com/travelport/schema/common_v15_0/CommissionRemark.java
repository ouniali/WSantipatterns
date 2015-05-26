
package com.travelport.schema.common_v15_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ProviderReservationLevel">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrCommissionRemark"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerTypeLevel" maxOccurs="4">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrCommissionRemark"/>
 *                 &lt;attribute name="TravelerType" use="required" type="{http://www.travelport.com/schema/common_v15_0}typePTC" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v15_0}typeProviderCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "providerReservationLevel",
    "passengerTypeLevel"
})
@XmlRootElement(name = "CommissionRemark")
public class CommissionRemark {

    @XmlElement(name = "ProviderReservationLevel")
    protected CommissionRemark.ProviderReservationLevel providerReservationLevel;
    @XmlElement(name = "PassengerTypeLevel")
    protected List<CommissionRemark.PassengerTypeLevel> passengerTypeLevel;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;

    /**
     * Gets the value of the providerReservationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionRemark.ProviderReservationLevel }
     *     
     */
    public CommissionRemark.ProviderReservationLevel getProviderReservationLevel() {
        return providerReservationLevel;
    }

    /**
     * Sets the value of the providerReservationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionRemark.ProviderReservationLevel }
     *     
     */
    public void setProviderReservationLevel(CommissionRemark.ProviderReservationLevel value) {
        this.providerReservationLevel = value;
    }

    /**
     * Gets the value of the passengerTypeLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTypeLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerTypeLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionRemark.PassengerTypeLevel }
     * 
     * 
     */
    public List<CommissionRemark.PassengerTypeLevel> getPassengerTypeLevel() {
        if (passengerTypeLevel == null) {
            passengerTypeLevel = new ArrayList<CommissionRemark.PassengerTypeLevel>();
        }
        return this.passengerTypeLevel;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
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
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrCommissionRemark"/>
     *       &lt;attribute name="TravelerType" use="required" type="{http://www.travelport.com/schema/common_v15_0}typePTC" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PassengerTypeLevel {

        @XmlAttribute(name = "TravelerType", required = true)
        protected String travelerType;
        @XmlAttribute(name = "Amount")
        protected String amount;
        @XmlAttribute(name = "Percentage")
        protected String percentage;
        @XmlAttribute(name = "CommissionCap")
        protected String commissionCap;

        /**
         * Gets the value of the travelerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelerType() {
            return travelerType;
        }

        /**
         * Sets the value of the travelerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelerType(String value) {
            this.travelerType = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmount(String value) {
            this.amount = value;
        }

        /**
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPercentage() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPercentage(String value) {
            this.percentage = value;
        }

        /**
         * Gets the value of the commissionCap property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommissionCap() {
            return commissionCap;
        }

        /**
         * Sets the value of the commissionCap property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommissionCap(String value) {
            this.commissionCap = value;
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
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrCommissionRemark"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProviderReservationLevel {

        @XmlAttribute(name = "Amount")
        protected String amount;
        @XmlAttribute(name = "Percentage")
        protected String percentage;
        @XmlAttribute(name = "CommissionCap")
        protected String commissionCap;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmount(String value) {
            this.amount = value;
        }

        /**
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPercentage() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPercentage(String value) {
            this.percentage = value;
        }

        /**
         * Gets the value of the commissionCap property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommissionCap() {
            return commissionCap;
        }

        /**
         * Sets the value of the commissionCap property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommissionCap(String value) {
            this.commissionCap = value;
        }

    }

}
