
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_shared.BaseData;


/**
 * <p>Java class for Hotel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hotel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/FTV.Shared.Business}BaseData">
 *       &lt;sequence>
 *         &lt;element name="Acomodacoes" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfAcomodacao" minOccurs="0"/>
 *         &lt;element name="Broker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoHotel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CodigoIsoMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoMoeda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DescricaoHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelFacilidades" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfHotelFacilidade" minOccurs="0"/>
 *         &lt;element name="HotelFotos" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfHotelFoto" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomePais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroEstrelas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Provedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiglaEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiglaMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiglaPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorDiaria" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ValorDiariaFinal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hotel", propOrder = {
    "acomodacoes",
    "broker",
    "categoria",
    "cep",
    "codigoHotel",
    "codigoIsoMoeda",
    "codigoMoeda",
    "descricaoHotel",
    "endereco",
    "hotelFacilidades",
    "hotelFotos",
    "latitude",
    "longitude",
    "nomeCidade",
    "nomeEstado",
    "nomeHotel",
    "nomePais",
    "numeroEstrelas",
    "provedor",
    "siglaEstado",
    "siglaMoeda",
    "siglaPais",
    "telefone",
    "valorDiaria",
    "valorDiariaFinal"
})
public class Hotel
    extends BaseData
{

    @XmlElementRef(name = "Acomodacoes", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAcomodacao> acomodacoes;
    @XmlElementRef(name = "Broker", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> broker;
    @XmlElementRef(name = "Categoria", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> categoria;
    @XmlElementRef(name = "Cep", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cep;
    @XmlElementRef(name = "CodigoHotel", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codigoHotel;
    @XmlElementRef(name = "CodigoIsoMoeda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoIsoMoeda;
    @XmlElementRef(name = "CodigoMoeda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codigoMoeda;
    @XmlElementRef(name = "DescricaoHotel", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descricaoHotel;
    @XmlElementRef(name = "Endereco", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endereco;
    @XmlElementRef(name = "HotelFacilidades", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHotelFacilidade> hotelFacilidades;
    @XmlElementRef(name = "HotelFotos", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHotelFoto> hotelFotos;
    @XmlElementRef(name = "Latitude", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> latitude;
    @XmlElementRef(name = "Longitude", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longitude;
    @XmlElementRef(name = "NomeCidade", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeCidade;
    @XmlElementRef(name = "NomeEstado", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeEstado;
    @XmlElementRef(name = "NomeHotel", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeHotel;
    @XmlElementRef(name = "NomePais", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomePais;
    @XmlElement(name = "NumeroEstrelas")
    protected BigDecimal numeroEstrelas;
    @XmlElementRef(name = "Provedor", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provedor;
    @XmlElementRef(name = "SiglaEstado", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaEstado;
    @XmlElementRef(name = "SiglaMoeda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaMoeda;
    @XmlElementRef(name = "SiglaPais", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaPais;
    @XmlElementRef(name = "Telefone", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefone;
    @XmlElement(name = "ValorDiaria")
    protected BigDecimal valorDiaria;
    @XmlElement(name = "ValorDiariaFinal")
    protected BigDecimal valorDiariaFinal;

    /**
     * Gets the value of the acomodacoes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAcomodacao }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAcomodacao> getAcomodacoes() {
        return acomodacoes;
    }

    /**
     * Sets the value of the acomodacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAcomodacao }{@code >}
     *     
     */
    public void setAcomodacoes(JAXBElement<ArrayOfAcomodacao> value) {
        this.acomodacoes = value;
    }

    /**
     * Gets the value of the broker property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBroker() {
        return broker;
    }

    /**
     * Sets the value of the broker property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBroker(JAXBElement<String> value) {
        this.broker = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoria(JAXBElement<String> value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the cep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCep() {
        return cep;
    }

    /**
     * Sets the value of the cep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCep(JAXBElement<String> value) {
        this.cep = value;
    }

    /**
     * Gets the value of the codigoHotel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodigoHotel() {
        return codigoHotel;
    }

    /**
     * Sets the value of the codigoHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodigoHotel(JAXBElement<Long> value) {
        this.codigoHotel = value;
    }

    /**
     * Gets the value of the codigoIsoMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoIsoMoeda() {
        return codigoIsoMoeda;
    }

    /**
     * Sets the value of the codigoIsoMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoIsoMoeda(JAXBElement<String> value) {
        this.codigoIsoMoeda = value;
    }

    /**
     * Gets the value of the codigoMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodigoMoeda() {
        return codigoMoeda;
    }

    /**
     * Sets the value of the codigoMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodigoMoeda(JAXBElement<Long> value) {
        this.codigoMoeda = value;
    }

    /**
     * Gets the value of the descricaoHotel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescricaoHotel() {
        return descricaoHotel;
    }

    /**
     * Sets the value of the descricaoHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescricaoHotel(JAXBElement<String> value) {
        this.descricaoHotel = value;
    }

    /**
     * Gets the value of the endereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndereco() {
        return endereco;
    }

    /**
     * Sets the value of the endereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndereco(JAXBElement<String> value) {
        this.endereco = value;
    }

    /**
     * Gets the value of the hotelFacilidades property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelFacilidade }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHotelFacilidade> getHotelFacilidades() {
        return hotelFacilidades;
    }

    /**
     * Sets the value of the hotelFacilidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelFacilidade }{@code >}
     *     
     */
    public void setHotelFacilidades(JAXBElement<ArrayOfHotelFacilidade> value) {
        this.hotelFacilidades = value;
    }

    /**
     * Gets the value of the hotelFotos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelFoto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHotelFoto> getHotelFotos() {
        return hotelFotos;
    }

    /**
     * Sets the value of the hotelFotos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelFoto }{@code >}
     *     
     */
    public void setHotelFotos(JAXBElement<ArrayOfHotelFoto> value) {
        this.hotelFotos = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLatitude(JAXBElement<String> value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongitude(JAXBElement<String> value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the nomeCidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeCidade() {
        return nomeCidade;
    }

    /**
     * Sets the value of the nomeCidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeCidade(JAXBElement<String> value) {
        this.nomeCidade = value;
    }

    /**
     * Gets the value of the nomeEstado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeEstado() {
        return nomeEstado;
    }

    /**
     * Sets the value of the nomeEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeEstado(JAXBElement<String> value) {
        this.nomeEstado = value;
    }

    /**
     * Gets the value of the nomeHotel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeHotel() {
        return nomeHotel;
    }

    /**
     * Sets the value of the nomeHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeHotel(JAXBElement<String> value) {
        this.nomeHotel = value;
    }

    /**
     * Gets the value of the nomePais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomePais() {
        return nomePais;
    }

    /**
     * Sets the value of the nomePais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomePais(JAXBElement<String> value) {
        this.nomePais = value;
    }

    /**
     * Gets the value of the numeroEstrelas property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroEstrelas() {
        return numeroEstrelas;
    }

    /**
     * Sets the value of the numeroEstrelas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroEstrelas(BigDecimal value) {
        this.numeroEstrelas = value;
    }

    /**
     * Gets the value of the provedor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvedor() {
        return provedor;
    }

    /**
     * Sets the value of the provedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvedor(JAXBElement<String> value) {
        this.provedor = value;
    }

    /**
     * Gets the value of the siglaEstado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaEstado() {
        return siglaEstado;
    }

    /**
     * Sets the value of the siglaEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaEstado(JAXBElement<String> value) {
        this.siglaEstado = value;
    }

    /**
     * Gets the value of the siglaMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaMoeda() {
        return siglaMoeda;
    }

    /**
     * Sets the value of the siglaMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaMoeda(JAXBElement<String> value) {
        this.siglaMoeda = value;
    }

    /**
     * Gets the value of the siglaPais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaPais() {
        return siglaPais;
    }

    /**
     * Sets the value of the siglaPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaPais(JAXBElement<String> value) {
        this.siglaPais = value;
    }

    /**
     * Gets the value of the telefone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefone() {
        return telefone;
    }

    /**
     * Sets the value of the telefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefone(JAXBElement<String> value) {
        this.telefone = value;
    }

    /**
     * Gets the value of the valorDiaria property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDiaria() {
        return valorDiaria;
    }

    /**
     * Sets the value of the valorDiaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDiaria(BigDecimal value) {
        this.valorDiaria = value;
    }

    /**
     * Gets the value of the valorDiariaFinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDiariaFinal() {
        return valorDiariaFinal;
    }

    /**
     * Sets the value of the valorDiariaFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDiariaFinal(BigDecimal value) {
        this.valorDiariaFinal = value;
    }

}
