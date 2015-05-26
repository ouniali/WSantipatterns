
package wst.hotel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoHotelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoHotelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geoLoca" type="{types.hotel.wst}localizacionMapaType" minOccurs="0"/>
 *         &lt;element name="imgHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoHotelType", propOrder = {
    "geoLoca",
    "imgHot",
    "descHot"
})
public class InfoHotelType {

    @XmlElementRef(name = "geoLoca", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizacionMapaType> geoLoca;
    @XmlElementRef(name = "imgHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgHot;
    @XmlElementRef(name = "descHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descHot;

    /**
     * Gets the value of the geoLoca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalizacionMapaType }{@code >}
     *     
     */
    public JAXBElement<LocalizacionMapaType> getGeoLoca() {
        return geoLoca;
    }

    /**
     * Sets the value of the geoLoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalizacionMapaType }{@code >}
     *     
     */
    public void setGeoLoca(JAXBElement<LocalizacionMapaType> value) {
        this.geoLoca = value;
    }

    /**
     * Gets the value of the imgHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImgHot() {
        return imgHot;
    }

    /**
     * Sets the value of the imgHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImgHot(JAXBElement<String> value) {
        this.imgHot = value;
    }

    /**
     * Gets the value of the descHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescHot() {
        return descHot;
    }

    /**
     * Sets the value of the descHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescHot(JAXBElement<String> value) {
        this.descHot = value;
    }

}
