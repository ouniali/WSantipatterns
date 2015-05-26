
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tarifa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tarifa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoRegimeAlimentacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CodigoStatusVenda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CodigoTarifa" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DetalheTarifas" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfDetalheTarifa" minOccurs="0"/>
 *         &lt;element name="HotelTaxas" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfHotelTaxa" minOccurs="0"/>
 *         &lt;element name="MultasCancelamento" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfMultaCancelamento" minOccurs="0"/>
 *         &lt;element name="NomeAcomodacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeRegimeAlimentacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObservacoesHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantidadeApartamentoDisponivel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ValorCusto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ValorDiariaMedia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ValorTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="id_tarifa_per_vig_custo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tarifa", propOrder = {
    "codigoRegimeAlimentacao",
    "codigoStatusVenda",
    "codigoTarifa",
    "detalheTarifas",
    "hotelTaxas",
    "multasCancelamento",
    "nomeAcomodacao",
    "nomeRegimeAlimentacao",
    "observacoesHotel",
    "quantidadeApartamentoDisponivel",
    "valorCusto",
    "valorDiariaMedia",
    "valorTotal",
    "idTarifaPerVigCusto"
})
public class Tarifa {

    @XmlElementRef(name = "CodigoRegimeAlimentacao", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codigoRegimeAlimentacao;
    @XmlElementRef(name = "CodigoStatusVenda", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codigoStatusVenda;
    @XmlElementRef(name = "CodigoTarifa", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codigoTarifa;
    @XmlElementRef(name = "DetalheTarifas", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalheTarifa> detalheTarifas;
    @XmlElementRef(name = "HotelTaxas", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHotelTaxa> hotelTaxas;
    @XmlElementRef(name = "MultasCancelamento", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMultaCancelamento> multasCancelamento;
    @XmlElementRef(name = "NomeAcomodacao", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeAcomodacao;
    @XmlElementRef(name = "NomeRegimeAlimentacao", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeRegimeAlimentacao;
    @XmlElementRef(name = "ObservacoesHotel", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacoesHotel;
    @XmlElementRef(name = "QuantidadeApartamentoDisponivel", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantidadeApartamentoDisponivel;
    @XmlElement(name = "ValorCusto")
    protected BigDecimal valorCusto;
    @XmlElement(name = "ValorDiariaMedia")
    protected BigDecimal valorDiariaMedia;
    @XmlElement(name = "ValorTotal")
    protected BigDecimal valorTotal;
    @XmlElementRef(name = "id_tarifa_per_vig_custo", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idTarifaPerVigCusto;

    /**
     * Gets the value of the codigoRegimeAlimentacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodigoRegimeAlimentacao() {
        return codigoRegimeAlimentacao;
    }

    /**
     * Sets the value of the codigoRegimeAlimentacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodigoRegimeAlimentacao(JAXBElement<Long> value) {
        this.codigoRegimeAlimentacao = value;
    }

    /**
     * Gets the value of the codigoStatusVenda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodigoStatusVenda() {
        return codigoStatusVenda;
    }

    /**
     * Sets the value of the codigoStatusVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodigoStatusVenda(JAXBElement<Long> value) {
        this.codigoStatusVenda = value;
    }

    /**
     * Gets the value of the codigoTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodigoTarifa() {
        return codigoTarifa;
    }

    /**
     * Sets the value of the codigoTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodigoTarifa(JAXBElement<Long> value) {
        this.codigoTarifa = value;
    }

    /**
     * Gets the value of the detalheTarifas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalheTarifa }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetalheTarifa> getDetalheTarifas() {
        return detalheTarifas;
    }

    /**
     * Sets the value of the detalheTarifas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalheTarifa }{@code >}
     *     
     */
    public void setDetalheTarifas(JAXBElement<ArrayOfDetalheTarifa> value) {
        this.detalheTarifas = value;
    }

    /**
     * Gets the value of the hotelTaxas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelTaxa }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHotelTaxa> getHotelTaxas() {
        return hotelTaxas;
    }

    /**
     * Sets the value of the hotelTaxas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelTaxa }{@code >}
     *     
     */
    public void setHotelTaxas(JAXBElement<ArrayOfHotelTaxa> value) {
        this.hotelTaxas = value;
    }

    /**
     * Gets the value of the multasCancelamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMultaCancelamento }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMultaCancelamento> getMultasCancelamento() {
        return multasCancelamento;
    }

    /**
     * Sets the value of the multasCancelamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMultaCancelamento }{@code >}
     *     
     */
    public void setMultasCancelamento(JAXBElement<ArrayOfMultaCancelamento> value) {
        this.multasCancelamento = value;
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
     * Gets the value of the nomeRegimeAlimentacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeRegimeAlimentacao() {
        return nomeRegimeAlimentacao;
    }

    /**
     * Sets the value of the nomeRegimeAlimentacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeRegimeAlimentacao(JAXBElement<String> value) {
        this.nomeRegimeAlimentacao = value;
    }

    /**
     * Gets the value of the observacoesHotel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservacoesHotel() {
        return observacoesHotel;
    }

    /**
     * Sets the value of the observacoesHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservacoesHotel(JAXBElement<String> value) {
        this.observacoesHotel = value;
    }

    /**
     * Gets the value of the quantidadeApartamentoDisponivel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantidadeApartamentoDisponivel() {
        return quantidadeApartamentoDisponivel;
    }

    /**
     * Sets the value of the quantidadeApartamentoDisponivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantidadeApartamentoDisponivel(JAXBElement<BigDecimal> value) {
        this.quantidadeApartamentoDisponivel = value;
    }

    /**
     * Gets the value of the valorCusto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCusto() {
        return valorCusto;
    }

    /**
     * Sets the value of the valorCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCusto(BigDecimal value) {
        this.valorCusto = value;
    }

    /**
     * Gets the value of the valorDiariaMedia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDiariaMedia() {
        return valorDiariaMedia;
    }

    /**
     * Sets the value of the valorDiariaMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDiariaMedia(BigDecimal value) {
        this.valorDiariaMedia = value;
    }

    /**
     * Gets the value of the valorTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * Sets the value of the valorTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotal(BigDecimal value) {
        this.valorTotal = value;
    }

    /**
     * Gets the value of the idTarifaPerVigCusto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdTarifaPerVigCusto() {
        return idTarifaPerVigCusto;
    }

    /**
     * Sets the value of the idTarifaPerVigCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdTarifaPerVigCusto(JAXBElement<Long> value) {
        this.idTarifaPerVigCusto = value;
    }

}
