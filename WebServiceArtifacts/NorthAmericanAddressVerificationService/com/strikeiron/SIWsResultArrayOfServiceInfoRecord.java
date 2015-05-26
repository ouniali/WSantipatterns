
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIWsResultArrayOfServiceInfoRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIWsResultArrayOfServiceInfoRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://www.strikeiron.com}ArrayOfServiceInfoRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIWsResultArrayOfServiceInfoRecord", propOrder = {
    "results"
})
public class SIWsResultArrayOfServiceInfoRecord {

    @XmlElement(name = "Results")
    protected ArrayOfServiceInfoRecord results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceInfoRecord }
     *     
     */
    public ArrayOfServiceInfoRecord getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceInfoRecord }
     *     
     */
    public void setResults(ArrayOfServiceInfoRecord value) {
        this.results = value;
    }

}
