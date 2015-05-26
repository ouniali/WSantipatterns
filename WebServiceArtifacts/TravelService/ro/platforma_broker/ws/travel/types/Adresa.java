
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Adresa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adresa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Apartament" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bloc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodPostal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Judet" type="{http://www.platforma-broker.ro/ws/travel/types/}Judet" minOccurs="0"/>
 *         &lt;element name="Localitate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumarStrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scara" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Strada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adresa", propOrder = {
    "apartament",
    "bloc",
    "codPostal",
    "judet",
    "localitate",
    "numarStrada",
    "scara",
    "strada"
})
public class Adresa {

    @XmlElementRef(name = "Apartament", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apartament;
    @XmlElementRef(name = "Bloc", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bloc;
    @XmlElementRef(name = "CodPostal", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPostal;
    @XmlElement(name = "Judet")
    @XmlSchemaType(name = "string")
    protected Judet judet;
    @XmlElementRef(name = "Localitate", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localitate;
    @XmlElementRef(name = "NumarStrada", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numarStrada;
    @XmlElementRef(name = "Scara", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scara;
    @XmlElementRef(name = "Strada", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strada;

    /**
     * Gets the value of the apartament property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApartament() {
        return apartament;
    }

    /**
     * Sets the value of the apartament property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApartament(JAXBElement<String> value) {
        this.apartament = value;
    }

    /**
     * Gets the value of the bloc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBloc() {
        return bloc;
    }

    /**
     * Sets the value of the bloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBloc(JAXBElement<String> value) {
        this.bloc = value;
    }

    /**
     * Gets the value of the codPostal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodPostal() {
        return codPostal;
    }

    /**
     * Sets the value of the codPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodPostal(JAXBElement<Integer> value) {
        this.codPostal = value;
    }

    /**
     * Gets the value of the judet property.
     * 
     * @return
     *     possible object is
     *     {@link Judet }
     *     
     */
    public Judet getJudet() {
        return judet;
    }

    /**
     * Sets the value of the judet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Judet }
     *     
     */
    public void setJudet(Judet value) {
        this.judet = value;
    }

    /**
     * Gets the value of the localitate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalitate() {
        return localitate;
    }

    /**
     * Sets the value of the localitate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalitate(JAXBElement<String> value) {
        this.localitate = value;
    }

    /**
     * Gets the value of the numarStrada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumarStrada() {
        return numarStrada;
    }

    /**
     * Sets the value of the numarStrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumarStrada(JAXBElement<String> value) {
        this.numarStrada = value;
    }

    /**
     * Gets the value of the scara property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScara() {
        return scara;
    }

    /**
     * Sets the value of the scara property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScara(JAXBElement<String> value) {
        this.scara = value;
    }

    /**
     * Gets the value of the strada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrada() {
        return strada;
    }

    /**
     * Sets the value of the strada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrada(JAXBElement<String> value) {
        this.strada = value;
    }

}
