
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleLocationVehiclesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationVehiclesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehicleInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehicleInfo" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
 *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailVehicleInfoType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vehicle" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
 *                 &lt;sequence>
 *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" maxOccurs="5" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="IsConfirmableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="DistanceUnit" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
 *                 &lt;attribute name="DistancePerFuelUnit" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
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
@XmlType(name = "VehicleLocationVehiclesType", propOrder = {
    "vehicleInfos",
    "vehicle"
})
public class VehicleLocationVehiclesType {

    @XmlElement(name = "VehicleInfos")
    protected VehicleLocationVehiclesType.VehicleInfos vehicleInfos;
    @XmlElement(name = "Vehicle")
    protected List<VehicleLocationVehiclesType.Vehicle> vehicle;

    /**
     * Gets the value of the vehicleInfos property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationVehiclesType.VehicleInfos }
     *     
     */
    public VehicleLocationVehiclesType.VehicleInfos getVehicleInfos() {
        return vehicleInfos;
    }

    /**
     * Sets the value of the vehicleInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationVehiclesType.VehicleInfos }
     *     
     */
    public void setVehicleInfos(VehicleLocationVehiclesType.VehicleInfos value) {
        this.vehicleInfos = value;
    }

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
     * {@link VehicleLocationVehiclesType.Vehicle }
     * 
     * 
     */
    public List<VehicleLocationVehiclesType.Vehicle> getVehicle() {
        if (vehicle == null) {
            vehicle = new ArrayList<VehicleLocationVehiclesType.Vehicle>();
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
     *       &lt;sequence>
     *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" maxOccurs="5" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="IsConfirmableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="DistanceUnit" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
     *       &lt;attribute name="DistancePerFuelUnit" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "text"
    })
    public static class Vehicle
        extends VehicleType
    {

        @XmlElement(name = "Text")
        protected List<FormattedTextType> text;
        @XmlAttribute(name = "IsConfirmableInd")
        protected Boolean isConfirmableInd;
        @XmlAttribute(name = "DistanceUnit")
        protected DistanceUnitNameType distanceUnit;
        @XmlAttribute(name = "DistancePerFuelUnit")
        protected Integer distancePerFuelUnit;

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FormattedTextType }
         * 
         * 
         */
        public List<FormattedTextType> getText() {
            if (text == null) {
                text = new ArrayList<FormattedTextType>();
            }
            return this.text;
        }

        /**
         * Gets the value of the isConfirmableInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsConfirmableInd() {
            return isConfirmableInd;
        }

        /**
         * Sets the value of the isConfirmableInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsConfirmableInd(Boolean value) {
            this.isConfirmableInd = value;
        }

        /**
         * Gets the value of the distanceUnit property.
         * 
         * @return
         *     possible object is
         *     {@link DistanceUnitNameType }
         *     
         */
        public DistanceUnitNameType getDistanceUnit() {
            return distanceUnit;
        }

        /**
         * Sets the value of the distanceUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link DistanceUnitNameType }
         *     
         */
        public void setDistanceUnit(DistanceUnitNameType value) {
            this.distanceUnit = value;
        }

        /**
         * Gets the value of the distancePerFuelUnit property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDistancePerFuelUnit() {
            return distancePerFuelUnit;
        }

        /**
         * Sets the value of the distancePerFuelUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDistancePerFuelUnit(Integer value) {
            this.distancePerFuelUnit = value;
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
     *         &lt;element name="VehicleInfo" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
     *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailVehicleInfoType" />
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
        "vehicleInfo"
    })
    public static class VehicleInfos {

        @XmlElement(name = "VehicleInfo", required = true)
        protected List<VehicleLocationVehiclesType.VehicleInfos.VehicleInfo> vehicleInfo;

        /**
         * Gets the value of the vehicleInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationVehiclesType.VehicleInfos.VehicleInfo }
         * 
         * 
         */
        public List<VehicleLocationVehiclesType.VehicleInfos.VehicleInfo> getVehicleInfo() {
            if (vehicleInfo == null) {
                vehicleInfo = new ArrayList<VehicleLocationVehiclesType.VehicleInfos.VehicleInfo>();
            }
            return this.vehicleInfo;
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
         *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailVehicleInfoType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class VehicleInfo
            extends FormattedTextType
        {

            @XmlAttribute(name = "Type", required = true)
            protected LocationDetailVehicleInfoType type;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link LocationDetailVehicleInfoType }
             *     
             */
            public LocationDetailVehicleInfoType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationDetailVehicleInfoType }
             *     
             */
            public void setType(LocationDetailVehicleInfoType value) {
                this.type = value;
            }

        }

    }

}
