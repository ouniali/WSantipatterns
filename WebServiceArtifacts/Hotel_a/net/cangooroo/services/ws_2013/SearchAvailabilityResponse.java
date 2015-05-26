
package net.cangooroo.services.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.SearchResult;


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
 *         &lt;element name="searchAvailabilityResult" type="{WS_2013.Hotel}SearchResult" minOccurs="0"/>
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
    "searchAvailabilityResult"
})
@XmlRootElement(name = "searchAvailabilityResponse")
public class SearchAvailabilityResponse {

    protected SearchResult searchAvailabilityResult;

    /**
     * Gets the value of the searchAvailabilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getSearchAvailabilityResult() {
        return searchAvailabilityResult;
    }

    /**
     * Sets the value of the searchAvailabilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setSearchAvailabilityResult(SearchResult value) {
        this.searchAvailabilityResult = value;
    }

}
