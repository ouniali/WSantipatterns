
package wst.hotel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosContactoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosContactoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tlfHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tf2Hot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faxHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosContactoType", propOrder = {
    "tlfHot",
    "tf2Hot",
    "faxHot",
    "email",
    "urlHot"
})
public class DatosContactoType {

    @XmlElementRef(name = "tlfHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tlfHot;
    @XmlElementRef(name = "tf2Hot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tf2Hot;
    @XmlElementRef(name = "faxHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faxHot;
    @XmlElementRef(name = "email", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "urlHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urlHot;

    /**
     * Gets the value of the tlfHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTlfHot() {
        return tlfHot;
    }

    /**
     * Sets the value of the tlfHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTlfHot(JAXBElement<String> value) {
        this.tlfHot = value;
    }

    /**
     * Gets the value of the tf2Hot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTf2Hot() {
        return tf2Hot;
    }

    /**
     * Sets the value of the tf2Hot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTf2Hot(JAXBElement<String> value) {
        this.tf2Hot = value;
    }

    /**
     * Gets the value of the faxHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxHot() {
        return faxHot;
    }

    /**
     * Sets the value of the faxHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxHot(JAXBElement<String> value) {
        this.faxHot = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the urlHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlHot() {
        return urlHot;
    }

    /**
     * Sets the value of the urlHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlHot(JAXBElement<String> value) {
        this.urlHot = value;
    }

}
