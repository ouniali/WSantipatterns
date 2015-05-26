
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
 *         &lt;element name="SearchSecurityHeadlinesResult" type="{http://www.xignite.com/services/}SecurityHeadlines" minOccurs="0"/>
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
    "searchSecurityHeadlinesResult"
})
@XmlRootElement(name = "SearchSecurityHeadlinesResponse")
public class SearchSecurityHeadlinesResponse {

    @XmlElement(name = "SearchSecurityHeadlinesResult")
    protected SecurityHeadlines searchSecurityHeadlinesResult;

    /**
     * Gets the value of the searchSecurityHeadlinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityHeadlines }
     *     
     */
    public SecurityHeadlines getSearchSecurityHeadlinesResult() {
        return searchSecurityHeadlinesResult;
    }

    /**
     * Sets the value of the searchSecurityHeadlinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityHeadlines }
     *     
     */
    public void setSearchSecurityHeadlinesResult(SecurityHeadlines value) {
        this.searchSecurityHeadlinesResult = value;
    }

}
