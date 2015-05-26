
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="LogResult" type="{http://www.xignite.com/services/}LogEntry" minOccurs="0"/>
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
    "logResult"
})
@XmlRootElement(name = "LogResponse")
public class LogResponse {

    @XmlElement(name = "LogResult")
    protected LogEntry logResult;

    /**
     * Gets the value of the logResult property.
     * 
     * @return
     *     possible object is
     *     {@link LogEntry }
     *     
     */
    public LogEntry getLogResult() {
        return logResult;
    }

    /**
     * Sets the value of the logResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogEntry }
     *     
     */
    public void setLogResult(LogEntry value) {
        this.logResult = value;
    }

}
