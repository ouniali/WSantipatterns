
package com.v3leisure.schemas.cabs._1_0.cabs_provideravailability_rs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.v3leisure.schemas.cabs._1_0.cabs_common.COStatusRSType;


/**
 * <p>Java class for CABS_ProviderAvailability_RS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CABS_ProviderAvailability_RS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_StatusRSType" minOccurs="0"/>
 *         &lt;element name="Channels" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderAvailability_RS.xsd}ArrayOfAV_DistributionChannelRSType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CABS_ProviderAvailability_RS", propOrder = {
    "status",
    "channels"
})
public class CABSProviderAvailabilityRS {

    @XmlElement(name = "Status")
    protected COStatusRSType status;
    @XmlElement(name = "Channels")
    protected ArrayOfAVDistributionChannelRSType channels;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link COStatusRSType }
     *     
     */
    public COStatusRSType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link COStatusRSType }
     *     
     */
    public void setStatus(COStatusRSType value) {
        this.status = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAVDistributionChannelRSType }
     *     
     */
    public ArrayOfAVDistributionChannelRSType getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAVDistributionChannelRSType }
     *     
     */
    public void setChannels(ArrayOfAVDistributionChannelRSType value) {
        this.channels = value;
    }

}
