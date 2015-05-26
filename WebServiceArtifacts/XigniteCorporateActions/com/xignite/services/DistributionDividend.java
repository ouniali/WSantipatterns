
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionDividend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionDividend">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceObj">
 *       &lt;sequence>
 *         &lt;element name="IsDefaultDistribution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Dividend" type="{http://www.xignite.com/services/}Dividend" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionDividend", propOrder = {
    "isDefaultDistribution",
    "dividend"
})
public class DistributionDividend
    extends AbstractPublicWebServiceObj
{

    @XmlElement(name = "IsDefaultDistribution")
    protected boolean isDefaultDistribution;
    @XmlElement(name = "Dividend")
    protected Dividend dividend;

    /**
     * Gets the value of the isDefaultDistribution property.
     * 
     */
    public boolean isIsDefaultDistribution() {
        return isDefaultDistribution;
    }

    /**
     * Sets the value of the isDefaultDistribution property.
     * 
     */
    public void setIsDefaultDistribution(boolean value) {
        this.isDefaultDistribution = value;
    }

    /**
     * Gets the value of the dividend property.
     * 
     * @return
     *     possible object is
     *     {@link Dividend }
     *     
     */
    public Dividend getDividend() {
        return dividend;
    }

    /**
     * Sets the value of the dividend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dividend }
     *     
     */
    public void setDividend(Dividend value) {
        this.dividend = value;
    }

}
