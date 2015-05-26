
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="IncludeRelated" type="{http://www.xignite.com/services/}IssuerRelatedTypes"/>
 *         &lt;element name="Exchange" type="{http://www.xignite.com/services/}Exchanges"/>
 *         &lt;element name="EventType" type="{http://www.xignite.com/services/}EventTypes"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "includeRelated",
    "exchange",
    "eventType",
    "startDate",
    "endDate"
})
@XmlRootElement(name = "GetIssuerTransformationsByExchange")
public class GetIssuerTransformationsByExchange {

    @XmlElement(name = "IncludeRelated", required = true)
    @XmlSchemaType(name = "string")
    protected IssuerRelatedTypes includeRelated;
    @XmlElement(name = "Exchange", required = true)
    protected String exchange;
    @XmlElement(name = "EventType", required = true)
    @XmlSchemaType(name = "string")
    protected EventTypes eventType;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "EndDate")
    protected String endDate;

    /**
     * Gets the value of the includeRelated property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerRelatedTypes }
     *     
     */
    public IssuerRelatedTypes getIncludeRelated() {
        return includeRelated;
    }

    /**
     * Sets the value of the includeRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerRelatedTypes }
     *     
     */
    public void setIncludeRelated(IssuerRelatedTypes value) {
        this.includeRelated = value;
    }

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchange(String value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link EventTypes }
     *     
     */
    public EventTypes getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTypes }
     *     
     */
    public void setEventType(EventTypes value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

}
