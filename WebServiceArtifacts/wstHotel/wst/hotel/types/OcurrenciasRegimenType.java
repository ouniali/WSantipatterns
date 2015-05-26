
package wst.hotel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ocurrenciasRegimenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ocurrenciasRegimenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codRga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscRga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occRga" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ocurrenciasRegimenType", propOrder = {
    "codRga",
    "dscRga",
    "occRga"
})
public class OcurrenciasRegimenType {

    @XmlElementRef(name = "codRga", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codRga;
    @XmlElementRef(name = "dscRga", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dscRga;
    @XmlElementRef(name = "occRga", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> occRga;

    /**
     * Gets the value of the codRga property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodRga() {
        return codRga;
    }

    /**
     * Sets the value of the codRga property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodRga(JAXBElement<String> value) {
        this.codRga = value;
    }

    /**
     * Gets the value of the dscRga property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDscRga() {
        return dscRga;
    }

    /**
     * Sets the value of the dscRga property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDscRga(JAXBElement<String> value) {
        this.dscRga = value;
    }

    /**
     * Gets the value of the occRga property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOccRga() {
        return occRga;
    }

    /**
     * Sets the value of the occRga property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOccRga(JAXBElement<Integer> value) {
        this.occRga = value;
    }

}
