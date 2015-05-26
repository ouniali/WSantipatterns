
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchBirdseyeInFlightResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBirdseyeInFlightResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchBirdseyeInFlightResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}InFlightStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBirdseyeInFlightResults", propOrder = {
    "searchBirdseyeInFlightResult"
})
public class SearchBirdseyeInFlightResults {

    @XmlElement(name = "SearchBirdseyeInFlightResult", required = true)
    protected InFlightStruct searchBirdseyeInFlightResult;

    /**
     * Gets the value of the searchBirdseyeInFlightResult property.
     * 
     * @return
     *     possible object is
     *     {@link InFlightStruct }
     *     
     */
    public InFlightStruct getSearchBirdseyeInFlightResult() {
        return searchBirdseyeInFlightResult;
    }

    /**
     * Sets the value of the searchBirdseyeInFlightResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InFlightStruct }
     *     
     */
    public void setSearchBirdseyeInFlightResult(InFlightStruct value) {
        this.searchBirdseyeInFlightResult = value;
    }

}
