
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
 *         &lt;element name="GetRecentFilingsResult" type="{http://www.xignite.com/services/}ArrayOfFiling" minOccurs="0"/>
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
    "getRecentFilingsResult"
})
@XmlRootElement(name = "GetRecentFilingsResponse")
public class GetRecentFilingsResponse {

    @XmlElement(name = "GetRecentFilingsResult")
    protected ArrayOfFiling getRecentFilingsResult;

    /**
     * Gets the value of the getRecentFilingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFiling }
     *     
     */
    public ArrayOfFiling getGetRecentFilingsResult() {
        return getRecentFilingsResult;
    }

    /**
     * Sets the value of the getRecentFilingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFiling }
     *     
     */
    public void setGetRecentFilingsResult(ArrayOfFiling value) {
        this.getRecentFilingsResult = value;
    }

}
