
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
 *         &lt;element name="GetOutlookForWeekResult" type="{http://www.xignite.com/services/}ArrayOfOutlook" minOccurs="0"/>
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
    "getOutlookForWeekResult"
})
@XmlRootElement(name = "GetOutlookForWeekResponse")
public class GetOutlookForWeekResponse {

    @XmlElement(name = "GetOutlookForWeekResult")
    protected ArrayOfOutlook getOutlookForWeekResult;

    /**
     * Gets the value of the getOutlookForWeekResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutlook }
     *     
     */
    public ArrayOfOutlook getGetOutlookForWeekResult() {
        return getOutlookForWeekResult;
    }

    /**
     * Sets the value of the getOutlookForWeekResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutlook }
     *     
     */
    public void setGetOutlookForWeekResult(ArrayOfOutlook value) {
        this.getOutlookForWeekResult = value;
    }

}
