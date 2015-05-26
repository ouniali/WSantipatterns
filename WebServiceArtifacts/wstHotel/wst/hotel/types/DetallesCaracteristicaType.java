
package wst.hotel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detallesCaracteristicaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detallesCaracteristicaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codDet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dscDet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detallesCaracteristicaType", propOrder = {
    "codDet",
    "dscDet"
})
public class DetallesCaracteristicaType {

    @XmlElement(required = true)
    protected String codDet;
    @XmlElementRef(name = "dscDet", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dscDet;

    /**
     * Gets the value of the codDet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDet() {
        return codDet;
    }

    /**
     * Sets the value of the codDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDet(String value) {
        this.codDet = value;
    }

    /**
     * Gets the value of the dscDet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDscDet() {
        return dscDet;
    }

    /**
     * Sets the value of the dscDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDscDet(JAXBElement<String> value) {
        this.dscDet = value;
    }

}
