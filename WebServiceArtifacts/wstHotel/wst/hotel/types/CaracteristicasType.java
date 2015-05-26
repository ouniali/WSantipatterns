
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
 * <p>Java class for caracteristicasType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="caracteristicasType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codCar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dscCar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="txtCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalles" type="{types.hotel.wst}detallesCaracteristicaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "caracteristicasType", propOrder = {
    "codCar",
    "dscCar",
    "txtCar",
    "detalles"
})
public class CaracteristicasType {

    @XmlElement(required = true)
    protected String codCar;
    @XmlElement(required = true)
    protected String dscCar;
    @XmlElementRef(name = "txtCar", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txtCar;
    @XmlElement(nillable = true)
    protected List<DetallesCaracteristicaType> detalles;

    /**
     * Gets the value of the codCar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCar() {
        return codCar;
    }

    /**
     * Sets the value of the codCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCar(String value) {
        this.codCar = value;
    }

    /**
     * Gets the value of the dscCar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscCar() {
        return dscCar;
    }

    /**
     * Sets the value of the dscCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscCar(String value) {
        this.dscCar = value;
    }

    /**
     * Gets the value of the txtCar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTxtCar() {
        return txtCar;
    }

    /**
     * Sets the value of the txtCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTxtCar(JAXBElement<String> value) {
        this.txtCar = value;
    }

    /**
     * Gets the value of the detalles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetallesCaracteristicaType }
     * 
     * 
     */
    public List<DetallesCaracteristicaType> getDetalles() {
        if (detalles == null) {
            detalles = new ArrayList<DetallesCaracteristicaType>();
        }
        return this.detalles;
    }

}
