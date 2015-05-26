
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mouzenidis_services_objects.Hotel;


/**
 * <p>Java class for TourHotelGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourHotelGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hotel" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}Hotel" minOccurs="0"/>
 *         &lt;element name="HotelKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TourHotelVariants" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}ArrayOfTourHotelVariant" minOccurs="0"/>
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
@XmlType(name = "TourHotelGroup", propOrder = {
    "hotel",
    "hotelKey",
    "tourHotelVariants",
    "tourPrice"
})
public class TourHotelGroup {

    @XmlElementRef(name = "Hotel", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<Hotel> hotel;
    @XmlElement(name = "HotelKey")
    protected Integer hotelKey;
    @XmlElementRef(name = "TourHotelVariants", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTourHotelVariant> tourHotelVariants;
    @XmlElementRef(name = "TourPrice", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<TourPriceEx> tourPrice;

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Hotel }{@code >}
     *     
     */
    public JAXBElement<Hotel> getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Hotel }{@code >}
     *     
     */
    public void setHotel(JAXBElement<Hotel> value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the hotelKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelKey() {
        return hotelKey;
    }

    /**
     * Sets the value of the hotelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelKey(Integer value) {
        this.hotelKey = value;
    }

    /**
     * Gets the value of the tourHotelVariants property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTourHotelVariant }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTourHotelVariant> getTourHotelVariants() {
        return tourHotelVariants;
    }

    /**
     * Sets the value of the tourHotelVariants property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTourHotelVariant }{@code >}
     *     
     */
    public void setTourHotelVariants(JAXBElement<ArrayOfTourHotelVariant> value) {
        this.tourHotelVariants = value;
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
