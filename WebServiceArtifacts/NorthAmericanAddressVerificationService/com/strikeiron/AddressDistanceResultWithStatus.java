
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressDistanceResultWithStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressDistanceResultWithStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.strikeiron.com}SIWsResultWithStatus">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://www.strikeiron.com}AddressDistanceResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressDistanceResultWithStatus", propOrder = {
    "result"
})
public class AddressDistanceResultWithStatus
    extends SIWsResultWithStatus
{

    @XmlElement(name = "Result")
    protected AddressDistanceResult result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDistanceResult }
     *     
     */
    public AddressDistanceResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDistanceResult }
     *     
     */
    public void setResult(AddressDistanceResult value) {
        this.result = value;
    }

}
