
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
 * <p>Java class for atributosHotelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atributosHotelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAtr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dscAtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detallesAtributos" type="{types.hotel.wst}detallesAtributosType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atributosHotelType", propOrder = {
    "codAtr",
    "dscAtr",
    "detallesAtributos"
})
public class AtributosHotelType {

    @XmlElement(required = true)
    protected String codAtr;
    @XmlElementRef(name = "dscAtr", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dscAtr;
    @XmlElement(required = true)
    protected List<DetallesAtributosType> detallesAtributos;

    /**
     * Gets the value of the codAtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAtr() {
        return codAtr;
    }

    /**
     * Sets the value of the codAtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAtr(String value) {
        this.codAtr = value;
    }

    /**
     * Gets the value of the dscAtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDscAtr() {
        return dscAtr;
    }

    /**
     * Sets the value of the dscAtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDscAtr(JAXBElement<String> value) {
        this.dscAtr = value;
    }

    /**
     * Gets the value of the detallesAtributos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detallesAtributos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetallesAtributos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetallesAtributosType }
     * 
     * 
     */
    public List<DetallesAtributosType> getDetallesAtributos() {
        if (detallesAtributos == null) {
            detallesAtributos = new ArrayList<DetallesAtributosType>();
        }
        return this.detallesAtributos;
    }

}
