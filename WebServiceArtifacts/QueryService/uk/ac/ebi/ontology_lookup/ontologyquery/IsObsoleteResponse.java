
package uk.ac.ebi.ontology_lookup.ontologyquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="isObsoleteReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isObsoleteReturn"
})
@XmlRootElement(name = "isObsoleteResponse")
public class IsObsoleteResponse {

    protected boolean isObsoleteReturn;

    /**
     * Gets the value of the isObsoleteReturn property.
     * 
     */
    public boolean isIsObsoleteReturn() {
        return isObsoleteReturn;
    }

    /**
     * Sets the value of the isObsoleteReturn property.
     * 
     */
    public void setIsObsoleteReturn(boolean value) {
        this.isObsoleteReturn = value;
    }

}
