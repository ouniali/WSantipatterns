
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIWsResultArrayOfNorthAmericanAddressWithStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIWsResultArrayOfNorthAmericanAddressWithStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://www.strikeiron.com}ArrayOfNorthAmericanAddressWithStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIWsResultArrayOfNorthAmericanAddressWithStatus", propOrder = {
    "results"
})
public class SIWsResultArrayOfNorthAmericanAddressWithStatus {

    @XmlElement(name = "Results")
    protected ArrayOfNorthAmericanAddressWithStatus results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNorthAmericanAddressWithStatus }
     *     
     */
    public ArrayOfNorthAmericanAddressWithStatus getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNorthAmericanAddressWithStatus }
     *     
     */
    public void setResults(ArrayOfNorthAmericanAddressWithStatus value) {
        this.results = value;
    }

}
