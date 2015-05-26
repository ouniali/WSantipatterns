
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
 *         &lt;element name="GetTopicBinaryChartResult" type="{http://www.xignite.com/services/}TopicChartBinary" minOccurs="0"/>
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
    "getTopicBinaryChartResult"
})
@XmlRootElement(name = "GetTopicBinaryChartResponse")
public class GetTopicBinaryChartResponse {

    @XmlElement(name = "GetTopicBinaryChartResult")
    protected TopicChartBinary getTopicBinaryChartResult;

    /**
     * Gets the value of the getTopicBinaryChartResult property.
     * 
     * @return
     *     possible object is
     *     {@link TopicChartBinary }
     *     
     */
    public TopicChartBinary getGetTopicBinaryChartResult() {
        return getTopicBinaryChartResult;
    }

    /**
     * Sets the value of the getTopicBinaryChartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicChartBinary }
     *     
     */
    public void setGetTopicBinaryChartResult(TopicChartBinary value) {
        this.getTopicBinaryChartResult = value;
    }

}
