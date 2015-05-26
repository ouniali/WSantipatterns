
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReportingOwner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReportingOwner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportingOwner" type="{http://www.xignite.com/services/}reportingOwner" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReportingOwner", propOrder = {
    "reportingOwner"
})
public class ArrayOfReportingOwner {

    @XmlElement(nillable = true)
    protected List<ReportingOwner> reportingOwner;

    /**
     * Gets the value of the reportingOwner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportingOwner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportingOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingOwner }
     * 
     * 
     */
    public List<ReportingOwner> getReportingOwner() {
        if (reportingOwner == null) {
            reportingOwner = new ArrayList<ReportingOwner>();
        }
        return this.reportingOwner;
    }

}
