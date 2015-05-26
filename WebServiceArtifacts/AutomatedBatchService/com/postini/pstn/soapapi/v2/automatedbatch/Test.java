
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for test complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="test">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="should_work" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "test", propOrder = {
    "shouldWork"
})
public class Test {

    @XmlElement(name = "should_work")
    protected boolean shouldWork;

    /**
     * Gets the value of the shouldWork property.
     * 
     */
    public boolean isShouldWork() {
        return shouldWork;
    }

    /**
     * Sets the value of the shouldWork property.
     * 
     */
    public void setShouldWork(boolean value) {
        this.shouldWork = value;
    }

}
