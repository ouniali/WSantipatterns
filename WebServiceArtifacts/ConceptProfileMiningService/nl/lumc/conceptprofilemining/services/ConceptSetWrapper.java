
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conceptSetWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conceptSetWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conceptIDsAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptSetWrapper", propOrder = {
    "conceptIDsAsString"
})
public class ConceptSetWrapper {

    protected String conceptIDsAsString;

    /**
     * Gets the value of the conceptIDsAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptIDsAsString() {
        return conceptIDsAsString;
    }

    /**
     * Sets the value of the conceptIDsAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptIDsAsString(String value) {
        this.conceptIDsAsString = value;
    }

}
