
package com.tourico.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tourico.schemas.webservices.hotelv3.SearchResult;


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
 *         &lt;element name="SearchHotelsResult" type="{http://schemas.tourico.com/webservices/hotelv3}SearchResult" minOccurs="0"/>
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
    "searchHotelsResult"
})
@XmlRootElement(name = "SearchHotelsResponse")
public class SearchHotelsResponse {

    @XmlElement(name = "SearchHotelsResult")
    protected SearchResult searchHotelsResult;

    /**
     * Gets the value of the searchHotelsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getSearchHotelsResult() {
        return searchHotelsResult;
    }

    /**
     * Sets the value of the searchHotelsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setSearchHotelsResult(SearchResult value) {
        this.searchHotelsResult = value;
    }

}
