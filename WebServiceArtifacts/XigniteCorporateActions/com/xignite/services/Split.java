
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Split complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Split">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceEvent">
 *       &lt;sequence>
 *         &lt;element name="OldShares" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NewShares" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SplitRatio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomAttributes" type="{http://www.xignite.com/services/}ArrayOfCustomAttribute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Split", propOrder = {
    "oldShares",
    "newShares",
    "splitRatio",
    "exDate",
    "customAttributes"
})
public class Split
    extends AbstractPublicWebServiceEvent
{

    @XmlElement(name = "OldShares")
    protected double oldShares;
    @XmlElement(name = "NewShares")
    protected double newShares;
    @XmlElement(name = "SplitRatio")
    protected double splitRatio;
    @XmlElement(name = "ExDate")
    protected String exDate;
    @XmlElement(name = "CustomAttributes")
    protected ArrayOfCustomAttribute customAttributes;

    /**
     * Gets the value of the oldShares property.
     * 
     */
    public double getOldShares() {
        return oldShares;
    }

    /**
     * Sets the value of the oldShares property.
     * 
     */
    public void setOldShares(double value) {
        this.oldShares = value;
    }

    /**
     * Gets the value of the newShares property.
     * 
     */
    public double getNewShares() {
        return newShares;
    }

    /**
     * Sets the value of the newShares property.
     * 
     */
    public void setNewShares(double value) {
        this.newShares = value;
    }

    /**
     * Gets the value of the splitRatio property.
     * 
     */
    public double getSplitRatio() {
        return splitRatio;
    }

    /**
     * Sets the value of the splitRatio property.
     * 
     */
    public void setSplitRatio(double value) {
        this.splitRatio = value;
    }

    /**
     * Gets the value of the exDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExDate() {
        return exDate;
    }

    /**
     * Sets the value of the exDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExDate(String value) {
        this.exDate = value;
    }

    /**
     * Gets the value of the customAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomAttribute }
     *     
     */
    public ArrayOfCustomAttribute getCustomAttributes() {
        return customAttributes;
    }

    /**
     * Sets the value of the customAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomAttribute }
     *     
     */
    public void setCustomAttributes(ArrayOfCustomAttribute value) {
        this.customAttributes = value;
    }

}
