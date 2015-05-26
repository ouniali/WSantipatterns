
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CosultaFiltro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CosultaFiltro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Apartamentos" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfApartamentoFiltro" minOccurs="0"/>
 *         &lt;element name="Assincrono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNPJCPFAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNPJCPFEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNPJCPFVendedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoContinente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoExternoAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoExternoVendedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoIdioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoIsoMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoModuloVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoTipoTarifa" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="CodigoTipoVenda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoVendedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndicadorHotelAgrupado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndicadorHotelFlytour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndicadorInformacaoHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndicadorReservaOnRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndicadorSomenteNovosRegistros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeContinente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomePais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiglaEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiglaIdioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiglaPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CosultaFiltro", propOrder = {
    "apartamentos",
    "assincrono",
    "cnpjcpfAgencia",
    "cnpjcpfEmpresa",
    "cnpjcpfVendedor",
    "codigoAgencia",
    "codigoCidade",
    "codigoConsulta",
    "codigoContinente",
    "codigoEmpresa",
    "codigoEstado",
    "codigoExternoAgencia",
    "codigoExternoVendedor",
    "codigoIdioma",
    "codigoIsoMoeda",
    "codigoModuloVenda",
    "codigoMoeda",
    "codigoPais",
    "codigoTipoTarifa",
    "codigoTipoVenda",
    "codigoVendedor",
    "dataFinal",
    "dataInicial",
    "indicadorHotelAgrupado",
    "indicadorHotelFlytour",
    "indicadorInformacaoHotel",
    "indicadorReservaOnRequest",
    "indicadorSomenteNovosRegistros",
    "nomeCidade",
    "nomeContinente",
    "nomeEstado",
    "nomePais",
    "siglaEstado",
    "siglaIdioma",
    "siglaPais",
    "token"
})
public class CosultaFiltro {

