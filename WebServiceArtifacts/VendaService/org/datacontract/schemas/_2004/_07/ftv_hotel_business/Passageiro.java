
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Passageiro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Passageiro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoPassageiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataNascimentoPassageiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Documentos" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfPassageiroDocumento" minOccurs="0"/>
 *         &lt;element name="IdadePassageiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomePassageiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SexoPassageiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SobrenomePassageiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Passageiro", propOrder = {
    "codigoPassageiro",
    "dataNascimentoPassageiro",
    "documentos",
    "idadePassageiro",
    "nomePassageiro",
    "sexoPassageiro",
    "sobrenomePassageiro"
})
public class Passageiro {

    @XmlElementRef(name = "CodigoPassageiro", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPassageiro;
    @XmlElementRef(name = "DataNascimentoPassageiro", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataNascimentoPassageiro;
    @XmlElementRef(name = "Documentos", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPassageiroDocumento> documentos;
    @XmlElementRef(name = "IdadePassageiro", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idadePassageiro;
    @XmlElementRef(name = "NomePassageiro", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomePassageiro;
    @XmlElementRef(name = "SexoPassageiro", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sexoPassageiro;
    @XmlElementRef(name = "SobrenomePassageiro", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sobrenomePassageiro;

    /**
     * Gets the value of the codigoPassageiro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPassageiro() {
        return codigoPassageiro;
    }

    /**
     * Sets the value of the codigoPassageiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPassageiro(JAXBElement<String> value) {
        this.codigoPassageiro = value;
    }

    /**
     * Gets the value of the dataNascimentoPassageiro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataNascimentoPassageiro() {
        return dataNascimentoPassageiro;
    }

    /**
     * Sets the value of the dataNascimentoPassageiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataNascimentoPassageiro(JAXBElement<String> value) {
        this.dataNascimentoPassageiro = value;
    }

    /**
     * Gets the value of the documentos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassageiroDocumento }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPassageiroDocumento> getDocumentos() {
        return documentos;
    }

    /**
     * Sets the value of the documentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassageiroDocumento }{@code >}
     *     
     */
    public void setDocumentos(JAXBElement<ArrayOfPassageiroDocumento> value) {
        this.documentos = value;
    }

    /**
     * Gets the value of the idadePassageiro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdadePassageiro() {
        return idadePassageiro;
    }

    /**
     * Sets the value of the idadePassageiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdadePassageiro(JAXBElement<String> value) {
        this.idadePassageiro = value;
    }

    /**
     * Gets the value of the nomePassageiro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomePassageiro() {
        return nomePassageiro;
    }

    /**
     * Sets the value of the nomePassageiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomePassageiro(JAXBElement<String> value) {
        this.nomePassageiro = value;
    }

    /**
     * Gets the value of the sexoPassageiro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSexoPassageiro() {
        return sexoPassageiro;
    }

    /**
     * Sets the value of the sexoPassageiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSexoPassageiro(JAXBElement<String> value) {
        this.sexoPassageiro = value;
    }

    /**
     * Gets the value of the sobrenomePassageiro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSobrenomePassageiro() {
        return sobrenomePassageiro;
    }

    /**
     * Sets the value of the sobrenomePassageiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSobrenomePassageiro(JAXBElement<String> value) {
        this.sobrenomePassageiro = value;
    }

}
