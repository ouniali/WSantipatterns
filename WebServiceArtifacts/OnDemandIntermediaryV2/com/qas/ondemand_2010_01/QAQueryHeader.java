
package com.qas.ondemand_2010_01;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_secext_1_0.SecurityHeaderType;


/**
 * <p>Java class for QAQueryHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QAQueryHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QAAuthentication" type="{http://www.qas.com/OnDemand-2010-01}QAAuthentication" minOccurs="0"/>
 *         &lt;element name="Security" type="{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}SecurityHeaderType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QAQueryHeader", propOrder = {
    "qaAuthentication",
    "security"
})
public class QAQueryHeader {

    @XmlElement(name = "QAAuthentication")
    protected QAAuthentication qaAuthentication;
    @XmlElement(name = "Security")
    protected SecurityHeaderType security;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the qaAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link QAAuthentication }
     *     
     */
    public QAAuthentication getQAAuthentication() {
        return qaAuthentication;
    }

    /**
     * Sets the value of the qaAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link QAAuthentication }
     *     
     */
    public void setQAAuthentication(QAAuthentication value) {
        this.qaAuthentication = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityHeaderType }
     *     
     */
    public SecurityHeaderType getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityHeaderType }
     *     
     */
    public void setSecurity(SecurityHeaderType value) {
        this.security = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
