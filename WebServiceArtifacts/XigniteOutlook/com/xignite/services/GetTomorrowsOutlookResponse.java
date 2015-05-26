
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
 *         &lt;element name="GetTomorrowsOutlookResult" type="{http://www.xignite.com/services/}ArrayOfOutlook" minOccurs="0"/>
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
    "getTomorrowsOutlookResult"
})
@XmlRootElement(name = "GetTomorrowsOutlookResponse")
public class GetTomorrowsOutlookResponse {

    @XmlElement(name = "GetTomorrowsOutlookResult")
    protected ArrayOfOutlook getTomorrowsOutlookResult;

    /**
     * Gets the value of the getTomorrowsOutlookResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutlook }
     *     
     */
    public ArrayOfOutlook getGetTomorrowsOutlookResult() {
        return getTomorrowsOutlookResult;
    }

    /**
     * Sets the value of the getTomorrowsOutlookResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutlook }
     *     
     */
    public void setGetTomorrowsOutlookResult(ArrayOfOutlook value) {
        this.getTomorrowsOutlookResult = value;
    }

}
