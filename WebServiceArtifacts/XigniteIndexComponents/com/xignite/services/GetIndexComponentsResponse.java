
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
 *         &lt;element name="GetIndexComponentsResult" type="{http://www.xignite.com/services/}Components" minOccurs="0"/>
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
    "getIndexComponentsResult"
})
@XmlRootElement(name = "GetIndexComponentsResponse")
public class GetIndexComponentsResponse {

    @XmlElement(name = "GetIndexComponentsResult")
    protected Components getIndexComponentsResult;

    /**
     * Gets the value of the getIndexComponentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Components }
     *     
     */
    public Components getGetIndexComponentsResult() {
        return getIndexComponentsResult;
    }

    /**
     * Sets the value of the getIndexComponentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Components }
     *     
     */
    public void setGetIndexComponentsResult(Components value) {
        this.getIndexComponentsResult = value;
    }

}
