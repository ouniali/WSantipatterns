
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
 *         &lt;element name="GetTopEnergyHeadlinesResult" type="{http://www.xignite.com/services/}MarketHeadlines" minOccurs="0"/>
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
    "getTopEnergyHeadlinesResult"
})
@XmlRootElement(name = "GetTopEnergyHeadlinesResponse")
public class GetTopEnergyHeadlinesResponse {

    @XmlElement(name = "GetTopEnergyHeadlinesResult")
    protected MarketHeadlines getTopEnergyHeadlinesResult;

    /**
     * Gets the value of the getTopEnergyHeadlinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link MarketHeadlines }
     *     
     */
    public MarketHeadlines getGetTopEnergyHeadlinesResult() {
        return getTopEnergyHeadlinesResult;
    }

    /**
     * Sets the value of the getTopEnergyHeadlinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketHeadlines }
     *     
     */
    public void setGetTopEnergyHeadlinesResult(MarketHeadlines value) {
        this.getTopEnergyHeadlinesResult = value;
    }

}
