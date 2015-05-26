
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
 *         &lt;element name="SearchHotelsByIdResult" type="{http://schemas.tourico.com/webservices/hotelv3}SearchResult" minOccurs="0"/>
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
    "searchHotelsByIdResult"
})
@XmlRootElement(name = "SearchHotelsByIdResponse")
public class SearchHotelsByIdResponse {

    @XmlElement(name = "SearchHotelsByIdResult")
    protected SearchResult searchHotelsByIdResult;

    /**
     * Gets the value of the searchHotelsByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getSearchHotelsByIdResult() {
        return searchHotelsByIdResult;
    }

    /**
     * Sets the value of the searchHotelsByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setSearchHotelsByIdResult(SearchResult value) {
        this.searchHotelsByIdResult = value;
    }

}
