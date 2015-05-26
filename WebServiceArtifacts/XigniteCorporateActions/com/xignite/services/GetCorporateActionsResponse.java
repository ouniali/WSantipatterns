
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
 *         &lt;element name="GetCorporateActionsResult" type="{http://www.xignite.com/services/}ArrayOfCorporateAction" minOccurs="0"/>
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
    "getCorporateActionsResult"
})
@XmlRootElement(name = "GetCorporateActionsResponse")
public class GetCorporateActionsResponse {

    @XmlElement(name = "GetCorporateActionsResult")
    protected ArrayOfCorporateAction getCorporateActionsResult;

    /**
     * Gets the value of the getCorporateActionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCorporateAction }
     *     
     */
    public ArrayOfCorporateAction getGetCorporateActionsResult() {
        return getCorporateActionsResult;
    }

    /**
     * Sets the value of the getCorporateActionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCorporateAction }
     *     
     */
    public void setGetCorporateActionsResult(ArrayOfCorporateAction value) {
        this.getCorporateActionsResult = value;
    }

}
