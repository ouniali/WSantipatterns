
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}DictionaryBase">
 *       &lt;sequence>
 *         &lt;element name="IsCity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSubKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSubKey1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSubKey2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "isCity",
    "isSubKey",
    "isSubKey1",
    "isSubKey2"
})
public class Service
    extends DictionaryBase
{

    @XmlElement(name = "IsCity")
    protected Boolean isCity;
    @XmlElement(name = "IsSubKey")
    protected Boolean isSubKey;
    @XmlElement(name = "IsSubKey1")
    protected Boolean isSubKey1;
    @XmlElement(name = "IsSubKey2")
    protected Boolean isSubKey2;

    /**
     * Gets the value of the isCity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCity() {
        return isCity;
    }

    /**
     * Sets the value of the isCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCity(Boolean value) {
        this.isCity = value;
    }

    /**
     * Gets the value of the isSubKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubKey() {
        return isSubKey;
    }

    /**
     * Sets the value of the isSubKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubKey(Boolean value) {
        this.isSubKey = value;
    }

    /**
     * Gets the value of the isSubKey1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubKey1() {
        return isSubKey1;
    }

    /**
     * Sets the value of the isSubKey1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubKey1(Boolean value) {
        this.isSubKey1 = value;
    }

    /**
     * Gets the value of the isSubKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubKey2() {
        return isSubKey2;
    }

    /**
     * Sets the value of the isSubKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubKey2(Boolean value) {
        this.isSubKey2 = value;
    }

}
