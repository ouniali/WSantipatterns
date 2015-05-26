
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for displayorgResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="displayorgResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orgRecord" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}orgRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayorgResponse", propOrder = {
    "orgRecord"
})
public class DisplayorgResponse {

    @XmlElement(required = true)
    protected OrgRecord orgRecord;

    /**
     * Gets the value of the orgRecord property.
     * 
     * @return
     *     possible object is
     *     {@link OrgRecord }
     *     
     */
    public OrgRecord getOrgRecord() {
        return orgRecord;
    }

    /**
     * Sets the value of the orgRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgRecord }
     *     
     */
    public void setOrgRecord(OrgRecord value) {
        this.orgRecord = value;
    }

}
