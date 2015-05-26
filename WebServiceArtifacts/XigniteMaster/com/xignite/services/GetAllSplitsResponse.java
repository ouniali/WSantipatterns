
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
 *         &lt;element name="GetAllSplitsResult" type="{http://www.xignite.com/services/}ArrayOfSplitHistory" minOccurs="0"/>
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
    "getAllSplitsResult"
})
@XmlRootElement(name = "GetAllSplitsResponse")
public class GetAllSplitsResponse {

    @XmlElement(name = "GetAllSplitsResult")
    protected ArrayOfSplitHistory getAllSplitsResult;

    /**
     * Gets the value of the getAllSplitsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSplitHistory }
     *     
     */
    public ArrayOfSplitHistory getGetAllSplitsResult() {
        return getAllSplitsResult;
    }

    /**
     * Sets the value of the getAllSplitsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSplitHistory }
     *     
     */
    public void setGetAllSplitsResult(ArrayOfSplitHistory value) {
        this.getAllSplitsResult = value;
    }

}
