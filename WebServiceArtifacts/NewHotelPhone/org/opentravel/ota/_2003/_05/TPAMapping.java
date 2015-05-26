
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPAMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPAMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="ServiceMapping" type="{http://www.opentravel.org/OTA/2003/05}ServiceMapping" minOccurs="0"/>
 *           &lt;element name="RoomRateMappings" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="RoomRateRPH" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                   &lt;attribute name="OperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="OperatorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="AllotmentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="AllotmentName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="PriceRateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="PriceRateName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="PackageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="PackageName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="RatePlanCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}PMSRatePlans" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="EntityMapping" type="{http://www.opentravel.org/OTA/2003/05}EntityMapping" minOccurs="0"/>
 *           &lt;element name="CurrencyMapping" type="{http://www.opentravel.org/OTA/2003/05}CurrencyMapping" minOccurs="0"/>
 *           &lt;element name="CreditCardMapping" type="{http://www.opentravel.org/OTA/2003/05}CreditCardMapping" minOccurs="0"/>
 *           &lt;element name="CustomerMapping" type="{http://www.opentravel.org/OTA/2003/05}CustomerMapping" minOccurs="0"/>
 *           &lt;element name="GuaranteeMapping" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeMapping" minOccurs="0"/>
 *           &lt;element name="MarketSegmentMapping" type="{http://www.opentravel.org/OTA/2003/05}MarketSegmentMapping" minOccurs="0"/>
 *           &lt;element name="SourceOfBusinessMapping" type="{http://www.opentravel.org/OTA/2003/05}SourceOfBusinessMapping" minOccurs="0"/>
 *           &lt;element name="SpecialRequestMapping" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GeneralMapping">
 *                   &lt;attribute name="SpecialRequestRPH" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="PMSStatusApplication" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="EntityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="OperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="AllotmentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="MealPlanCode" type="{http://www.opentravel.org/OTA/2003/05}PMSRatePlans" />
 *                   &lt;attribute name="PackageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="RatePlanCandidateMapping" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="RatePlanCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                   &lt;attribute name="OperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="PackageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="AllotmentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="MealPlanCode" type="{http://www.opentravel.org/OTA/2003/05}PMSRatePlans" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="DepositPaymentMapping" type="{http://www.opentravel.org/OTA/2003/05}DepositPaymentMapping" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPAMapping", propOrder = {
    "serviceMappingOrRoomRateMappingsOrEntityMapping"
})
public class TPAMapping {

