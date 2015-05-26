
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.ServiceRuleType;


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
 *         &lt;element name="OptionalServicesTotal" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TaxInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FeeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrPrices"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}OptionalService" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}GroupedOptions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OptionalServiceRules" type="{http://www.travelport.com/schema/common_v15_0}ServiceRuleType" maxOccurs="unbounded" minOccurs="0"/>
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
    "optionalServicesTotal",
    "optionalService",
    "groupedOptions",
    "optionalServiceRules"
})
@XmlRootElement(name = "OptionalServices")
public class OptionalServices {

    @XmlElement(name = "OptionalServicesTotal")
    protected OptionalServices.OptionalServicesTotal optionalServicesTotal;
    @XmlElement(name = "OptionalService", required = true)
    protected List<OptionalService> optionalService;
    @XmlElement(name = "GroupedOptions")
    protected List<GroupedOptions> groupedOptions;
    @XmlElement(name = "OptionalServiceRules")
    protected List<ServiceRuleType> optionalServiceRules;

    /**
     * Gets the value of the optionalServicesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices.OptionalServicesTotal }
     *     
     */
    public OptionalServices.OptionalServicesTotal getOptionalServicesTotal() {
        return optionalServicesTotal;
    }

    /**
     * Sets the value of the optionalServicesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices.OptionalServicesTotal }
     *     
     */
    public void setOptionalServicesTotal(OptionalServices.OptionalServicesTotal value) {
        this.optionalServicesTotal = value;
    }

    /**
     * Gets the value of the optionalService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionalService }
     * 
     * 
     */
    public List<OptionalService> getOptionalService() {
        if (optionalService == null) {
            optionalService = new ArrayList<OptionalService>();
        }
        return this.optionalService;
    }

    /**
     * Gets the value of the groupedOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupedOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupedOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupedOptions }
     * 
     * 
     */
    public List<GroupedOptions> getGroupedOptions() {
        if (groupedOptions == null) {
            groupedOptions = new ArrayList<GroupedOptions>();
        }
        return this.groupedOptions;
    }

    /**
     * Gets the value of the optionalServiceRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalServiceRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalServiceRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRuleType }
     * 
     * 
     */
    public List<ServiceRuleType> getOptionalServiceRules() {
        if (optionalServiceRules == null) {
            optionalServiceRules = new ArrayList<ServiceRuleType>();
        }
        return this.optionalServiceRules;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TaxInfo" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FeeInfo" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrPrices"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxInfo",
        "feeInfo"
    })
    public static class OptionalServicesTotal {

        @XmlElement(name = "TaxInfo")
        protected List<TypeTaxInfo> taxInfo;
        @XmlElement(name = "FeeInfo")
        protected List<FeeInfo> feeInfo;
        @XmlAttribute(name = "TotalPrice")
        protected String totalPrice;
        @XmlAttribute(name = "BasePrice")
        protected String basePrice;
        @XmlAttribute(name = "ApproximateTotalPrice")
        protected String approximateTotalPrice;
        @XmlAttribute(name = "ApproximateBasePrice")
        protected String approximateBasePrice;
        @XmlAttribute(name = "EquivalentBasePrice")
        protected String equivalentBasePrice;
        @XmlAttribute(name = "Taxes")
        protected String taxes;
        @XmlAttribute(name = "Fees")
        protected String fees;
        @XmlAttribute(name = "Services")
        protected String services;

        /**
         * Gets the value of the taxInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeTaxInfo }
         * 
         * 
         */
        public List<TypeTaxInfo> getTaxInfo() {
            if (taxInfo == null) {
                taxInfo = new ArrayList<TypeTaxInfo>();
            }
            return this.taxInfo;
        }

        /**
         * Gets the value of the feeInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feeInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeeInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeeInfo }
         * 
         * 
         */
        public List<FeeInfo> getFeeInfo() {
            if (feeInfo == null) {
                feeInfo = new ArrayList<FeeInfo>();
            }
            return this.feeInfo;
        }

        /**
         * Gets the value of the totalPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalPrice() {
            return totalPrice;
        }

        /**
         * Sets the value of the totalPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalPrice(String value) {
            this.totalPrice = value;
        }

        /**
         * Gets the value of the basePrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBasePrice() {
            return basePrice;
        }

        /**
         * Sets the value of the basePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBasePrice(String value) {
            this.basePrice = value;
        }

        /**
         * Gets the value of the approximateTotalPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApproximateTotalPrice() {
            return approximateTotalPrice;
        }

        /**
         * Sets the value of the approximateTotalPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApproximateTotalPrice(String value) {
            this.approximateTotalPrice = value;
        }

        /**
         * Gets the value of the approximateBasePrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApproximateBasePrice() {
            return approximateBasePrice;
        }

        /**
         * Sets the value of the approximateBasePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApproximateBasePrice(String value) {
            this.approximateBasePrice = value;
        }

        /**
         * Gets the value of the equivalentBasePrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquivalentBasePrice() {
            return equivalentBasePrice;
        }

        /**
         * Sets the value of the equivalentBasePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquivalentBasePrice(String value) {
            this.equivalentBasePrice = value;
        }

        /**
         * Gets the value of the taxes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxes() {
            return taxes;
        }

        /**
         * Sets the value of the taxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxes(String value) {
            this.taxes = value;
        }

        /**
         * Gets the value of the fees property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFees() {
            return fees;
        }

        /**
         * Sets the value of the fees property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFees(String value) {
            this.fees = value;
        }

        /**
         * Gets the value of the services property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServices() {
            return services;
        }

        /**
         * Sets the value of the services property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServices(String value) {
            this.services = value;
        }

    }

}
