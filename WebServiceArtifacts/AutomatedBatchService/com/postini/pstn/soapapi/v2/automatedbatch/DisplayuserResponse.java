
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for displayuserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="displayuserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userRecord" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}userRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayuserResponse", propOrder = {
    "userRecord"
})
public class DisplayuserResponse {

    @XmlElement(required = true)
    protected UserRecord userRecord;

    /**
     * Gets the value of the userRecord property.
     * 
     * @return
     *     possible object is
     *     {@link UserRecord }
     *     
     */
    public UserRecord getUserRecord() {
        return userRecord;
    }

    /**
     * Sets the value of the userRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRecord }
     *     
     */
    public void setUserRecord(UserRecord value) {
        this.userRecord = value;
    }

}
