
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitWUTriggerv2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitWUTriggerv2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="triggerType" type="{http://ws.gdsp.vodafone.com/}tTriggerType" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://ws.gdsp.vodafone.com/}tSmsPriorityOptions" minOccurs="0"/>
 *         &lt;element name="validityPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replaceIfPresent" type="{http://ws.gdsp.vodafone.com/}tYesNoOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitWUTriggerv2", propOrder = {
    "deviceId",
    "sourceId",
    "triggerType",
    "priority",
    "validityPeriod",
    "replaceIfPresent"
})
public class SubmitWUTriggerv2_Type {

    @XmlElement(required = true)
    protected String deviceId;
    protected String sourceId;
    @XmlSchemaType(name = "string")
    protected TTriggerType triggerType;
    protected Integer priority;
    protected String validityPeriod;
    @XmlSchemaType(name = "string")
    protected TYesNoOptions replaceIfPresent;

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     * @return
     *     possible object is
     *     {@link TTriggerType }
     *     
     */
    public TTriggerType getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTriggerType }
     *     
     */
    public void setTriggerType(TTriggerType value) {
        this.triggerType = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityPeriod(String value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the replaceIfPresent property.
     * 
     * @return
     *     possible object is
     *     {@link TYesNoOptions }
     *     
     */
    public TYesNoOptions getReplaceIfPresent() {
        return replaceIfPresent;
    }

    /**
     * Sets the value of the replaceIfPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYesNoOptions }
     *     
     */
    public void setReplaceIfPresent(TYesNoOptions value) {
        this.replaceIfPresent = value;
    }

}
