
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RailAccommDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailAccommDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Seat" type="{http://www.opentravel.org/OTA/2003/05}SeatDetailType" minOccurs="0"/>
 *           &lt;element name="Berth" type="{http://www.opentravel.org/OTA/2003/05}BerthDetailType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Class" type="{http://www.opentravel.org/OTA/2003/05}AccommodationClass" minOccurs="0"/>
 *         &lt;element name="Compartment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompartmentType">
 *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}CompartmentPositionType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Car" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Deck" type="{http://www.opentravel.org/OTA/2003/05}DeckType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailAccommDetailType", propOrder = {
    "seat",
    "berth",
    "clazz",
    "compartment",
    "car"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.RailPrefType.AccommodationPref.class
})
public class RailAccommDetailType {

    @XmlElement(name = "Seat")
    protected SeatDetailType seat;
    @XmlElement(name = "Berth")
    protected BerthDetailType berth;
    @XmlElement(name = "Class")
    protected AccommodationClass clazz;
    @XmlElement(name = "Compartment")
    protected RailAccommDetailType.Compartment compartment;
    @XmlElement(name = "Car")
    protected RailAccommDetailType.Car car;
    @XmlAttribute(name = "Deck")
    protected DeckType deck;

    /**
     * Gets the value of the seat property.
     * 
     * @return
     *     possible object is
     *     {@link SeatDetailType }
     *     
     */
    public SeatDetailType getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDetailType }
     *     
     */
    public void setSeat(SeatDetailType value) {
        this.seat = value;
    }

    /**
     * Gets the value of the berth property.
     * 
     * @return
     *     possible object is
     *     {@link BerthDetailType }
     *     
     */
    public BerthDetailType getBerth() {
        return berth;
    }

    /**
     * Sets the value of the berth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerthDetailType }
     *     
     */
    public void setBerth(BerthDetailType value) {
        this.berth = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationClass }
     *     
     */
    public AccommodationClass getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationClass }
     *     
     */
    public void setClazz(AccommodationClass value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the compartment property.
     * 
     * @return
     *     possible object is
     *     {@link RailAccommDetailType.Compartment }
     *     
     */
    public RailAccommDetailType.Compartment getCompartment() {
        return compartment;
    }

    /**
     * Sets the value of the compartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailAccommDetailType.Compartment }
     *     
     */
    public void setCompartment(RailAccommDetailType.Compartment value) {
        this.compartment = value;
    }

    /**
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link RailAccommDetailType.Car }
     *     
     */
    public RailAccommDetailType.Car getCar() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailAccommDetailType.Car }
     *     
     */
    public void setCar(RailAccommDetailType.Car value) {
        this.car = value;
    }

    /**
     * Gets the value of the deck property.
     * 
     * @return
     *     possible object is
     *     {@link DeckType }
     *     
     */
    public DeckType getDeck() {
        return deck;
    }

    /**
     * Sets the value of the deck property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckType }
     *     
     */
    public void setDeck(DeckType value) {
        this.deck = value;
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
     *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Car {

        @XmlAttribute(name = "Number")
        protected String number;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompartmentType">
     *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}CompartmentPositionType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Compartment
        extends CompartmentType
    {

        @XmlAttribute(name = "Number")
        protected String number;
        @XmlAttribute(name = "Position")
        protected CompartmentPositionType position;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link CompartmentPositionType }
         *     
         */
        public CompartmentPositionType getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompartmentPositionType }
         *     
         */
        public void setPosition(CompartmentPositionType value) {
            this.position = value;
        }

    }

}
