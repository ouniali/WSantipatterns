
package com.epostcode.ws.uk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element name="SearchThoroughfare_ByStreet_DatasetResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any namespace='http://ws.epostcode.com/uk/PostcodeUtilities.xsd'/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "searchThoroughfareByStreetDatasetResult"
})
@XmlRootElement(name = "SearchThoroughfare_ByStreet_DatasetResponse")
public class SearchThoroughfareByStreetDatasetResponse {

    @XmlElement(name = "SearchThoroughfare_ByStreet_DatasetResult")
    protected SearchThoroughfareByStreetDatasetResponse.SearchThoroughfareByStreetDatasetResult searchThoroughfareByStreetDatasetResult;

    /**
     * Gets the value of the searchThoroughfareByStreetDatasetResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchThoroughfareByStreetDatasetResponse.SearchThoroughfareByStreetDatasetResult }
     *     
     */
    public SearchThoroughfareByStreetDatasetResponse.SearchThoroughfareByStreetDatasetResult getSearchThoroughfareByStreetDatasetResult() {
        return searchThoroughfareByStreetDatasetResult;
    }

    /**
     * Sets the value of the searchThoroughfareByStreetDatasetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchThoroughfareByStreetDatasetResponse.SearchThoroughfareByStreetDatasetResult }
     *     
     */
    public void setSearchThoroughfareByStreetDatasetResult(SearchThoroughfareByStreetDatasetResponse.SearchThoroughfareByStreetDatasetResult value) {
        this.searchThoroughfareByStreetDatasetResult = value;
    }


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
     *         &lt;any namespace='http://ws.epostcode.com/uk/PostcodeUtilities.xsd'/>
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
        "any"
    })
    public static class SearchThoroughfareByStreetDatasetResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
