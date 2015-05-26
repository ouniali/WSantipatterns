
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_shared.BaseData;


/**
 * <p>Java class for HotelRetorno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRetorno">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/FTV.Shared.Business}BaseData">
 *       &lt;sequence>
 *         &lt;element name="CodigoConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoIdioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsultaFinalizada" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Hoteis" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfHotel" minOccurs="0"/>
 *         &lt;element name="SiglaIdioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRetorno", propOrder = {
    "codigoConsulta",
    "codigoIdioma",
    "consultaFinalizada",
    "hoteis",
    "siglaIdioma"
})
public class HotelRetorno
    extends BaseData
{

    @XmlElementRef(name = "CodigoConsulta", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoConsulta;
    @XmlElementRef(name = "CodigoIdioma", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoIdioma;
    @XmlElement(name = "ConsultaFinalizada")
    protected Boolean consultaFinalizada;
    @XmlElementRef(name = "Hoteis", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHotel> hoteis;
    @XmlElementRef(name = "SiglaIdioma", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaIdioma;

    /**
     * Gets the value of the codigoConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoConsulta() {
        return codigoConsulta;
    }

    /**
     * Sets the value of the codigoConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoConsulta(JAXBElement<String> value) {
        this.codigoConsulta = value;
    }

    /**
     * Gets the value of the codigoIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoIdioma() {
        return codigoIdioma;
    }

    /**
     * Sets the value of the codigoIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoIdioma(JAXBElement<String> value) {
        this.codigoIdioma = value;
    }

    /**
     * Gets the value of the consultaFinalizada property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsultaFinalizada() {
        return consultaFinalizada;
    }

    /**
     * Sets the value of the consultaFinalizada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsultaFinalizada(Boolean value) {
        this.consultaFinalizada = value;
    }

    /**
     * Gets the value of the hoteis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHotel> getHoteis() {
        return hoteis;
    }

    /**
     * Sets the value of the hoteis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotel }{@code >}
     *     
     */
    public void setHoteis(JAXBElement<ArrayOfHotel> value) {
        this.hoteis = value;
    }

    /**
     * Gets the value of the siglaIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaIdioma() {
        return siglaIdioma;
    }

    /**
     * Sets the value of the siglaIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaIdioma(JAXBElement<String> value) {
        this.siglaIdioma = value;
    }

}
