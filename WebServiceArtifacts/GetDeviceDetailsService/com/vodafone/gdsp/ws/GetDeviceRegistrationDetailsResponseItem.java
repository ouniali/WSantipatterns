
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getDeviceRegistrationDetailsResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDeviceRegistrationDetailsResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registrationDetailsUpdatedTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="registrationStatusInformation" type="{http://ws.gdsp.vodafone.com/}registrationStatusInformation" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDeviceRegistrationDetailsResponseItem", propOrder = {
    "registrationDetailsUpdatedTimestamp",
    "registrationStatusInformation",
    "returnCode"
})
public class GetDeviceRegistrationDetailsResponseItem {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDetailsUpdatedTimestamp;
    protected RegistrationStatusInformation registrationStatusInformation;
    @XmlElement(required = true)
    protected ReturnCode returnCode;

    /**
     * Gets the value of the registrationDetailsUpdatedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDetailsUpdatedTimestamp() {
        return registrationDetailsUpdatedTimestamp;
    }

    /**
     * Sets the value of the registrationDetailsUpdatedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDetailsUpdatedTimestamp(XMLGregorianCalendar value) {
        this.registrationDetailsUpdatedTimestamp = value;
    }

    /**
     * Gets the value of the registrationStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationStatusInformation }
     *     
     */
    public RegistrationStatusInformation getRegistrationStatusInformation() {
        return registrationStatusInformation;
    }

    /**
     * Sets the value of the registrationStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationStatusInformation }
     *     
     */
    public void setRegistrationStatusInformation(RegistrationStatusInformation value) {
        this.registrationStatusInformation = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCode }
     *     
     */
    public ReturnCode getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCode }
     *     
     */
    public void setReturnCode(ReturnCode value) {
        this.returnCode = value;
    }

}
