
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
 *         &lt;element name="SearchPremise_ByWordMatchOnPremise_DatasetResult" minOccurs="0">
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
    "searchPremiseByWordMatchOnPremiseDatasetResult"
})
@XmlRootElement(name = "SearchPremise_ByWordMatchOnPremise_DatasetResponse")
public class SearchPremiseByWordMatchOnPremiseDatasetResponse {

    @XmlElement(name = "SearchPremise_ByWordMatchOnPremise_DatasetResult")
    protected SearchPremiseByWordMatchOnPremiseDatasetResponse.SearchPremiseByWordMatchOnPremiseDatasetResult searchPremiseByWordMatchOnPremiseDatasetResult;

    /**
     * Gets the value of the searchPremiseByWordMatchOnPremiseDatasetResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPremiseByWordMatchOnPremiseDatasetResponse.SearchPremiseByWordMatchOnPremiseDatasetResult }
     *     
     */
    public SearchPremiseByWordMatchOnPremiseDatasetResponse.SearchPremiseByWordMatchOnPremiseDatasetResult getSearchPremiseByWordMatchOnPremiseDatasetResult() {
        return searchPremiseByWordMatchOnPremiseDatasetResult;
    }

    /**
     * Sets the value of the searchPremiseByWordMatchOnPremiseDatasetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPremiseByWordMatchOnPremiseDatasetResponse.SearchPremiseByWordMatchOnPremiseDatasetResult }
     *     
     */
    public void setSearchPremiseByWordMatchOnPremiseDatasetResult(SearchPremiseByWordMatchOnPremiseDatasetResponse.SearchPremiseByWordMatchOnPremiseDatasetResult value) {
        this.searchPremiseByWordMatchOnPremiseDatasetResult = value;
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
    public static class SearchPremiseByWordMatchOnPremiseDatasetResult {

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
