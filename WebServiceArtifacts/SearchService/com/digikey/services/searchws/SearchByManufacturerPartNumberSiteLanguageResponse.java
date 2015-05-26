
package com.digikey.services.searchws;

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
 *         &lt;element name="SearchByManufacturerPartNumberSiteLanguageResult" type="{http://services.digikey.com/SearchWS}BaseProductInfoCollectionInt" minOccurs="0"/>
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
    "searchByManufacturerPartNumberSiteLanguageResult"
})
@XmlRootElement(name = "SearchByManufacturerPartNumberSiteLanguageResponse")
public class SearchByManufacturerPartNumberSiteLanguageResponse {

    @XmlElement(name = "SearchByManufacturerPartNumberSiteLanguageResult")
    protected BaseProductInfoCollectionInt searchByManufacturerPartNumberSiteLanguageResult;

    /**
     * Gets the value of the searchByManufacturerPartNumberSiteLanguageResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductInfoCollectionInt }
     *     
     */
    public BaseProductInfoCollectionInt getSearchByManufacturerPartNumberSiteLanguageResult() {
        return searchByManufacturerPartNumberSiteLanguageResult;
    }

    /**
     * Sets the value of the searchByManufacturerPartNumberSiteLanguageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductInfoCollectionInt }
     *     
     */
    public void setSearchByManufacturerPartNumberSiteLanguageResult(BaseProductInfoCollectionInt value) {
        this.searchByManufacturerPartNumberSiteLanguageResult = value;
    }

}
