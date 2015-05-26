
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Channel" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_DistributionChannelShortType"/>
 *         &lt;element name="Provider" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_ProviderShortType"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageRSType", propOrder = {
    "channel",
    "provider",
    "message"
})
public class MessageRSType {

    @XmlElement(name = "Channel", required = true, nillable = true)
    protected CODistributionChannelShortType channel;
    @XmlElement(name = "Provider", required = true, nillable = true)
    protected COProviderShortType provider;
    @XmlElement(name = "Message")
    protected String message;
    @XmlAttribute(name = "code")
    protected String code;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link CODistributionChannelShortType }
     *     
     */
    public CODistributionChannelShortType getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODistributionChannelShortType }
     *     
     */
    public void setChannel(CODistributionChannelShortType value) {
        this.channel = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link COProviderShortType }
     *     
     */
    public COProviderShortType getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link COProviderShortType }
     *     
     */
    public void setProvider(COProviderShortType value) {
        this.provider = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
