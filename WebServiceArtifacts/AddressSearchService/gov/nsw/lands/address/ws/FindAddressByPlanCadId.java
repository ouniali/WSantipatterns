
package gov.nsw.lands.address.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cadid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="projection" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cadid",
    "projection"
})
@XmlRootElement(name = "findAddressByPlanCadId")
public class FindAddressByPlanCadId {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cadid;
    @XmlElement(required = true, nillable = true)
    protected String projection;

    /**
     * Gets the value of the cadid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCadid() {
        return cadid;
    }

    /**
     * Sets the value of the cadid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCadid(Long value) {
        this.cadid = value;
    }

    /**
     * Gets the value of the projection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjection() {
        return projection;
    }

    /**
     * Sets the value of the projection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjection(String value) {
        this.projection = value;
    }

}
