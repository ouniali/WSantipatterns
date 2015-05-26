
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelCodigo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelCodigo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoHotel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelCodigo", propOrder = {
    "codigoHotel"
})
public class HotelCodigo {

    @XmlElementRef(name = "CodigoHotel", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codigoHotel;

    /**
     * Gets the value of the codigoHotel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodigoHotel() {
        return codigoHotel;
    }

    /**
     * Sets the value of the codigoHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodigoHotel(JAXBElement<Long> value) {
        this.codigoHotel = value;
    }

}
