
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Specify a range of times.
 * 
 * <p>Java class for typeTimeRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeTimeRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EarliestTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LatestTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTimeRange")
@XmlSeeAlso({
    SearchEvent.class
})
public class TypeTimeRange {

    @XmlAttribute(name = "EarliestTime", required = true)
    protected String earliestTime;
    @XmlAttribute(name = "LatestTime", required = true)
    protected String latestTime;

    /**
     * Gets the value of the earliestTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestTime() {
        return earliestTime;
    }

    /**
     * Sets the value of the earliestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestTime(String value) {
        this.earliestTime = value;
    }

    /**
     * Gets the value of the latestTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestTime() {
        return latestTime;
    }

    /**
     * Sets the value of the latestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestTime(String value) {
        this.latestTime = value;
    }

}
