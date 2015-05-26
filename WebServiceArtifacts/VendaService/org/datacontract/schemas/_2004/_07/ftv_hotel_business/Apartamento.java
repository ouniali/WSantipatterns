
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Apartamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Apartamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoApartamento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IndicadorCamaCasal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Passageiros" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfPassageiro" minOccurs="0"/>
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
@XmlType(name = "Apartamento", propOrder = {
    "codigoApartamento",
    "indicadorCamaCasal",
    "passageiros",
    "valorTaxa",
    "valorTotal",
    "valorVenda"
})
public class Apartamento {

    @XmlElement(name = "CodigoApartamento")
    protected Long codigoApartamento;
    @XmlElementRef(name = "IndicadorCamaCasal", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorCamaCasal;
    @XmlElementRef(name = "Passageiros", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPassageiro> passageiros;
    @XmlElement(name = "ValorTaxa")
    protected BigDecimal valorTaxa;
    @XmlElement(name = "ValorTotal")
    protected BigDecimal valorTotal;
    @XmlElement(name = "ValorVenda")
    protected BigDecimal valorVenda;

    /**
     * Gets the value of the codigoApartamento property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoApartamento() {
        return codigoApartamento;
    }

    /**
     * Sets the value of the codigoApartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoApartamento(Long value) {
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassageiro }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPassageiro> getPassageiros() {
        return passageiros;
    }

    /**
     * Sets the value of the passageiros property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassageiro }{@code >}
     *     
     */
    public void setPassageiros(JAXBElement<ArrayOfPassageiro> value) {
        this.passageiros = value;
    }

    /**
     * Gets the value of the valorTaxa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTaxa() {
        return valorTaxa;
    }

    /**
     * Sets the value of the valorTaxa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTaxa(BigDecimal value) {
        this.valorTaxa = value;
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
     * Gets the value of the valorVenda property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    /**
     * Sets the value of the valorVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorVenda(BigDecimal value) {
        this.valorVenda = value;
    }

}
