
package wst.hotel.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fichaHotelFolletosResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fichaHotelFolletosResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomHot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cadHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catHot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion" type="{types.hotel.wst}direccionHotelFolletoType" minOccurs="0"/>
 *         &lt;element name="localizacionMapa" type="{types.hotel.wst}localizacionMapaFolletosType" minOccurs="0"/>
 *         &lt;element name="datosContacto" type="{types.hotel.wst}datosContactoType" minOccurs="0"/>
 *         &lt;element name="ImagenPpalCabecera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImagenPpalListado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicacion" type="{types.hotel.wst}ubicacionType" minOccurs="0"/>
 *         &lt;element name="habitaciones" type="{types.hotel.wst}habitacionesFolletoType" minOccurs="0"/>
 *         &lt;element name="imagenesHotel" type="{types.hotel.wst}imagenesHotelType" minOccurs="0"/>
 *         &lt;element name="atributos" type="{types.hotel.wst}atributosFolletosType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="infoExtra" type="{types.hotel.wst}infoExtraType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fichaHotelFolletosResponseType", propOrder = {
    "nomHot",
    "cadHot",
    "tipHot",
    "catHot",
    "direccion",
    "localizacionMapa",
    "datosContacto",
    "imagenPpalCabecera",
    "imagenPpalListado",
    "ubicacion",
    "habitaciones",
    "imagenesHotel",
    "atributos",
    "infoExtra"
})
public class FichaHotelFolletosResponseType {

    @XmlElement(required = true)
    protected String nomHot;
    protected String cadHot;
    protected String tipHot;
    @XmlElement(required = true)
    protected String catHot;
    protected DireccionHotelFolletoType direccion;
    protected LocalizacionMapaFolletosType localizacionMapa;
    protected DatosContactoType datosContacto;
    @XmlElement(name = "ImagenPpalCabecera")
    protected String imagenPpalCabecera;
    @XmlElement(name = "ImagenPpalListado")
    protected String imagenPpalListado;
    protected UbicacionType ubicacion;
    protected HabitacionesFolletoType habitaciones;
    protected ImagenesHotelType imagenesHotel;
    protected List<AtributosFolletosType> atributos;
    protected List<InfoExtraType> infoExtra;

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
     *     {@link String }
     *     
     */
    public String getCadHot() {
        return cadHot;
    }

    /**
     * Sets the value of the cadHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadHot(String value) {
        this.cadHot = value;
    }

    /**
     * Gets the value of the tipHot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipHot() {
        return tipHot;
    }

    /**
     * Sets the value of the tipHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipHot(String value) {
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
     *     {@link DireccionHotelFolletoType }
     *     
     */
    public DireccionHotelFolletoType getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DireccionHotelFolletoType }
     *     
     */
    public void setDireccion(DireccionHotelFolletoType value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the localizacionMapa property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizacionMapaFolletosType }
     *     
     */
    public LocalizacionMapaFolletosType getLocalizacionMapa() {
        return localizacionMapa;
    }

    /**
     * Sets the value of the localizacionMapa property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizacionMapaFolletosType }
     *     
     */
    public void setLocalizacionMapa(LocalizacionMapaFolletosType value) {
        this.localizacionMapa = value;
    }

    /**
     * Gets the value of the datosContacto property.
     * 
     * @return
     *     possible object is
     *     {@link DatosContactoType }
     *     
     */
    public DatosContactoType getDatosContacto() {
        return datosContacto;
    }

    /**
     * Sets the value of the datosContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosContactoType }
     *     
     */
    public void setDatosContacto(DatosContactoType value) {
        this.datosContacto = value;
    }

    /**
     * Gets the value of the imagenPpalCabecera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagenPpalCabecera() {
        return imagenPpalCabecera;
    }

    /**
     * Sets the value of the imagenPpalCabecera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagenPpalCabecera(String value) {
        this.imagenPpalCabecera = value;
    }

    /**
     * Gets the value of the imagenPpalListado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagenPpalListado() {
        return imagenPpalListado;
    }

    /**
     * Sets the value of the imagenPpalListado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagenPpalListado(String value) {
        this.imagenPpalListado = value;
    }

    /**
     * Gets the value of the ubicacion property.
     * 
     * @return
     *     possible object is
     *     {@link UbicacionType }
     *     
     */
    public UbicacionType getUbicacion() {
        return ubicacion;
    }

    /**
     * Sets the value of the ubicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link UbicacionType }
     *     
     */
    public void setUbicacion(UbicacionType value) {
        this.ubicacion = value;
    }

    /**
     * Gets the value of the habitaciones property.
     * 
     * @return
     *     possible object is
     *     {@link HabitacionesFolletoType }
     *     
     */
    public HabitacionesFolletoType getHabitaciones() {
        return habitaciones;
    }

    /**
     * Sets the value of the habitaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link HabitacionesFolletoType }
     *     
     */
    public void setHabitaciones(HabitacionesFolletoType value) {
        this.habitaciones = value;
    }

    /**
     * Gets the value of the imagenesHotel property.
     * 
     * @return
     *     possible object is
     *     {@link ImagenesHotelType }
     *     
     */
    public ImagenesHotelType getImagenesHotel() {
        return imagenesHotel;
    }

    /**
     * Sets the value of the imagenesHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagenesHotelType }
     *     
     */
    public void setImagenesHotel(ImagenesHotelType value) {
        this.imagenesHotel = value;
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
     * {@link AtributosFolletosType }
     * 
     * 
     */
    public List<AtributosFolletosType> getAtributos() {
        if (atributos == null) {
            atributos = new ArrayList<AtributosFolletosType>();
        }
        return this.atributos;
    }

    /**
     * Gets the value of the infoExtra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoExtra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoExtra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoExtraType }
     * 
     * 
     */
    public List<InfoExtraType> getInfoExtra() {
        if (infoExtra == null) {
            infoExtra = new ArrayList<InfoExtraType>();
        }
        return this.infoExtra;
    }

}
