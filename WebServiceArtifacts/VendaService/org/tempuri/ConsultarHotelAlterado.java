
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelAlteradoFiltro;


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
 *         &lt;element name="hotelAlteradoFiltro" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}HotelAlteradoFiltro" minOccurs="0"/>
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
    "hotelAlteradoFiltro"
})
@XmlRootElement(name = "ConsultarHotelAlterado")
public class ConsultarHotelAlterado {

    @XmlElementRef(name = "hotelAlteradoFiltro", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<HotelAlteradoFiltro> hotelAlteradoFiltro;

    /**
     * Gets the value of the hotelAlteradoFiltro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HotelAlteradoFiltro }{@code >}
     *     
     */
    public JAXBElement<HotelAlteradoFiltro> getHotelAlteradoFiltro() {
        return hotelAlteradoFiltro;
    }

    /**
     * Sets the value of the hotelAlteradoFiltro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HotelAlteradoFiltro }{@code >}
     *     
     */
    public void setHotelAlteradoFiltro(JAXBElement<HotelAlteradoFiltro> value) {
        this.hotelAlteradoFiltro = value;
    }

}
