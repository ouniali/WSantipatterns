
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRequestABNStatusFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRequestABNStatusFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestABNFilter">
 *       &lt;sequence>
 *         &lt;element name="activeABNs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentGSTRegistrationOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRequestABNStatusFilter", propOrder = {
    "activeABNs",
    "currentGSTRegistrationOnly"
})
public class ExternalRequestABNStatusFilter
    extends ExternalRequestABNFilter
{

    protected String activeABNs;
    protected String currentGSTRegistrationOnly;

    /**
     * Gets the value of the activeABNs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveABNs() {
        return activeABNs;
    }

    /**
     * Sets the value of the activeABNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveABNs(String value) {
        this.activeABNs = value;
    }

    /**
     * Gets the value of the currentGSTRegistrationOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentGSTRegistrationOnly() {
        return currentGSTRegistrationOnly;
    }

    /**
     * Sets the value of the currentGSTRegistrationOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentGSTRegistrationOnly(String value) {
        this.currentGSTRegistrationOnly = value;
    }

}
