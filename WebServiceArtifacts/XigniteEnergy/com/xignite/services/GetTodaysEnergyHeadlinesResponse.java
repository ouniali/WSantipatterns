
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
 *         &lt;element name="GetTodaysEnergyHeadlinesResult" type="{http://www.xignite.com/services/}MarketHeadlines" minOccurs="0"/>
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
    "getTodaysEnergyHeadlinesResult"
})
@XmlRootElement(name = "GetTodaysEnergyHeadlinesResponse")
public class GetTodaysEnergyHeadlinesResponse {

    @XmlElement(name = "GetTodaysEnergyHeadlinesResult")
    protected MarketHeadlines getTodaysEnergyHeadlinesResult;

    /**
     * Gets the value of the getTodaysEnergyHeadlinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link MarketHeadlines }
     *     
     */
    public MarketHeadlines getGetTodaysEnergyHeadlinesResult() {
        return getTodaysEnergyHeadlinesResult;
    }

    /**
     * Sets the value of the getTodaysEnergyHeadlinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketHeadlines }
     *     
     */
    public void setGetTodaysEnergyHeadlinesResult(MarketHeadlines value) {
        this.getTodaysEnergyHeadlinesResult = value;
    }

}
