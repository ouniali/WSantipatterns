
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_BookabilityRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC_BookabilityRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="bookability" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_BookabilityEnumType" />
 *       &lt;attribute name="channel_group_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_BookabilityRQType")
public class SCBookabilityRQType {

    @XmlAttribute(name = "bookability", required = true)
    protected COBookabilityEnumType bookability;
    @XmlAttribute(name = "channel_group_id")
    protected String channelGroupId;

    /**
     * Gets the value of the bookability property.
     * 
     * @return
     *     possible object is
     *     {@link COBookabilityEnumType }
     *     
     */
    public COBookabilityEnumType getBookability() {
        return bookability;
    }

    /**
     * Sets the value of the bookability property.
     * 
     * @param value
     *     allowed object is
     *     {@link COBookabilityEnumType }
     *     
     */
    public void setBookability(COBookabilityEnumType value) {
        this.bookability = value;
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
