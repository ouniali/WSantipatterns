
package au.gov.business.abr.abrxmlsearch;

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
 *         &lt;element name="ABRPayloadSearchResults" type="{http://abr.business.gov.au/ABRXMLSearch/}Payload"/>
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
    "abrPayloadSearchResults"
})
@XmlRootElement(name = "ABRSearchByNameAdvancedResponse")
public class ABRSearchByNameAdvancedResponse {

    @XmlElement(name = "ABRPayloadSearchResults", required = true, nillable = true)
    protected Payload abrPayloadSearchResults;

    /**
     * Gets the value of the abrPayloadSearchResults property.
     * 
     * @return
     *     possible object is
     *     {@link Payload }
     *     
     */
    public Payload getABRPayloadSearchResults() {
        return abrPayloadSearchResults;
    }

    /**
     * Sets the value of the abrPayloadSearchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payload }
     *     
     */
    public void setABRPayloadSearchResults(Payload value) {
        this.abrPayloadSearchResults = value;
    }

}
