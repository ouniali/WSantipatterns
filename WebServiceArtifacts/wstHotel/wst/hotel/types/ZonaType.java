
package wst.hotel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zonaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zonaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refZge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscZge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occZge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zonaType", propOrder = {
    "refZge",
    "dscZge",
    "occZge"
})
public class ZonaType {

    @XmlElementRef(name = "refZge", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refZge;
    @XmlElementRef(name = "dscZge", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dscZge;
    @XmlElementRef(name = "occZge", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> occZge;

    /**
     * Gets the value of the refZge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefZge() {
        return refZge;
    }

    /**
     * Sets the value of the refZge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefZge(JAXBElement<String> value) {
        this.refZge = value;
    }

    /**
     * Gets the value of the dscZge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDscZge() {
        return dscZge;
    }

    /**
     * Sets the value of the dscZge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDscZge(JAXBElement<String> value) {
        this.dscZge = value;
    }

    /**
     * Gets the value of the occZge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOccZge() {
        return occZge;
    }

    /**
     * Sets the value of the occZge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOccZge(JAXBElement<Integer> value) {
        this.occZge = value;
    }

}
