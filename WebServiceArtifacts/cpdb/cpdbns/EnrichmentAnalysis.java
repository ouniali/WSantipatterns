
package cpdbns;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fsetType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpdbIdsMeasurements" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="pThreshold" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
    "entityType",
    "fsetType",
    "cpdbIdsMeasurements",
    "pThreshold"
})
@XmlRootElement(name = "enrichmentAnalysis")
public class EnrichmentAnalysis {

    @XmlElement(required = true)
    protected String entityType;
    @XmlElement(required = true)
    protected String fsetType;
    @XmlElement(required = true)
    protected List<String> cpdbIdsMeasurements;
    protected Float pThreshold;

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
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
     * Gets the value of the cpdbIdsMeasurements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpdbIdsMeasurements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpdbIdsMeasurements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCpdbIdsMeasurements() {
        if (cpdbIdsMeasurements == null) {
            cpdbIdsMeasurements = new ArrayList<String>();
        }
        return this.cpdbIdsMeasurements;
    }

    /**
     * Gets the value of the pThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPThreshold() {
        return pThreshold;
    }

    /**
     * Sets the value of the pThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPThreshold(Float value) {
        this.pThreshold = value;
    }

}
