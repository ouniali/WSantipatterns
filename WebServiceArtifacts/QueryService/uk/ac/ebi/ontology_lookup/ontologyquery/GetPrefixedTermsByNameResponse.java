
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
 *         &lt;element name="getPrefixedTermsByNameReturn" type="{http://xml.apache.org/xml-soap}Map"/>
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
    "getPrefixedTermsByNameReturn"
})
@XmlRootElement(name = "getPrefixedTermsByNameResponse")
public class GetPrefixedTermsByNameResponse {

    @XmlElement(required = true)
    protected Map getPrefixedTermsByNameReturn;

    /**
     * Gets the value of the getPrefixedTermsByNameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getGetPrefixedTermsByNameReturn() {
        return getPrefixedTermsByNameReturn;
    }

    /**
     * Sets the value of the getPrefixedTermsByNameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setGetPrefixedTermsByNameReturn(Map value) {
        this.getPrefixedTermsByNameReturn = value;
    }

}
