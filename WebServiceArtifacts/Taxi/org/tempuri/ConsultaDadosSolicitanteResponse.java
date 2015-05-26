
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ConsultaDadosSolicitanteResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "consultaDadosSolicitanteResult"
})
@XmlRootElement(name = "ConsultaDadosSolicitanteResponse")
public class ConsultaDadosSolicitanteResponse {

    @XmlElement(name = "ConsultaDadosSolicitanteResult")
    protected String consultaDadosSolicitanteResult;

    /**
     * Gets the value of the consultaDadosSolicitanteResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultaDadosSolicitanteResult() {
        return consultaDadosSolicitanteResult;
    }

    /**
     * Sets the value of the consultaDadosSolicitanteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultaDadosSolicitanteResult(String value) {
        this.consultaDadosSolicitanteResult = value;
    }

}
