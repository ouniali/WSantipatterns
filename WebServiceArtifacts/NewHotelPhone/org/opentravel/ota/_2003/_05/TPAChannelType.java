
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPAChannelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPAChannelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChannelType" type="{http://www.opentravel.org/OTA/2003/05}EChannelType"/>
 *         &lt;element name="ChannelIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPAChannelType", propOrder = {
    "channelType",
    "channelIdentifier"
})
public class TPAChannelType {

    @XmlElement(name = "ChannelType", required = true)
    @XmlSchemaType(name = "string")
    protected EChannelType channelType;
    @XmlElement(name = "ChannelIdentifier")
    protected String channelIdentifier;

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link EChannelType }
     *     
     */
    public EChannelType getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EChannelType }
     *     
     */
    public void setChannelType(EChannelType value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the channelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelIdentifier() {
        return channelIdentifier;
    }

    /**
     * Sets the value of the channelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelIdentifier(String value) {
        this.channelIdentifier = value;
    }

}
