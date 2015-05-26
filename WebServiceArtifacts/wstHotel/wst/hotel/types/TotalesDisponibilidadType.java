
package wst.hotel.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for totalesDisponibilidadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="totalesDisponibilidadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalAtributos" type="{types.hotel.wst}ocurrenciasAtributoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalCategorias" type="{types.hotel.wst}ocurrenciasCategoriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalRegimenes" type="{types.hotel.wst}ocurrenciasRegimenType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zonas" type="{types.hotel.wst}zonaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "totalesDisponibilidadType", propOrder = {
    "totalAtributos",
    "totalCategorias",
    "totalRegimenes",
    "zonas"
})
public class TotalesDisponibilidadType {

    @XmlElement(nillable = true)
    protected List<OcurrenciasAtributoType> totalAtributos;
    @XmlElement(nillable = true)
    protected List<OcurrenciasCategoriaType> totalCategorias;
    @XmlElement(nillable = true)
    protected List<OcurrenciasRegimenType> totalRegimenes;
    @XmlElement(nillable = true)
    protected List<ZonaType> zonas;

    /**
     * Gets the value of the totalAtributos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalAtributos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalAtributos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OcurrenciasAtributoType }
     * 
     * 
     */
    public List<OcurrenciasAtributoType> getTotalAtributos() {
        if (totalAtributos == null) {
            totalAtributos = new ArrayList<OcurrenciasAtributoType>();
        }
        return this.totalAtributos;
    }

    /**
     * Gets the value of the totalCategorias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalCategorias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalCategorias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OcurrenciasCategoriaType }
     * 
     * 
     */
    public List<OcurrenciasCategoriaType> getTotalCategorias() {
        if (totalCategorias == null) {
            totalCategorias = new ArrayList<OcurrenciasCategoriaType>();
        }
        return this.totalCategorias;
    }

    /**
     * Gets the value of the totalRegimenes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalRegimenes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalRegimenes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OcurrenciasRegimenType }
     * 
     * 
     */
    public List<OcurrenciasRegimenType> getTotalRegimenes() {
        if (totalRegimenes == null) {
            totalRegimenes = new ArrayList<OcurrenciasRegimenType>();
        }
        return this.totalRegimenes;
    }

    /**
     * Gets the value of the zonas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zonas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZonas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZonaType }
     * 
     * 
     */
    public List<ZonaType> getZonas() {
        if (zonas == null) {
            zonas = new ArrayList<ZonaType>();
        }
        return this.zonas;
    }

}
