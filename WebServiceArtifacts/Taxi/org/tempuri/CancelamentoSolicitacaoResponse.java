
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
 *         &lt;element name="CancelamentoSolicitacaoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "cancelamentoSolicitacaoResult"
})
@XmlRootElement(name = "CancelamentoSolicitacaoResponse")
public class CancelamentoSolicitacaoResponse {

    @XmlElement(name = "CancelamentoSolicitacaoResult")
    protected boolean cancelamentoSolicitacaoResult;

    /**
     * Gets the value of the cancelamentoSolicitacaoResult property.
     * 
     */
    public boolean isCancelamentoSolicitacaoResult() {
        return cancelamentoSolicitacaoResult;
    }

    /**
     * Sets the value of the cancelamentoSolicitacaoResult property.
     * 
     */
    public void setCancelamentoSolicitacaoResult(boolean value) {
        this.cancelamentoSolicitacaoResult = value;
    }

}
