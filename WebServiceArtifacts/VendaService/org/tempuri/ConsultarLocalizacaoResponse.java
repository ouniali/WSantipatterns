
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ArrayOfHotelLocalizacao;


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
 *         &lt;element name="ConsultarLocalizacaoResult" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfHotelLocalizacao" minOccurs="0"/>
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
    "consultarLocalizacaoResult"
})
@XmlRootElement(name = "ConsultarLocalizacaoResponse")
public class ConsultarLocalizacaoResponse {

    @XmlElementRef(name = "ConsultarLocalizacaoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHotelLocalizacao> consultarLocalizacaoResult;

    /**
     * Gets the value of the consultarLocalizacaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelLocalizacao }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHotelLocalizacao> getConsultarLocalizacaoResult() {
        return consultarLocalizacaoResult;
    }

    /**
     * Sets the value of the consultarLocalizacaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelLocalizacao }{@code >}
     *     
     */
    public void setConsultarLocalizacaoResult(JAXBElement<ArrayOfHotelLocalizacao> value) {
        this.consultarLocalizacaoResult = value;
    }

}
