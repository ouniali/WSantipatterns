
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
 *         &lt;element name="GetLastSecurityHeadlinesResult" type="{http://www.xignite.com/services/}SecurityHeadlines" minOccurs="0"/>
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
    "getLastSecurityHeadlinesResult"
})
@XmlRootElement(name = "GetLastSecurityHeadlinesResponse")
public class GetLastSecurityHeadlinesResponse {

    @XmlElement(name = "GetLastSecurityHeadlinesResult")
    protected SecurityHeadlines getLastSecurityHeadlinesResult;

    /**
     * Gets the value of the getLastSecurityHeadlinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityHeadlines }
     *     
     */
    public SecurityHeadlines getGetLastSecurityHeadlinesResult() {
        return getLastSecurityHeadlinesResult;
    }

    /**
     * Sets the value of the getLastSecurityHeadlinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityHeadlines }
     *     
     */
    public void setGetLastSecurityHeadlinesResult(SecurityHeadlines value) {
        this.getLastSecurityHeadlinesResult = value;
    }

}
