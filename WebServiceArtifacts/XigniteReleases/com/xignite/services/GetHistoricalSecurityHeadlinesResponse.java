
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
 *         &lt;element name="GetHistoricalSecurityHeadlinesResult" type="{http://www.xignite.com/services/}SecurityHeadlines" minOccurs="0"/>
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
    "getHistoricalSecurityHeadlinesResult"
})
@XmlRootElement(name = "GetHistoricalSecurityHeadlinesResponse")
public class GetHistoricalSecurityHeadlinesResponse {

    @XmlElement(name = "GetHistoricalSecurityHeadlinesResult")
    protected SecurityHeadlines getHistoricalSecurityHeadlinesResult;

    /**
     * Gets the value of the getHistoricalSecurityHeadlinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityHeadlines }
     *     
     */
    public SecurityHeadlines getGetHistoricalSecurityHeadlinesResult() {
        return getHistoricalSecurityHeadlinesResult;
    }

    /**
     * Sets the value of the getHistoricalSecurityHeadlinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityHeadlines }
     *     
     */
    public void setGetHistoricalSecurityHeadlinesResult(SecurityHeadlines value) {
        this.getHistoricalSecurityHeadlinesResult = value;
    }

}
