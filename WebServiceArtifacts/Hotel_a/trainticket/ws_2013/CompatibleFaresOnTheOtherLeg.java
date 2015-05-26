
package trainticket.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ws_2013.PriceValue;


/**
 * <p>Java class for CompatibleFaresOnTheOtherLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompatibleFaresOnTheOtherLeg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PacoteTarifaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preco" type="{WS_2013}PriceValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompatibleFaresOnTheOtherLeg", propOrder = {
    "pacoteTarifaId",
    "preco"
})
public class CompatibleFaresOnTheOtherLeg {

    @XmlElement(name = "PacoteTarifaId")
    protected String pacoteTarifaId;
    @XmlElement(name = "Preco")
    protected PriceValue preco;

    /**
     * Gets the value of the pacoteTarifaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacoteTarifaId() {
        return pacoteTarifaId;
    }

    /**
     * Sets the value of the pacoteTarifaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacoteTarifaId(String value) {
        this.pacoteTarifaId = value;
    }

    /**
     * Gets the value of the preco property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPreco() {
        return preco;
    }

    /**
     * Sets the value of the preco property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPreco(PriceValue value) {
        this.preco = value;
    }

}
