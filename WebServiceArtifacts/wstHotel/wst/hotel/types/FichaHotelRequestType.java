
package wst.hotel.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fichaHotelRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fichaHotelRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refSer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codIdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fichaHotelRequestType", propOrder = {
    "idUsuario",
    "refSer",
    "codIdi"
})
public class FichaHotelRequestType {

    @XmlElement(required = true)
    protected String idUsuario;
    protected int refSer;
    @XmlElement(required = true, nillable = true)
    protected String codIdi;

    /**
     * Gets the value of the idUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Sets the value of the idUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuario(String value) {
        this.idUsuario = value;
    }

    /**
     * Gets the value of the refSer property.
     * 
     */
    public int getRefSer() {
        return refSer;
    }

    /**
     * Sets the value of the refSer property.
     * 
     */
    public void setRefSer(int value) {
        this.refSer = value;
    }

    /**
     * Gets the value of the codIdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodIdi() {
        return codIdi;
    }

    /**
     * Sets the value of the codIdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodIdi(String value) {
        this.codIdi = value;
    }

}
