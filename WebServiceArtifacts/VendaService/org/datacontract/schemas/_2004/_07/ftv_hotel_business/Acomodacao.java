
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Acomodacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Acomodacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoAcomodacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NomeAcomodacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tarifas" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfTarifa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acomodacao", propOrder = {
    "codigoAcomodacao",
    "nomeAcomodacao",
    "tarifas"
})
public class Acomodacao {

    @XmlElementRef(name = "CodigoAcomodacao", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codigoAcomodacao;
    @XmlElementRef(name = "NomeAcomodacao", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeAcomodacao;
    @XmlElementRef(name = "Tarifas", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTarifa> tarifas;

    /**
     * Gets the value of the codigoAcomodacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodigoAcomodacao() {
        return codigoAcomodacao;
    }

    /**
     * Sets the value of the codigoAcomodacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodigoAcomodacao(JAXBElement<Long> value) {
        this.codigoAcomodacao = value;
    }

    /**
     * Gets the value of the nomeAcomodacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeAcomodacao() {
        return nomeAcomodacao;
    }

    /**
     * Sets the value of the nomeAcomodacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeAcomodacao(JAXBElement<String> value) {
        this.nomeAcomodacao = value;
    }

    /**
     * Gets the value of the tarifas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTarifa }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTarifa> getTarifas() {
        return tarifas;
    }

    /**
     * Sets the value of the tarifas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTarifa }{@code >}
     *     
     */
    public void setTarifas(JAXBElement<ArrayOfTarifa> value) {
        this.tarifas = value;
    }

}
