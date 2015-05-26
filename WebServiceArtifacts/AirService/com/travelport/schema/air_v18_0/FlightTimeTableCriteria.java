
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;choice>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}GeneralTimeTable"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}SpecificTimeTable"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generalTimeTable",
    "specificTimeTable"
})
@XmlRootElement(name = "FlightTimeTableCriteria")
public class FlightTimeTableCriteria {

    @XmlElement(name = "GeneralTimeTable")
    protected GeneralTimeTable generalTimeTable;
    @XmlElement(name = "SpecificTimeTable")
    protected SpecificTimeTable specificTimeTable;

    /**
     * Gets the value of the generalTimeTable property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralTimeTable }
     *     
     */
    public GeneralTimeTable getGeneralTimeTable() {
        return generalTimeTable;
    }

    /**
     * Sets the value of the generalTimeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralTimeTable }
     *     
     */
    public void setGeneralTimeTable(GeneralTimeTable value) {
        this.generalTimeTable = value;
    }

    /**
     * Gets the value of the specificTimeTable property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificTimeTable }
     *     
     */
    public SpecificTimeTable getSpecificTimeTable() {
        return specificTimeTable;
    }

    /**
     * Sets the value of the specificTimeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificTimeTable }
     *     
     */
    public void setSpecificTimeTable(SpecificTimeTable value) {
        this.specificTimeTable = value;
    }

}
