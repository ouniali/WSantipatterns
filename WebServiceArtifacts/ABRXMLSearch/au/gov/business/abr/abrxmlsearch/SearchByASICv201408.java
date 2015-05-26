
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
 *         &lt;element name="searchString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeHistoricalDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchString",
    "includeHistoricalDetails",
    "authenticationGuid"
})
@XmlRootElement(name = "SearchByASICv201408")
public class SearchByASICv201408 {

    protected String searchString;
    protected String includeHistoricalDetails;
    protected String authenticationGuid;

    /**
     * Gets the value of the searchString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * Sets the value of the searchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchString(String value) {
        this.searchString = value;
    }

    /**
     * Gets the value of the includeHistoricalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeHistoricalDetails() {
        return includeHistoricalDetails;
    }

    /**
     * Sets the value of the includeHistoricalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeHistoricalDetails(String value) {
        this.includeHistoricalDetails = value;
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
