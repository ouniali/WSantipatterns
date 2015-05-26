
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TourHotelVariant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourHotelVariant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Meal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="QuotaState_FlightArrival" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaState" minOccurs="0"/>
 *         &lt;element name="QuotaState_FlightArrival_B" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaState" minOccurs="0"/>
 *         &lt;element name="QuotaState_FlightDeparture" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaState" minOccurs="0"/>
 *         &lt;element name="QuotaState_FlightDeparture_B" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaState" minOccurs="0"/>
 *         &lt;element name="QuotaState_Hotel" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaState" minOccurs="0"/>
 *         &lt;element name="RoomCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TourPrice" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}TourPriceEx" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourHotelVariant", propOrder = {
    "meal",
    "price",
    "quotaStateFlightArrival",
    "quotaStateFlightArrivalB",
    "quotaStateFlightDeparture",
    "quotaStateFlightDepartureB",
    "quotaStateHotel",
    "roomCategory",
    "roomType",
    "tourPrice"
})
public class TourHotelVariant {

    @XmlElementRef(name = "Meal", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> meal;
    @XmlElement(name = "Price")
    protected Double price;
    @XmlElement(name = "QuotaState_FlightArrival")
    @XmlSchemaType(name = "string")
    protected QuotaState quotaStateFlightArrival;
    @XmlElement(name = "QuotaState_FlightArrival_B")
    @XmlSchemaType(name = "string")
    protected QuotaState quotaStateFlightArrivalB;
    @XmlElement(name = "QuotaState_FlightDeparture")
    @XmlSchemaType(name = "string")
    protected QuotaState quotaStateFlightDeparture;
    @XmlElement(name = "QuotaState_FlightDeparture_B")
    @XmlSchemaType(name = "string")
    protected QuotaState quotaStateFlightDepartureB;
    @XmlElement(name = "QuotaState_Hotel")
    @XmlSchemaType(name = "string")
    protected QuotaState quotaStateHotel;
    @XmlElementRef(name = "RoomCategory", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomCategory;
    @XmlElementRef(name = "RoomType", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomType;
    @XmlElementRef(name = "TourPrice", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<TourPriceEx> tourPrice;

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeal() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeal(JAXBElement<String> value) {
        this.meal = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrice(Double value) {
        this.price = value;
    }

    /**
     * Gets the value of the quotaStateFlightArrival property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaState }
     *     
     */
    public QuotaState getQuotaStateFlightArrival() {
        return quotaStateFlightArrival;
    }

    /**
     * Sets the value of the quotaStateFlightArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaState }
     *     
     */
    public void setQuotaStateFlightArrival(QuotaState value) {
        this.quotaStateFlightArrival = value;
    }

    /**
     * Gets the value of the quotaStateFlightArrivalB property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaState }
     *     
     */
    public QuotaState getQuotaStateFlightArrivalB() {
        return quotaStateFlightArrivalB;
    }

    /**
     * Sets the value of the quotaStateFlightArrivalB property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaState }
     *     
     */
    public void setQuotaStateFlightArrivalB(QuotaState value) {
        this.quotaStateFlightArrivalB = value;
    }

    /**
     * Gets the value of the quotaStateFlightDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaState }
     *     
     */
    public QuotaState getQuotaStateFlightDeparture() {
        return quotaStateFlightDeparture;
    }

    /**
     * Sets the value of the quotaStateFlightDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaState }
     *     
     */
    public void setQuotaStateFlightDeparture(QuotaState value) {
        this.quotaStateFlightDeparture = value;
    }

    /**
     * Gets the value of the quotaStateFlightDepartureB property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaState }
     *     
     */
    public QuotaState getQuotaStateFlightDepartureB() {
        return quotaStateFlightDepartureB;
    }

    /**
     * Sets the value of the quotaStateFlightDepartureB property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaState }
     *     
     */
    public void setQuotaStateFlightDepartureB(QuotaState value) {
        this.quotaStateFlightDepartureB = value;
    }

    /**
     * Gets the value of the quotaStateHotel property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaState }
     *     
     */
    public QuotaState getQuotaStateHotel() {
        return quotaStateHotel;
    }

    /**
     * Sets the value of the quotaStateHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaState }
     *     
     */
    public void setQuotaStateHotel(QuotaState value) {
        this.quotaStateHotel = value;
    }

    /**
     * Gets the value of the roomCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomCategory() {
        return roomCategory;
    }

    /**
     * Sets the value of the roomCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomCategory(JAXBElement<String> value) {
        this.roomCategory = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomType(JAXBElement<String> value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the tourPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TourPriceEx }{@code >}
     *     
     */
    public JAXBElement<TourPriceEx> getTourPrice() {
        return tourPrice;
    }

    /**
     * Sets the value of the tourPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TourPriceEx }{@code >}
     *     
     */
    public void setTourPrice(JAXBElement<TourPriceEx> value) {
        this.tourPrice = value;
    }

}
