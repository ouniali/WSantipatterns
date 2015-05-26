
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for displayspoolResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="displayspoolResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spoolRecord" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}spoolRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayspoolResponse", propOrder = {
    "spoolRecord"
})
public class DisplayspoolResponse {

    @XmlElement(required = true)
    protected SpoolRecord spoolRecord;

    /**
     * Gets the value of the spoolRecord property.
     * 
     * @return
     *     possible object is
     *     {@link SpoolRecord }
     *     
     */
    public SpoolRecord getSpoolRecord() {
        return spoolRecord;
    }

    /**
     * Sets the value of the spoolRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpoolRecord }
     *     
     */
    public void setSpoolRecord(SpoolRecord value) {
        this.spoolRecord = value;
    }

}
