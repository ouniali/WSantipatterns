
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserRegistration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemainingRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PeriodType" type="{http://www.xignite.com/services/}PeriodTypes"/>
 *         &lt;element name="PeriodsAllowed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Action" type="{http://www.xignite.com/services/}ResultTypes"/>
 *         &lt;element name="Status" type="{http://www.xignite.com/services/}StatusTypes"/>
 *         &lt;element name="SubscriptionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalRequestCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRegistration", propOrder = {
    "serviceName",
    "operationName",
    "ip",
    "remainingRequests",
    "periodType",
    "periodsAllowed",
    "action",
    "status",
    "subscriptionName",
    "maxRequests",
    "requestCount",
    "totalRequestCount",
    "updated"
})
public class UserRegistration
    extends Common
{

    @XmlElement(name = "ServiceName")
    protected String serviceName;
    @XmlElement(name = "OperationName")
    protected String operationName;
    @XmlElement(name = "IP")
    protected String ip;
    @XmlElement(name = "RemainingRequests")
    protected int remainingRequests;
    @XmlElement(name = "PeriodType", required = true)
    @XmlSchemaType(name = "string")
    protected PeriodTypes periodType;
    @XmlElement(name = "PeriodsAllowed")
    protected int periodsAllowed;
    @XmlElement(name = "Action", required = true)
    @XmlSchemaType(name = "string")
    protected ResultTypes action;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected StatusTypes status;
    @XmlElement(name = "SubscriptionName")
    protected String subscriptionName;
    @XmlElement(name = "MaxRequests")
    protected int maxRequests;
    @XmlElement(name = "RequestCount")
    protected int requestCount;
    @XmlElement(name = "TotalRequestCount")
    protected int totalRequestCount;
    @XmlElement(name = "Updated")
    protected boolean updated;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP(String value) {
        this.ip = value;
    }

    /**
     * Gets the value of the remainingRequests property.
     * 
     */
    public int getRemainingRequests() {
        return remainingRequests;
    }

    /**
     * Sets the value of the remainingRequests property.
     * 
     */
    public void setRemainingRequests(int value) {
        this.remainingRequests = value;
    }

    /**
     * Gets the value of the periodType property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodTypes }
     *     
     */
    public PeriodTypes getPeriodType() {
        return periodType;
    }

    /**
     * Sets the value of the periodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodTypes }
     *     
     */
    public void setPeriodType(PeriodTypes value) {
        this.periodType = value;
    }

    /**
     * Gets the value of the periodsAllowed property.
     * 
     */
    public int getPeriodsAllowed() {
        return periodsAllowed;
    }

    /**
     * Sets the value of the periodsAllowed property.
     * 
     */
    public void setPeriodsAllowed(int value) {
        this.periodsAllowed = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ResultTypes }
     *     
     */
    public ResultTypes getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultTypes }
     *     
     */
    public void setAction(ResultTypes value) {
        this.action = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTypes }
     *     
     */
    public StatusTypes getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTypes }
     *     
     */
    public void setStatus(StatusTypes value) {
        this.status = value;
    }

    /**
     * Gets the value of the subscriptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }

    /**
     * Sets the value of the subscriptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionName(String value) {
        this.subscriptionName = value;
    }

    /**
     * Gets the value of the maxRequests property.
     * 
     */
    public int getMaxRequests() {
        return maxRequests;
    }

    /**
     * Sets the value of the maxRequests property.
     * 
     */
    public void setMaxRequests(int value) {
        this.maxRequests = value;
    }

    /**
     * Gets the value of the requestCount property.
     * 
     */
    public int getRequestCount() {
        return requestCount;
    }

    /**
     * Sets the value of the requestCount property.
     * 
     */
    public void setRequestCount(int value) {
        this.requestCount = value;
    }

    /**
     * Gets the value of the totalRequestCount property.
     * 
     */
    public int getTotalRequestCount() {
        return totalRequestCount;
    }

    /**
     * Sets the value of the totalRequestCount property.
     * 
     */
    public void setTotalRequestCount(int value) {
        this.totalRequestCount = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     */
    public boolean isUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     */
    public void setUpdated(boolean value) {
        this.updated = value;
    }

}
