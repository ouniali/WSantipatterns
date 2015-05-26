
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_hotel_business.CancelamentoParametro;


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
 *         &lt;element name="cancelamentoParametro" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}CancelamentoParametro" minOccurs="0"/>
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
    "cancelamentoParametro"
})
@XmlRootElement(name = "Cancelar")
public class Cancelar {

    @XmlElementRef(name = "cancelamentoParametro", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CancelamentoParametro> cancelamentoParametro;

    /**
     * Gets the value of the cancelamentoParametro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CancelamentoParametro }{@code >}
     *     
     */
    public JAXBElement<CancelamentoParametro> getCancelamentoParametro() {
        return cancelamentoParametro;
    }

    /**
     * Sets the value of the cancelamentoParametro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CancelamentoParametro }{@code >}
     *     
     */
    public void setCancelamentoParametro(JAXBElement<CancelamentoParametro> value) {
        this.cancelamentoParametro = value;
    }

}
