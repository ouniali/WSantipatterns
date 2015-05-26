
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
 *         &lt;element name="GetTopicStatisticsResult" type="{http://www.xignite.com/services/}TopicStatistics" minOccurs="0"/>
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
    "getTopicStatisticsResult"
})
@XmlRootElement(name = "GetTopicStatisticsResponse")
public class GetTopicStatisticsResponse {

    @XmlElement(name = "GetTopicStatisticsResult")
    protected TopicStatistics getTopicStatisticsResult;

    /**
     * Gets the value of the getTopicStatisticsResult property.
     * 
     * @return
     *     possible object is
     *     {@link TopicStatistics }
     *     
     */
    public TopicStatistics getGetTopicStatisticsResult() {
        return getTopicStatisticsResult;
    }

    /**
     * Sets the value of the getTopicStatisticsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicStatistics }
     *     
     */
    public void setGetTopicStatisticsResult(TopicStatistics value) {
        this.getTopicStatisticsResult = value;
    }

}
