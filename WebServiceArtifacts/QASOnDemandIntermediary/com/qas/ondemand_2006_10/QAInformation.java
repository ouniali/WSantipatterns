
package com.qas.ondemand_2006_10;

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
 *         &lt;element name="StateTransition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreditsUsed" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "stateTransition",
    "creditsUsed"
})
@XmlRootElement(name = "QAInformation")
public class QAInformation {

    @XmlElement(name = "StateTransition", required = true)
    protected String stateTransition;
    @XmlElement(name = "CreditsUsed")
    protected long creditsUsed;

    /**
     * Gets the value of the stateTransition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateTransition() {
        return stateTransition;
    }

    /**
     * Sets the value of the stateTransition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateTransition(String value) {
        this.stateTransition = value;
    }

    /**
     * Gets the value of the creditsUsed property.
     * 
     */
    public long getCreditsUsed() {
        return creditsUsed;
    }

    /**
     * Sets the value of the creditsUsed property.
     * 
     */
    public void setCreditsUsed(long value) {
        this.creditsUsed = value;
    }

}
