
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
 *         &lt;element name="GetOutlookForRangeLengthBackwardResult" type="{http://www.xignite.com/services/}ArrayOfOutlook" minOccurs="0"/>
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
    "getOutlookForRangeLengthBackwardResult"
})
@XmlRootElement(name = "GetOutlookForRangeLengthBackwardResponse")
public class GetOutlookForRangeLengthBackwardResponse {

    @XmlElement(name = "GetOutlookForRangeLengthBackwardResult")
    protected ArrayOfOutlook getOutlookForRangeLengthBackwardResult;

    /**
     * Gets the value of the getOutlookForRangeLengthBackwardResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutlook }
     *     
     */
    public ArrayOfOutlook getGetOutlookForRangeLengthBackwardResult() {
        return getOutlookForRangeLengthBackwardResult;
    }

    /**
     * Sets the value of the getOutlookForRangeLengthBackwardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutlook }
     *     
     */
    public void setGetOutlookForRangeLengthBackwardResult(ArrayOfOutlook value) {
        this.getOutlookForRangeLengthBackwardResult = value;
    }

}
