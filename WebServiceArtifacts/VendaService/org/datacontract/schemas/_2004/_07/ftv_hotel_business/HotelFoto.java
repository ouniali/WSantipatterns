
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelFoto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelFoto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelFotoLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelFotoOrdem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HotelFotoTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelFotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelFoto", propOrder = {
    "hotelFotoLink",
    "hotelFotoOrdem",
    "hotelFotoTitulo",
    "hotelFotoUrl"
})
public class HotelFoto {

    @XmlElementRef(name = "HotelFotoLink", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelFotoLink;
    @XmlElementRef(name = "HotelFotoOrdem", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> hotelFotoOrdem;
    @XmlElementRef(name = "HotelFotoTitulo", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelFotoTitulo;
    @XmlElementRef(name = "HotelFotoUrl", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelFotoUrl;

    /**
     * Gets the value of the hotelFotoLink property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelFotoLink() {
        return hotelFotoLink;
    }

    /**
     * Sets the value of the hotelFotoLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelFotoLink(JAXBElement<String> value) {
        this.hotelFotoLink = value;
    }

    /**
     * Gets the value of the hotelFotoOrdem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getHotelFotoOrdem() {
        return hotelFotoOrdem;
    }

    /**
     * Sets the value of the hotelFotoOrdem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setHotelFotoOrdem(JAXBElement<Long> value) {
        this.hotelFotoOrdem = value;
    }

    /**
     * Gets the value of the hotelFotoTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelFotoTitulo() {
        return hotelFotoTitulo;
    }

    /**
     * Sets the value of the hotelFotoTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelFotoTitulo(JAXBElement<String> value) {
        this.hotelFotoTitulo = value;
    }

    /**
     * Gets the value of the hotelFotoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelFotoUrl() {
        return hotelFotoUrl;
    }

    /**
     * Sets the value of the hotelFotoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelFotoUrl(JAXBElement<String> value) {
        this.hotelFotoUrl = value;
    }

}
