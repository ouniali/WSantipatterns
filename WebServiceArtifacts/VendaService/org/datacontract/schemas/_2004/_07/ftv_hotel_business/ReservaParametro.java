
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReservaParametro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservaParametro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Apartamentos" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfApartamento" minOccurs="0"/>
 *         &lt;element name="CNPJCPFAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNPJCPFAtendente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNPJCPFEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNPJCPFVendedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoAtendente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoExternoAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoExternoAtendente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoExternoVendedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoFileCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoIdioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoIsoMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoModuloVenda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoStatusVenda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoTipoTarifa" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="CodigoTipoVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoVendedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PermiteReservaPeriodoMulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiglaIdioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiglaMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorTaxa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ValorTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ValorVenda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservaParametro", propOrder = {
    "apartamentos",
    "cnpjcpfAgencia",
    "cnpjcpfAtendente",
    "cnpjcpfEmpresa",
    "cnpjcpfVendedor",
    "codigoAgencia",
    "codigoAtendente",
    "codigoEmpresa",
    "codigoExternoAgencia",
    "codigoExternoAtendente",
    "codigoExternoVendedor",
    "codigoFile",
    "codigoFileCliente",
    "codigoIdioma",
    "codigoIsoMoeda",
    "codigoModuloVenda",
    "codigoMoeda",
    "codigoStatusVenda",
    "codigoTarifa",
    "codigoTipoTarifa",
    "codigoTipoVenda",
    "codigoVendedor",
    "dataFinal",
    "dataInicial",
    "permiteReservaPeriodoMulta",
    "siglaIdioma",
    "siglaMoeda",
    "token",
    "valorTaxa",
    "valorTotal",
    "valorVenda"
})
public class ReservaParametro {

