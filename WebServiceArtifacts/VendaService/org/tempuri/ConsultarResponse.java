
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelRetorno;


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
 *         &lt;element name="ConsultarResult" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}HotelRetorno" minOccurs="0"/>
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
    "consultarResult"
})
@XmlRootElement(name = "ConsultarResponse")
public class ConsultarResponse {

    @XmlElementRef(name = "ConsultarResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<HotelRetorno> consultarResult;

    /**
     * Gets the value of the consultarResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HotelRetorno }{@code >}
     *     
     */
    public JAXBElement<HotelRetorno> getConsultarResult() {
        return consultarResult;
    }

    /**
     * Sets the value of the consultarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HotelRetorno }{@code >}
     *     
     */
    public void setConsultarResult(JAXBElement<HotelRetorno> value) {
        this.consultarResult = value;
    }

}
