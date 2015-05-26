
package org.tempuri.dotnet.financeservice;

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
 *         &lt;element name="NominalInterest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CompoundingPeriodsPerYear" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "nominalInterest",
    "compoundingPeriodsPerYear"
})
@XmlRootElement(name = "EffectiveInterest")
public class EffectiveInterest {

    @XmlElement(name = "NominalInterest")
    protected double nominalInterest;
    @XmlElement(name = "CompoundingPeriodsPerYear")
    protected double compoundingPeriodsPerYear;

    /**
     * Gets the value of the nominalInterest property.
     * 
     */
    public double getNominalInterest() {
        return nominalInterest;
    }

    /**
     * Sets the value of the nominalInterest property.
     * 
     */
    public void setNominalInterest(double value) {
        this.nominalInterest = value;
    }

    /**
     * Gets the value of the compoundingPeriodsPerYear property.
     * 
     */
    public double getCompoundingPeriodsPerYear() {
        return compoundingPeriodsPerYear;
    }

    /**
     * Sets the value of the compoundingPeriodsPerYear property.
     * 
     */
    public void setCompoundingPeriodsPerYear(double value) {
        this.compoundingPeriodsPerYear = value;
    }

}
