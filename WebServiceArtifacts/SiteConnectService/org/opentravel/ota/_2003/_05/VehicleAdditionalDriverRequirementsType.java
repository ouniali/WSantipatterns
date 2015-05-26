
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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleAdditionalDriverRequirementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAdditionalDriverRequirementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddlDriverInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AddlDriverInfo" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
 *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailRequirementAddlDriverInfoType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;sequence>
 *                     &lt;element name="Vehicles" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Vehicle" maxOccurs="99">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleCoreType">
 *                                       &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                 &lt;attribute name="ChargeType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
@XmlType(name = "VehicleAdditionalDriverRequirementsType", propOrder = {
    "addlDriverInfos"
})
public class VehicleAdditionalDriverRequirementsType {

    @XmlElement(name = "AddlDriverInfos")
    protected VehicleAdditionalDriverRequirementsType.AddlDriverInfos addlDriverInfos;

    /**
     * Gets the value of the addlDriverInfos property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos }
     *     
     */
    public VehicleAdditionalDriverRequirementsType.AddlDriverInfos getAddlDriverInfos() {
        return addlDriverInfos;
    }

    /**
     * Sets the value of the addlDriverInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos }
     *     
     */
    public void setAddlDriverInfos(VehicleAdditionalDriverRequirementsType.AddlDriverInfos value) {
        this.addlDriverInfos = value;
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
     *         &lt;element name="AddlDriverInfo" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
     *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailRequirementAddlDriverInfoType" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;sequence>
     *           &lt;element name="Vehicles" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="Vehicle" maxOccurs="99">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleCoreType">
     *                             &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
     *                           &lt;/extension>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *       &lt;attribute name="ChargeType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addlDriverInfo",
        "vehicles"
    })
    public static class AddlDriverInfos {

        @XmlElement(name = "AddlDriverInfo", required = true)
        protected List<VehicleAdditionalDriverRequirementsType.AddlDriverInfos.AddlDriverInfo> addlDriverInfo;
        @XmlElement(name = "Vehicles")
        protected VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles vehicles;
        @XmlAttribute(name = "ChargeType")
        protected String chargeType;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;

        /**
         * Gets the value of the addlDriverInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addlDriverInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddlDriverInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos.AddlDriverInfo }
         * 
         * 
         */
        public List<VehicleAdditionalDriverRequirementsType.AddlDriverInfos.AddlDriverInfo> getAddlDriverInfo() {
            if (addlDriverInfo == null) {
                addlDriverInfo = new ArrayList<VehicleAdditionalDriverRequirementsType.AddlDriverInfos.AddlDriverInfo>();
            }
            return this.addlDriverInfo;
        }

        /**
         * Gets the value of the vehicles property.
         * 
         * @return
         *     possible object is
         *     {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles }
         *     
         */
        public VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles getVehicles() {
            return vehicles;
        }

        /**
         * Sets the value of the vehicles property.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles }
         *     
         */
        public void setVehicles(VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles value) {
            this.vehicles = value;
        }

        /**
         * Gets the value of the chargeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargeType() {
            return chargeType;
        }

        /**
         * Sets the value of the chargeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargeType(String value) {
            this.chargeType = value;
        }

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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
         *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailRequirementAddlDriverInfoType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AddlDriverInfo
            extends FormattedTextType
        {

            @XmlAttribute(name = "Type", required = true)
            protected LocationDetailRequirementAddlDriverInfoType type;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link LocationDetailRequirementAddlDriverInfoType }
             *     
             */
            public LocationDetailRequirementAddlDriverInfoType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationDetailRequirementAddlDriverInfoType }
             *     
             */
            public void setType(LocationDetailRequirementAddlDriverInfoType value) {
                this.type = value;
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
         *         &lt;element name="Vehicle" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleCoreType">
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
            protected List<VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles.Vehicle> vehicle;

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
             * {@link VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles.Vehicle }
             * 
             * 
             */
            public List<VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles.Vehicle> getVehicle() {
                if (vehicle == null) {
                    vehicle = new ArrayList<VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles.Vehicle>();
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
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleCoreType">
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
                extends VehicleCoreType
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
