
package uk.co.hha.apps.mis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Time">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ETx" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Position" type="{http://apps.hha.co.uk/mis}AreaLine" minOccurs="0"/>
 *         &lt;element name="ChangedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Time", propOrder = {
    "id",
    "eTx",
    "position",
    "changedOn",
    "source"
})
public class Time {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "ETx", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eTx;
    @XmlElement(name = "Position")
    protected AreaLine position;
    @XmlElement(name = "ChangedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedOn;
    @XmlElement(name = "Source")
    protected String source;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the eTx property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETx() {
        return eTx;
    }

    /**
     * Sets the value of the eTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETx(XMLGregorianCalendar value) {
        this.eTx = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLine }
     *     
     */
    public AreaLine getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLine }
     *     
     */
    public void setPosition(AreaLine value) {
        this.position = value;
    }

    /**
     * Gets the value of the changedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedOn() {
        return changedOn;
    }

    /**
     * Sets the value of the changedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedOn(XMLGregorianCalendar value) {
        this.changedOn = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
