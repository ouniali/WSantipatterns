
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
 *         &lt;element name="GetTopicChartCustomResult" type="{http://www.xignite.com/services/}TopicChart" minOccurs="0"/>
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
    "getTopicChartCustomResult"
})
@XmlRootElement(name = "GetTopicChartCustomResponse")
public class GetTopicChartCustomResponse {

    @XmlElement(name = "GetTopicChartCustomResult")
    protected TopicChart getTopicChartCustomResult;

    /**
     * Gets the value of the getTopicChartCustomResult property.
     * 
     * @return
     *     possible object is
     *     {@link TopicChart }
     *     
     */
    public TopicChart getGetTopicChartCustomResult() {
        return getTopicChartCustomResult;
    }

    /**
     * Sets the value of the getTopicChartCustomResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicChart }
     *     
     */
    public void setGetTopicChartCustomResult(TopicChart value) {
        this.getTopicChartCustomResult = value;
    }

}
