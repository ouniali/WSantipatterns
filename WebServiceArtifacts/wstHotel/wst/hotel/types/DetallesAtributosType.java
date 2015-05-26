
package wst.hotel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detallesAtributosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detallesAtributosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codDetAtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscDetAtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detallesAtributosType", propOrder = {
    "codDetAtr",
    "dscDetAtr"
})
public class DetallesAtributosType {

    @XmlElementRef(name = "codDetAtr", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codDetAtr;
    @XmlElementRef(name = "dscDetAtr", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dscDetAtr;

    /**
     * Gets the value of the codDetAtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodDetAtr() {
        return codDetAtr;
    }

    /**
     * Sets the value of the codDetAtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodDetAtr(JAXBElement<String> value) {
        this.codDetAtr = value;
    }

    /**
     * Gets the value of the dscDetAtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDscDetAtr() {
        return dscDetAtr;
    }

    /**
     * Sets the value of the dscDetAtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDscDetAtr(JAXBElement<String> value) {
        this.dscDetAtr = value;
    }

}
