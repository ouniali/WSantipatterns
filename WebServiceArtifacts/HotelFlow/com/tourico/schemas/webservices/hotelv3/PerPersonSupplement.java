
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerPersonSupplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerPersonSupplement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}Supplement">
 *       &lt;sequence>
 *         &lt;element name="SuppAgeGroup" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSupplementAge" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerPersonSupplement", propOrder = {
    "suppAgeGroup"
})
public class PerPersonSupplement
    extends Supplement
{

    @XmlElement(name = "SuppAgeGroup")
    protected ArrayOfSupplementAge suppAgeGroup;

    /**
     * Gets the value of the suppAgeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplementAge }
     *     
     */
    public ArrayOfSupplementAge getSuppAgeGroup() {
        return suppAgeGroup;
    }

    /**
     * Sets the value of the suppAgeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplementAge }
     *     
     */
    public void setSuppAgeGroup(ArrayOfSupplementAge value) {
        this.suppAgeGroup = value;
    }

}
