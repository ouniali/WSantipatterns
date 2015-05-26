
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
 *         &lt;element name="SearchPremise_ByWordMatchOnAllResult" type="{http://ws.epostcode.com/uk/}ListAddressPremises" minOccurs="0"/>
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
    "searchPremiseByWordMatchOnAllResult"
})
@XmlRootElement(name = "SearchPremise_ByWordMatchOnAllResponse")
public class SearchPremiseByWordMatchOnAllResponse {

    @XmlElement(name = "SearchPremise_ByWordMatchOnAllResult")
    protected ListAddressPremises searchPremiseByWordMatchOnAllResult;

    /**
     * Gets the value of the searchPremiseByWordMatchOnAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListAddressPremises }
     *     
     */
    public ListAddressPremises getSearchPremiseByWordMatchOnAllResult() {
        return searchPremiseByWordMatchOnAllResult;
    }

    /**
     * Sets the value of the searchPremiseByWordMatchOnAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAddressPremises }
     *     
     */
    public void setSearchPremiseByWordMatchOnAllResult(ListAddressPremises value) {
        this.searchPremiseByWordMatchOnAllResult = value;
    }

}
