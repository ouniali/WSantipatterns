
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelLocalizacaoFiltro;


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
 *         &lt;element name="hotelLocalizacaoFiltro" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}HotelLocalizacaoFiltro" minOccurs="0"/>
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
    "hotelLocalizacaoFiltro"
})
@XmlRootElement(name = "ConsultarLocalizacao")
public class ConsultarLocalizacao {

    @XmlElementRef(name = "hotelLocalizacaoFiltro", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<HotelLocalizacaoFiltro> hotelLocalizacaoFiltro;

    /**
     * Gets the value of the hotelLocalizacaoFiltro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HotelLocalizacaoFiltro }{@code >}
     *     
     */
    public JAXBElement<HotelLocalizacaoFiltro> getHotelLocalizacaoFiltro() {
        return hotelLocalizacaoFiltro;
    }

    /**
     * Sets the value of the hotelLocalizacaoFiltro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HotelLocalizacaoFiltro }{@code >}
     *     
     */
    public void setHotelLocalizacaoFiltro(JAXBElement<HotelLocalizacaoFiltro> value) {
        this.hotelLocalizacaoFiltro = value;
    }

}
