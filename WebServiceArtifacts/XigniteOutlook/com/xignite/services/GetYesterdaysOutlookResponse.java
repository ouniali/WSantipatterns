
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
 *         &lt;element name="GetYesterdaysOutlookResult" type="{http://www.xignite.com/services/}ArrayOfOutlook" minOccurs="0"/>
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
    "getYesterdaysOutlookResult"
})
@XmlRootElement(name = "GetYesterdaysOutlookResponse")
public class GetYesterdaysOutlookResponse {

    @XmlElement(name = "GetYesterdaysOutlookResult")
    protected ArrayOfOutlook getYesterdaysOutlookResult;

    /**
     * Gets the value of the getYesterdaysOutlookResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutlook }
     *     
     */
    public ArrayOfOutlook getGetYesterdaysOutlookResult() {
        return getYesterdaysOutlookResult;
    }

    /**
     * Sets the value of the getYesterdaysOutlookResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutlook }
     *     
     */
    public void setGetYesterdaysOutlookResult(ArrayOfOutlook value) {
        this.getYesterdaysOutlookResult = value;
    }

}
