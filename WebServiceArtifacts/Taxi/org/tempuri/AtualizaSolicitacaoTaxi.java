
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
 *         &lt;element name="kilometragem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idsolicitacao",
    "kilometragem",
    "observacao"
})
@XmlRootElement(name = "AtualizaSolicitacaoTaxi")
public class AtualizaSolicitacaoTaxi {

    protected int idsolicitacao;
    protected String kilometragem;
    protected String observacao;

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

    /**
     * Gets the value of the kilometragem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKilometragem() {
        return kilometragem;
    }

    /**
     * Sets the value of the kilometragem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKilometragem(String value) {
        this.kilometragem = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

}
