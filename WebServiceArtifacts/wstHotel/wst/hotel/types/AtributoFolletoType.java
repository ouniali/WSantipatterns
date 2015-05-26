
package wst.hotel.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for atributoFolletoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atributoFolletoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAtrib" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="desAtrib" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gratuito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atributoFolletoType", propOrder = {
    "codAtrib",
    "desAtrib",
    "gratuito"
})
public class AtributoFolletoType {

    @XmlElement(required = true)
    protected String codAtrib;
    @XmlElement(required = true)
    protected String desAtrib;
    protected String gratuito;

    /**
     * Gets the value of the codAtrib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAtrib() {
        return codAtrib;
    }

    /**
     * Sets the value of the codAtrib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAtrib(String value) {
        this.codAtrib = value;
    }

    /**
     * Gets the value of the desAtrib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesAtrib() {
        return desAtrib;
    }

    /**
     * Sets the value of the desAtrib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesAtrib(String value) {
        this.desAtrib = value;
    }

    /**
     * Gets the value of the gratuito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGratuito() {
        return gratuito;
    }

    /**
     * Sets the value of the gratuito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGratuito(String value) {
        this.gratuito = value;
    }

}
