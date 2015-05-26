
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for esdValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="esdValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="closingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="retrievalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shipperBuildingFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperCarriesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperServiceDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specificInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esdValue", propOrder = {
    "closingDateTime",
    "height",
    "length",
    "retrievalDateTime",
    "shipperBuildingFloor",
    "shipperCarriesCode",
    "shipperServiceDirection",
    "specificInstructions",
    "width"
})
@XmlSeeAlso({
    EsdWithRefClientValue.class
})
public class EsdValue {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closingDateTime;
    protected float height;
    protected float length;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retrievalDateTime;
    protected String shipperBuildingFloor;
    protected String shipperCarriesCode;
    protected String shipperServiceDirection;
    protected String specificInstructions;
    protected float width;

    /**
     * Gets the value of the closingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosingDateTime() {
        return closingDateTime;
    }

    /**
     * Sets the value of the closingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosingDateTime(XMLGregorianCalendar value) {
        this.closingDateTime = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(float value) {
        this.height = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public float getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(float value) {
        this.length = value;
    }

    /**
     * Gets the value of the retrievalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetrievalDateTime() {
        return retrievalDateTime;
    }

    /**
     * Sets the value of the retrievalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetrievalDateTime(XMLGregorianCalendar value) {
        this.retrievalDateTime = value;
    }

    /**
     * Gets the value of the shipperBuildingFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperBuildingFloor() {
        return shipperBuildingFloor;
    }

    /**
     * Sets the value of the shipperBuildingFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperBuildingFloor(String value) {
        this.shipperBuildingFloor = value;
    }

    /**
     * Gets the value of the shipperCarriesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperCarriesCode() {
        return shipperCarriesCode;
    }

    /**
     * Sets the value of the shipperCarriesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperCarriesCode(String value) {
        this.shipperCarriesCode = value;
    }

    /**
     * Gets the value of the shipperServiceDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperServiceDirection() {
        return shipperServiceDirection;
    }

    /**
     * Sets the value of the shipperServiceDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperServiceDirection(String value) {
        this.shipperServiceDirection = value;
    }

    /**
     * Gets the value of the specificInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificInstructions() {
        return specificInstructions;
    }

    /**
     * Sets the value of the specificInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificInstructions(String value) {
        this.specificInstructions = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public float getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(float value) {
        this.width = value;
    }

}
