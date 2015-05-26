
package com.carrierate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteRatesWithCarrierLiability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteRatesWithCarrierLiability">
 *   &lt;complexContent>
 *     &lt;extension base="{http://carrierate.com/}QuoteRates">
 *       &lt;sequence>
 *         &lt;element name="CarrierLiablityNew" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CarrierLiablityUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteRatesWithCarrierLiability", propOrder = {
    "carrierLiablityNew",
    "carrierLiablityUsed"
})
public class QuoteRatesWithCarrierLiability
    extends QuoteRates
{

    @XmlElement(name = "CarrierLiablityNew")
    protected double carrierLiablityNew;
    @XmlElement(name = "CarrierLiablityUsed")
    protected double carrierLiablityUsed;

    /**
     * Gets the value of the carrierLiablityNew property.
     * 
     */
    public double getCarrierLiablityNew() {
        return carrierLiablityNew;
    }

    /**
     * Sets the value of the carrierLiablityNew property.
     * 
     */
    public void setCarrierLiablityNew(double value) {
        this.carrierLiablityNew = value;
    }

    /**
     * Gets the value of the carrierLiablityUsed property.
     * 
     */
    public double getCarrierLiablityUsed() {
        return carrierLiablityUsed;
    }

    /**
     * Sets the value of the carrierLiablityUsed property.
     * 
     */
    public void setCarrierLiablityUsed(double value) {
        this.carrierLiablityUsed = value;
    }

}
