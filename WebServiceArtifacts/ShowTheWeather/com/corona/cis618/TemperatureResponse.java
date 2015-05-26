
package com.corona.cis618;

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
 *         &lt;element name="TemperatureResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "temperatureResult"
})
@XmlRootElement(name = "TemperatureResponse")
public class TemperatureResponse {

    @XmlElement(name = "TemperatureResult")
    protected int temperatureResult;

    /**
     * Gets the value of the temperatureResult property.
     * 
     */
    public int getTemperatureResult() {
        return temperatureResult;
    }

    /**
     * Sets the value of the temperatureResult property.
     * 
     */
    public void setTemperatureResult(int value) {
        this.temperatureResult = value;
    }

}
