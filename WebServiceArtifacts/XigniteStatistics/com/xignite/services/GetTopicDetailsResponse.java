
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
 *         &lt;element name="GetTopicDetailsResult" type="{http://www.xignite.com/services/}TopicDetail" minOccurs="0"/>
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
    "getTopicDetailsResult"
})
@XmlRootElement(name = "GetTopicDetailsResponse")
public class GetTopicDetailsResponse {

    @XmlElement(name = "GetTopicDetailsResult")
    protected TopicDetail getTopicDetailsResult;

    /**
     * Gets the value of the getTopicDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link TopicDetail }
     *     
     */
    public TopicDetail getGetTopicDetailsResult() {
        return getTopicDetailsResult;
    }

    /**
     * Sets the value of the getTopicDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicDetail }
     *     
     */
    public void setGetTopicDetailsResult(TopicDetail value) {
        this.getTopicDetailsResult = value;
    }

}
