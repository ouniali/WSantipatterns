
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ftv_hotel_business.CosultaFiltro;


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
 *         &lt;element name="consultaFiltro" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}CosultaFiltro" minOccurs="0"/>
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
    "consultaFiltro"
})
@XmlRootElement(name = "Retornar")
public class Retornar {

    @XmlElementRef(name = "consultaFiltro", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CosultaFiltro> consultaFiltro;

    /**
     * Gets the value of the consultaFiltro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CosultaFiltro }{@code >}
     *     
     */
    public JAXBElement<CosultaFiltro> getConsultaFiltro() {
        return consultaFiltro;
    }

    /**
     * Sets the value of the consultaFiltro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CosultaFiltro }{@code >}
     *     
     */
    public void setConsultaFiltro(JAXBElement<CosultaFiltro> value) {
        this.consultaFiltro = value;
    }

}
