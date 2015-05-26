
package ofac_us;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ofac_resultsS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ofac_resultsS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ofac_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="search_key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="possible_matches" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="search_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ofac_resultsS", propOrder = {
    "ofacId",
    "searchKey",
    "possibleMatches",
    "searchDate"
})
public class OfacResultsS {

    @XmlElement(name = "ofac_id")
    protected int ofacId;
    @XmlElement(name = "search_key")
    protected int searchKey;
    @XmlElement(name = "possible_matches")
    protected int possibleMatches;
    @XmlElement(name = "search_date")
    protected String searchDate;

    /**
     * Gets the value of the ofacId property.
     * 
     */
    public int getOfacId() {
        return ofacId;
    }

    /**
     * Sets the value of the ofacId property.
     * 
     */
    public void setOfacId(int value) {
        this.ofacId = value;
    }

    /**
     * Gets the value of the searchKey property.
     * 
     */
    public int getSearchKey() {
        return searchKey;
    }

    /**
     * Sets the value of the searchKey property.
     * 
     */
    public void setSearchKey(int value) {
        this.searchKey = value;
    }

    /**
     * Gets the value of the possibleMatches property.
     * 
     */
    public int getPossibleMatches() {
        return possibleMatches;
    }

    /**
     * Sets the value of the possibleMatches property.
     * 
     */
    public void setPossibleMatches(int value) {
        this.possibleMatches = value;
    }

    /**
     * Gets the value of the searchDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchDate() {
        return searchDate;
    }

    /**
     * Sets the value of the searchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchDate(String value) {
        this.searchDate = value;
    }

}
