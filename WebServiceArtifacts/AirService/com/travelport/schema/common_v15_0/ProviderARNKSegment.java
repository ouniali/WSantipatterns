
package com.travelport.schema.common_v15_0;

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
 *       &lt;sequence>
 *         &lt;element name="PreviousSegment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v15_0}typeSegmentRef" minOccurs="0"/>
 *                   &lt;element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v15_0}typeNonAirReservationRef" minOccurs="0"/>
 *                   &lt;element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v15_0}typeNonAirReservationRef" minOccurs="0"/>
 *                   &lt;element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v15_0}typeSegmentRef" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NextSegment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v15_0}typeSegmentRef" minOccurs="0"/>
 *                   &lt;element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v15_0}typeNonAirReservationRef" minOccurs="0"/>
 *                   &lt;element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v15_0}typeNonAirReservationRef" minOccurs="0"/>
 *                   &lt;element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v15_0}typeSegmentRef" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "previousSegment",
    "nextSegment"
})
@XmlRootElement(name = "ProviderARNKSegment")
public class ProviderARNKSegment {

    @XmlElement(name = "PreviousSegment")
    protected ProviderARNKSegment.PreviousSegment previousSegment;
    @XmlElement(name = "NextSegment")
    protected ProviderARNKSegment.NextSegment nextSegment;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;

    /**
     * Gets the value of the previousSegment property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderARNKSegment.PreviousSegment }
     *     
     */
    public ProviderARNKSegment.PreviousSegment getPreviousSegment() {
        return previousSegment;
    }

    /**
     * Sets the value of the previousSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderARNKSegment.PreviousSegment }
     *     
     */
    public void setPreviousSegment(ProviderARNKSegment.PreviousSegment value) {
        this.previousSegment = value;
    }

    /**
     * Gets the value of the nextSegment property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderARNKSegment.NextSegment }
     *     
     */
    public ProviderARNKSegment.NextSegment getNextSegment() {
        return nextSegment;
    }

    /**
     * Sets the value of the nextSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderARNKSegment.NextSegment }
     *     
     */
    public void setNextSegment(ProviderARNKSegment.NextSegment value) {
        this.nextSegment = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v15_0}typeSegmentRef" minOccurs="0"/>
     *         &lt;element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v15_0}typeNonAirReservationRef" minOccurs="0"/>
     *         &lt;element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v15_0}typeNonAirReservationRef" minOccurs="0"/>
     *         &lt;element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v15_0}typeSegmentRef" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airSegmentRef",
        "hotelReservationRef",
        "vehicleReservationRef",
        "passiveSegmentRef"
    })
    public static class NextSegment {

        @XmlElement(name = "AirSegmentRef")
        protected TypeSegmentRef airSegmentRef;
        @XmlElement(name = "HotelReservationRef")
        protected TypeNonAirReservationRef hotelReservationRef;
        @XmlElement(name = "VehicleReservationRef")
        protected TypeNonAirReservationRef vehicleReservationRef;
        @XmlElement(name = "PassiveSegmentRef")
        protected TypeSegmentRef passiveSegmentRef;

        /**
         * Gets the value of the airSegmentRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSegmentRef }
         *     
         */
        public TypeSegmentRef getAirSegmentRef() {
            return airSegmentRef;
        }

        /**
         * Sets the value of the airSegmentRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSegmentRef }
         *     
         */
        public void setAirSegmentRef(TypeSegmentRef value) {
            this.airSegmentRef = value;
        }

        /**
         * Gets the value of the hotelReservationRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        public TypeNonAirReservationRef getHotelReservationRef() {
            return hotelReservationRef;
        }

        /**
         * Sets the value of the hotelReservationRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        public void setHotelReservationRef(TypeNonAirReservationRef value) {
            this.hotelReservationRef = value;
        }

        /**
         * Gets the value of the vehicleReservationRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        public TypeNonAirReservationRef getVehicleReservationRef() {
            return vehicleReservationRef;
        }

        /**
         * Sets the value of the vehicleReservationRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        public void setVehicleReservationRef(TypeNonAirReservationRef value) {
            this.vehicleReservationRef = value;
        }

        /**
         * Gets the value of the passiveSegmentRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSegmentRef }
         *     
         */
        public TypeSegmentRef getPassiveSegmentRef() {
            return passiveSegmentRef;
        }

        /**
         * Sets the value of the passiveSegmentRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSegmentRef }
         *     
         */
        public void setPassiveSegmentRef(TypeSegmentRef value) {
            this.passiveSegmentRef = value;
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
     *       &lt;choice>
     *         &lt;element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v15_0}typeSegmentRef" minOccurs="0"/>
     *         &lt;element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v15_0}typeNonAirReservationRef" minOccurs="0"/>
     *         &lt;element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v15_0}typeNonAirReservationRef" minOccurs="0"/>
     *         &lt;element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v15_0}typeSegmentRef" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airSegmentRef",
        "hotelReservationRef",
        "vehicleReservationRef",
        "passiveSegmentRef"
    })
    public static class PreviousSegment {

        @XmlElement(name = "AirSegmentRef")
        protected TypeSegmentRef airSegmentRef;
        @XmlElement(name = "HotelReservationRef")
        protected TypeNonAirReservationRef hotelReservationRef;
        @XmlElement(name = "VehicleReservationRef")
        protected TypeNonAirReservationRef vehicleReservationRef;
        @XmlElement(name = "PassiveSegmentRef")
        protected TypeSegmentRef passiveSegmentRef;

        /**
         * Gets the value of the airSegmentRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSegmentRef }
         *     
         */
        public TypeSegmentRef getAirSegmentRef() {
            return airSegmentRef;
        }

        /**
         * Sets the value of the airSegmentRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSegmentRef }
         *     
         */
        public void setAirSegmentRef(TypeSegmentRef value) {
            this.airSegmentRef = value;
        }

        /**
         * Gets the value of the hotelReservationRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        public TypeNonAirReservationRef getHotelReservationRef() {
            return hotelReservationRef;
        }

        /**
         * Sets the value of the hotelReservationRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        public void setHotelReservationRef(TypeNonAirReservationRef value) {
            this.hotelReservationRef = value;
        }

        /**
         * Gets the value of the vehicleReservationRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        public TypeNonAirReservationRef getVehicleReservationRef() {
            return vehicleReservationRef;
        }

        /**
         * Sets the value of the vehicleReservationRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        public void setVehicleReservationRef(TypeNonAirReservationRef value) {
            this.vehicleReservationRef = value;
        }

        /**
         * Gets the value of the passiveSegmentRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSegmentRef }
         *     
         */
        public TypeSegmentRef getPassiveSegmentRef() {
            return passiveSegmentRef;
        }

        /**
         * Sets the value of the passiveSegmentRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSegmentRef }
         *     
         */
        public void setPassiveSegmentRef(TypeSegmentRef value) {
            this.passiveSegmentRef = value;
        }

    }

}
