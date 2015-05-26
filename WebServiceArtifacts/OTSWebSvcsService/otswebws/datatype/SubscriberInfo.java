
package otswebws.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enqueueEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enqueueCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="enqueueCountResetTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enqueueEnabledTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastDequeueTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastEnqueueTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dequeueBlockCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="queueDepth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="warnThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberInfo", propOrder = {
    "enqueueEnabled",
    "enqueueCount",
    "enqueueCountResetTime",
    "enqueueEnabledTime",
    "fullThreshold",
    "lastDequeueTime",
    "lastEnqueueTime",
    "dequeueBlockCount",
    "queueDepth",
    "warnThreshold"
})
public class SubscriberInfo {

    protected boolean enqueueEnabled;
    protected int enqueueCount;
    @XmlElement(required = true, nillable = true)
    protected String enqueueCountResetTime;
    @XmlElement(required = true, nillable = true)
    protected String enqueueEnabledTime;
    protected int fullThreshold;
    @XmlElement(required = true, nillable = true)
    protected String lastDequeueTime;
    @XmlElement(required = true, nillable = true)
    protected String lastEnqueueTime;
    protected int dequeueBlockCount;
    protected int queueDepth;
    protected int warnThreshold;

    /**
     * Gets the value of the enqueueEnabled property.
     * 
     */
    public boolean isEnqueueEnabled() {
        return enqueueEnabled;
    }

    /**
     * Sets the value of the enqueueEnabled property.
     * 
     */
    public void setEnqueueEnabled(boolean value) {
        this.enqueueEnabled = value;
    }

    /**
     * Gets the value of the enqueueCount property.
     * 
     */
    public int getEnqueueCount() {
        return enqueueCount;
    }

    /**
     * Sets the value of the enqueueCount property.
     * 
     */
    public void setEnqueueCount(int value) {
        this.enqueueCount = value;
    }

    /**
     * Gets the value of the enqueueCountResetTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnqueueCountResetTime() {
        return enqueueCountResetTime;
    }

    /**
     * Sets the value of the enqueueCountResetTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnqueueCountResetTime(String value) {
        this.enqueueCountResetTime = value;
    }

    /**
     * Gets the value of the enqueueEnabledTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnqueueEnabledTime() {
        return enqueueEnabledTime;
    }

    /**
     * Sets the value of the enqueueEnabledTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnqueueEnabledTime(String value) {
        this.enqueueEnabledTime = value;
    }

    /**
     * Gets the value of the fullThreshold property.
     * 
     */
    public int getFullThreshold() {
        return fullThreshold;
    }

    /**
     * Sets the value of the fullThreshold property.
     * 
     */
    public void setFullThreshold(int value) {
        this.fullThreshold = value;
    }

    /**
     * Gets the value of the lastDequeueTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDequeueTime() {
        return lastDequeueTime;
    }

    /**
     * Sets the value of the lastDequeueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDequeueTime(String value) {
        this.lastDequeueTime = value;
    }

    /**
     * Gets the value of the lastEnqueueTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastEnqueueTime() {
        return lastEnqueueTime;
    }

    /**
     * Sets the value of the lastEnqueueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastEnqueueTime(String value) {
        this.lastEnqueueTime = value;
    }

    /**
     * Gets the value of the dequeueBlockCount property.
     * 
     */
    public int getDequeueBlockCount() {
        return dequeueBlockCount;
    }

    /**
     * Sets the value of the dequeueBlockCount property.
     * 
     */
    public void setDequeueBlockCount(int value) {
        this.dequeueBlockCount = value;
    }

    /**
     * Gets the value of the queueDepth property.
     * 
     */
    public int getQueueDepth() {
        return queueDepth;
    }

    /**
     * Sets the value of the queueDepth property.
     * 
     */
    public void setQueueDepth(int value) {
        this.queueDepth = value;
    }

    /**
     * Gets the value of the warnThreshold property.
     * 
     */
    public int getWarnThreshold() {
        return warnThreshold;
    }

    /**
     * Sets the value of the warnThreshold property.
     * 
     */
    public void setWarnThreshold(int value) {
        this.warnThreshold = value;
    }

}
