
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Journal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Journal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.diacomp.org/webservices/}IDObject">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NLMID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasConsortium" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Journal", propOrder = {
    "name",
    "abbreviation",
    "nlmid",
    "hasConsortium"
})
public class Journal
    extends IDObject
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Abbreviation")
    protected String abbreviation;
    @XmlElement(name = "NLMID")
    protected String nlmid;
    @XmlElement(name = "HasConsortium")
    protected boolean hasConsortium;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the abbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets the value of the abbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Gets the value of the nlmid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNLMID() {
        return nlmid;
    }

    /**
     * Sets the value of the nlmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNLMID(String value) {
        this.nlmid = value;
    }

    /**
     * Gets the value of the hasConsortium property.
     * 
     */
    public boolean isHasConsortium() {
        return hasConsortium;
    }

    /**
     * Sets the value of the hasConsortium property.
     * 
     */
    public void setHasConsortium(boolean value) {
        this.hasConsortium = value;
    }

}
