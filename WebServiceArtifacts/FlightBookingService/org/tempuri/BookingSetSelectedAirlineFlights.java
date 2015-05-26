
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OBIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OBClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IBClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "obIndex",
    "obClass",
    "ibIndex",
    "ibClass"
})
@XmlRootElement(name = "Booking_SetSelectedAirlineFlights")
public class BookingSetSelectedAirlineFlights {

    @XmlElement(name = "OBIndex")
    protected Integer obIndex;
    @XmlElementRef(name = "OBClass", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> obClass;
    @XmlElement(name = "IBIndex")
    protected Integer ibIndex;
    @XmlElementRef(name = "IBClass", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ibClass;

    /**
     * Gets the value of the obIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOBIndex() {
        return obIndex;
    }

    /**
     * Sets the value of the obIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOBIndex(Integer value) {
        this.obIndex = value;
    }

    /**
     * Gets the value of the obClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOBClass() {
        return obClass;
    }

    /**
     * Sets the value of the obClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOBClass(JAXBElement<String> value) {
        this.obClass = value;
    }

    /**
     * Gets the value of the ibIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIBIndex() {
        return ibIndex;
    }

    /**
     * Sets the value of the ibIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIBIndex(Integer value) {
        this.ibIndex = value;
    }

    /**
     * Gets the value of the ibClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIBClass() {
        return ibClass;
    }

    /**
     * Sets the value of the ibClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIBClass(JAXBElement<String> value) {
        this.ibClass = value;
    }

}
