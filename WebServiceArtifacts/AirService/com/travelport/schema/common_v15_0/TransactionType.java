
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
 *         &lt;element name="Air" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.travelport.com/schema/common_v15_0}typeTransactionsAllowed">
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrFlexShopping"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Hotel" type="{http://www.travelport.com/schema/common_v15_0}typeTransactionsAllowed" minOccurs="0"/>
 *         &lt;element name="Rail" type="{http://www.travelport.com/schema/common_v15_0}typeTransactionsAllowed" minOccurs="0"/>
 *         &lt;element name="Vehicle" type="{http://www.travelport.com/schema/common_v15_0}typeTransactionsAllowed" minOccurs="0"/>
 *         &lt;element name="Passive" type="{http://www.travelport.com/schema/common_v15_0}typeBookingTransactionsAllowed" minOccurs="0"/>
 *         &lt;element name="BackgroundPassive" type="{http://www.travelport.com/schema/common_v15_0}typeBookingTransactionsAllowed" minOccurs="0"/>
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
    "air",
    "hotel",
    "rail",
    "vehicle",
    "passive",
    "backgroundPassive"
})
@XmlRootElement(name = "TransactionType")
public class TransactionType {

    @XmlElement(name = "Air")
    protected TransactionType.Air air;
    @XmlElement(name = "Hotel")
    protected TypeTransactionsAllowed hotel;
    @XmlElement(name = "Rail")
    protected TypeTransactionsAllowed rail;
    @XmlElement(name = "Vehicle")
    protected TypeTransactionsAllowed vehicle;
    @XmlElement(name = "Passive")
    protected TypeBookingTransactionsAllowed passive;
    @XmlElement(name = "BackgroundPassive")
    protected TypeBookingTransactionsAllowed backgroundPassive;

    /**
     * Gets the value of the air property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType.Air }
     *     
     */
    public TransactionType.Air getAir() {
        return air;
    }

    /**
     * Sets the value of the air property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType.Air }
     *     
     */
    public void setAir(TransactionType.Air value) {
        this.air = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    public TypeTransactionsAllowed getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    public void setHotel(TypeTransactionsAllowed value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the rail property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    public TypeTransactionsAllowed getRail() {
        return rail;
    }

    /**
     * Sets the value of the rail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    public void setRail(TypeTransactionsAllowed value) {
        this.rail = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    public TypeTransactionsAllowed getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    public void setVehicle(TypeTransactionsAllowed value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the passive property.
     * 
     * @return
     *     possible object is
     *     {@link TypeBookingTransactionsAllowed }
     *     
     */
    public TypeBookingTransactionsAllowed getPassive() {
        return passive;
    }

    /**
     * Sets the value of the passive property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBookingTransactionsAllowed }
     *     
     */
    public void setPassive(TypeBookingTransactionsAllowed value) {
        this.passive = value;
    }

    /**
     * Gets the value of the backgroundPassive property.
     * 
     * @return
     *     possible object is
     *     {@link TypeBookingTransactionsAllowed }
     *     
     */
    public TypeBookingTransactionsAllowed getBackgroundPassive() {
        return backgroundPassive;
    }

    /**
     * Sets the value of the backgroundPassive property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBookingTransactionsAllowed }
     *     
     */
    public void setBackgroundPassive(TypeBookingTransactionsAllowed value) {
        this.backgroundPassive = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}typeTransactionsAllowed">
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrFlexShopping"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Air
        extends TypeTransactionsAllowed
    {

        @XmlAttribute(name = "Tier")
        protected Integer tier;
        @XmlAttribute(name = "DaysEnabled")
        protected Boolean daysEnabled;
        @XmlAttribute(name = "WeekendsEnabled")
        protected Boolean weekendsEnabled;
        @XmlAttribute(name = "AirportsEnabled")
        protected Boolean airportsEnabled;
        @XmlAttribute(name = "ODEnabled")
        protected Boolean odEnabled;

        /**
         * Gets the value of the tier property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTier() {
            return tier;
        }

        /**
         * Sets the value of the tier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTier(Integer value) {
            this.tier = value;
        }

        /**
         * Gets the value of the daysEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDaysEnabled() {
            return daysEnabled;
        }

        /**
         * Sets the value of the daysEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDaysEnabled(Boolean value) {
            this.daysEnabled = value;
        }

        /**
         * Gets the value of the weekendsEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWeekendsEnabled() {
            return weekendsEnabled;
        }

        /**
         * Sets the value of the weekendsEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWeekendsEnabled(Boolean value) {
            this.weekendsEnabled = value;
        }

        /**
         * Gets the value of the airportsEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAirportsEnabled() {
            return airportsEnabled;
        }

        /**
         * Sets the value of the airportsEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAirportsEnabled(Boolean value) {
            this.airportsEnabled = value;
        }

        /**
         * Gets the value of the odEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isODEnabled() {
            return odEnabled;
        }

        /**
         * Sets the value of the odEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setODEnabled(Boolean value) {
            this.odEnabled = value;
        }

    }

}
