
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
 *         &lt;element name="cpdbIdsFg" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="cpdbIdsBg" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cpdbIdsFg",
    "cpdbIdsBg",
    "accType",
    "pThreshold"
})
@XmlRootElement(name = "overRepresentationAnalysis")
public class OverRepresentationAnalysis {

    @XmlElement(required = true)
    protected String entityType;
    @XmlElement(required = true)
    protected String fsetType;
    @XmlElement(required = true)
    protected List<String> cpdbIdsFg;
    protected List<String> cpdbIdsBg;
    protected String accType;
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
     * Gets the value of the cpdbIdsFg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpdbIdsFg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpdbIdsFg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCpdbIdsFg() {
        if (cpdbIdsFg == null) {
            cpdbIdsFg = new ArrayList<String>();
        }
        return this.cpdbIdsFg;
    }

    /**
     * Gets the value of the cpdbIdsBg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpdbIdsBg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpdbIdsBg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCpdbIdsBg() {
        if (cpdbIdsBg == null) {
            cpdbIdsBg = new ArrayList<String>();
        }
        return this.cpdbIdsBg;
    }

    /**
     * Gets the value of the accType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccType() {
        return accType;
    }

    /**
     * Sets the value of the accType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccType(String value) {
        this.accType = value;
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
