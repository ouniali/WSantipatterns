
package au.gov.business.abr.abrxmlsearch;

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
 *         &lt;element name="externalNameSearch" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestNameSearchAdvanced" minOccurs="0"/>
 *         &lt;element name="authenticationGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "externalNameSearch",
    "authenticationGuid"
})
@XmlRootElement(name = "ABRSearchByNameAdvanced")
public class ABRSearchByNameAdvanced {

    protected ExternalRequestNameSearchAdvanced externalNameSearch;
    protected String authenticationGuid;

    /**
     * Gets the value of the externalNameSearch property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestNameSearchAdvanced }
     *     
     */
    public ExternalRequestNameSearchAdvanced getExternalNameSearch() {
        return externalNameSearch;
    }

    /**
     * Sets the value of the externalNameSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestNameSearchAdvanced }
     *     
     */
    public void setExternalNameSearch(ExternalRequestNameSearchAdvanced value) {
        this.externalNameSearch = value;
    }

    /**
     * Gets the value of the authenticationGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationGuid() {
        return authenticationGuid;
    }

    /**
     * Sets the value of the authenticationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationGuid(String value) {
        this.authenticationGuid = value;
    }

}
