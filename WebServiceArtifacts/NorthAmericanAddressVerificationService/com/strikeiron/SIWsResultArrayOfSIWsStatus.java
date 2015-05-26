
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIWsResultArrayOfSIWsStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIWsResultArrayOfSIWsStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://www.strikeiron.com}ArrayOfSIWsStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIWsResultArrayOfSIWsStatus", propOrder = {
    "results"
})
@XmlSeeAlso({
    MethodStatusRecord.class
})
public class SIWsResultArrayOfSIWsStatus {

    @XmlElement(name = "Results")
    protected ArrayOfSIWsStatus results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSIWsStatus }
     *     
     */
    public ArrayOfSIWsStatus getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSIWsStatus }
     *     
     */
    public void setResults(ArrayOfSIWsStatus value) {
        this.results = value;
    }

}
