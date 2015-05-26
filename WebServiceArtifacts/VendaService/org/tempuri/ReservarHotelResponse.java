
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ReservaRetorno;


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
 *         &lt;element name="ReservarHotelResult" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ReservaRetorno" minOccurs="0"/>
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
    "reservarHotelResult"
})
@XmlRootElement(name = "ReservarHotelResponse")
public class ReservarHotelResponse {

    @XmlElementRef(name = "ReservarHotelResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReservaRetorno> reservarHotelResult;

    /**
     * Gets the value of the reservarHotelResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReservaRetorno }{@code >}
     *     
     */
    public JAXBElement<ReservaRetorno> getReservarHotelResult() {
        return reservarHotelResult;
    }

    /**
     * Sets the value of the reservarHotelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReservaRetorno }{@code >}
     *     
     */
    public void setReservarHotelResult(JAXBElement<ReservaRetorno> value) {
        this.reservarHotelResult = value;
    }

}
