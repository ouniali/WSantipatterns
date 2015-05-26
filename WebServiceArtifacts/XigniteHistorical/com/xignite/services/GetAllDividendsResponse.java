
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
 *         &lt;element name="GetAllDividendsResult" type="{http://www.xignite.com/services/}ArrayOfSplitHistory" minOccurs="0"/>
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
    "getAllDividendsResult"
})
@XmlRootElement(name = "GetAllDividendsResponse")
public class GetAllDividendsResponse {

    @XmlElement(name = "GetAllDividendsResult")
    protected ArrayOfSplitHistory getAllDividendsResult;

    /**
     * Gets the value of the getAllDividendsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSplitHistory }
     *     
     */
    public ArrayOfSplitHistory getGetAllDividendsResult() {
        return getAllDividendsResult;
    }

    /**
     * Sets the value of the getAllDividendsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSplitHistory }
     *     
     */
    public void setGetAllDividendsResult(ArrayOfSplitHistory value) {
        this.getAllDividendsResult = value;
    }

}
