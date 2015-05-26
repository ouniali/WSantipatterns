
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
 *         &lt;element name="AddCookieResult" type="{http://www.xignite.com/services/}BooleanResult" minOccurs="0"/>
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
    "addCookieResult"
})
@XmlRootElement(name = "AddCookieResponse")
public class AddCookieResponse {

    @XmlElement(name = "AddCookieResult")
    protected BooleanResult addCookieResult;

    /**
     * Gets the value of the addCookieResult property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanResult }
     *     
     */
    public BooleanResult getAddCookieResult() {
        return addCookieResult;
    }

    /**
     * Sets the value of the addCookieResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanResult }
     *     
     */
    public void setAddCookieResult(BooleanResult value) {
        this.addCookieResult = value;
    }

}
