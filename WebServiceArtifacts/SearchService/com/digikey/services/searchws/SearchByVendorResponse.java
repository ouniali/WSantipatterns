
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
 *         &lt;element name="SearchByVendorResult" type="{http://services.digikey.com/SearchWS}BaseProductInfoCollection" minOccurs="0"/>
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
    "searchByVendorResult"
})
@XmlRootElement(name = "SearchByVendorResponse")
public class SearchByVendorResponse {

    @XmlElement(name = "SearchByVendorResult")
    protected BaseProductInfoCollection searchByVendorResult;

    /**
     * Gets the value of the searchByVendorResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductInfoCollection }
     *     
     */
    public BaseProductInfoCollection getSearchByVendorResult() {
        return searchByVendorResult;
    }

    /**
     * Sets the value of the searchByVendorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductInfoCollection }
     *     
     */
    public void setSearchByVendorResult(BaseProductInfoCollection value) {
        this.searchByVendorResult = value;
    }

}
