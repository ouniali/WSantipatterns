
package uk.ac.ebi.ontology_lookup.ontologyquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.xml.xml_soap.Map;


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
 *         &lt;element name="getAllTermsFromOntologyReturn" type="{http://xml.apache.org/xml-soap}Map"/>
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
    "getAllTermsFromOntologyReturn"
})
@XmlRootElement(name = "getAllTermsFromOntologyResponse")
public class GetAllTermsFromOntologyResponse {

    @XmlElement(required = true)
    protected Map getAllTermsFromOntologyReturn;

    /**
     * Gets the value of the getAllTermsFromOntologyReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getGetAllTermsFromOntologyReturn() {
        return getAllTermsFromOntologyReturn;
    }

    /**
     * Sets the value of the getAllTermsFromOntologyReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setGetAllTermsFromOntologyReturn(Map value) {
        this.getAllTermsFromOntologyReturn = value;
    }

}
