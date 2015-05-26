
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
 *         &lt;element name="GetMasterByIssueResult" type="{http://www.xignite.com/services/}Master" minOccurs="0"/>
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
    "getMasterByIssueResult"
})
@XmlRootElement(name = "GetMasterByIssueResponse")
public class GetMasterByIssueResponse {

    @XmlElement(name = "GetMasterByIssueResult")
    protected Master getMasterByIssueResult;

    /**
     * Gets the value of the getMasterByIssueResult property.
     * 
     * @return
     *     possible object is
     *     {@link Master }
     *     
     */
    public Master getGetMasterByIssueResult() {
        return getMasterByIssueResult;
    }

    /**
     * Sets the value of the getMasterByIssueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Master }
     *     
     */
    public void setGetMasterByIssueResult(Master value) {
        this.getMasterByIssueResult = value;
    }

}
