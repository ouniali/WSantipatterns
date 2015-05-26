
package uk.ac.ebi.ontology_lookup.ontologyquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.xml.xml_soap.Vector;


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
 *         &lt;element name="rootTermId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ontologyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="childrenIds" type="{http://xml.apache.org/xml-soap}Vector"/>
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
    "rootTermId",
    "ontologyName",
    "childrenIds"
})
@XmlRootElement(name = "getChildrenFromRoot")
public class GetChildrenFromRoot {

    @XmlElement(required = true)
    protected String rootTermId;
    @XmlElement(required = true)
    protected String ontologyName;
    @XmlElement(required = true)
    protected Vector childrenIds;

    /**
     * Gets the value of the rootTermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootTermId() {
        return rootTermId;
    }

    /**
     * Sets the value of the rootTermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootTermId(String value) {
        this.rootTermId = value;
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

    /**
     * Gets the value of the childrenIds property.
     * 
     * @return
     *     possible object is
     *     {@link Vector }
     *     
     */
    public Vector getChildrenIds() {
        return childrenIds;
    }

    /**
     * Sets the value of the childrenIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector }
     *     
     */
    public void setChildrenIds(Vector value) {
        this.childrenIds = value;
    }

}
