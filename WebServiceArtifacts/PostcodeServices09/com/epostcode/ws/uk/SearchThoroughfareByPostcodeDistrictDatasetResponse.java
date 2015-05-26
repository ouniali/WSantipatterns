
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
 *         &lt;element name="SearchThoroughfare_ByPostcodeDistrict_DatasetResult" minOccurs="0">
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
    "searchThoroughfareByPostcodeDistrictDatasetResult"
})
@XmlRootElement(name = "SearchThoroughfare_ByPostcodeDistrict_DatasetResponse")
public class SearchThoroughfareByPostcodeDistrictDatasetResponse {

    @XmlElement(name = "SearchThoroughfare_ByPostcodeDistrict_DatasetResult")
    protected SearchThoroughfareByPostcodeDistrictDatasetResponse.SearchThoroughfareByPostcodeDistrictDatasetResult searchThoroughfareByPostcodeDistrictDatasetResult;

    /**
     * Gets the value of the searchThoroughfareByPostcodeDistrictDatasetResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchThoroughfareByPostcodeDistrictDatasetResponse.SearchThoroughfareByPostcodeDistrictDatasetResult }
     *     
     */
    public SearchThoroughfareByPostcodeDistrictDatasetResponse.SearchThoroughfareByPostcodeDistrictDatasetResult getSearchThoroughfareByPostcodeDistrictDatasetResult() {
        return searchThoroughfareByPostcodeDistrictDatasetResult;
    }

    /**
     * Sets the value of the searchThoroughfareByPostcodeDistrictDatasetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchThoroughfareByPostcodeDistrictDatasetResponse.SearchThoroughfareByPostcodeDistrictDatasetResult }
     *     
     */
    public void setSearchThoroughfareByPostcodeDistrictDatasetResult(SearchThoroughfareByPostcodeDistrictDatasetResponse.SearchThoroughfareByPostcodeDistrictDatasetResult value) {
        this.searchThoroughfareByPostcodeDistrictDatasetResult = value;
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
    public static class SearchThoroughfareByPostcodeDistrictDatasetResult {

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
