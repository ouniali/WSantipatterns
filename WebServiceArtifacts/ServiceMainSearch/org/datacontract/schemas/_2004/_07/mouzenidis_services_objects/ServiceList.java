
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}DictionaryBase">
 *       &lt;sequence>
 *         &lt;element name="SvKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="\u0421ityKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="\u0421ountryKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceList", propOrder = {
    "svKey",
    "\u0441ityKey",
    "\u0441ountryKey"
})
public class ServiceList
    extends DictionaryBase
{

    @XmlElement(name = "SvKey")
    protected Integer svKey;
    @XmlElement(name = "\u0421ityKey")
    protected Integer \u0441ityKey;
    @XmlElement(name = "\u0421ountryKey")
    protected Integer \u0441ountryKey;

    /**
     * Gets the value of the svKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSvKey() {
        return svKey;
    }

    /**
     * Sets the value of the svKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSvKey(Integer value) {
        this.svKey = value;
    }

    /**
     * Gets the value of the \u0441ityKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer get\u0421ityKey() {
        return \u0441ityKey;
    }

    /**
     * Sets the value of the \u0441ityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void set\u0421ityKey(Integer value) {
        this.\u0441ityKey = value;
    }

    /**
     * Gets the value of the \u0441ountryKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer get\u0421ountryKey() {
        return \u0441ountryKey;
    }

    /**
     * Sets the value of the \u0441ountryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void set\u0421ountryKey(Integer value) {
        this.\u0441ountryKey = value;
    }

}
