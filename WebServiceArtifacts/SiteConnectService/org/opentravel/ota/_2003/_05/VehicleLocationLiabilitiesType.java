
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleLocationLiabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationLiabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coverages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Coverage" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CoverageInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
 *                             &lt;element name="CoverageFees" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CoverageFee" maxOccurs="99">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/>
 *                                                 &lt;element name="Vehicles" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Vehicle" maxOccurs="99">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
 *                                                                   &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationLiabilitiesType", propOrder = {
    "coverages",
    "info",
    "tpaExtensions"
})
public class VehicleLocationLiabilitiesType {

    @XmlElement(name = "Coverages")
    protected VehicleLocationLiabilitiesType.Coverages coverages;
    @XmlElement(name = "Info")
    protected FormattedTextType info;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Gets the value of the coverages property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationLiabilitiesType.Coverages }
     *     
     */
    public VehicleLocationLiabilitiesType.Coverages getCoverages() {
        return coverages;
    }

    /**
     * Sets the value of the coverages property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationLiabilitiesType.Coverages }
     *     
     */
    public void setCoverages(VehicleLocationLiabilitiesType.Coverages value) {
        this.coverages = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextType }
     *     
     */
    public FormattedTextType getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextType }
     *     
     */
    public void setInfo(FormattedTextType value) {
        this.info = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
     *         &lt;element name="Coverage" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CoverageInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
     *                   &lt;element name="CoverageFees" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CoverageFee" maxOccurs="99">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/>
     *                                       &lt;element name="Vehicles" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Vehicle" maxOccurs="99">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
     *                                                         &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
     *                                                       &lt;/extension>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "coverage"
    })
    public static class Coverages {

        @XmlElement(name = "Coverage")
        protected List<VehicleLocationLiabilitiesType.Coverages.Coverage> coverage;

        /**
         * Gets the value of the coverage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coverage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoverage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationLiabilitiesType.Coverages.Coverage }
         * 
         * 
         */
        public List<VehicleLocationLiabilitiesType.Coverages.Coverage> getCoverage() {
            if (coverage == null) {
                coverage = new ArrayList<VehicleLocationLiabilitiesType.Coverages.Coverage>();
            }
            return this.coverage;
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
         *         &lt;element name="CoverageInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
         *         &lt;element name="CoverageFees" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CoverageFee" maxOccurs="99">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/>
         *                             &lt;element name="Vehicles" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Vehicle" maxOccurs="99">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
         *                                               &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
         *                                             &lt;/extension>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/>
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
         *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "coverageInfo",
            "coverageFees"
        })
        public static class Coverage {

            @XmlElement(name = "CoverageInfo")
            protected FormattedTextType coverageInfo;
            @XmlElement(name = "CoverageFees")
            protected VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees coverageFees;
            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "RequiredInd")
            protected Boolean requiredInd;

            /**
             * Gets the value of the coverageInfo property.
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextType }
             *     
             */
            public FormattedTextType getCoverageInfo() {
                return coverageInfo;
            }

            /**
             * Sets the value of the coverageInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextType }
             *     
             */
            public void setCoverageInfo(FormattedTextType value) {
                this.coverageInfo = value;
            }

            /**
             * Gets the value of the coverageFees property.
             * 
             * @return
             *     possible object is
             *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees }
             *     
             */
            public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees getCoverageFees() {
                return coverageFees;
            }

            /**
             * Sets the value of the coverageFees property.
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees }
             *     
             */
            public void setCoverageFees(VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees value) {
                this.coverageFees = value;
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

            /**
             * Gets the value of the requiredInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRequiredInd() {
                return requiredInd;
            }

            /**
             * Sets the value of the requiredInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRequiredInd(Boolean value) {
                this.requiredInd = value;
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
             *         &lt;element name="CoverageFee" maxOccurs="99">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/>
             *                   &lt;element name="Vehicles" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Vehicle" maxOccurs="99">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
             *                                     &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
             *                                   &lt;/extension>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/>
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
                "coverageFee"
            })
            public static class CoverageFees {

                @XmlElement(name = "CoverageFee", required = true)
                protected List<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee> coverageFee;

                /**
                 * Gets the value of the coverageFee property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the coverageFee property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCoverageFee().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee }
                 * 
                 * 
                 */
                public List<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee> getCoverageFee() {
                    if (coverageFee == null) {
                        coverageFee = new ArrayList<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee>();
                    }
                    return this.coverageFee;
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
                 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/>
                 *         &lt;element name="Vehicles" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Vehicle" maxOccurs="99">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
                 *                           &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
                 *                         &lt;/extension>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/>
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
                    "charge",
                    "vehicles",
                    "deductible"
                })
                public static class CoverageFee {

                    @XmlElement(name = "Charge", required = true)
                    protected VehicleChargeType charge;
                    @XmlElement(name = "Vehicles")
                    protected VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles vehicles;
                    @XmlElement(name = "Deductible")
                    protected DeductibleType deductible;

                    /**
                     * Gets the value of the charge property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link VehicleChargeType }
                     *     
                     */
                    public VehicleChargeType getCharge() {
                        return charge;
                    }

                    /**
                     * Sets the value of the charge property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VehicleChargeType }
                     *     
                     */
                    public void setCharge(VehicleChargeType value) {
                        this.charge = value;
                    }

                    /**
                     * Gets the value of the vehicles property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles }
                     *     
                     */
                    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles getVehicles() {
                        return vehicles;
                    }

                    /**
                     * Sets the value of the vehicles property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles }
                     *     
                     */
                    public void setVehicles(VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles value) {
                        this.vehicles = value;
                    }

                    /**
                     * Gets the value of the deductible property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DeductibleType }
                     *     
                     */
                    public DeductibleType getDeductible() {
                        return deductible;
                    }

                    /**
                     * Sets the value of the deductible property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DeductibleType }
                     *     
                     */
                    public void setDeductible(DeductibleType value) {
                        this.deductible = value;
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
                     *         &lt;element name="Vehicle" maxOccurs="99">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
                     *                 &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
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
                        "vehicle"
                    })
                    public static class Vehicles {

                        @XmlElement(name = "Vehicle", required = true)
                        protected List<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle> vehicle;

                        /**
                         * Gets the value of the vehicle property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the vehicle property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getVehicle().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle }
                         * 
                         * 
                         */
                        public List<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle> getVehicle() {
                            if (vehicle == null) {
                                vehicle = new ArrayList<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle>();
                            }
                            return this.vehicle;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
                         *       &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
                         *     &lt;/extension>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Vehicle
                            extends VehicleType
                        {

                            @XmlAttribute(name = "IncludeExclude")
                            protected IncludeExcludeType includeExclude;

                            /**
                             * Gets the value of the includeExclude property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link IncludeExcludeType }
                             *     
                             */
                            public IncludeExcludeType getIncludeExclude() {
                                return includeExclude;
                            }

                            /**
                             * Sets the value of the includeExclude property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link IncludeExcludeType }
                             *     
                             */
                            public void setIncludeExclude(IncludeExcludeType value) {
                                this.includeExclude = value;
                            }

                        }

                    }

                }

            }

        }

    }

}
