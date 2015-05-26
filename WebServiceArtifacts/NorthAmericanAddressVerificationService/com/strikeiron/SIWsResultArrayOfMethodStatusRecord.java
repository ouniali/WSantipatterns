
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIWsResultArrayOfMethodStatusRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIWsResultArrayOfMethodStatusRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://www.strikeiron.com}ArrayOfMethodStatusRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIWsResultArrayOfMethodStatusRecord", propOrder = {
    "results"
})
public class SIWsResultArrayOfMethodStatusRecord {

    @XmlElement(name = "Results")
    protected ArrayOfMethodStatusRecord results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMethodStatusRecord }
     *     
     */
    public ArrayOfMethodStatusRecord getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMethodStatusRecord }
     *     
     */
    public void setResults(ArrayOfMethodStatusRecord value) {
        this.results = value;
    }

}
