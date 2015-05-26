
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitSMS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitSMS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceId" type="{http://ws.gdsp.vodafone.com/}tDeviceId" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="messageType" type="{http://ws.gdsp.vodafone.com/}tSmsMessageTypeOptions"/>
 *         &lt;element name="messageUDH" type="{http://ws.gdsp.vodafone.com/}tYesNoOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitSMS", propOrder = {
    "deviceId",
    "sourceId",
    "messageData",
    "messageType",
    "messageUDH"
})
public class SubmitSMS {

    protected String deviceId;
    protected String sourceId;
    @XmlElement(required = true)
    protected byte[] messageData;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TSmsMessageTypeOptions messageType;
    @XmlSchemaType(name = "string")
    protected TYesNoOptions messageUDH;

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

}
