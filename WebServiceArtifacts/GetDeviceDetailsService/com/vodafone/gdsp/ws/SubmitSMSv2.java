
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitSMSv2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitSMSv2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="messageType" type="{http://ws.gdsp.vodafone.com/}tSmsMessageTypeOptions" minOccurs="0"/>
 *         &lt;element name="messageUDH" type="{http://ws.gdsp.vodafone.com/}tYesNoOptions" minOccurs="0"/>
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
@XmlType(name = "submitSMSv2", propOrder = {
    "deviceId",
    "sourceId",
    "messageData",
    "messageType",
    "messageUDH",
    "priority",
    "validityPeriod",
    "replaceIfPresent"
})
public class SubmitSMSv2 {

    protected String deviceId;
    protected String sourceId;
    protected byte[] messageData;
    @XmlSchemaType(name = "string")
    protected TSmsMessageTypeOptions messageType;
    @XmlSchemaType(name = "string")
    protected TYesNoOptions messageUDH;
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
     * Gets the value of the messageData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMessageData() {
        return messageData;
    }

    /**
     * Sets the value of the messageData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMessageData(byte[] value) {
        this.messageData = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link TSmsMessageTypeOptions }
     *     
     */
    public TSmsMessageTypeOptions getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSmsMessageTypeOptions }
     *     
     */
    public void setMessageType(TSmsMessageTypeOptions value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the messageUDH property.
     * 
     * @return
     *     possible object is
     *     {@link TYesNoOptions }
     *     
     */
    public TYesNoOptions getMessageUDH() {
        return messageUDH;
    }

    /**
     * Sets the value of the messageUDH property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYesNoOptions }
     *     
     */
    public void setMessageUDH(TYesNoOptions value) {
        this.messageUDH = value;
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
