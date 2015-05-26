
package com.xifin.schema.accessionsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.xifin.schema.msgheader.MessageHeader;


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
 *         &lt;element ref="{http://www.xifin.com/schema/msgHeader}MessageHeader"/>
 *         &lt;element name="Payload">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.xifin.com/schema/accessionSearch}AccessionSearchRequestMessage"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "messageHeader",
    "payload"
})
@XmlRootElement(name = "AccessionSearchRequest")
public class AccessionSearchRequest {

    @XmlElement(name = "MessageHeader", namespace = "http://www.xifin.com/schema/msgHeader", required = true)
    protected MessageHeader messageHeader;
    @XmlElement(name = "Payload", required = true)
    protected AccessionSearchRequest.Payload payload;

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
    public void setMessageHeader(MessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link AccessionSearchRequest.Payload }
     *     
     */
    public AccessionSearchRequest.Payload getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessionSearchRequest.Payload }
     *     
     */
    public void setPayload(AccessionSearchRequest.Payload value) {
        this.payload = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.xifin.com/schema/accessionSearch}AccessionSearchRequestMessage"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accessionSearchRequestMessage"
    })
    public static class Payload {

        @XmlElement(name = "AccessionSearchRequestMessage")
        protected AccessionSearchRequestMessage accessionSearchRequestMessage;

        /**
         * Gets the value of the accessionSearchRequestMessage property.
         * 
         * @return
         *     possible object is
         *     {@link AccessionSearchRequestMessage }
         *     
         */
        public AccessionSearchRequestMessage getAccessionSearchRequestMessage() {
            return accessionSearchRequestMessage;
        }

        /**
         * Sets the value of the accessionSearchRequestMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessionSearchRequestMessage }
         *     
         */
        public void setAccessionSearchRequestMessage(AccessionSearchRequestMessage value) {
            this.accessionSearchRequestMessage = value;
        }

    }

}
