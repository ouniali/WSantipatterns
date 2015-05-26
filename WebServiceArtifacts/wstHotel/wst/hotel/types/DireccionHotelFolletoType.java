
package wst.hotel.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for direccionHotelFolletoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="direccionHotelFolletoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paiHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciuHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codPos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dirHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "direccionHotelFolletoType", propOrder = {
    "paiHot",
    "ciuHot",
    "estHot",
    "codPos",
    "dirHot"
})
public class DireccionHotelFolletoType {

    protected String paiHot;
    protected String ciuHot;
    protected String estHot;
    protected String codPos;
    protected String dirHot;

    /**
     * Gets the value of the paiHot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaiHot() {
        return paiHot;
    }

    /**
     * Sets the value of the paiHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaiHot(String value) {
        this.paiHot = value;
    }

    /**
     * Gets the value of the ciuHot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiuHot() {
        return ciuHot;
    }

    /**
     * Sets the value of the ciuHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiuHot(String value) {
        this.ciuHot = value;
    }

    /**
     * Gets the value of the estHot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstHot() {
        return estHot;
    }

    /**
     * Sets the value of the estHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstHot(String value) {
        this.estHot = value;
    }

    /**
     * Gets the value of the codPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPos() {
        return codPos;
    }

    /**
     * Sets the value of the codPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPos(String value) {
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

}
