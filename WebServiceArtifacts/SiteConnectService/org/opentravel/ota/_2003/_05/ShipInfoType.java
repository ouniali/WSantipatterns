
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ShipInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ship" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="StabilizedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RegistrationCountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *                 &lt;attribute name="RestaurantQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="ElevatorQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaxCrewQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="MaxGuestQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="CruisingSpeed" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MaxSpeed" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="InsideCabinQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="OutsideCabinQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="InauguralDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="RefurbishedDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="BuiltDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="NextRefurbishDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShipLength" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShipVoltage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ShipReferenceGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipInfoType", propOrder = {
    "ship",
    "shipLength",
    "shipVoltage"
})
public class ShipInfoType {

    @XmlElement(name = "Ship")
    protected ShipInfoType.Ship ship;
    @XmlElement(name = "ShipLength")
    protected ShipInfoType.ShipLength shipLength;
    @XmlElement(name = "ShipVoltage")
    protected ShipInfoType.ShipVoltage shipVoltage;
    @XmlAttribute(name = "VendorCode")
    protected String vendorCode;
    @XmlAttribute(name = "VendorName")
    protected String vendorName;
    @XmlAttribute(name = "ShipCode")
    protected String shipCode;
    @XmlAttribute(name = "ShipName")
    protected String shipName;
    @XmlAttribute(name = "VendorCodeContext")
    protected String vendorCodeContext;

    /**
     * Gets the value of the ship property.
     * 
     * @return
     *     possible object is
     *     {@link ShipInfoType.Ship }
     *     
     */
    public ShipInfoType.Ship getShip() {
        return ship;
    }

    /**
     * Sets the value of the ship property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipInfoType.Ship }
     *     
     */
    public void setShip(ShipInfoType.Ship value) {
        this.ship = value;
    }

    /**
     * Gets the value of the shipLength property.
     * 
     * @return
     *     possible object is
     *     {@link ShipInfoType.ShipLength }
     *     
     */
    public ShipInfoType.ShipLength getShipLength() {
        return shipLength;
    }

    /**
     * Sets the value of the shipLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipInfoType.ShipLength }
     *     
     */
    public void setShipLength(ShipInfoType.ShipLength value) {
        this.shipLength = value;
    }

    /**
     * Gets the value of the shipVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link ShipInfoType.ShipVoltage }
     *     
     */
    public ShipInfoType.ShipVoltage getShipVoltage() {
        return shipVoltage;
    }

