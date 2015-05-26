
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
 *         &lt;element name="SearchPremise_ByPostcode_DatasetResult" minOccurs="0">
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
    "searchPremiseByPostcodeDatasetResult"
})
@XmlRootElement(name = "SearchPremise_ByPostcode_DatasetResponse")
public class SearchPremiseByPostcodeDatasetResponse {

    @XmlElement(name = "SearchPremise_ByPostcode_DatasetResult")
    protected SearchPremiseByPostcodeDatasetResponse.SearchPremiseByPostcodeDatasetResult searchPremiseByPostcodeDatasetResult;

    /**
     * Gets the value of the searchPremiseByPostcodeDatasetResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPremiseByPostcodeDatasetResponse.SearchPremiseByPostcodeDatasetResult }
     *     
     */
    public SearchPremiseByPostcodeDatasetResponse.SearchPremiseByPostcodeDatasetResult getSearchPremiseByPostcodeDatasetResult() {
        return searchPremiseByPostcodeDatasetResult;
    }

    /**
     * Sets the value of the searchPremiseByPostcodeDatasetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPremiseByPostcodeDatasetResponse.SearchPremiseByPostcodeDatasetResult }
     *     
     */
    public void setSearchPremiseByPostcodeDatasetResult(SearchPremiseByPostcodeDatasetResponse.SearchPremiseByPostcodeDatasetResult value) {
        this.searchPremiseByPostcodeDatasetResult = value;
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
    public static class SearchPremiseByPostcodeDatasetResult {

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
