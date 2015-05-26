
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIWsOutputOfNorthAmericanAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIWsOutputOfNorthAmericanAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceStatus" type="{http://www.strikeiron.com}SIWsStatus" minOccurs="0"/>
 *         &lt;element name="ServiceResult" type="{http://www.strikeiron.com}NorthAmericanAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIWsOutputOfNorthAmericanAddress", propOrder = {
    "serviceStatus",
    "serviceResult"
})
public class SIWsOutputOfNorthAmericanAddress {

    @XmlElement(name = "ServiceStatus")
    protected SIWsStatus serviceStatus;
    @XmlElement(name = "ServiceResult")
    protected NorthAmericanAddress serviceResult;

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsStatus }
     *     
     */
    public SIWsStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsStatus }
     *     
     */
    public void setServiceStatus(SIWsStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the serviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link NorthAmericanAddress }
     *     
     */
    public NorthAmericanAddress getServiceResult() {
        return serviceResult;
    }

    /**
     * Sets the value of the serviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NorthAmericanAddress }
     *     
     */
    public void setServiceResult(NorthAmericanAddress value) {
        this.serviceResult = value;
    }

}
