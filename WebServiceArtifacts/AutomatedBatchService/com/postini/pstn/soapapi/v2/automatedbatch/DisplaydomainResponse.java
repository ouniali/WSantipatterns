
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for displaydomainResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="displaydomainResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domainRecord" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}domainRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displaydomainResponse", propOrder = {
    "domainRecord"
})
public class DisplaydomainResponse {

    @XmlElement(required = true)
    protected DomainRecord domainRecord;

    /**
     * Gets the value of the domainRecord property.
     * 
     * @return
     *     possible object is
     *     {@link DomainRecord }
     *     
     */
    public DomainRecord getDomainRecord() {
        return domainRecord;
    }

    /**
     * Sets the value of the domainRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainRecord }
     *     
     */
    public void setDomainRecord(DomainRecord value) {
        this.domainRecord = value;
    }

}
