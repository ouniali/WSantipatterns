
package wst.hotel.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fichaHotelResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fichaHotelResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomHot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cadHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catHot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion" type="{types.hotel.wst}direccionHotelType" minOccurs="0"/>
 *         &lt;element name="atributos" type="{types.hotel.wst}atributosHotelType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datosContacto" type="{types.hotel.wst}datosContactoType" minOccurs="0"/>
 *         &lt;element name="imgHot" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="caracteristicas" type="{types.hotel.wst}caracteristicasType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fichaHotelResponseType", propOrder = {
    "nomHot",
    "cadHot",
    "tipHot",
    "catHot",
    "direccion",
    "atributos",
    "datosContacto",
    "imgHot",
    "caracteristicas"
})
public class FichaHotelResponseType {

    @XmlElement(required = true)
    protected String nomHot;
    @XmlElementRef(name = "cadHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cadHot;
    @XmlElementRef(name = "tipHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipHot;
    @XmlElement(required = true)
    protected String catHot;
    @XmlElementRef(name = "direccion", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<DireccionHotelType> direccion;
    @XmlElement(nillable = true)
    protected List<AtributosHotelType> atributos;
    @XmlElementRef(name = "datosContacto", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosContactoType> datosContacto;
    @XmlElement(nillable = true)
    protected List<String> imgHot;
    @XmlElement(nillable = true)
    protected List<CaracteristicasType> caracteristicas;

    /**
     * Gets the value of the nomHot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomHot() {
        return nomHot;
    }

    /**
     * Sets the value of the nomHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomHot(String value) {
        this.nomHot = value;
    }

    /**
     * Gets the value of the cadHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadHot() {
        return cadHot;
    }

    /**
     * Sets the value of the cadHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadHot(JAXBElement<String> value) {
        this.cadHot = value;
    }

    /**
     * Gets the value of the tipHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipHot() {
        return tipHot;
    }

    /**
     * Sets the value of the tipHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipHot(JAXBElement<String> value) {
        this.tipHot = value;
    }

    /**
     * Gets the value of the catHot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatHot() {
        return catHot;
    }

    /**
     * Sets the value of the catHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatHot(String value) {
        this.catHot = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DireccionHotelType }{@code >}
     *     
     */
    public JAXBElement<DireccionHotelType> getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DireccionHotelType }{@code >}
     *     
     */
    public void setDireccion(JAXBElement<DireccionHotelType> value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the atributos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atributos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtributos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtributosHotelType }
     * 
     * 
     */
    public List<AtributosHotelType> getAtributos() {
        if (atributos == null) {
            atributos = new ArrayList<AtributosHotelType>();
        }
        return this.atributos;
    }

    /**
     * Gets the value of the datosContacto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosContactoType }{@code >}
     *     
     */
    public JAXBElement<DatosContactoType> getDatosContacto() {
        return datosContacto;
    }

    /**
     * Sets the value of the datosContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosContactoType }{@code >}
     *     
     */
    public void setDatosContacto(JAXBElement<DatosContactoType> value) {
        this.datosContacto = value;
    }

    /**
     * Gets the value of the imgHot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imgHot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImgHot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImgHot() {
        if (imgHot == null) {
            imgHot = new ArrayList<String>();
        }
        return this.imgHot;
    }

    /**
     * Gets the value of the caracteristicas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caracteristicas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaracteristicas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaracteristicasType }
     * 
     * 
     */
    public List<CaracteristicasType> getCaracteristicas() {
        if (caracteristicas == null) {
            caracteristicas = new ArrayList<CaracteristicasType>();
        }
        return this.caracteristicas;
    }

}
