
package com.serviceobjects;

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
 *         &lt;element name="GetWarningsByStateResult" type="{http://www.serviceobjects.com/}ArrayOfWarning" minOccurs="0"/>
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
    "getWarningsByStateResult"
})
@XmlRootElement(name = "GetWarningsByStateResponse")
public class GetWarningsByStateResponse {

    @XmlElement(name = "GetWarningsByStateResult")
    protected ArrayOfWarning getWarningsByStateResult;

    /**
     * Gets the value of the getWarningsByStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarning }
     *     
     */
    public ArrayOfWarning getGetWarningsByStateResult() {
        return getWarningsByStateResult;
    }

    /**
     * Sets the value of the getWarningsByStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarning }
     *     
     */
    public void setGetWarningsByStateResult(ArrayOfWarning value) {
        this.getWarningsByStateResult = value;
    }

}
