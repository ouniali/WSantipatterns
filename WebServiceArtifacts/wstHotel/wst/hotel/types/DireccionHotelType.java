
package wst.hotel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for direccionHotelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="direccionHotelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paiHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciuHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codPos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dirHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localizacionMaps" type="{types.hotel.wst}localizacionMapaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "direccionHotelType", propOrder = {
    "paiHot",
    "ciuHot",
    "estHot",
    "codPos",
    "dirHot",
    "localizacionMaps"
})
public class DireccionHotelType {

    @XmlElementRef(name = "paiHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paiHot;
    @XmlElementRef(name = "ciuHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ciuHot;
    @XmlElementRef(name = "estHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estHot;
    @XmlElementRef(name = "codPos", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codPos;
    protected String dirHot;
    @XmlElementRef(name = "localizacionMaps", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizacionMapaType> localizacionMaps;

    /**
     * Gets the value of the paiHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaiHot() {
        return paiHot;
    }

    /**
     * Sets the value of the paiHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaiHot(JAXBElement<String> value) {
        this.paiHot = value;
    }

    /**
     * Gets the value of the ciuHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCiuHot() {
        return ciuHot;
    }

    /**
     * Sets the value of the ciuHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCiuHot(JAXBElement<String> value) {
        this.ciuHot = value;
    }

    /**
     * Gets the value of the estHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstHot() {
        return estHot;
    }

    /**
     * Sets the value of the estHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstHot(JAXBElement<String> value) {
        this.estHot = value;
    }

    /**
     * Gets the value of the codPos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodPos() {
        return codPos;
    }

    /**
     * Sets the value of the codPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodPos(JAXBElement<String> value) {
        this.codPos = value;
    }

    /**
     * Gets the value of the dirHot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirHot() {
        return dirHot;
    }

    /**
     * Sets the value of the dirHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirHot(String value) {
        this.dirHot = value;
    }

    /**
     * Gets the value of the localizacionMaps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalizacionMapaType }{@code >}
     *     
     */
    public JAXBElement<LocalizacionMapaType> getLocalizacionMaps() {
        return localizacionMaps;
    }

    /**
     * Sets the value of the localizacionMaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalizacionMapaType }{@code >}
     *     
     */
    public void setLocalizacionMaps(JAXBElement<LocalizacionMapaType> value) {
        this.localizacionMaps = value;
    }

}
