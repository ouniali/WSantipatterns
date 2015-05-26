
package org.datacontract.schemas._2004._07.ftv_shared;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_hotel_business.Atualizacao;
import org.datacontract.schemas._2004._07.ftv_hotel_business.CancelamentoRetorno;
import org.datacontract.schemas._2004._07.ftv_hotel_business.Hotel;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelAlteradoConfirmacao;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelDestaque;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelLocalizacao;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelRetorno;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ReservaRetorno;


/**
 * <p>Java class for BaseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MensagemErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseData", propOrder = {
    "codigoErro",
    "mensagemErro"
})
@XmlSeeAlso({
    HotelRetorno.class,
    HotelAlteradoConfirmacao.class,
    CancelamentoRetorno.class,
    Atualizacao.class,
    HotelDestaque.class,
    ReservaRetorno.class,
    Hotel.class,
    HotelLocalizacao.class
})
public class BaseData {

    @XmlElementRef(name = "CodigoErro", namespace = "http://schemas.datacontract.org/2004/07/FTV.Shared.Business", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoErro;
    @XmlElementRef(name = "MensagemErro", namespace = "http://schemas.datacontract.org/2004/07/FTV.Shared.Business", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensagemErro;

    /**
     * Gets the value of the codigoErro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoErro() {
        return codigoErro;
    }

    /**
     * Sets the value of the codigoErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoErro(JAXBElement<String> value) {
        this.codigoErro = value;
    }

    /**
     * Gets the value of the mensagemErro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Sets the value of the mensagemErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensagemErro(JAXBElement<String> value) {
        this.mensagemErro = value;
    }

}
