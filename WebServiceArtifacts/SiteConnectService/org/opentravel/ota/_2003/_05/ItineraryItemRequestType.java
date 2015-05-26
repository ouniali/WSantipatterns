
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryItemRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryItemRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Accommodation" type="{http://www.opentravel.org/OTA/2003/05}AccommodationSegmentRequestType"/>
 *         &lt;element name="Flight" type="{http://www.opentravel.org/OTA/2003/05}PkgFlightSegmentType"/>
 *         &lt;element name="RentalCar">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType">
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryItemRequestType", propOrder = {
    "accommodation",
    "flight",
    "rentalCar"
})
public class ItineraryItemRequestType {

    @XmlElement(name = "Accommodation")
    protected AccommodationSegmentRequestType accommodation;
    @XmlElement(name = "Flight")
    protected PkgFlightSegmentType flight;
    @XmlElement(name = "RentalCar")
    protected ItineraryItemRequestType.RentalCar rentalCar;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the accommodation property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationSegmentRequestType }
     *     
     */
    public AccommodationSegmentRequestType getAccommodation() {
        return accommodation;
    }

    /**
     * Sets the value of the accommodation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationSegmentRequestType }
     *     
     */
    public void setAccommodation(AccommodationSegmentRequestType value) {
        this.accommodation = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link PkgFlightSegmentType }
     *     
     */
    public PkgFlightSegmentType getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PkgFlightSegmentType }
     *     
     */
    public void setFlight(PkgFlightSegmentType value) {
        this.flight = value;
    }

    /**
     * Gets the value of the rentalCar property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryItemRequestType.RentalCar }
     *     
     */
    public ItineraryItemRequestType.RentalCar getRentalCar() {
        return rentalCar;
    }

    /**
     * Sets the value of the rentalCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryItemRequestType.RentalCar }
     *     
     */
    public void setRentalCar(ItineraryItemRequestType.RentalCar value) {
        this.rentalCar = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType">
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RentalCar
        extends VehicleRentalCoreType
    {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

    }

}
