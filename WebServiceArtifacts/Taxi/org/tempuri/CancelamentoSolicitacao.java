
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="idsolicitacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idsolicitacao"
})
@XmlRootElement(name = "CancelamentoSolicitacao")
public class CancelamentoSolicitacao {

    protected int idsolicitacao;

    /**
     * Gets the value of the idsolicitacao property.
     * 
     */
    public int getIdsolicitacao() {
        return idsolicitacao;
    }

    /**
     * Sets the value of the idsolicitacao property.
     * 
     */
    public void setIdsolicitacao(int value) {
        this.idsolicitacao = value;
    }

}
