
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
 *         &lt;element name="TopicCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChartWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChartHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Preset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "topicCode",
    "startDate",
    "endDate",
    "chartWidth",
    "chartHeight",
    "preset"
})
@XmlRootElement(name = "GetChartUrlPreset")
public class GetChartUrlPreset {

    @XmlElement(name = "TopicCode")
    protected String topicCode;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "ChartWidth")
    protected int chartWidth;
    @XmlElement(name = "ChartHeight")
    protected int chartHeight;
    @XmlElement(name = "Preset")
    protected String preset;

    /**
     * Gets the value of the topicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopicCode() {
        return topicCode;
    }

    /**
     * Sets the value of the topicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopicCode(String value) {
        this.topicCode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the chartWidth property.
     * 
     */
    public int getChartWidth() {
        return chartWidth;
    }

    /**
     * Sets the value of the chartWidth property.
     * 
     */
    public void setChartWidth(int value) {
        this.chartWidth = value;
    }

    /**
     * Gets the value of the chartHeight property.
     * 
     */
    public int getChartHeight() {
        return chartHeight;
    }

    /**
     * Sets the value of the chartHeight property.
     * 
     */
    public void setChartHeight(int value) {
        this.chartHeight = value;
    }

    /**
     * Gets the value of the preset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreset() {
        return preset;
    }

    /**
     * Sets the value of the preset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreset(String value) {
        this.preset = value;
    }

}
