
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleLocationAdditionalDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationAdditionalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehRentLocInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehRentLocInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationInformationType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ParkLocation" type="{http://www.opentravel.org/OTA/2003/05}VehicleWhereAtFacilityType" minOccurs="0"/>
 *         &lt;element name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}VehicleWhereAtFacilityType" minOccurs="0"/>
 *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/>
 *         &lt;element name="Shuttle" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShuttleInfos" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ShuttleInfo" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
 *                                     &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailShuttleInfoType" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OneWayDropLocations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OneWayDropLocation" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                           &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "VehicleLocationAdditionalDetailsType", propOrder = {
    "vehRentLocInfos",
    "parkLocation",
    "counterLocation",
    "operationSchedules",
    "shuttle",
    "oneWayDropLocations",
    "tpaExtensions"
})
public class VehicleLocationAdditionalDetailsType {

    @XmlElement(name = "VehRentLocInfos")
    protected VehicleLocationAdditionalDetailsType.VehRentLocInfos vehRentLocInfos;
    @XmlElement(name = "ParkLocation")
    protected VehicleWhereAtFacilityType parkLocation;
    @XmlElement(name = "CounterLocation")
    protected VehicleWhereAtFacilityType counterLocation;
    @XmlElement(name = "OperationSchedules")
    protected OperationSchedulesType operationSchedules;
    @XmlElement(name = "Shuttle")
    protected VehicleLocationAdditionalDetailsType.Shuttle shuttle;
    @XmlElement(name = "OneWayDropLocations")
    protected VehicleLocationAdditionalDetailsType.OneWayDropLocations oneWayDropLocations;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Gets the value of the vehRentLocInfos property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos }
     *     
     */
    public VehicleLocationAdditionalDetailsType.VehRentLocInfos getVehRentLocInfos() {
        return vehRentLocInfos;
    }

    /**
     * Sets the value of the vehRentLocInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos }
     *     
     */
    public void setVehRentLocInfos(VehicleLocationAdditionalDetailsType.VehRentLocInfos value) {
        this.vehRentLocInfos = value;
    }

    /**
     * Gets the value of the parkLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public VehicleWhereAtFacilityType getParkLocation() {
        return parkLocation;
    }

    /**
     * Sets the value of the parkLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public void setParkLocation(VehicleWhereAtFacilityType value) {
        this.parkLocation = value;
    }

    /**
     * Gets the value of the counterLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public VehicleWhereAtFacilityType getCounterLocation() {
        return counterLocation;
    }

    /**
     * Sets the value of the counterLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public void setCounterLocation(VehicleWhereAtFacilityType value) {
        this.counterLocation = value;
    }

    /**
     * Gets the value of the operationSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link OperationSchedulesType }
     *     
     */
    public OperationSchedulesType getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * Sets the value of the operationSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSchedulesType }
     *     
     */
    public void setOperationSchedules(OperationSchedulesType value) {
        this.operationSchedules = value;
    }

    /**
     * Gets the value of the shuttle property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalDetailsType.Shuttle }
     *     
     */
    public VehicleLocationAdditionalDetailsType.Shuttle getShuttle() {
        return shuttle;
    }

    /**
     * Sets the value of the shuttle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalDetailsType.Shuttle }
     *     
     */
    public void setShuttle(VehicleLocationAdditionalDetailsType.Shuttle value) {
        this.shuttle = value;
    }

    /**
     * Gets the value of the oneWayDropLocations property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalDetailsType.OneWayDropLocations }
     *     
     */
    public VehicleLocationAdditionalDetailsType.OneWayDropLocations getOneWayDropLocations() {
        return oneWayDropLocations;
    }

    /**
     * Sets the value of the oneWayDropLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalDetailsType.OneWayDropLocations }
     *     
     */
    public void setOneWayDropLocations(VehicleLocationAdditionalDetailsType.OneWayDropLocations value) {
        this.oneWayDropLocations = value;
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
     *         &lt;element name="OneWayDropLocation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "oneWayDropLocation"
    })
    public static class OneWayDropLocations {

        @XmlElement(name = "OneWayDropLocation", required = true)
        protected List<VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation> oneWayDropLocation;

        /**
         * Gets the value of the oneWayDropLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneWayDropLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneWayDropLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation }
         * 
         * 
         */
        public List<VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation> getOneWayDropLocation() {
            if (oneWayDropLocation == null) {
                oneWayDropLocation = new ArrayList<VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation>();
            }
            return this.oneWayDropLocation;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
         *       &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OneWayDropLocation
            extends LocationType
        {

            @XmlAttribute(name = "ExtendedLocationCode")
            protected String extendedLocationCode;

            /**
             * Gets the value of the extendedLocationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtendedLocationCode() {
                return extendedLocationCode;
            }

            /**
             * Sets the value of the extendedLocationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtendedLocationCode(String value) {
                this.extendedLocationCode = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ShuttleInfos" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ShuttleInfo" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
     *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailShuttleInfoType" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/>
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
        "shuttleInfos",
        "operationSchedules"
    })
    public static class Shuttle {

        @XmlElement(name = "ShuttleInfos")
        protected VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos shuttleInfos;
        @XmlElement(name = "OperationSchedules")
        protected OperationSchedulesType operationSchedules;

        /**
         * Gets the value of the shuttleInfos property.
         * 
         * @return
         *     possible object is
         *     {@link VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos }
         *     
         */
        public VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos getShuttleInfos() {
            return shuttleInfos;
        }

        /**
         * Sets the value of the shuttleInfos property.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos }
         *     
         */
        public void setShuttleInfos(VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos value) {
            this.shuttleInfos = value;
        }

        /**
         * Gets the value of the operationSchedules property.
         * 
         * @return
         *     possible object is
         *     {@link OperationSchedulesType }
         *     
         */
        public OperationSchedulesType getOperationSchedules() {
            return operationSchedules;
        }

        /**
         * Sets the value of the operationSchedules property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperationSchedulesType }
         *     
         */
        public void setOperationSchedules(OperationSchedulesType value) {
            this.operationSchedules = value;
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
         *         &lt;element name="ShuttleInfo" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
         *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailShuttleInfoType" />
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
            "shuttleInfo"
        })
        public static class ShuttleInfos {

            @XmlElement(name = "ShuttleInfo", required = true)
            protected List<VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo> shuttleInfo;

            /**
             * Gets the value of the shuttleInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the shuttleInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getShuttleInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo }
             * 
             * 
             */
            public List<VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo> getShuttleInfo() {
                if (shuttleInfo == null) {
                    shuttleInfo = new ArrayList<VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo>();
                }
                return this.shuttleInfo;
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
             *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailShuttleInfoType" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ShuttleInfo
                extends FormattedTextType
            {

                @XmlAttribute(name = "Type", required = true)
                protected LocationDetailShuttleInfoType type;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LocationDetailShuttleInfoType }
                 *     
                 */
                public LocationDetailShuttleInfoType getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LocationDetailShuttleInfoType }
                 *     
                 */
                public void setType(LocationDetailShuttleInfoType value) {
                    this.type = value;
                }

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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="VehRentLocInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationInformationType" maxOccurs="99"/>
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
        "vehRentLocInfo"
    })
    public static class VehRentLocInfos {

        @XmlElement(name = "VehRentLocInfo", required = true)
        protected List<VehicleLocationInformationType> vehRentLocInfo;

        /**
         * Gets the value of the vehRentLocInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehRentLocInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehRentLocInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationInformationType }
         * 
         * 
         */
        public List<VehicleLocationInformationType> getVehRentLocInfo() {
            if (vehRentLocInfo == null) {
                vehRentLocInfo = new ArrayList<VehicleLocationInformationType>();
            }
            return this.vehRentLocInfo;
        }

    }

}
