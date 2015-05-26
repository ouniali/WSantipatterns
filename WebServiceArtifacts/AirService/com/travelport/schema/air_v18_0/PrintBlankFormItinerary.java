
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="IncludeDescription" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IncludeHeader" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PrintBlankFormItinerary")
public class PrintBlankFormItinerary {

    @XmlAttribute(name = "IncludeDescription", required = true)
    protected boolean includeDescription;
    @XmlAttribute(name = "IncludeHeader", required = true)
    protected boolean includeHeader;

    /**
     * Gets the value of the includeDescription property.
     * 
     */
    public boolean isIncludeDescription() {
        return includeDescription;
    }

    /**
     * Sets the value of the includeDescription property.
     * 
     */
    public void setIncludeDescription(boolean value) {
        this.includeDescription = value;
    }

    /**
     * Gets the value of the includeHeader property.
     * 
     */
    public boolean isIncludeHeader() {
        return includeHeader;
    }

    /**
     * Sets the value of the includeHeader property.
     * 
     */
    public void setIncludeHeader(boolean value) {
        this.includeHeader = value;
    }

}
