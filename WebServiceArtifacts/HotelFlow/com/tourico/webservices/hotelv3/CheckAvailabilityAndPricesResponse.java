
package com.tourico.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tourico.schemas.webservices.hotelv3.SearchResult;


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
 *         &lt;element name="CheckAvailabilityAndPricesResult" type="{http://schemas.tourico.com/webservices/hotelv3}SearchResult" minOccurs="0"/>
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
    "checkAvailabilityAndPricesResult"
})
@XmlRootElement(name = "CheckAvailabilityAndPricesResponse")
public class CheckAvailabilityAndPricesResponse {

    @XmlElement(name = "CheckAvailabilityAndPricesResult")
    protected SearchResult checkAvailabilityAndPricesResult;

    /**
     * Gets the value of the checkAvailabilityAndPricesResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getCheckAvailabilityAndPricesResult() {
        return checkAvailabilityAndPricesResult;
    }

    /**
     * Sets the value of the checkAvailabilityAndPricesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setCheckAvailabilityAndPricesResult(SearchResult value) {
        this.checkAvailabilityAndPricesResult = value;
    }

}
