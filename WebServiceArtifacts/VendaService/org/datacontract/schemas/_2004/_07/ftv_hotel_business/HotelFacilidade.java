
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelFacilidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelFacilidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Facilidades" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfHotelFacilidadeConteudo" minOccurs="0"/>
 *         &lt;element name="TituloFacilidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelFacilidade", propOrder = {
    "facilidades",
    "tituloFacilidade"
})
public class HotelFacilidade {

    @XmlElementRef(name = "Facilidades", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHotelFacilidadeConteudo> facilidades;
    @XmlElementRef(name = "TituloFacilidade", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tituloFacilidade;

    /**
     * Gets the value of the facilidades property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelFacilidadeConteudo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHotelFacilidadeConteudo> getFacilidades() {
        return facilidades;
    }

    /**
     * Sets the value of the facilidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelFacilidadeConteudo }{@code >}
     *     
     */
    public void setFacilidades(JAXBElement<ArrayOfHotelFacilidadeConteudo> value) {
        this.facilidades = value;
    }

    /**
     * Gets the value of the tituloFacilidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTituloFacilidade() {
        return tituloFacilidade;
    }

    /**
     * Sets the value of the tituloFacilidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTituloFacilidade(JAXBElement<String> value) {
        this.tituloFacilidade = value;
    }

}
