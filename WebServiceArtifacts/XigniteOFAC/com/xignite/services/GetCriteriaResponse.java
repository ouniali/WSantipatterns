
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
 *         &lt;element name="GetCriteriaResult" type="{http://www.xignite.com/services/}Criteria" minOccurs="0"/>
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
    "getCriteriaResult"
})
@XmlRootElement(name = "GetCriteriaResponse")
public class GetCriteriaResponse {

    @XmlElement(name = "GetCriteriaResult")
    protected Criteria getCriteriaResult;

    /**
     * Gets the value of the getCriteriaResult property.
     * 
     * @return
     *     possible object is
     *     {@link Criteria }
     *     
     */
    public Criteria getGetCriteriaResult() {
        return getCriteriaResult;
    }

    /**
     * Sets the value of the getCriteriaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Criteria }
     *     
     */
    public void setGetCriteriaResult(Criteria value) {
        this.getCriteriaResult = value;
    }

}
