
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
 *         &lt;element name="DeleteCookieResult" type="{http://www.xignite.com/services/}BooleanResult" minOccurs="0"/>
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
    "deleteCookieResult"
})
@XmlRootElement(name = "DeleteCookieResponse")
public class DeleteCookieResponse {

    @XmlElement(name = "DeleteCookieResult")
    protected BooleanResult deleteCookieResult;

    /**
     * Gets the value of the deleteCookieResult property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanResult }
     *     
     */
    public BooleanResult getDeleteCookieResult() {
        return deleteCookieResult;
    }

    /**
     * Sets the value of the deleteCookieResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanResult }
     *     
     */
    public void setDeleteCookieResult(BooleanResult value) {
        this.deleteCookieResult = value;
    }

}
