
package com.epostcode.ws.uk;

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
 *         &lt;element name="SearchThoroughfare_ByStreetResult" type="{http://ws.epostcode.com/uk/}ListAddressThoroughfares" minOccurs="0"/>
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
    "searchThoroughfareByStreetResult"
})
@XmlRootElement(name = "SearchThoroughfare_ByStreetResponse")
public class SearchThoroughfareByStreetResponse {

    @XmlElement(name = "SearchThoroughfare_ByStreetResult")
    protected ListAddressThoroughfares searchThoroughfareByStreetResult;

    /**
     * Gets the value of the searchThoroughfareByStreetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListAddressThoroughfares }
     *     
     */
    public ListAddressThoroughfares getSearchThoroughfareByStreetResult() {
        return searchThoroughfareByStreetResult;
    }

    /**
     * Sets the value of the searchThoroughfareByStreetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAddressThoroughfares }
     *     
     */
    public void setSearchThoroughfareByStreetResult(ListAddressThoroughfares value) {
        this.searchThoroughfareByStreetResult = value;
    }

}
