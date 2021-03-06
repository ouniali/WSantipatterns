
package uk.ac.ebi.ontology_lookup.ontologyquery;

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
 *         &lt;element name="exactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ontologyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "exactName",
    "ontologyName"
})
@XmlRootElement(name = "getTermsByExactName")
public class GetTermsByExactName {

    @XmlElement(required = true)
    protected String exactName;
    @XmlElement(required = true)
    protected String ontologyName;

    /**
     * Gets the value of the exactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExactName() {
        return exactName;
    }

    /**
     * Sets the value of the exactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExactName(String value) {
        this.exactName = value;
    }

    /**
     * Gets the value of the ontologyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntologyName() {
        return ontologyName;
    }

    /**
     * Sets the value of the ontologyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntologyName(String value) {
        this.ontologyName = value;
    }

}
