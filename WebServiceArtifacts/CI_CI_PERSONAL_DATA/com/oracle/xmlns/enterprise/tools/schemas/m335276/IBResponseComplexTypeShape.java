
package com.oracle.xmlns.enterprise.tools.schemas.m335276;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBResponseComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBResponseComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultTitle" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M335276.V1}DefaultTitleTypeShape" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M335276.V1}StatusCodeTypeShape" minOccurs="0"/>
 *         &lt;element name="MessageSetID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M335276.V1}MessageSetIDTypeShape" minOccurs="0"/>
 *         &lt;element name="MessageID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M335276.V1}MessageIDTypeShape" minOccurs="0"/>
 *         &lt;element name="DefaultMessage" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M335276.V1}DefaultMessageTypeShape" minOccurs="0"/>
 *         &lt;element name="MessageParameters" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M335276.V1}MessageParametersComplexTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBResponseComplexTypeShape", propOrder = {
    "defaultTitle",
    "statusCode",
    "messageSetID",
    "messageID",
    "defaultMessage",
    "messageParameters"
})
public class IBResponseComplexTypeShape {

    @XmlElement(name = "DefaultTitle")
    protected DefaultTitleTypeShape defaultTitle;
    @XmlElement(name = "StatusCode")
    protected StatusCodeTypeShape statusCode;
    @XmlElement(name = "MessageSetID")
    protected MessageSetIDTypeShape messageSetID;
    @XmlElement(name = "MessageID")
    protected MessageIDTypeShape messageID;
    @XmlElement(name = "DefaultMessage")
    protected DefaultMessageTypeShape defaultMessage;
    @XmlElement(name = "MessageParameters")
    protected MessageParametersComplexTypeShape messageParameters;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the defaultTitle property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultTitleTypeShape }
     *     
     */
    public DefaultTitleTypeShape getDefaultTitle() {
        return defaultTitle;
    }

    /**
     * Sets the value of the defaultTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultTitleTypeShape }
     *     
     */
    public void setDefaultTitle(DefaultTitleTypeShape value) {
        this.defaultTitle = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeTypeShape }
     *     
     */
    public StatusCodeTypeShape getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeTypeShape }
     *     
     */
    public void setStatusCode(StatusCodeTypeShape value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the messageSetID property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSetIDTypeShape }
     *     
     */
    public MessageSetIDTypeShape getMessageSetID() {
        return messageSetID;
    }

    /**
     * Sets the value of the messageSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSetIDTypeShape }
     *     
     */
    public void setMessageSetID(MessageSetIDTypeShape value) {
        this.messageSetID = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIDTypeShape }
     *     
     */
    public MessageIDTypeShape getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIDTypeShape }
     *     
     */
    public void setMessageID(MessageIDTypeShape value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the defaultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultMessageTypeShape }
     *     
     */
    public DefaultMessageTypeShape getDefaultMessage() {
        return defaultMessage;
    }

    /**
     * Sets the value of the defaultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultMessageTypeShape }
     *     
     */
    public void setDefaultMessage(DefaultMessageTypeShape value) {
        this.defaultMessage = value;
    }

    /**
     * Gets the value of the messageParameters property.
     * 
     * @return
     *     possible object is
     *     {@link MessageParametersComplexTypeShape }
     *     
     */
    public MessageParametersComplexTypeShape getMessageParameters() {
        return messageParameters;
    }

    /**
     * Sets the value of the messageParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageParametersComplexTypeShape }
     *     
     */
    public void setMessageParameters(MessageParametersComplexTypeShape value) {
        this.messageParameters = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
