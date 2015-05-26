
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
 *         &lt;element name="IncluirSolicitacaoTaxiXMLResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "incluirSolicitacaoTaxiXMLResult"
})
@XmlRootElement(name = "IncluirSolicitacaoTaxiXMLResponse")
public class IncluirSolicitacaoTaxiXMLResponse {

    @XmlElement(name = "IncluirSolicitacaoTaxiXMLResult")
    protected String incluirSolicitacaoTaxiXMLResult;

    /**
     * Gets the value of the incluirSolicitacaoTaxiXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncluirSolicitacaoTaxiXMLResult() {
        return incluirSolicitacaoTaxiXMLResult;
    }

    /**
     * Sets the value of the incluirSolicitacaoTaxiXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncluirSolicitacaoTaxiXMLResult(String value) {
        this.incluirSolicitacaoTaxiXMLResult = value;
    }

}
