
package com.v3leisure.schemas.cabs._1_0.cabs_providercalendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.v3leisure.schemas.cabs._1_0.cabs_common.ArrayOfCODistributionChannelRQType;
import com.v3leisure.schemas.cabs._1_0.cabs_common.ArrayOfCOProviderShortType;
import com.v3leisure.schemas.cabs._1_0.cabs_common.CAQueryRQType;
import com.v3leisure.schemas.cabs._1_0.cabs_common.CAResponseInclusionsRQType;


/**
 * <p>Java class for CABS_ProviderCalendar_RQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CABS_ProviderCalendar_RQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Channels" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfCO_DistributionChannelRQType" minOccurs="0"/>
 *         &lt;element name="Providers" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfCO_ProviderShortType" minOccurs="0"/>
 *         &lt;element name="Query" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CA_QueryRQType" minOccurs="0"/>
 *         &lt;element name="Response" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CA_ResponseInclusionsRQType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CABS_ProviderCalendar_RQ", propOrder = {
    "channels",
    "providers",
    "query",
    "response"
})
public class CABSProviderCalendarRQ {

    @XmlElement(name = "Channels")
    protected ArrayOfCODistributionChannelRQType channels;
    @XmlElement(name = "Providers")
    protected ArrayOfCOProviderShortType providers;
    @XmlElement(name = "Query")
    protected CAQueryRQType query;
    @XmlElement(name = "Response")
    protected CAResponseInclusionsRQType response;

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCODistributionChannelRQType }
     *     
     */
    public ArrayOfCODistributionChannelRQType getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCODistributionChannelRQType }
     *     
     */
    public void setChannels(ArrayOfCODistributionChannelRQType value) {
        this.channels = value;
    }

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
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link CAQueryRQType }
     *     
     */
    public CAQueryRQType getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAQueryRQType }
     *     
     */
    public void setQuery(CAQueryRQType value) {
        this.query = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link CAResponseInclusionsRQType }
     *     
     */
    public CAResponseInclusionsRQType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAResponseInclusionsRQType }
     *     
     */
    public void setResponse(CAResponseInclusionsRQType value) {
        this.response = value;
    }

}
