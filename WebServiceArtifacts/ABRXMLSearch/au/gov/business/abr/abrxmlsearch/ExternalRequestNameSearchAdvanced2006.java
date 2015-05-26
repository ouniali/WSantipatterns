
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRequestNameSearchAdvanced2006 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRequestNameSearchAdvanced2006">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestNameSearchAdvanced">
 *       &lt;sequence>
 *         &lt;element name="maxSearchResults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRequestNameSearchAdvanced2006", propOrder = {
    "maxSearchResults"
})
public class ExternalRequestNameSearchAdvanced2006
    extends ExternalRequestNameSearchAdvanced
{

    protected String maxSearchResults;

    /**
     * Gets the value of the maxSearchResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxSearchResults() {
        return maxSearchResults;
    }

    /**
     * Sets the value of the maxSearchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxSearchResults(String value) {
        this.maxSearchResults = value;
    }

}
