
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.ftv_shared.BaseData;


/**
 * <p>Java class for HotelDestaque complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelDestaque">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/FTV.Shared.Business}BaseData">
 *       &lt;sequence>
 *         &lt;element name="CodigoCidade" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoHotel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoHotelDestaque" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoMoeda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoPessoa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DataFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IndicadorNacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndicadorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantidadeParcela" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SiglaMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorEntrada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ValorParcela" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ValorReferencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDestaque", propOrder = {
    "codigoCidade",
    "codigoHotel",
    "codigoHotelDestaque",
    "codigoMoeda",
    "codigoPessoa",
    "dataFinal",
    "dataInicial",
    "indicadorNacional",
    "indicadorStatus",
    "nomeCidade",
    "nomeHotel",
    "quantidadeParcela",
    "siglaMoeda",
    "token",
    "valorEntrada",
    "valorParcela",
    "valorReferencia"
})
public class HotelDestaque
    extends BaseData
{

    @XmlElementRef(name = "CodigoCidade", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> codigoCidade;
    @XmlElementRef(name = "CodigoHotel", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> codigoHotel;
    @XmlElementRef(name = "CodigoHotelDestaque", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> codigoHotelDestaque;
    @XmlElementRef(name = "CodigoMoeda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> codigoMoeda;
    @XmlElementRef(name = "CodigoPessoa", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> codigoPessoa;
    @XmlElementRef(name = "DataFinal", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataFinal;
    @XmlElementRef(name = "DataInicial", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataInicial;
    @XmlElementRef(name = "IndicadorNacional", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorNacional;
    @XmlElementRef(name = "IndicadorStatus", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorStatus;
    @XmlElementRef(name = "NomeCidade", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeCidade;
    @XmlElementRef(name = "NomeHotel", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeHotel;
    @XmlElementRef(name = "QuantidadeParcela", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantidadeParcela;
    @XmlElementRef(name = "SiglaMoeda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaMoeda;
    @XmlElementRef(name = "Token", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;
    @XmlElementRef(name = "ValorEntrada", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valorEntrada;
    @XmlElementRef(name = "ValorParcela", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valorParcela;
    @XmlElementRef(name = "ValorReferencia", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valorReferencia;

    /**
     * Gets the value of the codigoCidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCodigoCidade() {
        return codigoCidade;
    }

    /**
     * Sets the value of the codigoCidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCodigoCidade(JAXBElement<BigDecimal> value) {
        this.codigoCidade = value;
    }

    /**
     * Gets the value of the codigoHotel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCodigoHotel() {
        return codigoHotel;
    }

    /**
     * Sets the value of the codigoHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCodigoHotel(JAXBElement<BigDecimal> value) {
        this.codigoHotel = value;
    }

    /**
     * Gets the value of the codigoHotelDestaque property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCodigoHotelDestaque() {
        return codigoHotelDestaque;
    }

    /**
     * Sets the value of the codigoHotelDestaque property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCodigoHotelDestaque(JAXBElement<BigDecimal> value) {
        this.codigoHotelDestaque = value;
    }

    /**
     * Gets the value of the codigoMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCodigoMoeda() {
        return codigoMoeda;
    }

    /**
     * Sets the value of the codigoMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCodigoMoeda(JAXBElement<BigDecimal> value) {
        this.codigoMoeda = value;
    }

    /**
     * Gets the value of the codigoPessoa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCodigoPessoa() {
        return codigoPessoa;
    }

    /**
     * Sets the value of the codigoPessoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCodigoPessoa(JAXBElement<BigDecimal> value) {
        this.codigoPessoa = value;
    }

    /**
     * Gets the value of the dataFinal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataFinal() {
        return dataFinal;
    }

    /**
     * Sets the value of the dataFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataFinal(JAXBElement<XMLGregorianCalendar> value) {
        this.dataFinal = value;
    }

    /**
     * Gets the value of the dataInicial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataInicial() {
        return dataInicial;
    }

    /**
     * Sets the value of the dataInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataInicial(JAXBElement<XMLGregorianCalendar> value) {
        this.dataInicial = value;
    }

    /**
     * Gets the value of the indicadorNacional property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorNacional() {
        return indicadorNacional;
    }

    /**
     * Sets the value of the indicadorNacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorNacional(JAXBElement<String> value) {
        this.indicadorNacional = value;
    }

    /**
     * Gets the value of the indicadorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorStatus() {
        return indicadorStatus;
    }

    /**
     * Sets the value of the indicadorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorStatus(JAXBElement<String> value) {
        this.indicadorStatus = value;
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
     * Gets the value of the quantidadeParcela property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantidadeParcela() {
        return quantidadeParcela;
    }

    /**
     * Sets the value of the quantidadeParcela property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantidadeParcela(JAXBElement<BigDecimal> value) {
        this.quantidadeParcela = value;
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

    /**
     * Gets the value of the valorEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValorEntrada() {
        return valorEntrada;
    }

    /**
     * Sets the value of the valorEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValorEntrada(JAXBElement<BigDecimal> value) {
        this.valorEntrada = value;
    }

    /**
     * Gets the value of the valorParcela property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValorParcela() {
        return valorParcela;
    }

    /**
     * Sets the value of the valorParcela property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValorParcela(JAXBElement<BigDecimal> value) {
        this.valorParcela = value;
    }

    /**
     * Gets the value of the valorReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValorReferencia() {
        return valorReferencia;
    }

    /**
     * Sets the value of the valorReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValorReferencia(JAXBElement<BigDecimal> value) {
        this.valorReferencia = value;
    }

}
