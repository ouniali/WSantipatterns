
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRequestNameSearchAdvanced2012 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRequestNameSearchAdvanced2012">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequest">
 *       &lt;sequence>
 *         &lt;element name="authenticationGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filters" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestFilters2012"/>
 *         &lt;element name="searchWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimumScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ExternalRequestNameSearchAdvanced2012", propOrder = {
    "authenticationGUID",
    "name",
    "filters",
    "searchWidth",
    "minimumScore",
    "maxSearchResults"
})
public class ExternalRequestNameSearchAdvanced2012
    extends ExternalRequest
{

    protected String authenticationGUID;
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected ExternalRequestFilters2012 filters;
    protected String searchWidth;
    protected int minimumScore;
    protected String maxSearchResults;

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
     *     {@link ExternalRequestFilters2012 }
     *     
     */
    public ExternalRequestFilters2012 getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestFilters2012 }
     *     
     */
    public void setFilters(ExternalRequestFilters2012 value) {
        this.filters = value;
    }

    /**
     * Gets the value of the searchWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchWidth() {
        return searchWidth;
    }

    /**
     * Sets the value of the searchWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchWidth(String value) {
        this.searchWidth = value;
    }

    /**
     * Gets the value of the minimumScore property.
     * 
     */
    public int getMinimumScore() {
        return minimumScore;
    }

    /**
     * Sets the value of the minimumScore property.
     * 
     */
    public void setMinimumScore(int value) {
        this.minimumScore = value;
    }

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
