
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CensusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CensusResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CensusValues" type="{http://www.strikeiron.com}ArrayOfCensusInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CensusResult", propOrder = {
    "censusValues"
})
public class CensusResult {

    @XmlElement(name = "CensusValues")
    protected ArrayOfCensusInfo censusValues;

    /**
     * Gets the value of the censusValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCensusInfo }
     *     
     */
    public ArrayOfCensusInfo getCensusValues() {
        return censusValues;
    }

    /**
     * Sets the value of the censusValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCensusInfo }
     *     
     */
    public void setCensusValues(ArrayOfCensusInfo value) {
        this.censusValues = value;
    }

}
