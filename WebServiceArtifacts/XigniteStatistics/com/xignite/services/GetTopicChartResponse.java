
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
 *         &lt;element name="GetTopicChartResult" type="{http://www.xignite.com/services/}TopicChart" minOccurs="0"/>
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
    "getTopicChartResult"
})
@XmlRootElement(name = "GetTopicChartResponse")
public class GetTopicChartResponse {

    @XmlElement(name = "GetTopicChartResult")
    protected TopicChart getTopicChartResult;

    /**
     * Gets the value of the getTopicChartResult property.
     * 
     * @return
     *     possible object is
     *     {@link TopicChart }
     *     
     */
    public TopicChart getGetTopicChartResult() {
        return getTopicChartResult;
    }

    /**
     * Sets the value of the getTopicChartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicChart }
     *     
     */
    public void setGetTopicChartResult(TopicChart value) {
        this.getTopicChartResult = value;
    }

}
