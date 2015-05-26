
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
 *         &lt;element name="SolicitacaoTaxiResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "solicitacaoTaxiResult"
})
@XmlRootElement(name = "SolicitacaoTaxiResponse")
public class SolicitacaoTaxiResponse {

    @XmlElement(name = "SolicitacaoTaxiResult")
    protected int solicitacaoTaxiResult;

    /**
     * Gets the value of the solicitacaoTaxiResult property.
     * 
     */
    public int getSolicitacaoTaxiResult() {
        return solicitacaoTaxiResult;
    }

    /**
     * Sets the value of the solicitacaoTaxiResult property.
     * 
     */
    public void setSolicitacaoTaxiResult(int value) {
        this.solicitacaoTaxiResult = value;
    }

}