    @XmlElements({
        @XmlElement(name = "ServiceMapping", type = ServiceMapping.class),
        @XmlElement(name = "RoomRateMappings", type = TPAMapping.RoomRateMappings.class),
        @XmlElement(name = "EntityMapping", type = EntityMapping.class),
        @XmlElement(name = "CurrencyMapping", type = CurrencyMapping.class),
        @XmlElement(name = "CreditCardMapping", type = CreditCardMapping.class),
        @XmlElement(name = "CustomerMapping", type = CustomerMapping.class),
        @XmlElement(name = "GuaranteeMapping", type = GuaranteeMapping.class),
        @XmlElement(name = "MarketSegmentMapping", type = MarketSegmentMapping.class),
        @XmlElement(name = "SourceOfBusinessMapping", type = SourceOfBusinessMapping.class),
        @XmlElement(name = "SpecialRequestMapping", type = TPAMapping.SpecialRequestMapping.class),
        @XmlElement(name = "PMSStatusApplication", type = TPAMapping.PMSStatusApplication.class),
        @XmlElement(name = "RatePlanCandidateMapping", type = TPAMapping.RatePlanCandidateMapping.class),
        @XmlElement(name = "DepositPaymentMapping", type = DepositPaymentMapping.class)
    })
    protected List<Object> serviceMappingOrRoomRateMappingsOrEntityMapping;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * Gets the value of the serviceMappingOrRoomRateMappingsOrEntityMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceMappingOrRoomRateMappingsOrEntityMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceMappingOrRoomRateMappingsOrEntityMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceMapping }
     * {@link TPAMapping.RoomRateMappings }
     * {@link EntityMapping }
     * {@link CurrencyMapping }
     * {@link CreditCardMapping }
     * {@link CustomerMapping }
     * {@link GuaranteeMapping }
     * {@link MarketSegmentMapping }
     * {@link SourceOfBusinessMapping }
     * {@link TPAMapping.SpecialRequestMapping }
     * {@link TPAMapping.PMSStatusApplication }
     * {@link TPAMapping.RatePlanCandidateMapping }
     * {@link DepositPaymentMapping }
     * 
     * 
     */
    public List<Object> getServiceMappingOrRoomRateMappingsOrEntityMapping() {
        if (serviceMappingOrRoomRateMappingsOrEntityMapping == null) {
            serviceMappingOrRoomRateMappingsOrEntityMapping = new ArrayList<Object>();
        }
        return this.serviceMappingOrRoomRateMappingsOrEntityMapping;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     *       &lt;attribute name="EntityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AllotmentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MealPlanCode" type="{http://www.opentravel.org/OTA/2003/05}PMSRatePlans" />
     *       &lt;attribute name="PackageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PMSStatusApplication {

        @XmlAttribute(name = "EntityCode")
        protected String entityCode;
        @XmlAttribute(name = "OperatorCode")
        protected String operatorCode;
        @XmlAttribute(name = "AllotmentCode")
        protected String allotmentCode;
        @XmlAttribute(name = "MealPlanCode")
        protected PMSRatePlans mealPlanCode;
        @XmlAttribute(name = "PackageCode")
        protected String packageCode;

        /**
         * Gets the value of the entityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityCode() {
            return entityCode;
        }

        /**
         * Sets the value of the entityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityCode(String value) {
            this.entityCode = value;
        }

        /**
         * Gets the value of the operatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperatorCode() {
            return operatorCode;
        }

        /**
         * Sets the value of the operatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperatorCode(String value) {
            this.operatorCode = value;
        }

        /**
         * Gets the value of the allotmentCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllotmentCode() {
            return allotmentCode;
        }

        /**
         * Sets the value of the allotmentCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllotmentCode(String value) {
            this.allotmentCode = value;
        }

        /**
         * Gets the value of the mealPlanCode property.
         * 
         * @return
         *     possible object is
         *     {@link PMSRatePlans }
         *     
         */
        public PMSRatePlans getMealPlanCode() {
            return mealPlanCode;
        }

        /**
         * Sets the value of the mealPlanCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link PMSRatePlans }
         *     
         */
        public void setMealPlanCode(PMSRatePlans value) {
            this.mealPlanCode = value;
        }

        /**
         * Gets the value of the packageCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackageCode() {
            return packageCode;
        }

        /**
         * Sets the value of the packageCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackageCode(String value) {
            this.packageCode = value;
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
     *       &lt;attribute name="RatePlanCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="OperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PackageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AllotmentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MealPlanCode" type="{http://www.opentravel.org/OTA/2003/05}PMSRatePlans" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RatePlanCandidateMapping {

        @XmlAttribute(name = "RatePlanCandidateRPH")
        protected BigInteger ratePlanCandidateRPH;
        @XmlAttribute(name = "OperatorCode")
        protected String operatorCode;
        @XmlAttribute(name = "PackageCode")
        protected String packageCode;
        @XmlAttribute(name = "AllotmentCode")
        protected String allotmentCode;
        @XmlAttribute(name = "MealPlanCode")
        protected PMSRatePlans mealPlanCode;

        /**
         * Gets the value of the ratePlanCandidateRPH property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRatePlanCandidateRPH() {
            return ratePlanCandidateRPH;
        }

        /**
         * Sets the value of the ratePlanCandidateRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRatePlanCandidateRPH(BigInteger value) {
            this.ratePlanCandidateRPH = value;
        }

        /**
         * Gets the value of the operatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperatorCode() {
            return operatorCode;
        }

        /**
         * Sets the value of the operatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperatorCode(String value) {
            this.operatorCode = value;
        }

        /**
         * Gets the value of the packageCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackageCode() {
            return packageCode;
        }

        /**
         * Sets the value of the packageCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackageCode(String value) {
            this.packageCode = value;
        }

        /**
         * Gets the value of the allotmentCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllotmentCode() {
            return allotmentCode;
        }

        /**
         * Sets the value of the allotmentCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllotmentCode(String value) {
            this.allotmentCode = value;
        }

        /**
         * Gets the value of the mealPlanCode property.
         * 
         * @return
         *     possible object is
         *     {@link PMSRatePlans }
         *     
         */
        public PMSRatePlans getMealPlanCode() {
            return mealPlanCode;
        }

        /**
         * Sets the value of the mealPlanCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link PMSRatePlans }
         *     
         */
        public void setMealPlanCode(PMSRatePlans value) {
            this.mealPlanCode = value;
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
     *       &lt;attribute name="RoomRateRPH" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="OperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OperatorName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AllotmentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AllotmentName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PriceRateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PriceRateName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PackageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PackageName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RatePlanCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}PMSRatePlans" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoomRateMappings {

        @XmlAttribute(name = "RoomRateRPH")
        protected BigInteger roomRateRPH;
        @XmlAttribute(name = "OperatorCode")
        protected String operatorCode;
        @XmlAttribute(name = "OperatorName")
        protected String operatorName;
        @XmlAttribute(name = "AllotmentCode")
        protected String allotmentCode;
        @XmlAttribute(name = "AllotmentName")
        protected String allotmentName;
        @XmlAttribute(name = "PriceRateCode")
        protected String priceRateCode;
        @XmlAttribute(name = "PriceRateName")
        protected String priceRateName;
        @XmlAttribute(name = "PackageCode")
        protected String packageCode;
        @XmlAttribute(name = "PackageName")
        protected String packageName;
        @XmlAttribute(name = "RoomTypeCode")
        protected String roomTypeCode;
        @XmlAttribute(name = "RoomTypeName")
        protected String roomTypeName;
        @XmlAttribute(name = "RatePlanCode", required = true)
        protected PMSRatePlans ratePlanCode;

        /**
         * Gets the value of the roomRateRPH property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRoomRateRPH() {
            return roomRateRPH;
        }

        /**
         * Sets the value of the roomRateRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRoomRateRPH(BigInteger value) {
            this.roomRateRPH = value;
        }

        /**
         * Gets the value of the operatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperatorCode() {
            return operatorCode;
        }

        /**
         * Sets the value of the operatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperatorCode(String value) {
            this.operatorCode = value;
        }

        /**
         * Gets the value of the operatorName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperatorName() {
            return operatorName;
        }

        /**
         * Sets the value of the operatorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperatorName(String value) {
            this.operatorName = value;
        }

        /**
         * Gets the value of the allotmentCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllotmentCode() {
            return allotmentCode;
        }

        /**
         * Sets the value of the allotmentCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllotmentCode(String value) {
            this.allotmentCode = value;
        }

        /**
         * Gets the value of the allotmentName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllotmentName() {
            return allotmentName;
        }

        /**
         * Sets the value of the allotmentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllotmentName(String value) {
            this.allotmentName = value;
        }

        /**
         * Gets the value of the priceRateCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceRateCode() {
            return priceRateCode;
        }

        /**
         * Sets the value of the priceRateCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceRateCode(String value) {
            this.priceRateCode = value;
        }

        /**
         * Gets the value of the priceRateName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceRateName() {
            return priceRateName;
        }

        /**
         * Sets the value of the priceRateName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceRateName(String value) {
            this.priceRateName = value;
        }

        /**
         * Gets the value of the packageCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackageCode() {
            return packageCode;
        }

        /**
         * Sets the value of the packageCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackageCode(String value) {
            this.packageCode = value;
        }

        /**
         * Gets the value of the packageName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackageName() {
            return packageName;
        }

        /**
         * Sets the value of the packageName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackageName(String value) {
            this.packageName = value;
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
         * Gets the value of the roomTypeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomTypeName() {
            return roomTypeName;
        }

        /**
         * Sets the value of the roomTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomTypeName(String value) {
            this.roomTypeName = value;
        }

        /**
         * Gets the value of the ratePlanCode property.
         * 
         * @return
         *     possible object is
         *     {@link PMSRatePlans }
         *     
         */
        public PMSRatePlans getRatePlanCode() {
            return ratePlanCode;
        }

        /**
         * Sets the value of the ratePlanCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link PMSRatePlans }
         *     
         */
        public void setRatePlanCode(PMSRatePlans value) {
            this.ratePlanCode = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GeneralMapping">
     *       &lt;attribute name="SpecialRequestRPH" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpecialRequestMapping
        extends GeneralMapping
    {

        @XmlAttribute(name = "SpecialRequestRPH")
        protected BigInteger specialRequestRPH;

        /**
         * Gets the value of the specialRequestRPH property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSpecialRequestRPH() {
            return specialRequestRPH;
        }

        /**
         * Sets the value of the specialRequestRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSpecialRequestRPH(BigInteger value) {
            this.specialRequestRPH = value;
        }

    }

}
