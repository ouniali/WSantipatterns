
package wst.hotel.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preciosRegimenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="preciosRegimenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pvp" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="cadRes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codRga" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grpTpr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preciosRegimenType", propOrder = {
    "pvp",
    "cadRes",
    "codRga",
    "status",
    "grpTpr"
})
public class PreciosRegimenType {

    protected float pvp;
    @XmlElement(required = true)
    protected String cadRes;
    @XmlElement(required = true)
    protected String codRga;
    @XmlElement(required = true)
    protected String status;
    protected String grpTpr;

    /**
     * Gets the value of the pvp property.
     * 
     */
    public float getPvp() {
        return pvp;
    }

    /**
     * Sets the value of the pvp property.
     * 
     */
    public void setPvp(float value) {
        this.pvp = value;
    }

    /**
     * Gets the value of the cadRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadRes() {
        return cadRes;
    }

    /**
     * Sets the value of the cadRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadRes(String value) {
        this.cadRes = value;
    }

    /**
     * Gets the value of the codRga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRga() {
        return codRga;
    }

    /**
     * Sets the value of the codRga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRga(String value) {
        this.codRga = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the grpTpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpTpr() {
        return grpTpr;
    }

    /**
     * Sets the value of the grpTpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpTpr(String value) {
        this.grpTpr = value;
    }

}
