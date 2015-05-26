
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRequestNameSearchAdvanced complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRequestNameSearchAdvanced">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestNameSearch">
 *       &lt;sequence>
 *         &lt;element name="searchWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimumScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRequestNameSearchAdvanced", propOrder = {
    "searchWidth",
    "minimumScore"
})
@XmlSeeAlso({
    ExternalRequestNameSearchAdvanced2006 .class
})
public class ExternalRequestNameSearchAdvanced
    extends ExternalRequestNameSearch
{

    protected String searchWidth;
    protected int minimumScore;

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

}
