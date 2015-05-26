
package com.travelport.schema.universal_v16_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;attribute name="NextOnQueue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProviderLocatorCode" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *       &lt;attribute name="ReQueueCurrent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "QueueNextModifiers")
public class QueueNextModifiers {

    @XmlAttribute(name = "NextOnQueue")
    protected Boolean nextOnQueue;
    @XmlAttribute(name = "ProviderLocatorCode")
    protected String providerLocatorCode;
    @XmlAttribute(name = "ReQueueCurrent")
    protected Boolean reQueueCurrent;

    /**
     * Gets the value of the nextOnQueue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNextOnQueue() {
        return nextOnQueue;
    }

    /**
     * Sets the value of the nextOnQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNextOnQueue(Boolean value) {
        this.nextOnQueue = value;
    }

    /**
     * Gets the value of the providerLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLocatorCode() {
        return providerLocatorCode;
    }

    /**
     * Sets the value of the providerLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
    }

    /**
     * Gets the value of the reQueueCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReQueueCurrent() {
        return reQueueCurrent;
    }

    /**
     * Sets the value of the reQueueCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReQueueCurrent(Boolean value) {
        this.reQueueCurrent = value;
    }

}
