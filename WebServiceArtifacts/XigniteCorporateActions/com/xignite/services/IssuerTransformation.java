
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerTransformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuerTransformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceEvent">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldIssuer" type="{http://www.xignite.com/services/}Issuer" minOccurs="0"/>
 *         &lt;element name="NewIssuer" type="{http://www.xignite.com/services/}Issuer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerTransformation", propOrder = {
    "eventType",
    "exDate",
    "oldIssuer",
    "newIssuer"
})
public class IssuerTransformation
    extends AbstractPublicWebServiceEvent
{

    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "ExDate")
    protected String exDate;
    @XmlElement(name = "OldIssuer")
    protected Issuer oldIssuer;
    @XmlElement(name = "NewIssuer")
    protected Issuer newIssuer;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the exDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExDate() {
        return exDate;
    }

    /**
     * Sets the value of the exDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExDate(String value) {
        this.exDate = value;
    }

    /**
     * Gets the value of the oldIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link Issuer }
     *     
     */
    public Issuer getOldIssuer() {
        return oldIssuer;
    }

    /**
     * Sets the value of the oldIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issuer }
     *     
     */
    public void setOldIssuer(Issuer value) {
        this.oldIssuer = value;
    }

    /**
     * Gets the value of the newIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link Issuer }
     *     
     */
    public Issuer getNewIssuer() {
        return newIssuer;
    }

    /**
     * Sets the value of the newIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issuer }
     *     
     */
    public void setNewIssuer(Issuer value) {
        this.newIssuer = value;
    }

}
