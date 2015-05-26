
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
 *         &lt;element name="GetAnnualizedTopicDataResult" type="{http://www.xignite.com/services/}TopicData" minOccurs="0"/>
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
    "getAnnualizedTopicDataResult"
})
@XmlRootElement(name = "GetAnnualizedTopicDataResponse")
public class GetAnnualizedTopicDataResponse {

    @XmlElement(name = "GetAnnualizedTopicDataResult")
    protected TopicData getAnnualizedTopicDataResult;

    /**
     * Gets the value of the getAnnualizedTopicDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link TopicData }
     *     
     */
    public TopicData getGetAnnualizedTopicDataResult() {
        return getAnnualizedTopicDataResult;
    }

    /**
     * Sets the value of the getAnnualizedTopicDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicData }
     *     
     */
    public void setGetAnnualizedTopicDataResult(TopicData value) {
        this.getAnnualizedTopicDataResult = value;
    }

}
