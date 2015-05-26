
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApartamentoFiltro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApartamentoFiltro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoApartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndicadorCamaCasal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Passageiros" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfPassageiroFiltro" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApartamentoFiltro", propOrder = {
    "codigoApartamento",
    "indicadorCamaCasal",
    "passageiros"
})
public class ApartamentoFiltro {

    @XmlElementRef(name = "CodigoApartamento", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoApartamento;
    @XmlElementRef(name = "IndicadorCamaCasal", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorCamaCasal;
    @XmlElementRef(name = "Passageiros", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPassageiroFiltro> passageiros;

    /**
     * Gets the value of the codigoApartamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoApartamento() {
        return codigoApartamento;
    }

    /**
     * Sets the value of the codigoApartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoApartamento(JAXBElement<String> value) {
        this.codigoApartamento = value;
    }

    /**
     * Gets the value of the indicadorCamaCasal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorCamaCasal() {
        return indicadorCamaCasal;
    }

    /**
     * Sets the value of the indicadorCamaCasal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorCamaCasal(JAXBElement<String> value) {
        this.indicadorCamaCasal = value;
    }

    /**
     * Gets the value of the passageiros property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassageiroFiltro }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPassageiroFiltro> getPassageiros() {
        return passageiros;
    }

    /**
     * Sets the value of the passageiros property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassageiroFiltro }{@code >}
     *     
     */
    public void setPassageiros(JAXBElement<ArrayOfPassageiroFiltro> value) {
        this.passageiros = value;
    }

}
