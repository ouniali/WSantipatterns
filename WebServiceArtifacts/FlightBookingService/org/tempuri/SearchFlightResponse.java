
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.FlightSearchReponse;


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
 *         &lt;element name="SearchFlightResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}FlightSearchReponse" minOccurs="0"/>
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
    "searchFlightResult"
})
@XmlRootElement(name = "SearchFlightResponse")
public class SearchFlightResponse {

    @XmlElementRef(name = "SearchFlightResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightSearchReponse> searchFlightResult;

    /**
     * Gets the value of the searchFlightResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightSearchReponse }{@code >}
     *     
     */
    public JAXBElement<FlightSearchReponse> getSearchFlightResult() {
        return searchFlightResult;
    }

    /**
     * Sets the value of the searchFlightResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightSearchReponse }{@code >}
     *     
     */
    public void setSearchFlightResult(JAXBElement<FlightSearchReponse> value) {
        this.searchFlightResult = value;
    }

}
