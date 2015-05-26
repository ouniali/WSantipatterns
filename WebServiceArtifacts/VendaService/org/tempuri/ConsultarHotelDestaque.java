
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelDestaque;


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
 *         &lt;element name="hotelDestaque" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}HotelDestaque" minOccurs="0"/>
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
    "hotelDestaque"
})
@XmlRootElement(name = "ConsultarHotelDestaque")
public class ConsultarHotelDestaque {

    @XmlElementRef(name = "hotelDestaque", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<HotelDestaque> hotelDestaque;

    /**
     * Gets the value of the hotelDestaque property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HotelDestaque }{@code >}
     *     
     */
    public JAXBElement<HotelDestaque> getHotelDestaque() {
        return hotelDestaque;
    }

    /**
     * Sets the value of the hotelDestaque property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HotelDestaque }{@code >}
     *     
     */
    public void setHotelDestaque(JAXBElement<HotelDestaque> value) {
        this.hotelDestaque = value;
    }

}
