
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
 *         &lt;element name="GetTodaysOutlookResult" type="{http://www.xignite.com/services/}ArrayOfOutlook" minOccurs="0"/>
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
    "getTodaysOutlookResult"
})
@XmlRootElement(name = "GetTodaysOutlookResponse")
public class GetTodaysOutlookResponse {

    @XmlElement(name = "GetTodaysOutlookResult")
    protected ArrayOfOutlook getTodaysOutlookResult;

    /**
     * Gets the value of the getTodaysOutlookResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutlook }
     *     
     */
    public ArrayOfOutlook getGetTodaysOutlookResult() {
        return getTodaysOutlookResult;
    }

    /**
     * Sets the value of the getTodaysOutlookResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutlook }
     *     
     */
    public void setGetTodaysOutlookResult(ArrayOfOutlook value) {
        this.getTodaysOutlookResult = value;
    }

}
