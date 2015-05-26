
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
 *         &lt;element name="idEmpClie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="strParteNomeCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idEmpClie",
    "strParteNomeCliente"
})
@XmlRootElement(name = "ListaClientesNome")
public class ListaClientesNome {

    protected int idEmpClie;
    protected String strParteNomeCliente;

    /**
     * Gets the value of the idEmpClie property.
     * 
     */
    public int getIdEmpClie() {
        return idEmpClie;
    }

    /**
     * Sets the value of the idEmpClie property.
     * 
     */
    public void setIdEmpClie(int value) {
        this.idEmpClie = value;
    }

    /**
     * Gets the value of the strParteNomeCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrParteNomeCliente() {
        return strParteNomeCliente;
    }

    /**
     * Sets the value of the strParteNomeCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrParteNomeCliente(String value) {
        this.strParteNomeCliente = value;
    }

}
