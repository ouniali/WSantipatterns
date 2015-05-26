
package uk.co.hha.apps.mis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Tide complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tide">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NextHighOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NextLowOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NextHighHeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NextLowHeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tide", propOrder = {
    "nextHighOn",
    "nextLowOn",
    "nextHighHeight",
    "nextLowHeight"
})
public class Tide {

    @XmlElement(name = "NextHighOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextHighOn;
    @XmlElement(name = "NextLowOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextLowOn;
    @XmlElement(name = "NextHighHeight")
    protected double nextHighHeight;
    @XmlElement(name = "NextLowHeight")
    protected double nextLowHeight;

    /**
     * Gets the value of the nextHighOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextHighOn() {
        return nextHighOn;
    }

    /**
     * Sets the value of the nextHighOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextHighOn(XMLGregorianCalendar value) {
        this.nextHighOn = value;
    }

    /**
     * Gets the value of the nextLowOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextLowOn() {
        return nextLowOn;
    }

    /**
     * Sets the value of the nextLowOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextLowOn(XMLGregorianCalendar value) {
        this.nextLowOn = value;
    }

    /**
     * Gets the value of the nextHighHeight property.
     * 
     */
    public double getNextHighHeight() {
        return nextHighHeight;
    }

    /**
     * Sets the value of the nextHighHeight property.
     * 
     */
    public void setNextHighHeight(double value) {
        this.nextHighHeight = value;
    }

    /**
     * Gets the value of the nextLowHeight property.
     * 
     */
    public double getNextLowHeight() {
        return nextLowHeight;
    }

    /**
     * Sets the value of the nextLowHeight property.
     * 
     */
    public void setNextLowHeight(double value) {
        this.nextLowHeight = value;
    }

}