    @XmlElementRef(name = "Apartamentos", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfApartamento> apartamentos;
    @XmlElementRef(name = "CNPJCPFAgencia", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpjcpfAgencia;
    @XmlElementRef(name = "CNPJCPFAtendente", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpjcpfAtendente;
    @XmlElementRef(name = "CNPJCPFEmpresa", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpjcpfEmpresa;
    @XmlElementRef(name = "CNPJCPFVendedor", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpjcpfVendedor;
    @XmlElementRef(name = "CodigoAgencia", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoAgencia;
    @XmlElementRef(name = "CodigoAtendente", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoAtendente;
    @XmlElementRef(name = "CodigoEmpresa", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoEmpresa;
    @XmlElementRef(name = "CodigoExternoAgencia", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoExternoAgencia;
    @XmlElementRef(name = "CodigoExternoAtendente", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoExternoAtendente;
    @XmlElementRef(name = "CodigoExternoVendedor", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoExternoVendedor;
    @XmlElementRef(name = "CodigoFile", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoFile;
    @XmlElementRef(name = "CodigoFileCliente", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoFileCliente;
    @XmlElementRef(name = "CodigoIdioma", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoIdioma;
    @XmlElementRef(name = "CodigoIsoMoeda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoIsoMoeda;
    @XmlElementRef(name = "CodigoModuloVenda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> codigoModuloVenda;
    @XmlElementRef(name = "CodigoMoeda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoMoeda;
    @XmlElementRef(name = "CodigoStatusVenda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> codigoStatusVenda;
    @XmlElementRef(name = "CodigoTarifa", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTarifa;
    @XmlElement(name = "CodigoTipoTarifa")
    protected Short codigoTipoTarifa;
    @XmlElementRef(name = "CodigoTipoVenda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoVenda;
    @XmlElementRef(name = "CodigoVendedor", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoVendedor;
    @XmlElement(name = "DataFinal")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinal;
    @XmlElement(name = "DataInicial")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicial;
    @XmlElementRef(name = "PermiteReservaPeriodoMulta", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permiteReservaPeriodoMulta;
    @XmlElementRef(name = "SiglaIdioma", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaIdioma;
    @XmlElementRef(name = "SiglaMoeda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaMoeda;
    @XmlElementRef(name = "Token", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;
    @XmlElementRef(name = "ValorTaxa", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valorTaxa;
    @XmlElementRef(name = "ValorTotal", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valorTotal;
    @XmlElementRef(name = "ValorVenda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valorVenda;

    /**
     * Gets the value of the apartamentos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfApartamento }{@code >}
     *     
     */
    public JAXBElement<ArrayOfApartamento> getApartamentos() {
        return apartamentos;
    }

    /**
     * Sets the value of the apartamentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfApartamento }{@code >}
     *     
     */
    public void setApartamentos(JAXBElement<ArrayOfApartamento> value) {
        this.apartamentos = value;
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
     * Gets the value of the cnpjcpfAtendente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNPJCPFAtendente() {
        return cnpjcpfAtendente;
    }

    /**
     * Sets the value of the cnpjcpfAtendente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNPJCPFAtendente(JAXBElement<String> value) {
        this.cnpjcpfAtendente = value;
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
     * Gets the value of the codigoAtendente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoAtendente() {
        return codigoAtendente;
    }

    /**
     * Sets the value of the codigoAtendente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoAtendente(JAXBElement<String> value) {
        this.codigoAtendente = value;
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
     * Gets the value of the codigoExternoAtendente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoExternoAtendente() {
        return codigoExternoAtendente;
    }

    /**
     * Sets the value of the codigoExternoAtendente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoExternoAtendente(JAXBElement<String> value) {
        this.codigoExternoAtendente = value;
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
     * Gets the value of the codigoFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoFile() {
        return codigoFile;
    }

    /**
     * Sets the value of the codigoFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoFile(JAXBElement<String> value) {
        this.codigoFile = value;
    }

    /**
     * Gets the value of the codigoFileCliente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoFileCliente() {
        return codigoFileCliente;
    }

    /**
     * Sets the value of the codigoFileCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoFileCliente(JAXBElement<String> value) {
        this.codigoFileCliente = value;
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
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCodigoModuloVenda() {
        return codigoModuloVenda;
    }

    /**
     * Sets the value of the codigoModuloVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCodigoModuloVenda(JAXBElement<BigDecimal> value) {
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
     * Gets the value of the codigoStatusVenda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCodigoStatusVenda() {
        return codigoStatusVenda;
    }

    /**
     * Sets the value of the codigoStatusVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCodigoStatusVenda(JAXBElement<BigDecimal> value) {
        this.codigoStatusVenda = value;
    }

    /**
     * Gets the value of the codigoTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTarifa() {
        return codigoTarifa;
    }

    /**
     * Sets the value of the codigoTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTarifa(JAXBElement<String> value) {
        this.codigoTarifa = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoVenda() {
        return codigoTipoVenda;
    }

    /**
     * Sets the value of the codigoTipoVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoVenda(JAXBElement<String> value) {
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinal() {
        return dataFinal;
    }

    /**
     * Sets the value of the dataFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinal(XMLGregorianCalendar value) {
        this.dataFinal = value;
    }

    /**
     * Gets the value of the dataInicial property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicial() {
        return dataInicial;
    }

    /**
     * Sets the value of the dataInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicial(XMLGregorianCalendar value) {
        this.dataInicial = value;
    }

    /**
     * Gets the value of the permiteReservaPeriodoMulta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermiteReservaPeriodoMulta() {
        return permiteReservaPeriodoMulta;
    }

    /**
     * Sets the value of the permiteReservaPeriodoMulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermiteReservaPeriodoMulta(JAXBElement<String> value) {
        this.permiteReservaPeriodoMulta = value;
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
     * Gets the value of the valorTaxa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValorTaxa() {
        return valorTaxa;
    }

    /**
     * Sets the value of the valorTaxa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValorTaxa(JAXBElement<BigDecimal> value) {
        this.valorTaxa = value;
    }

    /**
     * Gets the value of the valorTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValorTotal() {
        return valorTotal;
    }

    /**
     * Sets the value of the valorTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValorTotal(JAXBElement<BigDecimal> value) {
        this.valorTotal = value;
    }

    /**
     * Gets the value of the valorVenda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValorVenda() {
        return valorVenda;
    }

    /**
     * Sets the value of the valorVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValorVenda(JAXBElement<BigDecimal> value) {
        this.valorVenda = value;
    }

}
