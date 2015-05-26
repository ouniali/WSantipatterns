
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchBirdseyePositionsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBirdseyePositionsResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchBirdseyePositionsResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfTrackExStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBirdseyePositionsResults", propOrder = {
    "searchBirdseyePositionsResult"
})
public class SearchBirdseyePositionsResults {

    @XmlElement(name = "SearchBirdseyePositionsResult", required = true)
    protected ArrayOfTrackExStruct searchBirdseyePositionsResult;

    /**
     * Gets the value of the searchBirdseyePositionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackExStruct }
     *     
     */
    public ArrayOfTrackExStruct getSearchBirdseyePositionsResult() {
        return searchBirdseyePositionsResult;
    }

    /**
     * Sets the value of the searchBirdseyePositionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackExStruct }
     *     
     */
    public void setSearchBirdseyePositionsResult(ArrayOfTrackExStruct value) {
        this.searchBirdseyePositionsResult = value;
    }

}
