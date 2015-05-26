
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
 *         &lt;element name="ConsultaDadosSolicitanteTransResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "consultaDadosSolicitanteTransResult"
})
@XmlRootElement(name = "ConsultaDadosSolicitanteTransResponse")
public class ConsultaDadosSolicitanteTransResponse {

    @XmlElement(name = "ConsultaDadosSolicitanteTransResult")
    protected String consultaDadosSolicitanteTransResult;

    /**
     * Gets the value of the consultaDadosSolicitanteTransResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultaDadosSolicitanteTransResult() {
        return consultaDadosSolicitanteTransResult;
    }

    /**
     * Sets the value of the consultaDadosSolicitanteTransResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultaDadosSolicitanteTransResult(String value) {
        this.consultaDadosSolicitanteTransResult = value;
    }

}
