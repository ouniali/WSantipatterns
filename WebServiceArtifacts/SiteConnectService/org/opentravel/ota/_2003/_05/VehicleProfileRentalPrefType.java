
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for VehicleProfileRentalPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleProfileRentalPrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPref" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RPH_PrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VendorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RPH_PrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CoveragePref" maxOccurs="30" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleCoveragePrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialReqPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleSpecialReqPrefType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VehTypePref" type="{http://www.opentravel.org/OTA/2003/05}VehiclePrefType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="SpecialEquipPref" maxOccurs="15" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentPrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SmokingIndicatorGroup"/>
 *       &lt;attribute name="GasPrePay" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleProfileRentalPrefType", propOrder = {
    "loyaltyPref",
    "vendorPref",
    "paymentFormPref",
    "coveragePref",
    "specialReqPref",
    "vehTypePref",
    "specialEquipPref"
})
public class VehicleProfileRentalPrefType {

    @XmlElement(name = "LoyaltyPref")
    protected List<VehicleProfileRentalPrefType.LoyaltyPref> loyaltyPref;
    @XmlElement(name = "VendorPref")
    protected List<CompanyNamePrefType> vendorPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<VehicleProfileRentalPrefType.PaymentFormPref> paymentFormPref;
    @XmlElement(name = "CoveragePref")
    protected List<VehicleProfileRentalPrefType.CoveragePref> coveragePref;
    @XmlElement(name = "SpecialReqPref")
    protected List<VehicleSpecialReqPrefType> specialReqPref;
    @XmlElement(name = "VehTypePref")
    protected List<VehiclePrefType> vehTypePref;
    @XmlElement(name = "SpecialEquipPref")
    protected List<VehicleProfileRentalPrefType.SpecialEquipPref> specialEquipPref;
    @XmlAttribute(name = "GasPrePay")
    protected Boolean gasPrePay;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;

    /**
     * Gets the value of the loyaltyPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleProfileRentalPrefType.LoyaltyPref }
     * 
     * 
     */
    public List<VehicleProfileRentalPrefType.LoyaltyPref> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<VehicleProfileRentalPrefType.LoyaltyPref>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the vendorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNamePrefType }
     * 
     * 
     */
    public List<CompanyNamePrefType> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<CompanyNamePrefType>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleProfileRentalPrefType.PaymentFormPref }
     * 
     * 
     */
    public List<VehicleProfileRentalPrefType.PaymentFormPref> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<VehicleProfileRentalPrefType.PaymentFormPref>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the coveragePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveragePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveragePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleProfileRentalPrefType.CoveragePref }
     * 
     * 
     */
    public List<VehicleProfileRentalPrefType.CoveragePref> getCoveragePref() {
        if (coveragePref == null) {
            coveragePref = new ArrayList<VehicleProfileRentalPrefType.CoveragePref>();
        }
        return this.coveragePref;
    }

    /**
     * Gets the value of the specialReqPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialReqPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialReqPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleSpecialReqPrefType }
     * 
     * 
     */
    public List<VehicleSpecialReqPrefType> getSpecialReqPref() {
        if (specialReqPref == null) {
            specialReqPref = new ArrayList<VehicleSpecialReqPrefType>();
        }
        return this.specialReqPref;
    }

    /**
     * Gets the value of the vehTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehiclePrefType }
     * 
     * 
     */
    public List<VehiclePrefType> getVehTypePref() {
        if (vehTypePref == null) {
            vehTypePref = new ArrayList<VehiclePrefType>();
        }
        return this.vehTypePref;
    }

    /**
     * Gets the value of the specialEquipPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleProfileRentalPrefType.SpecialEquipPref }
     * 
     * 
     */
    public List<VehicleProfileRentalPrefType.SpecialEquipPref> getSpecialEquipPref() {
        if (specialEquipPref == null) {
            specialEquipPref = new ArrayList<VehicleProfileRentalPrefType.SpecialEquipPref>();
        }
        return this.specialEquipPref;
    }

    /**
     * Gets the value of the gasPrePay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGasPrePay() {
        return gasPrePay;
    }

    /**
     * Sets the value of the gasPrePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGasPrePay(Boolean value) {
        this.gasPrePay = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleCoveragePrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CoveragePref {

        @XmlAttribute(name = "CoverageType", required = true)
        protected String coverageType;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;

        /**
         * Gets the value of the coverageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoverageType() {
            return coverageType;
        }

        /**
         * Sets the value of the coverageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoverageType(String value) {
            this.coverageType = value;
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
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RPH_PrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LoyaltyPref {

        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RPH_PrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PaymentFormPref {

        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentPrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpecialEquipPref {

        @XmlAttribute(name = "EquipType", required = true)
        protected String equipType;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "Action")
        protected ActionType action;

        /**
         * Gets the value of the equipType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipType() {
            return equipType;
        }

        /**
         * Sets the value of the equipType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipType(String value) {
            this.equipType = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link ActionType }
         *     
         */
        public ActionType getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *     
         */
        public void setAction(ActionType value) {
            this.action = value;
        }

    }

}
