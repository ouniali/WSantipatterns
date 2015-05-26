
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AV_DistributionChannelRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AV_DistributionChannelRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Providers" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfCO_ProviderShortType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AV_DistributionChannelRSType", propOrder = {
    "providers"
})
public class AVDistributionChannelRSType {

    @XmlElement(name = "Providers")
    protected ArrayOfCOProviderShortType providers;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the providers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCOProviderShortType }
     *     
     */
    public ArrayOfCOProviderShortType getProviders() {
        return providers;
    }

    /**
     * Sets the value of the providers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCOProviderShortType }
     *     
     */
    public void setProviders(ArrayOfCOProviderShortType value) {
        this.providers = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
