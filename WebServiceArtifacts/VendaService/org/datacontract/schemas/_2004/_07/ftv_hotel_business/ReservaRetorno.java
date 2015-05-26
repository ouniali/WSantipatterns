
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.ftv_shared.BaseData;


/**
 * <p>Java class for ReservaRetorno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservaRetorno">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/FTV.Shared.Business}BaseData">
 *       &lt;sequence>
 *         &lt;element name="CodigoFile" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CodigoIdioma" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DataValidade" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IndicadorPermitePagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MultasCancelamento" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfMultaCancelamento" minOccurs="0"/>
 *         &lt;element name="ReservaApartamentos" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}ArrayOfReservaApartamentoRetorno" minOccurs="0"/>
 *         &lt;element name="SiglaIdioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservaRetorno", propOrder = {
    "codigoFile",
    "codigoIdioma",
    "dataValidade",
    "indicadorPermitePagamento",
    "multasCancelamento",
    "reservaApartamentos",
    "siglaIdioma"
})
public class ReservaRetorno
    extends BaseData
{

    @XmlElementRef(name = "CodigoFile", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codigoFile;
    @XmlElementRef(name = "CodigoIdioma", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codigoIdioma;
    @XmlElement(name = "DataValidade")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataValidade;
    @XmlElementRef(name = "IndicadorPermitePagamento", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorPermitePagamento;
    @XmlElementRef(name = "MultasCancelamento", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMultaCancelamento> multasCancelamento;
    @XmlElementRef(name = "ReservaApartamentos", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReservaApartamentoRetorno> reservaApartamentos;
    @XmlElementRef(name = "SiglaIdioma", namespace = "http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaIdioma;

    /**
     * Gets the value of the codigoFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodigoFile() {
        return codigoFile;
    }

    /**
     * Sets the value of the codigoFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodigoFile(JAXBElement<Long> value) {
        this.codigoFile = value;
    }

    /**
     * Gets the value of the codigoIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodigoIdioma() {
        return codigoIdioma;
    }

    /**
     * Sets the value of the codigoIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodigoIdioma(JAXBElement<Long> value) {
        this.codigoIdioma = value;
    }

    /**
     * Gets the value of the dataValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataValidade() {
        return dataValidade;
    }

    /**
     * Sets the value of the dataValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataValidade(XMLGregorianCalendar value) {
        this.dataValidade = value;
    }

    /**
     * Gets the value of the indicadorPermitePagamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorPermitePagamento() {
        return indicadorPermitePagamento;
    }

    /**
     * Sets the value of the indicadorPermitePagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorPermitePagamento(JAXBElement<String> value) {
        this.indicadorPermitePagamento = value;
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
     * Gets the value of the reservaApartamentos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReservaApartamentoRetorno }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReservaApartamentoRetorno> getReservaApartamentos() {
        return reservaApartamentos;
    }

    /**
     * Sets the value of the reservaApartamentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReservaApartamentoRetorno }{@code >}
     *     
     */
    public void setReservaApartamentos(JAXBElement<ArrayOfReservaApartamentoRetorno> value) {
        this.reservaApartamentos = value;
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

}
