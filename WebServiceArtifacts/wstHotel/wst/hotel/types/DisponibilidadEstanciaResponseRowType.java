
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
 * <p>Java class for disponibilidadEstanciaResponseRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disponibilidadEstanciaResponseRowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refSer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nomHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zonaGeografica" type="{types.hotel.wst}zonaType" minOccurs="0"/>
 *         &lt;element name="catHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pvpMin" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="habitacionesPrecios" type="{types.hotel.wst}habitacionesPreciosType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disponibilidadEstanciaResponseRowType", propOrder = {
    "refSer",
    "nomHot",
    "zonaGeografica",
    "catHot",
    "pvpMin",
    "habitacionesPrecios"
})
public class DisponibilidadEstanciaResponseRowType {

    @XmlElementRef(name = "refSer", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> refSer;
    @XmlElementRef(name = "nomHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomHot;
    @XmlElementRef(name = "zonaGeografica", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<ZonaType> zonaGeografica;
    @XmlElementRef(name = "catHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> catHot;
    @XmlElementRef(name = "pvpMin", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> pvpMin;
    @XmlElement(required = true)
    protected List<HabitacionesPreciosType> habitacionesPrecios;

    /**
     * Gets the value of the refSer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRefSer() {
        return refSer;
    }

    /**
     * Sets the value of the refSer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRefSer(JAXBElement<Integer> value) {
        this.refSer = value;
    }

    /**
     * Gets the value of the nomHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomHot() {
        return nomHot;
    }

    /**
     * Sets the value of the nomHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomHot(JAXBElement<String> value) {
        this.nomHot = value;
    }

    /**
     * Gets the value of the zonaGeografica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ZonaType }{@code >}
     *     
     */
    public JAXBElement<ZonaType> getZonaGeografica() {
        return zonaGeografica;
    }

    /**
     * Sets the value of the zonaGeografica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ZonaType }{@code >}
     *     
     */
    public void setZonaGeografica(JAXBElement<ZonaType> value) {
        this.zonaGeografica = value;
    }

    /**
     * Gets the value of the catHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCatHot() {
        return catHot;
    }

    /**
     * Sets the value of the catHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCatHot(JAXBElement<String> value) {
        this.catHot = value;
    }

    /**
     * Gets the value of the pvpMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getPvpMin() {
        return pvpMin;
    }

    /**
     * Sets the value of the pvpMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setPvpMin(JAXBElement<Float> value) {
        this.pvpMin = value;
    }

    /**
     * Gets the value of the habitacionesPrecios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the habitacionesPrecios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHabitacionesPrecios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HabitacionesPreciosType }
     * 
     * 
     */
    public List<HabitacionesPreciosType> getHabitacionesPrecios() {
        if (habitacionesPrecios == null) {
            habitacionesPrecios = new ArrayList<HabitacionesPreciosType>();
        }
        return this.habitacionesPrecios;
    }

}
