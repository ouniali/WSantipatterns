
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
 *         &lt;element name="GetOperationDetailsResult" type="{http://www.xignite.com/services/}ExtendedOperation" minOccurs="0"/>
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
    "getOperationDetailsResult"
})
@XmlRootElement(name = "GetOperationDetailsResponse")
public class GetOperationDetailsResponse {

    @XmlElement(name = "GetOperationDetailsResult")
    protected ExtendedOperation getOperationDetailsResult;

    /**
     * Gets the value of the getOperationDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedOperation }
     *     
     */
    public ExtendedOperation getGetOperationDetailsResult() {
        return getOperationDetailsResult;
    }

    /**
     * Sets the value of the getOperationDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedOperation }
     *     
     */
    public void setGetOperationDetailsResult(ExtendedOperation value) {
        this.getOperationDetailsResult = value;
    }

}
