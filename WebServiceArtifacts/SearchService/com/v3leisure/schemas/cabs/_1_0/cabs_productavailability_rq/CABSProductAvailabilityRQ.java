
package com.v3leisure.schemas.cabs._1_0.cabs_productavailability_rq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.v3leisure.schemas.cabs._1_0.cabs_common.AVQueryRQType;
import com.v3leisure.schemas.cabs._1_0.cabs_common.ArrayOfCODistributionChannelRQType1;
import com.v3leisure.schemas.cabs._1_0.cabs_common.ArrayOfCOProviderShortType1;


/**
 * <p>Java class for CABS_ProductAvailability_RQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CABS_ProductAvailability_RQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Channels" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfCO_DistributionChannelRQType1" minOccurs="0"/>
 *         &lt;element name="Providers" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfCO_ProviderShortType1" minOccurs="0"/>
 *         &lt;element name="Query" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}AV_QueryRQType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CABS_ProductAvailability_RQ", propOrder = {
    "channels",
    "providers",
    "query"
})
public class CABSProductAvailabilityRQ {

    @XmlElement(name = "Channels")
    protected ArrayOfCODistributionChannelRQType1 channels;
    @XmlElement(name = "Providers")
    protected ArrayOfCOProviderShortType1 providers;
    @XmlElement(name = "Query")
    protected AVQueryRQType query;

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCODistributionChannelRQType1 }
     *     
     */
    public ArrayOfCODistributionChannelRQType1 getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCODistributionChannelRQType1 }
     *     
     */
    public void setChannels(ArrayOfCODistributionChannelRQType1 value) {
        this.channels = value;
    }

    /**
     * Gets the value of the providers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCOProviderShortType1 }
     *     
     */
    public ArrayOfCOProviderShortType1 getProviders() {
        return providers;
    }

    /**
     * Sets the value of the providers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCOProviderShortType1 }
     *     
     */
    public void setProviders(ArrayOfCOProviderShortType1 value) {
        this.providers = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link AVQueryRQType }
     *     
     */
    public AVQueryRQType getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVQueryRQType }
     *     
     */
    public void setQuery(AVQueryRQType value) {
        this.query = value;
    }

}
