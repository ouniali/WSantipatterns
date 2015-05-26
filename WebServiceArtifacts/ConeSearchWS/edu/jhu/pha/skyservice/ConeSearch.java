
package edu.jhu.pha.skyservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="ra" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dec" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sr" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "ra",
    "dec",
    "sr"
})
@XmlRootElement(name = "ConeSearch")
public class ConeSearch {

    protected double ra;
    protected double dec;
    protected double sr;

    /**
     * Gets the value of the ra property.
     * 
     */
    public double getRa() {
        return ra;
    }

    /**
     * Sets the value of the ra property.
     * 
     */
    public void setRa(double value) {
        this.ra = value;
    }

    /**
     * Gets the value of the dec property.
     * 
     */
    public double getDec() {
        return dec;
    }

    /**
     * Sets the value of the dec property.
     * 
     */
    public void setDec(double value) {
        this.dec = value;
    }

    /**
     * Gets the value of the sr property.
     * 
     */
    public double getSr() {
        return sr;
    }

    /**
     * Sets the value of the sr property.
     * 
     */
    public void setSr(double value) {
        this.sr = value;
    }

}
