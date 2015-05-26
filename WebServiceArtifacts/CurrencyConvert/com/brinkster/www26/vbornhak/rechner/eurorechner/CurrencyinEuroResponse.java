
package com.brinkster.www26.vbornhak.rechner.eurorechner;

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
 *         &lt;element name="CurrencyinEuroResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "currencyinEuroResult"
})
@XmlRootElement(name = "CurrencyinEuroResponse")
public class CurrencyinEuroResponse {

    @XmlElement(name = "CurrencyinEuroResult")
    protected double currencyinEuroResult;

    /**
     * Gets the value of the currencyinEuroResult property.
     * 
     */
    public double getCurrencyinEuroResult() {
        return currencyinEuroResult;
    }

    /**
     * Sets the value of the currencyinEuroResult property.
     * 
     */
    public void setCurrencyinEuroResult(double value) {
        this.currencyinEuroResult = value;
    }

}
