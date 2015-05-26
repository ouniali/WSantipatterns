
package com.xignite.services;

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
 *         &lt;element name="GetLastEnergyHeadlinesResult" type="{http://www.xignite.com/services/}MarketHeadlines" minOccurs="0"/>
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
    "getLastEnergyHeadlinesResult"
})
@XmlRootElement(name = "GetLastEnergyHeadlinesResponse")
public class GetLastEnergyHeadlinesResponse {

    @XmlElement(name = "GetLastEnergyHeadlinesResult")
    protected MarketHeadlines getLastEnergyHeadlinesResult;

    /**
     * Gets the value of the getLastEnergyHeadlinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link MarketHeadlines }
     *     
     */
    public MarketHeadlines getGetLastEnergyHeadlinesResult() {
        return getLastEnergyHeadlinesResult;
    }

    /**
     * Sets the value of the getLastEnergyHeadlinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketHeadlines }
     *     
     */
    public void setGetLastEnergyHeadlinesResult(MarketHeadlines value) {
        this.getLastEnergyHeadlinesResult = value;
    }

}
