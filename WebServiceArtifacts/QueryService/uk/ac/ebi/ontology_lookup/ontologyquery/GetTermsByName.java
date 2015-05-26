
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
 *         &lt;element name="partialName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ontologyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reverseKeyOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "partialName",
    "ontologyName",
    "reverseKeyOrder"
})
@XmlRootElement(name = "getTermsByName")
public class GetTermsByName {

    @XmlElement(required = true)
    protected String partialName;
    @XmlElement(required = true)
    protected String ontologyName;
    protected boolean reverseKeyOrder;

    /**
     * Gets the value of the partialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialName() {
        return partialName;
    }

    /**
     * Sets the value of the partialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialName(String value) {
        this.partialName = value;
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
     * Gets the value of the reverseKeyOrder property.
     * 
     */
    public boolean isReverseKeyOrder() {
        return reverseKeyOrder;
    }

    /**
     * Sets the value of the reverseKeyOrder property.
     * 
     */
    public void setReverseKeyOrder(boolean value) {
        this.reverseKeyOrder = value;
    }

}
