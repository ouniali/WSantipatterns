
package wst.hotel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ocurrenciasAtributoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ocurrenciasAtributoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscAtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occAtr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ocurrenciasAtributoType", propOrder = {
    "codAtr",
    "dscAtr",
    "occAtr"
})
public class OcurrenciasAtributoType {

    @XmlElementRef(name = "codAtr", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codAtr;
    @XmlElementRef(name = "dscAtr", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dscAtr;
    @XmlElementRef(name = "occAtr", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> occAtr;

    /**
     * Gets the value of the codAtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodAtr() {
        return codAtr;
    }

    /**
     * Sets the value of the codAtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodAtr(JAXBElement<String> value) {
        this.codAtr = value;
    }

    /**
     * Gets the value of the dscAtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDscAtr() {
        return dscAtr;
    }

    /**
     * Sets the value of the dscAtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDscAtr(JAXBElement<String> value) {
        this.dscAtr = value;
    }

    /**
     * Gets the value of the occAtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOccAtr() {
        return occAtr;
    }

    /**
     * Sets the value of the occAtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOccAtr(JAXBElement<Integer> value) {
        this.occAtr = value;
    }

}
