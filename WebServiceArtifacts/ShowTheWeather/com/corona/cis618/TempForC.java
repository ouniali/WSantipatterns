
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
 *         &lt;element name="Fahrenheit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Mult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "fahrenheit",
    "mult"
})
@XmlRootElement(name = "TempForC")
public class TempForC {

    @XmlElement(name = "Fahrenheit")
    protected boolean fahrenheit;
    @XmlElement(name = "Mult")
    protected int mult;

    /**
     * Gets the value of the fahrenheit property.
     * 
     */
    public boolean isFahrenheit() {
        return fahrenheit;
    }

    /**
     * Sets the value of the fahrenheit property.
     * 
     */
    public void setFahrenheit(boolean value) {
        this.fahrenheit = value;
    }

    /**
     * Gets the value of the mult property.
     * 
     */
    public int getMult() {
        return mult;
    }

    /**
     * Sets the value of the mult property.
     * 
     */
    public void setMult(int value) {
        this.mult = value;
    }

}
