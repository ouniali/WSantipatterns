
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Accommodation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accommodation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}DictionaryBase">
 *       &lt;sequence>
 *         &lt;element name="Age1From" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Age1To" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Age2From" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Age2To" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="PlaceAdult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PlaceChild" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accommodation", propOrder = {
    "age1From",
    "age1To",
    "age2From",
    "age2To",
    "placeAdult",
    "placeChild"
})
public class Accommodation
    extends DictionaryBase
{

    @XmlElement(name = "Age1From")
    protected Short age1From;
    @XmlElement(name = "Age1To")
    protected Short age1To;
    @XmlElement(name = "Age2From")
    protected Short age2From;
    @XmlElement(name = "Age2To")
    protected Short age2To;
    @XmlElement(name = "PlaceAdult")
    protected Integer placeAdult;
    @XmlElement(name = "PlaceChild")
    protected Integer placeChild;

    /**
     * Gets the value of the age1From property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAge1From() {
        return age1From;
    }

    /**
     * Sets the value of the age1From property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAge1From(Short value) {
        this.age1From = value;
    }

    /**
     * Gets the value of the age1To property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAge1To() {
        return age1To;
    }

    /**
     * Sets the value of the age1To property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAge1To(Short value) {
        this.age1To = value;
    }

    /**
     * Gets the value of the age2From property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAge2From() {
        return age2From;
    }

    /**
     * Sets the value of the age2From property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAge2From(Short value) {
        this.age2From = value;
    }

    /**
     * Gets the value of the age2To property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAge2To() {
        return age2To;
    }

    /**
     * Sets the value of the age2To property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAge2To(Short value) {
        this.age2To = value;
    }

    /**
     * Gets the value of the placeAdult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlaceAdult() {
        return placeAdult;
    }

    /**
     * Sets the value of the placeAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlaceAdult(Integer value) {
        this.placeAdult = value;
    }

    /**
     * Gets the value of the placeChild property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlaceChild() {
        return placeChild;
    }

    /**
     * Sets the value of the placeChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlaceChild(Integer value) {
        this.placeChild = value;
    }

}
