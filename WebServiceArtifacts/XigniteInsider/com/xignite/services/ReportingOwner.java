
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportingOwner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reportingOwner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportingOwnerId" type="{http://www.xignite.com/services/}rptOwnerId" minOccurs="0"/>
 *         &lt;element name="reportingOwnerAddress" type="{http://www.xignite.com/services/}rptOwnerAddress" minOccurs="0"/>
 *         &lt;element name="reportingOwnerRelationship" type="{http://www.xignite.com/services/}rptOwnerRelationship" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportingOwner", propOrder = {
    "reportingOwnerId",
    "reportingOwnerAddress",
    "reportingOwnerRelationship"
})
public class ReportingOwner {

    protected RptOwnerId reportingOwnerId;
    protected RptOwnerAddress reportingOwnerAddress;
    protected RptOwnerRelationship reportingOwnerRelationship;

    /**
     * Gets the value of the reportingOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link RptOwnerId }
     *     
     */
    public RptOwnerId getReportingOwnerId() {
        return reportingOwnerId;
    }

    /**
     * Sets the value of the reportingOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RptOwnerId }
     *     
     */
    public void setReportingOwnerId(RptOwnerId value) {
        this.reportingOwnerId = value;
    }

    /**
     * Gets the value of the reportingOwnerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link RptOwnerAddress }
     *     
     */
    public RptOwnerAddress getReportingOwnerAddress() {
        return reportingOwnerAddress;
    }

    /**
     * Sets the value of the reportingOwnerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link RptOwnerAddress }
     *     
     */
    public void setReportingOwnerAddress(RptOwnerAddress value) {
        this.reportingOwnerAddress = value;
    }

    /**
     * Gets the value of the reportingOwnerRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link RptOwnerRelationship }
     *     
     */
    public RptOwnerRelationship getReportingOwnerRelationship() {
        return reportingOwnerRelationship;
    }

    /**
     * Sets the value of the reportingOwnerRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link RptOwnerRelationship }
     *     
     */
    public void setReportingOwnerRelationship(RptOwnerRelationship value) {
        this.reportingOwnerRelationship = value;
    }

}