    @XmlElementRef(name = "Apartamentos", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfApartamentoFiltro> apartamentos;
    @XmlElementRef(name = "Assincrono", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assincrono;
    @XmlElementRef(name = "CNPJCPFAgencia", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpjcpfAgencia;
    @XmlElementRef(name = "CNPJCPFEmpresa", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpjcpfEmpresa;
    @XmlElementRef(name = "CNPJCPFVendedor", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpjcpfVendedor;
    @XmlElementRef(name = "CodigoAgencia", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoAgencia;
    @XmlElementRef(name = "CodigoCidade", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoCidade;
    @XmlElementRef(name = "CodigoConsulta", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoConsulta;
    @XmlElementRef(name = "CodigoContinente", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoContinente;
    @XmlElementRef(name = "CodigoEmpresa", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoEmpresa;
    @XmlElementRef(name = "CodigoEstado", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoEstado;
    @XmlElementRef(name = "CodigoExternoAgencia", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoExternoAgencia;
    @XmlElementRef(name = "CodigoExternoVendedor", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoExternoVendedor;
    @XmlElementRef(name = "CodigoIdioma", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoIdioma;
    @XmlElementRef(name = "CodigoIsoMoeda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoIsoMoeda;
    @XmlElementRef(name = "CodigoModuloVenda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoModuloVenda;
    @XmlElementRef(name = "CodigoMoeda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoMoeda;
    @XmlElementRef(name = "CodigoPais", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPais;
    @XmlElement(name = "CodigoTipoTarifa")
    protected Short codigoTipoTarifa;
    @XmlElementRef(name = "CodigoTipoVenda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> codigoTipoVenda;
    @XmlElementRef(name = "CodigoVendedor", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoVendedor;
    @XmlElementRef(name = "DataFinal", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataFinal;
    @XmlElementRef(name = "DataInicial", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataInicial;
    @XmlElementRef(name = "IndicadorHotelAgrupado", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorHotelAgrupado;
    @XmlElementRef(name = "IndicadorHotelFlytour", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorHotelFlytour;
    @XmlElementRef(name = "IndicadorInformacaoHotel", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorInformacaoHotel;
    @XmlElementRef(name = "IndicadorReservaOnRequest", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorReservaOnRequest;
    @XmlElementRef(name = "IndicadorSomenteNovosRegistros", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorSomenteNovosRegistros;
    @XmlElementRef(name = "NomeCidade", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeCidade;
    @XmlElementRef(name = "NomeContinente", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeContinente;
    @XmlElementRef(name = "NomeEstado", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeEstado;
    @XmlElementRef(name = "NomePais", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomePais;
    @XmlElementRef(name = "SiglaEstado", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaEstado;
    @XmlElementRef(name = "SiglaIdioma", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaIdioma;
    @XmlElementRef(name = "SiglaPais", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaPais;
    @XmlElementRef(name = "Token", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;

    /**
     * Gets the value of the apartamentos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfApartamentoFiltro }{@code >}
     *     
     */
    public JAXBElement<ArrayOfApartamentoFiltro> getApartamentos() {
        return apartamentos;
    }

    /**
     * Sets the value of the apartamentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfApartamentoFiltro }{@code >}
     *     
     */
    public void setApartamentos(JAXBElement<ArrayOfApartamentoFiltro> value) {
        this.apartamentos = value;
    }

    /**
     * Gets the value of the assincrono property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssincrono() {
        return assincrono;
    }

    /**
     * Sets the value of the assincrono property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssincrono(JAXBElement<String> value) {
        this.assincrono = value;
    }

    /**
     * Gets the value of the cnpjcpfAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNPJCPFAgencia() {
        return cnpjcpfAgencia;
    }

    /**
     * Sets the value of the cnpjcpfAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNPJCPFAgencia(JAXBElement<String> value) {
        this.cnpjcpfAgencia = value;
    }

    /**
     * Gets the value of the cnpjcpfEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNPJCPFEmpresa() {
        return cnpjcpfEmpresa;
    }

    /**
     * Sets the value of the cnpjcpfEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNPJCPFEmpresa(JAXBElement<String> value) {
        this.cnpjcpfEmpresa = value;
    }

    /**
     * Gets the value of the cnpjcpfVendedor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNPJCPFVendedor() {
        return cnpjcpfVendedor;
    }

    /**
     * Sets the value of the cnpjcpfVendedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNPJCPFVendedor(JAXBElement<String> value) {
        this.cnpjcpfVendedor = value;
    }

    /**
     * Gets the value of the codigoAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoAgencia() {
        return codigoAgencia;
    }

    /**
     * Sets the value of the codigoAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoAgencia(JAXBElement<String> value) {
        this.codigoAgencia = value;
    }

    /**
     * Gets the value of the codigoCidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoCidade() {
        return codigoCidade;
    }

    /**
     * Sets the value of the codigoCidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoCidade(JAXBElement<String> value) {
        this.codigoCidade = value;
    }

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
     * Gets the value of the codigoContinente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoContinente() {
        return codigoContinente;
    }

    /**
     * Sets the value of the codigoContinente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoContinente(JAXBElement<String> value) {
        this.codigoContinente = value;
    }

    /**
     * Gets the value of the codigoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoEmpresa() {
        return codigoEmpresa;
    }

    /**
     * Sets the value of the codigoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoEmpresa(JAXBElement<String> value) {
        this.codigoEmpresa = value;
    }

    /**
     * Gets the value of the codigoEstado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * Sets the value of the codigoEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoEstado(JAXBElement<String> value) {
        this.codigoEstado = value;
    }

    /**
     * Gets the value of the codigoExternoAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoExternoAgencia() {
        return codigoExternoAgencia;
    }

    /**
     * Sets the value of the codigoExternoAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoExternoAgencia(JAXBElement<String> value) {
        this.codigoExternoAgencia = value;
    }

    /**
     * Gets the value of the codigoExternoVendedor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoExternoVendedor() {
        return codigoExternoVendedor;
    }

    /**
     * Sets the value of the codigoExternoVendedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoExternoVendedor(JAXBElement<String> value) {
        this.codigoExternoVendedor = value;
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
     * Gets the value of the codigoModuloVenda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoModuloVenda() {
        return codigoModuloVenda;
    }

    /**
     * Sets the value of the codigoModuloVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoModuloVenda(JAXBElement<String> value) {
        this.codigoModuloVenda = value;
    }

    /**
     * Gets the value of the codigoMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoMoeda() {
        return codigoMoeda;
    }

    /**
     * Sets the value of the codigoMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoMoeda(JAXBElement<String> value) {
        this.codigoMoeda = value;
    }

    /**
     * Gets the value of the codigoPais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPais() {
        return codigoPais;
    }

    /**
     * Sets the value of the codigoPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPais(JAXBElement<String> value) {
        this.codigoPais = value;
    }

    /**
     * Gets the value of the codigoTipoTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCodigoTipoTarifa() {
        return codigoTipoTarifa;
    }

    /**
     * Sets the value of the codigoTipoTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCodigoTipoTarifa(Short value) {
        this.codigoTipoTarifa = value;
    }

    /**
     * Gets the value of the codigoTipoVenda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCodigoTipoVenda() {
        return codigoTipoVenda;
    }

    /**
     * Sets the value of the codigoTipoVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCodigoTipoVenda(JAXBElement<BigDecimal> value) {
        this.codigoTipoVenda = value;
    }

    /**
     * Gets the value of the codigoVendedor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoVendedor() {
        return codigoVendedor;
    }

    /**
     * Sets the value of the codigoVendedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoVendedor(JAXBElement<String> value) {
        this.codigoVendedor = value;
    }

    /**
     * Gets the value of the dataFinal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataFinal() {
        return dataFinal;
    }

    /**
     * Sets the value of the dataFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataFinal(JAXBElement<String> value) {
        this.dataFinal = value;
    }

    /**
     * Gets the value of the dataInicial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataInicial() {
        return dataInicial;
    }

    /**
     * Sets the value of the dataInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataInicial(JAXBElement<String> value) {
        this.dataInicial = value;
    }

    /**
     * Gets the value of the indicadorHotelAgrupado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorHotelAgrupado() {
        return indicadorHotelAgrupado;
    }

    /**
     * Sets the value of the indicadorHotelAgrupado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorHotelAgrupado(JAXBElement<String> value) {
        this.indicadorHotelAgrupado = value;
    }

    /**
     * Gets the value of the indicadorHotelFlytour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorHotelFlytour() {
        return indicadorHotelFlytour;
    }

    /**
     * Sets the value of the indicadorHotelFlytour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorHotelFlytour(JAXBElement<String> value) {
        this.indicadorHotelFlytour = value;
    }

    /**
     * Gets the value of the indicadorInformacaoHotel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorInformacaoHotel() {
        return indicadorInformacaoHotel;
    }

    /**
     * Sets the value of the indicadorInformacaoHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorInformacaoHotel(JAXBElement<String> value) {
        this.indicadorInformacaoHotel = value;
    }

    /**
     * Gets the value of the indicadorReservaOnRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorReservaOnRequest() {
        return indicadorReservaOnRequest;
    }

    /**
     * Sets the value of the indicadorReservaOnRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorReservaOnRequest(JAXBElement<String> value) {
        this.indicadorReservaOnRequest = value;
    }

    /**
     * Gets the value of the indicadorSomenteNovosRegistros property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorSomenteNovosRegistros() {
        return indicadorSomenteNovosRegistros;
    }

    /**
     * Sets the value of the indicadorSomenteNovosRegistros property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorSomenteNovosRegistros(JAXBElement<String> value) {
        this.indicadorSomenteNovosRegistros = value;
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
     * Gets the value of the nomeContinente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeContinente() {
        return nomeContinente;
    }

    /**
     * Sets the value of the nomeContinente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeContinente(JAXBElement<String> value) {
        this.nomeContinente = value;
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
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToken(JAXBElement<String> value) {
        this.token = value;
    }

}
