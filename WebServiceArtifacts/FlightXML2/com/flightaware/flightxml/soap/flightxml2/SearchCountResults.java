
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCountResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCountResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCountResults", propOrder = {
    "searchCountResult"
})
public class SearchCountResults {

    @XmlElement(name = "SearchCountResult")
    protected int searchCountResult;

    /**
     * Gets the value of the searchCountResult property.
     * 
     */
    public int getSearchCountResult() {
        return searchCountResult;
    }

    /**
     * Sets the value of the searchCountResult property.
     * 
     */
    public void setSearchCountResult(int value) {
        this.searchCountResult = value;
    }

}
