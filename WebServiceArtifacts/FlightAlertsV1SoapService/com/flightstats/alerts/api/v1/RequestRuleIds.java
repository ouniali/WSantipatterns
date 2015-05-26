
package com.flightstats.alerts.api.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestRuleIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestRuleIds">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.api.alerts.flightstats.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="lessThan" type="{http://v1.api.alerts.flightstats.com/}requestedInteger" minOccurs="0"/>
 *         &lt;element name="extendedOptions" type="{http://v1.api.alerts.flightstats.com/}requestedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestRuleIds", propOrder = {
    "lessThan",
    "extendedOptions"
})
public class RequestRuleIds
    extends RequestBase
{

    protected RequestedInteger lessThan;
    protected RequestedString extendedOptions;

    /**
     * Gets the value of the lessThan property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedInteger }
     *     
     */
    public RequestedInteger getLessThan() {
        return lessThan;
    }

    /**
     * Sets the value of the lessThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedInteger }
     *     
     */
    public void setLessThan(RequestedInteger value) {
        this.lessThan = value;
    }

    /**
     * Gets the value of the extendedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedString }
     *     
     */
    public RequestedString getExtendedOptions() {
        return extendedOptions;
    }

    /**
     * Sets the value of the extendedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedString }
     *     
     */
    public void setExtendedOptions(RequestedString value) {
        this.extendedOptions = value;
    }

}
