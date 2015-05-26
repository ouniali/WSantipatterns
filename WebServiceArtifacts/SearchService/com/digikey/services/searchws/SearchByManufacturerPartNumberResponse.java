
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
 *         &lt;element name="SearchByManufacturerPartNumberResult" type="{http://services.digikey.com/SearchWS}BaseProductInfoCollection" minOccurs="0"/>
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
    "searchByManufacturerPartNumberResult"
})
@XmlRootElement(name = "SearchByManufacturerPartNumberResponse")
public class SearchByManufacturerPartNumberResponse {

    @XmlElement(name = "SearchByManufacturerPartNumberResult")
    protected BaseProductInfoCollection searchByManufacturerPartNumberResult;

    /**
     * Gets the value of the searchByManufacturerPartNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductInfoCollection }
     *     
     */
    public BaseProductInfoCollection getSearchByManufacturerPartNumberResult() {
        return searchByManufacturerPartNumberResult;
    }

    /**
     * Sets the value of the searchByManufacturerPartNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductInfoCollection }
     *     
     */
    public void setSearchByManufacturerPartNumberResult(BaseProductInfoCollection value) {
        this.searchByManufacturerPartNumberResult = value;
    }

}
