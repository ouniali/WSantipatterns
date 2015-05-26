
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
 *         &lt;element name="AtualizaSolicitacaoTaxiResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "atualizaSolicitacaoTaxiResult"
})
@XmlRootElement(name = "AtualizaSolicitacaoTaxiResponse")
public class AtualizaSolicitacaoTaxiResponse {

    @XmlElement(name = "AtualizaSolicitacaoTaxiResult")
    protected boolean atualizaSolicitacaoTaxiResult;

    /**
     * Gets the value of the atualizaSolicitacaoTaxiResult property.
     * 
     */
    public boolean isAtualizaSolicitacaoTaxiResult() {
        return atualizaSolicitacaoTaxiResult;
    }

    /**
     * Sets the value of the atualizaSolicitacaoTaxiResult property.
     * 
     */
    public void setAtualizaSolicitacaoTaxiResult(boolean value) {
        this.atualizaSolicitacaoTaxiResult = value;
    }

}
