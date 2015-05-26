
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_hotel_business.Atualizacao;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atualizacao" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}Atualizacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "atualizacao"
})
@XmlRootElement(name = "AtualizarStatusReservaIntegracao")
public class AtualizarStatusReservaIntegracao {

    @XmlElementRef(name = "atualizacao", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Atualizacao> atualizacao;

    /**
     * Gets the value of the atualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Atualizacao }{@code >}
     *     
     */
    public JAXBElement<Atualizacao> getAtualizacao() {
        return atualizacao;
    }

    /**
     * Sets the value of the atualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Atualizacao }{@code >}
     *     
     */
    public void setAtualizacao(JAXBElement<Atualizacao> value) {
        this.atualizacao = value;
    }

}
