
package com.familytreemaker.service.search;

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
 *         &lt;element name="GetRecordsByStatusResult" type="{urn:service.familytreemaker.com/Search}ArrayOfString2" minOccurs="0"/>
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
    "getRecordsByStatusResult"
})
@XmlRootElement(name = "GetRecordsByStatusResponse")
public class GetRecordsByStatusResponse {

    @XmlElement(name = "GetRecordsByStatusResult")
    protected ArrayOfString2 getRecordsByStatusResult;

    /**
     * Gets the value of the getRecordsByStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getGetRecordsByStatusResult() {
        return getRecordsByStatusResult;
    }

    /**
     * Sets the value of the getRecordsByStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setGetRecordsByStatusResult(ArrayOfString2 value) {
        this.getRecordsByStatusResult = value;
    }

}
