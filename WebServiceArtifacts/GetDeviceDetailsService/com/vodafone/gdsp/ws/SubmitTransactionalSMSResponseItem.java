
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitTransactionalSMSResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitTransactionalSMSResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="responseDataCodingScheme" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="responseProtocolId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="responseUDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failureReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitTransactionalSMSResponseItem", propOrder = {
    "deviceId",
    "messageReference",
    "responseData",
    "responseDataCodingScheme",
    "responseProtocolId",
    "responseUDH",
    "failureReason",
    "returnCode"
})
public class SubmitTransactionalSMSResponseItem {

    protected String deviceId;
    protected String messageReference;
    protected byte[] responseData;
    protected Integer responseDataCodingScheme;
    protected Integer responseProtocolId;
    protected String responseUDH;
    protected String failureReason;
    protected ReturnCode returnCode;

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
     * Gets the value of the messageReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageReference() {
        return messageReference;
    }

    /**
     * Sets the value of the messageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageReference(String value) {
        this.messageReference = value;
    }

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setResponseData(byte[] value) {
        this.responseData = value;
    }

    /**
     * Gets the value of the responseDataCodingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseDataCodingScheme() {
        return responseDataCodingScheme;
    }

    /**
     * Sets the value of the responseDataCodingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseDataCodingScheme(Integer value) {
        this.responseDataCodingScheme = value;
    }

    /**
     * Gets the value of the responseProtocolId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseProtocolId() {
        return responseProtocolId;
    }

    /**
     * Sets the value of the responseProtocolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseProtocolId(Integer value) {
        this.responseProtocolId = value;
    }

    /**
     * Gets the value of the responseUDH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseUDH() {
        return responseUDH;
    }

    /**
     * Sets the value of the responseUDH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseUDH(String value) {
        this.responseUDH = value;
    }

    /**
     * Gets the value of the failureReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * Sets the value of the failureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureReason(String value) {
        this.failureReason = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCode }
     *     
     */
    public ReturnCode getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCode }
     *     
     */
    public void setReturnCode(ReturnCode value) {
        this.returnCode = value;
    }

}
