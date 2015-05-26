
package com.oracle.xmlns.enterprise.tools.schemas.m713477;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messagesComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messagesComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M713477.V1}typeTypeShape" minOccurs="0"/>
 *         &lt;element name="messagesetnumber" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M713477.V1}messagesetnumberTypeShape" minOccurs="0"/>
 *         &lt;element name="messagenumber" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M713477.V1}messagenumberTypeShape" minOccurs="0"/>
 *         &lt;element name="messagetext" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M713477.V1}messagetextTypeShape" minOccurs="0"/>
 *         &lt;element name="explaintext" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M713477.V1}explaintextTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messagesComplexTypeShape", propOrder = {
    "type",
    "messagesetnumber",
    "messagenumber",
    "messagetext",
    "explaintext"
})
public class MessagesComplexTypeShape {

    protected TypeTypeShape type;
    protected MessagesetnumberTypeShape messagesetnumber;
    protected MessagenumberTypeShape messagenumber;
    protected MessagetextTypeShape messagetext;
    protected ExplaintextTypeShape explaintext;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTypeShape }
     *     
     */
    public TypeTypeShape getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTypeShape }
     *     
     */
    public void setType(TypeTypeShape value) {
        this.type = value;
    }

    /**
     * Gets the value of the messagesetnumber property.
     * 
     * @return
     *     possible object is
     *     {@link MessagesetnumberTypeShape }
     *     
     */
    public MessagesetnumberTypeShape getMessagesetnumber() {
        return messagesetnumber;
    }

    /**
     * Sets the value of the messagesetnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagesetnumberTypeShape }
     *     
     */
    public void setMessagesetnumber(MessagesetnumberTypeShape value) {
        this.messagesetnumber = value;
    }

    /**
     * Gets the value of the messagenumber property.
     * 
     * @return
     *     possible object is
     *     {@link MessagenumberTypeShape }
     *     
     */
    public MessagenumberTypeShape getMessagenumber() {
        return messagenumber;
    }

    /**
     * Sets the value of the messagenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagenumberTypeShape }
     *     
     */
    public void setMessagenumber(MessagenumberTypeShape value) {
        this.messagenumber = value;
    }

    /**
     * Gets the value of the messagetext property.
     * 
     * @return
     *     possible object is
     *     {@link MessagetextTypeShape }
     *     
     */
    public MessagetextTypeShape getMessagetext() {
        return messagetext;
    }

    /**
     * Sets the value of the messagetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagetextTypeShape }
     *     
     */
    public void setMessagetext(MessagetextTypeShape value) {
        this.messagetext = value;
    }

    /**
     * Gets the value of the explaintext property.
     * 
     * @return
     *     possible object is
     *     {@link ExplaintextTypeShape }
     *     
     */
    public ExplaintextTypeShape getExplaintext() {
        return explaintext;
    }

    /**
     * Sets the value of the explaintext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplaintextTypeShape }
     *     
     */
    public void setExplaintext(ExplaintextTypeShape value) {
        this.explaintext = value;
    }

}
