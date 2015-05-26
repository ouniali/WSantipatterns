
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
 *         &lt;element name="GetCategoriesAndTopicsResult" type="{http://www.xignite.com/services/}ArrayOfCategory" minOccurs="0"/>
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
    "getCategoriesAndTopicsResult"
})
@XmlRootElement(name = "GetCategoriesAndTopicsResponse")
public class GetCategoriesAndTopicsResponse {

    @XmlElement(name = "GetCategoriesAndTopicsResult")
    protected ArrayOfCategory getCategoriesAndTopicsResult;

    /**
     * Gets the value of the getCategoriesAndTopicsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategory }
     *     
     */
    public ArrayOfCategory getGetCategoriesAndTopicsResult() {
        return getCategoriesAndTopicsResult;
    }

    /**
     * Sets the value of the getCategoriesAndTopicsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategory }
     *     
     */
    public void setGetCategoriesAndTopicsResult(ArrayOfCategory value) {
        this.getCategoriesAndTopicsResult = value;
    }

}
