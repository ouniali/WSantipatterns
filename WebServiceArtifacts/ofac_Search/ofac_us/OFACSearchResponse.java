
package ofac_us;

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
 *         &lt;element name="OFAC_SearchResult" type="{http://ofac_us/}ofac_resultsS"/>
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
    "ofacSearchResult"
})
@XmlRootElement(name = "OFAC_SearchResponse")
public class OFACSearchResponse {

    @XmlElement(name = "OFAC_SearchResult", required = true)
    protected OfacResultsS ofacSearchResult;

    /**
     * Gets the value of the ofacSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link OfacResultsS }
     *     
     */
    public OfacResultsS getOFACSearchResult() {
        return ofacSearchResult;
    }

    /**
     * Sets the value of the ofacSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfacResultsS }
     *     
     */
    public void setOFACSearchResult(OfacResultsS value) {
        this.ofacSearchResult = value;
    }

}
