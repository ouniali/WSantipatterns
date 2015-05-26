
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
 *         &lt;element name="GetTopicBinaryChartPresetResult" type="{http://www.xignite.com/services/}TopicChartBinary" minOccurs="0"/>
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
    "getTopicBinaryChartPresetResult"
})
@XmlRootElement(name = "GetTopicBinaryChartPresetResponse")
public class GetTopicBinaryChartPresetResponse {

    @XmlElement(name = "GetTopicBinaryChartPresetResult")
    protected TopicChartBinary getTopicBinaryChartPresetResult;

    /**
     * Gets the value of the getTopicBinaryChartPresetResult property.
     * 
     * @return
     *     possible object is
     *     {@link TopicChartBinary }
     *     
     */
    public TopicChartBinary getGetTopicBinaryChartPresetResult() {
        return getTopicBinaryChartPresetResult;
    }

    /**
     * Sets the value of the getTopicBinaryChartPresetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicChartBinary }
     *     
     */
    public void setGetTopicBinaryChartPresetResult(TopicChartBinary value) {
        this.getTopicBinaryChartPresetResult = value;
    }

}
