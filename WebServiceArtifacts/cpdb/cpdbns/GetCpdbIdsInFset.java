
package cpdbns;

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
 *         &lt;element name="fsetId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fsetType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entsetType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "fsetId",
    "fsetType",
    "entsetType"
})
@XmlRootElement(name = "getCpdbIdsInFset")
public class GetCpdbIdsInFset {

    @XmlElement(required = true)
    protected String fsetId;
    @XmlElement(required = true)
    protected String fsetType;
    @XmlElement(required = true)
    protected String entsetType;

    /**
     * Gets the value of the fsetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsetId() {
        return fsetId;
    }

    /**
     * Sets the value of the fsetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsetId(String value) {
        this.fsetId = value;
    }

    /**
     * Gets the value of the fsetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsetType() {
        return fsetType;
    }

    /**
     * Sets the value of the fsetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsetType(String value) {
        this.fsetType = value;
    }

    /**
     * Gets the value of the entsetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntsetType() {
        return entsetType;
    }

    /**
     * Sets the value of the entsetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntsetType(String value) {
        this.entsetType = value;
    }

}
