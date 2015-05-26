
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ArrayOfHotelCodigo;


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
 *         &lt;element name="ConsultarHotelAlteradoResult" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfHotelCodigo" minOccurs="0"/>
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
    "consultarHotelAlteradoResult"
})
@XmlRootElement(name = "ConsultarHotelAlteradoResponse")
public class ConsultarHotelAlteradoResponse {

    @XmlElementRef(name = "ConsultarHotelAlteradoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHotelCodigo> consultarHotelAlteradoResult;

    /**
     * Gets the value of the consultarHotelAlteradoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelCodigo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHotelCodigo> getConsultarHotelAlteradoResult() {
        return consultarHotelAlteradoResult;
    }

    /**
     * Sets the value of the consultarHotelAlteradoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelCodigo }{@code >}
     *     
     */
    public void setConsultarHotelAlteradoResult(JAXBElement<ArrayOfHotelCodigo> value) {
        this.consultarHotelAlteradoResult = value;
    }

}
