
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerAttributeChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuerAttributeChange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceEvent">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeChanges" type="{http://www.xignite.com/services/}ArrayOfAttributeChange" minOccurs="0"/>
 *         &lt;element name="ExDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Issuer" type="{http://www.xignite.com/services/}Issuer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerAttributeChange", propOrder = {
    "eventType",
    "attributeChanges",
    "exDate",
    "issuer"
})
public class IssuerAttributeChange
    extends AbstractPublicWebServiceEvent
{

    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "AttributeChanges")
    protected ArrayOfAttributeChange attributeChanges;
    @XmlElement(name = "ExDate")
    protected String exDate;
    @XmlElement(name = "Issuer")
    protected Issuer issuer;

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
     * Gets the value of the attributeChanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttributeChange }
     *     
     */
    public ArrayOfAttributeChange getAttributeChanges() {
        return attributeChanges;
    }

    /**
     * Sets the value of the attributeChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttributeChange }
     *     
     */
    public void setAttributeChanges(ArrayOfAttributeChange value) {
        this.attributeChanges = value;
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
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link Issuer }
     *     
     */
    public Issuer getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issuer }
     *     
     */
    public void setIssuer(Issuer value) {
        this.issuer = value;
    }

}