    /**
     * Sets the value of the shipVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipInfoType.ShipVoltage }
     *     
     */
    public void setShipVoltage(ShipInfoType.ShipVoltage value) {
        this.shipVoltage = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the shipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCode() {
        return shipCode;
    }

    /**
     * Sets the value of the shipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCode(String value) {
        this.shipCode = value;
    }

    /**
     * Gets the value of the shipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipName() {
        return shipName;
    }

    /**
     * Sets the value of the shipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipName(String value) {
        this.shipName = value;
    }

    /**
     * Gets the value of the vendorCodeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCodeContext() {
        return vendorCodeContext;
    }

    /**
     * Sets the value of the vendorCodeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCodeContext(String value) {
        this.vendorCodeContext = value;
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
     *       &lt;attribute name="StabilizedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RegistrationCountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
     *       &lt;attribute name="RestaurantQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="ElevatorQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaxCrewQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="MaxGuestQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="CruisingSpeed" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="MaxSpeed" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="InsideCabinQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="OutsideCabinQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="InauguralDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="RefurbishedDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="BuiltDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="NextRefurbishDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Ship {

        @XmlAttribute(name = "StabilizedIndicator")
        protected Boolean stabilizedIndicator;
        @XmlAttribute(name = "RegistrationCountryCode")
        protected String registrationCountryCode;
        @XmlAttribute(name = "RestaurantQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger restaurantQuantity;
        @XmlAttribute(name = "ElevatorQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger elevatorQuantity;
        @XmlAttribute(name = "MaxCrewQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxCrewQuantity;
        @XmlAttribute(name = "MaxGuestQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxGuestQuantity;
        @XmlAttribute(name = "CruisingSpeed")
        protected BigDecimal cruisingSpeed;
        @XmlAttribute(name = "MaxSpeed")
        protected BigDecimal maxSpeed;
        @XmlAttribute(name = "InsideCabinQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger insideCabinQuantity;
        @XmlAttribute(name = "OutsideCabinQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger outsideCabinQuantity;
        @XmlAttribute(name = "InauguralDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar inauguralDate;
        @XmlAttribute(name = "RefurbishedDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar refurbishedDate;
        @XmlAttribute(name = "BuiltDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar builtDate;
        @XmlAttribute(name = "NextRefurbishDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar nextRefurbishDate;

        /**
         * Gets the value of the stabilizedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isStabilizedIndicator() {
            return stabilizedIndicator;
        }

        /**
         * Sets the value of the stabilizedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setStabilizedIndicator(Boolean value) {
            this.stabilizedIndicator = value;
        }

        /**
         * Gets the value of the registrationCountryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationCountryCode() {
            return registrationCountryCode;
        }

        /**
         * Sets the value of the registrationCountryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationCountryCode(String value) {
            this.registrationCountryCode = value;
        }

        /**
         * Gets the value of the restaurantQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRestaurantQuantity() {
            return restaurantQuantity;
        }

        /**
         * Sets the value of the restaurantQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRestaurantQuantity(BigInteger value) {
            this.restaurantQuantity = value;
        }

        /**
         * Gets the value of the elevatorQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getElevatorQuantity() {
            return elevatorQuantity;
        }

        /**
         * Sets the value of the elevatorQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setElevatorQuantity(BigInteger value) {
            this.elevatorQuantity = value;
        }

        /**
         * Gets the value of the maxCrewQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxCrewQuantity() {
            return maxCrewQuantity;
        }

        /**
         * Sets the value of the maxCrewQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxCrewQuantity(BigInteger value) {
            this.maxCrewQuantity = value;
        }

        /**
         * Gets the value of the maxGuestQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxGuestQuantity() {
            return maxGuestQuantity;
        }

        /**
         * Sets the value of the maxGuestQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxGuestQuantity(BigInteger value) {
            this.maxGuestQuantity = value;
        }

        /**
         * Gets the value of the cruisingSpeed property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCruisingSpeed() {
            return cruisingSpeed;
        }

        /**
         * Sets the value of the cruisingSpeed property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCruisingSpeed(BigDecimal value) {
            this.cruisingSpeed = value;
        }

        /**
         * Gets the value of the maxSpeed property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxSpeed() {
            return maxSpeed;
        }

        /**
         * Sets the value of the maxSpeed property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxSpeed(BigDecimal value) {
            this.maxSpeed = value;
        }

        /**
         * Gets the value of the insideCabinQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInsideCabinQuantity() {
            return insideCabinQuantity;
        }

        /**
         * Sets the value of the insideCabinQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInsideCabinQuantity(BigInteger value) {
            this.insideCabinQuantity = value;
        }

        /**
         * Gets the value of the outsideCabinQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOutsideCabinQuantity() {
            return outsideCabinQuantity;
        }

        /**
         * Sets the value of the outsideCabinQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOutsideCabinQuantity(BigInteger value) {
            this.outsideCabinQuantity = value;
        }

        /**
         * Gets the value of the inauguralDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getInauguralDate() {
            return inauguralDate;
        }

        /**
         * Sets the value of the inauguralDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setInauguralDate(XMLGregorianCalendar value) {
            this.inauguralDate = value;
        }

        /**
         * Gets the value of the refurbishedDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRefurbishedDate() {
            return refurbishedDate;
        }

        /**
         * Sets the value of the refurbishedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRefurbishedDate(XMLGregorianCalendar value) {
            this.refurbishedDate = value;
        }

        /**
         * Gets the value of the builtDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBuiltDate() {
            return builtDate;
        }

        /**
         * Sets the value of the builtDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBuiltDate(XMLGregorianCalendar value) {
            this.builtDate = value;
        }

        /**
         * Gets the value of the nextRefurbishDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNextRefurbishDate() {
            return nextRefurbishDate;
        }

        /**
         * Sets the value of the nextRefurbishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNextRefurbishDate(XMLGregorianCalendar value) {
            this.nextRefurbishDate = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ShipLength {

        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * Gets the value of the unitOfMeasureQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * Sets the value of the unitOfMeasureQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * Gets the value of the unitOfMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * Sets the value of the unitOfMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

        /**
         * Gets the value of the unitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * Sets the value of the unitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ShipVoltage {

        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * Gets the value of the unitOfMeasureQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * Sets the value of the unitOfMeasureQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * Gets the value of the unitOfMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * Sets the value of the unitOfMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

        /**
         * Gets the value of the unitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * Sets the value of the unitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
        }

    }

}
