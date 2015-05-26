
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_ProviderRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC_ProviderRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_ProviderEnumType" />
 *       &lt;attribute name="channel_group_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_ProviderRQType")
public class SCProviderRQType {

    @XmlAttribute(name = "type", required = true)
    protected COProviderEnumType type;
    @XmlAttribute(name = "channel_group_id")
    protected String channelGroupId;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link COProviderEnumType }
     *     
     */
    public COProviderEnumType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link COProviderEnumType }
     *     
     */
    public void setType(COProviderEnumType value) {
        this.type = value;
    }

    /**
     * Gets the value of the channelGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelGroupId() {
        return channelGroupId;
    }

    /**
     * Sets the value of the channelGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelGroupId(String value) {
        this.channelGroupId = value;
    }

}
