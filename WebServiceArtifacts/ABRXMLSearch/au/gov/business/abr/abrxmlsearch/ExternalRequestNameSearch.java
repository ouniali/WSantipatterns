
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRequestNameSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRequestNameSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequest">
 *       &lt;sequence>
 *         &lt;element name="authenticationGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filters" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestFilters"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRequestNameSearch", propOrder = {
    "authenticationGUID",
    "name",
    "filters"
})
@XmlSeeAlso({
    ExternalRequestNameSearchAdvanced.class
})
public class ExternalRequestNameSearch
    extends ExternalRequest
{

    protected String authenticationGUID;
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected ExternalRequestFilters filters;

    /**
     * Gets the value of the authenticationGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationGUID() {
        return authenticationGUID;
    }

    /**
     * Sets the value of the authenticationGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationGUID(String value) {
        this.authenticationGUID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestFilters }
     *     
     */
    public ExternalRequestFilters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestFilters }
     *     
     */
    public void setFilters(ExternalRequestFilters value) {
        this.filters = value;
    }

}
